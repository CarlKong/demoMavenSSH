package com.demo.demoSSH.constant;

public class ErrorCodeConstants {
    // Common Part
    public static final String SERVER_ERROR = "E0001";

    public static final String SERVER_VALIDATION_ERROR = "E0002";

    public static final String IAP_ERROR = "E0003";
    
    public static final String ERROR = "E0004";
    
    public static final String NO_ACCESS = "E0005";
    
    public static final String IAP_SESSION_TIME_OUT = "E0006";
    
    public static final String ELEARNING_ERROR = "E0007";
    
    public static final String ELEARNING_SOURCE_GONE = "E0008";
    
    // Course Part
    public static final String VIEW_COURSE_DELETED = "W1001";

    public static final String DELETE_COURSE_DELETED = "W1003";

    public static final String DELETE_COURSE_DELETED_NOT_AUTHOR = "W1004";

    public static final String VIEW_COURSE_DELETED_NOT_ATTACHMENT = "W1005";

    public static final String NOT_EXISTED_COURSE_TYPE = "W1006";
    
    public static final String COMMENT_NOT_EXISTED_COURSE = "W1007";
    
    public static final String EDIT_ONLINE_COURSE_NOT_EDITABLE = "W1008";
    
    public static final String PUBLISH_ONLINE_COURSE_NOT_EXIST = "W1009";
    
    public static final String VIEW_UN_PUBLISHED_COURSE = "W1010";
    
    public static final String ONLINE_COURSE_IS_FINISHED_EDIT = "W1011";
    
    public static final String ONLINE_COURSE_IS_NOT_EXIST = "W1012";
    
    // Plan Part
    public static final String LEAVE_LEAVED_COURSE = "W2010";

    public static final String BACK_BACKED_COURSE = "W2011";

    public static final String DELETE_ON_GOING_PLAN = "W2031";

    public static final String VIEW_DETAIL_OF_CANCELED_PLAN = "W2050";

    public static final String DELETE_CANCELED_PLAN = "W2054";

    public static final String APPLY_LEAVE_TO_INVITED_CANCELED_PLAN = "W2055";

    public static final String JOIN_PUBLIC_CANCELED_PLAN = "W2056";

    public static final String QUIT_PUBLIC_CANCELED_PLAN = "W2057";

    public static final String ASSESS_CANCELED_PLAN = "W2058";
    
    public static final String ASSESS_TRAINERS_OF_HIMSELF = "W2063";
    
    public static final String ASSESS_TRAINERS_OF_NO_TRAINER = "W2064";
    
    public static final String ASSESS_TRAINEES_OF_HIMSELF = "W2065";

    public static final String EDIT_COMPLETED_PLAN = "W2080";

    public static final String PUBLISH_COMPLETED_PLAN = "W2081";

    public static final String CANCEL_COMPLETED_PLAN = "W2082";

    public static final String APPLY_COMPLETED_PLAN = "W2083";

    public static final String JOIN_COMPLETED_PLAN = "W2084";

    public static final String QUIT_COMPLETED_PLAN = "W2085";

    public static final String JOIN_JOINED_PLAN = "W2086";

    public static final String QUIT_QUITED_PLAN = "W2087";

    public static final String JOIN_JOINED_COURSE = "W2088";

    public static final String QUIT_QUITED_COURSE = "W2089";

    public static final String VEIW_DETAIL_DELETED_PLAN = "W2100";

    public static final String DELETE_DELETED_PLAN = "W2104";

    public static final String APPLY_DELETED_PLAN = "W2105";

    public static final String JOIN_DELETED_PLAN = "W2106";

    public static final String QUIT_DELETED_PLAN = "W2107";

    public static final String ASSESS_TRAINERS_DELETED_PLAN = "W2109";

    public static final String ASSESS_TRAINEES_DELETED_PLAN = "W2110";

    public static final String VIEW_ALL_DELETED_PLAN = "W2112";

    public static final String PUBLISH_NO_COURSE_ADDED_PLAN = "W2130";

    public static final String PUBLISH_NO_INVITED_TRAINEES_ADDED_PLAN = "W2131";

