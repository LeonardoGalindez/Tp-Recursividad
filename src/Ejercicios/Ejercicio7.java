/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int suma, fila, colum;
        fila = 0;
        colum = 0;
        int[][] Numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int []Fila= new int [Numeros[0].length];
        System.out.println("");
        System.out.println(SumaMatriz(fila, colum, Numeros,Fila));
    }

    public static int SumaFila(int c,int [] Array){
        int suma;
        suma=0;
        if(c>=0){
            
            suma=Array[c]+SumaFila(c-1,Array);
        }else{
            
        }
        return suma;
    }
//otro modulo suma de columas
    //Algoritmo recursivo
    public static int SumaMatriz(int fila, int colum, int[][] Matriz,int []Array) {
        int sumaM = 0,sumaF=0;
        
        //System.out.print(Matriz[fila][colum] + " ");
        
        if (fila != Matriz.length - 1 || colum != Matriz[0].length - 1) {
            //2
            if (colum <= Matriz[0].length - 1) {
                System.out.print(Matriz[fila][colum]+" ");
                Array[colum]=Matriz[fila][colum];    
                sumaM = Matriz[fila][colum] + SumaMatriz(fila, colum + 1, Matriz,Array);

            } else {
                System.out.println(SumaFila(colum-1,Array));
                System.out.println("");
                colum = 0;
                fila++;
                sumaM = SumaMatriz(fila, colum, Matriz,Array);

            }

        } else {
            Array[colum]=Matriz[fila][colum]; 
            System.out.print(Matriz[fila][colum]+" ");
            sumaM = Matriz[fila][colum];//caso base
            System.out.println("");
            System.out.println(SumaFila(colum,Array));
            
        }

        return sumaM;

    }

}
