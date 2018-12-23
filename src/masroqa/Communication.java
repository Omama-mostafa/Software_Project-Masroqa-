
package masroqa;


public class Communication {
     private User User1;
  private User User2;
  private boolean Valid_Answer;
  
  Check_Answer check_Answer = new Check_Answer();
  
  public void Send_Notification(String User1,String User2,boolean VAlid_Answer)
  {}
  
  public void set_User1(User n)
    {User1 = n;}
      public void set_User2(User n)
    {User2 = n;}
  
     public User get_User1()
     {return User1;}
     
      public User get_User2()
     {return User2;}
      
  public void set_Valid_Answer(boolean n)
    {Valid_Answer = n;}
  
     public boolean get_Valid_Answer()
     {return Valid_Answer;}
}
