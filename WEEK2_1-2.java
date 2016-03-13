package test1;
import java.io.*;

public class Test1 {
    
    public static void main(String[] args) {
        int []a = {0,1,2,3,4,5};
        int sum=0,avg=0;
        for (int i=0 ; i<6 ; i++)
            sum += a[i];
        avg = sum/6;
        System.out.println("總和:"+sum+" 平均:"+avg);
    }
    
} 
