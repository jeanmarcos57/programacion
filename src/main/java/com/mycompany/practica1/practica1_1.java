/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author CTPG
 */
public class practica1_1 {
    public static void main(String[] args)
    {
        //declaraciones de variables
       String num;
       float salario;
       double peso;
       double estatura;
       String edad;
       short año;
       boolean isEstudiante;
       
       //asignacion de valores
       num="10";
       int convNum=Integer.parseInt(num); //conversion de String a int
       salario= 780993.67f; //se usa la variable  float entonces tenemos que utilizar al final "F" si usamos decimales
       peso= 68.9;
       estatura= 1.67;
       edad= "12";
       int convEdad=Integer.parseInt(edad); //conversion de String a int
       año= 1990;
       isEstudiante= true; //se asigna el valo de true
       
       String convSalario=String.valueOf(salario); //conversion de String a Float
       
       float convPeso=(float)peso; //conversion de double a float
       
       
       
       
       
       
    }
}
