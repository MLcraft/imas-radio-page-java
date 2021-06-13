package com.mlcraft.imasradio.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SongData {
    private Long id;
    private String name;
    private String url;
    private long length;
    private String artist;
    private String album;
    private String cover;
}
