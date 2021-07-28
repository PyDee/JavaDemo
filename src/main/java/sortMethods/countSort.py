def count_sort(input_list):
    length = len(input_list)
    if length < 2:
        return input_list
    max_num = max(input_list)
    count = [0] * (max_num + 1)
    for element in input_list:
        count[element] += 1
    output_list = []
    for i in range(max_num + 1):
        for j in range(count[i]):  # count[i]表示元素i出现的次数，如果有多次，通过循环重复追加
            output_list.append(i)
    return output_list