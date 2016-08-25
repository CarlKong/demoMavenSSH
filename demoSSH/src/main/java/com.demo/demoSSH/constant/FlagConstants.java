package com.demo.demoSSH.constant;

/**
 * 
 * flag constants include: 1/ DB flags 2/ operation flags or parameters 3/
 * button flags 4/ Error back message and validation results
 * 
 */
public abstract class FlagConstants {
    /** DB flags */
    public static final int UN_DELETED = 0;
    public static final int IS_DELETED = 1;
    /***********
     * Used in plan employee map, a trainee is deleted from a plan, but some
     * courses started
     *************/
    public static final int NOT_DELETED_ALL = 2;

    public static final int HAS_ATTACHMENT = 1;
    public static final int NO_ATTACHMENT = 0;

    public static final int VISIBLE = 1;
    public static final int UN_VISIBLE = 0;

    public static final int IS_COMPLETED = 1;
    public static final int UN_COMPLETED = 0;

    public static final int IS_PUBLISHED = 1;
    public static final int UN_PUBLISHED = 0;

    public static final int IS_CANCELED = 1;
    public static final int UN_CANCELED = 0;

    public static final int NO_HOMEWORK = 0;
    public static final int HAS_HOMEWORK = 1;

    public static final int IS_VIDEO_FINISH_EDIT = 1;
    public static final int UN_VIDEO_FINISH_EDIT = 0;
    
    public static final int IS_VIDEO_TO_EDIT_IGNORE = 1;
    public static final int UN_VIDEO_TO_EDIT_IGNORE = 0;
    
    public static final int IS_CERTIFICATED = 1;
    public static final int UN_CERTIFICATED = 0;

    public static final int UN_IGNORE = 0;
    public static final int IS_IGNORE = 1;

    public static final Integer NEED_ASSESSMENT = 1;
    public static final Integer UN_NEED_ASSESSMENT = 0;
    
    public static final Integer CAN_VIEW_ALL_ASSESSMENTS = 1;
    public static final Integer CANNOT_VIEW_ALL_ASSESSMENTS = 0;

    public static final String COURSE_NUMBER_PREFIX = "C";
    public static final String PLAN_NUMBER_PREFIX = "PL";
    public static final String PLAN_COURSE_NUMBER_PREFIX = "PC";
    public static final String PLAN_SESSION_NUMBER_PREFIX = "PS";

    public static final int TRAINEE_TO_PLAN = 1;
    public static final int TRAINEE_TO_COURSE = 2;
    public static final int TRAINEE_TO_TRAINER = 3;
    public static final int TRAINING_MASTER_TO_TRAINERS = 4;
    public static final int TRAINER_TO_PLAN = 5;
    public static final int TRAINER_TO_TRAINEES = 6;
    public static final int TRAINER_TO_COURSE = 7;
    
    public static final int ALL_TRAINEES = 0;
    public static final int IS_ALL_EMPLOYEES = 1;
    public static final int UN_ALL_EMPLOYEES = 0;

    public static final int ATTEND_TYPE_OPTIONAL = 0;
    public static final int ATTEND_TYPE_INVITED = 1;
    public static final int ATTEND_TYPE_SPECIFIC = 2;
    public static final int ATTEND_TYPE_JOIN = 3;
    public static final int ATTEND_TYPE_TRAINER = 4;
    public static final int ATTEND_TYPE_ALL = 5;

    public static final String INVITED_PLAN = "Invited";
    public static final String PUBLIC_PLAN = "Public";
    public static final int INVITED_PLAN_ID = 1;
    public static final int PUBLIC_PLAN_ID = 2;

    public static final String EMPLOYEE_NAME = "augUserName";
    public static final String EMPLOYEE_FIELDS_EMPLOYEE_ID = "employeeId";

    public static final Double ASSESSMENT_ATTENDANCE_ATTEND = 1.0;
    public static final Double ASSESSMENT_ATTENDANCE_LATE = 2.0;
    public static final Double ASSESSMENT_ATTENDANCE_LEAVE_EARLY = 3.0;
    public static final Double ASSESSMENT_ATTENDANCE_ABSENCE = 4.0;

