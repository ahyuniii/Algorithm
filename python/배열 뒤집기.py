# 문제
# 정수가 들어있는 배열 num_list가 매개변수로 주어질때, 
# num_list의 원소의 순서를 거꾸로 뒤집은 배열을 retrun하는 함수.

# 2022.11.21.
def solution(num_list):
    num_list.reverse()
    return num_list

# 다른 사람 풀이
def solution(num_list):
    return num_list[::-1]

def solution(num_list):
    answer = []
    while(num_list):
        answer.append(num_list.pop())
    return answer