package com.qintess.eventos.services;

import org.springframework.stereotype.Service;

import com.qintess.eventos.models.LocalShow;
import com.qintess.eventos.repos.LocalShowRepository;

@Service
public class LocalShowService {
	
	private LocalShowRepository localShowRepository;
	
	public void insereLocalShow(LocalShow localShow) {
		localShowRepository.save(localShow);
		
	}

}
