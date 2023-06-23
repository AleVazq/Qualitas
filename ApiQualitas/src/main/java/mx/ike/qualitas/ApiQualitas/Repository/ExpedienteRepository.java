package mx.ike.qualitas.ApiQualitas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ike.qualitas.ApiQualitas.Model.Expediente;

@Repository
public interface ExpedienteRepository  extends JpaRepository<Expediente, Long> {

    Expediente findByClExpediente(String expediente);

}
