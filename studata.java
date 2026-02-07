import java.util.Scanner;
public class studata
{
public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        String grade=sc.next();
        int marks=sc.nextInt();
        if(marks>50)
        {
            System.out.println("pass");
            
        }
        else
        {
            System.out.println("false");
        }
        
    }
}