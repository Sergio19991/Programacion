Proceso cuadrados_grandes
	
	Definir tam, fila, columna Como Entero
	
	Repetir
		Escribir "Introduce el tamaño. Mayor que 3 e Impar:"
		Leer tam
	Hasta Que tam>=3 Y tam%2=1
	
	Para fila<-0 Hasta tam-1 Hacer
		Si fila%2=0 Entonces
			Escribir "XX    XX"
		SiNo
			Escribir "XXXXXXXX"
			Escribir "XXXXXXXX"
		FinSi
	Fin Para
	
FinProceso
