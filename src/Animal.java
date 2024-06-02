abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }
}

// Klasa Cat, która dziedziczy po Animal i implementuje Moveable
class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void start() {
        System.out.println(getType() + " starts!");
    }

    @Override
    public void stop() {
        System.out.println(getType() + " stopped!");
    }
}