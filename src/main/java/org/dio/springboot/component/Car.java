package org.dio.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {
    public void drive() {
        System.out.println("O carro esta dirigindo");
    }
}
