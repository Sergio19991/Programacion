Algoritmo ejercicio3
	
	Definir codigo, clave, num_intentos Como Entero
	
	codigo = 8888
	num_intentos = 0
	
	Repetir
		Escribir "Introduzca la contrseña:"
		Leer clave
		Si clave <> codigo Entonces
			Escribir "Esa no es "
			num_intentos = num_intentos+1
		FinSi
	Hasta Que clave = codigo O num_intentos = 4
	
	Si clave <> codigo Entonces
		Escribir "Has perdido. Has consumido los 4 intentos."
	SiNo
		Escribir "Has ganaddo."
	FinSi

FinAlgoritmo
	