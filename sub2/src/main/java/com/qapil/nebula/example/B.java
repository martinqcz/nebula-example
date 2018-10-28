package com.qapil.nebula.example;

public class B {
	private A delegate;

	public B(A delegate) {
		this.delegate = delegate;
	}

	public String hello(String param) {
		return delegate.hello(param);
	}
}
