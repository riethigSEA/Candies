public class CandyCount {

    public static void main(String[] args){
        double money = 12.4, price = 1.2, pricedifference;
        int candies = 0;

        if(money > 0 && price > 0) {
            pricedifference = money - price;
            while(pricedifference > 0){
                candies++;
                money = pricedifference;
            }
        }
        else{
            System.out.println("you don't have any money!");
        }
        System.out.println("your current money amount: " + money);
        System.out.println("current amount of candies you own: " + candies);
    }
}