    public static final Integer ASSESSMENT_UNASSESSED = 0;
    public static final Integer ASSESSMENT_HAS_BEEN_ASSESSED = 1;
    public static final Integer ASSESSMENT_HAS_BEEN_UPDATE = 1;
    public static final Integer ASSESSMENT_NO_HOMEWORK_FLAG = -1;
    public static final Integer ITEM_UNSELECTED_SCORE = -1;

    public static String TYPE_FLAG = "typeFlag";
    public static String ASSESS_IS_DELETED = "assessIsDeleted";

    /** assessment item id */
    // Trainee to plan
    public static final Integer ASSESSMENT_ITEM_TYPE_TRAINING_ARRAGEMENT = 1;
    public static final Integer ASSESSMENT_ITEM_TYPE_TRAINING_COURSE = 2;
    // Trainee to planCourse
    public static final Integer ASSESSMENT_ITEM_TYPE_TRAINING_MATERIAL = 3;
    public static final Integer ASSESSMENT_ITEM_TYPE_DIFFICULT_APPROPRIATE_TO_ME = 4;
    public static final Integer ASSESSMENT_ITEM_TYPE_VALUABLE_TO_ME = 5;
    // Trainee to trainer
    public static final Integer ASSESSMENT_ITEM_TYPE_PREPARATION = 6;
    public static final Integer ASSESSMENT_ITEM_TYPE_EXPRESSION = 7;
    public static final Integer ASSESSMENT_ITEM_TYPE_INTERACTION = 8;
    public static final Integer ASSESSMENT_ITEM_TYPE_TIME_MAGAGEMENT = 9;
    // Trainer to plan
    public static final Integer ASSESSMENT_ITEM_TYPE_PLAN_OBJECTIVES = 14;
    public static final Integer ASSESSMENT_ITEM_TYPE_PLAN_TRAINING_ARRAGEMENT = 15;
    public static final Integer ASSESSMENT_ITEM_TYPE_PLAN_TRAINING_COURSE = 16;

    public static final Integer ASSESSMENT_ITEM_TYPE_ATTENDENCE_LOGS = 17;
    public static final Integer ASSESSMENT_ITEM_TYPE_BEHAVIOR = 18;
    public static final Integer ASSESSMENT_ITEM_TYPE_HOMEWORK = 19;

    /** operation flags or parameters */
    public static final String CREATE_OPERATION = "create";
    public static final String SEARCH_OPERATION = "search";
    public static final String EDIT_OPERATION = "edit";
    public static final String VIEW_OPERATION = "view";
    public static final String DELETE_OPERATION = "delete";
    public static final String PUBLISH_OPERATION = "publish";
    public static final String CANCEL_OPERATION = "cancel";
    public static final String VIEW_MY_OPERATION = "viewMy";
    public static final String SAVE_AS_OPERATION = "saveAs";
    public static final String TO_EDIT_PAGE = "toEditPage";
    public static final String SESSION_SUCCESS = "sessionSuccess";
    public static final String SEARCH_PLAN = "searchPlan";
    public static final String SEARCH_MY_PLAN = "searchMyPlan";
    public static final String PLAN_EXIST = "isExist";
    public static final String GO_TO_VIEW_PLAN_DETAIL = "goToViewPlanDetail";

    public static final String SPLIT_COMMA = ",";
    public static final String SPLIT_DOT = ".";
    public static final String SPLIT_SEMICOLON = ";";
    public static final String SPLIT_SPACE = " ";

    public static final Integer ID_BLANK = 0;
    public static final double ASSESSMENT_DEFAULT_ZERO = 0;
    
    public static final Integer VIDEO_EDIT_FINISHED = 1;

    public static final int JOIN = 1;
    public static final int QUIT = 0;

    public static final int IS_TRAINER_OF_COURSE = 1;
    public static final int UN_TRAINER_OF_COURSE = 0;

    public static final int CAN_JOIN = 1;
    public static final int CAN_NOT_JOIN = 0;

    public static final int NO_COURSE = 0;
    public static final int HAVE_COURSE = 1;

    public static final Integer IS_OPTIONAL = 1;
    public static final Integer UN_OPTIONAL = 0;

