public
class Main {
    public static
    void main(String[] args) {

        int startingScore = 100;
        int sumReplenishment = 2000;


        //  int bonus;
        //  if (sumReplenishment > 1001) {
        //      bonus = sumReplenishment / 100;
        // } else {
        //     bonus = 0;
        // }
        
        int bonus = sumReplenishment > 1001 ? sumReplenishment / 100 : 0;

        int balance = sumReplenishment + startingScore + bonus;

        System.out.println((bonus) + " бонусов");
        System.out.println((balance) + " баланс счета");


    }
}

