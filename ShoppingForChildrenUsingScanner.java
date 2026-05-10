import java.util.Scanner;

public class ShoppingForChildrenUsingScanner {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String items;
        float price;
        int quantity;
        char currency= '$';
        float total;

        System.out.println("Which Item Would you like to buy: ");
        items=sc.nextLine();
        System.out.println("What is the price for each: ");
        price=sc.nextFloat();
        System.out.println("how many would you like to buy: ");
        quantity=sc.nextInt();

        total=price*quantity;

        System.out.println("\n you have bought:" +quantity+ " " +items+ "/s");
        System.out.println("your total is: " + currency + total);
        sc.close();






    }
}
