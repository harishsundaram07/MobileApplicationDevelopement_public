// Assignment : InClass 08
//File Name : GroupB09_InClass08
//Full name of the student : HARIKRISHNAN SUNDARAM  & MALHAR JOSHI


package com.example.groupb09_inclass08;

import java.io.Serializable;

public class User implements Serializable {
    String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    String emailid;
    String uuid;
}
