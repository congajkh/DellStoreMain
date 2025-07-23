/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DellStore.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
@Data
public class nhanvien {

    int id;
    String ma_nv;
    String ten_nv;
    boolean gioi_tinh;
    Date ngay_sinh;
    String dia_chi;
    String sdt;
    String email;
    int trang_thai;
    String chuc_vu;
    String tai_khoan;
    String mat_khau;
}
