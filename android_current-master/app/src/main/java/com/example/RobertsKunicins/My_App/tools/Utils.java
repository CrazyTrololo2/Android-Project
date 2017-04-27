package com.example.RobertsKunicins.My_App.tools;




import com.example.RobertsKunicins.My_App.models.Ssomething;

import java.util.ArrayList;

/**
 * Created by RobertsKunicins on 3/8/2017.
 */

public class Utils {

    public static ArrayList<Ssomething>fillPenguins(){
        Ssomething test1 = new Ssomething("test1");
        Ssomething test2 = new Ssomething("test2");
        Ssomething test3 = new Ssomething("test3");
        Ssomething test4 = new Ssomething("test4");
        Ssomething test5 = new Ssomething("test5");
        Ssomething test6 = new Ssomething("test6");
        Ssomething test7 = new Ssomething("test7");

        ArrayList<Ssomething>TestList = new ArrayList<>();
        TestList.add(test1);
        TestList.add(test2);
        TestList.add(test3);
        TestList.add(test4);
        TestList.add(test5);
        TestList.add(test6);
        TestList.add(test7);

        return TestList;
    }

}
