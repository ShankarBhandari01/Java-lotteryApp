package lottery_application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Btnwinner = new javax.swing.JButton();
        btnLoadCsv1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lottery Game");

        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setText("Wellcome to Lottery Game");

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("User Details");

        Btnwinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btnwinner.setText("Pick a winner");
        Btnwinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnwinnerActionPerformed(evt);
            }
        });

        btnLoadCsv1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLoadCsv1.setText("Load CSV FIle");
        btnLoadCsv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadCsv1ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Btnwinner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(794, Short.MAX_VALUE)
                    .addComponent(btnLoadCsv1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(75, 75, 75)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Btnwinner, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(btnLoadCsv1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(547, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String getCSV;
    private void BtnwinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnwinnerActionPerformed

        pickwinner();

    }//GEN-LAST:event_BtnwinnerActionPerformed

    private void btnLoadCsv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadCsv1ActionPerformed
        loadCSV();
    }//GEN-LAST:event_btnLoadCsv1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed
    private void loadCSV() {

        JFileChooser Chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("1 supported extension", "csv");
        Chooser.setFileFilter(filter);
        int choosenFile = Chooser.showOpenDialog(null);
        if (choosenFile == JFileChooser.APPROVE_OPTION) {
            File file = Chooser.getSelectedFile();
            getCSV = file.getAbsolutePath();

            try {
                BufferedReader buffer;
                buffer = new BufferedReader(new FileReader(getCSV));
                String readLine = "";
                while ((readLine = buffer.readLine()) != null) {
                    String[] values = readLine.split(",");
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setColumnIdentifiers(values);

                    Object[] tableLine = buffer.lines().toArray();
                    for (int i = 0; i < tableLine.length; i++) {
                        String line = tableLine[i].toString().trim();
                        String[] dataRow = line.split(",");
                        model.addRow(dataRow);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException e) {
            }

        }
    }
    Object[] tableLine;

    private void search() {
        try {
            BufferedReader buffer;
            buffer = new BufferedReader(new FileReader(getCSV));
            String readLine = "";
            while ((readLine = buffer.readLine()) != null) {
                String[] values = readLine.split(",");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(values);

                tableLine = buffer.lines().toArray();
                for (int i = 0; i < tableLine.length; i++) {
                    String line = tableLine[i].toString().trim();
                    String id = line.split(",")[0].toLowerCase().trim();
                    
                    if (txtSearch.getText().toLowerCase().trim().equals(id) ) {
                        model.setRowCount(0);
                        System.out.println("yaha aayo");
                        String[] dataRow = line.split(",");
                        model.addRow(dataRow);
                        break;
                    }

                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        }
    }

    private void pickwinner() {
        try {
            BufferedReader buffer;
            buffer = new BufferedReader(new FileReader(getCSV));
            String readLine = "";
            while ((readLine = buffer.readLine()) != null) {
                String[] values = readLine.split(",");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(values);
                Random rand = new Random();

                Object[] tableLine = buffer.lines().toArray();
                int n = rand.nextInt(tableLine.length);
                JOptionPane.showMessageDialog(null, "The Winner is \n " + tableLine[n].toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        }
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnwinner;
    private javax.swing.JButton btnLoadCsv1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
