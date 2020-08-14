import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        Class<?> cla= ArrayList.class;
        Method[] methods=cla.getMethods();
        for(Method a:methods){
            System.out.println(a);
        }
    }
}
