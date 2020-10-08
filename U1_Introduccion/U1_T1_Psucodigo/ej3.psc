Algoritmo ejercicio3
	
	//Nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error y volver a solicitarlo. A continuación se muestran algunos ejemplos.
		
		//La anchura de la figura siempre será de 6 caracteres.
		
	//Ejemplo 1:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 8
		//La altura introducida no es correcta
		
	//Ejemplo 2:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 3
		//La altura introducida no es correcta
		
	//Ejemplo 3:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 7
		//MMMMMM
		//M   M
		//M   M
		//MMMMMM
		//M   M
		//M   M
         //MMMMMM
	
	Definir tamano, fila, columna Como Entero
	
	Repetir
		Escribir "Por favor, introruzca la altura (número impar mayor o igual a 5)"
		Leer tamano
	Hasta Que tamano%2=1 Y tamano>=5
	
	Para fila = 0 Hasta tamano-1 Hacer
		Si (fila = 0) O (fila = trunc(tamano/2)) O (fila = tamano-1) Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M   M"
		FinSi
	Fin Para
FinAlgoritmo




     //Sergio Bejarano Arroyo.
