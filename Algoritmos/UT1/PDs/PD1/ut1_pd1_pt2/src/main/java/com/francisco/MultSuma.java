package com.francisco;
//UT1 - PD1 - Ej3
public class MultSuma 
{
    private static void MultSuma(Double a, Double b, Double c){
        double resultado = a*b + c;
        System.out.println("Resultado: " + resultado);
    }
    public static void main( String[] args )
    {
        System.out.println( "EJercicio 3) ");
        MultSuma(1.0, 2.0, 3.0); 
        MultSuma(2.5, 4.0, 1.5); 
        MultSuma(0.0, 10.0, 5.0); 
    }
}
