
import java.util.ArrayList;
import java.util.List;

public class Floor implements HousingStructure {
    private String floorName;
    private List<HousingStructure> rooms = new ArrayList<>();


    public Floor(String floorName){
        this.floorName = floorName;
    }

    public void add(HousingStructure structure){
        rooms.add(structure);
    }

    public void remove(HousingStructure structure){
        rooms.remove(structure);
    }

    public void showDetails(){
        System.out.println("Floor: " +floorName);
        for(HousingStructure structure : rooms){
            structure.showDetails();
        }
    }
}
