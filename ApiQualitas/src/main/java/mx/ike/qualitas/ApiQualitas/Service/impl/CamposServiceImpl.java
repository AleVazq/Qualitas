package mx.ike.qualitas.ApiQualitas.Service.impl;


import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import mx.ike.qualitas.ApiQualitas.Model.Campos;
import mx.ike.qualitas.ApiQualitas.Model.Expediente;
import mx.ike.qualitas.ApiQualitas.Model.RegistraCampos;
import mx.ike.qualitas.ApiQualitas.Model.Response;
import mx.ike.qualitas.ApiQualitas.Repository.CamposRepository;
import mx.ike.qualitas.ApiQualitas.Repository.ExpedienteRepository;
import mx.ike.qualitas.ApiQualitas.Service.CamposService;
import mx.ike.qualitas.ApiQualitas.Util.Utils;


@Service
public class CamposServiceImpl implements CamposService {
	
	@Autowired
	CamposRepository camposRepository;
	
	@Autowired
	Utils validation;
	
	@Autowired 
	ExpedienteRepository expedienteRepository;
	
    @Value("${qualitas.clCuenta}")
    private String clCuenta;
    
    @Value("${qualitas.codeResponse}")
    private String codeResponse;
    
    @Value("${qualitas.messageResponse}")
    private String messageResponse;
    
    @Value("${qualitas.codeResponseError}")
    private String codeResponseError;
    
    @Value("${qualitas.messageResponseError}")
    private String messageResponseError;
    
    @Value("${qualitas.meesageResponseEmpty}")
    private String meesageResponseEmpty;
    

	@Override
	public Response saveCamposQualitas(Campos campos) {
	    Response response = null;
	    
	    RegistraCampos camposQualitas = validation.filtroCampos(campos);
	    String email = campos.getEmail();
          String ClExpedeinte=campos.getClExpediente();


		if(validation.validation(camposQualitas) && email!= null  && !email.isEmpty()) {
			
		Expediente expediente = expedienteRepository.findByClExpediente(camposQualitas.getClExpediente());
		 try {
			 if (expediente != null) {
					
					camposQualitas.setClCuenta(clCuenta);
			        LocalDate fechaNacimiento = LocalDate.parse(camposQualitas.getEdad());
					LocalDate fechaActual = LocalDate.now();
			        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
			        camposQualitas.setEdad(String.valueOf(edad));
					RegistraCampos savecampos = camposRepository.save(camposQualitas);
					Expediente expedienteInsert = new Expediente();
					expedienteInsert.setEmail(email);
					expedienteInsert.setClExpediente(ClExpedeinte);
					expedienteRepository.save(expedienteInsert);
					
					 response = new Response(codeResponse,camposQualitas.getClExpediente(),messageResponse);
			 }
		    } catch (NullPointerException e) {
				 response = new Response(codeResponseError,"",messageResponseError);

		    }
		
   	 
		
		}else {
			 response = new Response(codeResponseError,"",meesageResponseEmpty);

		}
		 
		return response;
	}
 
}
