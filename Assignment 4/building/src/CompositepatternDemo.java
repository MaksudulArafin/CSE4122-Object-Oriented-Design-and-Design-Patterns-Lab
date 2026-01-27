public class CompositepatternDemo {
    public static void main(String[] args) throws Exception {
        HousingStructure room1 = new Room("101");
        HousingStructure room2 = new Room("102");
        HousingStructure room3 = new Room("103");


        Floor firstFloor = new Floor("First Floor");
        Floor secondFloor = new Floor("Second Floor");

        firstFloor.add(room1);
        firstFloor.add(room2);
        secondFloor.add(room3);

        Building building = new Building("Green View Apertments");
        building.add(firstFloor);
        building.add(secondFloor);

        building.showDetails();
    }
}
