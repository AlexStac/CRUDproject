package ru.taxicrud.crudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.taxicrud.crudproject.config.ApplicationConfiguration;

@SpringBootApplication
@Import(ApplicationConfiguration.class)
public class CrudprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudprojectApplication.class, args);
    }

}