    public static final Boolean IS_SAVETO_PLAN_COURSE_EMPLOYEE_MAP = true;
    public static final Boolean UN_SAVETO_PLAN_COURSE_EMPLOYEE_MAP = false;

    public static final Integer ACTUAL_COURSE_SEARCH_STATUS_DIVIDED = 0;
    public static final Integer ACTUAL_COURSE_SEARCH_STATUS_NOT_DIVIDED = 1;

    public static final int COURSE_ID_NUMBER = 5;
    public static final int PLAN_ID_NUMBER = 5;
    public static final int ACTUAL_COURSE_ID_NUMBER = 5;

    public static final int OPERATE_SUCCESS = 1;
    public static final int OPERATE_HAS_DONE = 0;
    public static final int OPERATE_FAILURE = 2;

    public static final String STATUS_RED = "red";
    public static final String STATUS_GREEN = "green";
    public static final String STATUS_YELLOW = "yellow";
    public static final String STATUS_GRAY = "gray";

    public static final String COURSE_STATUS_GREEN = "course_green";
    public static final String COURSE_STATUS_YELLOW = "course_yellow";
    public static final String COURSE_STATUS_GRAY = "course_gray";

    public static final int TRAINEE_LEAVED = 2;
    public static final int TRAINEE_NOT_LEAVED = 1;
    public static final int COURSE_ONGONING = 0;
    public static final int COURSE_ENDED = 3;

    public static final int ASSESSMENT_NO_DATA_VALUE = 1;
    public static final int ASSESSMENT_HAVE_DATA_VALUE = 0;

    /** email part flags */
    public static final int SEND_EMAIL = 1;
    public static final int SEND_TO_MANAGER = 1;
    public static final int DONT_SEND_TO_MANAGER = 0;
    public static final int SEND_ALL_TRAINEE = 1;
    public static final int SEND_MODIFY_TRAINEE = 1;
    public static final int NO_REMIND_EMAIL = 0;
    public static final int REGISTER_NOTICE_EMAIL = 1;
    public static final int PLAN_COURSE = 1;
    public static final int PLAN_SESSION = 0;

    /** The assessment expired */
//    public static final String OT_PROPERTIES_PATH = "/ot.properties";
    public static final String EXPIRED_SWITCH_KEY_TRUE = "true";
    public static final String EXPIRED_SWITCH_KEY_FALSE = "false";

    /** button flags */
    public static final int PUBLISH_BTN = 1;
    public static final int CANCEL_BTN = 2;

    public static final int TRAINEE_APPLY_LEAVE_PLAN_BTN = 3;
    public static final int TRAINEE_APPLY_BACK_PLAN_BTN = 4;
    public static final int TRAINEE_APPLY_LEAVE_COURSE_BTN = 5;
    public static final int TRAINEE_APPLY_BACK_COURSE_BTN = 6;

    public static final int TRAINEE_ASSESS_PLAN_BTN = 7;
    public static final int TRAINEE_EDIT_PLAN_ASSESSMENT_BTN = 8;
    public static final int TRAINEE_VIEW_PLAN_ASSESSMENT_BTN = 9;

    public static final int TRAINER_ASSESS_PLAN_BTN = 10;
    public static final int TRAINER_EDIT_PLAN_ASSESSMENT_BTN = 11;
    public static final int TRAINER_VIEW_PLAN_ASSESSMENT_BTN = 12;

    public static final int MASTER_ASSESS_TRAINER_BTN = 13;
    public static final int MASTER_EDIT_TRAINER_ASSESSMENT_BTN = 14;
    public static final int MASTER_VIEW_TRAINER_ASSESSMENT_BTN = 15;

    public static final int TRAINEE_ASSESS_COURSE_BTN = 16;
    public static final int TRAINEE_EDIT_COURSE_ASSESSMENT_BTN = 17;
    public static final int TRAINEE_VIEW_COURSE_ASSESSMENT_BTN = 18;

    public static final int TRAINER_ASSESS_TRAINEE_BTN = 19;
    public static final int TRAINER_EDIT_TRAINEE_ASSESSMENT_BTN = 20;
    public static final int TRAINER_VIEW_TRAINEE_ASSESSMENT_BTN = 21;

