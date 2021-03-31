
public class MediStud extends Stud {

    String spec;
    int prof;

    /*
    public void result(int per){
        if(per>=50){
            System.out.println("Medi Student Passed....");
        }else{
            System.out.println("Medi Student Failed....");
        }
    }
    */
    public void setMediInfo(String spec, int prof) {
        this.spec = spec;
        this.prof = prof;
    }

    public void showMediInfo() {
        System.out.println("Specialization  : " + spec);
        System.out.println("Prof            : " + prof);
    }

    public static void main(String[] args) {

        MediStud s=new MediStud();
        s.setPerInfo(501, "XYZ");
        s.setMediInfo("Ortho", 2);
        s.showPerInfo();
        s.showMediInfo();
        s.result(48);
    }
}
