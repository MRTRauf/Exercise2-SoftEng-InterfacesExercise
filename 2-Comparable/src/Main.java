import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Budi", "Santoso");
        Person p2 = new Person("Juan", "Wijaya");
        Person p3 = new Person("Siti", "Rahma");
        Person p4 = new Person("Dimas", "Saputra");
        Person p5 = new Person("Fajar", "Alfian");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);


        System.out.println("Before Sorting:");
        for (int j = 0; j < persons.size(); j++) {
            persons.get(j).print();
        }
        Collections.sort(persons);


        System.out.println("After Sorting:");
        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).print();
        }

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 2);
        Rectangle r3 = new Rectangle(6, 3);
        Rectangle r4 = new Rectangle(2, 2);
        Rectangle r5 = new Rectangle(5, 5);

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(r1);
        rectangles.add(r2);
        rectangles.add(r3);
        rectangles.add(r4);
        rectangles.add(r5);

        System.out.println("Rectagle before sorting:");

        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).area());
        }

        Collections.sort(rectangles);

        System.out.println("Rectangle after Sorting:");
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).area());
        }
    }

}