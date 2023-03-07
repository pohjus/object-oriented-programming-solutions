public record Person(int id, String firstName, String lastName) {}

// public class Person {
//     final public int id;
//     final public String firstName;
//     final public String lastName;

//     public Person(int id, String firstName, String lastName) {
//         this.id = id;
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }

//     @Override
//     public boolean equals(Object p) {
//         if (this == p) { return true; }
//         if (!(this instanceof Person)) { return false; }
//         Person newP = (Person) p;
//         return newP.firstName.equals(this.firstName) && newP.lastName.equals(this.lastName) && newP.id == this.id;
//     }

//     public int id() {
//         return this.id;
//     }

//     public String firstName() {
//         return this.firstName;
//     }

//     public String lastName() {
//         return this.lastName;
//     }

//     @Override
//     public String toString() {
//         return "Person[id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + "]";
//     }
// }