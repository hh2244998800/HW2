/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test6;
import java.io.*;
import java.util.*;
/**
 *
 * @author 靖旻
 */
public class Test6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option=0 , count=0;
        double temp, temp2;
        Shape []all = new Shape[100];
        while (option != -1)
        {
            System.out.println("選項 1.圓形 2.三角形 3.橢圓形 4.矩形 -1.結束");
            option=scanner.nextInt();
            if (option == 1)
            {
                System.out.println("輸入半徑: ");
                temp = scanner.nextDouble();
                if (temp > 0)
                    all[count++] = new Circle(temp);
            }
            else if (option == 2)
            {
                System.out.println("輸入底: ");
                temp = scanner.nextDouble();
                System.out.println("輸入高: ");
                temp2 = scanner.nextDouble();
                if (temp > 0 && temp2 > 0)
                    all[count++] = new Triangle(temp,temp2);    
                    
            }
            else if (option == 3)
            {
                System.out.println("輸入長軸: ");
                temp=scanner.nextDouble();
                System.out.println("輸入短軸: ");
                temp2=scanner.nextDouble();
                if(temp>0 && temp2>0 && temp>temp2)
                    all[count++]=new Oval(temp,temp2);
            }
            else if (option == 4)
            {
                System.out.println("輸入邊一: ");
                temp=scanner.nextDouble();
                System.out.println("輸入邊二: ");
                temp2=scanner.nextDouble();
                if(temp>0 && temp2>0)
                    all[count++] = new Retangle(temp,temp2);
            }
            else if (option == -1)
                break;
        }
        for (int i=0 ; i <count  ; i++)
            all[i].Show();
    }
    
}
abstract class Shape
{
    abstract double Area();
    abstract void Show();
}
class Circle extends Shape
{
    double r;
    Circle (double radius)
    {
        r= radius;
    }
    double Area()
    {
        return r*r*3.14;
    }
    void Show()
    {
        System.out.println("圓形 面積:"+Area());
    }
}
class Triangle extends Shape
{
    double hight,base;
    Triangle (double h1,double h2)
    {
        hight = h1;
        base = h2;
    }
    double Area()
    {
        return hight*base/2;
    }
    void Show()
    {
        System.out.println("三角型 面積:"+Area());
    }
}
class Retangle extends Shape
{
    double a,b;
    Retangle (double x, double y)
    {
        a = x;
        b = y;
    }
    double Area()
    {
        return a*b;
    }
    void Show ()
    {
        System.out.println("矩形 面積:"+Area());
    }
}
class Oval extends Shape
{
    double l,s;
    Oval (double longr,double shortr)
    {
        l = longr;
        s = shortr;
    }
    double Area()
    {
        return l*s*3.14;
    }
    void Show ()
    {
        System.out.println("橢圓形 面積:"+Area());
    }
}
