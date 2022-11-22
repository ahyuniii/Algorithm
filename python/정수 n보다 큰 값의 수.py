# 문제
# 비교할 수가 담긴 정수 배열 array와 정수 n이 매개변수로 주어질때,
# n보다 큰 수를 return하는 함수.

# 2022.11.21.
def solution(array, n):
    answer = 0
    i = 0
    for i in range(len(array)):
        if(array[i] > n):
            answer += 1
        i += 1
    return answer

# 다른 사람 풀이
def solution(array, n):
    array.append(n)
    array.sort(reverse=True)
    return array.index(n)

def solution(array, n):
    array.sort()
    count = 0
    for i in array:
        if i > n:
            count += 1
    return count

def solution(array, n):
    return len(list(filter(lambda v: v > n, array)))