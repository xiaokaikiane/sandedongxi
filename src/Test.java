import java.util.Scanner;

public class Test {//getclass()
    public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException {
        Class<?> cla=Class.forName("java.util.Date");
        System.out.println(cla.getName());
        Scanner scanner=new Scanner(System.in);
        System.out.println(scanner.getClass());
        System.out.println(Scanner.class);
        Object object=cla.newInstance();//实例化等价于 new Scanner(System.in);
        System.out.println(object);
    }
}
