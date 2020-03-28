import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		// TODO Auto-generated method stub
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int numPearls = 0;
		
		for(Boolean isTherePearl : oysters) {
			if(isTherePearl) {
				numPearls++;
			}
		}
		return numPearls;
	}

	public static Double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double tallestHeight = 0.0;
		
		for(Double height : peeps) {
			if(height>tallestHeight) {
				tallestHeight = height;
			}
		}
		return tallestHeight;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longestWord = "";
		
		for(String word : words) {
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		String keyWord = "...---...";
		
		for(String morseCode : message) {
			if(morseCode.contains(keyWord)) {
				return true;
			}
		}
		
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for(int i=0; i<results.size()-1; i++) {
			for(int j=0; j<results.size()-i-1; j++) {
				if(results.get(j)>results.get(j+1)) {
					//swap
					Double temp = results.get(j+1);
					results.set(j+1, results.get(j));
					results.set(j,  temp);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for(int i=0; i<unsortedSequences.size()-1;i++) {
			for(int j=0; j<unsortedSequences.size()-i-1;j++) {
				if(unsortedSequences.get(j).length() > unsortedSequences.get(j+1).length()) {
					//swap
					String temp = unsortedSequences.get(j+1);
					unsortedSequences.set(j+1, unsortedSequences.get(j));
					unsortedSequences.set(j, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for(int i=0; i<words.size()-1;i++) {
			for(int j=0; j<words.size()-i-1;j++) {
				if(words.get(j).compareTo(words.get(j+1)) > 0) {
					//swap
					String temp = words.get(j+1);
					words.set(j+1, words.get(j));
					words.set(j, temp);
				}
			}
		}
		return words;
	}

}
