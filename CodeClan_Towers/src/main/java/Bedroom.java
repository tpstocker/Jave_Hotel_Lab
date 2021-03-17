import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private static int allRoomNumbers;
    private int roomNumber;

    public static void resetRoomNumbers(){
        allRoomNumbers = 0;
    }

    public Bedroom(RoomType roomType) {
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;


        this.roomNumber = ++allRoomNumbers;
        if(roomType == RoomType.SINGLE){
            this.capacity = 1;
            this.rate = 50;
        } else {
            this.capacity = 2;
            this.rate = 75;
        }
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public static int getAllRoomNumbers() {
        return allRoomNumbers;
    }
}
