Algoritmo ejercicio4
	
	//Realiza un programa que calcule el m�ximo, el m�nimo y la media de una serie de n�meros enteros positivos introducidos por teclado. El programa terminar� cuando el usuario introduzca un n�mero primo. 
	//Este �ltimo n�mero no se tendr� en cuenta en los c�lculos. El programa debe indicar tambi�n cu�ntos n�meros ha introducido el usuario (sin contar el primo que sirve para salir).
		
	//Ejemplo:
		//Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero primo:
			//6
			//8
			//15
			//12
			//23
			//Ha introducido 4 n�meros no primos.
		//M�ximo: 15
		//M�nimo: 6
		//Media: 10.25
	
	Definir num1, num2, num3, num4, num5 Como Entero
	
	Escribir "Por favor, vaya introduciendo enteros positivos. Para terminar, introduzca un n�mero primo:"
	Leer num1, num2, num3, num3, num5 
	
	Si num1 > num2 Y  num1 > num3 Y  num1 > num4 Y  num1 > num5 Entonces
		Escribir "M�ximo: ", num1
	FinSi
	
	Si num2 > num1 Y  num2 > num3 Y  num2 > num4 Y  num2 > num5 Entonces
		Escribir "M�ximo: ", num2
	FinSi
	
	Si num3 > num1 Y  num3 > num2 Y  num3 > num4 Y  num3 > num5 Entonces
		Escribir "M�ximo: ", num3
	FinSi
	
	Si num4 > num1 Y  num4 > num2 Y  num4 > num3 Y  num4 > num5 Entonces
		Escribir "M�ximo: ", num4
	FinSi
	
	Si num5 > num1 Y  num5 > num2 Y  num5 > num3 Y  num5 > num4 Entonces
		Escribir "M�ximo: ", num5
	FinSi
	
	Si num1 < num2 Y  num1 < num3 Y  num1 < num4 Y  num1 < num5 Entonces
		Escribir "M�nimo: ", num1
	FinSi
	
	Si num2 < num1 Y  num2 < num3 Y  num2 < num4 Y  num2 < num5 Entonces
		Escribir "M�nimo: ", num2
	FinSi
	
	Si num3 < num1 Y  num3 < num2 Y  num3 < num4 Y  num3 < num5 Entonces
		Escribir "M�nimo: ", num3
	FinSi
	
	Si num4 < num1 Y  num4 < num2 Y  num4 < num3 Y  num4 < num5 Entonces
		Escribir "M�nimo: ", num4
	FinSi
	
	Si num5 < num1 Y  num5 < num2 Y  num5 < num3 Y  num5 < num4 Entonces
		Escribir "M�nimo: ", num5
	FinSi
	
	Escribir "Media: ", (num1+num2+num3+num3+num5)/5
FinAlgoritmo




     //Sergio Bejarano Arroyo.
