Algoritmo Ejercicio8_8b
	
	Definir ancho, alto Como Entero
	Definir asterisco Como Caracter
	
	Escribir "Introdce la cantidad de Filas:"
	Leer alto
	
	ancho = 1
	asterisco = ""
	
	Mientras ancho <= alto Hacer
		asterisco = Concatenar(asterisco, "*")
		ancho = ancho + 1
		Escribir asterisco
	FinMientras
	
FinAlgoritmo
