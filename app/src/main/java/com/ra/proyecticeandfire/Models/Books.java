package com.ra.proyecticeandfire.Models;

import com.google.gson.annotations.SerializedName;

public class Books {

    @SerializedName("name")
    private String BookName;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }
}
