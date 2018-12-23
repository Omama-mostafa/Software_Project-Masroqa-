
package masroqa;

import java.util.ArrayList;

public class User {
     private String name;
    private String passward ;
    private String username;
    private String email;
    
    User_Form User_Form = new User_Form();
    public ArrayList<Post> Users = new ArrayList<>();
   public ArrayList<User_Services> User_Services = new ArrayList<>();
  ItemQuestionForm ItemQuestionForm = new ItemQuestionForm();
  ArrayList<FormAnswer>FormAnswer = new ArrayList<>();
            
    public void set_username(String n)
    {username = n;}
      public void set_name(String n)
    {name = n;}
   public void set_passward(String n)
    {passward = n;}
         
     public void set_email(String n)
    {email = n;}
     
     public String get_name()
     {return name;}
     
      public String get_username()
     {return username;}
      
     public String get_passward()
     {return passward;}
     
      public String get_email()
     {return email;}
    
    
}
