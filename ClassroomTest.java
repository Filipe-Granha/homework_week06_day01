 import static org.junit.Assert.assertEquals;
 import org.junit.*;

 public class ClassroomTest {
  Classroom classroom; // object classroom, of the class Classroom
  Person student; // object student, of the class Person

  @Before
  public void before() {
    classroom = new Classroom("Fishbowl");
    student = new Person();
  }



  @Test
  public void hasName() {
    assertEquals("Fishbowl", classroom.getName());
  }



  @Test
  public void classroomStartsEmpty() {
   assertEquals(0, classroom.studentCount());
 }


 @Test
 public void canAccomodateStudent() {
   classroom.accomodate(student);
   assertEquals(1, classroom.studentCount());
 }



 @Test
 public void classroomIsFull() {
  for (int i = 0; i<20; i++) { // while student number is between 0 and 19
    classroom.accomodate(student); // execute .accomodate method on object classroom
  }
  assertEquals(true, classroom.isClassroomFull());
}



@Test
public void canNotAccomodateStudentWhenClassroomFull() {
  for(int i = 0; i<20; i++) {
    classroom.accomodate(student);
  }
  assertEquals(20, classroom.studentCount());
}


}