package ChapterTwo;

import ChapterOne.Room;

import java.util.ArrayList;
import java.util.Collection;

public class Application02_06 {

    public static void main(String[] args) {

        Collection<Room> c = new ArrayList<>();
//        c.add("Cambridge");  - cannot add Cambridge as an element because it is a String variable type, not a Room variable type
        c.add(new Room("Cambridge", "Suite", 6, 250.0));
        c.add(new Room("Piccadilly", "Guest Room", 4, 150.0));

        c.stream()
                .forEach(e -> System.out.println(e.getName()));

        Collection c2 = new ArrayList(); //Same Collection Type, Different Element Type
        c2.add(new Room("Cambridge", "Suite", 6, 250.0));

    }

}
