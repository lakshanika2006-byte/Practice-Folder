import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isprime = true;

        if(num<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
        }

        if(isprime){
            System.out.println(num+" is prime");
        }
        else{
             System.out.println(num+" is not prime");
        }
    }
} 