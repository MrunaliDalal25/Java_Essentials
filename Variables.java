public class Variables {
    public static void main(String[] args) {
        int age = 25;
        int year = 2026;
        int num = 3;

        double salary = 30.560;
        double temperature = -17.2;
        double money = 19;

        char grade = 'A';
        char symbol = '#';
        char currency = '$';


        //System.out.println(salary);
        System.out.println("$" + money);
        System.out.println(currency);

        boolean isStudent = true;
        boolean isOnline = false;
        boolean forSale=true;
        if (isStudent) {
            System.out.println("you are a student");
        } else {
            System.out.println("you are not a student");

        }


//reference data type
        String name = "Mrunali";
        String suranme = "Dalal";
        String email = "mrunalidalal44@gmail.com";
        String car = "Swift";

        System.out.println("Hello my name is:"  +name);
        System.out.println("My surname is:"   +suranme);
        System.out.println("My email is:  "  +  email);
        System.out.println("my choice is: " + suranme + "  " + email + "  " + car + "  " );

        if(isStudent){
            System.out.println("my details are : " + name + " " + car + "  " + suranme + "  " + email);
        }

        if (forSale) {
            System.out.println("Thiere is a " + car +" for sale");
        }

    }
}
