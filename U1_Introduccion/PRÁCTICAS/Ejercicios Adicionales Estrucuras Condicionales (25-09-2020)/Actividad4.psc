Algoritmo actividad4

	Definir num Como Real
	Definir op Como Entero
	
	Escribir "Introduce un Número:"
	Leer num
	
	Escribir "Elige una opción:"
	
	Escribir "          Opción 1   -->   Calcular el valor absoluto."
	Escribir "          Opción 2   -->   Calcular la raíz cuadrada."
	Escribir "          Opción 3   -->   Calcular el cuadrado."
	
	Leer op
	
	Segun op Hacer
		1:
			Escribir "El resultado es ", abs(num), "."
		2:
			Escribir "El resultado es ", rc(num), "."
		3:
			Escribir "El resultado es ", num^2, "."
		De Otro Modo:
			Escribir "Opción incorecta."
	Fin Segun
	
FinAlgoritmo
