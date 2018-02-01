package com.rong.persist.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserToken<M extends BaseUserToken<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}

	public java.lang.String getUserName() {
		return getStr("user_name");
	}

	public void setToken(java.lang.String token) {
		set("token", token);
	}

	public java.lang.String getToken() {
		return getStr("token");
	}

	public void setIsExpir(java.lang.Boolean isExpir) {
		set("is_expir", isExpir);
	}

	public java.lang.Boolean getIsExpir() {
		return get("is_expir");
	}

	public void setExpirTime(java.util.Date expirTime) {
		set("expir_time", expirTime);
	}

	public java.util.Date getExpirTime() {
		return get("expir_time");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
