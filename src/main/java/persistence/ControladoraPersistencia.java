/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Estudiante;

/**
 *
 * @author PC
 */
public class ControladoraPersistencia {
    
    EstudianteJpaController estudianteJpaController = new EstudianteJpaController();
    
    public void crearEstudiante(Estudiante e) {

        try {
            estudianteJpaController.create(e);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Estudiante> consultarEstudiantes() {
        return estudianteJpaController.findEstudianteEntities();
    }

}
