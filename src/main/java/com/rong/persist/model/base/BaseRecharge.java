package com.rong.persist.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRecharge<M extends BaseRecharge<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}

	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setMoney(java.math.BigDecimal money) {
		set("money", money);
	}

	public java.math.BigDecimal getMoney() {
		return get("money");
	}

	public void setRechargeCode(java.lang.String rechargeCode) {
		set("recharge_code", rechargeCode);
	}

	public java.lang.String getRechargeCode() {
		return getStr("recharge_code");
	}

	public void setOrderCode(java.lang.String orderCode) {
		set("order_code", orderCode);
	}

	public java.lang.String getOrderCode() {
		return getStr("order_code");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setUseState(java.lang.Integer useState) {
		set("use_state", useState);
	}

	public java.lang.Integer getUseState() {
		return getInt("use_state");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}

	public java.lang.String getUserName() {
		return getStr("user_name");
	}

}
