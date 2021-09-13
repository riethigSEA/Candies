public class CandyCount {

    public static void main(String[] args){
        double money = 12.4, price = 1.2, pricedifference = 0;
        int candies = 0;

        if(money > 0 && price > 0) {
            pricedifference = money - price;
            if (pricedifference > 0) {

                candies++;
                money = pricedifference;
            }
            else{
                System.out.println("not enough money to buy candy!");
            }
        }
        else{
            System.out.println("you don't have any money!");
        }
        System.out.println("your currnt money amount: " + money);
        System.out.println("current amount of candies you own: " + candies);
    }
}
