import org.testng.annotations.Test;

public class Third extends Second{

    @Test

    public void Multiply(){
        int count = this.result * hugeNumber();
        System.out.println(count);

    }


}
