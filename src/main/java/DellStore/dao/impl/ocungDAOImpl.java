package DellStore.dao.impl;

import DellStore.entity.ocung;
import DellStore.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ocungDAOImpl {
    public List<ocung> findAll() {
        List<ocung> list = new ArrayList<>();
        String sql = "SELECT * FROM ssd";
        try (ResultSet rs = XJdbc.executeQuery(sql)) {
            while (rs.next()) {
                ocung entity = ocung.builder()
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

    public void insert(ocung entity) {
        String sql = "INSERT INTO ocung (ten, dung_luong, loai, trang_thai) VALUES (?, ?, ?, ?)";
        XJdbc.executeUpdate(sql, entity.getTen(), entity.getDung_luong(), entity.getLoai(), entity.getTrang_thai());
    }

    public void update(ocung entity) {
        String sql = "UPDATE ocung SET ten=?, dung_luong=?, loai=?, trang_thai=? WHERE id=?";
        XJdbc.executeUpdate(sql, entity.getTen(), entity.getDung_luong(), entity.getLoai(), entity.getTrang_thai(), entity.getId());
    }
    public List<ocung> getAllOCung() {
    List<ocung> list = new ArrayList<>();
    String sql = "SELECT id, ten, dung_luong, loai, trang_thai FROM ssd"; // hoặc tên bảng thật
    try (Connection conn = XJdbc.openConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            ocung o = new ocung(
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
    public int getIdByTen(String ten) {
    String sql = "SELECT id FROM ssd WHERE ten = ?";
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
