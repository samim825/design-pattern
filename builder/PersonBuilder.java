package pattern.design.builder;

/**
 * Created by User on 18-Aug-22.
 */
public class PersonBuilder {


    private String name;

    private String age;

    private String district;

    private GenderType gender;

    public PersonBuilder setName(String name) {
        this.name = name;

        return this;
    }

    public PersonBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public PersonBuilder setGender(GenderType gender) {
        this.gender = gender;
        return this;
    }

    Person build(){
        return new Person(name, age,district,gender);
    }
}
