package ir.mapsa.CRUDGeneric.generic;

import org.mapstruct.Mapper;

import java.util.List;

public interface IMapperGeneric<T, D> {
    T toEntity(D dto);
    D toDTO(T entity);
    List<D> toDTOs(List<T> entities);
}
