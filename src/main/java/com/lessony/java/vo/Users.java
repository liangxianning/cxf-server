package com.lessony.java.vo;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserInfos")
public class Users {
    private List<User> users;
    private User[] userArr;
    private Map<String, User> map;
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public User[] getUserArr() {
        return userArr;
    }
    public void setUserArr(User[] userArr) {
        this.userArr = userArr;
    }
    public Map<String, User> getMap() {
        return map;
    }
    public void setMap(Map<String, User> map) {
        this.map = map;
    }
    
    
}
