public class Classroom {

  private String name; // instance variable 'name'
  private Person[] capacity; // instance variable 'capacity'; Person: type of things that go into Array

  public Classroom(String classroomName) { // the Constructor
    this.name = classroomName; // initialize variable 'name'
    this.capacity = new Person[20]; // initialize variable 'capacity'. The array is already populated with 20 null entries
  }


  public String getName() {
    return this.name;
  }


  public int studentCount() {
    int count = 0;
    for (Person student : capacity) {
      if(student != null) {
        count ++;
      }
    }
    return count;
  }


public void accomodate(Person student) {
   if(isClassroomFull()) return; // if false, proceed to next lines
   int studentCount = studentCount();
   capacity[studentCount] = student; // adds student to the array, and executes .studentCount method (above)
}


public boolean isClassroomFull(){
  return studentCount() == capacity.length; // returns true or false
}



public void emptyClassroom(){
  for(int i = 0; i < capacity.length; i++){
    capacity[i] = null;
  }
}



}