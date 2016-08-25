package com.demo.demoSSH.action;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.demo.demoSSH.util.ErrorCode;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * Base action
 * 
 * @version V1.0, 2012-8-27
 */
public abstract class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware {
    private static final long serialVersionUID = 1430814461569166462L;

    protected Map<String, Object> session;
    protected JSONObject jsonObject;
    protected JSONArray jsonArray;
    protected HttpServletRequest request;
    protected ErrorCode errorCode;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    protected String getIpAddress() {
        return request.getRemoteAddr();
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
