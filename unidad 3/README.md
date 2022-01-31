# UNIDAD 3

- [Unidad 3](#unidad-3)
  - [Parametros](#parametros)
  - [Procedimientos](#procedimiento)
  - [Funciones](#funcion)  
  


## PARAMETROS

Toda funcion de parametros puede o no contener parametros, basicamente un parámetro en si es un objeto o valor que sirve como entrada o sirve para la ejecución y construcción de un valor como salida.
Estos parametros pueden o no estar presentes en la definición de los procedimientos o funciones, y estan ligados a un tipo de dato según sea la necesidad.

## PROCEDIMIENTO

Un procedimiento, o método es un conjunto de instrucciones como un mini programa que se ejecuta dentro de un programa, a solicitud.

```JAVA
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
```

## FUNCION

Una función es un conjunto de instrucciones como un mini programa que se ejecuta dentro de un programa, a solicitud, las cuales a diferencia de los métodos nos retornaran un valor conforme al tipo de dato que representa.

```JAVA
public int funcion1()
{
	/*
		Esta funcion, es identica a la operacion de un procedimiento con la diferencias que estas retornan un valor que forma parte entre el tipo de dato definido.
	*/
	System.out.println("Esto es una funcion");
	return 1;
}
```