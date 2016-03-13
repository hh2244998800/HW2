package test3;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        int option=0;
        
        do
        {   
            System.out.print("Option 1)西元轉民國 2)數學運算 3)顯示閏年 4)學生資料" );
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            if (option == 1)
            {
                int count=0, tempY,tempM, tempD;
                int[] RCYear=new int[10], RCMonth=new int[10], RCDay=new int[10];
                String tempName = new String();
                String [] studentName = new String[10];
                for (int i=0 ; i<10 ; i++)
                    studentName[i] = new String();
        
                System.out.print("請輸入姓名: ");
                tempName = scanner.next();
                System.out.print("請輸入出生西元年分: ");
                tempY = scanner.nextInt();
                System.out.print("請輸入出生月分: ");
                tempM = scanner.nextInt();
                System.out.print("請輸入出生日期: ");
                tempD = scanner.nextInt();
                
                System.out.print("是否輸入? 1)輸入 2)取消: ");
                Scanner op = new Scanner(System.in);
                int option2 = op.nextInt();
                if (option2 == 1)
                {
                    RCYear[count] = tempY-1911;
                    RCMonth[count] = tempM;
                    RCDay[count] = tempD;
                    studentName[count] = tempName;
                    System.out.println(studentName[count]+"\t民國 "+RCYear[count]+"年 "+RCMonth[count]+"月 "+RCDay[count++]+"日");
                }
            }
            else if (option == 2)
            {
                int option2;
                double db1, db2;
                System.out.print("Input double1: ");
                db1 = scanner.nextDouble();
                System.out.print("Input double1: ");
                db2 = scanner.nextDouble();
                System.out.print("Option: 1)+ 2)- 3)* 4)/");
                option2 = scanner.nextInt();
                if (option2 == 1)
                    System.out.println(db1+" + "+db2+"="+(db1+db2));
                else if (option2 == 2)
                    System.out.println(db1+" - "+db2+"="+(db1-db2));
                else if (option2 == 3)
                    System.out.println(db1+" * "+db2+"="+(db1*db2));
                else if (option2 == 4)
                {
                    if (db2 != 0)
                        System.out.println(db1+" / "+db2+"="+(db1/db2));
                    else 
                        System.out.println("double2 can't be 0!!!!");
                }
            }
            else if (option == 3)
            {
                System.out.print("請輸入西元: ");
                int AD = scanner.nextInt();
                for (int i=AD ; i>=0 ; i--)
                    if ((i%400)==0 || ((i%4)==0 && (i%100)!=0))
                        System.out.println(i);
            }
            else if (option == 4)
            {
                int count=0, opt, check=0;
                double []grade = new double[10];
                String []stuName = new String[10];
                for (int i=0 ; i<10 ; i++)
                    stuName[i] = new String();
                do
                {
                    System.out.print("輸入? 1)Yes 2)No: ");
                    opt = scanner.nextInt();
                    if (opt == 1)
                    {
                        String tempN;
                        double tempG=0;
                        System.out.print("請輸入姓名: ");
                        tempN = scanner.next();
                        try{
                        System.out.print("輸入成績: ");
                        tempG = scanner.nextInt();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Error: "+e);
                            break;
                        }
                        System.out.print("編號:"+count+" 姓名:"+tempN+" 成績:"+tempG+" 確定輸入? 1)Yes 2)No: ");
                        int opt2 = scanner.nextInt();
                        if (opt2 == 1)
                        {
                            stuName[count] = tempN;
                            grade[count++] = tempG;
                        }
                    }
                }while(opt != 2);
                while(check != -1 && count != 0)
                {
                    System.out.print("請輸入查詢的學生編號(-1結束): ");
                    check = scanner.nextInt();
                    if (check > -1 && check < count && count != 0)
                        System.out.println("編號:"+check+" 姓名:"+stuName[check]+" 成績:"+grade[check]);
                }
            }
        }while (option != -1);
    }
}
