import java.util.Scanner;

public class EvenorOdd{
    public static void main(String[] args){
        int[] num = {10,12,15,5,3};
        int Evencount = 0;
        int Oddcount = 0;

        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                Evencount++;
            }
            else{
                Oddcount++;
            }
        }
        System.out.println(Evencount);
        System.out.println(Oddcount);
    }
}