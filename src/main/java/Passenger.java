
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Passenger extends Person implements Parseable<Passenger>,Appendable{

    private String passportNumber;
    private int seats;

    public Passenger() {
    }

    public void setPassportNumber(String passportNumber) throws PassportException, NullPointerException {
        if (passportNumber == null || passportNumber.equals(" ") || passportNumber.isEmpty()) {
            throw new NullPointerException("Please enter your passport number!");
        }

        int count = 0;
        for (int i = 2; i < passportNumber.length(); i++) {
            if (isDigit(passportNumber.charAt(i))) {
                count++;
            }
        }

        if (passportNumber.length() == 9 && isUpperCase(passportNumber.charAt(0)) && isUpperCase(passportNumber.charAt(1)) && count == 7) {
            this.passportNumber = passportNumber;
        } else {
            throw new PassportException("Please enter a valid passport number!");
        }
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + passportNumber;
    }

    @Override
    public Passenger parse(String str) {
        Passenger p = new Passenger(); 
        try {
            String[] parts = str.split(",");
            p.setFullName(parts[0]);
            p.setAddress(parts[1]);
            p.setGender(parts[2]);
            p.setPhoneNumber(parts[3]);
            p.setNID(parts[4]);
            p.setDateOfBirth(LocalDate.parse(parts[5]));
            p.setPassportNumber(parts[6]);
        } catch (PhoneNumberException | NullPointerException | NIDException | PassportException ex) {
            Logger.getLogger(Passenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public void appendInfo() {
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(new File("passengers.txt"), true));
            write.append("\n" + this.toString());
            write.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

 
    
}
