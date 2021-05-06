package inheritacnce_demo;

public class WhatsAppV2 extends WhatsAppV1{

    public void videoCalling(){
        System.out.println("Video calling feature from V2");
    }
    public void groupMessages() {
        System.out.println("Create groups and send messages to the group from V2");
    }
    public WhatsAppV2(){
        System.out.println("V2 was called");
    }
}
