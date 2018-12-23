
package masroqa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class User_Form {
    
    private ArrayList<User> Users = new ArrayList<>();
    private User_Database DB =new User_Database ();
    
    ArrayList<User_Post> User_Post = new ArrayList<>();
    Post_Services Post_Services = new Post_Services();
    ArrayList<User_Services> user_Services = new ArrayList<>();
    Post p = new Post();
    
    public boolean Login () throws IOException
    {
        String name="";
        String password="";
        Scanner s = new Scanner(System.in);
        System.out.print("User Name : ");
        name=s.next();
        
        System.out.print("Password : ");
        password=s.next();
        User_Database udb = new User_Database();
        ArrayList<User_Database.details> arr = udb.get_data();
        boolean found = false;
        for(int i=0; i<arr.size(); i++)
        {
            if(name.equals(arr.get(i).name) && password.equals(arr.get(i).password))
            {
                found = true;
            }
        }
        return found;
    }
    
    public boolean Registration () throws IOException
    {
        String name="";
        String password="";
        String email="";
        
        Scanner s = new Scanner(System.in);
        System.out.print("User Name : ");
        name=s.next();
        
        System.out.print("Password : ");
        password=s.next();
        
        System.out.print("Email : ");
        email=s.next();
        User_Database u_db = new User_Database();
        if(u_db.save_data(name , password , email))
            return true;
        else
            return false;
    }
    
    
    public void SignUp () throws IOException
    {
        if (Registration())
        {
            System.out.println ("Successfully!");
        }
        else
        {
            System.out.println("Something Wrong happened");
        }
    }
    
    
    public void PostItem() throws IOException
    {
        String ss ="";
        Scanner read = new Scanner(System.in);
        ItemQuestionForm itemQuestion = new ItemQuestionForm();
        System.out.println("Enter the post discription ");
        p.set_ItemDescription(read.next());
        //database.save_data(p.get_ItemDescription());

        System.out.println("Enter the CategoryName ");
        p.set_CategoryName(read.next());
        //database.save_data(p.get_CategoryName());

        System.out.println("Enter the itemQuestion ");
        itemQuestion.set_Question(read.next());

       // database.save_data(itemQuestion.get_Question());

        System.out.println("Enter the Answer ");
        itemQuestion.set_Answer(read.next());
        //database.save_data(itemQuestion.get_Answer());
        Post_Database obj = new Post_Database();
       ss = p.get_ItemDescription()+"\t\t" + p.get_CategoryName()+ "\t\t" +itemQuestion.get_Question()+ "\t\t" +itemQuestion.get_Answer();
        obj.save_data(ss);
    }
    
    public void SearchItem() throws IOException
    {
        Post_Database db = new Post_Database();
        ArrayList<Post_Database> det_arr = db.get_data();
        Scanner read = new Scanner(System.in);
        String search;
        System.out.print("Enter To Search : ");
        search = read.next();
        boolean found = false;
        for(int i=0; i<det_arr.size(); i++)
        {
            if(search.equals(det_arr.get(i).item_name) || search.equals(det_arr.get(i).cate_name))
            {
                System.out.println(det_arr.get(i).post_det);
                found = true;
            }
            if(i == det_arr.size()-1 && !found)
            {
                System.out.println("No Search Found.");
            }
        }
    }
    
    public void update_post(String Post)
    {}
    public void delete_post(String Post)
    {}
}
