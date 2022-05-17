
package play.pizza_ordering;
import java.util.*;

public class User {
    // Full Name, Phone, Location
    String FullName;
    String PhoneNumber;

    // Location Still not decided;
    User(String name,String number){
        FullName=name;
        PhoneNumber=number;
    }
    User(String name,String number,int Loc){
        // underconstracting 
    }
    
}
class Controller{
    List<User> user=new ArrayList<>();
    
    public boolean addUser(String name,String number){
        User nw=new User(name,number);
        return user.add(nw);
    }
    public boolean isExist(String number){
        String num;
        for (int i = 0; !user.isEmpty() && i<user.size()-1; i++) {
            num=user.get(i).PhoneNumber;
            if(num.equals(number)) return true;
        }
        return false;
    }
}
