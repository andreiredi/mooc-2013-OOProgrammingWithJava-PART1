public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        } else {

        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;

        } else {

        }
    }

    public void loadMoney(double amount) {
       if(this.balance<150 && amount  > 0) {
           this.balance += amount;

           if (this.balance >= 150) {
               this.balance = 150.0;
           }
       }


    }



    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
