package com.example.trello.services.organization;

import com.example.trello.criteria.GenericCriteria;
import com.example.trello.dto.organization.OrganizationCreateDto;
import com.example.trello.dto.organization.OrganizationDto;
import com.example.trello.dto.organization.OrganizationUpdateDto;
import com.example.trello.entity.organization.Organization;
import com.example.trello.services.BaseService;
import com.example.trello.services.GenericCrudService;


public interface OrganizationService extends GenericCrudService<
        Organization,
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto,
        GenericCriteria,
        Long>, BaseService {


}
