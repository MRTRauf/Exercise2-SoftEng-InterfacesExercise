public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Budi", "Santoso");
        Person p2 = new Person("Juan", "Wijaya");
        Person p3 = new Person("Siti", "Rahma");
        Person p4 = new Person("Dimas", "Saputra");
        Person p5 = new Person("Fajar", "Alfian");

        Person[] persons = {p1, p2, p3, p4, p5};


        Sorter sorter = new Sorter();

        System.out.println("Before Sorting:");
        for (int j = 0; j < persons.length; j++) {
            persons[j].print();
        }
        sorter.sort(persons);


        System.out.println("After Sorting:");
        for (int i = 0; i < persons.length; i++) {
            persons[i].print();
        }

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 2);
        Rectangle r3 = new Rectangle(6, 3);
        Rectangle r4 = new Rectangle(2, 2);
        Rectangle r5 = new Rectangle(5, 5);

        Rectangle[] rectangles = {r1, r2, r3, r4, r5};

        System.out.println("Rectagle before sorting:");

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].area());
        }

        sorter.sort(rectangles);

        System.out.println("Rectangle after Sorting:");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].area());
        }
    }

}