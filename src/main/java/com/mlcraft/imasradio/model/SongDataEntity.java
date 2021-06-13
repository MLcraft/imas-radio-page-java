package com.mlcraft.imasradio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="SONGDATA")
@Setter
@Getter
public class SongDataEntity {

    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="URL")
    private String url;

    @Column(name="LENGTH")
    private long length;

    @Column(name="ARTIST")
    private String artist;

    @Column(name="ALBUM")
    private String album;

    @Column(name="COVER")
    private String cover;
}
