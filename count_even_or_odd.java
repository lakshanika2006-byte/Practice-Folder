import java.util.Scanner;

public class count_even_or_odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Even Or Odd: ");
        String choice = sc.next();

        int sum=0;

        while(n>0){
            int digit = n%10;

            if(choice.equalsIgnoreCase("even")){
             if(digit%2==0)
                sum+=digit;
            }
            else{
                if(digit%2!=0)
                sum+=digit;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}