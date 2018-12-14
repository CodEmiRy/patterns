import builder.Person;
import factory.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Vehicle car = VehicleFactoryFactory.getInstance().getVehicle(VehicleFactoryEnum.CAR);
        Vehicle ship = VehicleFactoryFactory.getInstance().getVehicle(VehicleFactoryEnum.PLANE);
        Vehicle plane = VehicleFactoryFactory.getInstance().getVehicle(VehicleFactoryEnum.SHEEP);
        Vehicle[] vehilces = {car, ship, plane};
        Arrays.stream(vehilces).forEach(a->System.out.println(a));


        Person[] people = new Person[3];

        Person Ania = Person.PersonBuilder.aPerson("123123123").build();
        Person OloAnia = Person.PersonBuilder.aPerson("234234").build();
        Person AniaEla = Person.PersonBuilder.aPerson("12312312").build();

        people[0] = Ania;
        people[1] = OloAnia;
        people[2] = AniaEla;

        Arrays.stream(people).forEach(a->System.out.println(a));
    }
}
