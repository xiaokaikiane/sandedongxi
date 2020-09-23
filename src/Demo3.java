public class Demo3 {
    String str=new String("abc");
    char[] ch={'a','b','c'};

    public static void main(String[] args) {
        Demo3 ex=new Demo3();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);//abc
        System.out.println(ex.ch);//gbc
    }
    public void change(String s,char[] ch){
        s="test success";
        ch[0]='g';
    }
}
