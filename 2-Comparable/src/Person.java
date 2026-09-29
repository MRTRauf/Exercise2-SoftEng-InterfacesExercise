public class Person implements Comparable<Person> {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println(name + " " + surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Person other) {
        if (surname.compareTo(other.getSurname()) > 0) {
            return 1;
        }

        if (surname.compareTo(other.getSurname()) < 0) {
            return -1;
        }

        return name.compareTo(other.getName());
    }
}
