public class ps10{
    public static void main(String[] args) {
        System.out.println(Bin("10", "11"));
        
    }
    public static String Bin(String a,String b){
        int c=Integer.parseInt(a,2);
        int d=Integer.parseInt(b,2);
        int mul=c*d;
        return Integer.toBinaryString(mul);

    }
}