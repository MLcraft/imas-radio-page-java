package com.mlcraft.imasradio.repository;

import com.mlcraft.imasradio.model.SongDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongDataRepository extends JpaRepository<SongDataEntity, Long> {

}
