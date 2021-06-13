    CREATE TABLE SongData (
         id INTEGER PRIMARY KEY NOT NULL,
         name VARCHAR(128) NOT NULL,
         url VARCHAR(256) NOT NULL,
         length INTEGER NOT NULL,
         artist VARCHAR(128) NOT NULL,
         album VARCHAR(128) NOT NULL,
         cover VARCHAR(256) NOT NULL
    );