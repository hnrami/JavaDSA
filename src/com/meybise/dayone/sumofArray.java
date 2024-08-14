package com.meybise.dayone;

public class sumofArray {

	public static void main(String[] args) {
		
		
		String lowerSource="fdskfabchlkabcsklfhdsfkldabclshdklfhskabcskldfhklsdabcdhfdsklfhdsf".toLowerCase();
		String lowerSubstring="abc".toLowerCase();
		
//	
//		    int count = 0;
//		    int index = 0;
//
//		    while ((index = lowerSource.indexOf(lowerSubstring, index)) != -1) {
//		        count++;
//		        index += lowerSubstring.length(); // Move past the current match
//		    }
//		    
//		    System.out.println(count);
		
        String remString = lowerSource.replaceAll(lowerSubstring,"");
        System.out.println((lowerSource.length()-remString.length())/lowerSubstring.length());

	}

}
