package mx.ike.qualitas.ApiQualitas.Model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  
@Table(name = "s2_registraCamposQUALITAS") 
@Data 
@NoArgsConstructor 
public class RegistraCampos {
	
	@Id
    @Column(name = "clExpediente")
	private String clExpediente;
    
    @Column(name = "clBitacora")
 	private String clBitacora;

    
    @Column(name = "clCuenta")
   	private String clCuenta;

    
    @Column(name = "RFCQualitas")
   	private String rfcQualitas;
    
    
    @Column(name = "Consecutivo")
   	private String Consecutivo;
    
    @Column(name = "Certificado")
   	private String Certificado;
    
    
    @Column(name = "FechaInicioVigencia")
   	private String FechaInicioVigencia;
    
    
    
    
    @Column(name = "FechaFinVigencia")
   	private String FechaFinVigencia;
    
    @Column(name = "FechaEmision")
   	private String FechaEmision;
    
    
    
    @Column(name = "incisoQualitas")
   	private String incisoQualitas;
    
    
    @Column(name = "Ramo")
   	private String Ramo;
    
    
    @Column(name = "Subramo")
   	private String Subramo;
    
    
    @Column(name = "Descripcion")
   	private String Descripcion;
    
    
    @Column(name = "Edad")
   	private String Edad;
    
    
    @Column(name = "Cobertura")
   	private String Cobertura;
    
    
   
    
    @Column(name = "SubCobertura")
   	private String SubCobertura;
    
    
    

    
}


