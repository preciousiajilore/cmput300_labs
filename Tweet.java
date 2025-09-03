package com.example.lonelytwitter_preciousajilore;
import java.util.Date;


public class Tweet {
    //Make the attributes needed (Date and Message)
    private Date date;
    private String message;

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    public String getMessage(){
        //TODO: Get the message
        return message;
    }

    public void setMessage(String message){
        //TODO: set the message
        this.message = message;
    }

    public Date getDate(){
        //TODO: get the date
        return date;
    }

    @Override
    public String toString(){
        return "'" + message + "'" + date;
    }
}


