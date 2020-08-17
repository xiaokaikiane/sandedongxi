import java.util.Scanner;

public class Dfs {
    public static void func(int index,int n,int[] boxs,int[] book){//book这个数组就是一个状态数组
        if(index>=n){
            for (int i=0;i<boxs.length;i++) {
                System.out.print(boxs[i]);
            }
            System.out.println();
            return;//终止条件,向上一个盒子回退
        }
        for(int i=0;i<n;i++){
            if(book[i]==0){//当为0时,第i张牌还在手上,没放的
                boxs[index]=i;//将牌放进盒子
                book[i]=1;//当为1时,第i张牌已经放出去了.
                func(index+1,n,boxs,book);//处理下一个盒子
                book[i]=0;//回退后取出上一个盒子的牌.
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] boxs=new int[n];
        int[] book=new int[n];
        func(0,n,boxs,book);
    }
}
