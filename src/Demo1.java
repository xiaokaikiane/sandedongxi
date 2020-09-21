public class Demo1 {
    int val;
    Demo1(int val){
        this.val=val;
    }
    public static Demo1 t1=new Demo1(1);
    public static Demo1 t2=new Demo1(2);
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        Demo1 t=new Demo1(3);//构造块,构造块,静态块,构造块

    }
}
