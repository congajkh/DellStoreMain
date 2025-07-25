/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DellStore.ui;

import DellStore.ui.manager.NhanVienJPanel;
import DellStore.ui.manager.homePanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import DellStore.controller.formController;
//import DellStore.ui.manager.KhachHangJPanel;
//import DellStore.ui.manager.KhuyenMaiJPanel;
import DellStore.ui.manager.SanPhamJPanel;
import DellStore.ui.manager.ThongKeJPanel;
//import DellStore.ui.manager.banhangJPanel;
//import DellStore.ui.manager.hoadonJPanel;

/**
 *
 * @author Gigabyte
 */
public class Form1 extends javax.swing.JFrame implements formController {

    /**
     * Creates new form Form
     */
    public void showPanel(javax.swing.JPanel panel) {

        pnlCCenter.removeAll();                   // Xóa panel cũ
        pnlCCenter.setLayout(new java.awt.BorderLayout());
        pnlCCenter.add(panel, java.awt.BorderLayout.CENTER);
        pnlCCenter.revalidate();                 // Cập nhật lại giao diện
        pnlCCenter.repaint();

    }

    public Form1() {
        initComponents();
        setLocationRelativeTo(null);
        init();
// this.setExtendedState(JFrame.MAXIMIZED_BOTH);  // FULLSCREE
        JButton[] btns = {btn_thongke, btn_khachhang, btn_nhanvien, btn_khuyenmai, btn_sanpham, btn_banhang, btn_hoadon};
        for (JButton btn : btns) {
            btn.setOpaque(true); // QUAN TRỌNG: cho phép vẽ nền đúng
            btn.setBorderPainted(false);
            btn.setFocusPainted(false);
            btn.setContentAreaFilled(false);
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    btn.setOpaque(true);
                    btn.setBackground(new Color(255, 183, 77));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    btn.setOpaque(true);
                    btn.setBackground(new Color(14, 36, 49));

                }
            });

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSlide = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_banhang = new javax.swing.JButton();
        btn_sanpham = new javax.swing.JButton();
        btn_nhanvien = new javax.swing.JButton();
        btn_hoadon = new javax.swing.JButton();
        btn_khuyenmai = new javax.swing.JButton();
        btn_khachhang = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        btn_thongke = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlCTop = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlCCenter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSlide.setBackground(new java.awt.Color(14, 36, 49));
        pnlSlide.setPreferredSize(new java.awt.Dimension(180, 0));

        jLabel2.setMaximumSize(new java.awt.Dimension(130, 150));
        jLabel2.setPreferredSize(new java.awt.Dimension(130, 145));
        pnlSlide.add(jLabel2);

        btn_banhang.setBackground(new java.awt.Color(14, 36, 49));
        btn_banhang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_banhang.setForeground(new java.awt.Color(255, 255, 255));
        btn_banhang.setText("Bán Hàng");
        btn_banhang.setBorderPainted(false);
        btn_banhang.setContentAreaFilled(false);
        btn_banhang.setFocusPainted(false);
        btn_banhang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_banhang.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_banhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_banhangActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_banhang);

        btn_sanpham.setBackground(new java.awt.Color(14, 36, 49));
        btn_sanpham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_sanpham.setForeground(new java.awt.Color(255, 255, 255));
        btn_sanpham.setText("Sản Phẩm");
        btn_sanpham.setBorderPainted(false);
        btn_sanpham.setContentAreaFilled(false);
        btn_sanpham.setFocusPainted(false);
        btn_sanpham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_sanpham.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_sanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sanphamActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_sanpham);

        btn_nhanvien.setBackground(new java.awt.Color(14, 36, 49));
        btn_nhanvien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_nhanvien.setForeground(new java.awt.Color(255, 255, 255));
        btn_nhanvien.setText("Nhân Viên");
        btn_nhanvien.setBorderPainted(false);
        btn_nhanvien.setContentAreaFilled(false);
        btn_nhanvien.setFocusPainted(false);
        btn_nhanvien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_nhanvien.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nhanvienActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_nhanvien);

        btn_hoadon.setBackground(new java.awt.Color(14, 36, 49));
        btn_hoadon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hoadon.setForeground(new java.awt.Color(255, 255, 255));
        btn_hoadon.setText("Hóa Đơn");
        btn_hoadon.setBorderPainted(false);
        btn_hoadon.setContentAreaFilled(false);
        btn_hoadon.setFocusPainted(false);
        btn_hoadon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_hoadon.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hoadonActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_hoadon);

        btn_khuyenmai.setBackground(new java.awt.Color(14, 36, 49));
        btn_khuyenmai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_khuyenmai.setForeground(new java.awt.Color(255, 255, 255));
        btn_khuyenmai.setText("Khuyến Mãi");
        btn_khuyenmai.setBorderPainted(false);
        btn_khuyenmai.setContentAreaFilled(false);
        btn_khuyenmai.setFocusPainted(false);
        btn_khuyenmai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_khuyenmai.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_khuyenmai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khuyenmaiActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_khuyenmai);

        btn_khachhang.setBackground(new java.awt.Color(14, 36, 49));
        btn_khachhang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_khachhang.setForeground(new java.awt.Color(255, 255, 255));
        btn_khachhang.setText("Khách Hàng");
        btn_khachhang.setBorderPainted(false);
        btn_khachhang.setContentAreaFilled(false);
        btn_khachhang.setFocusPainted(false);
        btn_khachhang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_khachhang.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_khachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khachhangActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_khachhang);

        btn_thoat.setBackground(new java.awt.Color(14, 36, 49));
        btn_thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_thoat.setForeground(new java.awt.Color(255, 255, 255));
        btn_thoat.setText("Đăng Xuất");
        btn_thoat.setBorderPainted(false);
        btn_thoat.setContentAreaFilled(false);
        btn_thoat.setFocusPainted(false);
        btn_thoat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_thoat.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_thoat);

        btn_thongke.setBackground(new java.awt.Color(14, 36, 49));
        btn_thongke.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_thongke.setForeground(new java.awt.Color(255, 255, 255));
        btn_thongke.setText("Thống  Kê");
        btn_thongke.setBorderPainted(false);
        btn_thongke.setContentAreaFilled(false);
        btn_thongke.setFocusPainted(false);
        btn_thongke.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_thongke.setPreferredSize(new java.awt.Dimension(180, 70));
        btn_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thongkeActionPerformed(evt);
            }
        });
        pnlSlide.add(btn_thongke);

        pnlRoot.add(pnlSlide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(243, 244, 246));
        pnlCenter.setPreferredSize(new java.awt.Dimension(2000, 918));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        pnlCTop.setBackground(new java.awt.Color(255, 183, 77));
        pnlCTop.setPreferredSize(new java.awt.Dimension(0, 130));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(1, 110));

        jLabel1.setText("Ten");

        jLabel3.setText("Chuc vu");

        jLabel4.setText("Image");

        javax.swing.GroupLayout pnlCTopLayout = new javax.swing.GroupLayout(pnlCTop);
        pnlCTop.setLayout(pnlCTopLayout);
        pnlCTopLayout.setHorizontalGroup(
            pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCTopLayout.createSequentialGroup()
                .addContainerGap(7466, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCTopLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(305, 305, 305))
                    .addGroup(pnlCTopLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(105, 105, 105))))
        );
        pnlCTopLayout.setVerticalGroup(
            pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCTopLayout.createSequentialGroup()
                .addGroup(pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addGroup(pnlCTopLayout.createSequentialGroup()
                        .addGroup(pnlCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCTopLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1))
                            .addGroup(pnlCTopLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4)))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlCenter.add(pnlCTop, java.awt.BorderLayout.PAGE_START);

        pnlCCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlCCenter.setPreferredSize(new java.awt.Dimension(0, 100));

        javax.swing.GroupLayout pnlCCenterLayout = new javax.swing.GroupLayout(pnlCCenter);
        pnlCCenter.setLayout(pnlCCenterLayout);
        pnlCCenterLayout.setHorizontalGroup(
            pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCCenterLayout.setVerticalGroup(
            pnlCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
        );

        pnlCenter.add(pnlCCenter, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_khachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khachhangActionPerformed
        // TODO add your handling code here:
        this.showKhachHangJPanel(this);
    }//GEN-LAST:event_btn_khachhangActionPerformed

    private void btn_nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nhanvienActionPerformed
        // TODO add your handling code here:
        this.showNhanVienJPanel(this);
    }//GEN-LAST:event_btn_nhanvienActionPerformed

    private void btn_khuyenmaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khuyenmaiActionPerformed
        // TODO add your handling code here:
        this.showKhuyenMaiJPanel(this);
    }//GEN-LAST:event_btn_khuyenmaiActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        lloginJDialog1 dialog = new lloginJDialog1(this, true);
        dialog.setVisible(true);
        if (!dialog.isLoggedIn()) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_banhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_banhangActionPerformed
        // TODO add your handling code here:
