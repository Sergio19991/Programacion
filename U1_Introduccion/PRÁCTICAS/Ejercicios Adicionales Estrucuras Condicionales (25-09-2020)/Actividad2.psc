Algoritmo actividad2

	Definir seg Como Entero
	Definir h, min Como Entero
	
	Escribir "Introduza el número de segundos"
	Leer seg
	
	h<-trunc(seg/3600)
	
	min = trunc((seg - (h*3600))/60)
	
	Escribir seg, " segundos son ", h, " horas y ", min, " minutos."

FinAlgoritmo
