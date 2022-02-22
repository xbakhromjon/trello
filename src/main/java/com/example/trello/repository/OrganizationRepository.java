package com.example.trello.repository;

import com.example.trello.entity.organization.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {
}
