import kotlin.system.measureTimeMillis

lateinit var currentStation: Station

var stack = mutableListOf<Way>()
var stationChildes = listOf<Way>()

var head: Way? = null
val draftWays = mutableListOf<Way>()

/**
 * Solve type mean the way you want to solve the game:
 * 1- Min Time, Power less than myPower, Money less than myMoney
 * 2- Min Money, Money less than myMoney
 * 3- Max Power, Money less than myMoney
 * 4- Min Time, Max Power, Min Money
 **/
var solveType = 1

const val myMoney = 5000
const val myPower = -100

fun main() {
stations.forEach { it.ways.forEach { _it -> _it.fromId = it.id } }
    currentStation = stations[0]
    val time = measureTimeMillis {
        solve()
    }
    println("Process time $time ms")
    println("Visited root ${draftWays.size}")
}

fun printSuccessWay() {
    println()
    var way = head
    printWayDetails(way)
    while (way?.fromId != "start") {
        way = draftWays.find { it.nextStationId == way?.fromId }
        printWayDetails(way)
    }
}

fun printWayDetails(way: Way?) {
    way?.let {
        println(
            "start-station-id: ${way.fromId} -- time-cost: ${way.timeCost} -- end-station-id: ${way.nextStationId} -- " +
                    "money-cost: ${way.moneyCost} -- power-cost: ${way.powerCost} -- way: ${way.travelMethodName}"
        )
    }
}

fun solve() {

    if (currentStation.id == "home") {
        printSuccessWay()
        return
    }

    stationChildes = if (head == null)
        currentStation.getChildes(null)
    else
        currentStation.getChildes(head)


    /**
     * NOTE:
     * here
     */
    stationChildes.forEach {
        it.cost = (stations.find { station -> station.id == it.nextStationId }?.distanceFromHome ?: 0) +
                when (solveType) {
                    1 -> it.timeCost
                    2 -> it.moneyCost
                    3 -> (it.powerCost * -1)
                    4 -> it.timeCost + it.moneyCost + (it.powerCost * -1)
                    else -> 0f
                }
    }
    stack.addAll(stationChildes)
    stack.sortBy { it.cost }

    /**  this functions just for debug **/
    /**
    println("---------------current-station---------------")
    println(currentStation.id)
    println("---------------Stack---------------")
    stack.forEach { print("${it.cost} ") }
    println()
    stack.forEach { printWayDetails(it) }
    **/

    draftWays.add(stack.first())

    head = stack.first()
    stack.remove(head)
    stations.find { it.id == head?.nextStationId }?.let { currentStation = it }

    solve()
}

var waySub = listOf<Way>()

data class Station(val id: String, val ways: List<Way>, val distanceFromHome: Int) {
    fun getChildes(way: Way?): List<Way> {
        waySub = ways.map { it.map() }
        if (way != null) {
            waySub.forEach {
                it.timeCost = it.timeCost + way.timeCost
                it.powerCost = it.powerCost + way.powerCost
                it.moneyCost = it.moneyCost + way.moneyCost
            }
        }
        /**
         * NOTE:
         * here
         */

        waySub = when (solveType) {
            1 -> waySub.filter { it.powerCost >= myPower && it.moneyCost <= myMoney }
            2 -> waySub.filter { it.powerCost >= myPower }
            3 -> waySub.filter { it.moneyCost <= myMoney }
            4 -> waySub
            else -> waySub
        }

        //waySub.forEach { print(it.cost) }
        return waySub
    }
}

data class Way(
    var length: Int,
    val travelMethodName: String,
    val waitTime: Int,
    val speed: Float = 5.5f,
    val bussId: String?,
    val nextStationId: String,
    val home: Boolean = false,
    var fromId: String = "",
    var cost: Float = 0f
) {
    var timeCost: Float = calculateCostByTime()
    var moneyCost: Float = calculateCostByMoney()
    var powerCost: Float = calculateCostByPower()


    private fun calculateCostByTime(): Float {
        return waitTime + (length / speed)
    }


    //For last way method -> check if the way was buss, and it has the same name do not calculate the new price
    private fun calculateCostByMoney(): Float {
        return if (travelMethodName == "buss" && head != null && head!!.travelMethodName == "buss" && head?.bussId == bussId) 0f
        else if (travelMethodName == "walk") 0f
        else if (travelMethodName == "buss") 400f
        else length * 1000f
    }


    private fun calculateCostByPower(): Float {
        return when (travelMethodName) {
            "buss" -> length * -5f
            "taxi" -> length * 5f
            else // Walk
            -> length * -10f
        }
    }

    fun map(): Way {
        return Way(length, travelMethodName, waitTime, speed, bussId, nextStationId, home, fromId, cost)
    }
}