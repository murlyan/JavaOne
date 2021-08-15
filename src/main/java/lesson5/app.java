package lesson5;

public class app {
    //private static Object Employee;

    public static void main(String[] args) {
        //Employee first = new Employee(Employee[1];
        Employee[] Person = new Employee[5];
        Person[0] = new Employee("Иванов Иван Иванович", "Engineere", "aaa@aa.aa", "89997223311", 30000, 40);
        Person[1] = new Employee("Молодец Сергей Семенович", "QA", "aaa@aa.aa", "89997223312", 80000, 26);
        Person[2] = new Employee("Багов Виталий Писатьевич", "Developer", "aaa@aa.aa", "89997223315", 130000, 39);
        Person[3] = new Employee("Четвертый", "PM", "aaa@aa.aa", "89997223316", 90000, 30);
        Person[4] = new Employee("Владимир Владимирович Управляев", "Director", "aaa@aa.aa", "89997223317", 1000, 70);

        for (int i = 0; i<Person.length; i++){
            if (Person[i].getAge() < 40){
                System.out.println(Person[i]);
            }
        }

    }


}
