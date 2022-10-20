def solution(participant, completion):
    ii = len(participant)
    jj = len(completion)
    print(ii,jj)
    for i in range(ii-1):
        for j in range(jj-1):
            print(i,participant[i]," : ", j,completion[j])
            if (participant[i] == completion[j]):
                a = participant[i]
                print("remove",a)
                participant.remove(a)
                print("participant :",participant)
    answer = participant
    return answer


print(solution(["leo", "kiki", "eden"],["eden", "kiki"]))
print(solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]))
print(solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]))