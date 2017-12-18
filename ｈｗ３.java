import java.util.Scanner;

public class ｈｗ３ {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        System.out.println(fun(n)/fun(m)*fun(n-m));
    }
    public static int fun(int n){
        int sum=1;
        for (int i=n;i>1;i--) {
            sum = sum * i;
        }
        return sum;
        }
    }
//含術練習
