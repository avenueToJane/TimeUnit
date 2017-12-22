package com.westlife;

import java.util.concurrent.TimeUnit;

/**
 * @Author: westlife
 * @Description: TimeUnit时间转换
 * @Date: Created in 15:17 2017/12/22
 */
public class TestTimeUnit {
    public static void main(String[] args) {
        //1天有24个小时    1代表1天：将1天转化为小时
        System.out.println( TimeUnit.DAYS.toHours( 1 ) );

        //结果： 24


        //1小时有3600秒
        System.out.println( TimeUnit.HOURS.toSeconds( 1 ));

        //结果3600


        //把3天转化成小时
        System.out.println( TimeUnit.HOURS.convert( 3 , TimeUnit.DAYS ) );
        //结果是：72

    }
}
