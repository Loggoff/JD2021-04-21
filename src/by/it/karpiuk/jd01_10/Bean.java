package by.it.karpiuk.jd01_10;

public class Bean {

    @Param(a=3,b=5)
    static double sum (int a, int b){
        return a+b;
    }
    @Param(a=3,b=5)
     double avg (int a, int b){
        return (a+b)/2.0;
    }
    @Param(a=3,b=5)
     double min (int a, int b){
        return a<b?a:b;
    }
    static double max (int a, int b){
        return a>b?a:b;
    }
}
