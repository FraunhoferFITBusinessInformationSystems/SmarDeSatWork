/*******************************************************************************
 * Copyright (C) 2018-2019 camLine GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.camline.projects.smardes.maindata.api;

import java.util.List;
import java.util.Map;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class MainDataQueryRequest {
	private String query;
	private Map<String, Object> namedParams;
	private List<Object> positionalParams;

	@JsonbCreator
	public MainDataQueryRequest(
			@JsonbProperty("query") final String query,
			@JsonbProperty("namedParams") final Map<String, Object> namedParams,
			@JsonbProperty("positionalParams") final List<Object> positionalParams) {
		this.query = query;
		this.namedParams = namedParams;
		this.positionalParams = positionalParams;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(final String query) {
		this.query = query;
	}

	public Map<String, Object> getNamedParams() {
		return namedParams;
	}

	public void setNamedParams(final Map<String, Object> namedParams) {
		this.namedParams = namedParams;
	}

	public List<Object> getPositionalParams() {
		return positionalParams;
	}

	public void setPositionalParams(final List<Object> positionalParams) {
		this.positionalParams = positionalParams;
	}

	@JsonbTransient
	public boolean isValid() {
		return query != null;
	}

	@Override
	public String toString() {
		return "MainDataQueryRequest [query=" + query + ", namedParams=" + namedParams + ", positionalParams="
				+ positionalParams + "]";
	}

}
