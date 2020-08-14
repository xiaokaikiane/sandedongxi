import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class preson{
    private int age;
    private String name;
    public preson(String name,int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "preson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Test4{
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException, SecurityException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Class<?> cla=preson.class;
//        System.out.println(cla.newInstance());
//        Class类通过反射实例例化类对象的时候，只能够调用类中的无参构造。如果现在类中没有无参构造则无
//    法使用Class类调用，只能够通过明确的构造调用实例例化处理理。

        //通过Constructor类实例例化对象
        Constructor<?> constructor=cla.getConstructor(String.class,int.class);
        System.out.println(constructor.newInstance("小明",23));

    }

}
