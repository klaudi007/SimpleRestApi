package utility;

import org.json.JSONObject;


public class MsgKit {

	public static final String ccrRestApiAuthError="Invalid Credentials";
	public static final String ccrRestApiForbiddenError="I'm sorry";
	
	public static String errorMsgToJson(String msg){
		String message=msg;
		JSONObject json=new JSONObject();
		json.put("error",message);
		message=json.toString();
		return message;
	}
	
	public static String okMsgToJson(String msg){
		String message=msg;
		JSONObject json=new JSONObject();
		json.put("ok",message);
		message=json.toString();
		return message;
	}
}
