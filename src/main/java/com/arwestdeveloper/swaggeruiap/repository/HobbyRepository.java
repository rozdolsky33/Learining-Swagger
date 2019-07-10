package com.arwestdeveloper.swaggeruiap.repository;

import com.arwestdeveloper.swaggeruiap.models.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long> {
}
