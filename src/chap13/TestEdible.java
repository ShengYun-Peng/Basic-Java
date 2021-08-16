package chap13;

public class TestEdible {
    public static void main(String[] args) {
        Edible oo = new Apple();
        System.out.println(((Apple) oo).myApple());
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        for (Object o : objects) {
            if (o instanceof Animal)
                System.out.println(((Animal) o).sound());
            else if (o instanceof Fruit)
                System.out.println(((Fruit) o).howToEat());
        }
    }
}

abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "Cock-a-doodle-doo";
    }

    @Override
    public String howToEat() {
        return "Chicken: fry it!";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Roar";
    }
}

abstract class Fruit implements Edible {
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: make apple cider";
    }

    public String myApple() {
        return "This is my apple";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }
}