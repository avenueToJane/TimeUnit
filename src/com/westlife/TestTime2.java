package com.westlife;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 15:25 2017/12/21
 */
public class TestTime2 {
    public static void main(String[] args) {

        new Thread( new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep( 5 * 1000 );
                    System.out.println( "5秒延时完成了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();  ;
    }
}
