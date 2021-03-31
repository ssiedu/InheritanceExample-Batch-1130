package p2;
public class NonChildOutsidePkg {
    public void demo(){
        p1.Owner ob=new p1.Owner();
        System.out.println(ob.a);
        //System.out.println(ob.b);
       //System.out.println(ob.c);
        //System.out.println(ob.d);
    }
}

