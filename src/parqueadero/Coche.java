/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class Coche {
    public static class KmsIncorrectos extends Exception {}
    private String direccionDueno;
    String matricula;
    LinkedList<Reparacion> reparaciones;

    public Coche(String direccionDueno, String matricula) {
        this.direccionDueno = direccionDueno;
        this.matricula = matricula;
        reparaciones = new LinkedList();        
    }

    public String getDireccionDueno() {
        return direccionDueno;
    }

    public void setDireccionDueno(String direccionDueno) {
        this.direccionDueno = direccionDueno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void addReparacion(Reparacion r)throws KmsIncorrectos {
        ///deben tener en cuenta que la reparación que se va agregar los kilometros no se han inferior a la reparación anterior
        
        if (r.getKms()<reparaciones.getFirst().getKms())
        
            throw new KmsIncorrectos();
        
        reparaciones.addFirst(r);
    
    }
    
    public LinkedList buscarReparaciones(String palabraClave){
        LinkedList<Reparacion> reparacionesEspecificas=null;
        
        ////iterar Iterador, for, while......
        /////String tiene metodos para determinar si un texto contiene una plabra.
        for(Reparacion r: reparaciones){
            if (r.getDescripcion().indexOf(palabraClave)!=-1){
                reparacionesEspecificas.add(r);
            }
        }return reparacionesEspecificas;
        
    }
    
    public Reparacion buscarUltimaReparación(){
        Reparacion reparacion=null;
        reparacion = reparaciones.getLast();
        
         ///linkedList tiene un metodo que le permite obtener el ultimo elemento registrado
        
        return reparacion;
    } 
    
    
}
