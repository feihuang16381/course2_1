package version1;

import java.util.Map;  

/** 
 * ���ַ��������Ľ���������������ַ������ַ�/����� 
 
 * 
 */  
public class EncodeResult {  
    // �ַ��������Ľ��  
    private String encode;  
    // �ַ������  
    private Map<Character, String> letterCode;  
    public EncodeResult(String encode, Map<Character, String> letterCode) {  
        super();  
        this.encode = encode;  
        this.letterCode = letterCode;  
    }  
    public String getEncode() {  
        return encode;  
    }  
    public Map<Character, String> getLetterCode() {  
        return letterCode;  
    }  
}  