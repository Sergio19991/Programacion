Algoritmo multiplos_de_8
	
	//Solicitar al usuario un número entero y encontrar a partir de ese número los 10 primeros multiplos de 8
	
	Definir num, multiplos Como Entero
	
	Escribir "Introduzca el número inicial"
	Leer num
	
	multiplos = 0
	
	Mientras multiplos <= 10
		
		Si num%8 = 0 Entonces
			multiplos = multiplos+1
			Escribir num, " es múltiplo de 8"
		FinSi
		
		num = num + 1
	FinMientras
	
FinAlgoritmo




     //Sergio Bejarano Arroyo.
