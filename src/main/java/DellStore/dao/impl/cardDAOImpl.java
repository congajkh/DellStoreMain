package DellStore.dao.impl;

import DellStore.entity.card;
import DellStore.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cardDAOImpl {
    public List<card> findAll() {
        List<card> list = new ArrayList<>();
        String sql = "SELECT * FROM gpu";
        try (ResultSet rs = XJdbc.executeQuery(sql)) {
            while (rs.next()) {
                card entity = card.builder()
                    .id(rs.getInt("id"))
                    .ten(rs.getString("ten"))
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
     public List<card> getAllCard() {
    List<card> list = new ArrayList<>();
    String sql = "SELECT id, ten, loai, trang_thai FROM gpu"; // hoặc tên bảng thật
    try (Connection conn = XJdbc.openConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            card o = new card(
                rs.getInt("id"),
                rs.getString("ten"),
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

    public void insert(card entity) {
        String sql = "INSERT INTO card (ten, loai, trang_thai) VALUES (?, ?, ?)";
        XJdbc.executeUpdate(sql, entity.getTen(), entity.getLoai(), entity.getTrang_thai());
    }

    public void update(card entity) {
        String sql = "UPDATE card SET ten=?, loai=?, trang_thai=? WHERE id=?";
        XJdbc.executeUpdate(sql, entity.getTen(), entity.getLoai(), entity.getTrang_thai(), entity.getId());
    }
    public int getIdByTen(String ten) {
    String sql = "SELECT id FROM gpu WHERE ten = ?";
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
