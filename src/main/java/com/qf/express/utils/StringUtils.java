package com.qf.express.utils;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.cfg.DefaultConfig;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

public class StringUtils {
	
	public static String getCheckCode() {
	   
	    return (int)((Math.random()*9+1)*100000)+"";
	}
	// 把很长的中文字符串 拆分成 词库 返回值  List<String>
	public static List<String> queryWords(String query) throws IOException {		
        Configuration cfg = DefaultConfig.getInstance();					
        List<String> list = new ArrayList<String>();			
        StringReader input = new StringReader(query.trim());			
        IKSegmenter ikSeg = new IKSegmenter(input, true);   // true 用智能分词 ，false细粒度			
        Lexeme lexeme =  ikSeg.next();			
        while(lexeme!=null) {			
        	list.add(lexeme.getLexemeText());		
        	lexeme =  ikSeg.next();		
        }			
        return list;	
    }
	
	public static void main(String[] args) throws IOException {
		List<String> keys = queryWords("湖南省长沙市岳麓区中电软件园");
		System.out.println(keys);
	}
}
