
public class InterfaceExample {

    public static void main(String[] args) {

        BankAccount ac1,ac2;
        
        ac1=new SBIAccount();
        ac2=new HDFCAccount();
        
        ac1.openAccount();ac1.interest();ac1.closeAccount();
        
        ac2.openAccount();ac2.interest();ac2.closeAccount();
        
    }
}
