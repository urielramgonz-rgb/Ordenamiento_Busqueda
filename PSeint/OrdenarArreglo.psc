Algoritmo OrdenarArreglo
	
    Definir arreglo, n, i, j, temporal Como Entero
    Definir cambio Como Logico
	
    Dimension arreglo[5]
    arreglo[1] <- 8
    arreglo[2] <- 4
    arreglo[3] <- 6
    arreglo[4] <- 2
    arreglo[5] <- 1
    
	n <- 5
    Escribir "Arreglo original:"
    Para i <- 1 Hasta n Hacer
        Escribir Sin Saltar arreglo[i], " "
    FinPara
	
    Para i <- 1 Hasta n - 1 Hacer
        cambio <- Falso
        Para j <- 1 Hasta n - 1 - i + 1 Hacer
            Si arreglo[j] > arreglo[j + 1] Entonces
                temporal <- arreglo[j]
                arreglo[j] <- arreglo[j + 1]
                arreglo[j + 1] <- temporal
                cambio <- Verdadero
            FinSi
        FinPara
        Si cambio = Falso Entonces
            i <- n
        FinSi
    FinPara
    Escribir ""
    Escribir "Arreglo ordenado:"
    Para i <- 1 Hasta n Hacer
        Escribir Sin Saltar arreglo[i], " "
    FinPara
	
FinAlgoritmo