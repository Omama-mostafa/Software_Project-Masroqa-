
package masroqa;

import java.util.ArrayList;

public class FormAnswer {
    
    private String Answer ;
    
    ArrayList<User> user = new ArrayList<>();
    Post p = new Post();
    Check_Answer check_Answer = new Check_Answer();
    
      public void set_Answer(String n)
    {Answer = n;}
      
      public String get_Answer()
     {return Answer;}
    
}
