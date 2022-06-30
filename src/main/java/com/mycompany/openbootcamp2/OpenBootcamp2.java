/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.openbootcamp2;

import java.awt.BorderLayout;

/**
 *
 * @author chr_i
 */
public class OpenBootcamp2 {
    

    public static void main(String[] args) {
        int numeroIf=1;
        System.out.println("condicional If");
        if(numeroIf>0){
            System.out.println("El numero " + numeroIf + " es positivo");
        }else if(numeroIf==0){
            System.out.println("El numero " + numeroIf + " es cero");
        }else {
            System.out.println("El numero " + numeroIf + " es negativo");
        }
        int numeroWhile = -2;
        System.out.println("ciclo while");
        while(numeroWhile<3){
            System.out.println("El numero es " + numeroWhile);
            numeroWhile++;
        }
        int numeroDoWhile = 4;
        System.out.println("ciclo do while");
        do{
            System.out.println("El numero es " + numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile<3);
        int numeroFor=0;
        System.out.println("Ciclo For");
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numero es " +numeroFor);
            }
        System.out.println("Condicional Switch");
        String estacion = "Otoño";
        switch (estacion) {
            case "Primavera":
                System.out.println("Es la estacion primavera");
                break;
            case "Verano":
                System.out.println("Es la estacion verano");
                break;
            case "Otoño":
                System.out.println("Es la estacion otoño");
                break;
            case "Invierno":
                System.out.println("Es la estacion invierno");
                break;
            default:
                System.out.println("No exite la estacion");
                break;
        }
        
       
    }
}
