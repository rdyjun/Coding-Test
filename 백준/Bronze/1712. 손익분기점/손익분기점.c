#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    if(c - b <= 0){
        printf("%d", -1);
    } else {
        printf("%d", a / ((c - b)) + 1);
    }
    return (0);
}