public class Kitchen {

 private String name; // instance variable 'name'
 private Person[] studentOnBreak; // instance variable 'studentOnBreak'; Person: type of things that go into Array
 private Classroom[] capacity;

 public Kitchen(String kitchenName) { // the Constructor
   this.name = kitchenName; // initialize variable 'name'
   this.studentOnBreak = new Person[10]; // initialize variable 'studentOnBreak'. The array is already populated with 10 null entries
   this.capacity = new Classroom[20]; // initialize variable 'capacity'. The array is already populated with 20 null entries
 }


public String getName() {
  return this.name;
}



public int studentCount() {
  int count = 0;
  for (Person student : studentOnBreak) {
    if(student != null) {
      count ++;
    }
  }
  return count;
}



 public void accomodate(Person student) {
  if(isKitchenFull()) return; // if false, proceed to next lines
  int studentCount = studentCount();
  studentOnBreak[studentCount] = student; // adds student to the array, and executes .studentCount method (above)
}



public boolean isKitchenFull() {
  return studentCount() == studentOnBreak.length; // returns true or false
}








}