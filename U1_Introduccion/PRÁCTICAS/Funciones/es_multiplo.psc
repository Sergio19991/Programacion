Funcion v <- esmultiplo ( num1, num2 )
	Si num1%num2=0 Entonces
		v=Verdadero
	SiNo
		v=FAlso
	FinSi
Fin Funcion



Algoritmo func_es_multiplo
	Definir n1, n2 Como Entero
	
	Escribir "Introduce los dos n�meros:"
	Leer n1, n2
	
	Si esmultiplo(n1,n2) Entonces
		Escribir n1, " es m�ltiplo de ", n2
	SiNo
		Escribir n1, " no es m�ltiplo de ", n2
	FinSi
FinAlgoritmo
	