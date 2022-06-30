package ir.mapsa.CRUDGeneric.Imp;

import ir.mapsa.CRUDGeneric.entity.Cloth;
import ir.mapsa.CRUDGeneric.entity.ClothDTO;
import ir.mapsa.CRUDGeneric.generic.IMapperGeneric;
import ir.mapsa.CRUDGeneric.generic.IRepositoryGeneric;
import ir.mapsa.CRUDGeneric.generic.ServiceGeneric;
import org.springframework.stereotype.Service;

@Service
public class ClothService extends ServiceGeneric<Cloth, ClothDTO, Long> implements IClothService{
    private final IClothRepository repository;
    private final IClothMapper mapper;

    public ClothService(IClothRepository repository, IClothMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<Cloth, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<Cloth, ClothDTO> getMapper() {
        return mapper;
    }
}
