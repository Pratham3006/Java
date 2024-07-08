

public class ps11 {
    public static void main(String[] args) {

        System.out.println(Coverter("5"));
    }
    public static String Coverter(String a){
        int x=Integer.parseInt(a);
        return Integer.toBinaryString(x);
    }
    
}
