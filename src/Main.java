import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
        value = changeValue(value);
        System.out.println(value);

        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2);

        Integer[] value3 = {3, 4};
        changeValue(value3);
        System.out.println(Arrays.toString(value3));

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);


        Person person2 = new Person("Lyapis", "Trubetskoy");
        System.out.println(person2);
        changePerson2(person2);
        System.out.println(person2);


    }

    static int changeValue(int value) {
        value = 22;
        return value;
        // This method creates its own variable value, in which the int binary content of 33 were copied.
        // The content of internal variable was changed to 22, but never used. We need to assign
        // the result of method to another variable (ever "value" variable within main method)
        // using "=" operator, so changeValue will take effect
    }
    static void changeValue(Integer value2) {
        value2 = Integer.valueOf(22);
        System.out.println(value2.getClass());
        // This method creates its own variable value2, in which the int content of 33 were copied.
        // The content of internal variable was changed to 22, but never used. We need to assign
        // the result of method to another variable (ever "value" variable within main method)
        // using "=" operator, so changeValue will take effect
    }
    static void changeValue(Integer[] value3) {
        value3[0] = 99;
        // This method creates its own variable value2, in which the int content of 33 were copied.
        // The content of internal variable was changed to 22, but never used. We need to assign
        // the result of method to another variable (ever "value" variable within main method)
        // using "=" operator, so changeValue will take effect
    }
    static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }
    static void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}