package com.framework.commons.vo.ui;

import java.io.Serializable;

public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	private String value;
	private String text;

	public Option() {
	}

	public Option(String value, String text) {
		this.value = value;
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}