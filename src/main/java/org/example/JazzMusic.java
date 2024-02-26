package org.example;

import org.springframework.stereotype.Component;

//@Component("jazzMusicBean")
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Cry Me a River";
    }
}
