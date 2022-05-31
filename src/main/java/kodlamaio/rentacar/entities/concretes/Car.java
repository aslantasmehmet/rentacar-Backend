package kodlamaio.rentacar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="daily_price")
	@NotNull
	@NotBlank
	private double dailyPrice;
	
	@Column(name="model_year")
	@NotNull
	@NotBlank
	private int modelYear;
	
	@Column(name="description")
	@NotNull
	@NotBlank
	private String description;
	
	@Column(name="state")
	@NotNull
	@NotBlank
	private String state;  // 1-) Mevcut 2-) Bakımda 3-) Kiralık
}
