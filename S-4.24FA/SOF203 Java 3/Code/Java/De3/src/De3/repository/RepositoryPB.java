/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3.repository;

import De3.model.PhongBan;
import De3.utils.DbConnection;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author longg
 */
public class RepositoryPB {
    DbConnection dbConnection;
    
    public ArrayList<PhongBan> getList() {
        String sql = "SELECT * FROM PhongBan";
        
        ArrayList<PhongBan> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Boolean trangThai = rs.getBoolean("TrangThai");
                Integer soNhanVien = rs.getInt("SoNhanVien");
                
                PhongBan pb = new PhongBan(ma, ten, trangThai, soNhanVien);
                result.add(pb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public PhongBan details(String maPB) {
        String sql = "SELECT * FROM PhongBan WHERE Ma = ?";
        
        PhongBan pb = new PhongBan();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, maPB);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Boolean trangThai = rs.getBoolean("TrangThai");
                Integer soNhanVien = rs.getInt("SoNhanVien");
                
                pb = new PhongBan(ma, ten, trangThai, soNhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pb;
    }
    
    public Boolean add(PhongBan pb) {
        String sql = "INSERT INTO PhongBan VALUES (?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, pb.getMa());
            ps.setObject(2, pb.getTen());
            ps.setObject(3, pb.getTrangThai());
            ps.setObject(4, pb.getSoNhanVien());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(PhongBan pb) {
        String sql = "UPDATE PhongBan SET Ten = ?, TrangThai = ?, SoNhanVien = ? WHERE Ma = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, pb.getTen());
            ps.setObject(2, pb.getTrangThai());
            ps.setObject(3, pb.getSoNhanVien());
            ps.setObject(4, pb.getMa());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<PhongBan> search(String tenPB) {
        String sql = "SELECT * FROM PhongBan WHERE Ten NOT LIKE ?";
        
        ArrayList<PhongBan> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, "%" + tenPB + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Boolean trangThai = rs.getBoolean("TrangThai");
                Integer soNhanVien = rs.getInt("SoNhanVien");
                
                PhongBan pb = new PhongBan(ma, ten, trangThai, soNhanVien);
                result.add(pb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
