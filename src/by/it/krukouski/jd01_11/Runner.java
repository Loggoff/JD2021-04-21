package by.it.krukouski.jd01_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        //List<Integer> listA = new ListA<>();
        //List<Integer> listB=new ListB<>();
        //List<Integer> list2 = new ArrayList<>();
        Set<Integer> setR=new HashSet<>();
        Set<Integer> setC=new SetC<>();


        //listB.add(1); list2.add(1);
        //listB.add(2); list2.add(2);
        //listB.add(3); list2.add(3);
        //listB.add(4); list2.add(4);
        //System.out.println(listB);
        //System.out.println(list2);

        //listB.add(2,8); list2.add(2,8);
        //listB.set(0,0); list2.set(0,0);
        //System.out.println(listB);
        //System.out.println(list2);

        setC.add(5); setR.add(5);
        setC.add(4); setR.add(4);
        setC.add(3); setR.add(3);
        setC.add(6); setR.add(6);
        //setC.add(4); setR.add(4);
        setC.remove(6); setR.remove(6);


        System.out.println(setC.size());
        System.out.println(setR.size());




    }
}
