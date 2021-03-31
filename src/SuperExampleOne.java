
class A {

    int data = 100;
    void info(){
        System.out.println("Info of A...");
    }
}

class B extends A {

    int data = 200;
    
    void info(){
        System.out.println("Info of B...");
    }
    
    void show() {
        info();
        super.info();
        /*
        int data=300;
        System.out.println("Only Data  : " + data);
        System.out.println("This.Data  : " + this.data);
        System.out.println("Super.Data : " + super.data);
        */
    }
}

public class SuperExampleOne {

    public static void main(String[] args) {
        B ob=new B();
        ob.show();
    }

}
