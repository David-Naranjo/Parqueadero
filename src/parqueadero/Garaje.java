/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class Garaje {
    List<Coche> coches;

    public Garaje() {
        coches = new LinkedList();
        
    }
    
    public void addCoche(Coche coche){
        if (buscar(coche.getMatricula()) != null) {
            System.out.println("Ya existe está matrícula");
        }else{
            coches.add(coche);
        }
    
    }
    public Coche buscar(String matricula) {
        for(Coche c: coches)
            if (c.getMatricula().equals(c.getMatricula()))
                return c;
                return null;
            }
        }


