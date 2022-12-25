import Cabins.CabinInPavilion;
import other.*;
import person.*;
import technical.PartsOfRocket;
import technical.Places;
import technical.Time;
import technical.WhatTimeIsAtNow;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        String pl_rocket = Places.ROCKET.toString();
        String pl_building = Places.PAVILION_OF_ZERO_GRAVITY.toString();
        String pl_city = Places.CITY.toString();
        String pl_in = Places.IN.toString();
        String pl_near = Places.NEAR.toString();

        Znaika znaika = new Znaika("Знайка", 50);
        Neznaika neznaika = new Neznaika("Незнайка", 55);
        Fuchsia fuchsia = new Fuchsia("Фуксия", 43);
        Seledochka seledochka = new Seledochka("Селёдочка", 46.52);
        Visitors visitors = new Visitors("посетители",2395.2, 48);

        Building pavilionNevesomosti = new Building(Places.CITY.toString(), "Павильон невесомости", "Белое", "в форме перевернутой миски", "Большое", true );
        City kosmicheskiy = new City("Космический", "существует");
        City tsvetochnyi = new City("Цветочный", "существует");

        Engine engine = new Engine("steel", 1.25);
        Fans fans = new Fans("steel", 23);
        Thermostats thermostats = new Thermostats("steel", 8);
        AirCleaners airCleaners = new AirCleaners("steel", 14);
        CabinInPavilion cabinInPavilion = new CabinInPavilion(znaika.getName(),
                " лунный камень, магнит, и металл",
                2.05,
                " небольшая ",
                1.0f,
                " прозрачный пластик");
        AntiGravityDevice antiGravityDevice = new AntiGravityDevice(znaika.getName()," лунный камень, магнит и металл ", 2.05);

        AntiGravityDevice.Work workOfAntiGravityDevice = new AntiGravityDevice.Work(" лунный камень ", " магнит ");

        Rocket rocket = new Rocket(engine, fans, thermostats, airCleaners);
        WhatTimeIsAtNow time = new WhatTimeIsAtNow();

        ////////////////////////////////////////

        rocket.launchSystems();
        rocket.globalCheckUp();
        System.out.println();
        Thread.sleep(1500);

        fuchsia.setLocation(pl_in, pl_rocket);
        seledochka.setLocation(pl_in, pl_rocket);
        System.out.println(seledochka.describe() + "и " + fuchsia.describe());
        visitors.setLocation(pl_in, pl_rocket);
        neznaika.setLocation(pl_in, pl_rocket);
        Rocket.Notice(neznaika.getName(),pl_in);
        Rocket.Notice(visitors.getName(), pl_in);
        System.out.println(neznaika.describe());
        System.out.println(visitors.describe());
        System.out.println();

        System.out.println(visitors.lay("на койках."));
        System.out.println(visitors.sit("в салоне."));
        System.out.println(visitors.examine(PartsOfRocket.CABIN_OF_CONTROL +
                ", " + PartsOfRocket.ELECTRIC_MACHINE_OF_CONTROL +
                " или " + PartsOfRocket.BYTECODE));
        seledochka.watchFor(PartsOfRocket.FANS);
        fuchsia.watchFor(PartsOfRocket.AIR_CLEANERS);
        visitors.Ask(PartsOfRocket.FANS);
        fuchsia.Answer(PartsOfRocket.FANS, fuchsia.getName());
        neznaika.Ask(PartsOfRocket.AIR_CLEANERS);
        seledochka.Answer(PartsOfRocket.AIR_CLEANERS, seledochka.getName());
        visitors.Ask(PartsOfRocket.THERMOSTATS);
        fuchsia.Answer(PartsOfRocket.THERMOSTATS, fuchsia.getName());
        fuchsia.watchFor(PartsOfRocket.THERMOSTATS);
        seledochka.watchFor(PartsOfRocket.THERMOSTATS);
        neznaika.Ask(PartsOfRocket.BYTECODE);
        seledochka.Answer(PartsOfRocket.BYTECODE, seledochka.getName());
        System.out.println();

        System.out.println(visitors.must("надеть скафандры."));
        System.out.println(visitors.toDo("надели скафандры."));
        Rocket.Notice(neznaika.getName(),"out");
        Rocket.Notice(visitors.getName(), "out");
        System.out.println();

        neznaika.setLocation(pl_near, pl_rocket);
        visitors.setLocation(pl_near, pl_rocket);
        System.out.println(neznaika.describe() + "и " + visitors.describe());
        neznaika.Waits("какое-то время");
        Rocket.Notice(neznaika.getName(),pl_in);
        Rocket.Notice(visitors.getName(), pl_in);
        visitors.setLocation(pl_in, pl_rocket);
        neznaika.setLocation(pl_in, pl_rocket);
        System.out.println(visitors.describe() + "и " + neznaika.describe());
        System.out.println("В течение дня " + neznaika.getName() + "несколько раз побывал в ракете. ");
        System.out.println();

        System.out.println(kosmicheskiy.describe());
        pavilionNevesomosti.setLocation(pl_near, pl_city);
        System.out.println(pavilionNevesomosti.describe());

        visitors.setLocation(pl_in,pl_building);
        System.out.println(visitors.describe());
        System.out.println(visitors.Fly());
        neznaika.setLocation(pl_in,pl_building);
        System.out.println(neznaika.describe());
        System.out.println(neznaika.Fly());
        System.out.println();

        if (time.getTime() == Time.MORNING){
            System.out.println(neznaika + " включил прибор невесомости.");
            workOfAntiGravityDevice.process();
        }
        if (time.getTime() == Time.EVENING) {
            System.out.println(neznaika + " тщательно проверил, не остался ли кто-нибудь в павильоне.");
        }

        if (visitors.getLocation() == Places.NEAR.toString() + Places.AREA_OF_ZERO_GRAVITY.toString()){

        }
    }
}