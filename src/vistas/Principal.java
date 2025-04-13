/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

/**
 *
 * @author Ing. Hector Acevedo
 */
public class Principal {
    
    public static void main(String[]args){
        
        DepartamentoCuidado departamento = new DepartamentoCuidado();

        departamento.setVisible(true);
        departamento.setLocationRelativeTo(null);
        departamento.setResizable(false);
        departamento.setTitle("REGISTRO DE NIÑOS");
    }
}
