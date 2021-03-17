import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

    private DinningRoom dinningRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        dinningRoom = new DinningRoom(2, "CodeClan Suit");
        guest1 = new Guest("Craig");
        guest2 = new Guest("Steve");
        guest3 = new Guest("Jen");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, dinningRoom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        dinningRoom.addGuest(guest1);
        assertEquals(1, dinningRoom.getNumberOfGuests());
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Suit", dinningRoom.getName());
    }
}
