public class Constructor {

    String email;
    String password;

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
    public void sendEmail(String email){
        waitForElementPresentClearAndSendKeys(email);

    }
    public void sendPassword(String password) {
        waitForElementPresentClearAndSendKeys(password);
    }




}