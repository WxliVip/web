package wxli.vip.automapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import wxli.vip.entity.User;
import wxli.vip.model.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapping {

    UserMapping INSTANCE = Mappers.getMapper( UserMapping.class );

    UserDTO targetToSource(User sourc);
}
