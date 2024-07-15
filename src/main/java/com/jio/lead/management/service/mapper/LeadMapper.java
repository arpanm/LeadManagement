package com.jio.lead.management.service.mapper;

import com.jio.lead.management.domain.Interest;
import com.jio.lead.management.domain.Lead;
import com.jio.lead.management.service.dto.InterestDTO;
import com.jio.lead.management.service.dto.LeadDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Lead} and its DTO {@link LeadDTO}.
 */
@Mapper(componentModel = "spring")
public interface LeadMapper extends EntityMapper<LeadDTO, Lead> {
    @Mapping(target = "interest", source = "interest", qualifiedByName = "interestId")
    LeadDTO toDto(Lead s);

    @Named("interestId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    InterestDTO toDtoInterestId(Interest interest);
}
