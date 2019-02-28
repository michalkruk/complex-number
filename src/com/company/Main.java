package com.company;

import java.text.DecimalFormat;

public class Main {

    // sample client for testing
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");
        Complex a = new Complex(5.0, 3.0);
        Complex b = new Complex(-3.0, 4.0);
        Complex c = new Complex(3.0,5.0);

        System.out.println("a            = " + a);
        System.out.println("b            = " + b);
        System.out.println("c            = " + c);
        System.out.println("c            = |" +f.format(c.abs())+"|( cos ("+c.trigonometryFormCos(c.fi())+")"+"+ i sin("+c.trigonometryFormSin(c.fi())+"))");
        System.out.println("Re(a)        = " + a.re());
        System.out.println("Im(a)        = " + a.im());
        System.out.println("b + a        = " + b.plus(a));
        System.out.println("a - b        = " + a.minus(b));
        System.out.println("a * b        = " + a.times(b));
        System.out.println("b * a        = " + b.times(a));
        System.out.println("a / b        = " + a.divides(b));
        System.out.println("(a / b) * b  = " + a.divides(b).times(b));
        System.out.println("conj(a)      = " + a.conjugate());
        System.out.println("|a|          = " + a.abs());
        System.out.println("tan(a)       = " + a.tan());
    }
}
