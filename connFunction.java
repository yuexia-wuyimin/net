package com.Yim.ConnUtil;

import java.io.IOException;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import com.Yim.json.WriteJson;
//dad
public class connFunction {
	public String connUseHttpClient(List<?> wantToSend,String strutsAction){
		HttpClient hc= new HttpClient();
		
		String wantToSentJson;
		WriteJson writeToJson=new WriteJson();
		wantToSentJson = writeToJson.getJsonData(wantToSend);
		System.out.println(wantToSentJson);
		
		PostMethod postMethod = new PostMethod(com.automan.basic.ConnUtility.Server+"/androidaction/"+strutsAction+".action");
		postMethod.setParameter(strutsAction,wantToSentJson);
		String returnFromStruts="";
		try{
			hc.executeMethod(postMethod);
			returnFromStruts=postMethod.getResponseBodyAsString();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			postMethod.releaseConnection();
		}
		return returnFromStruts;	
	}
}
