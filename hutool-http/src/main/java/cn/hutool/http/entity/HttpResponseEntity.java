package cn.hutool.http.entity;

import cn.hutool.http.HttpConfig;
import cn.hutool.http.HttpConnection;

import java.nio.charset.Charset;

public class HttpResponseEntity {
	private HttpConnection httpConnection;

	private HttpConfig config;

	private Charset charset;

	private boolean isAsync;

	private boolean isIgnoreBody;

	public HttpConnection getHttpConnection() {
		return httpConnection;
	}

	public void setHttpConnection(HttpConnection httpConnection) {
		this.httpConnection = httpConnection;
	}

	public HttpConfig getConfig() {
		return config;
	}

	public void setConfig(HttpConfig config) {
		this.config = config;
	}

	public Charset getCharset() {
		return charset;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public boolean isAsync() {
		return isAsync;
	}

	public void setAsync(boolean async) {
		isAsync = async;
	}

	public boolean isIgnoreBody() {
		return isIgnoreBody;
	}

	public void setIgnoreBody(boolean ignoreBody) {
		isIgnoreBody = ignoreBody;
	}
}
