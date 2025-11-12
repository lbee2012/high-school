/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n2711.model;

/**
 *
 * @author longg
 */
public class Tablets {
    private Integer tabletID;
    private String brand;
    private String model;
    private Double screenSize;
    private Integer storage;

    public Tablets() {
    }

    public Tablets(Integer tabletID, String brand, String model, Double screenSize, Integer storage) {
        this.tabletID = tabletID;
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.storage = storage;
    }

    public Integer getTabletID() {
        return tabletID;
    }

    public void setTabletID(Integer tabletID) {
        this.tabletID = tabletID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }
    
    
}
