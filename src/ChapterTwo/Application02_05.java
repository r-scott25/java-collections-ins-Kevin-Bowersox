package ChapterTwo;

import java.util.*;

public class Application02_05 {
    public static void main(String[] args) {

        Collection c1 = new HashSet();

        Set c2 = new HashSet();

        List c3 = new ArrayList();

//        Collection c4 = new Collection();   Cannot do this b/c the Collection type does not have any direct implementation

        Collection<String> c5 = new ArrayList<>();
        c5.add("family");
        c5.add("friends");
        c5.add("newJob");
        c5.add("adventure");
        c5.add("meditation");
        c5.add("family");

        System.out.println(c5);   /* Prints all the elements in the arraylist*/


        Collection<String> grateful = new HashSet<>(c5);
        System.out.println(grateful);  /* Does not print family twice - a set cannot contain duplicates */


//        Best Practice: Avoid doing this . . . (Using ArrayList, which is the Concrete Implementation, as the Variable Type)
             ArrayList<String> c6 = new ArrayList<>();
//        Best Practice: Instead do this . . . (Use the most abstract Type possible, such as List or Collection)
            List<String> c7 = new ArrayList<>();
            Collection<String> c8 = new ArrayList<>();
    }
}
