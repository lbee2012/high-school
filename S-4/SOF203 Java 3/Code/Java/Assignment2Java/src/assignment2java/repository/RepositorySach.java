/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2java.repository;

import assignment2java.model.Sach;
import assignment2java.utils.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author longg
 */
public class RepositorySach {
    DbConnection dbConnection;
    
    public ArrayList<Sach> getList() {
        String sql = "SELECT * FROM Sach";
        
        ArrayList<Sach> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer ID = rs.getInt("ID");
                String tenSach = rs.getString("TenSach");
                Double giaBan = rs.getDouble("GiaBan");
                String loai = rs.getString("Loai");
                
                Sach s = new Sach(ID, tenSach, giaBan, loai);
                result.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return result;
    }
    
    public Sach details(Integer ma) {
        String sql = "SELECT * FROM Sach WHERE ID = ?";
        
        Sach s = new Sach();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer ID = rs.getInt("ID");
                String tenSach = rs.getString("TenSach");
                Double giaBan = rs.getDouble("GiaBan");
                String loai = rs.getString("Loai");
                
                s = new Sach(ID, tenSach, giaBan, loai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return s;
    }
    
    public Boolean add(Sach s) {
        String sql = "INSERT INTO Sach (?, ?, ?) VALUES";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, s.getTenSach());
            ps.setObject(2, s.getGiaBan());
            ps.setObject(3, s.getLoai());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(Sach s) {
        String sql = "UPDATE Sach SET TenSach = ?, GiaBan = ?, Loai = ? WHERE ID = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, s.getTenSach());
            ps.setObject(2, s.getGiaBan());
            ps.setObject(3, s.getLoai());
            ps.setObject(4, s.getID());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(Integer ma) {
        String sql = "REMOVE FROM Sach WHERE ID = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Sach> searchPrice(Double min, Double max) {
        String sql = "SELECT * FROM Sach WHERE GiaBan BETWEEN ? AND ?";
        
        ArrayList<Sach> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, min);
            ps.setObject(2, max);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer ID = rs.getInt("ID");
                String tenSach = rs.getString("TenSach");
                Double giaBan = rs.getDouble("GiaBan");
                String loai = rs.getString("Loai");
                
                Sach s = new Sach(ID, tenSach, giaBan, loai);
                result.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
