# 문제
# 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질때, 
# numbers의 num1번째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return하는 함수.

# 2022.11.22.
def solution(numbers, num1, num2):
    answer = []
    i = num1
    while(i <= num2):
        answer.append(numbers[i])
        i += 1
    return answer