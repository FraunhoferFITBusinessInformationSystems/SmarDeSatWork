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
package com.camline.projects.smardes.dbmon;

import java.util.Map;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;

@JsonbPropertyOrder({"Id", "Type", "Source"})
public class DBMonEvent {
	@JsonbProperty("Id")
	private final String id;
	@JsonbProperty("Source")
	private final String source;
	@JsonbProperty("Content")
	private final Map<String, Object> content;

	@JsonbCreator
	public DBMonEvent(final String id, final String source, final Map<String, Object> content) {
		this.id = id;
		this.source = source;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public String getSource() {
		return source;
	}

	@JsonbProperty("Type")
	public String getType() {
		return "DBMonEvent";
	}

	public Map<String, Object> getContent() {
		return content;
	}

	@JsonbTransient
	public boolean isValid() {
		return id != null && content != null;
	}

	@Override
	public String toString() {
		return "DBMonEvent [id=" + id + ", content=" + content + "]";
	}
}
