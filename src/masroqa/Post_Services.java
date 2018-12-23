
package masroqa;

import java.util.ArrayList;


public class Post_Services {
    
     private String PostDate;
  private  boolean PostStatus ;
  
  ///ArrayList <Post_Database> p = new ArrayList<>();
  //User_Form user_Form = new User_Form();
  Post_Database post_Database = new Post_Database();
    
  public void set_PostDate(String n)
    {PostDate = n;}
      public void set_PostStatus(boolean n)
    {PostStatus = n;}
  
     public String get_PostDate()
     {return PostDate;}
     
      public boolean get_PostStatus()
     {return PostStatus;}
      
    public void DisplayPosts()
    {}
    public void Set_Status(String PostStatus)
    {}
    
    public boolean Check_Duration(String Duration)
    {
        return  true;
    }
    
    public void store_post(String Post)
    {
    
    }
    public boolean check_post_found()
    {
        return true;
    }
}
