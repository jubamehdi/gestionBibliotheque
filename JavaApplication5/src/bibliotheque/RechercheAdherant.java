/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import entities.Adherant;
import javax.swing.JOptionPane;

/**
 *
 * @author juba
 */
public class RechercheAdherant extends javax.swing.JFrame {

    /**
     * Creates new form RechercheAdherant
     */
    private final GestionAdherant gestionAdh;

    public RechercheAdherant(GestionAdherant gestionAdh) {
        initComponents();
        this.gestionAdh = gestionAdh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTRecherche = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TFNumAdh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numResult = new javax.swing.JLabel();
        resultatRche = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LNomAdh = new javax.swing.JLabel();
        LPrenomAdh = new javax.swing.JLabel();
        LAdresseAdh = new javax.swing.JLabel();

        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        BTRecherche.setText("Recherche");
        BTRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRechercheActionPerformed(evt);
            }
        });

        jLabel1.setText("Numéro adhérant");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Rechercher adhérant");

        numResult.setVisible(false);
        numResult.setText("aucun élément trouvé");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Nom");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Prénom");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Adresse");

        LNomAdh.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LNomAdh.setText("_");

        LPrenomAdh.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LPrenomAdh.setText("_");

        LAdresseAdh.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LAdresseAdh.setText("_");

        javax.swing.GroupLayout resultatRcheLayout = new javax.swing.GroupLayout(resultatRche);
        resultatRche.setLayout(resultatRcheLayout);
        resultatRcheLayout.setHorizontalGroup(
            resultatRcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultatRcheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultatRcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(resultatRcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LAdresseAdh)
                    .addComponent(LPrenomAdh)
                    .addComponent(LNomAdh))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        resultatRcheLayout.setVerticalGroup(
            resultatRcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultatRcheLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(resultatRcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LNomAdh))
                .addGap(18, 18, 18)
                .addGroup(resultatRcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LPrenomAdh))
                .addGap(18, 18, 18)
                .addGroup(resultatRcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(LAdresseAdh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(TFNumAdh, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTRecherche)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(resultatRche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numResult)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNumAdh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BTRecherche))
                .addGap(18, 18, 18)
                .addComponent(numResult)
                .addGap(18, 18, 18)
                .addComponent(resultatRche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRechercheActionPerformed

        try {
            Adherant adh = gestionAdh.getAdherantById(TFNumAdh.getText());
            if (adh.getNumAdh() == null) {
                JOptionPane.showMessageDialog(null, "Aucun élément trouvé", "Recherche", JOptionPane.INFORMATION_MESSAGE);
            } else {
                LNomAdh.setText(adh.getNomAdh());
                LPrenomAdh.setText(adh.getPrenomAdh());
                LAdresseAdh.setText(adh.getAdresseAdh());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur", "Recherche", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_BTRechercheActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
      resetForm();
    }//GEN-LAST:event_formComponentHidden
    private void resetForm() {
        TFNumAdh.setText("");
        LNomAdh.setText("_");
        LPrenomAdh.setText("_");
        LAdresseAdh.setText("_");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTRecherche;
    private javax.swing.JLabel LAdresseAdh;
    private javax.swing.JLabel LNomAdh;
    private javax.swing.JLabel LPrenomAdh;
    private javax.swing.JTextField TFNumAdh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel numResult;
    private javax.swing.JPanel resultatRche;
    // End of variables declaration//GEN-END:variables
}