package com.gd.qrserver.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gd.qrserver.vo.QRContent;

@Mapper
public interface QRMapper {
	int insertQRContent (QRContent qrContent) ;
}
