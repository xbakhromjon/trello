package uz.bakhromjon.repository;

import uz.bakhromjon.entity.organization.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {
}
