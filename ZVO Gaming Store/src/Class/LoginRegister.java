package Class;

public class LoginRegister {
    //Variable
    public String user_name;
    public int user_id = 1;
    private String password;
    private String email1;
    public static int count = 1;
    public static String input;

    public LoginRegister(String Email, String username, String Rpassword) {
        this.user_id = count++;
        this.email1 = Email;
        this.user_name = username;
        this.password = Rpassword;
        count++;

            System.out.println("Registrasi berhasil dengan Username :" + username);
            System.out.println("                           Email    :" + Email);

        System.out.println("HALLO "+username);

        }
    }