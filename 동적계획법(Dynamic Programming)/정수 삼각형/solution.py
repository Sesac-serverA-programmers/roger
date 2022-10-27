import copy


def solution(triangle):
    answertemp = [[]*500 for _ in range(500)]
    temptriangle = copy.deepcopy(triangle)

    for i in range(len(triangle)-1):
        for j in range(len(triangle[i])):
            nextJ1 = j
            nextJ2 = j+1

            temp1 = temptriangle[i][j] + triangle[i+1][nextJ1]
            temp2 = temptriangle[i][j] + triangle[i+1][nextJ2]

            if(temptriangle[i + 1][nextJ1] < temp1):
                temptriangle[i + 1][nextJ1] = temp1

            if (temptriangle[i + 1][nextJ2] < temp2):
                temptriangle[i + 1][nextJ2] = temp2

            answertemp[i].append(temp1)
            answertemp[i].append(temp2)


    return max(answertemp[len(triangle)-2])




print(solution([[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]))

