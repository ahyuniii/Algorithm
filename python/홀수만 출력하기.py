# 문제
# 정수 n이 매개변수로 주어질때, 
# n이하의 홀수가 오름차순으로 담긴 배열을 return하는 함수.

# 2022.11.24.
def solution(n):
    answer = []
    while(i <= n):
        if(i % 2 == 1):
            answer.append(i)
        i += 1
    return answer

# 다른 사람 풀이
def solution(n):
    return [i for i in range(1, n + 1, 2)]

def solution(n):
    return [i for i in range(1, n + 1) if i % 2 == 1]
