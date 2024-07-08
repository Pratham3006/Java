public class ps19 {
    public static void main(String[] args) {
        String octal = "53";
        int dec=Integer.parseInt(octal,8);
        System.out.println(dec);
        String binary=Integer.toBinaryString(dec);
        System.out.println(binary);
        String oct=Integer.toHexString(dec);
        System.out.println(oct);
    }
}
