package helper;

import java.util.Objects;

public class Employee1 {
    private Integer id;
    private String name;

    public Employee1( String name, Integer id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Employee1)) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(id, employee1.id) && Objects.equals(name, employee1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
