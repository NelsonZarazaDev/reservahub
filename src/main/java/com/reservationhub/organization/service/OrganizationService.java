package com.reservationhub.organization.service;

import com.reservationhub.organization.dto.OrganizationResponse;
import com.reservationhub.organization.entity.Organization;
import com.reservationhub.organization.exception.OrganizationAlreadyExistsException;
import com.reservationhub.organization.exception.OrganizationNotFoundException;
import com.reservationhub.organization.mapper.OrganizationMapper;
import com.reservationhub.organization.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final OrganizationMapper organizationMapper;

    @Transactional
    public OrganizationResponse createOrganization(String name, String slug){
        if(organizationRepository.existsBySlug(slug)){
            throw new OrganizationAlreadyExistsException(slug);
        }
        return organizationMapper.toResponse(organizationRepository.saveAndFlush(Organization.create(name, slug)));
    }

    @Transactional(readOnly = true)
    public OrganizationResponse getOrganizationById(UUID id){
         Organization organization = organizationRepository.findById(id).orElseThrow(
                ()-> new OrganizationNotFoundException(id));

        return organizationMapper.toResponse(organization);
    }
}