    public static final int VIEW_ALL_ASSESSMENT_BTN = 22;

    public static final int TRAINEE_APPLY_JOIN_COURSE_BTN = 23;
    public static final int TRAINEE_APPLY_QUIT_COURSE_BTN = 24;
    
    public static final int MASTER_DELEGATION_BTN = 25;
    public static final int MASTER_CANCEL_DELEGATION_BTN = 26;
    public static final int MASTER_CHANGE_DELEGATION_BTN = 27;
    

    public static final int VIEW_ONLINE_COURSE_BIT = 28;

    /** Error back message and validation results */
    public static final String ERROR_JSON = "error_json";
    public static final String ERROR_PAGE = "error_page";
    public static final String SERVER_ERROR = "serverError";
    public static final String SERVER_VALIDATION_ERROR = "serverValidationError";
    public static final String IAP_ERROR = "iapError";
    public static final String ERROR = "error";
    public static final String NO_ACCESS = "noAccess";
    public static final String ELEARNING_ERROR = "elearningError";
    public static final String ERROR_DATA_WARNING = "errorDataWarning";
    
    
//    public static final String VALIDATION_ERROR = "validation_error";
//    public static final String VALIDATION_ERROR_JSON = "error_json";
//    public static final String ERROR_SERVER = "error_server";
//    public static final String ERROR_SERVER_JSON = "error_json";
//    public static final String ERROR_404 = "error_404";
//    public static final String ERROR_500 = "error_500";
//    public static final String DATA_WARNING = "data_warning";
//    public static final String DATA_WARNING_JSON = "error_json";
//    
//    public static final String ERROR_IAP = "error_iap";
//    public static final String AJAX_SERVER_ERROR = "ajax_server_error";
//    public static final String AJAX_NO_ACCESS = "ajax_no_access";

    public static final Integer PLAN_IS_NULL = 0;
    public static final Integer PLAN_VALIDATEION_RESULT_TRUE = 1;
    public static final Integer PLAN_VALIDATEION_RESULT_FALSE = 2;

    public static final String EDIT_PLAN_ACTION = "plan[toEditPlan]";

    public static final int REMOVE_ONE_ROLE = 0;
    public static final int REMOVE_ALL_ROLE = 1;

//    public static final String AUTHORITY_VALUE = "privilegeValue";
    public static final String ERROR_CODE_MAP = "errorCodeMap";

    public static final Integer TRAINER_ROLE_ID = 1;
    public static final String NAME_COLUMN = "name";
    public static final String JOB_NUMBER_COLUMN = "job_number";
    // previse
    public static final String COPY_OF = "Copy of ";
    public static final Integer LAST_RECORD = 1;
    public static final Integer FIRST_RECORD = -1;
    public static final Integer MIDDLE_RECORD = 0;
    public static final Integer PREVIOUS_RECORD = -1;
    public static final Integer NEXT_RECORD = 1;

    // view all assessment
    public static final int ASSESS_TO_COUSE_TURN_ON = 1;
    public static final String ASSESS_STATUS_ASSESS_TURNED_OFF = "assessTurnedOff";
    public static final String ASSESS_STATUS_COUSE_NOT_ENDED = "courseNotEnded";
    public static final String ASSESS_STATUS_ASSESS_ENDED = "assessEnded";
    public static final String ASSESS_STATUS_IN_ASSESSING = "inAssessing";
    public static final int HAS_BEEN_ASSESS_YES = 1;
    public static final int HAS_BEEN_ASSESS_NO = 0;
    // Assess to plan or course
    public static final int ASSESS_TO_COURSE = 0;
    public static final int ASSESS_TO_PLAN = 1;

    // search flag
    public static final String HOME = "home";
    public static final String COURSE = "course";
    public static final String MYCOURSE = "mycourse";
    public static final String PLAN = "plan";
    public static final String MYPLAN = "myplan";

    // string to html
    public static final String LEFT_SQUARE_BRACKET = "\\[";
    public static final String RIGHT_SQUARE_BRACKET = "\\]";
    public static final String LEFT_SQUARE_BRACKET_HTML = "&#91;";
    public static final String RIGHT_SQUARE_BRACKET_HTML = "&#93;";

