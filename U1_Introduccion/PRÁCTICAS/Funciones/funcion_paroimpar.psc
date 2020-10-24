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
	
	Escribir "Introduce el número:"
	Leer num
	
	Si espar(num) Entonces
		Escribir "El número es PAR"
	SiNo
		Escribir "El número es IMPAR"
	FinSi
FinProceso
