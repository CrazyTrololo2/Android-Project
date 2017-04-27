package com.example.RobertsKunicins.My_App.managers;



import com.example.RobertsKunicins.My_App.models.Ssomething;
import com.example.RobertsKunicins.My_App.tools.Utils;

import java.util.ArrayList;

/**
 * Created by RobertsKunicins on 3/7/2017.
 */

public class DataManager {

    private float SomethingSize;

    private ArrayList<Ssomething> SomethingData;

    private static DataManager instance;

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public DataManager() {
        if (SomethingData == null) {
            SomethingData = new ArrayList<>();
            SomethingData = Utils.fillPenguins();
            SomethingSize = SomethingData.size();
        }
        dataTools();
    }

    public ArrayList<Ssomething> getSomething() {
        return SomethingData;
    }

    public void setPenguin(String name) {
        SomethingData.add(new Ssomething(name));
    }

    public void setSsomething(ArrayList<Ssomething>penguinData){
        this.SomethingData = penguinData;
    }

    public void setCheckPenguin(int i,boolean key){
        SomethingData.get(i).setCheck(key);
    }

    public void delPenguin() {
        for(int i=SomethingData.size()-1;i>=0;i--){
            if(SomethingData.get(i).isCheck()==true){
                SomethingData.remove(SomethingData.get(i));
            }
        }
    }

    public void delDescription(int position){
        if(SomethingData.get(position).getDescription()!=null)
            SomethingData.get(position).setDescription(null);
    }

    public void changeDescription(int position, String note){
        SomethingData.get(position).setDescription(note);
    }

    public void dataTools(){
        if(SomethingSize < SomethingData.size() || SomethingSize > SomethingData.size()){
            
        }
        SomethingSize = SomethingData.size();
    }



}