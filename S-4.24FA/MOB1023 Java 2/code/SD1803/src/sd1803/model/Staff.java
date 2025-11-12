/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.model;

/**
 *
 * @author longsuwu
 */
public class Staff {
    private Integer ID;
    private String name;
    private Integer age;
    private String role;
    private String status;

    public Staff() {
    }

    public Staff(Integer ID, String name, Integer age, String role, String status) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.role = role;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ID + ", " + name + ", " + age + ", " + role + ", " + status;
    }   
}
