/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DellStore.dao.impl;

import DellStore.entity.chitietsanpham;
import DellStore.entity.ocung;
import DellStore.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author docon
 */
public class chitietsanphamDAO {
    public void insert(chitietsanpham ctsp) {
        String sql = """
            INSERT INTO chi_tiet_san_pham ( serial_id,san_pham_id, cpu_id, ram_id, ssd_id, gpu_id, gia_ban)
            VALUES (?, ?, ?, ?, ?, ?, ?)
        """;
        try (Connection con = XJdbc.openConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, ctsp.getSerial_id());
            ps.setInt(2, ctsp.getSan_pham_id());
            ps.setInt(3, ctsp.getCpu_id());
            ps.setInt(4, ctsp.getRam_id());
            ps.setInt(5, ctsp.getSsd_id());
            ps.setInt(6, ctsp.getGpu_id());
            ps.setBigDecimal(7, ctsp.getGia_ban());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<chitietsanpham> findBySanPhamId(int sanPhamId) {
        List<chitietsanpham> list = new ArrayList<>();
        String sql = "SELECT * FROM chi_tiet_san_pham WHERE san_pham_id = ?";

        try (Connection conn = XJdbc.openConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, sanPhamId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                chitietsanpham ctsp = new chitietsanpham();
                ctsp.setId(rs.getInt("id"));
                ctsp.setSerial_id(rs.getInt("serial_id"));
                ctsp.setSan_pham_id(rs.getInt("san_pham_id"));
                ctsp.setCpu_id(rs.getInt("cpu_id"));
                ctsp.setRam_id(rs.getInt("ram_id"));
                ctsp.setSsd_id(rs.getInt("ssd_id"));
                ctsp.setGpu_id(rs.getObject("gpu_id") != null ? rs.getInt("gpu_id") : null);
                ctsp.setGia_ban(rs.getBigDecimal("gia_ban"));
                ctsp.setSo_luong_ton(rs.getInt("so_luong_ton"));

                list.add(ctsp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<chitietsanpham> findAll() {
        List<chitietsanpham> list = new ArrayList<>();
        String sql = "SELECT * FROM chi_tiet_san_pham";
        try (ResultSet rs = XJdbc.executeQuery(sql)) {
            while (rs.next()) {
                chitietsanpham entity = chitietsanpham.builder()
                        .id(rs.getInt("id"))
                        .cpu_id(rs.getInt("cpu_id"))
                        .ram_id(rs.getInt("ram_id"))
                        .ssd_id(rs.getInt("ssd_id"))
                        .gpu_id(rs.getInt("gpu_id"))
                        .serial_id(rs.getInt("serial_id"))
                        .gia_ban(rs.getBigDecimal("gia_ban"))
                        .so_luong_ton(rs.getInt("so_luong_ton"))
                        .build();
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public chitietsanpham findById(int id) {
        String sql = "SELECT * FROM chi_tiet_san_pham WHERE id = ?";
        try (ResultSet rs = XJdbc.executeQuery(sql, id)) {
            if (rs.next()) {
                return chitietsanpham.builder()
                        .id(rs.getInt("id"))
                        .cpu_id(rs.getInt("cpu_id"))
                        .ram_id(rs.getInt("ram_id"))
                        .ssd_id(rs.getInt("ssd_id"))
                        .gpu_id(rs.getInt("gpu_id"))
                        .serial_id(rs.getInt("serial_id"))
                        .gia_ban(rs.getBigDecimal("gia_ban"))
                        .so_luong_ton(rs.getInt("so_luong_ton"))
                        .build();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    
//    public boolean update(chitietsanpham ctsp) {
//    String sql = """
//        UPDATE chi_tiet_san_pham SET serial_id=?, san_pham_id=?, cpu_id=?, ram_id=?, ssd_id=?, gpu_id=?, gia_ban=?
//        WHERE id=?
//    """;
//
//    try (Connection con = XJdbc.openConnection(); 
//            PreparedStatement ps = con.prepareStatement(sql)) {
//        ps.setInt(1, ctsp.getSerial_id());
//        ps.setInt(2, ctsp.getSan_pham_id());
//        ps.setInt(3, ctsp.getCpu_id());
//        ps.setInt(4, ctsp.getRam_id());
//        ps.setInt(5, ctsp.getSsd_id());
//        ps.setInt(6, ctsp.getGpu_id());
//        ps.setBigDecimal(7, ctsp.getGia_ban());
//        ps.setInt(0, ctsp.getId());
//
//        return ps.executeUpdate() > 0;
//    } catch (Exception e) {
//        e.printStackTrace();
//        return false;
//    }
//}
public boolean update(chitietsanpham ctsp) {
    String sql = """
        UPDATE chi_tiet_san_pham
        SET cpu_id=?, ram_id=?, ssd_id=?, gpu_id=?, gia_ban=?
        WHERE serial_id=? AND san_pham_id=?
    """;

    try (Connection con = XJdbc.openConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, ctsp.getCpu_id());
        ps.setInt(2, ctsp.getRam_id());
        ps.setInt(3, ctsp.getSsd_id());
        ps.setInt(4, ctsp.getGpu_id());
        ps.setBigDecimal(5, ctsp.getGia_ban());
        ps.setInt(6, ctsp.getSerial_id());
        ps.setInt(7, ctsp.getSan_pham_id());

        return ps.executeUpdate() > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}


    public String getTenById(String tableName, int id) {
        String sql = "SELECT ten FROM " + tableName + " WHERE id = ?";
        try (Connection conn = XJdbc.openConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("ten");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getIdByName(String tableName, String ten) {
        int id = -1;
        String sql = "SELECT id FROM " + tableName + " WHERE ten = ?";
        try (Connection conn = XJdbc.openConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, ten);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public int getCpuId(String ten) {
        return getIdByName("cpu", ten);
    }

    public int getRamId(String ten) {
        return getIdByName("ram", ten);
    }

    public int getSsdId(String ten) {
        return getIdByName("ssd", ten);
    }

    public int getGpuId(String ten) {
        return getIdByName("gpu", ten);
    }

    public List<String> getAllNamesFromTable(String tableName) {
        List<String> list = new ArrayList<>();
        String sql = "SELECT ten FROM " + tableName;
        try (Connection conn = XJdbc.openConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(rs.getString("ten"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


}
