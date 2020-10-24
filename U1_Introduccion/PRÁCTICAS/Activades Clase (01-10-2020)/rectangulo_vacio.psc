Algoritmo rectangulo_vacio
	
	Definir altura, anchura, fila, columna Como Entero
	
	Escribir "Introduce la Altura:"
	Leer altura
	Escribir "Introduce la Anchura:"
	Leer anchura
	
	Para fila<-1 Hasta altura Hacer
		Para columna<-1 Hasta anchura Hacer
			Si fila=1 O fila=altura O columna=1 O columna=anchura Entonces
				Escribir Sin Saltar"*"
			SiNo
				Escribir Sin saltar " "
			FinSi
		Fin Para
		
		Escribir ""
		
	Fin Para
	
FinAlgoritmo
