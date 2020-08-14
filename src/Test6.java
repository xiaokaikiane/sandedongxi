
import java.lang.reflect.Field;
import java.lang.reflect.Method;
class Person2 {
    private String name ;
    private int age ;
    public Person2() {}
    public Person2(String name,int age) {
        this.name = name ;
        this.age = age ;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Test6 {
    public static void main(String[] args) throws
            Exception {
        Class<?> cls = Class.forName("Person2");

        // 任何时候调⽤用类中的普通⽅方法都必须有实例例化对象
        Object obj = cls.newInstance() ;
        // 取得setName这个⽅方法的实例例化对象,设置⽅方法名称与参数类型
        Method setMethod = cls.getMethod("setName", String.class) ;
        // 随后需要通过Method类对象调⽤用指定的⽅方法，调⽤用⽅方法需要有实例例化对象
        // 同时传⼊入参数
        setMethod.invoke(obj, "yuisama") ;// 相当于Person对 象.setName("yuisama") ;
        Method getMethod = cls.getMethod("getName") ;
        Object result  = getMethod.invoke(obj) ;  // 相当于Person对 象.getName() ;
        System.out.println(result) ;

//            Field[] field = cls.getFields();//第一种
//            for (Field a : field) {
//                System.out.println(a);
//            }
//        System.out.println("--------------------------");
//
//        Field[] fields=cls.getDeclaredFields();
//        for(Field a:fields){
//            System.out.println(a);
//        }
    }
}
