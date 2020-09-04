// The array numbers already exists. Write only exchange actions here.

numbers[0]= numbers[numbers.lastIndex].also { numbers[numbers.lastIndex] = numbers[0] }
