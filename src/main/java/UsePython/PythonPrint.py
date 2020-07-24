import time

loop_time = 5

while loop_time > 0:
    print("Hello World! " + str(loop_time))
    print(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
    loop_time -= 1
    time.sleep(3)
