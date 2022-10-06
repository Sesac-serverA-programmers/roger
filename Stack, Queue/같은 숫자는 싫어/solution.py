def solution(arr):
    answer = []

    for i in arr:

        answer.append(i)
        j = len(answer) - 1

        if j > 0:
            if (answer[j] == answer[j - 1]):
                answer.pop()

    return answer


print(solution([1,1,3,3,0,1,1]))
print(solution([4,4,4,3,3]))
