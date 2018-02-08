package com.rong.persist.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseInterfaceCall<M extends BaseInterfaceCall<M>> extends Model<M> implements IBean {

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

	public void setProjectId(java.lang.Long projectId) {
		set("project_id", projectId);
	}

	public java.lang.Long getProjectId() {
		return getLong("project_id");
	}

	public void setProjectName(java.lang.String projectName) {
		set("project_name", projectName);
	}

	public java.lang.String getProjectName() {
		return getStr("project_name");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}

	public java.lang.String getUserName() {
		return getStr("user_name");
	}

	public void setCallSuccess(java.lang.Boolean callSuccess) {
		set("call_success", callSuccess);
	}

	public java.lang.Boolean getCallSuccess() {
		return get("call_success");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return getStr("remark");
	}
	
	public void setCallbackSuccess(java.lang.Boolean callbackSuccess) {
		set("callback_success", callbackSuccess);
	}

	public java.lang.Boolean getCallbackSuccess() {
		return get("callback_success");
	}

}
