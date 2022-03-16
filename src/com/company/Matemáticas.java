package com.company;

public class Matemáticas {
    static void Ec2grado(int a, int b, int c, MiDouble x1, MiDouble x2){
        if(c==0){
            x1.setD(0);
            x2.setD(-b/a);
        }
        if(b==0){
            x1.setD(Math.sqrt(-c)/a);
            x2.setD(-Math.sqrt(-c)/a);
        }
        if(a!=0 && b!=0 && c!=0){
         x1.setD(-b+Math.sqrt(Math.pow(b,2)-(4*c*a))/(2*a));
         x2.setD(-b-Math.sqrt(Math.pow(b,2)-(4*c*a))/(2*a));
        }

    }
    static void seno(double x, MiDouble x1){
        x1.setD(Math.sin(x));
    }
    static void senTaylor(double x,int prec, MiDouble x1){
        int n;
        int sig=1;
        double y=0;
        int n2=1;
        for(n=1;n<=prec;n++){
            y=y+(((Math.pow(x,n2)/factorial(n2)))*sig);
            sig=-sig;
            n2=n2+2;
        }
        x1.setD(y);
    }
    private static double factorial(double n){
        int m;
        double fact=1;
        for(m=1;m<=n;m++){
            fact=fact*m;
        }
        return fact;
    }
}
