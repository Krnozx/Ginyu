/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.PlantillaSeleccion;
import Vistas.VentasPanel;

/**
 *
 * @author usuario
 */
public class ControladorVentas {
    private final VentasPanel panel;
    private final PlantillaSeleccion view;
    
    public ControladorVentas(PlantillaSeleccion plantilla){
        this.panel = new VentasPanel();
        this.view = plantilla;
        this.view.setVisible(false);
        this.panel.setVisible(false);
    }
    
    public void showMenuVentas(){
        this.panel.setVisible(true);
        this.view.subtituloLabel.setText("Ventas");
        this.view.setVisible(true);
    }
    
    public PlantillaSeleccion getView(){
        return this.view;
    }
}
