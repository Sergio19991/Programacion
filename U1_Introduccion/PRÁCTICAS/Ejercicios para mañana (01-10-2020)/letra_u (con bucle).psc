Algoritmo letra_U_con_bucle
	
	Definir tam,f,c Como Entero
	
	Escribir "Introduce el tamaño de la U"
	Leer tam
	
	Para f<-1 Hasta tam Hacer
	  Para c<-1 Hasta 5  Hacer
			SI f<>tam Entonces
				SI c=1 O c=5 Entonces
					Escribir sin saltar"*" 
				SINO 
					Escribir Sin Saltar " "
				FinSi	
			SiNo
				SI c=1 O C=5 Entonces
					Escribir Sin Saltar " "
				SiNo
					Escribir sin saltar "*"
				FinSi				
			FinSi
		Fin Para		
		Escribir ""
	Fin Para	
	
FinAlgoritmo
