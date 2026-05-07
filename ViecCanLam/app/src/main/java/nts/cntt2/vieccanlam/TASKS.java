package nts.cntt2.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {
    String name,message,date,priotiry;

    public TASKS(String name, String message, String date, String priotiry) {
        this.name = name;
        this.message = message;
        this.date = date;
        this.priotiry = priotiry;
    }

    public TASKS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriotiry() {
        return priotiry;
    }

    public void setPriotiry(String priotiry) {
        this.priotiry = priotiry;
    }
    //
    public HashMap<String,String> toFirebaseObject(){
        HashMap<String,String> taskObject = new HashMap<String, String>();
        taskObject.put("name",name);
        taskObject.put("date",date);
        taskObject.put("message",message);
        taskObject.put("priority",priotiry);
        return taskObject;
    }
}
