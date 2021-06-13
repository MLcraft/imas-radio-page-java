package com.mlcraft.imasradio.services;

import com.mlcraft.imasradio.model.SongData;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


@Service
public class DataServiceJDBC implements DataService {

    @Override
    public SongData getSong(Long id) {

        SongData resultData = new SongData();
        String query = "select * FROM SONGDATA WHERE id=?";
        PreparedStatement ps = null;
        try {
            Connection conn = DriverManager.
                    getConnection("jdbc:h2:mem:songdb", "sa", "password");

            ps = conn.prepareStatement(query);
            ps.setLong(1, id);

            Statement stmt = conn.createStatement();

            ResultSet rs = ps.executeQuery();

            rs.next();

            long songID = rs.getLong("id");
            String songName = rs.getString("name");
            String songURL = rs.getString("url");
            long songLength = rs.getLong("length");
            String songArtist = rs.getString("artist");
            String songAlbum = rs.getString("album");
            String songCover = rs.getString("cover");

            resultData = new SongData(songID,  songName, songURL, songLength, songArtist, songAlbum, songCover);

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {

                }
            }

        }

        return resultData;
    }
}
