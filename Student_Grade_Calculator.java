import java.io.*;
import java.util.Scanner;
public class Student_Grade_Calculator
{
  public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Student Grade Calculator");
    System.out.println("Enter No of Subject :");
    int a1=sc.nextInt();
    int total=0;
    for(int i=0; i<a1;i++)
      {
      System.out.println("Enter Marks Obtained in "+(i+1)+": ");
      int marks=sc.nextInt();
      total+=marks;
      }
      double averS=(double)total/a1;
   char Grade;
   if(averS>=90)
    {
      Grade='O';
    }
   else if(averS>=80)
    {
      Grade='A';
    }
   else if(averS>=70)
    {
      Grade='B';
    }
    else if(averS>=60)
    {
      Grade='C';
    }
    else if(averS>=50)
    {
      Grade='D';
    }
    else if(averS>=40)
    {
      Grade='E';
    }
    else
    {
       Grade='F';
    }
    System.out.println("Total Marks Scored is = "+total);
    System.out.println("Average Percentage Gained is = "+averS+"%");
    System.out.println("Grade = "+Grade);
    }
  }



    
    