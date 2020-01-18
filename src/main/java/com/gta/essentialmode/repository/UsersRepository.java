package com.gta.essentialmode.repository;

import com.gta.essentialmode.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    @Query(value="SELECT * FROM users u ORDER BY u.kills DESC LIMIT 10", nativeQuery = true)
    List<Users> findTopByOrderByKills();
    @Query(value="SELECT * FROM users u ORDER BY u.deaths DESC LIMIT 10", nativeQuery = true)
    List<Users> findTopByOrderByDeaths();
    @Query(value="SELECT * FROM users u ORDER BY u.jailer DESC LIMIT 10", nativeQuery = true)
    List<Users> findTopByOrderByJail();
    @Query(value="SELECT * FROM users u ORDER BY u.jailed DESC LIMIT 10", nativeQuery = true)
    List<Users> findTopByOrderByJailed();
}
