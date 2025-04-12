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
    private float estatura;
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

    public void setEstatura(float estatura){
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

    public void setSiguiente(Informacion siguiente){
        this.siguiente = siguiente;
    }
    
    public String getNombreNino() {
        return nombreNino;
    }

    public int getIdentificacionNino() {
        return identificacionNino;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public int getPeso() {
        return peso;
    }

    public int getNumRegistroCivil() {
        return numRegistroCivil;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getNomRepresentante() {
        return nomRepresentante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public int getIdRepresentante() {
        return idRepresentante;
    }

    public Informacion getSiguiente() {
        return siguiente;
    }

    public void copiarNodo(Informacion nodo){
        this.nombreNino = nodo.getNombreNino();
        this.identificacionNino = nodo.getIdentificacionNino();
        this.edad = nodo.getEdad();
        this.estatura = nodo.getEstatura();
        this.peso = nodo.getPeso();
        this.numRegistroCivil = nodo.getNumRegistroCivil();
        this.municipio = nodo.getMunicipio();
        this.nomRepresentante = nodo.getNomRepresentante();
        this.parentesco = nodo.getParentesco();
        this.idRepresentante = nodo.getIdRepresentante();
    }

}
