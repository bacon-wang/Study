public class Login {

    private String userName = "admin";
    private String password = "123456";

    public boolean login(String userName, String password) throws UserNameErrorException, PasswordErrorException {
        if (!this.userName.equals(userName)) {
            throw new UserNameErrorException("用户名错误：" + userName);
        }

        if (!this.password.equals(password)) {
            throw new PasswordErrorException("密码错误：" + password);
        }

        System.out.println("登录成功");
        return true;
    }
}
