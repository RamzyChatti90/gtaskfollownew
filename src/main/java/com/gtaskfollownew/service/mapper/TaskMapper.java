package com.gtaskfollownew.service.mapper;

import com.gtaskfollownew.domain.Category;
import com.gtaskfollownew.domain.Task;
import com.gtaskfollownew.domain.User;
import com.gtaskfollownew.service.dto.CategoryDTO;
import com.gtaskfollownew.service.dto.TaskDTO;
import com.gtaskfollownew.service.dto.UserDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {
    @Mapping(target = "assignee", source = "assignee", qualifiedByName = "userLogin")
    @Mapping(target = "category", source = "category", qualifiedByName = "categoryName")
    TaskDTO toDto(Task s);

    @Named("userLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    UserDTO toDtoUserLogin(User user);

    @Named("categoryName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CategoryDTO toDtoCategoryName(Category category);
}
