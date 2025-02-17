package Proyecto003;
import java.util.Scanner;
public class Programa03 {
    public static void main( String[] args){
        Scanner lee=new Scanner(System.in);
        String empleado;
        double sm,ptc,c;
        int v1, v2, v3;
        
        System.out.print("Ingrese noombre de empleado: ");
        empleado=lee.next();
        System.out.print("Sueldo mensual: s/ ");
        sm=lee.nextDouble();
        System.out.print("Venta 1: s/ ");
        v1=lee.nextInt();
        System.out.print("Venta 2: s/ ");
        v2=lee.nextInt();
        System.out.print("Venta 3: s/ ");
        v3=lee.nextInt();
        c=(v1+v2+v3)*0.004;
        ptc=sm+c;
        
        System.out.println("Su sueldo total al mes es: s/" + ptc);
        
        
        
        
    }
}

    
    
