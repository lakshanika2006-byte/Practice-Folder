import java.util.*;

public class Nonrepeated_count{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] freq = new int[10];

        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        int count=0;

        for(int i=0;i<10;i++){
            if(freq[i]==1)
                 count++;
        }
        System.out.print(count);
    }
}