# 문제
# 양꼬치 가게에서 10인분을 먹으면 음료수 하나를 서비스로 줌.
# 양꼬치 1인분은 12,000원, 음료수는 2,000원
# 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료소 k개를 먹었다면 지불해야하는 가격을 return 하는 함수

# 2022.11.21.
def solution(n, k):
    answer = (12000 * n) + (2000 * (k - (n // 10)))
    return answer

