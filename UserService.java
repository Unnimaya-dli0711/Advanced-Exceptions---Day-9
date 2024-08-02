import java.util.ArrayList;

class UserNotFoundException extends Exception{
    UserNotFoundException(String string){
        super(string);
    }
}
class UserAlreadyExistsException extends Exception{
    UserAlreadyExistsException(String string){
        super(string);
    }
}
public class UserService {
    static ArrayList<String> nameslist=new ArrayList<>();
    static void registerUser(String username) throws UserAlreadyExistsException{
        try{

                if(nameslist.contains(username))
                {
                    throw new UserAlreadyExistsException("User already exists");
                }else {
                    nameslist.add(username);
                }
            
        }catch (UserAlreadyExistsException e){
            System.out.println(e);
        }
    }
    static void checkUserExistence(String username) throws UserNotFoundException{
        try{
            for(String names:nameslist){
                if(!nameslist.contains(username))
                {
                    throw new UserNotFoundException("User not found");
                }else {
                    System.out.println("user found");
                }
            }
        }catch (UserNotFoundException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        nameslist.add("Unnimaya");
        nameslist.add("Sandra");
        try{
            registerUser("Sinta");
            registerUser("Unnimaya");
            checkUserExistence("maya");
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
