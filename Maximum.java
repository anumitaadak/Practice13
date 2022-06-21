package com.generic;

public class Maximum<T> {
    T x;
    T y;
    T z;

    public static <T extends Comparable<T>>T testMaximum(T x,T y,T z) {
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }

        if(z.compareTo(max) > 0){
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }

    public static <T> void printMax(T x,T y,T z,T max) {
    System.out.println("x is : "+x+" \n"+" y is : "+y+" \n"+" z is : "+z+" \n"+" maximum is : "+max);
    }

    public static void main(String[] args) {
        int maximumInt=testMaximum(2,10,15);
        System.out.println(maximumInt);
        String maximumStr = testMaximum("Siya","Riya","Sam");
        System.out.println(maximumStr);
        float maximumFl = testMaximum(1.2f,2.5f,9.8f);
        System.out.println(maximumFl);
    }
}
