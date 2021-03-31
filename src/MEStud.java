
public class MEStud extends EngStud {

    String rtopic;

    public void setRTopic(String rtopic) {
        this.rtopic = rtopic;
    }

    public void showRTopic() {
        System.out.println("Research Topic    : " + rtopic);
    }

    public static void main(String[] args) {

        MEStud s=new MEStud();
        s.setPerInfo(1001, "PQR");
        s.setEngInfo("Mech",2);
        s.setRTopic("CNC-Machines");
        s.showPerInfo();
        s.showEngInfo();
        s.showRTopic();
        
    }
}
