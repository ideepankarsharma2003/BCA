#include<stdio.h>

typedef struct 
{
    int course;
    int semester;
}Student;

int main(){
    Student s;
    s.course= 1;
    s.semester= 3;

    printf("%d\t%d", s.course, s.semester);
}
