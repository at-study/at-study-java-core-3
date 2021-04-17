package lections.lesson1;

public class RoomExecutor {

    public static void main(String[] args) {
        Room room = new Room();
        room.height = 4;
        room.bed = new Room.Bed();
        room.bed.personCount = 2;
        room.bed.height = 2;
        room.bed.width = 1;
        room.table = new Room.Table();
        room.table.depth = 1;
        room.table.height = 1;
        room.table.width = 2;
        room.table.transformMechanism = new Room.Table.TransformMechanism();
        room.table.transformMechanism.transformationTime = 3;
        room.table.transformMechanism.transform();
    }

}
