
package masroqa;

import java.util.ArrayList;

public class ItemQuestionForm {
    
     private String Question;
  private String Answer ;
  
  Check_Answer check_Answer = new Check_Answer();
  
  User user = new User();
  Post p = new Post();
  
  
   public void set_Question(String n)
    {Question = n;}
      public void set_Answer(String n)
    {Answer = n;}
  
     public String get_Question()
     {return Question;}
     
      public String get_Answer()
     {return Answer;}
    
}
