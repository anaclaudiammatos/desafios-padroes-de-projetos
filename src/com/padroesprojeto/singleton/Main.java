package com.padroesprojeto.singleton;

public class Main {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println("Lazy 1: " + lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println("Lazy 2: " + lazy);
		
		System.out.println("------------------");
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println("Eager 1: " + eager);
		eager = SingletonEager.getInstancia();
		System.out.println("Eager 2: " + eager);
		
		System.out.println("------------------");
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println("LazyHolder 1: " + lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println("LazyHolder 2: " + lazyHolder);

	}

}