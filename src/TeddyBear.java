
public class TeddyBear {

    private String name;

    public TeddyBear() {
        System.out.println(" Nowy miś ");
    }

    public TeddyBear(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }
}
