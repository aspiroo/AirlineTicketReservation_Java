
import java.io.*;
import javax.swing.*;
import javax.swing.table.*; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author safwa
 */
public class BookWindow extends javax.swing.JFrame {
    
    public Booking booking = new Booking();
    PassengerRegister passengers = new PassengerRegister().readInfoInto(new File("passengers.txt"));
     
     
    /**
     * Creates new form BookWindow
     */
    public BookWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        flightIDLabel = new java.awt.Label();
        passportField = new javax.swing.JTextField();
        fromLabel = new java.awt.Label();
        fromCityBox = new javax.swing.JComboBox<>();
        toCityBox = new javax.swing.JComboBox<>();
        toLabel = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        searchButton1 = new javax.swing.JButton();
        passportLabel1 = new java.awt.Label();
        flightID = new javax.swing.JComboBox<>();
        seat = new javax.swing.JLabel();
        number = new javax.swing.JComboBox<>();
        bookButton = new javax.swing.JButton();
        cancelButtton = new javax.swing.JButton();
        allflights = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("   Add Booking");
        title.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 938, 50));

        flightIDLabel.setAlignment(java.awt.Label.CENTER);
        flightIDLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        flightIDLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        flightIDLabel.setText("Enter the Customer's Desired Flight");
        getContentPane().add(flightIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 141, 245, 30));

        passportField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passportField, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 84, 220, 30));

        fromLabel.setAlignment(java.awt.Label.CENTER);
        fromLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fromLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fromLabel.setName(""); // NOI18N
        fromLabel.setText("From");
        getContentPane().add(fromLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 84, 60, 30));

        fromCityBox.setMaximumRowCount(20);
        fromCityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Sylhet" }));
        getContentPane().add(fromCityBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 90, 125, 30));

        toCityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Sylhet" }));
        toCityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCityBoxActionPerformed(evt);
            }
        });
        getContentPane().add(toCityBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 132, 125, 30));

        toLabel.setAlignment(java.awt.Label.CENTER);
        toLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        toLabel.setName(""); // NOI18N
        toLabel.setText("To");
        getContentPane().add(toLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 132, 60, 30));

        flightTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "FlightID", "FlightModel", "From", "To", "Departure Date and Time", "Arrival Date and Time", "FlightPrice", "FlightCapacity"
            }
        ));
        flightTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        flightTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        flightTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        flightTable.setShowGrid(false);
        flightTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(flightTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 202, 916, 280));

        searchButton1.setBackground(new java.awt.Color(0, 0, 255));
        searchButton1.setForeground(new java.awt.Color(255, 255, 255));
        searchButton1.setText("Search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 140, 135, 44));

        passportLabel1.setAlignment(java.awt.Label.CENTER);
        passportLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        passportLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        passportLabel1.setText("Enter the Customer's Passport Number");
        getContentPane().add(passportLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 84, 250, 30));

        flightID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightIDActionPerformed(evt);
            }
        });
        getContentPane().add(flightID, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 141, 83, 30));

        seat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seat.setForeground(new java.awt.Color(0, 0, 0));
        seat.setText("Seats :");
        getContentPane().add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, 30));

        number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 141, 60, 30));

        bookButton.setBackground(new java.awt.Color(0, 51, 255));
        bookButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookButton.setForeground(new java.awt.Color(255, 255, 255));
        bookButton.setText("Book Tickets ");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, 50));

        cancelButtton.setBackground(new java.awt.Color(0, 51, 255));
        cancelButtton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelButtton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButtton.setText("Cancel");
        cancelButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButttonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 110, 50));

        allflights.setBackground(new java.awt.Color(0, 0, 255));
        allflights.setForeground(new java.awt.Color(255, 255, 255));
        allflights.setText("All Flights");
        allflights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allflightsActionPerformed(evt);
            }
        });
        getContentPane().add(allflights, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 84, 135, 44));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passportFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passportFieldActionPerformed
        // TODO add your handling code here:
        passportField.setText(" ");
    }//GEN-LAST:event_passportFieldActionPerformed

    private void toCityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCityBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toCityBoxActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
        String from = fromCityBox.getSelectedItem().toString();
        String to = toCityBox.getSelectedItem().toString();
        if (from.equals(to)){
            try {
                throw new FromToException("From and To can not be same");
            } catch (FromToException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error",JOptionPane.ERROR_MESSAGE);
                fromCityBox.setSelectedIndex(0);
                toCityBox.setSelectedIndex(0);
            }
        }else{
            
            flightID.removeAllItems();
            DefaultTableModel tableModel = (DefaultTableModel) flightTable.getModel();
            Airline airline = new Airline().readInfoInto(new File("flights.txt"));
            Airline sortedFlights = airline.sortByFromAndTo(from, to);
            System.out.println(sortedFlights.toString());
            Object[] rowData = new Object[8];
            tableModel.setRowCount(0);
            for (Flight flight : sortedFlights.getFlights()) {
                rowData[0] = flight.getId();
                rowData[1] = flight.getModel();
                rowData[2] = flight.getFrom();
                rowData[3] = flight.getTo();
                rowData[4] = flight.getDeparture();
                rowData[5] = flight.getArrival();
                rowData[6] = flight.getPrice();
                rowData[7] = flight.getCapacity();
                tableModel.addRow(rowData);
            }
            flightTable.setModel(tableModel);
            tableModel.fireTableDataChanged();
            flightTable.setVisible(true);
            flightIDLabel.enable(true);
            flightID.enableInputMethods(true);
            bookButton.enableInputMethods(true);
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                flightID.addItem(tableModel.getValueAt(i, 0).toString());
            }
        }

    }//GEN-LAST:event_searchButton1ActionPerformed

    private void flightIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightIDActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_flightIDActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
        Booking booking = new Booking();
        boolean isRegistered = false;  
        int totalSum = 0;
        Flight f = null;
        String from = fromCityBox.getSelectedItem().toString();
        String to = toCityBox.getSelectedItem().toString();
        try {
            PassengerRegister passengers = new PassengerRegister().readInfoInto(new File("passengers.txt"));
            Airline airline = new Airline().readInfoInto(new File("flights.txt"));
            Airline sortedFlights = airline.sortByFromAndTo(from, to);
            String passportNo = passportField.getText();
            for (Passenger passenger : passengers.getPassengers()) {
                if (passportNo.equals(passenger.getPassportNumber())) {
                    for (Flight flight : airline.getFlights()) {
                        if(flight.getId() == Integer.parseInt(flightID.getSelectedItem().toString())){
                            int updatedCapacity = flight.getCapacity()-Integer.parseInt(number.getSelectedItem().toString());
                            f = new Flight(flight.getId(),flight.getModel(),flight.getFrom(),flight.getTo(),flight.getDeparture(),flight.getArrival(),flight.getPrice(),updatedCapacity);    
                            airline.getFlights().remove(flight);
                            airline.addFlight(f);
                    }
                    booking.setFlight(f);
                    booking.setPassenger(passenger);
                    isRegistered = true;
                    passenger.setSeats(Integer.parseInt(number.getSelectedItem().toString()));                   
                    totalSum = passenger.getSeats()*f.getPrice();
                    JOptionPane.showMessageDialog(null,"Booking added successfully for "+booking.getPassenger().getFullName()+". Your total is " + totalSum + "TK. Please pay upfront in cash!","Success",JOptionPane.PLAIN_MESSAGE);
                    booking.appendInfo();
                    this.dispose();
                }
            }
        }
        if (!isRegistered)
             throw new PassportException("Passport not registered before!");
        } catch (PassportException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
            passportField.setText("");
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void cancelButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Welcome();
    }//GEN-LAST:event_cancelButttonActionPerformed

    private void allflightsActionPerformed(java.awt.event.ActionEvent evt) {                                           
       flightID.removeAllItems();
        DefaultTableModel tableModel = (DefaultTableModel) flightTable.getModel();
        Airline airline = new Airline().readInfoInto(new File("flights.txt"));
        Object[] rowData = new Object[8];
        tableModel.setRowCount(0);
        for (Flight flight : airline.getFlights()) {
            rowData[0] = flight.getId();
            rowData[1] = flight.getModel();
            rowData[2] = flight.getFrom();
            rowData[3] = flight.getTo();
            rowData[4] = flight.getDeparture();
            rowData[5] = flight.getArrival();
            rowData[6] = flight.getPrice();
            rowData[7] = flight.getCapacity();
            tableModel.addRow(rowData);
        }
        flightTable.setModel(tableModel);
        tableModel.fireTableDataChanged();
        flightTable.setVisible(true);
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            flightID.addItem(tableModel.getValueAt(i, 0).toString());
        
    }                                                
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */

  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookWindow().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allflights;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton cancelButtton;
    private javax.swing.JComboBox<String> flightID;
    private java.awt.Label flightIDLabel;
    private javax.swing.JTable flightTable;
    private javax.swing.JComboBox<String> fromCityBox;
    private java.awt.Label fromLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> number;
    private javax.swing.JTextField passportField;
    private java.awt.Label passportLabel1;
    private javax.swing.JButton searchButton1;
    private javax.swing.JLabel seat;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> toCityBox;
    private java.awt.Label toLabel;
    // End of variables declaration//GEN-END:variables
}