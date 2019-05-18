package com.aulestin.topquizz.model;

/**
 * Created by Aulestin on 15 may 2019.
 */
public class User {
    private String mFirstname;

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }

}
