/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojectlab;

/**
 *
 * @author Raton Biswas
 */
public class NewItem {
    
    
     private String name;
    private String code;
    private String price;

    public NewItem(String name, String code, String price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }
     public String showInfo(){
        String info = "Book name :\t"+name+",Book code:\t("+code+"),Book price: \t"+price;
        return info;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
     
     
    
}
