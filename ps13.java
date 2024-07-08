public class ps13 {
    public static void main(String[] args) {
        System.out.println(conv("15"));

    }
    public static String conv(String a){
        int x=Integer.parseInt(a);
        return Integer.toOctalString(x);
    }
}
