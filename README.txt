This is the answer of a coding test for Fei Yan's application of Kuali.

I wrote a sample class of how the elevator works. For this system including multiple elevators, we can create two queues (one for move-up, the other for move-down). For the elevators going up, it will only get the data from the move-up queue. If one of the current move-up elevator floors is smaller than the destination floor got from the move-up queue, and it is the closest one, it will stop at that destination floor. The move-down situation is similar.

Author: yanfei1982@gmail.com