import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print("First method: ");
        int value = 33;
        changeValue(value);
        System.out.println(value);

        System.out.print("Second method: ");
        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2);

        System.out.print("Third method: ");
        Integer[] value3 = {3, 4};
        changeValue(value3);
        System.out.println(Arrays.toString(value3));

        System.out.print("Fourth method: ");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);

        System.out.print("Fifth method: ");
        Person person2 = new Person("Lyapis", "Trubetskoy");
        System.out.println(person2);
        changePerson2(person2);
        System.out.println(person2);

        System.out.print("Sixth method: ");
        String str = "Tzoy zhiv";
        changeString(str);
        System.out.println(str);
    }

    // При передаче переменной или объекта в метод в качестве параметра в методе создается локальная переменная,
    // в данную переменную копируется значение передаваемой переменной, для примитивных типов это непосредственно значение,
    // для объектов это ссылка на конкретный объект.
    static int changeValue(int value) {
        value = 22;
        return value;
    // В первой задаче мы изменили значение локальной переменной в методе 33, но результат метода не присвоили никакой
    // переменной извне метода, следовательно снаружи метода результат отсутствует.
    }
    static void changeValue(Integer value2) {
        value2 = 22;
    // Во втором методе мы присвоили локальной переменной типа Integer новое значение, в методе создался новый
    // объект класса Integer и в локальную переменную value поместилась ссылка на новый объект. При этом первоначальный объект не изменился.
    }
    static void changeValue(Integer[] value3) {
        value3[0] = 99;
    // В третьем методе в локальную переменную также как и в прошлый метод была передана ссылка. В этот раз ссылка на массив.
    // С помощью оператора присваивания мы изменили значение первой ячейки массива, при этом новый объект не создавался, и
    // манипуляции происходили с исходным массивом. Значение локальной переменной не изменилось, в ней по-прежнему хранится
    // ссылка на исходный массив.
    }
    static void changePerson(Person person){
        person = new Person("Ilya", "Lagutenko");
        // В четвертый метод мы передали ссылку на объект класса Person в локальную переменную метода.
        // При помощи оператора присваивания и оператора new мы поместили в локальную переменную ссылку на вновь созданный объект,
        // при этом первый объект не изменился.
    }
    static void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
        // В пятый метод мы также передали ссылку на объект класса Person, скопировали в локальную переменную метода.
        // Но затем изменили одно из полей объекта, используя эту ссылку. Таким образом, изменился исходный объект, а
        // в локальной переменной метода по-прежнему хранится ссылка на этот объект.
    }
    static void changeString(String str) {
        str = "Tzoy mertv";
    }
}