import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    private ConferenceRoom conferenceRoom;
    private Bedroom bedroom;
    private Bedroom doubleBedroom;
    private Booking booking;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        Bedroom.resetRoomNumbers();
        hotel = new Hotel("G23 Hotel");
        conferenceRoom = new ConferenceRoom(2, "CodeClan Suit");
        bedroom = new Bedroom(RoomType.SINGLE);
        doubleBedroom = new Bedroom(RoomType.DOUBLE);
        hotel.addRoom(conferenceRoom);
        hotel.addRoom(bedroom);
        hotel.addRoom(doubleBedroom);
        guest1 = new Guest("Craig");
        guest2 = new Guest("Steve");
        guest3 = new Guest("Jen");
    }

    @Test
    public void hasName(){
        assertEquals("G23 Hotel", hotel.getName());
    }

    @Test
    public void hasRooms(){
        assertEquals(3, hotel.getNumberOfRooms());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(bedroom, guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckOut(){
        hotel.checkIn(bedroom, guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
        hotel.checkOut(bedroom, guest1);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canBookRoom(){
        booking = hotel.bookRoom(bedroom, 3);
        assertEquals(3, booking.getNights());
    }
}


