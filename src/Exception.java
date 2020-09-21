public class Exception {
    public static void test(int i){
        int result=0;
        try {
            result=4/i;
        } catch (java.lang.Exception e) {
            result+=2;
            System.out.println(result);
        } finally {
            result+=10;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
//        test(0);//2  12
        test(2);//12
    }
}
