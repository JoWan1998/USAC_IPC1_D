/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

/**
 *
 * @author jose_
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Ejemplos ejemplos = new Ejemplos();
		ejemplos.procedimiento1();
		ejemplos.procedimiento2(1);
		int valor = ejemplos.funcion1();
		System.out.println(valor);
		int suma = ejemplos.funcion_suma(5,5);
		System.out.println(suma);
    }
	
	public void procedimiento1()
	{
		/*
			Este procedimiento se ejecutara al ser llamado desde el codigo principal, o en otros procedimientos o funciones
		*/
		
		System.out.println("Esto es un procedimiento");
		
		int[] arreglo = {0,1,2,3,4,5,6,7,8,9};
		//Se ejecutara recorriendo todos los espacios del arreglo, es decir el tamaño del arreglo
		for(int value: arreglo)
		{
			System.out.println(value);
		}
	}
	
	public void procedimiento2(int a)
	{
		/*
			Este procedimiento se ejecutara al ser llamado desde el codigo principal, este posee parametros, o en otros procedimientos o funciones
		*/
		
		System.out.println("Esto es un procedimiento, el cual le hemos enviado el siguiente valor como parametro, por medio de la variable a: " + a);
		
		int[] arreglo = {0,1,2,3,4,5,6,7,8,9};
		//Se ejecutara recorriendo todos los espacios del arreglo, es decir el tamaño del arreglo
		for(int value: arreglo)
		{
			System.out.println(value);
		}
	}
	
	public int funcion1()
	{
		/*
			Esta funcion, es identica a la operacion de un procedimiento con la diferencias que estas retornan un valor que forma parte entre el tipo de dato definido.
		*/
		System.out.println("Esto es una funcion");
		return 1;
	}
	
	public int funcion_suma(int a, int b)
	{
		/*
			Esta funcion, es identica a la operacion de un procedimiento con la diferencias que estas retornan un valor que forma parte entre el tipo de dato definido.
		*/
		System.out.println("Esto es una funcion, el cual le hemos enviado los siguientes valores como parametros, por medio de la variable a: " + a +", b: " + b);
		return a + b;
	}
    
}
