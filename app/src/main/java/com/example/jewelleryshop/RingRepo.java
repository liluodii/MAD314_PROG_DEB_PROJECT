package com.example.jewelleryshop;


import java.util.ArrayList;
import java.util.List;

public class RingRepo {
    //SINGLETON PATTERN
    private static RingRepo instance = null;
    private List<Ring> rings = new ArrayList<>();

    private RingRepo() //constructor
    {
       rings.add(new Ring("round","4.5","diamond",4000,"james",R.drawable.er));
        rings.add(new Ring("oval","medium","diamond",2000,"james",R.drawable.er));
    }


    public static RingRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new RingRepo();
        }
        return instance;
    }

    public void addring(Ring ring) {
        this.rings.add(ring);
    }

    public List<Ring> getCustomers() {
        return this.rings;
    }

}
