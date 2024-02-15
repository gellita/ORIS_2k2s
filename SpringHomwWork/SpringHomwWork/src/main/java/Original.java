//сам делал домашку
public class Original implements Homework{

    public Original() {
        System.out.println("original homework initialized");
    }
    @Override
    public void getMark() {
        System.out.println("100 points");
    }
}
