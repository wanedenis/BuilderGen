/*
 * Copyright 2011 Pierre-Yves Ricau (py.ricau at gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package info.piwai.buildergen.bean;

import info.piwai.buildergen.api.Buildable;
import info.piwai.buildergen.api.Mandatory;

@Buildable
public class MandatoryBean {
	
	private final int intField;
	private final String stringField;
	private final Integer integerField;
	private final SomeObject someObjectField;
	
	MandatoryBean(int intField, @Mandatory String stringField, Integer integerField, @Mandatory SomeObject someObjectField) {
		this.intField = intField;
		this.stringField = stringField;
		this.integerField = integerField;
		this.someObjectField = someObjectField;
	}

	public int getIntField() {
		return intField;
	}

	public String getStringField() {
		return stringField;
	}

	public Integer getIntegerField() {
		return integerField;
	}

	public SomeObject getSomeObjectField() {
		return someObjectField;
	}
	
}
