Funcion c <- espaciado ( cad )
	Definir pos Como Entero
	c = ""
	
	Para pos<-1 Hasta Longitud(cad) Hacer
		c = c + Subcadena(cad,pos, pos)+"-"
	Fin Para
	
Fin Funcion


Algoritmo espacios
	Definir cad Como Caracter
	
	Escribir "Introduce el texto:"
	Leer cad
	
	Escribir espaciado(cad)
FinAlgoritmo
