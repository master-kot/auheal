package ru.gofit.mappers;

import org.mapstruct.*;
import ru.gofit.dto.UserDto;
import ru.gofit.dto.UserRequest;
import ru.gofit.entities.User;
import ru.gofit.security.JwtUser;

import java.util.List;

/**
 * Маппер, преобразующий классы User и UserDto друг в друга
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {AuthorityMapper.class, GenderMapper.class})
public interface UserMapper {

    UserDto mapEntityToDto(User entity);

    List<UserDto> mapEntityToDto(List<User> entities);

    JwtUser mapEntityToJwt(User entity);

    @Mappings({
            @Mapping(target="enabled", constant = "true"),
            @Mapping(target="authorities", ignore = true)
    })
    User mapDtoToEntity(UserRequest dto);

    @Mappings({
            @Mapping(target="id", ignore = true),
            @Mapping(target="username", ignore = true),
            @Mapping(target="password", ignore = true),
            @Mapping(target="enabled", ignore = true),
            @Mapping(target="authorities", ignore = true),
    })
    User update(@MappingTarget User entity, UserDto dto);
}
