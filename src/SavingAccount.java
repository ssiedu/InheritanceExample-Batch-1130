
public class SavingAccount extends Account {

    private int rate;
    
    public SavingAccount(int ano, String name, int bal, int rate){
        super(ano,name,bal);
        this.rate=rate;
    }
    public void info(){
        super.info();
        System.out.println("Interest Rate   "+rate);
    }
    public static void main(String[] args) {

        SavingAccount ac=new SavingAccount(1001,"ABC",50000,8);
        ac.info();
        
        
    }
}