    // view course detail status
    public static final String STATUS_NOT_PUBLISH = "notPublish";
    public static final String STATUS_NOT_START = "notStart";
    public static final String STATUS_ON_GOING = "onGoing";
    public static final String STATUS_IN_ASSESSING = "inAssessing";
    public static final String STATUS_ENDED = "ended";

    public static final String TRAINEE_STATUS_NORMAL = "normal";
    public static final String TRAINEE_STATUS_LEAVE = "leave";
    
    //validate length
    public static final int SEARCH_MAX_LENGTH = 100;
    
    //tag
    public static final String ACTUAL_COURSE = "ActuralCourse";
    public static final int TAG_INIT_COUNT = 1;
    public static final int MAX_TAG_NUM_IN_PAGE = 5;

    public static final String UNSPCIFIED_TRAINER = "Unspcified Trainer";
    
    public static final String DELEGATE_MASTER = "delegateMaster";
    
    public static final String BLANK_CHARACTER = " ";
    
    public static final int PLAN_CAN_VIEW_ASSESSMENT = 1;
    
    //Actual course has homework
    public static final Integer ACTUAL_COURSE_HAS_HOMEWORK_VALUE = 1;
    public static final Integer ACTUAL_COURSE_HAS_NO_HOMEWORK_VALUE = 0;
    public static final String ACTUAL_COURSE_HAS_HOMEWORK = "selected";
    public static final String ACTUAL_COURSE_HAS_NO_HOMEWORK = "unselected";
    
    public static final String[] ACTURALCOURSE_DEFAULT_SEARCH_FIELDS = {"prefix_id", "course_id", "course_name", "course_brief_without_tag",
        "course_target_trainee", "course_tag", "course_author_name", "course_history_trainers"};
    public static final String[] PLAN_DEFAULT_SEARCH_FIELDS = {"prefix_id", "plan_id", "plan_name", "plan_tag", "plan_trainers"};
    public static final String[] ACTUAL_COURSE_DEFAULT_SEARCH_FIELDS = {"prefix_id", "id", "name", "brief_without_tag", "target_trainee"};
    public static final Integer PLAN_EMPLOYEE_IS_DELETE = 1;
    
    
    public static final String DELEGATE_PLAN_TO_MASTER_FLAG = "delegate";
    public static final String DELEGATE_COURSE_TO_FLAG = "delegate";
    public static final String CHANGE_DELEGATION_FLAG = "changeDelegate";
    
    public static final Integer ONLINE_COURSE_EDIT_FINISHED = 1;
    public static final Integer ONLINE_COURSE_PUBLISHED = 1;
    
    public static final String ONLINE_OPERATION_PUBLISH = "publish_online_course";
    public static final String ONLINE_OPERATION_FINISH = "finish_online_course";
    
    public static final int HAS_DELEGATION_MASTER = 1;
    public static final int NO_DELEGATION_MASTER = 0;
    
    public static final Integer IS_IN_EDIT = 1;
    public static final Integer UN_IN_EDIT = 0;
    public static final Integer IS_OLD = 1;
    public static final Integer UN_OLD = 0;
    public static final Integer ONLINE_COURSE_CHANGED = 1;
    public static final Integer ONLINE_COURSE_UN_CHANGED = 0;
    
    public static final Integer HAS_ONLINE_COURSE = 1;
    public static final Integer NO_ONLINE_COURSE = 0;
    public static final Integer HAS_PUBLISHED_ONLINE_COURSE = 1;
    public static final Integer NO_PUBLISHED_ONLINE_COURSE = 0;
    
    //comment type flag
    public static final int COMMENT_TO_COURSE = 1;
    public static final int COMMENT_TO_ACTUAL_COURSE = 2;
    public static final int COMMENT_TO_COURSE_ONLINE_COURSE = 3;
    public static final int COMMENT_TO_ACTUAL_COURSE_ONLINE_COURSE = 4;
    
    //view Assessment action part
    public static final String HAS_NO_DELEGATION_MASTER = "NoDelegationMaster";
    
    public static final String FROM_PLAN_CORUSE = "planCourse";
    
    
}
