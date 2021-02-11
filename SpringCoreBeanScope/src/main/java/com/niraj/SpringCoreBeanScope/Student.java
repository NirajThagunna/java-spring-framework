package com.niraj.SpringCoreBeanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Singleton: Only one instance will be created for a single bean definition per Spring IoC container and the same object 
// will be shared for each request made for that bean. 
// Prototype: A new instance will be created for a single bean definition every time a request is made for that bean.

// Prototype scope: A new object is created each time it is injected. 
// Singleton scope: The same object is returned each time it is injected. 
// Prototype scope is used for all beans that are stateful, while the singleton scope should be used for stateless beans.

@Component
@Scope("prototype")
public class Student {
	@Value("Niraj Thagunna")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
