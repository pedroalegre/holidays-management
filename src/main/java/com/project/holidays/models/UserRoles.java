package com.project.holidays.models;

import javax.persistence.*;

@Entity
@Table(name = "userRoles")
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userRoleId;

    @Column(name = "username")
    private String username;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "role")
    private String role;

    public long getUserRoleId() {
        return this.userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
