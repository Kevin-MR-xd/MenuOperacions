/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenuOperaciones;
import java.util.Scanner;
/**
 *
 * @author SAC2-8
 */
public class Numeros {
    public void menu(){
    Scanner pro = new Scanner(System.in);
    int opcion;
    double n1 = 0,n2 = 0;
    
                System.out.println("Seleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                opcion = pro.nextInt();
                Funciones input = new Funciones(); 
                switch (opcion) {
                    
                    case 1:
                        input.suma(n1, n2);
                        input.resultado();
                        break;
                    case 2:
                        input.resta(n1, n2);
                        input.resultado();
                        break;
                    case 3:
                        input.multiplicacion(n1, n2);
                        input.resultado();
                        break;
                    case 14:
                        input.division(n1, n2);
                        input.resultado();
                        break;
                    default:
                        System.out.println("Esa opción no es valida");
                        
                }
}
}
