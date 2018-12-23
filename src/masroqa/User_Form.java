
package masroqa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class User_Form {
    ArrayList<User_Post> User_Post = new ArrayList<>();
    Post_Services Post_Services = new Post_Services();
    ArrayList<User_Services> user_Services = new ArrayList<>();
    
    
     public void Login()
    {}
    public void PostItem()
    {}
    
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
