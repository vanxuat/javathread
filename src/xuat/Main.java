package xuat;

import xuat.threadtwo.threadslepp;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //cach 1
        System.out.println("Bat dau");
//
//        Thread t = new Thread(()->{
//            for(int i =0;i< 10;i++){
//                System.out.println("thread 1");
//            }
//        });
//        t.start();
//
//
//        Thread dc = new Thread(new Runnable() {
//            @Override
//            public void run() {
//              for(int i=0;i<20;i++){
//                  System.out.println("thread 2");
//              }
//            }
//        });
//        dc.start();
//
//        new Thread(()->{
//            for (int i=0;i<10;i++){
//                System.out.println("thread 3");
//            }
//        }).start();

        threadOne to = new threadOne();
        to.start();


        threadslepp tl = new threadslepp();
        tl.start();


        System.out.println("Tran van Xuat");
    }
}
