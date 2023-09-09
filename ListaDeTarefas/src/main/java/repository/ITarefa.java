package repository;

import jakarta.persistence.Id;
import model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarefa extends JpaRepository<Tarefa, Long> {}
