package com.demo.demoSSH.constant;

import java.io.PrintWriter;
import java.io.StringWriter;

import com.demo.demoSSH.util.ReaderXmlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogConstants {
    private static Logger logger = LoggerFactory.getLogger(LogConstants.class);

    // Replace constant.
    private static final String USER_NAME = "_user_name";
    private static final String METHOD_NAME = "_method_name";
    private static final String REPLACE_OBJECT = "_object";
    private static final String REPLACE_DO = "_do";
    private static final String REPLACE_PLAN_ID = "_plan_id";
    private static final String REPLACE_ASSESSMENT_ITEM_TYPE_ID = "_assessment_item_type_id";
    private static final String REPLACE_ASSESSMENT_ID = "_assessment_id";
    private static final String REPLACE_COURSE_ID = "_course_id";
    private static final String REPLACE_ACTUAL_COURSE_ID = "_actual_course_id";
    private static final String REPLACE_AUTHOR = "_author_name";
    private static final String REPLACE_IP_ADDRESS = "_ip_address";

    // The message of debug level log
    private static String DEBUG_INPUT = "Input: [_do] value [_object]";
    private static String DEBUG_OUTPUT = "Output [_do] value [_object]";
    private static String WARN_INPUT_LOG = "The error log input: [_do] value [_object]";

    // The message of error level log
    private static final String OBJECT_IS_NULL_OR_EMPTY = "[_object] is null, empty or error";

    // The message of error level log
    private static String INFO_MESSAGE = "[_user_name] enters successfully";
    private static String AUTHORITY_MESSAGE = "[_user_name] at [_ip_address] don't have the authority access to [_method_name]";
    private static String WARN_MESSAGE_VALIDATION = "[_user_name] at [_ip_address] send invalidate data [_do] with value [_object]";
    private static String PLAN_ROLE_ERROR_MESSAGE = "[_user_name] for plan/acourse [_plan_id] is not trainer or trainee";
    private static String EXCEPTION_MESSAGE = "_do appeard exception: ";

    /**
     * get log debug input message for one parameter
     * 
     * @param objectName
     * @param object
     * @return
     */
    public static String getDebugInput(String doWhat, Object object) {
        if (null == object) {
            object = "null";
        }
        return DEBUG_INPUT.replace(REPLACE_DO, doWhat).replace(REPLACE_OBJECT, object.toString());
    }

    /**
     * get log debug input message for many parameter
     * 
     * @param methodName
     * @param parameterNames
     * @param parameterValues
     * @return
     */
    public static String getDebugInput(String[] parameterNames, Object[] parameterValues) {
        StringBuilder builder = new StringBuilder();
        String parameterName = "null";
        String parameterValue = "null";

        if (null != parameterNames) {
            for (String name : parameterNames) {
                builder.append(name);
                builder.append(", ");
            }
            parameterName = builder.toString().substring(0, builder.length() - 2);
        }
        if (null != parameterValues) {
            builder = new StringBuilder();
            for (Object value : parameterValues) {
                if (null == value) {
                    builder.append("");
                } else {
                    builder.append(value.toString());
                }
                builder.append(", ");
            }
            parameterValue = builder.toString().substring(0, builder.length() - 2);
        }

        if (null == parameterNames || null == parameterValues || parameterNames.length != parameterValues.length) {
            logger.warn(WARN_INPUT_LOG.replace(REPLACE_DO, parameterName).replace(REPLACE_OBJECT, parameterValue));
        }

        return DEBUG_INPUT.replace(REPLACE_DO, parameterName).replace(REPLACE_OBJECT, parameterValue);
    }

    public static String getDebugOutput(String doWhat, Object object) {
        if (null == object) {
            object = "null";
        }
        return DEBUG_OUTPUT.replace(REPLACE_DO, doWhat).replace(REPLACE_OBJECT, object.toString());
    }

    public static String objectIsNULLOrEmpty(String name) {
        return OBJECT_IS_NULL_OR_EMPTY.replace(REPLACE_OBJECT, name);
    }

    public static String getLogActualCourseByErrorCode(String errorCode, Object value) {
        if (null == value) {
            value = "null";
        }
        return getLogByErrorCode(errorCode, REPLACE_ACTUAL_COURSE_ID, value);
    }

    public static String getLogPlanByErrorCode(String errorCode, Object value) {
        return getLogByErrorCode(errorCode, REPLACE_PLAN_ID, value);
    }

    public static String getLogAssessmentItemTypeByErrorCode(String errorCode, Object value) {
        return getLogByErrorCode(errorCode, REPLACE_ASSESSMENT_ITEM_TYPE_ID, value);
    }

    public static String getLogAssessmentByErrorCode(String errorCode, Object value) {
        return getLogByErrorCode(errorCode, REPLACE_ASSESSMENT_ID, value);
    }

    /**
     * get log info message
     * 
     * @param userName
     * @param methodName
     * @return
     */
    public static String getInfo(String userName) {
        if (null == userName) {
            userName = "null";
        }
        String message = INFO_MESSAGE.replaceAll(USER_NAME, userName);
        return message;
    }

    public static String getValidateAuthorityMessage(String userName, String remoteAddress, String methodName) {
        return AUTHORITY_MESSAGE.replaceAll(USER_NAME, userName).replaceAll(REPLACE_IP_ADDRESS, remoteAddress).replaceAll(METHOD_NAME, methodName);
    }

    public static String getValidatePlanRoleMessage(String userName, Integer planId) {
        if (null == userName) {
            userName = "null";
        }
        return PLAN_ROLE_ERROR_MESSAGE.replaceAll(USER_NAME, userName).replaceAll(REPLACE_PLAN_ID, planId.toString());
    }

    /**
     * get validation warn massage.
     * 
     * @param userName
     * @return
     */
    public static String getValidationMsg(String userName, String remoteAddress, String parameterName, Object parameterValue) {
        if (parameterValue == null) {
            parameterValue = "null";
        }
        return WARN_MESSAGE_VALIDATION.replaceAll(USER_NAME, userName).replaceAll(REPLACE_IP_ADDRESS, remoteAddress)
                .replaceAll(REPLACE_DO, parameterName).replaceAll(REPLACE_OBJECT, parameterValue.toString());
    }

    public static String getLogByErrorCode(String errorCode, String replaceField, Object value) {
        String message = ReaderXmlUtils.getErrorCodes().get(errorCode).getLogMessage();
        if (replaceField != null && value != null) {
            return message.replace(replaceField, value.toString());
        } else {
            return message;
        }
    }

    public static String exceptionMessage(String dowhat) {
        return EXCEPTION_MESSAGE.replace(REPLACE_DO, dowhat);
    }

    public static String getLogCourseByErrorCode(String errorCode, Object value) {
        return getLogByErrorCode(errorCode, REPLACE_COURSE_ID, value);
    }

    public static String getLogAuthorByErrorCode(String errorCode, Object value) {
        return getLogByErrorCode(errorCode, REPLACE_AUTHOR, value);
    }

    public static String pureMessage(String message) {
        return message;
    }

    public static String message(String message, Object parameter) {
        return message + " [" + (parameter == null ? null : parameter.toString()) + "] ";
    }

    /**
     * 
     * @Title: getExceptionStackTrace
     * @Description: print staclTrace to log file
     * 
     * @param e
     * @return
     */
    public static String getExceptionStackTrace(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        return sw.toString();
    }
}
