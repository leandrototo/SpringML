package com.mirtaLuque.EP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;

@Service
public class EpService {

	@Autowired
	private EPrepository ePRepository;

	// get All EPs
	public List<EP> getAllEps() {
		List<EP> eps = new ArrayList<>();
		ePRepository.findAll()
		.forEach(eps::add);
		return eps;
	}

	// get 1 EP
	public java.util.Optional<EP> getEp(int id){
		return ePRepository.findById(id);
	}

	public void addEp(EP ep) {
		ePRepository.save(ep);
	}

	public void deleteEp(int id) {
		ePRepository.deleteById(id);
	}
}
