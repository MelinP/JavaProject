public class MainClass extends Constructor   {


    public MainClass(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void returnEmailAndPassword() {
        System.out.println("email:" + email);
        System.out.println("password:" + password);
    }

    public static void main(String[] args){
        MainClass Names = new MainClass("Test@mail.com", "1223456");
        Names.returnEmailAndPassword();
    }

    public void sendEmailAndPassword(String email, String password) {
        this.waitForElementPresentClearAndSendKeys(email);
        this.waitForElementPresentClearAndSendKeys(password);
    }




}