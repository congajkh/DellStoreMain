package DellStore.dao.impl;

import DellStore.entity.SanPhamChiTietViewModel;
import DellStore.entity.sanpham;
import DellStore.utils.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class sanphamDAO {

    public List<sanpham> findAll() {
        List<sanpham> list = new ArrayList<>();
        try {
            Connection con = XJdbc.openConnection();
            String sql = "SELECT  ten,ma_sp, mo_ta,loai_san_pham_id,hang_id,trang_thai,so_luong  FROM san_pham";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sanpham sp = new sanpham();

                sp.setTen(rs.getString("ten"));
                sp.setMasp(rs.getString("ma_sp"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setLoai_san_pham_id(rs.getInt("loai_san_pham_id"));
                sp.setHang_id(rs.getInt("hang_id"));
                sp.setTrang_thai(rs.getInt("trang_thai"));
                sp.setSo_luong(rs.getInt("so_luong"));

                list.add(sp);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

public boolean insert(sanpham sp) {
    try {
        Connection con = XJdbc.openConnection();
        String sql = "INSERT INTO san_pham (ten, ma_sp, mo_ta, loai_san_pham_id, hang_id, trang_thai, so_luong) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sp.getTen());
        ps.setString(2, sp.getMasp());
        ps.setString(3, sp.getMo_ta());
        ps.setInt(4, sp.getLoai_san_pham_id());
        ps.setInt(5, sp.getHang_id());
        ps.setInt(6, sp.getTrang_thai());
        ps.setInt(7, sp.getSo_luong());
        boolean success = ps.executeUpdate() > 0;
        ps.close();
        con.close();
        return success;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}


    public void update(sanpham sp) {
        try {
            Connection con = XJdbc.openConnection();
            String sql = "UPDATE san_pham SET ten=?, mo_ta=?, loai_san_pham_id=?, hang_id=? , trang_thai = ? WHERE ma_sp=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getTen());
            ps.setString(3, sp.getMo_ta());
            ps.setInt(4, sp.getLoai_san_pham_id());
            ps.setInt(5, sp.getHang_id());
            ps.setInt(6, sp.getTrang_thai());
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String masp) {
        try {
            Connection con = XJdbc.openConnection();
            String sql = "DELETE FROM san_pham WHERE ma_sp=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, masp);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//     SELECT sp.ten AS ten_sp, ram.ten AS ram, cpu.ten AS cpu, ssd.ten AS ocung,
//               gpu.ten AS card, h.ten AS hang, sr.ma_serial AS serial, ctsp.gia_ban, sp.trang_thai
//                 //        JOIN san_pham sp ON sp.id = ctsp.san_pham_id
    public List<SanPhamChiTietViewModel> findAllView() {
    List<SanPhamChiTietViewModel> list = new ArrayList<>();
    String sql = """
               SELECT ctsp.id, sp.ten AS ten_sp, cpu.ten AS cpu, gpu.ten AS card, h.ten AS hang, ssd.dung_luong AS ocung,
                 ram.dung_luong AS ram, sr.ma_serial AS serial, ctsp.gia_ban, sp.trang_thai
        FROM chi_tiet_san_pham ctsp
       JOIN san_pham sp ON sp.id = ctsp.san_pham_id
        JOIN ram ON ram.id = ctsp.ram_id
        JOIN cpu ON cpu.id = ctsp.cpu_id
        JOIN ssd ON ssd.id = ctsp.ssd_id
        JOIN gpu ON gpu.id = ctsp.gpu_id
        JOIN hang h ON h.id = sp.hang_id
        LEFT JOIN serial sr ON ctsp.serial_id = sr.id
    """;

    try (Connection con = XJdbc.openConnection();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            SanPhamChiTietViewModel sp = new SanPhamChiTietViewModel(
                    rs.getInt("id"),
                rs.getString("ten_sp"),
                rs.getString("cpu"),
                rs.getString("card"),
                rs.getString("hang"),
                rs.getString("ocung"),
                rs.getString("ram"),
                rs.getString("serial"),
                rs.getBigDecimal("gia_ban"),
                rs.getBoolean("trang_thai")
            );
            list.add(sp);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
}
    public int findIdByName(String tenSP) {
    String sql = "SELECT id FROM san_pham WHERE ten = ?";
    try (Connection con = XJdbc.openConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, tenSP);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("id");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return -1;
}
public int getIdByMaSP(String maSP) {
    int id = -1;
    String sql = "SELECT id FROM san_pham WHERE ma_sp = ?";
    try (Connection con = XJdbc.openConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, maSP);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            id = rs.getInt("id");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
}
public sanpham findById(int id) {
    String sql = "SELECT * FROM san_pham WHERE id = ?";
    try (Connection conn = XJdbc.openConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            sanpham sp = new sanpham();
            sp.setId(rs.getInt("id"));
            sp.setTen(rs.getString("ten"));
            sp.setMasp(rs.getString("ma_sp"));
            sp.setMo_ta(rs.getString("mo_ta"));
            sp.setLoai_san_pham_id(rs.getInt("loai_san_pham_id"));
            sp.setHang_id(rs.getInt("hang_id"));
            sp.setSo_luong(rs.getInt("so_luong"));
            sp.setTrang_thai(rs.getInt("trang_thai"));
            return sp;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}



}
