import java.util.*;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0;
        int org_no = n;

        while(n!=0){
          rev = rev*10+n%10;
          n/=10;
        }
        if(org_no==rev){
            System.out.println("palindrome no");
        }
        else{
            System.out.println("Not a palindrome no");
        }
    }
}