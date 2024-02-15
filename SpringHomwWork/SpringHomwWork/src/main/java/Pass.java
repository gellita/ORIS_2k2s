//сдать домашку

public class Pass {
    private Homework homework;

    public Pass(Homework homework) {
        this.homework = homework;
        System.out.println("passed homework initialised");
    }
    void func(){
        homework.getMark();
    }
}
