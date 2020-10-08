Algoritmo ejercicio4
	
	//Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número primo. 
	//Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
		
	//Ejemplo:
		//Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:
			//6
			//8
			//15
			//12
			//23
			//Ha introducido 4 números no primos.
		//Máximo: 15
		//Mínimo: 6
		//Media: 10.25
	
	Definir num1, num2, num3, num4, num5 Como Entero
	
	Escribir "Por favor, vaya introduciendo enteros positivos. Para terminar, introduzca un número primo:"
	Leer num1, num2, num3, num3, num5 
	
	Si num1 > num2 Y  num1 > num3 Y  num1 > num4 Y  num1 > num5 Entonces
		Escribir "Máximo: ", num1
	FinSi
	
	Si num2 > num1 Y  num2 > num3 Y  num2 > num4 Y  num2 > num5 Entonces
		Escribir "Máximo: ", num2
	FinSi
	
	Si num3 > num1 Y  num3 > num2 Y  num3 > num4 Y  num3 > num5 Entonces
		Escribir "Máximo: ", num3
	FinSi
	
	Si num4 > num1 Y  num4 > num2 Y  num4 > num3 Y  num4 > num5 Entonces
		Escribir "Máximo: ", num4
	FinSi
	
	Si num5 > num1 Y  num5 > num2 Y  num5 > num3 Y  num5 > num4 Entonces
		Escribir "Máximo: ", num5
	FinSi
	
	Si num1 < num2 Y  num1 < num3 Y  num1 < num4 Y  num1 < num5 Entonces
		Escribir "Mínimo: ", num1
	FinSi
	
	Si num2 < num1 Y  num2 < num3 Y  num2 < num4 Y  num2 < num5 Entonces
		Escribir "Mínimo: ", num2
	FinSi
	
	Si num3 < num1 Y  num3 < num2 Y  num3 < num4 Y  num3 < num5 Entonces
		Escribir "Mínimo: ", num3
	FinSi
	
	Si num4 < num1 Y  num4 < num2 Y  num4 < num3 Y  num4 < num5 Entonces
		Escribir "Mínimo: ", num4
	FinSi
	
	Si num5 < num1 Y  num5 < num2 Y  num5 < num3 Y  num5 < num4 Entonces
		Escribir "Mínimo: ", num5
	FinSi
	
	Escribir "Media: ", (num1+num2+num3+num3+num5)/5
FinAlgoritmo




     //Sergio Bejarano Arroyo.
