/*
    Программа для нахождения факториала указанного числа
*/

def int ftrl(int num)
{
    int ret = 1;
    int i = 1;
    while (i<=num)
    {
        ret = ret * i;
        i = i+1;
    }
    return ret;

}

__main__()
{
    int inp = 8;
    int out = ftrl (inp);
    print(out); //40320
}