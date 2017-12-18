import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        char[]date=scn.nextLine().toCharArray();
        int n=date.length;
        int n1=n/2;
        boolean flag=true;
        for (int i=0;i<n1;i++){
            if (date[i]-date[n-1-i]!=0){
                flag=false;
            }
        }
                if (flag==true){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
    }
}
//判斷是否回文