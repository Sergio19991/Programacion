Algoritmo ejercicio3_intentos
	
	Definir n1,n2,result,intentos Como Entero
	
	n1 = azar(101)
	n2 = azar(101)
	
	
	Escribir "Suma es ", n1+n2
	
	Escribir "Adivine la suma"
	Leer result
	intentos = 1
	
	Mientras result <> n1+n2 Y intentos < 5 Hacer //Número de intentos que se puede hacer.
		Escribir "Uppsss, prueba otra vez"
		Escribir "Adivine la suma"
		Leer result
		intentos =intentos + 1
	FinMientras
	
	Si result = n1+n2 Entonces
		Escribir "Has acertado en ", intentos, " intentos"
	SiNo
		Escribir "Has consumido todo los intentos: ", intentos
	FinSi

FinAlgoritmo
