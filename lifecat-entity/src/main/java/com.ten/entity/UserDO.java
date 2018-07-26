package com.ten.entity;

/**
 * c_user
 *
 * @author Administrator
 */
public class UserDO {

    private Integer userId;
    private String userAccountName;
    private String userAccountPassword;
    private String userName;
    private Integer userSex;
    private String userBirthday;
    private String userEmail;
    private String userLocation;
    private String userPhoneNumber;
    private String userIconUrl;
    private Integer deleted;
    private String userGmtCreate;
    private String userGmtModified;
    private String userLastLogin;
    private Integer userLoginCount;

    @Override
    public String toString() {
        return "c_user@{" +
                "user_id:" + userId +
                ",user_account_name:" + userAccountName +
                ",user_account_password:" + userAccountPassword +
                ",user_name:" + userName +
                ",user_sex:" + userSex +
                ",user_birthday:" + userBirthday +
                ",user_email:" + userEmail +
                ",user_location:" + userLocation +
                ",user_phone_number:" + userPhoneNumber +
                ",user_icon_url:" + userIconUrl +
                ",is_user_deleted:" + deleted +
                ",user_gmt_create:" + userGmtCreate +
                ",user_gmt_modified:" + userGmtModified +
                ",user_last_login:" + userLastLogin +
                ",user_login_count:" + userLoginCount +
                "}";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccountName() {
        return userAccountName;
    }

    public void setUserAccountName(String userAccountName) {
        this.userAccountName = userAccountName;
    }

    public String getUserAccountPassword() {
        return userAccountPassword;
    }

    public void setUserAccountPassword(String userAccountPassword) {
        this.userAccountPassword = userAccountPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserIconUrl() {
        return userIconUrl;
    }

    public void setUserIconUrl(String userIconUrl) {
        this.userIconUrl = userIconUrl;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getUserGmtCreate() {
        return userGmtCreate;
    }

    public void setUserGmtCreate(String userGmtCreate) {
        this.userGmtCreate = userGmtCreate;
    }

    public String getUserGmtModified() {
        return userGmtModified;
    }

    public void setUserGmtModified(String userGmtModified) {
        this.userGmtModified = userGmtModified;
    }

    public String getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(String userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    public Integer getUserLoginCount() {
        return userLoginCount;
    }

    public void setUserLoginCount(Integer userLoginCount) {
        this.userLoginCount = userLoginCount;
    }
}