
import java.util.Scanner;
/**
 * Encontrar la distancia entre dos ciudades a partir de la latitud y longitud
 * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: t1,g1(ciudad 1 latitud, longitud)
        //t2, g2 (ciudad 2 latitud, longitud)
        // 1. Definicion de variables
        double t1, g1, t2, g2;
        // Datos de salida
        double distancia;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese latitud de la ciudad 1");
        t1 = teclado.nextDouble();
        System.out.print("Ingrese longitud de la ciudad 1:");
        g1 = teclado.nextDouble();
        System.out.print("Ingrese latitud de la ciudad 2");
        t2 = teclado.nextDouble();
        System.out.print("Ingrese longitud de la ciudad 2:");
        g2 = teclado.nextDouble();
        
        
        // 2. Realizar calculos
        distancia = 6371.07 * (Math.acos(Math.sin(t1))) * Math.sin(t2) + Math.cos(t1) * Math.cos(t2) * (Math.cos(g1 - g2));
        // Las funciones matematicas vienen definidas en la clase Math
        // Se deben llamar de la siguiente forma Math.funcion(argumentos)
        Math.abs(distancia); // como hay latitudes y longitudes negativas el resultado  a veces da
        //negativo con el valor absoluto se vuelve positvo
        
        
        // 3. Mostrar datos de salida
        System.out.println("La distancia entre las dos ciudades es de:" + Math.abs(distancia) + "Km");
        
                                 
      
         
  } //Fin de la clase principal
}