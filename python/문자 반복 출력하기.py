# 문제
# 문자열 my_string과 정수 n이 매개변수로 주어질때
# my_string에 들어있는 각 문자를 n번 반복한 문자열을 return하는 함수.

# 2022.11.22.
def solution(my_string, n):
    answer = []
    i = 0
    while(i < len(my_string)):
        answer.append(my_string[i] * n)
        i += 1
    answer = ''.join(answer)
    return answer

    
# 다른 사람 풀이
def solution(my_string, n):
    return ''.join(i * n for i in my_string)

def solution(my_string, n):
    answer = ''
    for c in my_string:
        answer = c * n
    return answer

def solution(my_string, n):
    answer = ''
    for i in my_string:
        for j in range(n):
            answer += 1
    return answer