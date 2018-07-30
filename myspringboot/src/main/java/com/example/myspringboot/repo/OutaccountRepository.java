package com.example.myspringboot.repo;

import com.example.myspringboot.model.Outaccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutaccountRepository extends JpaRepository<Outaccount, Integer> {
}
