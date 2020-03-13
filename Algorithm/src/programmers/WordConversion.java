package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class WordConversion
{

    class Solution
    {
        public int solution(String begin, String target, String[] words)
        {
            Queue<String> que = new LinkedList<String>();
            que.add(begin);
            return wordConversion(target, words, que, 0, words.length);
        }

        // bfs(using queue)
        private int wordConversion(String finalTarget, String[] words, Queue<String> que, int depth, int escapeDepth)
        {
            if(depth == escapeDepth)
            {
                return 0;
            }
            else
            {
                int size = que.size();
                for(int i = 0; i < size; i++)
                {
                    String word = que.poll();

                    for(String target : words)
                    {
                        if(check(word, target, 0, false))
                        {
                            if(target.equals(finalTarget))
                            {
                                return depth + 1;
                            }
                            else
                            {
                                que.add(target);
                            }
                        }
                    }
                }
                return wordConversion(finalTarget, words, que, depth + 1, escapeDepth);
            }
        }

        // dfs
        // flag = 이전 depth에서 char가 달랐던 적이 있었는지 ? true : false
        // flag 말고 다른 좋은 변수명 없을려나?
        private boolean check(String word, String target, int depth, boolean flag)
        {
            // 같은 단어이거나 길이가 다르면 F리턴
            if(word.equals(target) || word.length() != target.length())
            {
                return false;
            }

            // 탈출조건
            if(depth == word.length())
            {
                return flag;
            }
            // 재귀호출
            else
            {
                if(word.charAt(depth) != target.charAt(depth))
                {
                    if(flag)
                    {
                        return false;
                    }
                    else
                    {
                        return check(word, target, depth + 1, true);
                    }
                }
                else
                {
                    return check(word, target, depth + 1, flag);
                }
            }
        }
    }
}
