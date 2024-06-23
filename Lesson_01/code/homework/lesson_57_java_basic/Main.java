package homework.lesson_57_java_basic;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static <T> List<String> getListOfProperties(List<T> list, Function<T, String> func) {
        List<String> result = new ArrayList<>();
        for (T item : list) {
            result.add(func.apply(item));
        }
        return result;
    }


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Address address1 = new Address("23", "Dus", "Furt", "66");
        Address address2 = new Address("24", "Hilden", "Eisen", "67");
        Address address3 = new Address("25", "Erkrath", "Beethoven", "68");
        Address address4 = new Address("26", "Koeln", "Nord", "69");
        Address address5 = new Address("27", "Berlin", "Sued", "70");

        Person person1 = new Person("Maksym", "Bil", "maksim@com", "34567", address1);
        Person person2 = new Person("Olga", "Skrip", "olga@com", "76543", address2);
        Person person3 = new Person("Dominik", "Bil", "dominik@com", "34123", address3);
        Person person4 = new Person("Natalia", "Boh", "natalia@com", "33233", address4);
        Person person5 = new Person("Irina", "Ale", "irirna@com", "45623", address5);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        List<String> fullName = getListOfProperties(personList, person -> person.fName + " " + person.lName);
        List<String> email = getListOfProperties(personList, person -> person.email);
        List<String> telephoneNumber = getListOfProperties(personList, person -> person.phone);
        List<String> adress = getListOfProperties(personList, person -> person.fName + " " + person.address.toString());
//        System.out.println(fullName);
//        System.out.println(email);
//        System.out.println(telephoneNumber);
        System.out.println(adress);

    }
}


