package com.reservationhub.organization.mapper;

import com.reservationhub.organization.dto.OrganizationResponse;
import com.reservationhub.organization.entity.Organization;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {

    OrganizationResponse toResponse(Organization organization);
}
