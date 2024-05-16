package co.empresa.test.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {
	private Integer id;
	
	private String nombre;
	
	private String email;
	
	private String pais;
	
	public Usuario(String nombre, String email, String pais) {
		this.nombre = nombre;
		this.email = email;
		this.pais = pais;
	}
	
}
