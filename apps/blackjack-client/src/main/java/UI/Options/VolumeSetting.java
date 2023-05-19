/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Options;

import javax.swing.JSlider;
import Main.MainRunner;

/**
 *
 * @author Suchanan
 */
public class VolumeSetting extends javax.swing.JFrame {

    /**
     * Creates new form VolumeSetting
     */
    public VolumeSetting() {
        initComponents();
        System.out.println("Setting");
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingPanel = new javax.swing.JPanel();
        settingLabel = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        masterVolume = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        settingPanel.setBackground(new java.awt.Color(51, 51, 51));

        settingLabel.setBackground(new java.awt.Color(51, 51, 51));
        settingLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 48)); // NOI18N
        settingLabel.setForeground(new java.awt.Color(255, 153, 0));
        settingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingLabel.setText("Setting");

        volumeSlider.setBackground(new java.awt.Color(51, 51, 51));
        volumeSlider.setMaximum(6);
        volumeSlider.setMinimum(-80);
        volumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MainRunner.getGameContext().getSoundController().soundControl();
            }
        });

        masterVolume.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        masterVolume.setForeground(new java.awt.Color(255, 255, 255));
        masterVolume.setText("Master Volume");

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(masterVolume)
                .addGap(30, 30, 30)
                .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(settingLabel)
                .addGap(34, 34, 34)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masterVolume)
                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeSliderStateChanged
        
    }//GEN-LAST:event_volumeSliderStateChanged

    public JSlider getVolumeSlider() {
        return volumeSlider;
    }

    public void setVolumeSlider(JSlider volumeSlider) {
        this.volumeSlider = volumeSlider;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel masterVolume;
    private javax.swing.JLabel settingLabel;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}
