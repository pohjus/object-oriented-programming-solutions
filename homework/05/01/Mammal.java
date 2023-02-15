abstract class Mammal {
    private String name;

    public Mammal(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void giveBirthToLivingChild() {
        System.out.println("giving birth to living child");
    }
}
