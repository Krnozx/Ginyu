/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.ComprasPanel;
import Vistas.PlantillaSeleccion;

/**
 *
 * @author usuario
 */
public class ControladorCompras {
    private final ComprasPanel panel;
    private final PlantillaSeleccion view;
    
    public ControladorCompras(PlantillaSeleccion plantilla){
        this.panel = new ComprasPanel();
        this.view = plantilla;
        this.view.setVisible(false);
        this.panel.setVisible(false);
    }
    
    public PlantillaSeleccion getView(){
        return this.view;
    }
    
    public void showMenuCompras(){
        this.panel.setVisible(true);
        this.view.subtituloLabel.setText("Compras");
        this.view.setVisible(true);
    }
}
