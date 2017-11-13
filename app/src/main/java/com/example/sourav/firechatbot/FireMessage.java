package com.example.sourav.firechatbot;

/**
 * Created by Sourav on 10/10/2017.
 */

public class FireMessage {

    private String id;
    private String text;
    private String name;
    private String phone;
    private String photoUrl;
    private String messageImageUrl;

    public FireMessage() {
    }
    FireMessage(String text, String name, String phone, String photoUrl, String messageImageUrl) {
        this.text = text;
        this.name = name;
        this.phone = phone;
        this.photoUrl = photoUrl;
        this.messageImageUrl = messageImageUrl;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getMessageImageUrl() {
        return messageImageUrl;
    }

    public void setMessageImageUrl(String messageImageUrl) {
        this.messageImageUrl = messageImageUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

