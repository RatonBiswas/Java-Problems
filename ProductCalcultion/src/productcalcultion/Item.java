

package productcalcultion;


public class Item {
    
    private String name;
    private String code;
    private String price;

    public Item(String name, String code, String price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }
     public String showInfo(){
        String info = name+" ("+code+"), "+price;
        return info;
     }
    
}
