Algoritmo fecla_derecha
	
	Definir tam, fila, columna Como Entero
	
	Repetir
		Escribir "Introduce el tamaño de la flecha:"
		Leer tam
	Hasta Que tam%2=1
	
	Para fila<-1 Hasta tam Hacer
		Para columna<-1 Hasta fila Hacer
			Escribir Sin Saltar "*"
		Fin Para
		
		Escribir " "
		
	Fin Para
	
FinAlgoritmo
