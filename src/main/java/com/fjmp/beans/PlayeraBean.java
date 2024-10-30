package com.fjmp.beans;

import com.fjmp.domain.Playera;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class PlayeraBean {
    private List<Playera> playeras = new ArrayList<>();

    public PlayeraBean() {
        playeras.add( new Playera(100, "Playera del ITESS ITICS", "M", 3, "imagen1.png") );
        playeras.add( new Playera(99, "Playera del ITESS IGE", "M", 3, "imagen1.png") );
        playeras.add( new Playera(50, "Playera del ITESS AGRO", "M", 3, "imagen1.png") );
    }

    public List<Playera> getPlayeras() {
        return playeras;
    }

    public void setPlayeras(List<Playera> playeras) {
        this.playeras = playeras;
    }
 
}
