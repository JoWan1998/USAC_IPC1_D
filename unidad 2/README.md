# UNIDAD 2

- [Unidad 2](#unidad-2)
  - [Estructuras de control](#estructuras-de-control)
    - [Estructuras de control selectivas](#estructuras-de-control-selectivas)
      - [IF](#if)
	  - [SWITCH](#switch)
    - [Estructuras de control iterativas](#estructuras-de-control-iterativas)
      - [FOR](#for)
	  - [WHILE](#while)
	  - [DO...WHILE](#do...while)


## ESTRUCTURAS DE CONTROL

Son aquellas que controlan y manipulan las instrucciones y comportamiento de las aplicaciones.

**Estas se dividen en las siguientes:**

- Estructuras de control selectivas
- Estructuras de control iterativas

### ESTRUCTURAS DE CONTROL SELECTIVAS

Permiten la ejecucion de un bloque o conjunto de instrucciones conforme a un criterio o condicion.

#### IF

Ejecuta un conjunto de instrucciones si cumplen con cierta condicion, por lo cual unicamente se ejecuta entorno a 2 alternativas especificas (True, False).

```JAVA
if(condicion==true) {
	//Ejecuta esta instruccion si la condicion es verdadera
}
```

Opcionalmente, se puede utilizar un conjunto de instrucciones que se ejecutan si en dado caso el criterio no se cumple
```JAVA
if(condicion==true) {
	//Ejecuta esta instruccion si la condicion es verdadera
}
else {
	//Se ejecuta si el criterio anterior no se cumple
}
```

Adicionalmente, se puede ejecutar un conjunto de instrucciones para criterios variados
```JAVA
if(condicion==true) {
	//Ejecuta esta instruccion si la condicion es verdadera
}
else if(condicion1==true){
	//Ejecuta esta instruccion si la condicion anterior no se cumple, y si cumple con su condicion.
}
else {
	//Se ejecuta si el criterio anterior no se cumple
}
```

#### SWITCH

Esta instruccion se ejecuta conforme a un conjunto de multiples opciones, en la cual se opera unicamente en valores puntuales.

```JAVA
switch(x)
{
  case 1:
		//se ejecuta si en este caso x -> 1
	  break;
  case 2:
		//se ejecuta si en este caso x -> 2
	  break;
  default:
		//se ejecuta si en este caso x no cumple con ninguno de los otros criterios
	  break;
}
```

### ESTRUCTURAS DE CONTROL ITERATIVAS

Permiten la ejecucion de un bloque o conjunto de instrucciones de forma repetitiva, conforme el flujo de las operaciones o cumpliendo cierto criterio o condicion.

#### FOR

Esta sentencia se utiliza como un ciclo de ejecución, en el cual se ejecuta un numero determinado de veces dentro de su ciclo de ejecución.

```JAVA
for(int a=0; a<15; a++)
{
  //Se ejecutara mientras se cumple con el criterio que evalua dentro de su flujo en este caso a<15
}
```

Aunque existe otro modo de representar un ciclo, en cuanto se recorre un conjunto de arreglos.
```JAVA
for(String value: arreglo)
{
  //Se ejecutara recorriendo todos los valores del arreglo
}
```

#### WHILE

Esta sentencia se utiliza como un ciclo de ejecución, en el cual al cumplirse cierta condición repetirá los bloques hasta que esta deje de cumplir con la misma

```JAVA
while(condicion)
{
  //se ejecutara mientras la condicion sea verdadera o se cumple con el criterio
}
```

#### DO...WHILE

Esta sentencia se utiliza como un ciclo de ejecución, en el cual se ejecuta para desarrollar un conjunto de instrucciones al menos una vez o varias veces

```JAVA
do
{
  //se ejecuta una primera vez, y se repetira mientras se cumple con el criterio o condicion.
  
} while(condicion);
```