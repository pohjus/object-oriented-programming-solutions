abstract class Animal {
    private String name;
    private boolean alive;

    public Animal(String name) {
        setName(name);
        this.alive = true;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void die() {
        this.alive = false;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public boolean eats(Animal a) {
        if (this instanceof Human) {
            a.die();
            return true;
        } else if (this instanceof Dog && (a instanceof Human || a instanceof Bird)) {
            a.die();
            return true;
        } else {
            return false;
        }   
    }
}
