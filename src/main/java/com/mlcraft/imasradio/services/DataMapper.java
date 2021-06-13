package com.mlcraft.imasradio.services;

import com.mlcraft.imasradio.model.SongData;
import com.mlcraft.imasradio.model.SongDataEntity;
import org.springframework.stereotype.Service;

@Service
public class DataMapper {
    public SongData songDataEntityConvert(SongDataEntity songDataEntity) {
        if ( songDataEntity == null ) {
            return null;
        }

        SongData songData = new SongData();

        songData.setId( songDataEntity.getId() );
        songData.setName( songDataEntity.getName() );
        songData.setUrl( songDataEntity.getUrl() );
        songData.setLength( songDataEntity.getLength() );
        songData.setArtist( songDataEntity.getArtist() );
        songData.setAlbum( songDataEntity.getAlbum() );
        songData.setCover( songDataEntity.getCover() );

        return songData;
    }
}
