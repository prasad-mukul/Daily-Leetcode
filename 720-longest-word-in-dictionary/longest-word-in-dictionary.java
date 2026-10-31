class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String res="";
        Set<String> wordSet = new HashSet<>();
        for(String word : words){
            if(word.length() == 1 || wordSet.contains(word.substring(0, word.length()-1))){
                wordSet.add(word);
                if(res.length() < word.length()){
                    res = word;
                }
            }
        }
        return res;
    }
}