package com.ERP.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String formatDate(Date date, String format){
        String result = "";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        if(date!=null){
            result = simpleDateFormat.format(date);
        }
        return result;
    }
}
