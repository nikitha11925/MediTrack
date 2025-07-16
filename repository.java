package com.medicine.Remainder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicine.Remainder.model.Remainder;

public interface RemainderRepository extends JpaRepository<Remainder, Long> {
}
