# 문제
# 정수가 담긴 num_list가 주어질때,
#  num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return하는 함수.

# 2022.11.21.
def solution(num_list):
    answer = []
    i = 0
    even = 0
    odd = 0
    while(i < len(num_list)):
        if(num_list[i] % 2 == 0):
            even += 1
        else:
            odd += 1
        i += 1
    answer.insert(0, even)
    answer.insert(1, odd)
    return answer

# 다른 사람 풀이
def solution(num_list):
    answer = [0, 0]
    for n in num_list:
        answer[n % 2] += 1
    return answer

def solution(num_list):
    div_num_list = list(map(lambda v: v % 2, num_list))
    return [div_num_list.count(), div_num_list.count(1)]

def solution(num_list):
    odd = sum(1 for n in num_list if n % 2)
    return [len(num_list) - odd, odd]

def solution(num_list):
    even, odd = 0, 0
    for i in range(len(num_list)):
        if num_list[i] % 2 == 0:
            even += 1
        else:
            odd += 1
    return [even, odd]