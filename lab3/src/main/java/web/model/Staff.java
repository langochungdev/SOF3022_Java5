package web.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Staff {
	private String id;
	private String fullname;

	@Default
	private String photo = "photo.jpg";

	@Default
	private Boolean gender = true;

	@Default
	private Date birthday = new Date();

	@Default
	private Double salary = 12345.6789;

	@Default
	private Integer level = 0;
}
