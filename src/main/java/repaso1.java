/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jean
 */
public class repaso1 
{
    public static void main(String[] args) 
    {
        double base=057;
        double altura=064;
        double areaTriangulo=base*altura/2;
        
        double radio=0xC;
        double areaCirculo;
        areaCirculo=radio*radio*3.14;
        
        double peso=86;
        double alturaP=57;
        double imc=peso/alturaP*alturaP;
        
        if (19>=18)
        {
            System.out.println("la persona es mayor de edad");
        }
        else 
           {
                System.out.println("la persona es menor de edad");
           }
        
        int a,b,c;
        a=8;
        b=3;
        c=5;
        int pa=a+b+c;
        int pb=a/b;
        int pc=a/c;
        int pd=2*b+3*(a-c);
        int pe=a%b;
        int pf=a%c;
        int pg=a*(b/c);
        int ph=(a*b)%c;
        int pi=a*b/c;
        int pj=(a-4*b)%(c+2*a)/(a-c);
        
        String c1="54";
        String c2="20";
        String c3="36";
        
        int C1=Integer.parseInt(c1);
        int C2=Integer.parseInt(c2);
        int C3=Integer.parseInt(c3);
        
        int p1=C1+C2;
        int p2=C1/C3;
        int p3=C1*C3+C2;
        int p4=C2^2*C1-C2;
        
        boolean x=true;
        boolean y=false;
        boolean z=true;
        
        boolean b1=(x&&y)||(x&&z);
        boolean b2=(x&&z)||(y);
        boolean b3=(x&!y&!x)||(!z&&y);
        boolean b4=(!x&&z&&(!z||!x));
        
        int l=9 ,j=4;
        float X=0.005f , Y=-0.01f;
        char C=5 , d=3;
        boolean P1=(l<=j);
        boolean P2=(l!=j);
        boolean P3=!(X>0);
        boolean P4=(l<0&&j<9);
        boolean P5=(j*-1==l*-10);
        boolean P6=(X!=l);
        boolean P7=(a+b==99);
        
        
    }
}
