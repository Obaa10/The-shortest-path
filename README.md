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

1- Min Time, Power less than myPower, Money less than myMoney
start-station-id: 1 -- time-cost: 14.066667 -- end-station-id: home -- money-cost: 4400.0 --
power-cost: -15.0 -- way: buss
start-station-id: start -- time-cost: 2.6666667 -- end-station-id: 1 -- money-cost: 4000.0 --
power-cost: 20.0 -- way: taxi
Process time 53 ms
Visited root 4
2- Min Money, Power less than myPower
start-station-id: 2 -- time-cost: 18.181818 -- end-station-id: home -- money-cost: 0.0 --
power-cost: -100.0 -- way: walk
start-station-id: start -- time-cost: 5.4545455 -- end-station-id: 2 -- money-cost: 0.0 --
power-cost: -30.0 -- way: walk
Process time 17 ms
Visited root 4
3- Max Power, Money less than myMoney
start-station-id: 1 -- time-cost: 14.066667 -- end-station-id: home -- money-cost: 4400.0 --
power-cost: -15.0 -- way: buss
start-station-id: start -- time-cost: 2.6666667 -- end-station-id: 1 -- money-cost: 4000.0 --
power-cost: 20.0 -- way: taxi
Process time 19 ms
Visited root 4
4- Min Time, Max Power, Min Money
start-station-id: 2 -- time-cost: 18.181818 -- end-station-id: home -- money-cost: 0.0 --
power-cost: -100.0 -- way: walk
start-station-id: start -- time-cost: 5.4545455 -- end-station-id: 2 -- money-cost: 0.0 --
power-cost: -30.0 -- way: walk
Process time 19 ms
Visited root 4


### The second map
It contains 8 stations and 11 routes
Coins 16000 and energy 4

1- Min Time, Power less than myPower, Money less than myMoney
start-station-id: 6 -- time-cost: 53.0 -- end-station-id: home -- money-cost: 15800.0 --
power-cost: -100.0 -- way: buss
start-station-id: 1 -- time-cost: 32.0 -- end-station-id: 6 -- money-cost: 15400.0 -- power-cost:
0.0 -- way: taxi
start-station-id: start -- time-cost: 15.75 -- end-station-id: 1 -- money-cost: 15000.0 --
power-cost: 75.0 -- way: taxi
Process time 38 ms
Visited root 99
2- Min Money, Power less than myPower
start-station-id: 6 -- time-cost: 56.454544 -- end-station-id: home -- money-cost: 400.0 --
power-cost: -400.0 -- way: buss
start-station-id: 5 -- time-cost: 46.090908 -- end-station-id: 6 -- money-cost: 0.0 --
power-cost: -390.0 -- way: walk
start-station-id: 3 -- time-cost: 30.727272 -- end-station-id: 5 -- money-cost: 0.0 --
power-cost: -260.0 -- way: walk
start-station-id: start -- time-cost: 17.727272 -- end-station-id: 3 -- money-cost: 0.0 --
power-cost: -150.0 -- way: walk
Process time 21 ms
Visited root 9
3- Max Power, Money less than myMoney
start-station-id: 6 -- time-cost: 53.416664 -- end-station-id: home -- money-cost: 15800.0 --
power-cost: -100.0 -- way: buss
start-station-id: 1 -- time-cost: 32.416664 -- end-station-id: 6 -- money-cost: 15400.0 --
power-cost: 0.0 -- way: buss
start-station-id: start -- time-cost: 15.75 -- end-station-id: 1 -- money-cost: 15000.0 --
power-cost: 75.0 -- way: taxi
Process time 26 ms
Visited root 26
4- Min Time, Max Power, Min Money
start-station-id: 6 -- time-cost: 59.090908 -- end-station-id: home -- money-cost: 0.0 --
power-cost: -500.0 -- way: walk
start-station-id: 1 -- time-cost: 35.454544 -- end-station-id: 6 -- money-cost: 0.0 --
power-cost: -300.0 -- way: walk
start-station-id: start -- time-cost: 17.727272 -- end-station-id: 1 -- money-cost: 0.0 --
power-cost: -150.0 -- way: walk
Process time 19 ms
Visited root 14
