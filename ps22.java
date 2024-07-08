public class ps22 {
    public static void main(String[] args) {
        System.out.println(sum(129));

    }
    public static int sum(int a){
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        return sum;
    }
}
