import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class ThirdClass extends SecondClass{

    @Test

    public void ThirdTest(){

        int result = 100 * hugeNumber();
        System.out.println(result);

    }
}
