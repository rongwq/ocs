package com.rong.persist.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSystemRoleResource<M extends BaseSystemRoleResource<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setRoleId(java.lang.Long roleId) {
		set("role_id", roleId);
	}

	public java.lang.Long getRoleId() {
		return getLong("role_id");
	}

	public void setResourceId(java.lang.Long resourceId) {
		set("resource_id", resourceId);
	}

	public java.lang.Long getResourceId() {
		return getLong("resource_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
