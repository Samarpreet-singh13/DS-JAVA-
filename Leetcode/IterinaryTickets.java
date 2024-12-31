// package Leetcode;
// no 332
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.PriorityQueue;
// import java.util.Stack;

// public class IterinaryTickets {
//     class Solution {
//     public List<String> findItinerary(List<List<String>> tickets) {
//         Map<String, PriorityQueue<String>> flights = new HashMap<>();
//         for (List<String> ticket : tickets) {
//             flights.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>()).add(ticket.get(1));
//         }

//         // Step 2: Initialize stack and result list
//         LinkedList<String> itinerary = new LinkedList<>();
//         Stack<String> stack = new Stack<>();
//         stack.push("JFK");  // Start from JFK

//         // Step 3: Iteratively build the itinerary
//         while (!stack.isEmpty()) {
//             String currentAirport = stack.peek();
//             PriorityQueue<String> nextDestinations = flights.get(currentAirport);

//             if (nextDestinations != null && !nextDestinations.isEmpty()) {
//                 // Visit next lexicographically smallest airport
//                 stack.push(nextDestinations.poll());
//             } else {
//                 // No further destinations, backtrack
//                 itinerary.addFirst(stack.pop());
//             }
//         }

//         return itinerary;
//     }
// }
// }
