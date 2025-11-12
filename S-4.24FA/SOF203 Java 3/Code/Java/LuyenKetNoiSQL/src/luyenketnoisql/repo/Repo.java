/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyenketnoisql.repo;

import java.util.ArrayList;
import luyenketnoisql.model.Users;
import java.sql.*;
import luyenketnoisql.utils.DbConnection;

/**
 *
 * @author ADMIN
 */
public class Repo {

    DbConnection dbConnection;

    public ArrayList<Users> getList() {
        String sql = "Select * from Users";
        ArrayList<Users> kq = new ArrayList<>();

        try (
                Connection co = dbConnection.getConnection(); PreparedStatement pr = co.prepareStatement(sql)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                String us = rs.getString("Id");
                String pass = rs.getString("Password");
                String name = rs.getString("Fullname");
                String email = rs.getString("Email");
                boolean admin = rs.getBoolean("Admin");

                Users u = new Users(us, pass, name, email, admin);
                kq.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    public boolean add(Users u) {
        String sql = "Insert into Users(Id, Password, Fullname, Email, Admin) \n"
                + "values(?, ?, ?, ?, ?)";
        try (Connection co = dbConnection.getConnection(); PreparedStatement pr = co.prepareStatement(sql)) {
            pr.setObject(1, u.getId());
            pr.setObject(2, u.getPass());
            pr.setObject(3, u.getName());
            pr.setObject(4, u.getEmail());
            pr.setObject(5, u.isAdmin());
            return pr.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(Users u) {
        String sql = "Update Users set \n"
                + "Password = ?,\n" 
                + "Fullname = ?,\n" 
                + "Email = ?,\n" 
                + "Admin = ?"
                + "Where Id = ?";
        try (Connection co = dbConnection.getConnection(); PreparedStatement pr = co.prepareStatement(sql)) {
            pr.setObject(1, u.getPass());
            pr.setObject(2, u.getName());
            pr.setObject(3, u.getEmail());
            pr.setObject(4, u.isAdmin());
            pr.setObject(5, u.getId());
            return pr.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Users tblUsers(String id) {
        String sql = "Select * from Users where Id = ?";
        Users u = new Users();
        try (
                Connection co = dbConnection.getConnection(); PreparedStatement pr = co.prepareStatement(sql)) {
            pr.setObject(1, id);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                String us = rs.getString("Id");
                String pass = rs.getString("Password");
                String name = rs.getString("Fullname");
                String email = rs.getString("Email");
                boolean admin = rs.getBoolean("Admin");

                u = new Users(us, pass, name, email, admin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    public boolean deltID(String id) {
        String sql = "Delete from Users where Id = ?";
        try (Connection cn = dbConnection.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deltName(String name) {
        String sql = "Delete from Users where Fullname = ?";
        try (Connection cn = dbConnection.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, name);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deltThapCam(String id, String name, String pass) {
        String sql = "Delete from Users where Id = ? and Fullname = ? and Password = ?";
        try (Connection cn = dbConnection.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, id);
            ps.setObject(2, name);
            ps.setObject(3, pass);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deltAdmin(boolean admin) {
        String sql = "Delete from Users where Admin = ?";
        try (Connection cn = dbConnection.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setObject(1, admin);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