    public static final String PUBLISH_NO_SPECIFIC_TRAINEES_ADDED_PLAN = "W2132";

    public static final String PUBLISH_INVITED_ADDED_PLAN = "W2140";

    public static final String PUBLISH_PUBLIC_ADDED_PLAN = "W2150";

    public static final String PUBLISH_COURSE_STARTED_PLAN = "W2170";

    public static final String EDIT_OR_DELETE_COMPLETED_PLAN = "W2180";

    public static final String CREATE_STARTED_PLAN = "W2190";

    public static final String EDIT_STARTED_PLAN = "W2191";

    public static final String SELECT_COURSES_DELETED_PLAN = "W2200";

    public static final String CREATE_WITH_USER_NOT_EXISTED_PLAN = "W2210";

    public static final String EDIT_WITH_USER_NOT_EXISTED_PLAN = "W2211";

    public static final String ASSESSMENT_ITEM_NOT_EXISTED = "W2212";
    
    public static final String ASSESSMENT_NOT_EXISTED = "W2213";
    
    public static final String USER_NOT_IN_PLAN = "W2214";
    
    public static final String ASSESS_UN_NEED_ASSESS_PLAN = "W3052";
    
    public static final String ASSESS_PLAN_USER_NOT_ATTEND = "W2215";
    
    public static final String DELEGATE_NOT_SELF_PLAN = "W2217";
    
    public static final String DELEGATE_PLAN_TO_UN_MASTER = "W2218";

    public static final String DELEGATE_PLAN_TO_UN_EXIST_EMPLOYEE = "W2219";

    public static final String OPERATE_PUBLISHED_PLAN = "W2230";
    
    public static final String OPERATE_ENDED_PLAN = "W2231";
    
    public static final String OPERATE_EXPIRED_PLAN = "W2232";
    
    public static final String OPERATE_UN_PUBLISHED_PLAN = "W2233";
    
    public static final String OPERATE_UN_EXPIRED_PLAN = "W2234";
    
    public static final String ASSIGN_TRAINER_TO_UN_TRAINER = "W2235";

    // Plan Course part
    public static final String JOIN_PLAN_COURSE_STARTED = "W4001";

    public static final String QUIT_PLAN_COURSE_STARTED = "W4002";

    public static final String GET_DELETED_ACTUAL_COURSE = "W4003";

    public static final String TRAINER_JOIN_OWNED_COURSE = "W4004";

    public static final String TRAINER_JOIN_ALL_OWNED_COURSES = "W4005";

    public static final String VIEW_PLAN_COURSE_DETAIL_EMPLOYEE_NOT_IN_PLAN = "W4006";

    public static final String GET_DELETED_ACTUAL_COURSE_BY_PLAN_ID = "W4007";

    public static final String GET_NULL_EMPLOYEE = "W4008";

    public static final String GET_NULL_EMPLOYEE_BY_FLAG = "W4009";
    
    public static final String COMMENT_DELETED_ACTUAL_COURSE = "W4010";
    
    public static final String OPERATE_UN_ENDED_COURSE = "W4011";
    
    public static final String OPERATE_EXPIRED_COURSE = "W4012";
    
    public static final String OPERATE_STARTED_COURSE = "W4013";
    
    public static final String ASSIGN_TRAINER_TO_DELETED_COURSE = "W4014";

    // search Part
    public static final String SEARCH_CONDITION_ERROR = "W5001";

    public static final String SEARCH_FIRST_RECORD_DELETED_ERROR = "W5002";

    public static final String SEARCH_LAST_RECORD_DELETED_ERROR = "W5003";
    
    //elearning
    public static final String EDIT_ONLINE_COURSE_ERROR = "W6001";
    
    public static final String EDIT_CONVERTING_ONLINE_COURSE = "W6002";
    
   //delegate course
    public static final String DELEGATE_COURSE_TO_CREATOR = "W2221";
    
    public static final String DELEGATE_NOT_SELF_COURSE = "W2223";
    
    public static final String DELEGATE_COURSE_TO_UN_EXIST_EMPLOYEE = "W2224";
    
    public static final String DELEGATE_COURSE_TO_UN_MASTER = "W2225";
    
}
