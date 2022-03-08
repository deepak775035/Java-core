package session21;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

interface Client {
    double getCharges();
    double calculatePayment(Date invoiceDate);
    void sendEmail(double payment);

}

class Customer implements Client {
    int id;
    String name;
    String email;
    double charges;
    Date dateOfAgreement;
    public Customer(int id, String name, String email, double charges, Date dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement = dateOfAgreement;
    }
    @Override
    public String toString() {
        return "Customer [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email + ", id="
                + id + ", name=" + name + "]";
    }
    @Override
    public double calculatePayment(Date invoiceDate) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public double getCharges() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void sendEmail(double payment) {
        // TODO Auto-generated method stub
        
    }
    
    
}

class Business implements Client{
    int id;
    String name;
    String email;
    double charges;
    double gstRate;
    Date dateOfAgreement;
    public Business(int id, String name, String email, double charges, double gstRate, Date dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.gstRate = gstRate;
        this.dateOfAgreement = dateOfAgreement;
    }
    @Override
    public String toString() {
        return "Business [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement + ", email=" + email
                + ", gstRate=" + gstRate + ", id=" + id + ", name=" + name + "]";
    }
    public double getGstRate() {
        return gstRate;
    }
    @Override
    public double calculatePayment(Date invoiceDate) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public double getCharges() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void sendEmail(double payment) {
        // TODO Auto-generated method stub
        
    }
    
}


public class MyCompany {
    public static void main(String[] args) throws Exception{
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2015");
        Client c1 = new Customer(101, "c1name", "c1name@gmail.com", 500, date);
        Client c2 = new Customer(102, "c2name", "c2name@gmail.com", 1000, date);

        Client b1 = new Business(201, "b1name", "b1@gmail.com", 6000, 18, date);
        Client b2 = new Business(202, "b2name", "b2@gmail.com", 14000, 15, date);

        ArrayList<Client> clients = new ArrayList<>();
        clients.addAll(Arrays.asList(c1,c2,b1,b2));

        //Comparator<Client> byName = (Client o1, Client o2)->o1.getName().compareTo(o2.getName());
        
       // Collections.sort(clients,Comparator)
        
    }
}
