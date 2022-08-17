package br.com.dicasdeumdev.api.repositories;

import br.com.dicasdeumdev.api.domain.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel,Long> {
}
