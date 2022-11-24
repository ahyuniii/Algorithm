# 문제
# 아이스 아메리카노 한잔에 5500원
# money가 매개변수로 주어질때, 
# 최대로 마실수 있는 아메리카노의 잔 수와 남는돈을 순서대로 담은 배열을 return하는 함수.

# 2022.11.23.
def solution(money):
    answer = [0, 0]
    answer[0] = money // 5500
    answer[1] = money - answer[0] * 5500
    return answer

# 다른 사람 풀이
def solution(money):
    answer = [money // 5500,   money % 5500]
    return answer

def solution(money):
    return divmod(money, 5500)