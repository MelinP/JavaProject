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
        MainClass Values = new MainClass("Test@mail.com", "1223456");
        Values.returnEmailAndPassword();
    }

    public void SendEmail(){
        this.sendEmail(email);
    }
    public void SendPassword(){
     this.sendPassword(password);
    }

}