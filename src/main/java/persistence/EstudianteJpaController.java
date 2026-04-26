/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;


import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import logica.Estudiante;

public class EstudianteJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public EstudianteJpaController() {
        emf = Persistence.createEntityManagerFactory("Colegio_PU"); 
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    
    public void create(Estudiante estudiante) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    
    public void edit(Estudiante estudiante) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(estudiante);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Estudiante estudiante = em.find(Estudiante.class, id);
            if (estudiante != null) {
                em.remove(estudiante);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    
    public Estudiante findEstudiante(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Estudiante.class, id);
        } finally {
            em.close();
        }
    }

    
    public List<Estudiante> findEstudianteEntities() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT e FROM Estudiante e");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    
    public int getEstudianteCount() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT COUNT(e) FROM Estudiante e");
            return ((Long) query.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}