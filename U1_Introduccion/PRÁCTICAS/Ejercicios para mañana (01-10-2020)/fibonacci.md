Algoritmo ejercicio4

	Definir n1, n2, tam, x, intercambio_variables Como Entero
	
	n1 = 0
	n2 = 1
	
	Repetir
		
		Escribir "Dime el tamaño de la serie"
		Leer tam
		
	Hasta Que tam>=3
	
	Escribir Sin Saltar n1, " ", n2
	
	Para x<-3 Hasta tam Hacer
		
		Escribir Sin Saltar " ", n1+n2
		intercambio_variables = n1+n2
		n1 = n2
		n2 = intercambio_variables
		
	FinPara
	
FinAlgoritmo
