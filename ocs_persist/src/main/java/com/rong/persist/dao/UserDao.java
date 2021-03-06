package com.rong.persist.dao;

import java.util.List;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.rong.common.util.StringUtils;
import com.rong.persist.base.BaseDao;
import com.rong.persist.model.Account;
import com.rong.persist.model.User;

/**
 * 用户dao
 * @author Wenqiang-Rong
 * @date 2018年1月31日
 */
public class UserDao extends BaseDao<User> {

	public static final User dao = User.dao;

	public static final String FILEDS = "id,create_time,update_time,state,user_name,user_pwd,login_ip,login_time,login_auth,expir_date,mobile,ip_addr";

	public Page<Record> page(int pageNumber, int pageSize, Kv param) {
		String select = "select u.ip_addr city,u.mobile,u.expir_date,u.agent_id,u.login_ip,u.login_time,login_auth,u.id,u.user_name,u.state,u.create_time,u.update_time,a.account,a.consumed_sum,a.last_consumed_time";
		String sqlExceptSelect = "from " + User.TABLE + " u ," + Account.TABLE +" a";
		StringBuffer where = new StringBuffer(" where u.user_name = a.user_name");
		if(param!=null){
			// 状态 1-可用，0已冻结
			Boolean state = param.getBoolean("state");
			if (state != null) {
				where.append(" and u.state = " + state);
			}
			// 用户名
			String userName = param.getStr("userName");
			if (!StringUtils.isNullOrEmpty(userName)) {
				where.append(" and u.user_name = '" + userName + "'");
			}
			// 代理id
			Long agentId = param.getLong("agentId");
			if (agentId != null && agentId != 0) {
				where.append(" and u.agent_id = " + agentId + "");
			}
			// 小于N天过期
			Long dayExpir = param.getLong("dayExpir");
			if (dayExpir != null && dayExpir != 0) {
				where.append(" and to_days(u.expir_date) - to_days(now()) <= " + dayExpir);
			}
		}
		String orderBy = " order by u.id desc";
		if(param!=null && param.getBoolean("orderByLoginTime")!=null){
			orderBy = " order by u.login_time desc";
		}
		sqlExceptSelect = sqlExceptSelect + where + orderBy;
		return Db.paginate(pageNumber, pageSize, select, sqlExceptSelect);
	}
	
	public User findByUserName(String userName){
		String sql = "select " + FILEDS + " from " + User.TABLE + " where user_name = ?";
		return dao.findFirst(sql, userName);
	}
	
	public boolean updateField(long id, String fieldName, Object value){
		return Db.update(String.format("UPDATE %s SET %s = ? WHERE id = ?", User.TABLE, fieldName), value, id)>0;
	}
	
	public User findByUserNameAndPwd(String userName,String pwd){
		String sql = "select " + FILEDS + " from " + User.TABLE + " where user_name = ? and user_pwd = ?";
		return dao.findFirst(sql, userName,pwd);
	}
	
	public int countLoginToday(){
		String sql = "select count(*) countLoginUser from " + User.TABLE + " where to_days(login_time) = to_days(now())";
		Record record = Db.findFirst(sql);
		if(record==null){
			return 0;
		}
		return record.getInt("countLoginUser");
	}
	
	public boolean batchDelete(Object... idValues){
		for (Object object : idValues) {
			dao.deleteById(object);
		}
		return true;
	}
	
	public List<User> findByUserNameList(List<String> userNameList){
		StringBuffer param = new StringBuffer("");
		int i = 0;
		for (String str : userNameList) {
			if(i!=0){
				param.append(",");
			}
			i++;
			param.append("'").append(str).append("'");
		}
		String sql = "select "+FILEDS+" from " + User.TABLE+" where user_name in ("+param+")";
		return dao.find(sql);
	}
}
