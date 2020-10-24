Algoritmo rectangulo_con_diagonales
	
	Definir altura, f, c Como Entero
	
	Repetir
		Escribir "Introduce la altura: Impar y mayor que 5"
		Leer altura
	Hasta Que altura>=5 Y altura%2=1
	
	Para f<-1 Hasta altura Hacer
		Para c<-1 Hasta altura Hacer
			Si f=1 O f=altura O c=1 O c=altura O f=c O f+c = altura+1 Entonces
				Escribir Sin Saltar"*"
			SiNo
				Escribir Sin Saltar " "
			FinSi
		Fin Para
		
		Escribir ""
		
	Fin Para
	
FinAlgoritmo
