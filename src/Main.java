public class Main {
    /*
    Создать иерархию родительский и дочернии классы для Транспорта
    Например Транспорт - > Автомобиль - > Автобус
    Транспорт - > Автомобиль - > Легковой
    Используем наследование, инкапсуляцию
     */
    public static void main(String[] args) {

        Transport security = new PoliceCar(Transport.getWheelsCount(),Transport.getCountPassenger(),
                Transport.getEngineValue(), Transport.getTypeEngine(),"Ford","Mustang",Auto.getColor(),
                Auto.getPrice(),PoliceCar.getTypeCar(), CarType.getMatherial(),PoliceCar.getTypeSpeaker(),
                PoliceCar.getBlinksColor(),PoliceCar.getRadioBrand(), PoliceCar.getDonutsCount());

        Transport school = new Bus(Transport.getWheelsCount(),Bus.getCountPassenger(),Transport.getEngineValue(),
                Transport.getTypeEngine(),"MAN","11",Auto.getColor(),Auto.getPrice(),Bus.getTypeBus(),
                Bus.getStartWorkTime(),Bus.getEndWorkTime());

        Transport dangerousGuy = new SportCar(Transport.getWheelsCount(),SportCar.getCountPassenger(),
                Transport.getEngineValue(),Transport.getTypeEngine(),"Lamborghini","Gallardo",
                Auto.getColor(),Auto.getPrice(),SportCar.getTypeCar(),CarType.getMatherial(),SportCar.getNameOfTrack(),
                SportCar.getTypeOfDoors());

        Transport truck = new MoverCar(MoverCar.getWheels(),MoverCar.getCountPassenger(),Transport.getEngineValue(),
                Transport.getTypeEngine(),"Truck","Master",Auto.getColor(),Auto.getPrice(),
                MoverCar.getTypeBody(),MoverCar.getTarged());

        Transport justCar = new CitizenCar(Transport.getWheelsCount(),Transport.getCountPassenger(),
                Transport.getEngineValue(),Transport.getTypeEngine(),"Lexus","RX", Auto.getColor(),
                Auto.getPrice(),CitizenCar.getTypeCar(),CarType.getMatherial(),CitizenCar.getNameAudioSystem());


        System.out.println(security.getInfo());
        System.out.println(school.getInfo());
        System.out.println(dangerousGuy.getInfo());
        System.out.println(truck.getInfo());
        System.out.println(justCar.getInfo());

    }

}