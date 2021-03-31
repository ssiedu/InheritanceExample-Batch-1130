public class Stud {
    int rno;
    String name;
    private int PASSING_MARKS=33;
    
    public final void result(int per){
        
        if(per>=PASSING_MARKS){
            System.out.println("Student Passed....");
        }else{
            System.out.println("Student Failed....");
        }
    }
    public void info(){
        System.out.println("Some Info From Student....");
    }
    
    public void setPerInfo(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public void showPerInfo(){
        System.out.println("Roll No : "+rno);
        System.out.println("Name    : "+name);
    }
    public String toString(){
        return "hello";
    }
}
