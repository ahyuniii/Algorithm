# 문제 
# 삼각형을 만들기 위해서는 가장 긴변의 길이는 다른 두변의 길이의 합보다 작아야함.
# 삼각형 세변의 길이가 담긴 배열 sides가 매개변수로 주어질때 
# 삼각형을 만들 수 있으면 1, 없다면 2를 return하는 함수.

# 2022.11.21
def solution(sides):
    answer = 0
    sides_max = max(sides)
    sides.remove(sides_max)
    sides_sum = sum(sides)
    if(sides_sum > sides_max):
        return 1
    else:
        return 2

# 다른 사람 풀이
def solution(sides):
    return 1 if max(sides) < (sum(sides) - max(sides)) else 2

def solution(sides):
    sides.sort()
    return 1 if sides[0] + sides[1] > sides[2] else 2