abstract class Animal {
    private String name;
    private boolean alive;
    private int healthAmount;

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

    public void setHealthAmount(int health) {
        this.healthAmount = health;
    }

    public int getHealthAmount() {
        return this.healthAmount;
    }

    public void die() {
        this.alive = false;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public boolean eats(Animal a) {
        if (this instanceof Human) {
            return success(a);
        } else if (this instanceof Dog && (a instanceof Human || a instanceof Bird)) {
            return success(a);
        } else {
            return false;
        }   
    }

    private boolean success(Animal a) {
        this.setHealthAmount(getHealthAmount() + 1);
        a.die();
        return true;
    }
}
