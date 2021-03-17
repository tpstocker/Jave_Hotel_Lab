import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> hotelRooms;
    private String name;

    public Hotel(String name) {
        this.name = name;
        this.hotelRooms = new ArrayList<Room>();
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room) {
        this.hotelRooms.add(room);
    }

    public int getNumberOfRooms(){
        return hotelRooms.size();
    }

    public int getNumberOfBedrooms() {
        return Bedroom.getAllRoomNumbers();
    }

    public void checkIn(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public Guest checkOut(Room room, Guest guest) {
        return room.removeGuest(guest);

    }

    public Booking bookRoom(Room room, int nights) {
        return new Booking(room, nights);
    }
}
