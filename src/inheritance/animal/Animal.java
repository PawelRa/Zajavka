package inheritance.animal;

public class Animal {
    protected String color;
private String name;
    public Animal(int i, String name) {
        System.out.println("Animal created: " + i);
        this.name = name;
    }


    public Animal(String color) {
        this.color = color;
    }
    public String sound() {return "animal sound";}


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
