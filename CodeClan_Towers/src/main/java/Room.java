import java.util.ArrayList;

public class Room {

    protected int capacity;
    protected ArrayList<Guest>guests;
    protected int rate;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Guest guest) {
        if (this.getCapacity() > this.getNumberOfGuests()){
            this.guests.add(guest);
        }
    }

    public Room() {
    }

    public Guest removeGuest(Guest guest) {
        this.guests.remove(guest);
        return guest;
    }

    public int getRate() {
        return rate;
    }
}