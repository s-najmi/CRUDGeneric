package ir.mapsa.CRUDGeneric.Imp;

import ir.mapsa.CRUDGeneric.entity.Cloth;
import ir.mapsa.CRUDGeneric.entity.ClothDTO;
import ir.mapsa.CRUDGeneric.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IClothMapper extends IMapperGeneric<Cloth, ClothDTO> {
}
