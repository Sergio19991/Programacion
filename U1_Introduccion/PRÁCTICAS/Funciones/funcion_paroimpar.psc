Funcion V <- espar ( n )
	Si n%2=0 Entonces
		v=Verdadero
	SiNo
		v=Falso
	FinSi
	
Fin Funcion



Proceso par
	Definir num Como Entero
	Definir v Como Entero
	
	Escribir "Introduce el n�mero:"
	Leer num
	
	Si espar(num) Entonces
		Escribir "El n�mero es PAR"
	SiNo
		Escribir "El n�mero es IMPAR"
	FinSi
FinProceso
