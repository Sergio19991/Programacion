Algoritmo ejercicio3
	
	Definir dividendo Como Entero
	Definir divisor Como Entero
		
		Escribir "Introduce el Dividendo:"
		Leer dividendo
		
		Repetir
			Escribir "Introduce el Divisor:"
			Leer divisor
			
			Si divisor = 0 Entonces
				Escribir "El Divisor no debe ser 0."
			FinSi
			
		Hasta Que divisor <> 0
		
		Escribir dividendo, " entre ", divisor, " es igual a ", dividendo/divisor, "."
	
FinAlgoritmo
