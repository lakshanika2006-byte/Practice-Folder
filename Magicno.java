import java.util.*;

public class Magicno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        

        while(n>9){
             int sum=0;

        while(n>0){

           int digit = n%10;
            sum+=digit;
            n/=10;
        }
        n=sum;
        }
        if(n==1){
            System.out.println("magic no");
        } 
        else{
            System.out.println("not a magic no");
        }      
    }
}