Algoritmo ejercicio1
	Definir horas_trabajadas Como Entero
	
	Escribir "Introduce las horas trabajadas:"
	Leer horas_trabajadas
	
	Si horas_trabajadas <= 40 Entonces
		Escribir "El sueldo es de ",(horas_trabajadas * 10)
	SiNo
		Escribir "El sueldo es de ",(400 + ( (horas_trabajadas - 40) * 15) );
	Fin Si
	
FinAlgoritmo
