package com.example.trackbus.model;

public class User {
    private String email;
    private String fullName;
    private String profession;
    private String workplace;
    private String phone;
    private String password;
    private String sex;
    private String userid;
    private String status;
    private String photoUrl;


    public User() {}

//    public User(String fullName, String email) {
//        this.fullName = fullName;
//        this.email = email;
//    }


    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public User(String email, String status) {
        this.status = status;
        this.email = email;
    }

    public User(String fullName, String email, String profession,
                String workplace, String phone,String userid) {
        this.email = email;
        this.fullName = fullName;
        this.profession = profession;
        this.workplace = workplace;
        this.phone = phone;
        this.userid = userid;
    }


    public User(String fullName, String email, String profession,
                String workplace, String phone,String userid,String photoUrl) {
        this.email = email;
        this.fullName = fullName;
        this.profession = profession;
        this.workplace = workplace;
        this.phone = phone;
        this.userid = userid;
        this.photoUrl = photoUrl;

    }


    public User(String fullName,  String profession,
                String workplace, String phone) {
        this.fullName = fullName;
        this.profession = profession;
        this.workplace = workplace;
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
/*    public HashMap<String, Object> getAsMap(){
        HashMap<String, Object> userAsMap = new HashMap<>();
        userAsMap.put("username",username);
        userAsMap.put("password",password);
        userAsMap.put("age",age);
        userAsMap.put("name",name);

        //Add or remove more key value pair

        return userAsMap;
    }*/


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSex() { return sex; }

    public void setpassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setWorkplace(String wordplace) {
        this.workplace = wordplace;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public String getProfession() {
        return profession;
    }

    public String getWorkplace() {
        return workplace;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setSex(String sex) { this.sex = sex; }

    public String getpassword() {
        return password;
    }
}
