import java.util.*;

public class unique_digitcount{
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

boolean[] seen = new boolean[10];
int count=0;

while(n>0){
    int digit = n%10;
     if(!seen[digit]){
        seen[digit]=true;
        count++;
     }
     n/=10;
}
   System.out.println(count);

  }
}