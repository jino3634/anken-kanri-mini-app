package com.example.ankenkanri.repository;

import com.example.ankenkanri.entity.Project;
import com.example.ankenkanri.entity.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findByStatus(ProjectStatus status);
}