//        this.show
 this.showBanHangJPanel(this);
    }//GEN-LAST:event_btn_banhangActionPerformed

    private void btn_sanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sanphamActionPerformed
        // TODO add your handling code here:
        this.showSanPhamJPanel(this);

    }//GEN-LAST:event_btn_sanphamActionPerformed

    private void btn_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoadonActionPerformed
        // TODO add your handling code here:
        this.showHoaDonJPanel(this);
    }//GEN-LAST:event_btn_hoadonActionPerformed

    private void btn_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thongkeActionPerformed
        // TODO add your handling code here:
        this.showThongKeJPanel(this);
    }//GEN-LAST:event_btn_thongkeActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_banhang;
    private javax.swing.JButton btn_hoadon;
    private javax.swing.JButton btn_khachhang;
    private javax.swing.JButton btn_khuyenmai;
    private javax.swing.JButton btn_nhanvien;
    private javax.swing.JButton btn_sanpham;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_thongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlCCenter;
    private javax.swing.JPanel pnlCTop;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSlide;
    // End of variables declaration//GEN-END:variables

    @Override
    public void init() {
        this.showHomeJPanel(this);
    }

    @Override
    public void showHomeJPanel(JFrame frame) {
        homePanel panel = new homePanel();
        showPanel(panel);
    }

    @Override
    public void showBanHangJPanel(JFrame frame) {
//        banhangJPanel panel = new banhangJPanel();
//        showPanel(panel);
    }

    @Override
    public void showHoaDonJPanel(JFrame frame) {
//        hoadonJPanel panel = new hoadonJPanel();
//        showPanel(panel);
    }

    @Override
    public void showKhachhangJPanel(JFrame frame) {
//  KhachHangJPanel panel = new KhachHangJPanel();
//        showPanel(panel);
    }
//    @Override

    public void showNhanVienJPanel(JFrame frame) {
        NhanVienJPanel nhanVienPanel = new NhanVienJPanel();
        showPanel(nhanVienPanel);
    }

    public void showSanPhamJPanel(JFrame frame) {
        SanPhamJPanel sanPhamJPanel = new SanPhamJPanel();
        showPanel(sanPhamJPanel);
    }

    public void showKhuyenMaiJPanel(JFrame frame) {
//        KhuyenMaiJPanel khuyenmaiJPanel = new KhuyenMaiJPanel();
//        showPanel(khuyenmaiJPanel);
    }
    public void showKhachHangJPanel(JFrame frame) {
//        KhachHangJPanel JPanel = new KhachHangJPanel();
//        showPanel(JPanel);
    }
    public void showThongKeJPanel(JFrame frame) {
      ThongKeJPanel JPanel = new ThongKeJPanel();
        showPanel(JPanel);
    }
}
