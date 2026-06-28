import java.util.Scanner;
public class odd{
    public static void main(String[] aargs){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2!=0){
            System.out.println(num+" is odd");
        }
        else{
            System.out.println(num+" is even");
        }
    }
}