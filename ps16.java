public class ps16 {
    public static void main(String[] args) {
        System.out.println(oct("745"));

    }
    //octal to decimal//
    public static int oct(String a){
        int x=Integer.parseInt(a,8);
        return x;
    }
}
