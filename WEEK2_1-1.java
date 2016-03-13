package test2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

    public static void main(String[] args) {
       Date date1 = new Date (2016,03,12,04,23,45);//4點23分45秒
       Date date2 = new Date (2016,03,12,13,54,23);//13點54分23秒
       long a = (date2.getTime()-date1.getTime())/1000;
       System.out.println("相差 "+ a);
    }
    
}
