Algoritmo ejercicio2
	
	//Escribe un programa que si le pasamos un entero nos devuelva ese entero al revés
		
	//Ejemplo:
		
	//Por favor, introduzca un número entero positivo: 123456
		//El número resultante es 654321
		
	//NOTA: No se pueden utilizar funciones de texto de PseInt.
	
	Definir num, unidad, reverso Como Real
	Escribir "Por favor, introduzca un número entero positivo:"
	Leer num
	
	reverso=0
	Mientras num>0 Hacer
		unidad=num%10
		num=num-unidad
		num=num/10
		reverso=reverso*10+unidad
	FinMientras
	
	Escribir "EL número resultante es ", reverso
	
FinAlgoritmo




     //Sergio Bejarano Arroyo.
