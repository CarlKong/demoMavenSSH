package com.demo.demoSSH.constant;

/**
 * configure constants includes: 1/ property file names 2/ language constants
 */
public abstract class ConfigureConstants {

    /** property file names */
    public static final String INDEX_PROPERTIES_PATH = "hibernate_search.properties";

    public static final String INDEX_BASE_KEY = "hibernate.search.default.indexBase";

    public static final String INDEX_BATCH_SIZE = "batch_size";

    public static final String EXCEPTION_XML_FILE = "exception/Exception.xml";

    public static final String OT_CONF_FILE = "ot.properties";
    
    public static final String OT_EXPORT_FILE = "exportAssessment.properties";

    /** language constants */
    public static final String LOCALE_ZH = "zh_CN";

    public static final String LOCALE_EN = "en_US";

    public static final String LANGUAGE_ZH = "zh";

    public static final String LANGUAGE_EN = "en";

    public static final String LANGUAGE_BOTH = "en,zh";

    public static final String LANGUAGE = "language";

    public static final Integer LANGUAGE_ZH_INT = 0;

    public static final Integer LANGUAGE_EN_INT = 1;

    public static final Integer LANGUAGE_BOTH_INT = 2;

    public static final String WW_TRANS_I18N_LOCALE = "WW_TRANS_I18N_LOCALE";

    public static final String LOCALE = "locale";

    // The constant about application data
//    public static final String APPLICATION_DATA = "applicationDataMap";

    // The constant about default site
    public static final String EMPLOYEE_DEFAULT_CUSTOM_SITE = "SH";
    
    //the constant about export view all assessment
    public static final String OOO_FILE_FOLDER = "oooExeFolder";
    
    public static final String EXPORT_ASSESSMENT_FOLDER = "exportAssessmentFolder";
    
    public static final String TEMPLATE_FILE_PATH = "templateFilePath";
    
    public static final String COURSE_TEMPLATE_COUNT = "courseTemplateCount";
    
    public static final String Trainee_TEMPLATE_COUNT = "traineeTemplateCount";
    
    public static final String ASSESS_TO_PLAN = "Ass._to_Plan";
    
    public static final String ASSESS_TO_COURSE = "Ass._to_Course(s)";
    
    public static final String ASSESS_TO_TRAINER = "Ass._to_Trainer(s)";
    
    public static final String ASSESS_TO_TRAINEE_FOR_COURSE = "Ass._to_Trainee(s)_for_Course";
    
    public static final String ASSESS_TO_TRAINEE_FOR_TRAINEE = "Ass._to_Trainee(s)_for_Trainee";
    
    public static final String DEFAULT_VALUE = "x";
    
    public static final String DEFAULT_NAME = "Name";
    
    public static final String DEFAULT_COURSE_ID = "course_id";
    
    public static final String DEFAULT_JOB_NUMBER = "job number";
    
    public static final String DEFAULT_TRAINEE_JOB_NUMBER = "job_number";
    
    public static final int DEFAULT_TRAINEE_TEMPLATE_COUNT = 7;
    
    public static final int DEFAULT_COURSE_TEMPLATE_COUNT = 9;
    
    public static final int DEFAULT_TRAINER_TEMPLATE_COUNT = 13;
    
    public static final String NO_NEED_ASSESSMENT = "No need assessments";
    
    public static final String NO_COMMENTS_PROVIDED = "No comments provided";
    
    public static final String NO_ASSESSMENT_PROVIDED = "No assessment provided";
    
    public static final String RATE_DEFAULT_VALUE = "y/x";
    
    public static final String RATE_DEFAULT_SPLIT_VALUE = "/";
    
    
}
