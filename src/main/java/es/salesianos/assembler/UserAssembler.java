package es.salesianos.assembler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.salesianos.model.User;

@Component
public class UserAssembler {
	
	@Autowired
	private User user;	
	public User createUserFromRequest(HttpServletRequest request) {
		user.setDni(request.getParameter("dni"));
		user.setNombre(request.getParameter("nombre"));
		user.setApellido(request.getParameter("apellido"));
		return user;
	}

}
