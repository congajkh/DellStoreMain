/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package DellStore.ui.JDialog;

import DellStore.dao.impl.cardDAOImpl;
import DellStore.dao.impl.chitietsanphamDAO;
import DellStore.dao.impl.cpuDAOImpl;
import DellStore.dao.impl.ocungDAOImpl;
import DellStore.dao.impl.ramDAOImpl;
import DellStore.dao.impl.sanphamDAO;
import DellStore.entity.card;
import DellStore.entity.chitietsanpham;
import DellStore.entity.cpu;
import DellStore.entity.ocung;
import DellStore.entity.ram;
import DellStore.entity.sanpham;
import DellStore.entity.serial;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author docon
 */
public class ChiTietSanPhamJDialog extends javax.swing.JDialog {
     private int sanPhamId;
    private List<serial> listSerial;
    private cpuDAOImpl cpuDAO = new cpuDAOImpl();
    private ramDAOImpl ramDAO = new ramDAOImpl();
    private ocungDAOImpl ssdDAO = new ocungDAOImpl();
    private cardDAOImpl gpuDAO = new cardDAOImpl();
    private chitietsanphamDAO ctspDAO = new chitietsanphamDAO();
    private sanphamDAO spDAO = new sanphamDAO();
    /**
     * Creates new form ChiTietSanPhamJDialog
     */
    public ChiTietSanPhamJDialog(java.awt.Frame parent, boolean modal, int sanPhamId, List<serial> dsSerial) {
        super(parent, modal);
        initComponents();
         this.sanPhamId = sanPhamId;
        this.listSerial = dsSerial;
       loadComboBoxData();
        loadTenSanPham();
        fillComboBoxSerial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_lammoi = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();
        btn_themchitiet = new javax.swing.JButton();
        cbo_serial = new javax.swing.JComboBox<>();
        cbo_cpu = new javax.swing.JComboBox<>();
        cbo_ram = new javax.swing.JComboBox<>();
        cbo_ocung = new javax.swing.JComboBox<>();
        cbo_card = new javax.swing.JComboBox<>();
        txt_giaban = new javax.swing.JTextField();
        txt_tensanpham = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("🖥️  THÊM CHI TIẾT SẢN PHẨM");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên Sản Phẩm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Serial:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cpu:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ram:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ổ Cứng:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Card:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Giá Bán:");

        btn_lammoi.setText("Làm Mới");

        btn_huy.setText("Hủy");

        btn_themchitiet.setText("Thêm Chi Tiết");
        btn_themchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themchitietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbo_serial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbo_card, 0, 224, Short.MAX_VALUE)
                                    .addComponent(cbo_ocung, 0, 224, Short.MAX_VALUE)
                                    .addComponent(cbo_ram, 0, 224, Short.MAX_VALUE)
                                    .addComponent(cbo_cpu, 0, 224, Short.MAX_VALUE)
                                    .addComponent(txt_giaban)
                                    .addComponent(txt_tensanpham, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 107, Short.MAX_VALUE)
                        .addComponent(btn_huy)
                        .addGap(35, 35, 35)
                        .addComponent(btn_lammoi)
                        .addGap(39, 39, 39)
                        .addComponent(btn_themchitiet)
                        .addGap(94, 94, 94))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_card, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbo_cpu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_ram, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(cbo_ocung, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_huy)
                    .addComponent(btn_lammoi)
                    .addComponent(btn_themchitiet))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themchitietActionPerformed
        try {
            serial selectedSerial = (serial) cbo_serial.getSelectedItem();
            int serialID = selectedSerial.getId();
            if (selectedSerial == null) {
    JOptionPane.showMessageDialog(this, "Vui lòng chọn Serial");
    return;
}

            int cpuID = ((cpu) cbo_cpu.getSelectedItem()).getId();
            int ramID = ((ram) cbo_ram.getSelectedItem()).getId();
            int ssdID = ((ocung) cbo_ocung.getSelectedItem()).getId();
            int gpuID = ((card) cbo_card.getSelectedItem()).getId();
            BigDecimal gia = new BigDecimal(txt_giaban.getText());

            chitietsanpham ctsp = new chitietsanpham();
            ctsp.setSan_pham_id(sanPhamId);
            ctsp.setSerial_id(serialID);
            ctsp.setCpu_id(cpuID);
            ctsp.setRam_id(ramID);
            ctsp.setSsd_id(ssdID);
            ctsp.setGpu_id(gpuID);
            ctsp.setGia_ban(gia);
         
            ctspDAO.update(ctsp); // update dựa vào serial_id + sanpham_id
            
            JOptionPane.showMessageDialog(this, "Cập nhật thành công cho serial: " + selectedSerial.getMa_serial());

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi cập nhật: " + ex.getMessage());
        }
    
    }//GEN-LAST:event_btn_themchitietActionPerformed
    
    public void fillComboBoxSerial() {
    DefaultComboBoxModel<serial> model = new DefaultComboBoxModel<>();
    for (serial s : listSerial) {
        model.addElement(s);
    }
    cbo_serial.setModel(model);
}

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    // Tạo dữ liệu giả để test
    int sanPhamId = 1; // hoặc ID có thật trong DB
    List<serial> listSerial = new ArrayList<>(); // hoặc tạo vài bản ghi giả nếu muốn

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            ChiTietSanPhamJDialog dialog = new ChiTietSanPhamJDialog(new javax.swing.JFrame(), true, sanPhamId, listSerial);
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
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_themchitiet;
    private javax.swing.JComboBox<card> cbo_card;
    private javax.swing.JComboBox<cpu> cbo_cpu;
    private javax.swing.JComboBox<ocung> cbo_ocung;
    private javax.swing.JComboBox<ram> cbo_ram;
    private javax.swing.JComboBox<serial> cbo_serial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_giaban;
    private javax.swing.JTextField txt_tensanpham;
    // End of variables declaration//GEN-END:variables
 private void loadTenSanPham() {
     
        sanpham sp = spDAO.findById(sanPhamId);
        if (sp != null) {
            txt_tensanpham.setText(sp.getTen());
        }
    }
 private void loadComboBoxData() {
//        // Load serial
//        for (serial s : listSerial) {
//            cbo_serial.addItem(s);
//        }

        // Load CPU
        for (cpu c : cpuDAO.findAll()) {
            cbo_cpu.addItem(c);
        }

        // Load RAM
        for (ram r : ramDAO.findAll()) {
            cbo_ram.addItem(r);
        }

        // Load SSD
        for (ocung s : ssdDAO.findAll()) {
            cbo_ocung.addItem(s);
        }

        // Load GPU
        for (card g : gpuDAO.findAll()) {
            cbo_card.addItem(g);
        }
    }
}
