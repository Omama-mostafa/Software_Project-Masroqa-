
package masroqa;

import java.util.ArrayList;


public class Post {
    private String ItemDescription;
   private String CategoryName;
   
    ArrayList<User> user = new ArrayList<>();
     ArrayList<Post_Services> post_Services = new ArrayList<>();
   FormAnswer FormAnswer = new FormAnswer();
   ItemQuestionForm ItemQuestionForm = new ItemQuestionForm();
   
   public void set_ItemDescription(String n)
    {ItemDescription = n;}
      public void set_CategoryName(String n)
    {CategoryName = n;}
  
     public String get_ItemDescription()
     {return ItemDescription;}
     
      public String get_CategoryName()
     {return CategoryName;}
}
