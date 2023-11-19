import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.*;

public class Flight implements Parseable<Flight>, Appendable{
    private int id;
    private String model;
    private String from;
    private String to;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private int price;
    private int capacity;
    
    
    public Flight() {
    }

    public Flight(int id, String model, String from, String to, LocalDateTime departure, LocalDateTime arrival, int price, int capacity) {
        this.id = id;
        this.model = model;
        this.from = from;
        this.to = to;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
        this.capacity = capacity;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = departure.plusHours(1);
    }
    

    public void setCapacity() {
        if (this.model.equals("Dornier 328")) {
            this.capacity = 32;
        }
        if (this.model.equals("Embraer 135")) {
            this.capacity = 37;
        }
        if (this.model.equals("Bombardier Dash 8 Q400")) {
            this.capacity = 78;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%s,%s,%d,%d",id, model, from, to, departure, arrival, price, capacity);
    }
   
    public Flight parse(String flightString){
        String[] parts = flightString.split(",");
        Flight flight = new Flight();
        flight.id = Integer.parseInt(parts[0]);
        flight.model = parts[1];
        flight.from = parts[2];
        flight.to = parts[3];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        flight.departure = LocalDateTime.parse(parts[4], formatter);
        flight.arrival = LocalDateTime.parse(parts[5], formatter);
        flight.price = Integer.parseInt(parts[6]);
        flight.capacity = Integer.parseInt(parts[7]);
        return flight;
    }

    @Override
    public void appendInfo() {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(new File("bookings.txt"), true));
            write.append("\n" + this.toString());
            write.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

   
}
