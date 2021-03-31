
class X {
    public X(){
        System.out.println("X-0");
    }
    public X(int p){
        System.out.println("X-1");
    }
    public X(int p,int q){
        System.out.println("X-2");
    }
    public X(int p, int q, int r){
        System.out.println("X-3");
    }
}

class Y extends X {
    public Y(){
        super(1,2);
        System.out.println("Y-0");
    }
    public Y(int p){
        super(1,2,3);
        System.out.println("Y-1");
    }
    public Y(int a, int b){
        super(1);
        System.out.println("Y-2");
    }
    public Y(int a, int b, int c){
        System.out.println("Y-3");
    }
}

public class SuperExampleTwo {

    public static void main(String[] args) {
        Y ob=new Y(10,20,30);
    }
}
