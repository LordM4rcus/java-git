/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int cat;
        double sueldo = 0;
        String nombrePuesto = null;
        System.out.println("Ingrese el numero de categoria para calcular el sueldo");
        Scanner dataIngresante = new Scanner(System.in);
        cat = dataIngresante.nextInt();
        switch(cat){
            case 1: nombrePuesto = "Repositor";
            sueldo =15890 + (15890/10);
            break;
            case 2: nombrePuesto = "Cajero";
            sueldo =25630.89;
            break;
            case 3: nombrePuesto = "Supervisor";
            sueldo =35560.20 - (35560.20/11);
            break;
            default: System.out.println("Categoria invalida");
            break;
        }
        
        System.out.println("El sueldo segun la categoria : " + nombrePuesto + " es  de " + sueldo + " al mes.");

        double promedio;
        String condicionFinal;
        System.out.println("ingresenelpromedio  del alumno");
        Scanner dataIngresante = new Scanner(System.in);
        promedio = dataIngresante.nextDouble();
        condicionFinal = promedio >= 13 ? "aprobado" : "desaprobado";
        System.out.println("la condicion final de aluumno es : " + condicionFinal);
        
        int contador = 1;
        
        while(contador <= 10){
            System.out.println("estamo en la vuelta" + contador);
            contador = contador +1;
        
        int contador = 11;
        boolean centinela = true;
        while(centinela == true){
             if(contador <= 10){
                 System.out.println("estamo en la vuelta" + contador);
                 centinela = false;
            }
            System.out.println("el valor de la bandera es " + centinela);
          
            for (int i = 0; i <= 10; i++) {
                System.out.println("estoydando vuelta con for, enstoy en la vuelta : " + i);
               
        int[] arrayPrecios = new int[10];
        Scanner dataingresante = new Scanner(System.in);
        System.out.println("ingrese 10 numeros");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("el numero " + (i + 1) + " : ");
            arrayPrecios[i] = dataingresante.nextInt();
        }
        System.out.println("Los numeros que ingresastes son: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("numero " + (i + 1) + " : " + arrayPrecios[i]);
        }
        
        int tresportres[][] = new int[3][3];
        Scanner dataIngresante = new Scanner(System.in);
        
        System.out.println("ingrese los siguientes numeros:");
        // carga
        for (int i = 0; i < tresportres.length; i++) {
            for (int j = 0; j < tresportres.length; j++) {
                System.out.println("el valor de i : " + i + " j: " + j);
                tresportres[i][j] = dataIngresante.nextInt();
            }
        }
        System.out.println("los valores adquiridos son lo siugientes");
        //recorrido
        for (int i = 0; i < tresportres.length; i++) {
            for (int j = 0; j < tresportres.length; j++) {
                System.out.println("en la posicion i : " + i + " j: " + j + " : " + tresportres[i][j]);
                
            }
        } 
        int matriz[][] = new int[3][3];

        /*matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 96;
        matriz[1][0] = 35;
        matriz[1][1] = 33;
        matriz[1][2] = 71;
        matriz[2][0] = 446;
        matriz[2][1] = 225;
        matriz[2][2] = 24;
        */
        // cargado
        /*Scanner entradaData = new Scanner(System.in);
        System.out.println("ingrese los numeros a cargar");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entradaData.nextInt();
                
            }
        }
        // Recorrido
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(String.format("el valor de posicion i: %d j: %d es de : ---%d---\n",i,j,matriz[i][j]));
                
            }

        }*/
        /*
        int[] vector;
        vector = new int[15];
        //carga de numeros:
        Scanner entradaData = new Scanner(System.in);
        System.out.println("Ingrese los 15 numeros al vector");
        for (int i = 0; i < 15; i++) {
            vector[i] = entradaData.nextInt();
        }
        //ingrese el numero que desea contar:
        int numAcon;
        int numCtado = 0;
        System.out.println("ingrese el numero a contar:");
        numAcon = entradaData.nextInt();
        
        //conteo de numeros iguales:
        for (int i = 0; i < 15; i++) {
            //System.out.println(String.format("los numeros cargados son: %d",vector[i]));
            if (vector[i] == numAcon) {
                numCtado = numCtado + 1; 
                
            }
            
        }
        System.out.println(String.format("la cantidad contada del numero %d es: %d",numAcon,numCtado));
        */
        System.out.println("ingrese el numero limite que quiere contar:");
        
        Scanner dataEntrante = new Scanner(System.in);
        int limite = dataEntrante.nextInt();
        int con = 1;
        /*
        while (con <= limite) {
            System.out.println(con);
            con++;
        }
        */
        boolean centinela = true;
        while (centinela == true) {            
            if (con <= limite) {
                System.out.println(con);
                con++;
            } else {
                centinela = false;
            }
        }
        
    }

}
