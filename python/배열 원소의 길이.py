# 문제
# 문자열 배열 strlist가 매개변수로 주어질때,
# strlist 각 원소의 길이를 담은 배열을 return하는 함수.

# 2022.11.23.
def solution(strlist):
    answer = []
    i = 0
    while(i < len(strlist)):
        answer.append(len(strlist[]))
        i += 1
    return answer

# 다른 사람 풀이
def solution(strlist):
    return [len(str) for str in strlist]

def solution(strlist):
    answer = []
    for i in strlist:
        answer.append(len(i))
    return answer

def solution(strlist):
    answer = list(map(len, strlist))
    return answer

def solution(strlist):
    return list(map(lambda v: len(v), strlist))