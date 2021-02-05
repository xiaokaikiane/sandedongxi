import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    /**
     * java.util.Date
     *    |----java.sql.Date
     */
    @Test
    public void Test1(){   //util
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());//时间戳

        Date date2 = new Date(3213123L);//生成时间
        System.out.println(date2.toString());

    }
    @Test
    public void Test2(){    //sql
        java.sql.Date date2 = new java.sql.Date(241424141L);
        System.out.println(date2.toString());
        System.out.println(date2.getTime());

        //util-->sql时间
        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());
        System.out.println(date4);
    }
    @Test
    public void test(){
        long time=System.currentTimeMillis();//时间戳
        System.out.println(time);
    }

    /**
     * SimpleDateFormat的使用,SimpleDateFormat对日期的Date类的格式化和解析
     * 1.两个操作:
     *   1.格式化:  日期-->字符串
     *   2.解析:    字符串--.日期
     */
    @Test
    public void test3() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();//格式化
        Date date = new Date();
        String format=simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(format);


        String str="19-08-09 上午11:43";//解析
        System.out.println(simpleDateFormat.parse(str));//解析固定格式的字符串日期


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//按照约定格式化和解析
        String date1=dateFormat.format(date);
        System.out.println(date1);
        Date parse = dateFormat.parse("2021-02-22 11:48:27");
        System.out.println(parse);
    }

    /**
     * 日历类 calendar(抽象类)
     */
    @Test
    public  void  test5(){
        //1.实例化
        //一.创建子类GregorIanCalendar对象
        //调用其静态方法getInstance()
        Calendar calendar=Calendar.getInstance();

        //二.调用方法
        //...
    }


    //LocalDate   LocalTime   LocalDateTime   常用日期类    Instant  瞬时类
}
