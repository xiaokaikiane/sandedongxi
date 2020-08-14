import java.util.*;

public class Func {
    List<Map<Person1,Integer>> list=new ArrayList<>();
    static Map<Person1,List<String>> map=new TreeMap<>();
    public static boolean input() {
        Scanner scanner=new Scanner(System.in);
        int selected = scanner.nextInt();
        switch (selected) {
            case 0:
                return true;
            case 1:
                add();
            case 2:
                update();
            case 3:
                pop();
            case 4:
                Search();
        }
        return false;
    }
    public static void add(){  //添加
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入联系人的姓名: ");
        String name=scanner.nextLine();
        System.out.println("请输入联系人的备注: ");
        String remark=scanner.nextLine();
        List<String> list1=new ArrayList<>();
        System.out.println("联系人有几个电话号码");
        int i=scanner.nextInt();
        for(int j=0;j<i;j++) {
            System.out.println("请输入联系人的电话: ");
            String number = scanner.nextLine();
            list1.add(number);
        }
        Person1 Person=new Person1(name,remark);
        map.put(Person,list1);
    }
    public static void update(){  //更新

    }
    public static void pop(){    //删除

    }
    public static void Search(){    //查找
        Scanner Scanner=new Scanner(System.in);

    }
}
