def solution(s):
    temp = []

    for i in s:
        temp.append(i)
        j = len(temp) - 1

        if j > 0:
            if (temp[j - 1] == '(' and temp[j] == ')'):
                temp.pop()
                temp.pop()

    if len(temp) == 0:
        answer = True
    else:
        answer = False

    return answer

print(solution("()()"))
print(solution("(())()"))
print(solution(")()("))
print(solution("(()("))