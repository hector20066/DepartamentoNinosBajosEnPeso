/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejo;

/**
 *
 * @author Ing. Hector Acevedo
 */
public class Informacion {
    
    private String nombreNino;
    private int identificacionNino;
    private int edad;
    private int estatura;
    private int peso;
    private int numRegistroCivil;
    private String municipio;
    private String nomRepresentante;
    private String parentesco;
    private int idRepresentante;
    private Informacion siguiente;

    public Informacion(){

    }

    public void setNombreNino(String nombreNino){
        this.nombreNino = nombreNino;
    }

    public void setIdentificacionNino(int identificacionNino){
        this.identificacionNino = identificacionNino;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setEstatura(int estatura){
        this.estatura = estatura;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setNumRegistroCivil(int numRegistroCivil){
        this.numRegistroCivil = numRegistroCivil;
    }

    public void setMunicipio(String municipio){
        this.municipio = municipio;
    }

    public void setNomRepresentante(String nomRepresentante){
        this.nomRepresentante = nomRepresentante;
    }

    public void setParentesco(String parentesco){
        this.parentesco = parentesco;
    }

    public void setIdRepresentante(int idRepresentante){
        this.idRepresentante = idRepresentante;
    }

    public void setSiguiente(Informacion Siguiente){
        this.siguiente = siguiente;
    }

    //Metodos getters

    public void copiarNodo(Informacion nodo){
        this.nombreNino = nodo.getNombreNino;
        this.identificacionNino = nodo.getIdentificacionNino;
        this.edad = nodo.getEdad;
        this.estatura = nodo.getEstatura;
        this.peso = nodo.getPeso;
        this.numRegistroCivil = nodo.getNumRegistroCivil;
        this.municipio = nodo.getMunicipio;
        this.nomRepresentante = nodo.getNomRepresentante;
        this.parentesco = nodo.getParentesco;
        this.idRepresentante = nodo.getIdRepresentante;
    }

}
