import java.util.Scanner;

class InvalidUsernameException extends Exception{
    InvalidUsernameException(String message){
        super(message);
    }
}
class InvalidPasswordException extends Exception{
    InvalidPasswordException(String message){
        super(message);
    }
}


public class LoginPage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username:");
        String username = sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();
        try{
            login(username,password);
            System.out.println("login Created");
        }catch(InvalidUsernameException e){
            System.out.println(e.getMessage()+"\n"+"Renter Username");
        }catch(InvalidPasswordException e){
            System.out.println(e.getMessage()+"\n"+"Renter Password");
        }
        sc.close();
    }


    static void login(String username,String password) throws InvalidPasswordException,InvalidUsernameException{
        //username validation
        UsernameValidation(username);
        //passwordvalidation
        PasswordValidation(password);
    }


    static void UsernameValidation(String username) throws InvalidUsernameException{
        if(username == null || username.trim().isEmpty()){
            throw new InvalidUsernameException("Username Empty");
        }else if(username.length()<5){
            throw new InvalidUsernameException("Username must be more than 5 charachters");
        }
    }


    static void PasswordValidation(String password) throws InvalidPasswordException{
        if(password.length()<8){
            throw new InvalidPasswordException("Password must be more than 8 characters");
        }else if(!containsDigit(password)){
            throw new InvalidPasswordException("Password must have digits");
        }
    }


    public static boolean containsDigit(String password) {
        for(char c:password.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
