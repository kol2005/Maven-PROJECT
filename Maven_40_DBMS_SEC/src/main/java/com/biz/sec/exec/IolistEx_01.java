package com.biz.sec.exec;

import com.biz.sec.config.DBConnectionSEC;

public class IolistEx_01 {

	public static void main(String[] args) {
		
		// mybatis-config.xml, DBConnection 클래스, iolist-mapper.xml 테스트코드
		DBConnectionSEC.getInstance().openSession(true);
		System.out.println("Test OK!!");

	}

}
