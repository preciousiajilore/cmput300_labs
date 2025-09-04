package com.example.lonelytwitter_preciousajilore;
import java.util.Date;

public class NormalTweet extends Tweet {
    private String message;
    private Date date;

    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        //TODO: isImportant method should return Boolean.False
        return Boolean.FALSE;
    }


}
