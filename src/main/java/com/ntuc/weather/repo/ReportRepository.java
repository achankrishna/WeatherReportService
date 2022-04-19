package com.ntuc.weather.repo;

import com.ntuc.weather.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface ReportRepository extends JpaRepository<Report, Id> {
}
