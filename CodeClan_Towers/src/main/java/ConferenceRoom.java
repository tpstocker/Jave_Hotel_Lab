public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
        this.rate = 200;
    }

    public String getName() {
        return name;
    }
}
