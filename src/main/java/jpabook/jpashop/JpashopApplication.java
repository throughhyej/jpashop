package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setData("hyej");
        System.out.println("## " + helloWorld.getData());

        SpringApplication.run(JpashopApplication.class, args);
    }

}
