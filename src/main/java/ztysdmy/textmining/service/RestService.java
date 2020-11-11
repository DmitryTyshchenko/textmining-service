package ztysdmy.textmining.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class RestService {

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public String health() {
		return "hello";
	}
	
	@RequestMapping(value = "/task", method = RequestMethod.POST)
	public ResponseEntity<Object> createLearningTask() {
		
		 //Create resource location
        var location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(123)
                                    .toUri();
       
        return ResponseEntity.created(location).build();
	}
}
