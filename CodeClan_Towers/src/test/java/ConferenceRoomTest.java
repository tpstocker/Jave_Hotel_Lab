import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "CodeClan Suit");
        guest1 = new Guest("Craig");
        guest2 = new Guest("Steve");
        guest3 = new Guest("Jen");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Suit", conferenceRoom.getName());
    }
}
