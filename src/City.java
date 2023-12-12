import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class City {
    private Long code;
    private String name;
    private Integer persons;

    public City() {
    }

    public City(Long code, String name, Integer persons) {
        this.code = code;
        this.name = name;
        this.persons = persons;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPersons() {
        return persons;
    }

    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
