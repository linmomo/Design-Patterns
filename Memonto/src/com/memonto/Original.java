package com.memonto;

/**
 * Դ���������ݲ����ͻָ�����
 * @author Administrator
 *
 */
public class Original {
	private String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		this.value = value;
	}
	
	public Memonto cteateMemonto(){
		Memonto memonto=new Memonto(value);
		return memonto;
	}
	
	public void restorMemonto(Memonto memonto){
		this.value = memonto.getValue();
	}
}
