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

        ///////--------------------------ESTRUCTURAS DE CONTROL SELECTIVAS
		if(true){
			System.out.println("Se ejecutara siempre ya que la condicion es true");
		}
		
		if(false)
		{
			System.out.println("No se ejecutara ya que la condicion no es verdadera");
		} else {
			System.out.println("Se ejecutara ya que la condicion anterior no se cumple");
		}
		
		int valor = 100;
		if(valor < 100) {
			System.out.println("No se ejecutara ya que 100 < 100, no es verdadera");
		} else if(valor <= 100) {
			System.out.println("Se ejecutara ya que valor <= 100, es verdadera");
		} else {
			System.out.println("No se ejecutara ya que la condicion anterior si se cumple");
		}
		
		switch(valor) {
			case 1:
				System.out.println("Se ejecutara siempre y cuando el valor ingresado sea 1");
			break;
			case 100:
				System.out.println("Se ejecutara siempre y cuando el valor ingresado sea 1");
			break;
			default:
				System.out.println("Se ejecutara siempre y cuando el valor ingresado no cumpla con ninguno de los criterios antes mencionados");
			break;
		}
		
		
		///////--------------------------ESTRUCTURAS DE CONTROL ITERATIVAS
		for(int a=0; a<15; a++)
		{
			System.out.println("Se ejecutara siempre y cuando a<15");
			System.out.println("No. " + a);
		}
		
		
		int[] arreglo = {0,1,2,3,4,5,6,7,8,9};
		//Se ejecutara recorriendo todos los espacios del arreglo, es decir el tamaño del arreglo
		for(int value: arreglo)
		{
			System.out.println(value);
		}
		
		boolean condicion = true;
		while(condicion)
		{
			System.out.println("Se ejecutara siempre y cuando condicion -> verdadera");
			condicion = false;
		}
		
		condicion = true;
		do{
			System.out.println("Se ejecutara una primera vez, luego se ejecutara siempre y cuando condicion -> verdadera");
			condicion = false;
		}while(condicion);
    }
    
}
