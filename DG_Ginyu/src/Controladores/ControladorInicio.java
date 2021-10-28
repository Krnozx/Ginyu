/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.Ventana;
import Vistas.VistaInicio;
import java.awt.event.ActionEvent;

/**
 *
 * @author usuario
 */
public class ControladorInicio{
    private final Ventana ventana;
    private final VistaInicio view;
    private ControladorMaestros controladorMaestros;
    
    public ControladorInicio(){
        this.ventana = new Ventana();
        this.view = new VistaInicio();
        this.controladorMaestros = new ControladorMaestros();
        this.ventana.add(this.controladorMaestros.getView());
        this.view.maestrosButton.addActionListener(e -> mostrarMaestros(e));
        this.view.ventasButton.addActionListener(e -> mostrarVentas(e));
        this.view.comprasButton.addActionListener(e -> mostrarCompras(e));
        this.view.informesButton.addActionListener(e -> mostrarInformes(e));
        this.ventana.add(view);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.pack();
        this.ventana.setVisible(true);
    }
    
    public void mostrarMaestros(ActionEvent e){
        this.view.setVisible(false);
        this.controladorMaestros.showMenuMaestros();

    }
    
    public void mostrarVentas(ActionEvent e){
        
    }
    
    public void mostrarCompras(ActionEvent e){
        
    }
    
    public void mostrarInformes(ActionEvent e){
        
    }
}
