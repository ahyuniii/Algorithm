# 문제
# 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return하는 함수

#2022.11.21.
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
    return sum(filter(lambda v: v % 2 == 0, [_ for _ in range(n + 1)]))

def solution(n):
    answer = []
    for i in range(2, n + 1, 2):
        answer.append(i)
    return sum(answer)