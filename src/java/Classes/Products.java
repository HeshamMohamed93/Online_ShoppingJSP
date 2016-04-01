/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Koki Yehia
 */
public class Products {
    String ProductId;
    String ProductName;
    String ProductType;
    String Price;
    String Photo;
    String Description;

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }
    
            
    

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public Products() {
    }
    
    
}
