import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(new Class[]{AppConfig.class});
        HelloWorld bean = (HelloWorld)applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld)applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        Cat beanCat = (Cat)applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat beanCat2 = (Cat)applicationContext.getBean("cat");
        System.out.println(beanCat2.getMessage());
        if (bean == bean2) {
            System.out.println("bean(HelloWorld)==bean(HelloWorld)");
        } else {
            System.out.println("bean(HelloWorld)!=bean(HelloWorld)");
        }

        if (beanCat == beanCat2) {
            System.out.println("beanCat(Cat)==beanCat2(Cat)");
        } else {
            System.out.println("beanCat(Cat)!=beanCat2(Cat)");
        }

    }
}
