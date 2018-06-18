package controller;

import model.Guitar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.GuitarService;
import model.GuitarSpec;

import java.util.List;

@Controller
public class GuitarController {

    @Autowired
    GuitarService guitarService;

    @RequestMapping(value="/index")
    public String guitar(){
        return "index";
    }

    @RequestMapping(value="/show")
    public String show(GuitarSpec guitarSpec,Model model){
        List<Guitar> guitarList = guitarService.getGuitars(guitarSpec);
        model.addAttribute("guitarList",guitarList);
        return "show";
    }
}
