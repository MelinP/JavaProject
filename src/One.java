import org.testng.annotations.Test;

public class One {

    @Test

    public int aMultiplyToBMinusC(int a, int b, int c) {
        int result = a * b - c;
        return result;
    }
        int result = aMultiplyToBMinusC(10, 10, 10);{
        System.out.println("countResult:" + result);
        }
}
