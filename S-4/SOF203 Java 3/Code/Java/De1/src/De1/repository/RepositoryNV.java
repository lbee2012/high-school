/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1.repository;

import De1.model.NhanVien;
import java.sql.*;
import De1.utils.DbConnection;
import java.util.ArrayList;

/**
 *
 * @author longg
 */
public class RepositoryNV {
    DbConnection dbConnection;
    
    public ArrayList<NhanVien> getList() {
        String sql = "SELECT * FROM NhanVien";
        
        ArrayList<NhanVien> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String sdt = rs.getString("Sdt");
                Boolean trangThai = rs.getBoolean("TrangThai");
                
                NhanVien nv = new NhanVien(ma, ten, sdt, trangThai);
                result.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public NhanVien details(String id) {
        String sql = "SELECT * FROM NhanVien WHERE Ma = ?";
        
        NhanVien nv = new NhanVien();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String sdt = rs.getString("Sdt");
                Boolean trangThai = rs.getBoolean("TrangThai");
                
                nv = new NhanVien(ma, ten, sdt, trangThai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
    
    public Boolean add(NhanVien nv) {
        String sql = "INSERT INTO NhanVien (Ma, Ten, Sdt, TrangThai) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getSdt());
            ps.setObject(4, nv.getTrangThai());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(String id) {
        String sql = "DELETE FROM NhanVien WHERE Ma = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
