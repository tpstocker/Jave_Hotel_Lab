import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        Bedroom.resetRoomNumbers();
        bedroom = new Bedroom(RoomType.SINGLE);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals(bedroom, booking.getRoom());
    }

    @Test
    public void bookingHasDuration(){
        assertEquals(3, booking.getNights());
    }

    @Test
    public void hasBill(){
        assertEquals(150, booking.getBill());
    }
}
