/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistence.ControladoraPersistencia;

/**
 *
 * @author PC
 */
public class Controladora {
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void crearEstudiante(Estudiante e){
        
        controladoraPersistencia.crearEstudiante(e);
    }
    
    public List<Estudiante> consultarEstudiantes(){
        
       return controladoraPersistencia.consultarEstudiantes();     
    }
    
}
