package com.gta.essentialmode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "identifier")
    private String identifier;
    @Column(name = "license")
    private String license;
    @Column(name = "money")
    private long money;
    @Column(name = "bank")
    private long bank;
    @Column(name = "name")
    private String name;
    @Column(name = "skin")
    private String skin;
    @Column(name = "job")
    private String job;
    @Column(name = "job_grade")
    private long jobGrade;
    @Column(name = "loadout")
    private String loadout;
    @Column(name = "position")
    private String position;
    @Column(name = "permission_level")
    private long permissionLevel;
    @Column(name = "group")
    private String group;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "dateofbirth")
    private String dateofbirth;
    @Column(name = "sex")
    private String sex;
    @Column(name = "height")
    private String height;
    @Column(name = "is_dead")
    private long isDead;
    @Column(name = "last_property")
    private String lastProperty;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "jail")
    private long jail;
    @Column(name = "status")
    private String status;
    @Column(name = "kills")
    private long kills;
    @Column(name = "deaths")
    private long deaths;
    @Column(name = "jailed")
    private long jailed;
    @Column(name = "jailer")
    private long jailer;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }


    public long getBank() {
        return bank;
    }

    public void setBank(long bank) {
        this.bank = bank;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public long getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(long jobGrade) {
        this.jobGrade = jobGrade;
    }


    public String getLoadout() {
        return loadout;
    }

    public void setLoadout(String loadout) {
        this.loadout = loadout;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public long getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(long permissionLevel) {
        this.permissionLevel = permissionLevel;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


    public long getIsDead() {
        return isDead;
    }

    public void setIsDead(long isDead) {
        this.isDead = isDead;
    }


    public String getLastProperty() {
        return lastProperty;
    }

    public void setLastProperty(String lastProperty) {
        this.lastProperty = lastProperty;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public long getJail() {
        return jail;
    }

    public void setJail(long jail) {
        this.jail = jail;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }


    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }


    public long getJailed() {
        return jailed;
    }

    public void setJailed(long jailed) {
        this.jailed = jailed;
    }


    public long getJailer() {
        return jailer;
    }

    public void setJailer(long jailer) {
        this.jailer = jailer;
    }

}
