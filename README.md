# the-short-path
## About this app
Kalid wants to go from university to home.
He has limited time, power, and money.
The path to the home contains stations and routes connected with each other.
There are three ways to move around (taxi, bus, walking), each one having different costs (time, money).
In this algorithm, we will find the best path depending on Kalid’s prioritization (ex. going home with the lowest money cost and his power more than zero).


## About A* and State space search
State space search is a technique for finding solutions to problems by exploring the possible states and actions that lead from the initial state to the goal state.
algorithm for state space search A* is a popular that uses a heuristic function to estimate the cost of reaching the goal from each state.
The algorithm maintains a priority queue of states, ordered by the sum of the cost so far and the heuristic cost.
It repeatedly expands the state with the lowest priority, until it reaches the goal or the queue is empty.


## Examples
### The first map
It contains 5 stations and 8 routes
Coins 5000 and energy 1

1. **Min Time, Power less than myPower, Money less than myMoney**
     * 2. start-station-id: 1 -- end-station-id: home 
     money-cost: 4400.0 __ power-cost: 15.0 __ way: buss
     * 1. start-station-id: start -- end-station-id: 1 
     money-cost: 4000.0 __ power-cost: 20.0 __ way: taxi

     * _Process time 53 ms_
     * _Visited roots 4_

2. **Min Time, Max Power, Min Money**
     * 2. start-station-id: 2 -- end-station-id: home
     money-cost: 0.0 __ power-cost: -100.0 __ way: walk
     * 1. start-station-id: start -- end-station-id: 2 
     money-cost: 0.0 __ power-cost: -30.0 __ way: walk

     * _Process time 19 ms_
     * _Visited roots 4_


### The second map
It contains 8 stations and 11 routes
Coins 16000 and energy 4

1.  **Min Money, Power less than myPower**
     * 4. start-station-id: 6 -- end-station-id: home
     money-cost: 400.0 __ power-cost: -400.0 __ way: buss
     * 3. start-station-id: 5 -- end-station-id: 6
     money-cost: 0.0 __ power-cost: -390.0 __ way: walk
     * 2. start-station-id: 3 -- end-station-id: 5
     money-cost: 0.0 __ power-cost: -260.0 __ way: walk
     * 1. start-station-id: start -- end-station-id: 3
     money-cost: 0.0 __ power-cost: -150.0 __ way: walk

     * __Process time 21 ms__
     * __Visited root 9__

2. **Min Time, Max Power, Min Money**
     * 3. start-station-id: 6 -- end-station-id: home 
     money-cost: 0.0 __ power-cost: -500.0 __ way: walk
     * 2. start-station-id: 1 -- end-station-id: 6 
     money-cost: 0.0 __ power-cost: -300.0 __ way: walk
     * 1. start-station-id: start -- end-station-id: 1 
     money-cost: 0.0 __ power-cost: -150.0 __ way: walk

     * __Process time 19 ms__
     * __Visited root 14__
