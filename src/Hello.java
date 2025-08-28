public class Hello {
    private String name;

    Hello() {
        this.name = "learner";
    }

    Hello(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Hello " + name);
    }
}
