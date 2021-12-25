package com.program.owi.model;

import java.io.Serializable;

public class DataAlgoritma implements Serializable {
    String nameAlgoritma, Link_website,  deskripsi, image;

    public DataAlgoritma(String nameAlgoritma, String Link_website, String deskripsi, String image) {
        this.nameAlgoritma = nameAlgoritma;
        this.Link_website = Link_website;
        this.deskripsi = deskripsi;
        this.image = image;
    }

    public String getJenisAlgoritma() {
        return nameAlgoritma;
    }

    public String getLink_website() {
        return Link_website;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getImage() {
        return image;
    }
}