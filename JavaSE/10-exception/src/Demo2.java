import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String userName = scanner.nextLine();
            String passwd = scanner.nextLine();
            System.out.println(userName);
            System.out.println(passwd);
            try {
                if (login.login(userName, passwd)) return;
            } catch (UserNameErrorException e) {
                e.printStackTrace();
            } catch (PasswordErrorException e) {
                e.printStackTrace();
            }
        }


    }
}
