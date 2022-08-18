package pattern.design.builder;

/**
 * Created by User on 18-Aug-22.
 */
public class MainClass {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Rahim")
                .setAge("20")
                .setGender(GenderType.MALE)
                .build();

        System.out.println(person.toString());

    }
}
