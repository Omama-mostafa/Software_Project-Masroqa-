
package masroqa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Post_Database {
    
        String item_name;
        String cate_name;
        String post_det;
    ArrayList <User_Services> user_Services = new ArrayList<>();
    ArrayList<Check_Answer> check_Answer = new ArrayList<>();
    ArrayList<Post_Services> post_Services = new ArrayList<>();
    
    public ArrayList<Post_Database> get_data() throws IOException
    {
        ArrayList<Post_Database> det_arr = new ArrayList<>();
        File file = new File("Item.txt");
        if(!file.exists())
            file.createNewFile();
        BufferedReader br = new BufferedReader(new FileReader("Item.txt"));
        String[] S;
        String f_read = "";
        while((f_read = br.readLine()) != null)
        {
            Post_Database obj = new Post_Database();
            S = f_read.split("\t\t");
            obj.item_name = S[0];
            obj.cate_name = S[1];
            obj.post_det = S[2];
            det_arr.add(obj);
        }
        return det_arr;
    }
  public void save_data(Post p)
  {}
  public void update_data(Post p) 
  {}
  public void delete_data(Post p)
  {}
}
