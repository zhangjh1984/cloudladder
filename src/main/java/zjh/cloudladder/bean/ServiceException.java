package zjh.cloudladder.bean;

public class ServiceException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();		
	}

	public ServiceException(String message) {
		super(message);
		
	}
	
	public ServiceException(String message,String code) {
		super(message);
		this.code=code;
	}
	
	public ServiceException(String message,String code,String detail) {
		super(message);
		this.code=code;
		this.detail=detail;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String code;	
	private String detail;
	
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public static void panic (String message){
		throw new ServiceException(message);
	}

	public static void panic (String message,String code){
		throw new ServiceException(message,code);
	}	
	
	public static void panic (String message,String code,String detail){
		throw new ServiceException(message,code,detail);
	}	
	
}
