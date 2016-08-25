package com.demo.demoSSH.interceptor;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.demo.demoSSH.action.BaseAction;
import com.demo.demoSSH.constant.ErrorCodeConstants;
import com.demo.demoSSH.constant.FlagConstants;
import com.demo.demoSSH.exception.DataWarningException;
import com.demo.demoSSH.exception.ServerErrorException;
import com.demo.demoSSH.util.ErrorCode;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.ExceptionMappingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionInterceptor extends ExceptionMappingInterceptor {

    private static final long serialVersionUID = -3837674457299306885L;
    private static final Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

    private BaseAction baseAction;
    
    
    private boolean isAjaxRequest(HttpServletRequest request) {
        String header = request.getHeader("X-Requested-With");
        if (header != null && "XMLHttpRequest".equals(header))
            return true;
        else
            return false;
    }
    
    
    private String handleExceptionByServerErrorException(Exception e, boolean isAjax) {
        String errorCode = e.getMessage();
        if (null == errorCode || "".equals(errorCode)) {
            errorCode = ErrorCodeConstants.SERVER_ERROR;
        }
        ServletContext context = ServletActionContext.getServletContext();
        @SuppressWarnings("unchecked")
        Map<String, ErrorCode> errorCodeMap = (Map<String, ErrorCode>) context.getAttribute(FlagConstants.ERROR_CODE_MAP);
        ErrorCode errorCodeEntity = errorCodeMap.get(errorCode);
        logger.error(errorCodeEntity.getErrorMessage());
        
        if (isAjax) {
            // Make the JSON object.
            //TODO 这里可能会报错将来运行的时候可以更具实际确定是否更换jsonobject的引用来源
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(errorCodeEntity);
            baseAction.setJsonObject(jsonObject);
            return FlagConstants.ERROR_JSON;
        } else {
            baseAction.setErrorCode(errorCodeEntity);
            return FlagConstants.ERROR_PAGE;
        }
    }
    
    private String handleDataWarningException(Exception e, boolean isAjax) {
        
        String errorCode = e.getMessage();
        ServletContext context = ServletActionContext.getServletContext();
        @SuppressWarnings("unchecked")
        Map<String, ErrorCode> errorCodeMap = (Map<String, ErrorCode>) context.getAttribute(FlagConstants.ERROR_CODE_MAP);
        ErrorCode errorCodeEntity = errorCodeMap.get(errorCode);
        errorCodeEntity.setErrorMessage(baseAction.getText(errorCodeEntity.getErrorMessageKey()));
        
        if (isAjax == true) {
            //TODO 这里可能会报错将来运行的时候可以更具实际确定是否更换jsonobject的引用来源
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(errorCodeEntity);
            baseAction.setJsonObject(jsonObject);
            return FlagConstants.ERROR_JSON;
        } else {
            baseAction.setErrorCode(errorCodeEntity);
            return FlagConstants.ERROR_PAGE;
        }
    }
    
    private String handleException(boolean isAjax) {
        String errorCode = ErrorCodeConstants.SERVER_ERROR;
        ServletContext context = ServletActionContext.getServletContext();
        @SuppressWarnings("unchecked")
        Map<String, ErrorCode> errorCodeMap = (Map<String, ErrorCode>) context.getAttribute(FlagConstants.ERROR_CODE_MAP);
        ErrorCode errorCodeEntity = errorCodeMap.get(errorCode);
        
        
        if (isAjax) {
            // Make the JSON object.
            //TODO 这里可能会报错将来运行的时候可以更具实际确定是否更换jsonobject的引用来源
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(errorCodeEntity);
            baseAction.setJsonObject(jsonObject);
            return FlagConstants.ERROR_JSON;
        } else {
            baseAction.setErrorCode(errorCodeEntity);
            return FlagConstants.ERROR_PAGE;
        }
    }
    
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        try {
            return invocation.invoke();
        } catch (Exception e) {
            
            baseAction = (BaseAction) invocation.getAction();
            HttpServletRequest request = ServletActionContext.getRequest();
            boolean isAjax = isAjaxRequest(request);
            if(e instanceof UndeclaredThrowableException) {
                e = (Exception) ((UndeclaredThrowableException) e).getUndeclaredThrowable();
            }
            if (e instanceof ServerErrorException) {
                return handleExceptionByServerErrorException(e, isAjax);
            } else if (e instanceof DataWarningException) {
                return handleDataWarningException(e, isAjax);
            } else {
                logger.error(e.getMessage(), e);
                return handleException(isAjax);
            }
        }

    }
}
