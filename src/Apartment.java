import java.util.ArrayList;

public class Apartment {

    private int building; // building id which belongs to
    private int floor;
    private String id;    // (letter)(number) letter is the floor
    private String owner; // first and last name (50 char)
    private int size; // in square meters
    private ArrayList<String> ownerPhone;
    private int mm; // milimeters of the apartment
    private boolean isStore;

    public Apartment(){
        this.ownerPhone = new ArrayList<String>();
    }



    public Apartment(int building, int floor, String id, String owner, int size, String ownerPhone, int mm, boolean isStore){
        this.ownerPhone = new ArrayList<String>();
        this.building = building;
        this.floor = floor;
        this.id = id;
        this.owner = owner;
        this.size = size;
        this.ownerPhone.add(ownerPhone);
        this.mm = mm;
        this.isStore = isStore;
    }

    public int getBuilding() {
        return building;
    }

    public int getFloor() {
        return floor;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<String> getOwnerPhone() {
        return ownerPhone;
    }

    public int getMm() {
        return mm;
    }

    public boolean isStore() {
        return isStore;
    }

    public String toString(){
        String s = "";

        s.concat(String.format("Building: %d\nFloor: %d\nApartment: %s\nOwner: %s\nSize: %d\nMilimeters: %d\n",
                this.building, this.floor, this.id, this.owner, this.size, this.mm));

        s.concat(String.format("%s\'s phone numbers\n",this.owner));
        for(String phone : ownerPhone){
            s.concat(String.format("%s\n", phone));
        }

        if(isStore){
            s.concat("Type: Store");
        }
        else{
            s.concat("Type: Apartment");
        }

        return s;
    }
}
