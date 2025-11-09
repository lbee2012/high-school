/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n2711.repository;

import n2711.utils.DbConnection;
import java.sql.*;
import java.util.ArrayList;
import n2711.model.Tablets;

/**
 *
 * @author longg
 */
public class RepositoryTablets {
    DbConnection dbConnection;
    
    public ArrayList<Tablets> getList() {
        String sql = "SELECT * FROM Tablets";
        
        ArrayList<Tablets> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer tabletID = rs.getInt("TabletID");
                String brand = rs.getString("Brand");
                String model = rs.getString("Model");
                Double screenSize = rs.getDouble("ScreenSize");
                Integer storage = rs.getInt("Storage");
                
                Tablets t = new Tablets(tabletID, brand, model, screenSize, storage);
                result.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public Tablets details(Integer ID) {
        String sql = "SELECT * FROM Tablets where TabletID = ?";
        
        Tablets t = new Tablets();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ID);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer tabletID = rs.getInt("TabletID");
                String brand = rs.getString("Brand");
                String model = rs.getString("Model");
                Double screenSize = rs.getDouble("ScreenSize");
                Integer storage = rs.getInt("Storage");
                
                t = new Tablets(tabletID, brand, model, screenSize, storage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
    
    public Boolean add(Tablets t) {
        String sql = "INSERT INTO Tablets (Brand, Model, ScreenSize, Storage)\n"
                + "VALUES\n"
                + "    (?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(1, t.getBrand());
            ps.setObject(2, t.getModel());
            ps.setObject(3, t.getScreenSize());
            ps.setObject(4, t.getStorage());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(Tablets t, Integer id) {
        String sql = "UPDATE Tablets\n" 
                + "SET\n" 
                + "    Brand = ?,\n" 
                + "    Model = ?,\n" 
                + "    ScreenSize = ?,\n" 
                + "    Storage = ?\n" 
                + "WHERE TabletID = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(1, t.getBrand());
            ps.setObject(2, t.getModel());
            ps.setObject(3, t.getScreenSize());
            ps.setObject(4, t.getStorage());
            ps.setObject(5, id);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(Integer ID) {
        String sql = "DELETE FROM Tablets WHERE TabletID = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(1, ID);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Tablets> findTabletsByStorage(Integer min, Integer max) {
        String sql = "SELECT * FROM Tablets WHERE Storage >= ? AND Storage <= ?";
        
        ArrayList<Tablets> filtered = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, min);
            ps.setInt(2, max);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer tabletID = rs.getInt("TabletID");
                String brand = rs.getString("Brand");
                String model = rs.getString("Model");
                Double screenSize = rs.getDouble("ScreenSize");
                Integer storage = rs.getInt("Storage");
                
                Tablets t = new Tablets(tabletID, brand, model, screenSize, storage);
                filtered.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filtered;
    }
}
