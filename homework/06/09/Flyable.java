// this annotation forces interface to only have one method
// it doesn't compile if there are more than one method
@FunctionalInterface
interface Flyable {
    public void fly();
}
