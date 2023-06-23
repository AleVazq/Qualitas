package mx.ike.qualitas.ApiQualitas.Model;





import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  
@Data 
@NoArgsConstructor 
public class Campos {
	
	@Id
	private String clExpediente;
    

    

    
   	private String rfcQualitas;
    
    
   	private String Consecutivo;
    
   	private String Certificado;
    
    
   	private String FechaInicioVigencia;
    
    
    
    
   	private String FechaFinVigencia;
    
   	private String FechaEmision;
    
    
    
   	private String incisoQualitas;
    
    
   	private String Ramo;
    
    
   	private String Subramo;
    
    
   	private String Descripcion;
    
    
   	private String Edad;
    
    
   	private String Cobertura;
    
    
   
    
   	private String SubCobertura;
   	
   	private String email;
    
    

    
}


