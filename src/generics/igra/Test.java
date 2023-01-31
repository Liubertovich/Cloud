package generics.igra;

 public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 12);
        Schoolar schoolar2 = new Schoolar("Petr", 15);

        Student student1 = new Student("Kolya", 20);
        Student student2 = new Student("Geor", 22);

        Employee employee1 = new Employee("Viktor", 35);
        Employee employee2 = new Employee("Alex", 42);

        Team <Schoolar> schoolarTeam = new Team("Drakoni");
        Team <Student> studentTeam = new Team("Pushki");
        Team <Employee> employeeTeam = new Team("Stariki");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

//        schoolarTeam.addNewParticipant(student1);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team <String> anotherTeam = new Team<>("Fignya");
//        anotherTeam.addNewParticipant("bla bla bla");\

        Team <Schoolar> schoolarTeam2 = new Team("Mudreci");
        Schoolar schoolar3 = new Schoolar("Nadya", 13);
        Schoolar schoolar4 = new Schoolar("Olya", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWhith(schoolarTeam2);
//        schoolarTeam.playWhith(employeeTeam);


    }
}
