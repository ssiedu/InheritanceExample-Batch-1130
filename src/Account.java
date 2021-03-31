public class Account {
    
    private int ano;
    private String name;
    private int bal;
    
    public Account(int ano, String name, int bal){
        this.ano=ano;
        this.name=name;
        this.bal=bal;
    }
    public void info(){
        System.out.println("Account No. : "+ano);
        System.out.println("Cust Name   : "+name);
        System.out.println("Balance     : "+bal);
    }
    
}
