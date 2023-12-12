import java.util.*;

public class Main {
    public static void main(String[] args) {
        City city = new City(GeneratorID.generator(), "Osh", 456456);
        City city2 = new City(GeneratorID.generator(), "Talas", 4566);
        City city3 = new City(GeneratorID.generator(), "Karasuu", 44456);
        City city4 = new City(GeneratorID.generator(), "Batken", 4566);
        City city5 = new City(GeneratorID.generator(), "Kyzyl-Kia", 44346456);
        City city6 = new City(GeneratorID.generator(), "Bishkek", 4564536);
        City city7 = new City(GeneratorID.generator(), "Alaikuu", 7843435);
        City city8 = new City(GeneratorID.generator(), "Jalal-Abad", 4456);
        Map<Long,City> massive = new HashMap<>();
        massive.put(45L,city);
        massive.put(4532L,city2);
        massive.put(465L,city3);
        massive.put(4L,city4);
        massive.put(415L,city5);
        massive.put(5L,city6);
        massive.put(42L,city7);
        massive.put(445L,city8);
        Set<Map.Entry<Long,City>> treeset = new HashSet<>();
        for (Map.Entry<Long, City> entry : massive.entrySet()) {
            if (entry.getKey() % 2 != 0) {
                treeset.add(entry);
            }
        }
        Set<Map.Entry<Long, City>> treeSetDescending = new TreeSet<>(
                (entry1, entry2) -> Long.compare(entry2.getKey(), entry1.getKey())
        );

        treeSetDescending.addAll(treeset);
        for (Map.Entry<Long, City> entry : treeSetDescending) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}