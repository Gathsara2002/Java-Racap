package theory;

import java.util.Objects;

/**
 * @author : Gathsara
 * created : 2/26/2024 -- 7:48 PM
 **/

public class Record {
    public static void main(String[] args) {

        //with class
        EmployeeClass employeeClass = new EmployeeClass("John", 28);
        System.out.println(employeeClass);

        //with record
        EmployeeRecord employeeRecord = new EmployeeRecord("Alex", 32);
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.name());
        System.out.println(EmployeeRecord.address);
        System.out.println(employeeRecord.nameInUpperCase());
    }
}

//use employee class to store and transfer data
class EmployeeClass {

    private String name;
    private int age;

    public EmployeeClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


record EmployeeRecord(String name, int age) {

    public static String address = "Colombo";

    public String nameInUpperCase() {
        return name.toUpperCase();
    }
}

//record valadi apata avashya fields parenthesis atule denna ona.
//e fields by default private,final
//e fields valata adalava getters hadenava.
//toString(),hashCode(),equals() auto override karanava.
//canonical constructor - canonical constructor
//setters ne .immutable
//vena class ekakin extend karanna be
//static novana instance hadanna be
//record default final
//interface ekakin implement karanna puluvn

