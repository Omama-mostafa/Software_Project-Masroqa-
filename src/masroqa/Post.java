
package masroqa;

import java.util.ArrayList;


public class Post {
    private String ItemDescription;
   private String CategoryName;
   
    ArrayList<User> user = new ArrayList<>();
   
   public void set_ItemDescription(String n)
    {ItemDescription = n;}
      public void set_CategoryName(String n)
    {CategoryName = n;}
  
     public String get_ItemDescription()
     {return ItemDescription;}
     
      public String get_CategoryName()
     {return CategoryName;}
}
