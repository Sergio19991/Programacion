Funcion d <- numDivisores ( n )
	Definir c, d Como Entero
	d = 0
	
	Para c<-1 Hasta n Hacer
		Si n%c = 0 Entonces
			Escribir c, " es Divisor."
			d = d + 1
		FinSi
	Fin Para
	
Fin Funcion


Algoritmo divisores
	Definir num, c Como Entero
	
	Repetir
		Escribir "Introduce el n�mero. ESnero positivo:"
		Leer num
	Hasta Que num>0
	
	c = numDivisores(num)
	Escribir num, " tiene ", c
	
FinAlgoritmo
	