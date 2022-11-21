# 문제
# 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return하는 함수.

# 2022.11.21.
def solution(n):
    answer = 0
    i = 2
    while(i <= n):
        answer += i
        i += 2
    return answer

# 다른 사람 풀이
def solution(n):
    return sum([i for i in range(2, n + 1, 2)])

def solution(n):
    answer = 0
    for i in range(1, n + 1):
        if i % 2 == 0:
            answer += i
    return answer

def solution(n):
    answer = []
    for i in range(2, n + 1, 2):
        answer.append(i)
    return sum(answer)