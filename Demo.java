import java.util.*;
public class Demo
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("ENter a string:");
        String str=s.nextLine();
        int l=str.length();
        System.out.print("Length of string is "+l+"\n");
        boolean result=str.matches("[0-9]+");
        if(result == false)
            System.out.print("Given string does not contains digits only");
        else
            System.out.print("Given string contains digits only");
    }
}