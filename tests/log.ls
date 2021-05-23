/*
    Программа для нахождения логарифма числа с указанным основанием
*/
def float sqr (float num, int count)
{
    int i = 0;
    float ans = 1.0;
    while (i<count)
    {
        ans = ans * num;
        i = i+1;
    }
    return ans;
}

def float ln (int num)
{
    float a = num - 1;
    float b = num + 1;
    float y = a/b;
    float l = 1.0;
    int i = 0;
    float ans = 2.0 * y;
    float tempAns = 1.0;
    float temp = 1.0;
    while (i < 10000)
    {
        i = i + 2;
        l = l + 2.0;
        a = 1 / l;
        temp = a * sqr(y,i);
        tempAns = tempAns + temp;

    }
    ans = ans*tempAns;
    return ans;
}

__main__()
{
    int base = 2;
    int var = 17;
    float e = ln(var)/ln(base);
    print(e);
}