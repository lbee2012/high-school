/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2.repository;

import java.sql.*;
import java.util.ArrayList;
import kiemtra2.model.HocSinh;
import kiemtra2.utils.DbConnection;

/**
 *
 * @author longg
 */
public class RepositoryHS {
    DbConnection dbConnection;
    
    public ArrayList<HocSinh> getList() {
        String sql = "SELECT * FROM HocSinh";
        
        ArrayList<HocSinh> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maHocSinh = rs.getString("MaHocSinh");
                String hoTen = rs.getString("HoTen");
                Boolean gioiTinh = rs.getBoolean("GioiTinh");
                String lop = rs.getString("Lop");
                
                HocSinh hs = new HocSinh(maHocSinh, hoTen, gioiTinh, lop);
                result.add(hs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public HocSinh details(String ma) {
        String sql = "SELECT * FROM HocSinh WHERE MaHocSinh = ?";
        
        HocSinh hs = new HocSinh();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maHocSinh = rs.getString("MaHocSinh");
                String hoTen = rs.getString("HoTen");
                Boolean gioiTinh = rs.getBoolean("GioiTinh");
                String lop = rs.getString("Lop");
                
                hs = new HocSinh(maHocSinh, hoTen, gioiTinh, lop);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hs;
    }
    
    public Boolean add(HocSinh hs) {
        String sql = "INSERT INTO HocSinh VALUES (?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, hs.getMaHocSinh());
            ps.setObject(2, hs.getHoTen());
            ps.setObject(3, hs.getGioiTinh());
            ps.setObject(4, hs.getLop());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(String ma) {
        String sql = "DELETE HocSinh WHERE MaHocSinh = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<HocSinh> search(String ten) {
        String sql = "SELECT * FROM HocSinh WHERE HoTen LIKE ?";
        
        ArrayList<HocSinh> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, "%" + ten + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maHocSinh = rs.getString("MaHocSinh");
                String hoTen = rs.getString("HoTen");
                Boolean gioiTinh = rs.getBoolean("GioiTinh");
                String lop = rs.getString("Lop");
                
                HocSinh hs = new HocSinh(maHocSinh, hoTen, gioiTinh, lop);
                result.add(hs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
