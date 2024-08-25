public class CWH_59_Polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new SmartPhone2();
        cam1.recordVideo();

    }
}

interface Camera2{
    void takeSnap();
    void recordVideo();
}

interface wifi2{
    String [] getNetwork();
    void connectNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
//    void takeSnap(){
//        System.out.println("Taking Snap");
//    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone2 extends MyCellPhone2 implements Camera2, wifi2{
    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String [] getNetwork(){
        System.out.println("Getting the network");
        String [] networks = {"Arti", "Atharv", "Anaya"};
        return networks;
    }

    public void connectNetwork(String network){
        System.out.println("Connecting... to "+network);
    }





}