import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        if(num>1){
            for(int i=1;i<=num;i++){
                count++;
            }
            if(count==2){
                System.out.println(num+" it is a prime no");
            }
            else{
                System.out.println(num+" it is not a prime no");
            }
        }

    }
}