import java.util.*;
public class SecondLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = num/10;
        num=num%10;
        System.out.println(num);
    }
}