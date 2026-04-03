package com.gtaskfollownew.service.mapper;

import com.gtaskfollownew.domain.Comment;
import com.gtaskfollownew.domain.Task;
import com.gtaskfollownew.domain.User;
import com.gtaskfollownew.service.dto.CommentDTO;
import com.gtaskfollownew.service.dto.TaskDTO;
import com.gtaskfollownew.service.dto.UserDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Comment} and its DTO {@link CommentDTO}.
 */
@Mapper(componentModel = "spring")
public interface CommentMapper extends EntityMapper<CommentDTO, Comment> {
    @Mapping(target = "task", source = "task", qualifiedByName = "taskTitle")
    @Mapping(target = "author", source = "author", qualifiedByName = "userLogin")
    CommentDTO toDto(Comment s);

    @Named("taskTitle")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    TaskDTO toDtoTaskTitle(Task task);

    @Named("userLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    UserDTO toDtoUserLogin(User user);
}
