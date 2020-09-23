import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
//        String st1=new String("abc");
//        String st2="abc";
//        String st3="abc";
//        System.out.println(st1==st2);//false
//        System.out.println(st1.equals(st2));//true
//        System.out.println(st2==st3);//true
//        System.out.println(st2.equals(st3));//true
//        System.out.println(st1.intern()==st2);//true;
//        System.out.println(st1==st2.intern());//false
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        Set set=new HashSet();
        set.add(s1);
        set.add(s2);
        Iterator it=set.iterator();
        while(it.hasNext()){//false true  abc
            System.out.println(it.next());
        }
    }
}
