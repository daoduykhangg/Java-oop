package Lab_11;

public class ExternalLoginPage extends LoginPage {
    public ExternalLoginPage() {
        iLoginBehaviour = new SSOLoginBehaviour();
    }
}
