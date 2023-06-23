package mx.ike.qualitas.ApiQualitas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.ike.qualitas.ApiQualitas.Model.RegistraCampos;

@Repository
public interface CamposRepository  extends JpaRepository<RegistraCampos, Long>{

}
