package homework.Lab_11;

public class TestLogin {
    public static void main(String[] args) {
        LoginPage internalLoginPage = new InternalLoginPage();
        internalLoginPage.performLogin();

        LoginPage externalLoginPage = new ExternalLoginPage();
        externalLoginPage.performLogin();
    }
}
