package day5;

public class Vehicle {

    /*
    - creat a 'vehical' super class
       -Fields: 'brand' , 'color', 'year'
       -Method: 'start()' prints '"Vehicle started"'
   - Creat sub classes :
       - 'Car' adds methods 'honk()'
       - 'Bike' adds methods 'ringBill()'
   - Instantiate both and demonstrate inherited + own methods .
     */

    String brand;
    String color;
    String year;

    public Vehicle(String brand,  String color,  String year ) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

        public void start() {
            System.out.println("Vehicle started");
        }



}
