
import java.util.Arrays;

public class ps{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swap(4,5)));
        
    }
    public static int[] swap(int a, int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        return new int[] {a,b};
    }
}