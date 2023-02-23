/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author jean
 */
public class datos 
{
    public static void main(String[] args)
    {
        
        //tipos de datos
        //enteros (byte, short, int, long)
        byte variablebyte=10;
        System.out.println("tamaño de un tipo byte "+Byte.SIZE);
        System.out.println("valor maximo de tipo byte "+Byte.MAX_VALUE);
        System.out.println("valo minimo de tipo byte "+Byte.MIN_VALUE);
        
        short variableShort=1020;
        System.out.println("cantidad de bits de un tipo short "+Short.BYTES);
        System.out.println("tamaño de un tipo short "+Short.SIZE);
        System.out.println("valor maximo de tipo short "+Short.MAX_VALUE);
        System.out.println("valo minimo de tipo short "+Short.MIN_VALUE);
        
        int variableInt=20;
        System.out.println("cantidad de bits de un tipo int "+Integer.BYTES);
        System.out.println("tamaño de un tipo int "+Integer.SIZE);
        System.out.println("valor maximo de tipo int "+Integer.MAX_VALUE);
        System.out.println("valo minimo de tipo int "+Integer.MIN_VALUE);
        
        long variableLong=2000;
        System.out.println("cantidad de bits de un tipo long "+Long.BYTES);
        System.out.println("tamaño de un tipo long "+Long.SIZE);
        System.out.println("valor maximo de tipo long "+Long.MAX_VALUE);
        System.out.println("valo minimo de tipo long "+Long.MIN_VALUE);
        
        System.out.println("");
        //utilizar numeros binarios/octales/hexadecimales
        //decimal
        int nDecimal=10;
        System.out.println("el valor del numero decimal es "+nDecimal);
        
        //octal
        int nOctal=012;
        System.out.println("el valor del numero octal es "+nOctal);
        
        //hexadecimal
        int nHexadecimal=0xA;
        System.out.println("el valor del numero hexadecimal es "+nHexadecimal);
        
        //binario
        int nBinario=0b1010;
        System.out.println("el valor del numero binario es "+nBinario);
        
        //tipos primitivos flotantes (Float y Double)
        //tipo Float
        
        float variableFloat=1000.10F;
        System.out.println("variable flotante "+variableFloat);
        System.out.println("tamaño de un tipo float "+Float.SIZE);
        System.out.println("valor maximo de tipo float "+Float.MAX_VALUE);
        System.out.println("valo minimo de tipo float "+Float.MIN_VALUE);
        
        double variableDouble=1000.10;
        System.out.println("variable double "+variableDouble);
        System.out.println("tamaño de un tipo double "+Double.SIZE);
        System.out.println("valor maximo de tipo double "+Double.MAX_VALUE);
        System.out.println("valor minimo de tipo double "+Double.MIN_VALUE);
        
        //tipo primitivo CHAR
        char vChar1='A';
        System.out.println("variable char "+vChar1);
        System.out.println("tamaño de un tipo char "+Character.SIZE);
        System.out.println("valor maximo de un tipo char "+Character.MAX_VALUE);
        System.out.println("valor minimo de un tipo char "+Character.MIN_VALUE);
        
        //char utilizando valores unicode
        char vChar2='\u0544';
        System.out.println("valor de la variable char2 "+vChar2);
        
        //char utilizando simnolo
        char vChar3='!';
        System.out.println("valor de la varible char3 "+vChar3);
        
        //char utilizando numero decimal
        char vChar4=56;
        System.out.println("valor de la varible char4 "+vChar4);
        
        //tipo primitivo booleano
        boolean vBoolean=true;
        System.out.println("el valor de boolean es "+vBoolean);
        System.out.println("valor de verdad tipo boolean "+Boolean.TRUE);
        System.out.println("valor falso tipo boolean "+Boolean.FALSE);
        
        //conversiones
        //conversiones de tipo string a tipo int
        int edad=Integer.parseInt("67");
        
        //converciones de tipo string a tipo double
        double estatura=Double.parseDouble("13.5");
        
        //conversion de tipo primitivo a string
        String num=String.valueOf(45);
        
        //conversion entre tipos primitivos
        short a=10;
        byte b=(byte)a;
    }
}
