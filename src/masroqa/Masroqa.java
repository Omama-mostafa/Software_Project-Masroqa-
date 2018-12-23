
package masroqa;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Masroqa {

    public static int display()
    {
        int num = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("1- Login.");
        System.out.println("2- Register.");
        num = read.nextInt();
        return num;
    }
    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(System.in);
        int num = display();
        if(num == 1)
        {
            User_Form uf = new User_Form();
            boolean x = uf.Login();
            if(x)
                System.out.println("Successfully.");
            else
            {
                System.out.println("Maybe you are have no account try to sign up.");
                num = display();
            }
        }
        if(num == 2)
        {
            User_Form uf = new User_Form();
            uf.SignUp();
        }
        int number = 0;
        System.out.println("1- Post Item.");
        System.out.println("2- Search Item.");
        number = read.nextInt();
        if(number == 1)
        {
             User_Form uf = new User_Form();
            uf.PostItem();
        }
        if(number == 2)
        {
            User_Form uf = new User_Form();
            uf.SearchItem();
        }
    }
}
