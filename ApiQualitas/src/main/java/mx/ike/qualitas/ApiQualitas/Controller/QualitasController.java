package mx.ike.qualitas.ApiQualitas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.ike.qualitas.ApiQualitas.Model.Campos;
import mx.ike.qualitas.ApiQualitas.Model.Response;
import mx.ike.qualitas.ApiQualitas.Service.CamposService;

@RestController
@RequestMapping("/")
public class QualitasController {
	
	  @Autowired
	  CamposService camposService;
	  
	  @Value("${qualitas.codeResponseError}")
 	  private String codeResponseError;

	  @Value("${qualitas.messageResponseError}")
	    private String messageResponseError;
	  
    @PostMapping("/saveCamposQualitas")
    public Response saveCampos(@RequestBody Campos camposQualitas) {	 
	    Response response = null;
    	if(camposService.saveCamposQualitas(camposQualitas)== null) {
			return  response = new Response(codeResponseError,"",messageResponseError);

    	}else {
    		return camposService.saveCamposQualitas(camposQualitas);
    	}
    	
    	 



}
    

}
