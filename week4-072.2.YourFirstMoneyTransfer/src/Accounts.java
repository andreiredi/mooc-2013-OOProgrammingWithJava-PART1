
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
       transfer(mattAccount, myAccount, 100);
        System.out.println(mattAccount);
        System.out.println(myAccount);
    }

    public static void transfer(Account from, Account to, double howMuch ) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
