package com.mlcraft.imasradio.controller;

import com.mlcraft.imasradio.model.SongData;
import com.mlcraft.imasradio.services.DataServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RadioController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private DataServiceJPA songService;

    @GetMapping("/metadata")
    public SongData getSongData(@RequestParam(value = "id", defaultValue = "1") long id) {
        // TODO: take out song length and add next song url
        return songService.getSong(id);
    }

    // TODO: write time endpoint
}
