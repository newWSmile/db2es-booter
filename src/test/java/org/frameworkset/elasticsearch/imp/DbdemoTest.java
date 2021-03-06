package org.frameworkset.elasticsearch.imp;
/**
 * Copyright 2008 biaoping.yin
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.frameworkset.elasticsearch.ElasticSearchHelper;
import org.frameworkset.elasticsearch.client.DataStream;
import org.frameworkset.elasticsearch.client.ImportBuilder;
import org.frameworkset.elasticsearch.client.schedule.ImportIncreamentConfig;

/**
 * <p>Description: 测试代码</p>
 * <p></p>
 * <p>Copyright (c) 2018</p>
 * @Date 2018/9/27 20:38
 * @author biaoping.yin
 * @version 1.0
 */
public class DbdemoTest {
	public static void main(String args[]){
		Dbdemo dbdemo = new Dbdemo();
		boolean dropIndice = false;//CommonLauncher.getBooleanAttribute("dropIndice",false);//同时指定了默认值
		dbdemo.scheduleImportData(  dropIndice);
	}


}
