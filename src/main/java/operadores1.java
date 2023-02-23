/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jean marcos
 */
public class operadores1 
{
    public static void main(String[] args)
    {
      String nom,ap1,ap2;
      nom="jean ";
      ap1="alvarez ";
      ap2=ap1="exposito";
      
      String nombreCompleto;
      nombreCompleto=nom+ap1+ap2;
              
      String a,b,c,d;
      a="el, ";
      b="mundo, ";
      c="esta, ";
      d="de cabeza";
      
      String frase="el, mundo, esta, de cabeza";
      
      int n1,n2,n3,n4;
      n1=120;
      n2=34;
      n3=56;
      n4=5;
      
      int suma=n1+n2+n3+n4;
      int resta=n1-n2-n3-n4;
      int multi=n1*n2*n3*n4;
      double divi=n1/n2/n3/n4;
      double modulo=n1%n2%n3%n4;
      
        System.out.println("el resultado de todas las variables \nsuma: "+suma+"\nresta: "+resta+"\nmultiplicacion: "+multi+"\ndivicion: "+divi+"\nmodulo: "+modulo);
        
        n1++;
        n4++;
        
        boolean condicion=true;
        boolean t=!condicion;
        
        int h,f,m,r;
        h=5;
        f=8;
        m=3;
        r=4;
        
        h+=6;
        f-=2;
        m*=2;
        r/=1;
        
        System.out.println("h: "+h);
        System.out.println("f: "+f);
        System.out.println("m: "+m);
        System.out.println("r: "+r);
                
    }
}