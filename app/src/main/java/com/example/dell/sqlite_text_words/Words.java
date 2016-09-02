package com.example.dell.sqlite_text_words;

import android.provider.BaseColumns;

/**
 * Created by DELL on 2016/9/2.
 */
public class Words {
    public  Words(){

    }
    public static  abstract class Word implements BaseColumns{
        public static final String TABLE_NAME="words";
        public static final String COLUMN_NAME_WORD="word";
    }
}
