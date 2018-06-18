package service;

import dao.GuitarDao;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuitarService {

    public List<Guitar> getGuitars(GuitarSpec guitarSpec) {
        GuitarDao guitarDao = new GuitarDao();
        Inventory inventory = new Inventory();
        inventory.setGuitars(guitarDao.getAllGuitar());
        return inventory.search(guitarSpec);
    }
}
