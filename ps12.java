public class ps12 {
    public static void main(String[] args) {
        System.out.println(conv("255"));
    }
    public static String conv(String a){
        int x=Integer.parseInt(a);
        return Integer.toHexString(x);
    }
}
