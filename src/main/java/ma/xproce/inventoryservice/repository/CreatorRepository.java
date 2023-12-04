package ma.xproce.inventoryservice.repository;

import ma.xproce.inventoryservice.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreatorRepository  extends JpaRepository<Creator,Long> {


    Creator findById(long id);

}
