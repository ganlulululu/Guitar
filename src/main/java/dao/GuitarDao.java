package dao;

import model.Guitar;
import model.GuitarSpec;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuitarDao {

    public List<Guitar> getAllGuitar(){
        ResultSet rs=SqliteUtil.executeQuery("SELECT * FROM Instrument;", new Object[]{});
        List<Guitar> guitarList =new ArrayList<Guitar>();
        try{
            while(rs.next()){
                Guitar Guitar =new Guitar();
                Guitar.setSerialNumber(rs.getInt(1));
                Guitar.setInstrumentType(rs.getString(2));
               // Guitar.setCount(rs.getInt(6));
                GuitarSpec guitarSpec = new GuitarSpec();
                guitarSpec.setBuilder(rs.getString(3));
                guitarSpec.setStyle(rs.getString(4));
                guitarSpec.setType(rs.getString(5));
                Guitar.setGuitarSpec(guitarSpec);
                guitarList.add(Guitar);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return guitarList;
    }
}
