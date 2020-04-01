package grp.covid.covidlocation.controller;

import grp.covid.covidlocation.service.LocationParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    private final LocationParser locationParser;

    public MapController(LocationParser locationParser) {
        this.locationParser = locationParser;
    }

    @GetMapping
    public String getMap(Model model) {
        model.addAttribute("spots", locationParser.getLocations());
        return "worldMap";
    }
}
