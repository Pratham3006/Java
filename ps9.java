public class ps9{
    public static void main(String[] args) {
        System.out.println(Binary("10","11"));
        
    }
    public static String Binary(String a,String b){
        int c=Integer.parseInt(a,2);
        int d=Integer.parseInt(b,2);
        int sum=c+d;
        return Integer.toBinaryString(sum);

    }
}