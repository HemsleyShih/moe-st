package pcc.pouchen.com.AppTest;

import org.apache.commons.lang3.StringUtils;

public class getDifferStr {
	
	public String getDeifferStr(String str1, String str2) throws Exception {
		
		if(StringUtils.isEmpty(str1) || StringUtils.isEmpty(str2))
			throw new Exception("Empty or Null string is not allowed.");
			
			return StringUtils.difference(str1, str2);
	}

}
