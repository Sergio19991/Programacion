Proceso doble_cuadrado
	
	Definir tam, fila, columna Como Entero
	Repetir
		Escribir "Introduce el tamo. Mayor que 3 e Impar:"
		Leer tam
	Hasta Que tam>=3 Y tam%2=1
	
	Para fila<-0 Hasta tam-1 Hacer
		Si fila%2=0 Entonces
			Escribir "XXXXXX"
		SiNo
			Escribir "X----X"
		FinSi
	Fin Para
FinProceso
