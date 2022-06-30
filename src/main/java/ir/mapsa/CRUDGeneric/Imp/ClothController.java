package ir.mapsa.CRUDGeneric.Imp;

import ir.mapsa.CRUDGeneric.entity.Cloth;
import ir.mapsa.CRUDGeneric.entity.ClothDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cloth")
@AllArgsConstructor
public class ClothController {
    private final IClothService service;

    @GetMapping("/")
    public List<ClothDTO> getAll(){
        return (List<ClothDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public ClothDTO getByID(@PathVariable long id){
        Optional<ClothDTO> opt = service.getByID(id);
        if (!opt.isPresent())
                throw new RuntimeException();
        return service.getByID(id).get();
    }

    @PostMapping("/")
    public ResponseEntity<Void> addCloth(@RequestBody ClothDTO dto){
        service.save(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
