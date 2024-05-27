public class MyClass {
    private int id;
    private String name;

    
    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
       
        MyClass obj1 = new MyClass(1, "raghav");
        MyClass obj2 = new MyClass(2, "munna");

        
        System.out.println("Details of obj1:");
        obj1.display();

        System.out.println("\nDetails of obj2:");
        obj2.display();
    }
}
