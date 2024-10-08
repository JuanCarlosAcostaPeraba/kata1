package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person juanCarlos = new Person("Juan Carlos", LocalDate.of(1998, 12, 3));
        System.out.println(juanCarlos);
    }
}
