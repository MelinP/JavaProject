import org.testng.annotations.Test;

public class MainClass {

    int a;
    int b;

    @Test
    public void FirstTest(){

        int result = aMultiplyToBMinusC(10, 2, 5);
        System.out.println("ageResult: " + result);
    }

    public int aMultiplyToBMinusC(int a, int b, int c) {

        int result = a * b - c;
        return result;
    }



}
