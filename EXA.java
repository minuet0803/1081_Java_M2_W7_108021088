import java.util.Scanner;
public class EXA{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i+=3){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}