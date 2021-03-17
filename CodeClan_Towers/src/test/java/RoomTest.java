import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Guest guest;

    @Before
    public void before(){
        room = new Room(4);
        guest = new Guest("Craig");
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, room.getCapacity());
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest);
        assertEquals(1, room.getNumberOfGuests());

    }

    @Test
    public void canRemoveGuest(){
        room.addGuest(guest);
        assertEquals(1, room.getNumberOfGuests());
        Guest removedGuest = room.removeGuest(guest);
        assertEquals(0, room.getNumberOfGuests());
        assertEquals(guest, removedGuest);

    }

}
