# 문제
# 피자를 slice조각으로 잘라주는데, 피자를 나눠먹을 사람의 수 n이 주어질때, 모든 사람이 피자를 한 조각 이상 먹기위해 필요한 피자의 수를 return하는 함수. 

# 2022.11.21.
def solution(slice, n):
    answer = 0
    while(n > slice * answer):
        answer += 1
    return answer

# 다른 사람 풀이
def solution(slice, n):
    return (n - 1) // slice + 1

import math
def solution(slice, n):
    return math.ceil(n / slice)

def solution(slice, n):
    d, m = divmod(n, slice)
    return d + int(m != 0)

