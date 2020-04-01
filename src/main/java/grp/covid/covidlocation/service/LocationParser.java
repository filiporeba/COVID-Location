package grp.covid.covidlocation.service;

import grp.covid.covidlocation.model.Coordinate;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationParser {


    public List<Coordinate> getLocations() {
        List<Coordinate> locationList = new ArrayList<>();

        String readLocationsFile = "";
        try {
            readLocationsFile = new String(Files.readAllBytes(Paths.get("../COVID-Location/src/main/resources/locations.csv")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringReader stringReader = new StringReader(readLocationsFile);
        CSVParser csvParser = null;
        try {
            csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(stringReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (CSVRecord points : csvParser) {
            String region = points.get("Region");
            double lat = Double.parseDouble(points.get("Lat"));
            double lon = Double.parseDouble(points.get("Long"));
            String infected = points.get("Infected");
            locationList.add(new Coordinate(region, lat, lon, infected));

        }
        return locationList;
    }
}
