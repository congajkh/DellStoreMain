/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package DellStore.ui.JDialog;

import DellStore.dao.impl.ramDAOImpl;
import DellStore.entity.cpu;
import DellStore.entity.ram;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author docon
 */
public class ramJDialog extends javax.swing.JDialog {
private List<ram> listRAM = new ArrayList<>();
    /**
     * Creates new form ramJDialog
     */
    public ramJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
         DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[] {
        "STT", "Tên", "Dung Lượng", "Loại", "Trạng Thái"
    });
    tbl_bangram.setModel(model);

    loadTableRAM(); // Gọi sau khi gán model
    }
    private void loadTableRAM() {
    ramDAOImpl dao = new ramDAOImpl();
    listRAM = dao.findAll();

    DefaultTableModel model = (DefaultTableModel) tbl_bangram.getModel();
    model.setRowCount(0);

    int stt = 1;
    for (ram item : listRAM) {
        model.addRow(new Object[] {
            stt++,
            item.getTen(),
            item.getDung_luong(),
            item.getLoai(),
            item.getTrang_thai() == 1 ? "Còn hàng" : "Hết hàng"
        });
    }
}
    private void clearForm() {
    txt_tenram.setText("");
    txt_dungluong.setText("");
    txt_loai.setText("");
    rdo_hethang.setSelected(true);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txt_tenram = new javax.swing.JTextField();
        txt_dungluong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_loai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdo_conhang = new javax.swing.JRadioButton();
        rdo_hethang = new javax.swing.JRadioButton();
        btn_thoat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bangram = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Tên Ram");

        txt_tenram.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_tenram.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_tenram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenramActionPerformed(evt);
            }
        });

        txt_dungluong.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_dungluong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_dungluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dungluongActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Dung Lượng");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Loại");

        txt_loai.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_loai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loaiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Trạng Thái");

        buttonGroup1.add(rdo_conhang);
        rdo_conhang.setText("Còn Hàng");

        buttonGroup1.add(rdo_hethang);
        rdo_hethang.setText("Hết Hàng");

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Chức Năng"));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_them)
                    .addComponent(btn_sua))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_them)
                .addGap(18, 18, 18)
                .addComponent(btn_sua)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbl_bangram.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên", "Dung Lượng", "Loại", "Trạng Thái"
            }
        ));
        tbl_bangram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bangramMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bangram);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_tenram, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_dungluong, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_loai, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(rdo_conhang, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdo_hethang, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_thoat)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_tenram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_dungluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btn_thoat)
                    .addComponent(rdo_conhang)
                    .addComponent(rdo_hethang))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tenramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenramActionPerformed

    private void txt_dungluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dungluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dungluongActionPerformed

    private void txt_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loaiActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        this.dispose(); // đóng form hiện tại
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String ten = txt_tenram.getText().trim();
        String dungluong = txt_dungluong.getText().trim();
        String loai = txt_loai.getText().trim();
        int trangThai = rdo_conhang.isSelected() ? 1 : 0;

        ram newRAM = new ram();
        newRAM.setTen(ten);
        newRAM.setDung_luong(dungluong);
        newRAM.setLoai(loai);
        newRAM.setTrang_thai(trangThai);

        ramDAOImpl dao = new ramDAOImpl();
        dao.create(newRAM); // hàm insert trong DAO của bạn
        JOptionPane.showMessageDialog(this, "Thêm CPU thành công!");
        loadTableRAM(); // cập nhật lại bảng
        clearForm(); // xóa form nếu muốn
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
       int row = tbl_bangram.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(this, "Chọn RAM để sửa!");
        return;
    }

    ram entity = listRAM.get(row);
    entity.setTen(txt_tenram.getText().trim());
    entity.setDung_luong(txt_dungluong.getText().trim());
    entity.setLoai(txt_loai.getText().trim());
    entity.setTrang_thai(rdo_conhang.isSelected() ? 1 : 0);

    ramDAOImpl dao = new ramDAOImpl();
    dao.update(entity);

    JOptionPane.showMessageDialog(this, "Cập nhật RAM thành công!");
    loadTableRAM();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void tbl_bangramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bangramMouseClicked
       int row = tbl_bangram.getSelectedRow();
    if (row >= 0) {
        ram item = listRAM.get(row);
        txt_tenram.setText(item.getTen());
        txt_dungluong.setText(item.getDung_luong());
        txt_loai.setText(item.getLoai());
        if (item.getTrang_thai() == 1) {
            rdo_conhang.setSelected(true);
        } else {
            rdo_hethang.setSelected(true);
        }
    }
    }//GEN-LAST:event_tbl_bangramMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ramJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ramJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ramJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ramJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ramJDialog dialog = new ramJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdo_conhang;
    private javax.swing.JRadioButton rdo_hethang;
    private javax.swing.JTable tbl_bangram;
    private javax.swing.JTextField txt_dungluong;
    private javax.swing.JTextField txt_loai;
    private javax.swing.JTextField txt_tenram;
    // End of variables declaration//GEN-END:variables
}
