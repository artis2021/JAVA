public class CWH_57_Interface {
    public static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        String [] arr = ms.getNetwork();
        for(String x: arr){
            System.out.println(x);
        }
    }
}

interface Camera{
    void takeSnap();
    void recordVideo();
}

interface wifi{
    String [] getNetwork();
    void connectNetwork(String network);
}

class MyCellPhone{
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

class SmartPhone extends MyCellPhone implements Camera, wifi{
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