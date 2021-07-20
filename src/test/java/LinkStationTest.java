import org.junit.Test;

public class LinkStationTest {
    LinkStation ls;
    @Test
    public void canInstantiate() {
        ls = new LinkStation();
    }

    @Test
    public void canAddStation() {
        ls.addStation(new int[]{0, 0, 10});
    }

    @Test
    public void canGetAllStation() {

    }

    @Test
    public void canCalculatePower() {

    }
}
