public class Palindrome {
    public static void main(String[] args) {
        int m=100;
        String q=Integer.toString(m);
        StringBuilder sb=new StringBuilder(q);
        System.out.println(sb.reverse().toString()==q);
    }
}
