package com.demo.demoSSH.constant;

/**
 * All service beans constants
 * 
 * @version 0.1, 08/02/2012
 */
public abstract class ErrorPageActionNameConstants {
    
    public static final String NO_ACCESS = "/error/handleError?errorCode.errorCodeId=E0005";
    
    public static final String IAP_ERROR = "/error/handleError?errorCode.errorCodeId=E0003";
    
    public static final String SERVER_ERROR = "/error/handleError?errorCode.errorCodeId=E0001";
    
    public static final String SERVER_VALIDATION_ERROR = "/error/handleError?errorCode.errorCodeId=E0002";

}