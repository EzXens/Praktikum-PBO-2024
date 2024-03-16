import java.io.*;

public class login {
    // properties
    private String username ;
    private String password ;

    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);

    // constructor
    login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean authenticate() throws NumberFormatException , IOException {
        System.out.println("========== Login Art Gallery Pinter1st ===========");
        System.out.println("=== Leak (Username : admin , password : admin) ===");
        System.out.println("==================================================");
        System.out.print("Username : ");
        String Input_Username = input.readLine();
        System.out.print("Password : ");
        String Input_Password = input.readLine();

        return username.equals(Input_Username) && password.equals(Input_Password);
    }
}
