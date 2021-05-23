/*
    Программа для вычисления суммы всех чётных чисел
    от 0 до заданного значения.
*/

def int sumEvenNum (int limit)
{
    int i = 0;
    int k = 1;
    int result = 0;
    while(true)
    {
        result = result + i;
        i = i + 2;
        if (k < 5 and k != 4 )
        {
            print('k');
            k = k+1;
        }
        if (i < limit )
        {
            continue;
            i = 10000000;
            print('e');
        }
        if (i >= limit)
        {
            break;
        }
    }
    print('e');
    print('n');
    print('d');

    return result;
}

__main__()
{
    int out = sumEvenNum(90000);
    print(out);
}