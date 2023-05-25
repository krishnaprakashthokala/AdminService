package org.ecommerce.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"META-INF/rr/**/*.xml"})
public class AdminServiceApp {
    public static void main(String[] args)
    {
      SpringApplication.run(AdminServiceApp.class, args);
    }
}