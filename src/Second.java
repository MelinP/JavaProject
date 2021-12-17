import org.testng.annotations.Test;

public class Second extends One  {

    @Test

    public void Answer() {

        boolean Otvet = aBiggerThanB(10, 5);
        System.out.println("Otvet:" + Otvet );

    }
    public boolean aBiggerThanB(int a, int b) {

        boolean result = a > b;
        return result;
    }

    public int hugeNumber(){
        return 100;
    }
}
