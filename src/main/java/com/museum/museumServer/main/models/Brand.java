package com.museum.museumServer.main.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Document(collection = "brand")
public class Brand implements Serializable {

    @Id
    @NotNull
    private String name;

    private String text;

    private List<String> piece_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getPiece_id() {
        return piece_id;
    }

    public void setPiece_id(List<String> piece_id) {
        this.piece_id = piece_id;
    }
}
