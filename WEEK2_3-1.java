/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author 靖旻
 */
public class Test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option2=0, counter=0;
                double tempR=0, tempR2=0;
                double [][] radius = new double[100][2];
                while(true)
                {
                    System.out.print("輸入長軸(0結束): ");
                    tempR = scanner.nextDouble();
                    System.out.print("輸入短軸(0結束): ");
                    tempR2 = scanner.nextDouble();
                    if (tempR == 0 && tempR2 == 0)
                        break;
                    System.out.print("確定輸入?1)Yes 2)No");
                    int opt = scanner.nextInt();
                    if (opt == 1)
                    {
                        radius[counter][0] = tempR;
                        radius[counter++][1] = tempR2;
                    }
                }
                while (true)
                {
                    System.out.print("輸入查詢編號(-1結束): ");
                    int check = scanner.nextInt();
                    if (check == -1)
                        break;
                    else if (check > -1 && check < counter)
                    {
                        Oval o = new Oval (radius[check][0],radius[check][1]);
                        System.out.println("編號:"+check+" 長軸:"+radius[check][0]+" 短軸:"+radius[check][1]+" 面積:"+o.Pie());
                    }
                    else 
                        System.out.println("查無此編號");
                        
                }
    }
    
}
class Circle
{
    double radius;
    Circle (double r)
    {
        radius = r;
    }
    double Pie()
    {
        return radius*radius*3.14;
    }
    double Arc(int angle)
    {
        return radius*2*(angle/360);
    }
}
class Oval extends Circle
{
    double shortR;
    Oval (double r, double shortr)
    {
        super(r);
        shortR = shortr;
    }
    double Pie ()
    {
        return radius*shortR*3.14;
    }
}
