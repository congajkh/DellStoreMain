package DellStore.dao.impl;

import DellStore.entity.ram;
import DellStore.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ramDAOImpl {
    public List<ram> findAll() {
        List<ram> list = new ArrayList<>();
        String sql = "SELECT * FROM ram";
        try (ResultSet rs = XJdbc.executeQuery(sql)) {
            while (rs.next()) {
                ram entity = ram.builder()
                    .id(rs.getInt("id"))
                    .ten(rs.getString("ten"))
                    .dung_luong(rs.getString("dung_luong"))
                    .loai(rs.getString("loai"))
                    .trang_thai(rs.getInt("trang_thai"))
                    .build();
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public List<ram> getAllRAM() {
    List<ram> list = new ArrayList<>();
    String sql = "SELECT id, ten, dung_luong,loai, trang_thai FROM ram"; // hoặc tên bảng thật
    try (Connection conn = XJdbc.openConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            ram o = new ram(
                rs.getInt("id"),
                rs.getString("ten"),
                    rs.getString("dung_luong"),
                rs.getString("loai"),
                rs.getInt("trang_thai")
            );
            list.add(o);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}

    public void create(ram entity) {
        String sql = "INSERT INTO ram (ten, dung_luong, loai, trang_thai) VALUES (?, ?, ?, ?)";
        XJdbc.executeUpdate(sql, entity.getTen(), entity.getDung_luong(), entity.getLoai(), entity.getTrang_thai());
    }

    public void update(ram entity) {
        String sql = "UPDATE ram SET ten=?, dung_luong=?, loai=?, trang_thai=? WHERE id=?";
        XJdbc.executeUpdate(sql, entity.getTen(), entity.getDung_luong(), entity.getLoai(), entity.getTrang_thai(), entity.getId());
    }
    public int getIdByTen(String ten) {
    String sql = "SELECT id FROM ram WHERE ten = ?";
    try (Connection con = XJdbc.openConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, ten);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("id");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return -1;
}

    
}
