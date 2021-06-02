
import java.util.Scanner;
public class Solution {

    public static void main(String[]args)
     {
          int num;
          System.out.println("num");
           Scanner sc= new Scanner (System.in);
           num= sc.nextInt();
           if(num%2!=0)
             {
                 System.out.println("Weird");
             }
           else if(num % 2 == 0 && (num>=2&&num<=6))
           {
               System.out.println("Not Weird");
           }
          else if(num % 2 == 0 &&(num>=6&&num<=20))
              {
            System.out.println("Weird");
              }
          else if(num % 2 == 0 && (num>=20))
              {
            System.out.println("Not Weird");
              }
         }
            
     }
