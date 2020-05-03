package xuat.JoinThread;

public class joinThreadmain {
    public static void main(String[] args) {
        System.out.println("begin start main");


        Thread t1 = new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println("A");

            }
        });

        t1.start();

        Thread t2 = new Thread(()->{
           for (int i=0;i<10;i++){
               System.out.println("B");
           }
        });


        t2.start();

        try {
            System.out.println("Bat dau noi luong t1 vao luong chinh");
            t1.join(); // noi luong 1 vao luong chinh va doi cho luong t1 ket thuc thi moi chay tiep luong chinh
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("End main");
    }
}
