import java.util.ArrayList;
import java.util.List;

class Building implements HousingStructure {
    private String buildingName;
    private List<HousingStructure> floors = new ArrayList<>();

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    public void add(HousingStructure structure) {
        floors.add(structure);
    }

    public void remove(HousingStructure structure) {
        floors.remove(structure);
    }

    public void showDetails() {
        System.out.println("Building: " + buildingName);
        for (HousingStructure structure : floors) {
            structure.showDetails();
        }
    }
}
