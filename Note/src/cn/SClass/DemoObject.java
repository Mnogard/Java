package cn.SClass;

import java.util.Objects;

public class DemoObject {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "DemoObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoObject that = (DemoObject) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
