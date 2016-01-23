import java.util.ArrayList;

// Contains objects that will be tested to determine if they are a palindrome
public class TestPalindrome {

	public static void paliArray(){
		
		String result = "";
	
		ArrayList<Word> wArray = new ArrayList<Word>();
		
		TestPalindrome.Word wordOne = new Word("hannah");
		wArray.add(wordOne);	
		Word wordTwo = new Word("Dayle elyaDd");
		wArray.add(wordTwo);
		Word wordThree = new Word("racecar");
		wArray.add(wordThree);
		Word wordFour = new Word("winner");
		wArray.add(wordFour);
		Word wordFive = new Word("Caleb belaC");
		wArray.add(wordFive);
		Word wordSix = new Word("rats live on no evil star");
		wArray.add(wordSix);
		
		System.out.println("The size of the array list is " + wArray.size());
		
		for(Word word : wArray){
			for(int i = 0; i < word.getStr().length(); i++){
				int len = word.getStr().length();
				String back = word.getStr().substring(len - i - 1, len - i);
				
				result += back;
			}
			if(result.equals(word.getStr())){
				System.out.println(word.getStr() + " is a palindrome.");			
			
			}
			else System.out.println(word.getStr()+ " is not a palindrome.");
			word = null;
			result = "";
		}
	}	
	
	  private static class Word {
		private String str = "";
		
		
		public Word(String str){
			this.str = str;
		}
		
		public String getStr() {
			return str;
		}
	}
}
