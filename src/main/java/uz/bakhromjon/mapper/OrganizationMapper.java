package uz.bakhromjon.mapper;

import uz.bakhromjon.dto.organization.OrganizationCreateDto;
import uz.bakhromjon.dto.organization.OrganizationDto;
import uz.bakhromjon.dto.organization.OrganizationUpdateDto;
import uz.bakhromjon.entity.organization.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface OrganizationMapper extends BaseMapper <
        Organization,
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto> {
    @Override
    OrganizationDto toDto(Organization organization);

    @Override
    List<OrganizationDto> toDto(List<Organization> e);

    @Override
    @Mapping(target = "logo", ignore = true)
    Organization fromCreateDto(OrganizationCreateDto organizationCreateDto);

    @Override
    @Mapping(target = "logo",ignore = true)
    Organization fromUpdateDto(OrganizationUpdateDto d);
}
