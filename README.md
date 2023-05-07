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


