package com.gd.qrserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gd.qrserver.mapper.QRMapper;
import com.gd.qrserver.vo.QRContent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class QRService {
	@Autowired QRMapper qrMapper;
	public void addQRContent(QRContent qrContent) {
		log.debug("2.콘트롤러에서 온 값 확인 : "+qrContent);
		log.debug("3.넘겨줄 값 확인 : "+qrContent);
		int row = qrMapper.insertQRContent(qrContent);
		log.debug("4.매퍼에서 온값 확인 : "+row);
		log.debug("5.넘겨줄 값 확인 : "+"없음void");
	}
}
