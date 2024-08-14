package org.dio.springboot.component;

import org.dio.springboot.component.Car;
import org.dio.springboot.component.Gas;
import org.dio.springboot.component.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    private final Car car;
    private final Gas gas;
    private final Stop stop;

    @Autowired
    public VehicleService(Car car, Gas gas, Stop stop){
        this.car = car;
        this.gas = gas;
        this.stop = stop;
    }

    public void performActions() {
        car.drive();
        gas.Abastecer();
        stop.Parar();
    }
}
