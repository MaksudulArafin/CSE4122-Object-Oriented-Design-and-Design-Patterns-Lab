public class Room implements HousingStructure{
    private String roomName;

    public Room(String roomName){
        this.roomName = roomName;
    }

    public void showDetails(){
        System.out.println("Room: "+roomName);
    }
}
