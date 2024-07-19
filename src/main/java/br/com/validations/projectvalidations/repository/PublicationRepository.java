package br.com.validations.projectvalidations.repository;

import br.com.validations.projectvalidations.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository  extends JpaRepository<Publication, Long> {
}
