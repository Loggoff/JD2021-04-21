package by.it.karpiuk.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }



    private static void step1() {
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow(x * x + PI / 6,5));
        double part2 = sqrt(x * pow(a, 3));
        double part3 = log(abs((a - 1.3 * x) / 4));
        double z = part1 - part2 - part3;
        System.out.printf("A=%-8.4f X=%3.1f Z=%-12.6f", a, x, z);
    }

    private static void step2() {
        double a=1.21;
        double b = 0.371;
        double y= tan(pow(a+b,2))-cbrt(a+1.5)+a*pow(b,5)-b/log(a*a);
        System.out.println("y= "+y);
    }

    public static void step3() {
        final double x = 12.1;
        for (double a = -5; a <= 12; a += 3.75) {
            double f = exp(a *x ) - 3.45 * a;
            System.out.printf("При a=%6.2f f=%g\n", a,f);
        }
    }
}
