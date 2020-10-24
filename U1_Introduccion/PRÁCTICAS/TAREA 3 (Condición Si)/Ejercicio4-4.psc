Algoritmo ejercicio4
	
	Definir num1 Como entero
	Definir num2 Como entero
	Definir num_positivos Como Entero
	
	Escribir "Introduce el primer número"
	Leer num1
	
	Escribir "Introduce el segundo número"
	Leer num2
	
	num_positivos=0
	
	SI num1 > 0 Entonces
		num_positivos = num_positivos+1
	FinSi
	
	SI num2 > 0 Entonces
		num_positivos = num_positivos+1
	FinSi
	
	Escribir "En total hay ",num_positivos, " positivos."
	
FinAlgoritmo
