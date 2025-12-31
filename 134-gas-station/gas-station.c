int canCompleteCircuit(int* gas, int ng, int* cost, int nc) {
    int totalCost = 0, totalGas = 0;
    int tank = 0, start = 0;
    for(int i = 0; i < ng; i++){
        totalCost += cost[i]; totalGas += gas[i];
        tank += gas[i] - cost[i];
        if(tank < 0){
            start = i + 1;
            tank = 0;
        }
    }
    if(totalCost > totalGas) return -1;
    return start;
}