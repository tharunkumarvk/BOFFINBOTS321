package com.collegeclub.clubconnect.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.collegeclub.clubconnect.entity.Club;
import com.collegeclub.clubconnect.repository.ClubRepository;


@Service
public class Club {
    private final ClubRepository clubRepository;

    @Autowired
    public Club(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public Club createClub(Club club) {
        // Check if a club with the same name already exists
        Club existingClub = clubRepository.findByName(club.getName());

        if (existingClub != null) {
            // A club with the same name already exists, return an error or handle it as needed
            throw new RuntimeException("A club with the same name already exists");
        }

        // Save the club to the database
        return clubRepository.save(club);
    }

    public Iterable<Club> getAllClubs() {
        // Retrieve a list of all clubs from the database
        return clubRepository.findAll();
    }
}
