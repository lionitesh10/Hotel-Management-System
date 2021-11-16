package Controllers;

import Repository.RoomsRepository;
import models.RoomsModel;

import java.util.ArrayList;

public class RoomsController {

    private RoomsRepository roomsRepository;

    public int createRoom(RoomsModel room){
        roomsRepository=new RoomsRepository();
        return roomsRepository.insertRoomData(room);
    }

    public ArrayList<RoomsModel> showRooms(){
        roomsRepository=new RoomsRepository();
        return roomsRepository.getAvailableRooms();
    }
}
