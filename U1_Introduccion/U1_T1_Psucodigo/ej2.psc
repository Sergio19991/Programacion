Algoritmo ejercicio2
	
	//Escribe un programa que si le pasamos un entero nos devuelva ese entero al rev�s
		
	//Ejemplo:
		
	//Por favor, introduzca un n�mero entero positivo: 123456
		//El n�mero resultante es 654321
		
	//NOTA: No se pueden utilizar funciones de texto de PseInt.
	
	Definir num, unidad, reverso Como Real
	Escribir "Por favor, introduzca un n�mero entero positivo:"
	Leer num
	
	reverso=0
	Mientras num>0 Hacer
		unidad=num%10
		num=num-unidad
		num=num/10
		reverso=reverso*10+unidad
	FinMientras
	
	Escribir "EL n�mero resultante es ", reverso
	
FinAlgoritmo




     //Sergio Bejarano Arroyo.
