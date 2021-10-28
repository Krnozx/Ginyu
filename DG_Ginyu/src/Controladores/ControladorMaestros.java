/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.VistaMaestros;

/**
 *
 * @author usuario
 */
public class ControladorMaestros {
    private final VistaMaestros view;
    
    public ControladorMaestros(){
        this.view = new VistaMaestros();
        this.view.setVisible(false);
    }
    
    public VistaMaestros getView(){
        return this.view;
    }
    
    public void showMenuMaestros(){
        this.view.setVisible(true);
    }
    
}
