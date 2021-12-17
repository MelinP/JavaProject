public class MainMethod  {

    String name;
    String age;


    public MainMethod(String name, String age) {

        this.name = name;
        this.age = age;

    }

    public void returnNameAndAge() {

        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args){

        MainMethod Names = new MainMethod("Krieg", "60");
        Names.returnNameAndAge();

    }


}