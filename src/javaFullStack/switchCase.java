package javaFullStack;

public class switchCase {
    public static void main(String[] args) {
        String name = "team";
        // SWITCH CASE
        switch (name.toLowerCase()) {
            case "author":
                System.out.println("Jimmy");
                break;
            case "team":
                System.out.println("Go Java Team");
                break;
            case "editor":
                System.out.println("Ling & Bob");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
