package ir.mapsa.CRUDGeneric.generic;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;


public abstract class ServiceGeneric<T, D, PK> implements IServiceGeneric<T, D, PK> {
    public abstract IRepositoryGeneric<T, PK> getRepository();
    public abstract IMapperGeneric<T, D> getMapper();

    @Override
    public void save(D dto) {
        getRepository().save(getMapper().toEntity(dto));
    }

    @Override
    public Optional<D> getByID(PK id) {
        return Optional.of(getMapper().toDTO(getRepository().findById(id).get()));
    }

    @Override
    public Collection<D> findAll() {
        return getMapper().toDTOs(getRepository().findAll());
    }
}
