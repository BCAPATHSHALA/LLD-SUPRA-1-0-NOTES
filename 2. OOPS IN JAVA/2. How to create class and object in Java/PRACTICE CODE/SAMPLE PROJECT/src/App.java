public class App {
    public static void main(String[] args) throws Exception {
        // Parameterized CTOR
        Student manojObj = new Student(123, "Manoj", 24, 5);
        manojObj.study();

        // Copy CTOR
        Student rahulObj = new Student(manojObj);
        rahulObj.study();
    }
}
