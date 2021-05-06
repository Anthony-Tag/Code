package array_test;

public class VarArgsDemo {
    public static void main(String[] args) {
        /*
        Var Args -> Variable Arguments ...
        -> it is applicable on the parameter of any method
        -> it should and must be the last parameter
        -> only and only one parameter of the type is allowed for a method
         */
        System.out.println(helloVarArgs());
        System.out.println(helloVarArgs(3,4));

    }

    public static int helloVarArgs(int ...a){
        if (a.length==0){
            return 0;
        }else{
            int sum=0;
            for (int x:a){
                sum+=x;
            }
            return sum;
        }
    }
}
