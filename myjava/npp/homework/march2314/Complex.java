package myjava.npp.homework.march2314;

/**
 * Created by ww on 28.03.14.
 */
public class Complex implements TrigonometricForm, ComplexActions,ComplexMath
 {
     //public static final Complex ZERO = new Complex(0.0, 0.0);

   private double a;  // действительная часть
   private double b;  //мнимая часть

     public double getA()
     {
         return a;
     }

     public double getB()
     {
         return b;
     }

     public void setA(double a)
     {
         this.a = a;
     }

     public void setB(double b)
     {
         this.b = b;
     }

     public String toString()  //строковое представление комплексного числа
     {
     return "Complex: " + this.a + " " + this.b;
 }

     public boolean equals(Complex complex)  //проверка на равенство двух комплексных чисел
     {
         if(this.a == complex.a && this.b == complex.b)
             return true;
         else return false;
     }

     Complex()
     {
         this.a = 0;
         this.b = 0;
     }

     Complex(double a, double b)
     {
         this.a = a;
         this.a = b;
     }

     public double getModule()
     {
         return Math.sqrt(a * a + b * b);
     }

     public double getArg()
     {
         return Math.atan2(a, b);
     }

     public void conjugate()
     {
       this.b = -1*this.b;
     }

     public void sum(Complex complex)
     {
         this.a += complex.a;
         this.b += complex.b;
     }

     public void difference(Complex complex)
         {
             this.a -= complex.a;
             this.b -= complex.b;
         }

     public void productOnNumber(double number)
     {
         this.a*=number;
         this.b*=number;

     }
 }

