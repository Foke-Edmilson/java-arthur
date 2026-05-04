package javass;
 public class atividade1 {
    public static void main(String[] args) {
        double x = 10.5, y = 12.8;
        double z = run(x, y);
        System.out.println(z);
    }
    public static double run(double x, double y) {
        return Math.round(x + y);
    }
}


 