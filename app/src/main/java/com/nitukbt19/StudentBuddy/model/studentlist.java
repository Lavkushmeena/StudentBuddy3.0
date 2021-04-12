package com.nitukbt19.StudentBuddy.model;

public class studentlist {
    private String userID;
    private String userName;
    private String description;
    private String date;
    private String urlprofile;
   public studentlist(){
}
public studentlist(String userID, String userName, String description, String date, String urlprofile) {

    this.userID = userID;
    this.userName = userName;
    this.description = description;
    this.date = date;
    this.urlprofile = urlprofile;
}
public String getUserID(){
       return userID;
}
public void setUserID(String userName){
       this.userID=userID;
}


public String  getUserName(){
       return userName;
}

   public void setUserName(String userName){
       this.userName=userName;
   }
    public String  getdescription(){
        return description;
    }

    public void setdescription(String description){
        this.description=description;
    }
    public String  getdate(){
        return date;
    }

    public void setdate(String date){
        this.date=date;
    }
    public String  geturlptofile(){
        return urlprofile;
    }

    public void setUrlprofile(String urlprofile){
        this.urlprofile=urlprofile;
    }
}
