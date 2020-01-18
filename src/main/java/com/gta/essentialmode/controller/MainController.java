package com.gta.essentialmode.controller;

import com.gta.essentialmode.response.Deaths;
import com.gta.essentialmode.response.Jailed;
import com.gta.essentialmode.response.Jailer;
import com.gta.essentialmode.response.Kills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gta.essentialmode.model.*;
import com.gta.essentialmode.repository.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class MainController {
    private UsersRepository usersRepostory;
    @Autowired
    public MainController(UsersRepository usersRepository){
        this.usersRepostory = usersRepository;
    }

    @GetMapping("get-top10-kills")
    public List<Kills> getTopKills(){
        List<Kills> topKills = new ArrayList<>();
        usersRepostory.findTopByOrderByKills().forEach((user) -> {
            Kills kills = new Kills();
            kills.setFirstname(user.getFirstname());
            kills.setLastname(user.getLastname());
            kills.setKills(user.getKills());
            topKills.add(kills);
        });
        return topKills;
    }

    @GetMapping("get-top10-deaths")
    public List<Deaths> getTopDeaths(){
        List<Deaths> topDeaths = new ArrayList<>();
        usersRepostory.findTopByOrderByDeaths().forEach((user) -> {
            Deaths deaths = new Deaths();
            deaths.setFirstname(user.getFirstname());
            deaths.setLastname(user.getLastname());
            deaths.setDeaths(user.getDeaths());
            topDeaths.add(deaths);
        });
        return topDeaths;
    }

    @GetMapping("get-top10-jails")
    public List<Jailer> getTopJails(){
        List<Jailer> topJails = new ArrayList<>();
        usersRepostory.findTopByOrderByJail().forEach((user) -> {
            Jailer jailer = new Jailer();
            jailer.setFirstname(user.getFirstname());
            jailer.setLastname(user.getLastname());
            jailer.setJailer(user.getJailer());
            topJails.add(jailer);
        });
        return topJails;
    }

    @GetMapping("get-top10-jailed")
    public List<Jailed> getTopJailed(){
        List<Jailed> topJailed = new ArrayList<>();
        usersRepostory.findTopByOrderByJailed().forEach((user) -> {
            Jailed jailed = new Jailed();
            jailed.setFirstname(user.getFirstname());
            jailed.setLastname(user.getLastname());
            jailed.setJailed(user.getJailed());
            topJailed.add(jailed);
        });
        return topJailed;
    }
}
