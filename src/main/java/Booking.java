
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Booking implements Parseable<Booking>,Appendable{
    private Flight flight;
    private Passenger passenger;

    public Booking() {
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return  flight.toString() + "|" + passenger.toString() ;
    }

    @Override
    public Booking parse(String bookingString) {
        String[] parts = bookingString.split("|");
        Booking b = new Booking();
        Flight f = new Flight();
        Passenger p = new Passenger();
        f.parse(parts[0]);
        p.parse(parts[1]);
        b.setFlight(f);
        b.setPassenger(p);
        return b;
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
