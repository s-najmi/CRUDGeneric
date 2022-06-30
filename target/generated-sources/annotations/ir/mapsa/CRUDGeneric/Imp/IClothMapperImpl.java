package ir.mapsa.CRUDGeneric.Imp;

import ir.mapsa.CRUDGeneric.entity.Cloth;
import ir.mapsa.CRUDGeneric.entity.ClothDTO;
import ir.mapsa.CRUDGeneric.entity.Size;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-30T21:41:08+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class IClothMapperImpl implements IClothMapper {

    @Override
    public Cloth toEntity(ClothDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cloth cloth = new Cloth();

        cloth.setId( dto.getId() );
        cloth.setTitle( dto.getTitle() );
        List<Size> list = dto.getSize();
        if ( list != null ) {
            cloth.setSize( new ArrayList<Size>( list ) );
        }

        return cloth;
    }

    @Override
    public ClothDTO toDTO(Cloth entity) {
        if ( entity == null ) {
            return null;
        }

        ClothDTO clothDTO = new ClothDTO();

        clothDTO.setId( entity.getId() );
        clothDTO.setTitle( entity.getTitle() );
        List<Size> list = entity.getSize();
        if ( list != null ) {
            clothDTO.setSize( new ArrayList<Size>( list ) );
        }

        return clothDTO;
    }

    @Override
    public List<ClothDTO> toDTOs(List<Cloth> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ClothDTO> list = new ArrayList<ClothDTO>( entities.size() );
        for ( Cloth cloth : entities ) {
            list.add( toDTO( cloth ) );
        }

        return list;
    }
}
