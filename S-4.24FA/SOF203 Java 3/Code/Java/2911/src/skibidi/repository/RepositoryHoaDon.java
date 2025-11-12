/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skibidi.repository;

import skibidi.utils.DbConnection;
import java.sql.*;
import java.util.ArrayList;
import skibidi.model.HoaDon;

/**
 *
 * @author longg
 */
public class RepositoryHoaDon {
    DbConnection dbConnection;
    
    public ArrayList<HoaDon> getList() {
        String sql = "SELECT * FROM HoaDon";
        
        ArrayList<HoaDon> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer maHD = rs.getInt("MaHoaDon");
                Date ngayLap = rs.getDate("NgayLap");
                Integer maKH = rs.getInt("MaKhachHang");
                Double tongTien = rs.getDouble("TongTien");
                String trangThai = rs.getString("TrangThai");
                String ghiChu = rs.getString("GhiChu");
                
                HoaDon hd = new HoaDon(maHD, ngayLap, maKH, tongTien, trangThai, ghiChu);
                result.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public HoaDon details(Integer ma) {
        String sql = "SELECT * FROM HoaDon where MaHoaDon = ?";
        
        HoaDon hd = new HoaDon();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer maHD = rs.getInt("MaHoaDon");
                Date ngayLap = rs.getDate("NgayLap");
                Integer maKH = rs.getInt("MaKhachHang");
                Double tongTien = rs.getDouble("TongTien");
                String trangThai = rs.getString("TrangThai");
                String ghiChu = rs.getString("GhiChu");
                
                hd = new HoaDon(maHD, ngayLap, maKH, tongTien, trangThai, ghiChu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }
    
    public Boolean add(HoaDon hd) {
        String sql = "INSERT INTO HoaDon (MaHoaDon, NgayLap, MaKhachHang, TongTien, TrangThai, GhiChu)\n" +
"VALUES\n" +
"(?, ?, ?, ?, ?, ?)";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, hd.getMaHoaDon());
            ps.setObject(2, hd.getNgayLap());
            ps.setObject(3, hd.getMaKhachHang());
            ps.setObject(4, hd.getTongTien());
            ps.setObject(5, hd.getTrangThai());
            ps.setObject(6, hd.getGhiChu());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(HoaDon hd) {
        String sql = "UPDATE HoaDon\n" +
"SET NgayLap = ?, MaKhachHang = ?, TongTien = ?, TrangThai = ?, GhiChu = ?"
                + "Where MaHoaDon = ?";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, hd.getNgayLap());
            ps.setObject(2, hd.getMaKhachHang());
            ps.setObject(3, hd.getTongTien());
            ps.setObject(4, hd.getTrangThai());
            ps.setObject(5, hd.getGhiChu());
            ps.setObject(6, hd.getMaHoaDon());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(Integer ma) {
        String sql = "DELETE FROM HoaDon WHERE MaHoaDon = ?";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<HoaDon> search(String ngay) {
        String sql = "SELECT * FROM HoaDon WHERE NgayLap = ?";
        
        ArrayList<HoaDon> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ngay);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Integer maHD = rs.getInt("MaHoaDon");
                Date ngayLap = rs.getDate("Ngaylap");
                Integer maKH = rs.getInt("MaKhachHang");
                Double tongTien = rs.getDouble("TongTien");
                String trangThai = rs.getString("TrangThai");
                String ghiChu = rs.getString("GhiChu");
                
                HoaDon hd = new HoaDon(maHD, ngayLap, maKH, tongTien, trangThai, ghiChu);
                result.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
