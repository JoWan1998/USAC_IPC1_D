# UNIDAD 1

- [Unidad 1](#unidad-1)
  - [Tipos de Datos](#tipos-de-datos)
  - [Identificadores](#identificadores)
    - [Reglas para definir Identificadores](#reglas)
  - [Operadores](#operadores)
    - [Tipos de Operadores](#tipos-de-operadores)
    - [Precedencia de Operadores](#precedencia-de-operadores)
  - [Palabras Reservadas] (#palabras-reservadas)


## TIPOS DE DATOS

|**NOMBRE**  |**TIPO**  | **TAMAÑO**| **RANGO**|
|--|--|--|--|
| byte | Entero | 8 bits | -128 a 127 |
| short | Entero | 16 bits | -32768 a 32767 |
| int | Entero | 32 bits | -2147483648 a 2147483647 |
| long | Entero | 64 bits | -2147483648 a 2147483647 |
| float | Decimal | 32 bits | ^+-^3.40282347 x 10^38^ a ^+-^1.40239846 x 10^-45^|
| double | Decimal | 64 bits | ^+-^1.79769313 x 10^308^ a ^+-^4.9406564 x 10^-324^  |
| char | Caracter Simple | 16 bits | ----------- |
| boolean | Valor (True o False) | 1 bits | ----------- |


## IDENTIFICADORES

Nombre definido para denotar un elemento, es decir es la forma de ubicar un valor dentro del programa.

>[!TIP]
>
>Es recomendable utilizar lenguaje global para definir nuestras variables (**Ingles**)


### REGLAS

 - Únicamente se define por lenguaje alfanumérico.
 - No emplear letras especiales como ñ, letras tildadas, entre otros.
 - Se puede utilizar “_”
 - No se puede iniciar con un numero, se debe iniciar con letra o “_”


## OPERADORES

Son un conjunto de simbolos que indican y manipulan las instrucciones. Los operandos tienen una funcion en especifico
dependiendo de lo que se este ejecutando.

### TIPOS DE OPERADORES

 - Operadores aritméticos
 - Operadores unarios
 - Operador de asignación
 - Operadores relacionales
 - Operadores lógicos
 - Operador ternario
 - Operadores bit a bit
 - Operadores shift
 
#### OPERADORES ARITMETICOS

Utilizados para realizar operaciones aritmeticas.

|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\***|Multiplicacion|
|**\/**|Division|
|**\%**|Modulo|
|**\+**|Suma|
|**\-**|Resta|

#### OPERADOES UNARIOS

Unicamente necesitan un operando, se utilizan para incrementar, disminuir o negar.

|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\-**|Unario Negativo|
|**\+**|Unario Positivo|
|**\-\-** a|Pre-decremento|
|**\+\+** a|Pre-incremento|
|a **\-\-**|Post-decremento|
|a **\+\+**|Post-incremento|
|**\!** a|Negacion|

#### OPERADORES DE ASIGNACIÓN

Utilizados para definir un valor a una variable.

|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\=**|Asignación de Valor|
|**\+\=**|Asignación con suma|
|**\-\=**|Asignación con resta|
|**\/\=**|Asignación con division|
|**\*\=**|Asignación con multiplicación|
|**\%\=**|Asignación con modulo|

#### OPERADORES RELACIONALES

Utilizados para verificar relaciones que van desde la equivalencia de datos, hasta la denotacion de no igualdad.

|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\=\=**|Igualdad|
|**\!\=**|No igualdad|
|**\>**|Menor que|
|**\<**|Mayor que|
|**\>\=**|Menor o igual que|
|**\<\=**|Mayor o igual que|

#### OPERADORES LOGICOS

Estos operadores son utilizados comunmente para utilizar varias condiciones para la toma de decisiones.


|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\&\&**|AND Logico|
|**\|\|**|OR Logico|

#### OPERADORES TERNARIOS

Estos indican la operacion in-line para definir un valor conforme a dos alternativas, mediante un criterio o condicion definida.

|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\?**|Ternario|

#### OPERADORES BIT A BIT

Estos operadores se utilizan para manipular bits individuales de un numero. Se utilizan en cualquiera de los enteros.

|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\&**|Operador Bit a Bit AND|
|**\|**|Operador Bit a Bit OR|
|**\^**|Operador Bit a Bit XOR|
|**\~**|Operador Bit a Bit NOT|

#### OPERADORES SHIFT

Estos operadores se utilizan para desplazar los numeros de izquierda a derecha. Se usan regularmente para multiplicar o dividir.

|**OPERADOR**|**TIPO DE OPERACION**|
|--|--|
|**\>\>**|Desplazamiento a la derecha|
|**\<\<**|Desplazamiento a la izquierda|
|**\>\>\>**|Cambio a la derecha sin signo|

### PRECEDENCIA DE OPERADORES

Indican las reglas de asociación para la ejecución de operaciones hibridas que involucren dos o más operandos.

|**OPERADOR**|**ASOCIATIVIDAD**|
|--|--|
|**\+\+** **\-\-**|Derecha a Izquierda|
|**\+\+** **\-\-** **\+** **\-** **\!**|Derecha a Izquierda|
|**\*** **\/** **\%**|Derecha a Izquierda|
|**\+** **\/** **\-** |Derecha a Izquierda|
|**\<** **\<\=** **\>** **\>\=**|Derecha a Izquierda|
|**\=\=** **\!\=** |Derecha a Izquierda|
|**\&**|Derecha a Izquierda|
|**\^**|Derecha a Izquierda|
|**\|**|Derecha a Izquierda|
|**\&\&**|Derecha a Izquierda|
|**\|\|**|Derecha a Izquierda|
|**\?**|Derecha a Izquierda|
|**\=** **\+\=** **\-\=** **\*\=** **\/\=** **\%\=**|Derecha a Izquierda|

## PALABRAS RESERVADAS

>[!TIP]
>
> Puedes visitar el siguiente link para más información [JAVA] (https://www.ciberaula.com/cursos/java/palabras_reservadas_java.php)

 - abstract	
 - assert	
 - boolean	
 - break	
 - byte	
 - case	
 - catch	
 - char	
 - class	
 - const	
 - continue
 - default	
 - do	
 - double	
 - else	
 - enum	
 - extends	
 - false	
 - final	
 - finally	
 - float	
 - for
 - goto	
 - if	
 - implements	
 - import	
 - instanceof	
 - int	
 - interface	
 - long	
 - native	
 - new	
 - null
 - package	
 - private	
 - protected	
 - public	
 - return	
 - short	
 - static	
 - strictfp	
 - String	
 - super	
 - switch
 - synchronized	
 - this	
 - throw	
 - throws	
 - transient	
 - true	
 - try	
 - void	
 - volatile	
 - while	


