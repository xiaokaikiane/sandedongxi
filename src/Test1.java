import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Class<?> cla= ArrayList.class;
        System.out.println(cla.getSuperclass().getName());//获得父类名称
        System.out.println("+++++++++++++++++");
        Class<?>[] classes=cla.getInterfaces();//取得实现父类接口对象
        for (Class<?> s:classes){
            System.out.println(s.getName());
        }
    }
}
