package ma.xproce.inventoryservice.repository;

import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository  extends JpaRepository<Video,Long> {


        List<Video> findAll();


}
