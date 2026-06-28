import java.util.Scanner;

public class OddFive{
    public static void main(String[] args){
        int[] num = {10,12,15,5,3};
        int count = 0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}