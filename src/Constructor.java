import org.testng.annotations.Test;

public class Constructor {

    String name;
    String password;

    @Test

    public void sendEmailAndPassword(String email, String password) {
        this.waitForElementPresentClearAndSendKeys(email);
        this.waitForElementPresentClearAndSendKeys(password);
    }

    public void returnName() {
        System.out.println(this.name);
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
        this.waitForElementPresentAndClick();
        System.out.println("clearField");
    }

    public void waitForElementPresentClearAndSendKeys(String value) {
        this.waitForElementPresentAndClear();
        System.out.println("enterValue" + value);

    }




}