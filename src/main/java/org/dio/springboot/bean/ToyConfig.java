package org.dio.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ToyConfig {

    @Bean
    public Toy legoSet() {
        return new Toy("Lego Minecraft", 500);
    }

    @Bean
    public Toy legoSet2() {
        return new Toy("Lego Pinguim", 280);
    }

    @Bean
    public Toy legoSet3() {
        return new Toy("Lego Senhor dos Aneis", 350);
    }
}
