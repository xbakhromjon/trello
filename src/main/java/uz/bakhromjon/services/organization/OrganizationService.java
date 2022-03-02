package uz.bakhromjon.services.organization;

import uz.bakhromjon.criteria.GenericCriteria;
import uz.bakhromjon.dto.organization.OrganizationCreateDto;
import uz.bakhromjon.dto.organization.OrganizationDto;
import uz.bakhromjon.dto.organization.OrganizationUpdateDto;
import uz.bakhromjon.entity.organization.Organization;
import uz.bakhromjon.services.BaseService;
import uz.bakhromjon.services.GenericCrudService;


public interface OrganizationService extends GenericCrudService<
        Organization,
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto,
        GenericCriteria,
        Long>, BaseService {


}
