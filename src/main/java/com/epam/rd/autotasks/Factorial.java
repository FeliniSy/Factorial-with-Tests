package com.epam.rd.autotasks;

public class Factorial {
    public String factorial(String n) {
        int m = Integer.parseInt(n);

        int x = fact(m);

        n = String.valueOf(x);
        return n;

    }

    int fact(int n) {
        if(n < 0) throw new IllegalArgumentException();
        else if(n == 0) return 1;
        else{
            return n*fact(n-1);
        }
    }
}
