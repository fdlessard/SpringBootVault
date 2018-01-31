package io.fdlessard.codebites.vault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class VaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaultApplication.class, args);
    }


    @Value("${password}")
    String password;

    @PostConstruct
    private void postConstruct() {
        System.out.println("My password is: " + password);
    }

}