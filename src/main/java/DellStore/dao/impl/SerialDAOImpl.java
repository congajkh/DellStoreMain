/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DellStore.dao.impl;

import DellStore.entity.serial;
import DellStore.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author docon
 */
public class SerialDAOImpl {
    Connection con = XJdbc.openConnection();
    
   public List<serial> getBySanPhamId(int sanPhamId) {
    List<serial> list = new ArrayList<>();
    String sql = "SELECT * FROM serial WHERE san_pham_id = ?";
    try (
        Connection con = XJdbc.openConnection();
        PreparedStatement ps = con.prepareStatement(sql);
    ) {
        ps.setInt(1, sanPhamId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            serial s = new serial();
            s.setId(rs.getInt("id"));
            s.setMa_serial(rs.getString("ma_serial"));
            s.setSan_pham_id(rs.getInt("san_pham_id"));
            s.setTrang_thai(rs.getInt("trang_thai"));
            list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}
    public int getIdByMa(String maSerial) {
        String sql = "SELECT id FROM serial WHERE ma_serial = ?";
        try (Connection con = XJdbc.openConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maSerial);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public void insert(serial s) {
        try {
            Connection con = XJdbc.openConnection();
            String sql = "INSERT INTO serial (ma_serial, san_pham_id, trang_thai) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getMa_serial());
            ps.setInt(2, s.getSan_pham_id());
            ps.setInt(3, s.getTrang_thai());
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getIdByMaSerial(String maSerial) {
    int id = -1;
    String sql = "SELECT id FROM serial WHERE ma_serial = ?";
    try (Connection con = XJdbc.openConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, maSerial);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            id = rs.getInt("id");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
}

}
