package javass;
public class atividade3 {


    static int m1(int x, int y) {
        return x + y;                // soma os dois  
    }

    
    static double m1(double x, double y) {
        return x * y;                 // multiplica dois números 
    }

    public static void main(String[] args) {

        int a = m1(20, 3); 
                         // 20 e 3 são inteiros : chama m1(int, int)
                         // que dá 20 + 3 = 23

        double b = m1(3.56, 1.01); 
        //mesmo coisa da de cima
        // 3.56 e 1.01 são double :: chama m1(double, double)
        // ai ele faz: 3.56 * 1.01 = 3.5956

        System.out.println("int: " + a);     
        // ele printa int: o resultado que é :23

        System.out.println("double: " + b);  

        // printa de novo o resultado, so que o do double: 3.5956
    }
}
