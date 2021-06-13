package com.mlcraft.imasradio.services;

import com.mlcraft.imasradio.model.SongData;
import com.mlcraft.imasradio.model.SongDataEntity;
import com.mlcraft.imasradio.repository.SongDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceJPA implements DataService {

    @Autowired
    private DataMapper dataMapper;

    @Autowired
    private SongDataRepository songDataRepository;

    @Override
    public SongData getSong(Long id) {
        SongDataEntity songData = songDataRepository.getById(id);
        SongData resultData = dataMapper.songDataEntityConvert(songData);
        return resultData;
    }

}
