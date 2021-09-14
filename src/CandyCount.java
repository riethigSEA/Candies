//import java.util.Scanner;

public class CandyCount {

    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        double money= 12, price = 1.2;
        int candies = 0;
        //System.out.println("Input Money you have: ");
        //money = input.nextDouble();
        if(money > 0 && price > 0) {

            while(money - price >= 0){
                candies++;
                money = money - price;

            }
        }
        else{
            System.out.println("you don't have any money left!");
        }
        System.out.println("current amount of candies you own: " + candies);
        //test
    }
}
