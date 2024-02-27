public class App {
    public static void main(String[] args) throws Exception {
        Student manojObj = new Student(123, "Manoj", 24, 5, "Problem Solving!!");
        manojObj.study();
        manojObj.sleep();
        manojObj.bunk();
        manojObj.gfName();

        StudentTwo sanojObj = new StudentTwo();
        // Set id, name, and gfName
        sanojObj.setId(124);
        sanojObj.setName("Sanoj");
        sanojObj.setGFName("Sanoji");

        // Get id, name, and gfName
        sanojObj.getId();
        sanojObj.getName();
        sanojObj.getGFName();
    }
}
