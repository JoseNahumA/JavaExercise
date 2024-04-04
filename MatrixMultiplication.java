package org.example;

public class MatrixMultiplication {
    public static void main(String[] args) {
        /*- Crear un programa en Java que realice la multiplicación de dos matrices.
                - Definir dos matrices como arrays bidimensionales.
                - Utilizar ciclos for anidados para recorrer cada elemento de las matrices.
        - Realizar la multiplicación de matrices siguiendo las reglas matemáticas.
        - Almacenar el resultado en una nueva matriz.
        - Mostrar la matriz resultante después de la multiplicación*/

        int row1 = 3;
        int column1 = 3;
        int row2 = 3;
        int column2 = 3;
        int[] matrix1 = {1,2,3,4,5,6,7,8,9};
        int[] matrix2 = {9,8,7,6,5,4,3,2,1};

        if (column1 != row2) {
            System.out.println("Matrices cannot be multiplied. The number " +
                    "of columns in the first matrix is not equal to the number of rows in the second matrix.");

        }
    }
}
