package com.gotgame.got_game.c;

/**
 * Created by sento on 20/10/2016.
 */

import android.content.Context;

import com.google.gson.reflect.TypeToken;
import com.gotgame.got_game.m.Group;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import com.google.gson.*;

/**
 * This class is meant to build a list of groups from a JSON txt file
 *
 *TODO: /!\ Not tested yet, not sure about how to access files on Android, here try with the context
 */
public class Parser{

    //Hardcoded name of the file containing the complete list of groups and characters
    //The file shall respect the Json formatting
    private static final String groupsListFileName="data.json";

    public static ArrayList<Group> getGroupsListFromFile(Context context){
        String jsonContent=readJsonFromFile(context);
        return buildGroupsListFromJson(jsonContent);
    }

    private static String readJsonFromFile(Context context){
        String jsonContent=null;
        try{
            FileInputStream input=context.openFileInput(groupsListFileName);
            int size=input.available();
            byte[] buffer=new byte[size];
            input.read(buffer);
            input.close();
            jsonContent=new String(buffer,"UTF-8");
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
        return jsonContent;
    }

    private static ArrayList<Group> buildGroupsListFromJson(String jsonContent){
        Gson gson=new Gson();
        //Seems to good to be true, to test x)
        //http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
        return gson.fromJson(jsonContent, new TypeToken<ArrayList<Group>>(){}.getType());
    }
}
