/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2java.repository;

import assignment2java.model.Nguoi;
import assignment2java.utils.DbConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author longg
 */
public class RepositoryNguoi {
    DbConnection dbConnection;
    
    public ArrayList<Nguoi> getList() {
        String sql = "SELECT * FROM Nguoi";
        
        ArrayList<Nguoi> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer ID = rs.getInt("ID");
                String hoTen = rs.getString("HoTen");
                String gioiTinh = rs.getString("GioiTinh");
                
                Nguoi n = new Nguoi(ID, hoTen, gioiTinh);
                result.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return result;
    }
    
    public Nguoi details(Integer ma) {
        String sql = "SELECT * FROM Nguoi WHERE ID = ?";
        
        Nguoi n = new Nguoi();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer ID = rs.getInt("ID");
                String hoTen = rs.getString("HoTen");
                String gioiTinh = rs.getString("GioiTinh");
                
                n = new Nguoi(ID, hoTen, gioiTinh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
    
    public Boolean add(Nguoi n) {
        String sql = "INSERT INTO Nguoi (?, ?) VALUES";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, n.getHoTen());
            ps.setObject(2, n.getGioiTinh());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(Nguoi n) {
        String sql = "UPDATE Nguoi SET HoTen = ?, GioiTinh = ? WHERE ID = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, n.getHoTen());
            ps.setObject(2, n.getGioiTinh());
            ps.setObject(3, n.getID());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(Integer ma) {
        String sql = "REMOVE FROM Nguoi WHERE ID = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
