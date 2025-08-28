public class Car {

    private String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    void setModel(String model){
        this.model = model;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }
    int getPrice(){
        return this.price;
    }
    void setPrice(int price){
        this.price = price;
    }
}
