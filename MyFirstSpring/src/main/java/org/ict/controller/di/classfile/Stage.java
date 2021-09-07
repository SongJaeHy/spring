package org.ict.controller.di.classfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stage {
	
	@Autowired
	private Singer singer;
	
	// 객체 생성시 무조건 Singer타입을 파라미터로 전달해야함
	public Stage(Singer singer) {
		this.singer = singer;
	}
	
	public void perform() {
		System.out.print("무대에서 ");
		// 실제 공연에서 가수가 담당
		singer.sing();
	}
}
