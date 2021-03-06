package in.thirumal.xmlignore;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * @author Thirumal
 *
 */
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@ToString@Builder
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4016522863306320321L;

	@JsonView(Views.Json.class)
	private Long id;
	@JsonView(Views.Default.class)
	private String name;
	@JsonView(Views.Default.class)
	private LocalDate dob;
}
