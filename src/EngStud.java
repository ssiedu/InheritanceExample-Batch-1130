
public class EngStud extends Stud {

    String branch;
    int sem;

    public void info(final int n){
        System.out.println("Some Number  : "+n);
        //n++;
        System.out.println("Some Number After Change "+n);
    }
    
    public void setEngInfo(String branch, int sem) {
        this.branch = branch;
        this.sem = sem;
    }

    public void showEngInfo() {
        System.out.println("Branch  : " + branch);
        System.out.println("Semester: " + sem);
    }

    public static void main(String[] args) {
        EngStud s=new EngStud();
        s.setPerInfo(111, "AAA");
        s.setEngInfo("CS", 3);
        s.showPerInfo();
        s.showEngInfo();
        s.result(45);
        s.info(10);
    }
}
