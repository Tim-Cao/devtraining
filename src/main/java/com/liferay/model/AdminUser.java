package com.liferay.model;

public class AdminUser extends User {

    public AdminUser() {
        this("admin@liferay.com", "admin");
    }

    public AdminUser(String emailAddress, String password) {
        super(emailAddress, password);
    }

}