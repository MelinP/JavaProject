import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class SecondClass extends MainClass {

    @Test

    public int hugeNumber(){
        return 100;
    }

    public void SecondTest() {

        boolean Otvet = aBiggerThanB(10, 5);
        System.out.println("Otvet:" + Otvet );

    }

    public boolean aBiggerThanB(int a, int b) {

        boolean result = this.a > this.b;
        return result;
    }


}
