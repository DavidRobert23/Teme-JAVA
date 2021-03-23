
public class PasswordCheck {
	
public static void main(String[] args) {
        
       
       
        
        String password="heyTTre67S##";
 
        if( (password.length() > 8)&&(password.matches("(?=.*[0-9]).*"))&&(password.matches("(?=.*[a-z]).*"))&&(password.matches("(?=.*[A-Z]).*"))&&(password.matches("(?=.*[~!@#$%^&*()_-]).*"))) {
        	System.out.print("parola"+ password+" este OK");
        }
           
        else {
        	System.out.print("parola"+ password+" nu este OK");
        }
        
    }
}


