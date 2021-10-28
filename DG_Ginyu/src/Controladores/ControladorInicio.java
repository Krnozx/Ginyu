/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.PlantillaSeleccion;
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
    private final PlantillaSeleccion plantilla;
    private final ControladorMaestros controladorMaestros;
    private final ControladorCompras controladorCompras;
    private final ControladorInformes controladorInformes;
    private final ControladorVentas controladorVentas;
    
    public ControladorInicio(){
        this.ventana = new Ventana();
        this.view = new VistaInicio();
        this.plantilla = new PlantillaSeleccion();
        this.controladorMaestros = new ControladorMaestros(plantilla);
        this.controladorCompras = new ControladorCompras(plantilla);
        this.controladorInformes = new ControladorInformes(plantilla);
        this.controladorVentas = new ControladorVentas(plantilla);
        this.ventana.add(this.controladorMaestros.getView());
        this.view.maestrosButton.addActionListener(e -> mostrarMaestros(e));
        this.view.ventasButton.addActionListener(e -> mostrarVentas(e));
        this.view.comprasButton.addActionListener(e -> mostrarCompras(e));
        this.view.informesButton.addActionListener(e -> mostrarInformes(e));
        this.plantilla.atrasButton.addActionListener(e -> volverInicio(e));
        this.ventana.add(view);
        this.view.setVisible(true);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.pack();
        this.ventana.setVisible(true);
    }
    
    public void volverInicio(ActionEvent e){
        this.plantilla.setVisible(false);
        this.view.setVisible(true);
    }
    
    public void mostrarMaestros(ActionEvent e){
        this.view.setVisible(false);
        this.controladorMaestros.showMenuMaestros();

    }
    
    public void mostrarVentas(ActionEvent e){
        this.view.setVisible(false);
        this.controladorVentas.showMenuVentas();
    }
    
    public void mostrarCompras(ActionEvent e){
        this.view.setVisible(false);
        this.controladorCompras.showMenuCompras();
    }
    
    public void mostrarInformes(ActionEvent e){
        this.view.setVisible(false);
        this.controladorInformes.showMenuInformes();
    }
}
