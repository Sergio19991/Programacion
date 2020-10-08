Algoritmo ejercicio1
	
	//Escribe un algoritmo que calcule el precio de un pedido de cierto producto la cantidad de producto que solicita el cliente. Para aclararlo, el precio de cada unidad depende de la cantidad de
			
			//-> Las 100 primera unidades del pedido van a precio fijo. Siempre costarán 5.23€ cada una
			
			//-> Las unidades entre la 101 y la 1000 (ambas incluidas) costarán 4.16€ cada una
			
			//-> A partir de esa cantidad el precio será el 50% del precio original.
			
		//Por ejemplo:
			
		//Introduzca la cantidad de unidades: 90
		//El precio del pedido es: 470.70€
			
		//Introduzca la cantidad de unidades: 150
		//El precio del pedido es: 731€
	
	Definir cantidad Como Real
	Escribir "Introduzca la cantidad de unidades:"
	Leer cantidad
	
	Si cantidad<=100 Entonces
		Escribir "El precio del pedido es: ", (cantidad*5.23), "€"
	FinSi
	
	Si cantidad>=101 Y cantidad<=1000 Entonces
		Escribir "El precio del pedido es: ", (100*5.23) + (cantidad-100)*4.16, "€"
	FinSi
	
	Si cantidad>1000 Entonces
		Escribir "El precio del pedido es: ", (cantidad*5.23)/2, "€"
	FinSi
	
FinAlgoritmo




     //Sergio Bejarano Arroyo.
