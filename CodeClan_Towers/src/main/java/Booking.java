public class Booking {

    private Room room;
    private int nights;

    public Booking(Room room, int nights) {
        this.room = room;
        this.nights = nights;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    public int getBill() {
        return this.room.getRate() * this.nights;
    }
}
