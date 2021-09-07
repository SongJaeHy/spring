package org.ict.controller.di.classfile;

public class Stage {
	
	private Singer singer;
	
	// 객체 생성시 무조건 Singer타입을 파라미터로 전달해야함
	public Stage(Singer singer) {
		this.singer = singer;
	}
	
	public void perform() {
		System.out.println("무대에서 ");
		singer.sing();
	}
}
