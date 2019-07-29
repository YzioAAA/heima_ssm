package cn.itcast.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ysk
 * @create 2019-07-26-16:26
 */
public class DateUtils {

    public static String date2String(Date date,String pattern){
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        String format = df.format(date);
        return format;
    }

    public static Date string2Date(String str,String pattern) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        Date parse = df.parse(str);
        return parse;
    }
}
