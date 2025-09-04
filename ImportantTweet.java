package com.example.lonelytwitter_preciousajilore;

import java.util.Date;


public class ImportantTweet extends Tweet{
        public ImportantTweet(String message){
            //TODO: Call super in both of constructors
            //Inheritance
            super(message);
        }

        public ImportantTweet(String message, Date date){
            //TODO: Call super in constructor
            //Inheritance
            super(message, date);
        }

        @Override
        public Boolean isImportant(){
            //TODO: Return Boolean.TRUE
            return Boolean.TRUE;
        }
}

