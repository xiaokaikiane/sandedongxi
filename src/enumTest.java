/**
 * 1.枚举类的理解:类的对象只有有限个,确定的,我们称为枚举类
 * 2.当需要定义一组常量时,强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象,则可以作为单例模式的实现方式
 *
 * 如何定义枚举类
 *  enum关键字定义枚举类
 *
 */
public class enumTest {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season.toString());
        System.out.println("**********************");
        //values方法   遍历所有对象
        Season[] values=Season.values();
        for(Season s:values){
            System.out.println(s);
        }
        System.out.println("*********************************");
        //valueOf(String objName)  返回对应的对象名
        Season season1=Season.valueOf("WINTER");
        System.out.println(season1);


    }
}

//季节枚举类
enum Season{
    //提供当前枚举类的多个对象,多个对象之间用逗号,最后一个用分号
     SPRING("春天","春暖花开"),
    SUMMER("夏天","烈日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");
    //声明属性
    private final String seasonName;
    private final String SeasonDesc;

    //私有化类的构造器,并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.SeasonDesc=seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
