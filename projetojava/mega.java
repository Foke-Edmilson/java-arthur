import java.util.ArrayList;
import java.util.Random;

public class mega {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random gerador = new Random();
        
        
        while (numeros.size() < 6) {
            int numero = gerador.nextInt(60) + 1; 
           
            if (!numeros.contains(numero)) {
                numeros.add(numero); 
            }
        }
        
        numeros.sort(null);
       
        System.out.println("Números da Mega-Sena:" + numeros);
    } 
}