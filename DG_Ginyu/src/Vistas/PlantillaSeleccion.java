/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

/**
 *
 * @author usuario
 */
public class PlantillaSeleccion extends javax.swing.JPanel {
    /**
     * Creates new form PlantillaSeleccion
     */
    public PlantillaSeleccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        headerPanel = new javax.swing.JPanel();
        atrasButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        subtituloLabel = new javax.swing.JLabel();
        logOutPanel = new javax.swing.JPanel();
        salirButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        headerPanel.setLayout(new java.awt.GridBagLayout());

        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/left-arrow.png"))); // NOI18N
        atrasButton.setBorder(null);
        atrasButton.setBorderPainted(false);
        atrasButton.setDefaultCapable(false);
        atrasButton.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        headerPanel.add(atrasButton, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel4.setText("DREAM GIFTS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        headerPanel.add(jLabel4, gridBagConstraints);

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/grid.png"))); // NOI18N
        iconLabel.setMaximumSize(new java.awt.Dimension(50, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 4;
        headerPanel.add(iconLabel, gridBagConstraints);

        subtituloLabel.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        subtituloLabel.setText("Subtitle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.weighty = 0.1;
        headerPanel.add(subtituloLabel, gridBagConstraints);

        add(headerPanel, java.awt.BorderLayout.PAGE_START);

        logOutPanel.setLayout(new java.awt.GridBagLayout());

        salirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logout.png"))); // NOI18N
        salirButton.setText("Cerrar Sesión");
        salirButton.setBorder(null);
        salirButton.setBorderPainted(false);
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salirButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        logOutPanel.add(salirButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        logOutPanel.add(jLabel3, gridBagConstraints);

        add(logOutPanel, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(contentPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel logOutPanel;
    private javax.swing.JButton salirButton;
    protected javax.swing.JLabel subtituloLabel;
    // End of variables declaration//GEN-END:variables
}
