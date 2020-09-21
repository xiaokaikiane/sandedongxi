public class Demo2 {
    public static void main(String[] args) {
        String st1=new String("abc");
        String st2="abc";
        String st3="abc";
        System.out.println(st1==st2);//false
        System.out.println(st1.equals(st2));//true
        System.out.println(st2==st3);//true
        System.out.println(st2.equals(st3));//true
        System.out.println(st1.intern()==st2);//true;
        System.out.println(st1==st2.intern());//false
    }
}
