import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Bedroom doubleBedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        Bedroom.resetRoomNumbers();
        bedroom = new Bedroom(RoomType.SINGLE);
        doubleBedroom = new Bedroom(RoomType.DOUBLE);
        guest1 = new Guest("Craig");
        guest2 = new Guest("Steve");
        guest3 = new Guest("Jen");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
        assertEquals(2, doubleBedroom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        doubleBedroom.addGuest(guest2);
        doubleBedroom.addGuest(guest3);
        assertEquals(1, bedroom.getNumberOfGuests());
        assertEquals(2, doubleBedroom.getNumberOfGuests());
        bedroom.addGuest(guest3);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }
}
