package test4;
import java.io.*;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        int option=0;
        Scanner scanner = new Scanner(System.in);
        while (option != -1)
        {
            System.out.print("Option 1)圓 2)日期 -1)break: ");
            option = scanner.nextInt();
            if (option == 1)
            {
                int option2=0, counter=0;
                double tempR=0, tempA=0;
                double [] radius = new double[100];
                while(true)
                {
                    System.out.print("輸入半徑(0結束): ");
                    tempR = scanner.nextDouble();
                    if (tempR == 0)
                        break;
                    System.out.print("確定輸入?1)Yes 2)No");
                    int opt = scanner.nextInt();
                    if (opt == 1)
                    {
                        radius[counter++] = tempR;
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
                        System.out.print("輸入角度:  ");
                        tempA = scanner.nextDouble();
                        Circle c = new Circle (radius[check],tempA);
                        System.out.println("編號:"+check+" 半徑:"+radius[check]+" 角度:"+tempA+ " 弧度:"+c.Arc()+" 面積:"+c.Pie());
                    }
                    else 
                        System.out.println("查無此編號");
                        
                }
            }
            else if (option == 2)
            {
                int year,month,day, check;
                System.out.print("輸入年分:");
                year = scanner.nextInt();
                System.out.print("輸入月分:");
                month = scanner.nextInt();
                System.out.print("輸入日期:");
                day = scanner.nextInt();
                
                Date d = new Date(day,month,year);
                check = d.Check();
                if (check == 1)
                    System.out.println(year+"/"+month+"/"+day);
                else 
                    System.out.println("ERROR");
            }
            else if (option == -1)
                break;
        }
    }
}
class Circle
{
    double radius, angle;
    Circle (double r,double a)
    {
        radius = r;
        angle = a;
    }
    double Pie()
    {
        return radius*radius*3.14;
    }
    double Arc()
    {
        return radius*2*(angle/360);
    }
}
class Date
{
    int D,M,Y;
    Date (int Day,int Month, int Year)
    {
        D = Day;
        M = Month;
        Y = Year;
    }
    public int Check() 
    {
            if (Y <= 0)
                return 0;
            if ((M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) && (D > 0 && D <= 31))
                return 1;
            else if ((M == 4 || M == 6 || M == 9 || M == 11) && (D > 0 && D <= 30))
                return 1; 
            else if ((M == 2) && D > 0) 
            {
                if (((Y % 400 == 0) || (Y % 4 == 0 && Y % 100 != 0)) && D <= 29 && D > 0)
                    return 1;
                else if (D <= 28 && D > 0)
                    return 1;
            }
            return 0;
    }
}
