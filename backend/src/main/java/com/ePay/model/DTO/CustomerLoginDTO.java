package com.ePay.model.DTO;

//import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CustomerLoginDTO {

	private String mobileNumber;
	private String Password;

}
