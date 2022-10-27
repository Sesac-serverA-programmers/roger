import copy


def solution(participant, completion):

    temp_p = copy.deepcopy(participant)
    temp_c = copy.deepcopy(completion)

    for i in participant:
        for j in completion:
            if (i == j):
                if (participant.count(i) - completion.count(j) > 0):
                    completion.remove(j)
                    temp_p.remove(i)
                    temp_c.remove(j)

                else:
                    temp_p.remove(i)
                    temp_c.remove(j)


    answer = temp_p[0]
    return answer


print(solution(["leo", "kiki", "eden"],["eden", "kiki"]))
print(solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]))
print(solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]))