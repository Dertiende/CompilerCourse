/*
    Программа для нахождения квадратного корня
    Алгоритм: Bakhsali Approximation
*/

def float sqrt (int num)
{
    int i = 0;
    int e = i * i;
    while ( e <= num)
    {
        i = i + 1;
        e = i * i;
    }
    i = i - 1;
    float d = num - i * i;
    float t = i * 2;
    float p = d / t;
    float a = i + p;
    d = p * p;
    t = 2 * a;
    p = a - d / t;
    return p;

}

__main__()
{
    float out = sqrt(23);
    print(out);
}