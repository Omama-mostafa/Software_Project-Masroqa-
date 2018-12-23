
package masroqa;

import java.util.ArrayList;

public class User_Services {
    private boolean AccValid ;
    
    ArrayList<User_Form> user_Form = new ArrayList<>();
    User_Database user_Database = new User_Database();
    Post_Database post_Database = new Post_Database();
    
    
    public void set_AccValid(boolean AA)
    {
        AccValid = AA;
    }
    public boolean get_AccValid()
    {
        return AccValid;
    }
    public void CheckValidation(String Username,String Passward) { }
}
