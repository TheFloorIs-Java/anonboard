package com.messageboard.messageApp.Repository;

import com.messageboard.messageApp.Model.Genera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GeneraRepo extends JpaRepository <Genera, Integer> {

    Optional<Genera> findGeneraByGenera(String genera);

}
