Algoritmo actividad4

	Definir num Como Real
	Definir op Como Entero
	
	Escribir "Introduce un N�mero:"
	Leer num
	
	Escribir "Elige una opci�n:"
	
	Escribir "          Opci�n 1   -->   Calcular el valor absoluto."
	Escribir "          Opci�n 2   -->   Calcular la ra�z cuadrada."
	Escribir "          Opci�n 3   -->   Calcular el cuadrado."
	
	Leer op
	
	Segun op Hacer
		1:
			Escribir "El resultado es ", abs(num), "."
		2:
			Escribir "El resultado es ", rc(num), "."
		3:
			Escribir "El resultado es ", num^2, "."
		De Otro Modo:
			Escribir "Opci�n incorecta."
	Fin Segun
	
FinAlgoritmo
