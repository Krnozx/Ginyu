/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.VistaInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class ControladorInicio{
    private VistaInicio view;
    
    public ControladorInicio(VistaInicio view){
        this.view = view;
        this.view.maestrosButton.addActionListener(e -> mostrarMaestros(e));
        this.view.ventasButton.addActionListener(e -> mostrarVentas(e));
        this.view.comprasButton.addActionListener(e -> mostrarCompras(e));
        this.view.informesButton.addActionListener(e -> mostrarInformes(e));
    }
    
    public void mostrarMaestros(ActionEvent e){
        
    }
    
    public void mostrarVentas(ActionEvent e){
        
    }
    
    public void mostrarCompras(ActionEvent e){
        
    }
    
    public void mostrarInformes(ActionEvent e){
        
    }
}
