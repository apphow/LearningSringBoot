package com.example.demo;

import com.example.demo.controllers.ConstructorInjectedController;
import com.example.demo.controllers.MyController;
import com.example.demo.controllers.PropertyInjectedController;
import com.example.demo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        // we didn't create a controller object with a "new Controller",
        // spring in the framework did that for us. Inside of
        // SpringContext, Spring is creating a new instance
        // of the MyController Class and putting it into the context
        // and on the enxt line (line 23), we're telling Spring we want
        // an instance --from the context, provide me an instance of the
        // MyController Bean      INVERSION OF CONTROL / DEPENDENCY INJECTION
        // SPRING IS MANAGING THE CONSTRUCTION OF THE CONTROLLER
        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = MyController.sayHello();

        System.out.println(greeting);

        System.out.println("...........Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println(".............Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("...........Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        // currently we only have one implementation of the greeting service for our constructor, property and setter
        // controllers, but what if we want the
        // to inject a specific greeting service
        // for the Setter and Property controllers.

        //we can use the @Qualifier annotation


    }

}
