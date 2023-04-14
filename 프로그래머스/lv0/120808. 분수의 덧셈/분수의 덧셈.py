def solution(numer1, denom1, numer2, denom2):
    answer = []

    answer.append(numer1 * denom2 + numer2 * denom1)
    answer.append(denom1 * denom2)
    
    for i in range(answer[0], 1, -1) :
        if (answer[0] % i == 0 and answer[1] % i == 0) :
            answer[0] /= i
            answer[1] /= i
    
    return answer