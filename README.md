PROBLEM A [ 2 points ] Output the word with no pair. Input is guaranteed to always have 1 possible output.
Input: “dog”, “dog”, “dog”
Output: “dog”
Input: “dog”, “cat”, “dog”, “cow”, “cat”
Output: “cow”
Input: “dog”, “dog”, “dog”, “cat”, “cat”, “cat”, “cat”
Output: “dog”
PROBLEM B [ 3 points ] Output 3 numbers that adds up to the expected total.
Input: [3, 2, 4, 6, 8, 10], 18 à Output: [4,6,8]
Note: outputs 4, 6 and 8 because 4 + 6 + 8 = 18
Input: [2, 2, 4, 6, 8, 2], 6 à Output: [2,2,2]
Note: because 2 + 2 + 2 = 6
Input: [0, 2, 3, 6], 9 à Output: [0, 3, 6]
PROBLEM C [ 5 points ] Output the smallest and biggest numbers of the biggest increasing trend. If there are multiple biggest
uptrends, then just output the first one. An uptrend is a set of 2 or more continuously increasing numbers.
Input = 1, 1, 2, 3
Output = 1, 3
Input = 1, 2, 2, 3, 3, 0, 8, 10
Output = 0, 10
Note: the uptrend 0, 8, 10 (10 minus 0 is 10) is bigger than the first uptrend 1 … 3 (3 minus 1 is 2).
Input = 5, 4, 3, 2, 1
Output = empty, “” or null
Note: this is a down trend so no output.
Input = 5, 4, 3, 2, 1, 2
Output = 1, 2
Note: uptrend is from 1 to 2 only, the first part is a downtrend. [ 2 points ] Output the word with no pair. 
Input is guaranteed to always have 1 possible output.
Input: “dog”, “dog”, “dog”
Output: “dog”

Input: “dog”, “cat”, “dog”, “cow”, “cat”
Output: “cow”

Input: “dog”, “dog”, “dog”, “cat”, “cat”, “cat”, “cat”
Output: “dog”

PROBLEM B [ 3 points ] Output 3 numbers that adds up to the expected total.

Input: [3, 2, 4, 6, 8, 10], 18 à Output: [4,6,8]
Note: outputs 4, 6 and 8 because 4 + 6 + 8 = 18

Input: [2, 2, 4, 6, 8, 2], 6 à Output: [2,2,2]
Note: because 2 + 2 + 2 = 6

Input: [0, 2, 3, 6], 9 à Output: [0, 3, 6]

PROBLEM C [ 5 points ] Output the smallest and biggest numbers of the biggest increasing trend. 
If there are multiple biggest
uptrends, then just output the first one.
An uptrend is a set of 2 or more continuously increasing numbers.

Input = 1, 1, 2, 3
Output = 1, 3

Input = 1, 2, 2, 3, 3, 0, 8, 10
Output = 0, 10

Note: the uptrend 0, 8, 10 (10 minus 0 is 10) is bigger than the first uptrend 1 … 3 (3 minus 1 is 2).
Input = 5, 4, 3, 2, 1

Output = empty, “” or null
Note: this is a down trend so no output.
Input = 5, 4, 3, 2, 1, 2

Output = 1, 2
Note: uptrend is from 1 to 2 only, the first part is a downtrend.
