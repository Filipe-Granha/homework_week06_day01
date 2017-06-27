import static org.junit.Assert.assertEquals;
import org.junit.*;

public class KitchenTest {
 Kitchen kitchen; // object kitchen, of the class Kitchen
 Person student; // object student, of the class Person
 // Classroom space;

 @Before
 public void before() {
   kitchen = new Kitchen("Lounge");
   student = new Person();
   // space = new Classroom();
 }



 @Test
 public void hasName() {
   assertEquals("Lounge", kitchen.getName());
 }



  @Test
  public void kitchenStartsEmpty() {
   assertEquals(0, kitchen.studentCount());
 }




 @Test
 public void canAccomodateStudent() {
   kitchen.accomodate(student);
   assertEquals(1, kitchen.studentCount());
 }



  @Test
  public void kitchenIsFull() {
   for (int i = 0; i<10; i++) { // while student number is between 0 and 19
     kitchen.accomodate(student); // execute .accomodate method on object classroom
   }
   assertEquals(true, kitchen.isKitchenFull());
 }






}