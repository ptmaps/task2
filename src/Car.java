public class Car {
    private String model;
    private String brand ;
    private int year;
    private double price;
    private String colour;
    private int quantity;

    public Car(String model, String bramd, int year, double price, String colour,int quantity){
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.quantity = quantity;

    }

    public void setModel(String model){
        this.model = model;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setQuantity(int quantity){
        this.quantity =quantity;
    }

    public void deliver(){
        //Simulating car sales
        if (quantity > 0){
            quantity--;
        }
    }

    public String toString(){
        return"Car{" +
                "model='" + model + "/" +
                ",brand='" + brand + "/" +
                ",year=" + year +
                ",price=" + price +
                ",colour=" + colour + "/" +
                ",quantity=" + quantity + '}';

    }
    
}
