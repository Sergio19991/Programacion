Proceso relojArena
	
	Definir tam, fila, columna Como Entero
	
	Repetir
		Escribir "Introduce el tamaño. Mayor que 3 e Impar:"
		Leer tam
	Hasta Que tam>=3 Y tam%2=1
	
	Para fila<-0 Hasta tam-1 Hacer
		Para columna<-0 Hasta tam-1 Hacer
			Si (fila=0) O (fila=tam-1) O (columna>=fila Y fila+columna<=tam-1) O (fila+columna>=tam-1 Y columna<=fila) Entonces
				Escribir Sin Saltar "*"
			SiNo
				Escribir Sin Saltar " "
			FinSi
		Fin Para
		Escribir ""
	Fin Para
	
FinProceso
