import java.util.ArrayList;

public class Building {

    private int id;
    private String address;
    private String city;
    private int post;
    private int apartments; // total apartments
    private ArrayList<String> adminPhone;
    private static int instances = 0;

    public Building(){
        instances++;
        int id = 100 + instances;
        this.adminPhone = new ArrayList<String>();
    }

    public Building(String address, String city, int post, int apartments, String adminPhone){
        this.adminPhone = new ArrayList<String>();
        this.address = address;
        this.city = city;
        this.post = post;
        this.apartments = apartments;
        this.adminPhone.add(adminPhone);
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getPost() {
        return post;
    }

    public int getApartments() {
        return apartments;
    }

    public ArrayList<String> getAdminPhone() {
        return adminPhone;
    }

    public static int getInstances() {
        return instances;
    }
}
