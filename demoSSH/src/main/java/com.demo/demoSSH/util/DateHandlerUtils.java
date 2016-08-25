package com.demo.demoSSH.util;

import com.demo.demoSSH.constant.DateFormatConstants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public abstract class DateHandlerUtils {

    /**
     * Count the days between the two date
     * 
     * @param d1
     *            small time
     * @param d2
     *            big time
     * @return
     */
    public static Integer getDaysBetweenDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            return 0;
        }
//        Calendar calendar1 = getCalendarObject(d1);
//        Calendar calendar2 = getCalendarObject(d2);
//        Integer days = getDaysBetweenDate(calendar1, calendar2);
        int days = 0;
        if (d1.getTime() < d2.getTime()) {
            days = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
        } else {
            days = (int) ((d1.getTime() - d2.getTime()) / (1000 * 60 * 60 * 24));
        }
        return days;
    }

    public static Long getMillSecondsDiff2Date(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            return 0L;
        }
        Long millseconds = d1.getTime() - d2.getTime();
        return millseconds;
    }

    public static int getHoursBetweenDate(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            return 0;
        }
        Long millseconds = d1.getTime() - d2.getTime();
        int hours = (int) (millseconds / 3600 / 1000);
        return hours;
    }

    public static String makeDifferenceBetween2Date(Date d1, Date d2) {
        String differenceString = "";
        Integer days = getDaysBetweenDate(d1, d2);
        if (days >= 30) {
            differenceString = "1 Month ago";
        } else if (days < 30 && days >= 14) {
            differenceString = "2 Weeks ago";
        } else if (days < 14 && days >= 7) {
            differenceString = "1 Week ago";
        } else if (days < 7 && days >= 6) {
            differenceString = "6 Days ago";
        } else if (days < 6 && days >= 5) {
            differenceString = "5 Days ago";
        } else if (days < 5 && days >= 4) {
            differenceString = "4 Day ago";
        } else if (days < 4 && days >= 3) {
            differenceString = "3 Days ago";
        } else if (days < 3 && days >= 2) {
            differenceString = "2 Days ago";
        } else if (days < 2 && days >= 1) {
            differenceString = "1 Days ago";
        } else {
            differenceString = "Today";
        }

        return differenceString;
    }

//    private static Calendar getCalendarObject(Date date) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.clear();
//        calendar.setTime(date);
//        return calendar;
//    }

    /**
     * Change a String option such as: 1990/02/1 to Date option. Notice: the
     * string must exactly match the format. Otherwise throw exception return
     * null.
     * 
     * @param date
     *            : String change to Date. such as: 1990/02/1
     * @return Date option
     */
    public static Date formatDate(String date) {
        Date formatdate = null;
        try {
            formatdate = (new SimpleDateFormat(DateFormatConstants.DEFAULT_FORMAT_DATE)).parse(date);
        } catch (ParseException e) {
            return null;
        }
        return formatdate;
    }

    /**
     * Change a String option such as: 1990/02/1 to Date option. Custom the
     * format by user. Notice: the string must exactly match the format.
     * Otherwise throw exception return null.
     * 
     * @param dateFormate
     * @param date
     * @return Date option
     */
    public static Date formatDate(String date, String dateFormat) {
        Date formatdate = null;
        if (date == null) {
            return null;
        }
        try {
            formatdate = (new SimpleDateFormat(dateFormat)).parse(date);
        } catch (ParseException e) {
            return null;
        }
        return formatdate;
    }

    /**
     * Change Date option to String. Notice: the string must exactly match the
     * format. Otherwise throw exception return null.
     * 
     * @param date
     * @return String option
     */
    public static String dateToString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DateFormatConstants.DEFAULT_FORMAT_DATE);
        String dateString = formatter.format(date);
        return dateString;
    }

    /**
     * Change a Date option such as: 1990/02/1 to String option. Custom the
     * format by user. Notice: the string must exactly match the format.
     * Otherwise throw exception return null.
     * 
     * @param dateFormate
     * @param date
     * @return String option
     */
    public static String dateToString(String dateFormate, Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormate);
        String dateString = formatter.format(date);
        return dateString;
    }

    /**
     * Get the max time.
     * 
     * @return The max time.
     * @throws ServerErrorException
     */
    public static Date getMaxTime() {
        return formatDate("9999/12/30 23:59:59");
    }



    /**
     * Return whether the need assessment time is expired with nowTime which is
     * initialized in system.
     * 
     * @param timeFormat
     *            The time format.
     * @param time
     *            The time content.
     * @return Whether expired.
     * @throws ServerErrorException
     */
    // public static boolean isAssessmentExpired(String timeFormat, String time)
    // throws ServerErrorException {
    // boolean isExpired = false;
    // Date nowTime = new Date();
    // isExpired = isAssessmentExpired(timeFormat, time, nowTime);
    // return isExpired;
    // }

    public static boolean isEqual(Date date1, Date date2) {
        if (date1 == date2) {
            return true;
        } else if (date1 == null && date2 != null) {
            return false;
        } else if ((date1.getTime() - date2.getTime()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Date getDateBefore(Date date, int days) {
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - days);
        return now.getTime();
    }

    public static Date getDateAfter(Date date, int days) {
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        now.set(Calendar.DATE, now.get(Calendar.DATE) + days);
        return now.getTime();
    }

    public static String getEmailPatternDate(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("MMM. dd", Locale.ENGLISH);
        String time = sdf.format(date);
        return time;
    }
}
