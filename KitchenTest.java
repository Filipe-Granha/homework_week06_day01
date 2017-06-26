import static org.junit.Assert.assertEquals;
import org.junit.*;

public class KitchenTest {
 Kitchen kitchen; // object kitchen, of the class Kitchen
 Person student; // object student, of the class Person

 @Before
 public void before() {
   kitchen = new Kitchen("Lounge");
   student = new Person();
 }



 @Test
 public void hasName() {
   assertEquals("Lounge", kitchen.getName());
 }
}