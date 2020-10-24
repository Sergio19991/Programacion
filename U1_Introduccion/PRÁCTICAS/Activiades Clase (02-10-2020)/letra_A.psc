Algoritmo letra_A
	
	Definir tam, fiLa, columna Como Entero
	Repetir
		Escribir "Introduce el tamaño. MAyor que 3 e impar:"
		Leer tam
	Hasta Que tam>=3 Y tam%2=1
	
	Para fila<-0 Hasta tam-1 Hacer
		Si (fila=0) O (fila=trunc(tam/2))Entonces
			Escribir "XXXXX"
		SiNo
			Escribir "X   X"
		FinSi
	Fin Para
	
FinAlgoritmo
