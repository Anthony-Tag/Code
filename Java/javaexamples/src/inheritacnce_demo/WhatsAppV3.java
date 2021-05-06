package inheritacnce_demo;

public class WhatsAppV3 extends WhatsAppV2{

    public void sendMoney(){
        System.out.println("Send money to other WhatsApp user from V3");
    }
    public WhatsAppV3(){
        System.out.println("V3 was called");
    }
}
