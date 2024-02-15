import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Homework homework = context.getBean("homeworkOriginalBean", Homework.class);
//        Pass pass = new Pass(homework);
//        pass.func();
//        System.out.println("Reinitializing beans");
//        homework = context.getBean("homeworkCopyBean", Homework.class);
//        pass = new Pass(homework);
//        pass.func();
        Pass pass = context.getBean("pass", Pass.class);
        pass.func();
        context.close();

    }
}
