package com.westlife;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 15:29 2017/12/21
 */
public class TestTime3 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(new Integer(100));
        new Thread( new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep( 5 );
                    System.out.println( "延时5秒，完成了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();  ;
    }

}
