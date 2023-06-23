package mx.ike.qualitas.ApiQualitas.Model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  
@Table(name = "Expediente") 
@Data 
@NoArgsConstructor 
public class Expediente {
	@Id
    @Column(name = "clExpediente")
	private String clExpediente;

    @Column(name = "Email")
	private String Email;
}
