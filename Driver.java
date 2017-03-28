/**
 * Created by Tom on 24/01/2017.
 */
public class Driver {

    public static void main(String[] args) {
// YOUR CODE GOES HERE
        Storage<BankAccount>  aStorage = new Storage<>();
        Storage<String>       sStorage = new Storage<>();
        Class<BankAccount> baCls = BankAccount.class;
        //Class baCls = BankAccount.class;
        try {
            BankAccount myAccount = (BankAccount) baCls.newInstance();
            //BankAccount myAccount = baCls.newInstance();
            //Object myAccount =  baCls.newInstance();
            aStorage.setValue(myAccount);
// Deposit
            myAccount.deposit(15);
        }
        catch ( InstantiationException e ) {
// ...
        }
        catch ( IllegalAccessException e ) {
// ...
        }
        System.out.println( aStorage.getValue().showBalance() );
        if( aStorage.getClass() == sStorage.getClass() ) {
            System.out.println( "EQUAL" );
        } else {
            System.out.println( "NOT EQUAL" );
        }
    }
}
