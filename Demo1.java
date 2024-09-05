import java.util.*;
public class Demo1 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine();
        int l=str.length();
        int flag=1;
        System.out.print("Length of string is "+l+"\n");
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)<=48 && str.charAt(i)>=57)
            {
                flag=0;
                break;

            }
        }
        if(flag==l)
            System.out.print("String contains only digits");
        else
            System.out.print("String does not contains digits only");
    }
}
