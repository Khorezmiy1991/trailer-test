package uz.digitalone.trailertest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.digitalone.trailertest.entity.Trailer;

import java.util.List;
import java.util.Optional;

public interface TrailerRepository extends JpaRepository<Trailer, Integer>  {

//    List<Trailer> getAll(Pageable pageable);

    Trailer getByTrailerId(Long id);

    Optional<Trailer> findByLocation(String location);
}
