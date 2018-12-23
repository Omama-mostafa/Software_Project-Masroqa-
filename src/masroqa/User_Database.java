
package masroqa;

import java.io.*;
import java.util.ArrayList;


public class User_Database {
    
    ArrayList <User_Services> user_Services = new ArrayList<>();
    
    
    public  ArrayList<details> get_data()throws IOException//String n , String p , ArrayList<User> Users)
    {
    
        File file = new File("User.txt");
        if(!file.exists())
            file.createNewFile();
        BufferedReader br = new BufferedReader(new FileReader("User.txt"));
        ArrayList<details> arr_det = new ArrayList<>();
        String line = "";
        String [] S;
        while((line = br.readLine()) != null)
        {
            S = line.split("\t\t");
            details obj = new details();
            obj.name = S[0];
            obj.password = S[1];
            arr_det.add(obj);
        }
        br.close();
        return arr_det;
        
        /*for (int i = 0; i < Users.size(); i++) {
            String name=Users.get(i).get_name();
            String pass=Users.get(i).get_passward();
            //System.out.println("here i am ! "+ Users.size());
            // System.out.println(Users.get(i).get_name()+"\t\t"+Users.get(i).get_passward()+"--> "+ name.compareTo(n));
        
            if ((name.compareTo(n))==0 && (pass.compareTo(p))==0 ) {
                return true;
            }
        }
        return false;*/
    }
    
    private User u = new User();
    
    
    static class details
    {
        String name;
        String password;
    }
  public boolean save_data(String n , String p , String e)throws IOException// , String e , ArrayList<User> Users)
  {
    
      File file = new File("User.txt");
      if(!file.exists())
          file.createNewFile();
      BufferedWriter bw = new BufferedWriter(new FileWriter("User.txt"));
      bw.append(n + "\t\t" + p + "\t\t" + e);
      bw.close();
      return true;
      /*u.set_name(n);
      u.set_passward(p);
      u.set_email(e);
      Users.add(u);*/

       /* String s;
        s = u.get_name() + "\t\t" + u.get_passward() + "\t\t" + u.get_email() + "\t\t";
        //write to the file
        Writer wr = new FileWriter("user_info.txt");
        wr.write(s);
        wr.close();*/
  }
  public void update_data(User u) 
  {}
  public void delete_data(User u)
  {}
}
