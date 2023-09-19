package com.collegeclub.clubconnect.repository;

import com.collegeclub.clubconnect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClubRepository extends JpaRepository<User, Long> {
    // Custom Query 1: Find a club by its name
    Club findByName(String name);

    // Custom Query 2: Find clubs by their location
    List<Club> findByLocation(String location);

    // Custom Query 3: Find clubs by their description containing a keyword
    List<Club> findByDescriptionContaining(String keyword);

    // Custom Query 4: Find clubs by the lead's name
    List<Club> findByLeadName(String leadName);

    // Custom Query 5: Find clubs by their club ID
    Club findByClubId(int clubId);
}
