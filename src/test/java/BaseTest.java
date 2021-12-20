import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestsExtension.class)
public class BaseTest {

    @BeforeEach
    public void beforeEach (){
        System.out.println("beforeEach");
    }
}
