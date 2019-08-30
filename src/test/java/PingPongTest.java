import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {
    @Test
    public void runPingPong_countUpToOne_ArrayList(){
    PingPong testPingPong = new PingPong();
    List<Object> expectedOutPut = new ArrayList<Object>();
    expectedOutPut.add(1);
    assertEquals(expectedOutPut,testPingPong.runPingPong(1));
    }
}
