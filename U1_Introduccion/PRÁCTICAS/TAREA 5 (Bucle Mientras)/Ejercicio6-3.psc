Algoritmo Ejercicio6_3
	
	Definir n1,n2,result Como Entero
	
	n1 = azar(101)
	n2 = azar(101)
	
	
	Escribir "Suma es ", n1+n2
	
	Escribir "Adivine la suma"
	Leer result
	
	//Escribir "�Cu�nto suman?:"
	//leer result
	
	Mientras result <> n1+n2 Hacer
		Escribir "Uppsss, prueba otra vez"
		Escribir "Adivine la suma"
		Leer result
	FinMientras
	
	Escribir "Es correcto"
FinAlgoritmo
