package com.gd.qrserver.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gd.qrserver.service.QRService;
import com.gd.qrserver.vo.QRContent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin //app과 패키지명이 달라도 호출가능
public class QRController {
	@Autowired QRService qrService;
	
	@PostMapping("/addQRContent")
	public void addQRContent(@RequestBody QRContent qrContent) {
		if(qrContent == null) {
			log.debug("0. qrContent is null");
		} else {
			log.debug("0. qrContent :"+qrContent.toString());
			
			// Database 연동 구현
			log.debug("1. 넘겨줄값 확인 :"+qrContent.toString());
			qrService.addQRContent(qrContent);
			log.debug("6.서비스에서 온 값 확인 : "+"없음 void");
		}
	}
	@GetMapping("/hello")
	public void hello() {
		log.debug("0. hello");
	}
}
