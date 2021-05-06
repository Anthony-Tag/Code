package example1;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = 100;// i holds the address of 100
        System.out.println("i = "+i);
        System.out.println(System.identityHashCode(i));//get memory address of any Java Object


        String s = "235";
        Long l= Long.parseLong(s);
        System.out.println("l = "+l);
        Float f = Float.parseFloat(s);
        System.out.println("f= "+f);
        Double d = Double.parseDouble(s);
        System.out.println("d = "+d);
        s = s +l + f + d;
        System.out.println(s);

        //byte short int     long float double char      boolean
        //Byte Short Integer Long Float Double Character Boolean
    }
}
