public class Demo {
   static   int num=10;
   static {
       num+=5;
   }
    public static int getValue(int i){
        int result=0;
        switch (i){
            case 1:result=result+i;
            case 2:result=result+i*2;//结果为10,从这这一行开始往下执行
            case 3:result=result+i*3;
        }
        return result;
    }
    public static void Stringdemo(){
       String s=null;
//        if((s!=null)&(s.length()>0)){} //报异常
//        if ((s==null)|(s.length()==0)){}//报异常
       if((s!=null)&&(s.length()>0)){}
       if ((s==null)||(s.length()==0)){}

    }
   public static void main(String[] args) {
//        System.out.println(getValue(2));
       Stringdemo();
    }
    static {
       num/=3;
    }
}
