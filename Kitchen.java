public class Kitchen {

 private String name; // instance variable 'name'
 private Person[] student; // instance variable 'capacity'; Person: type of things that go into Array
 private Classroom[] capacity;

 public Kitchen(String kitchenName) { // the Constructor
   this.name = kitchenName; // initialize variable 'name'
   this.student = new Person[15]; // initialize variable 'student'. The array is already populated with 15 null entries
   this.capacity = new Classroom[20]; // initialize variable 'capacity'. The array is already populated with 20 null entries
 }


public String getName() {
  return this.name;
}
}