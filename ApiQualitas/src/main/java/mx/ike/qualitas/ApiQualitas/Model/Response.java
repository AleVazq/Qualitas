package mx.ike.qualitas.ApiQualitas.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

   String code;
   String clExpediente;
   String message;

}
