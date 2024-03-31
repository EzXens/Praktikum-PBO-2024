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

    private static void clear(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
    

    public boolean authenticate() throws NumberFormatException , IOException {

        clear();

        while (true) {
        
        System.out.println("=============================================");
        System.out.println("======   LOGIN ART GALLERY PINTER1ST   ======");
        System.out.println("=============================================");
        System.out.println("= 1. login admin                            =");
        System.out.println("= 2. keluar                                 =");
        System.out.println("=============================================");
        System.out.print("masukan pilihan : ");
        String pilih = input.readLine();
        switch (pilih) {
            case "1":
                break;
            case "2":
                System.out.println("Sedang Keluar Program");
                System.exit(0);
            default:
                System.out.println("pilihan tak valid ");
                continue;
        }

        
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
}
