package org.ict.controller.di;

import org.ict.controller.di.classfile.Singer;

public class DiMainJavaVer {

	public static void main(String[] args) {
		// 1. 가수 객체를 main에서 생성해 기능을 호출해주세요.
		Singer singer = new Singer();
		singer.sing();

	}

}
