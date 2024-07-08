public class ps18 {
    public static void main(String[] args) {
        //binary to oct//
        String binary = "101011";
        int dec=Integer.parseInt(binary,2);
        String oct=Integer.toOctalString(dec);
        System.out.println(oct);
    }
}
