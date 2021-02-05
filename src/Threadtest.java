import java.util.Date;

public class Threadtest {
    public static void main(String[] args) {
        Date date=new Date();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println(date.getTime());
                }
            }
        });
        thread.start();
        try {
            thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
