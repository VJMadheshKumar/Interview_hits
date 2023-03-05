package com.solutions4;

public class Complex {

	
	double real;
    double imag;

    public Complex(double Real, double Imag){
    	this.real = Real;
    	this.imag = Imag;
    }

    public static Complex add(Complex n1, Complex n2){
    	double real = n1.real+n2.real;
    	double imag = n1.imag+n2.imag;
    	Complex result = new Complex(real, imag);
    	return result;
    	
    	
    }
    public static void main(String[] args) {
	Complex n1 = new Complex(2.3, 4.5),
                n2 = new Complex(3.4, 5.0),
                temp;
        temp = add(n1, n2);
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);

	
}
	}