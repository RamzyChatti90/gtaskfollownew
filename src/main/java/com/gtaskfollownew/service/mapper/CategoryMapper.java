package com.gtaskfollownew.service.mapper;

import com.gtaskfollownew.domain.Category;
import com.gtaskfollownew.service.dto.CategoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Category} and its DTO {@link CategoryDTO}.
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {}
