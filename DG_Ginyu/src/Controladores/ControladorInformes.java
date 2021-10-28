/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.InformesPanel;
import Vistas.PlantillaSeleccion;

/**
 *
 * @author usuario
 */
public class ControladorInformes {
    private final InformesPanel panel;
    private final PlantillaSeleccion view;
    
    public ControladorInformes(PlantillaSeleccion plantilla){
        this.panel = new InformesPanel();
        this.view = plantilla;
        this.view.setVisible(false);
        this.panel.setVisible(false);
        
    }
    
    public PlantillaSeleccion getView(){
        return this.view;
    }
    
    public void showMenuInformes(){
        this.panel.setVisible(true);
        this.view.subtituloLabel.setText("Informes");
        this.view.setVisible(true);
    }
}
