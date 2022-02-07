package net.kezhu.dannywiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class DannywikiApplication {

    public static void main(String[] args) {

        SpringApplication.run(DannywikiApplication.class, args);
        System.out.println("xxx");
    }


}
