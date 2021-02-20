package ru.auheal.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.auheal.entities.Authority;
import ru.auheal.security.JwtRole;

import java.util.List;

/**
 * Маппер, преобразовывающий классы Authority в JwtRole
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorityMapper {

    JwtRole mapEntityToJwt(Authority entity);

    List<JwtRole> mapEntityToJwt(List<Authority> entities);
}
