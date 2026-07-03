import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int n1=0,n2=1,sum=0;

        if(a==1){
           System.out.println(n1);
        }
        if(a==2){
            System.out.println(n2);
        }
        else{
            for(int i=2;i<a;i++){

            sum = n1+n2;
            n1=n2;
            n2=sum;
             System.out.println(sum);
        }
    }
    } 
 }