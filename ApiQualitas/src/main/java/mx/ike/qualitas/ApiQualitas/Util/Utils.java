package mx.ike.qualitas.ApiQualitas.Util;

import org.springframework.stereotype.Component;

import mx.ike.qualitas.ApiQualitas.Model.Campos;
import mx.ike.qualitas.ApiQualitas.Model.RegistraCampos;

@Component
public class Utils {

	public boolean validation(RegistraCampos camposQualitas) {
	    if (camposQualitas.getCertificado() != null && !camposQualitas.getCertificado().isEmpty()
	            && camposQualitas.getClExpediente() != null && !camposQualitas.getClExpediente().isEmpty()
	            && camposQualitas.getCobertura() != null && !camposQualitas.getCobertura().isEmpty()
	            && camposQualitas.getConsecutivo() != null && !camposQualitas.getConsecutivo().isEmpty()
	            && camposQualitas.getEdad() != null && !camposQualitas.getEdad().isEmpty()
	            && camposQualitas.getFechaEmision() != null && !camposQualitas.getFechaEmision().isEmpty()
	            && camposQualitas.getFechaFinVigencia() != null && !camposQualitas.getFechaFinVigencia().isEmpty()
	            && camposQualitas.getFechaInicioVigencia() != null && !camposQualitas.getFechaInicioVigencia().isEmpty()
	            && camposQualitas.getIncisoQualitas() != null && !camposQualitas.getIncisoQualitas().isEmpty()
	            && camposQualitas.getRamo() != null && !camposQualitas.getRamo().isEmpty()
	            && camposQualitas.getRfcQualitas() != null && !camposQualitas.getRfcQualitas().isEmpty()
	            && camposQualitas.getSubCobertura() != null && !camposQualitas.getSubCobertura().isEmpty()
	            && camposQualitas.getSubramo() != null && !camposQualitas.getSubramo().isEmpty()) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	
	public RegistraCampos filtroCampos(Campos campos) {
		RegistraCampos registraCampos= new RegistraCampos();
		registraCampos.setCertificado(campos.getCertificado());
		registraCampos.setClExpediente(campos.getClExpediente());
		registraCampos.setCobertura(campos.getCobertura());
		registraCampos.setConsecutivo(campos.getConsecutivo());
		registraCampos.setDescripcion(campos.getDescripcion());
		registraCampos.setEdad(campos.getEdad());
		registraCampos.setFechaEmision(campos.getFechaEmision());
		registraCampos.setFechaFinVigencia(campos.getFechaFinVigencia());
		registraCampos.setFechaInicioVigencia(campos.getFechaInicioVigencia());
		registraCampos.setIncisoQualitas(campos.getFechaInicioVigencia());
		registraCampos.setRamo(campos.getRamo());
		registraCampos.setRfcQualitas(campos.getRfcQualitas());
		registraCampos.setSubCobertura(campos.getSubCobertura());
		registraCampos.setSubramo(campos.getSubramo());
		return registraCampos;
		
	}

	
}
