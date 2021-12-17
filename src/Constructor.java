import org.testng.annotations.Test;

public class Constructor {

    String email;
    String password;

    @Test

    public void sendEmailAndPassword(String email, String password) {
        waitForElementPresentClearAndSendKeys(email);
        waitForElementPresentClearAndSendKeys(password);
    }

    public void returnName() {
        System.out.println(this.email);
    }
    public void returnPassword(){ System.out.println(this.password); }

    public void waitForElement() {
        System.out.println("Waiting");
    }

    public void waitForElementPresentAndClick(){
        waitForElement();
        System.out.println("Click");
    }

    public void waitForElementPresentAndClear() {
        waitForElementPresentAndClick();
        System.out.println("clearField");
    }

    public void waitForElementPresentClearAndSendKeys(String value) {
        waitForElementPresentAndClear();
        System.out.println("enterValue" + value);

    }




}