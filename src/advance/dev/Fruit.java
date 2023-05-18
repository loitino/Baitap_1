package advance.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit {
    private double weight;
    private String name;
    private double price;
    
    public Fruit(double weight, String name, double price) {
        this.weight = weight;
        this.name = name;
        this.price = price;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}

interface IManager {
    public void addFruit(Fruit fruit);
    public void editFruit(int index, Fruit fruit);
    public void deleteFruit(int index);
    public void sortFruits(Comparator<Fruit> comparator);
    public List<Fruit> getAllFruits();
}

class FruitManager implements IManager {
    private List<Fruit> fruits = new ArrayList<>();
    
    @Override
    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    @Override
    public void editFruit(int index, Fruit fruit) {
        fruits.set(index, fruit);
    }

    @Override
    public void deleteFruit(int index) {
        fruits.remove(index);
    }

    @Override
    public void sortFruits(Comparator<Fruit> comparator) {
        Collections.sort(fruits, comparator);
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruits;
    }
}

