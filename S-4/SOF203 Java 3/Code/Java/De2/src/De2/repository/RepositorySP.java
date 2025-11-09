/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2.repository;

import De2.model.SanPham;
import java.sql.*;
import De2.utils.DbConnection;
import java.util.ArrayList;

/**
 *
 * @author longg
 */
public class RepositorySP {
    DbConnection dbConnection;
    
    public ArrayList<SanPham> getList() {
        String sql = "SELECT * FROM SanPham";
        
        ArrayList<SanPham> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Boolean trangThai = rs.getBoolean("TrangThai");
                Double giaBan = rs.getDouble("GiaBan");
                
                SanPham sp = new SanPham(ma, ten, giaBan, trangThai);
                result.add(sp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public SanPham details(String id) {
        String sql = "SELECT * FROM SanPham WHERE Ma = ?";
        
        SanPham sp = new SanPham();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Double giaBan = rs.getDouble("GiaBan");
                Boolean trangThai = rs.getBoolean("TrangThai");
                
                sp = new SanPham(ma, ten, giaBan, trangThai);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp;
    }
    
    public Boolean add(SanPham sp) {
        String sql = "INSERT INTO SanPham (Ma, Ten, GiaBan, TrangThai) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getTen());
            ps.setObject(3, sp.getGiaBan());
            ps.setObject(4, sp.getTrangThai());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(SanPham sp) {
        String sql = "UPDATE SanPham SET Ten = ?, GiaBan = ?, TrangThai = ? WHERE Ma = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, sp.getTen());
            ps.setObject(2, sp.getGiaBan());
            ps.setObject(3, sp.getTrangThai());
            ps.setObject(4, sp.getMa());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<SanPham> search(Double min, Double max) {
        String sql = "SELECT * FROM SanPham WHERE GiaBan BETWEEN ? AND ?";
        
        ArrayList<SanPham> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, min);
            ps.setObject(2, max);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Double giaBan = rs.getDouble("GiaBan");
                Boolean trangThai = rs.getBoolean("TrangThai");
                
                SanPham sp = new SanPham(ma, ten, giaBan, trangThai);
                result.add(sp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
