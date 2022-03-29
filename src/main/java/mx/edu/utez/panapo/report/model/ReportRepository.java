package mx.edu.utez.panapo.report.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
    Optional<Report> findByDate(String date);
    boolean existsById(long id);
}
