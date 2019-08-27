import org.junit.jupiter.api.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class DriveTest {
    @Test
    public void can_drive_car() {
        //given

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }
}