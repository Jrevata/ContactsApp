package com.jrevata.contactsapp.adapters;

import android.support.v7.widget.RecyclerView;

import com.jrevata.contactsapp.models.Persona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno on 23/03/2018.
 */

public class PersonRepository {

    private static List<Persona> people;

    static{

        people = new ArrayList<>();
        people.add(new Persona(1,"Jordan","jordan.revata@tecsup.edu.pe", "Picture 1"));
        people.add(new Persona(2,"Bruno" , "bruno.leon@tecsup.edu.pe","Picture 2"));
        people.add(new Persona(3,"José","jose,guerra.g@tecsup.edu.pe" , "Picture 3"));
    }

    public List<Persona> getList(){
        return people;
    }

}
