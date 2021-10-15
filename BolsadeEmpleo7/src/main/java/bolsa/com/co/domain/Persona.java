package bolsa.com.co.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email
    private String email;
    
    private String telefono;
    
    @NotNull
    private Double saldo;
    
    @NotNull
    private Double nit;
    
    @NotEmpty
    private String oferta;
    
    @NotEmpty
    private String descripcion;
    
    @NotNull
    private Double Salario;
    
    @NotNull
    private Long anio_exp;
}
