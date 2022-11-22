# 문제
# 문자열 string이 매개변수로 주어질때 
# string을 거꾸로 뒤집은 문자열을 return하는 함수.

# 2022.11.21.
def solution(string):
    reversed_string = list(string[-1::-1])
    answer = ''.join(e for e in reversed_string)
    return answer

# 다른 사람 풀이
def solution(string):
    return string[::-1]

def solution(string):
    return ''.join(list(reversed(string)))

    