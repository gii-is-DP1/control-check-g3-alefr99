package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecoveryRoomRepository extends CrudRepository<RecoveryRoom, Integer>{
    List<RecoveryRoom> findAll();
    
    @Query("SELECT r FROM RecoveryRoomType r")
    List<RecoveryRoomType> findAllRecoveryRoomTypes();
    
    @Query("SELECT p FROM RecoveryRoomType p WHERE p.name=:name")
    RecoveryRoomType getRecoveryRoomType(String name);
  //  Optional<RecoveryRoom> findById(int id);
  //  RecoveryRoom save(RecoveryRoom p);
    @Query("SELECT p FROM RecoveryRoom p WHERE p.size>:d")
    List<RecoveryRoom> findBySizeMoreThan(Double d);
    //List<RecoveryRoom> findBySizeMoreThan(double size);
}
