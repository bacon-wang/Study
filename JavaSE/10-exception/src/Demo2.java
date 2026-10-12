public class Demo2 {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.login("zhangsan", "123456");
            login.login("admin", "123");
            login.login("admin", "123456");
        } catch (UserNameErrorException e) {
            e.printStackTrace();
        } catch (PasswordErrorException e) {
            e.printStackTrace();
        }

        System.out.println("xixi");
    }
}
