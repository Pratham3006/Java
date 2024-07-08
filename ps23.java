public class ps23 {
    public static void main(String[] args) {
        System.out.println(cal(6));

    }
    public static float cal(int a){
        float area=0;
        double y=Math.PI/6;

        area= (float) ((6*Math.pow(a,2))/(4*Math.tan(y)));
        return area;

    }
}
