package com.qa.methodsinjava;


public class ArithmeticOperationsUsingMethod {
    public void calculateSum(int a, int b){
        System.out.println("addition ="+(a+b));
    }

    public void calculateSub(int a, int b){
        System.out.println("Subtraction ="+(a-b));
    }

    public void calculateMul(int a, int b){
        System.out.println("Multiplication ="+(a*b));
    }

    public void calculateDiv(int a, int b){
        System.out.println("Division ="+(a/b));
    }

    public static void main(String[] args){

       ArithmeticOperationsUsingMethod omd = new ArithmeticOperationsUsingMethod();
       omd.calculateSub(7,8);
       omd.calculateMul(5,4);
       omd.calculateDiv(3,1);
       omd.calculateSum(3,5);

    }

}
