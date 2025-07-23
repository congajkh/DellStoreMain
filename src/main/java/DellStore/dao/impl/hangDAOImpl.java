package DellStore.dao.impl;

import DellStore.entity.hang;
import DellStore.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class hangDAOImpl {
    
    Connection conn = XJdbc.openConnection();
    public List<hang> findAll() {
        List<hang> list = new ArrayList<>();
        String sql = "SELECT * FROM hang";
        try (ResultSet rs = XJdbc.executeQuery(sql)) {
            while (rs.next()) {
                hang entity = hang.builder()
                    .id(rs.getInt("id"))
                    .ten(rs.getString("ten"))
                    .build();
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
     public int getIdByTen(String tenHang) {
        String sql = "SELECT id FROM hang WHERE ten = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tenHang);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public String getTenById(int id) {
        String sql = "SELECT ten FROM hang WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
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
}
