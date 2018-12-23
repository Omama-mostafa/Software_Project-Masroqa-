
package masroqa;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Masroqa {

    public static void main(String[] args) throws IOException
    {
        int num = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("1- Login.");
        System.out.println("2- Register.");
        num = read.nextInt();
        if(num == 1)
        {
        
        }
        if(num == 2)
        {
        
        }
        int number = 0;
        System.out.println("1- Post Item.");
        System.out.println("2- Search Item.");
        number = read.nextInt();
        if(number == 1)
        {
        
        }
        if(number == 2)
        {
            User_Form uf = new User_Form();
            uf.SearchItem();
        }
    }
}
