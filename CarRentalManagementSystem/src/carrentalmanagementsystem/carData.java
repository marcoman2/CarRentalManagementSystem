/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalmanagementsystem;

import java.sql.Date;

/**
 *
 * @author MarcoMan
 * Youtube Channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
    Subscribe our Channel, thank you for the support!
 */
public class carData {
    
    private Integer carId;
    private String brand;
    private String model;
    private Double price;
    private String status;
    private Date date;
    private String image;
    
    public carData(Integer carId, String brand, String model
            , Double price, String status, String image, Date date){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.status = status;
        this.date = date;
        this.image = image;
    }
    
    public Integer getCarId(){
        return carId;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public Double getPrice(){
        return price;
    }
    public String getStatus(){
        return status;
    }
    public Date getDate(){
        return date;
    }
    public String getImage(){
        return image;
    }
    
}
