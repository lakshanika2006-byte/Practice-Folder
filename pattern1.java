import java.util.*;

public class pattern1{
    public static void main(String[] args){
        int n = 5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
             if(i==1||j==1||i==n||j==n){
                if(i==1||i==n){
                    System.out.print("1");
                }
                else if(i==2&&j==1){
                    System.out.print("2");
                } 
                else if(i==3&&j==1){
                    System.out.print("3");
                 }
                else if(i==4&&j==1){
                    System.out.print("4");
                } 
                else if(j==n&&(i==2||i==3||i==4)){
                    System.out.print("5");
                }
                else{
                    System.out.print(" ");
                }
             }
             else{
                System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
}