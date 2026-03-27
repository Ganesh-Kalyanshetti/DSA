class Solution:
    def wordBreak(self, s: str, wordDict: list[str]) -> bool:
        # Your code goes here
        wordset = set(wordDict)
        dp = [False]*(len(s)+1) # for 0 indexing
        dp[0] = True   # [True, False, False, False, False, False]

        for i in range(1,len(s)+1):
            for j in range(i):
                if dp[j] and s[j:i] in wordset:
                    dp[i] = True
                    break

        return dp[len(s)]
      
