public class Animal {
    public void move(){
        System.out.println("动物可以移动");
    }

}
class dog extends Animal{
    public void move(){
        System.out.println("狗可以跑");
    }
    public void bark(){
        System.out.println("狗可以叫");
    }
}

 class TestDog{
    public static void main(String[] args) {
       Animal a=new Animal();
       Animal b=new dog();
      dog c=new dog();
//      dog d=new Animal();//报错
      c.move();//狗可以跑
       a.move();//动物可以移动
       b.move();//狗可以跑
//       b.bark();//报错
    }
}
