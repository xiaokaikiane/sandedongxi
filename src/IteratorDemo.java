import java.util.*;

public class IteratorDemo {
    public static void ArrayListDemo(){
        List<Integer>  list=new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(432);
        list.add(534);
        Iterator<Integer> integerIterator=list.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
public  static void LinkedListDemo(){
        List<Integer> list=new LinkedList<>();
        list.add(25);
        list.add(54);
        list.add(5546);
        list.add(78);
        list.add(56);
        Iterator<Integer> integerIterator=list.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
}

    private static void SetDemo() {
        Set<String> set=new HashSet<>();
        set.add("4664643");
        set.add("dfgdfh");
        set.add("345436");
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void mapDemo(){
        Map<String,Integer> map=new HashMap<>();
        map.put("dfsd",34);
        map.put("gf",6);
        map.put("hgh",54);
        map.put("bbd",76);
        Set<Map.Entry<String, Integer>> set=map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getKey());
        }

    }
    public static void main(String[] args) {
        ArrayListDemo();
        System.out.println("----------------------------------");
        LinkedListDemo();
        System.out.println("----------------------------------");
        SetDemo();
        System.out.println("----------------------------------");
        mapDemo();
    }

}
