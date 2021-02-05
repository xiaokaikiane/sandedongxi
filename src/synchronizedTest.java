
public class synchronizedTest {
    public synchronized void test(){}
    public void test1(){
        synchronized (synchronizedTest.class){
        }
    }

    public static void main(String[] args) {

    }
}
