package pattern.design.builder;

/**
 * Created by User on 18-Aug-22.
 */
public class Person {

    private String name;

    private String age;

    private String district;

    private GenderType gender;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getDistrict() {
        return district;
    }

    public GenderType getGender() {
        return gender;
    }

    public Person() {
    }

    public Person(String name, String age, String district, GenderType gender) {
        this.name = name;
        this.age = age;
        this.district = district;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", district='" + district + '\'' +
                ", gender=" + gender +
                '}';
    }
}
