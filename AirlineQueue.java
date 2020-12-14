// NAME: Austin Faulkner
// NetID: a_f408
// Course: CS 3354.251 -- Object-Oriented Programming and Design

// CLASS: Queueing
// FINAL EXAM (PART 2)
// DATE: May 11, 2020

import static java.lang.System.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class AirlineQueue {

   public static void printWelcome() {
      out.println("-----------------------------------------------------------");
      out.println("             WELCOME TO SOUTHWEST AIRLINES                 ");
      out.println("-----------------------------------------------------------");
   }

   public static void printInitialDequeueOfQueuesAandB() {
      out.println("-----------------------------------------------------------");
      out.println("       Initial Dequeue of Queues A and B to QueueC         ");
      out.println("-----------------------------------------------------------");
   }

   public static void printRound2DequeueOfQueuesAandB() {
      out.println("-----------------------------------------------------------");
      out.println("       Round 2 Dequeue of Queues A and B to QueueC         ");
      out.println("-----------------------------------------------------------");
   }

   public static void printPostDequeueStats() {
      out.println();
      out.println("-----------------------------------------------------------");
      out.println("    SIZES OF QUEUES A, B, AND C AFTER INITIAL DEQUEUING    ");
      out.println("-----------------------------------------------------------");
   }

   public static void printPostRound2DequeueStats() {
      out.println();
      out.println("-----------------------------------------------------------");
      out.println("    SIZES OF QUEUES A, B, AND C AFTER ROUND 2 DEQUEUING    ");
      out.println("-----------------------------------------------------------");
   }

   public static PriorityQueue<Integer> populateQueueA(PriorityQueue<Integer> q,
                                                      int numPeople) {
      for (int i = 1; i <= numPeople; ++i) {
         q.add(i);
      }
      return q;
   }

   public static PriorityQueue<Integer> populateQueueB(PriorityQueue<Integer> q,
                                                      int numPeople) {
      for (int i = 1; i <= numPeople; ++i) {
         q.add(i);
      }
      return q;
   }

   public static PriorityQueue<Integer> populateQueueC(PriorityQueue<Integer> q,
                                                      int numPeople) {
      for (int i = 1; i <= numPeople; ++i) {
         q.add(i);
      }
      return q;
   }

   public static void printInitialSizeA(PriorityQueue<Integer> q) {
      out.println("Ticket-Holders in QueueA: " + q.size());
   }

   public static void printInitialSizeB(PriorityQueue<Integer> q) {
      out.println("Ticket-Holders in QueueB: " + q.size());
   }

   public static void printInitialSizeC(PriorityQueue<Integer> q) {
      out.println("Ticket-Holders in QueueC: " + q.size());
   }

   public static void initialDequeueA(PriorityQueue<Integer> q,
                                             int numDequeueFromARound1) {
      AirlineQueue aq = new AirlineQueue();
      int initialTimeTotalA = 0;
      int checkersTime = 0;

      out.println();

      for (int i = 1; i <= numDequeueFromARound1; ++i) {
         String queueNum = Integer.toString(q.peek());
         checkersTime = aq.getRandomNumberMilliseconds();
         out.println("Dequeing A" + queueNum + ", Checker-A's Time "
                     + "(milliseconds) = " + checkersTime);
         initialTimeTotalA += checkersTime;
         q.remove();
      }
      out.println();
      out.println("Checker-A's Total Time (milliseconds) for Initial Dequeue:"
                  + initialTimeTotalA);

      int ATotalInitialSecs = (int) Math.round((double) initialTimeTotalA
                                                                        / 1000);
      out.println("Checker-A's Total Time (seconds) for Initial Dequeue: "
                  + ATotalInitialSecs);
      int ATotalInitialMins = (int) Math.round((double) ATotalInitialSecs
                                                                        / 60);
      out.println("Checker-A's Total Time (minutes) for Initial Dequeue: "
                  + ATotalInitialMins);
      out.println();
   }

   public static void initialDequeueB(PriorityQueue<Integer> q,
                                                   int numDequeueFromBRound1) {

      AirlineQueue aq = new AirlineQueue();
      int initialTimeTotalB = 0;
      int checkersTime = 0;

      out.println();

      for (int i = 1; i <= numDequeueFromBRound1; ++i) {
         String queueNum = Integer.toString(q.peek());
         checkersTime = aq.getRandomNumberMilliseconds();
         out.println("Dequeing B" + queueNum + ", Checker-B's Time "
                     + "(milliseconds) = " + checkersTime);
         initialTimeTotalB += checkersTime;
         q.remove();
      }
      out.println();
      out.println("Checker-B's Total Time (milliseconds) for Initial Dequeue: "
                  + initialTimeTotalB);
      int BTotalInitialSecs = (int) Math.round((double) initialTimeTotalB
                                                                        / 1000);
      out.println("Checker-B's Total Time (seconds) for Initial Dequeue: "
                  +  BTotalInitialSecs);
      int BTotalInitialMins = (int) Math.round((double) BTotalInitialSecs
                                                                        / 60);
      out.println("Checker-B's Total Time (minutes) for Initial Dequeue: "
                  +  BTotalInitialMins);
      out.println();

   }

   public static void printPostInitialDequeueSizeA(PriorityQueue<Integer> q) {
      out.println("QueueA Size After Initial Dequeue to QueueC: " + q.size());
   }

   public static void printPostInitialDequeueSizeB(PriorityQueue<Integer> q) {
      out.println("QueueB Size After Initial Dequeue to QueueC: " + q.size());
   }

   public static void printPostInitialDequeueSizeC(PriorityQueue<Integer> q,
                        int numDequeueFromARound1, int numDequeueFromBRound1) {
      for (int i = 1; i <= numDequeueFromARound1; ++i) {
         q.add(i);
      }

      for (int i = 1; i <= numDequeueFromBRound1; ++i) {
         q.add(i);
      }
      out.println("QueueC Size After Initial Dequeue of Queues A and B to "
                + " QueueC: " + q.size());
   }

   public static void pollingQueueCRound1(PriorityQueue<Integer> q,
                         int numPeopleInitiallyInC, int numDequeueFromARound1,
                         int numDequeueFromBRound1) {

      int millisecondsCRound1 = 0;
      int sumQueueCsMillisecoundsRound1 = 0;
      int queueCRound1Secs = 0;
      int queueCRound1Mins = 0;

      out.println();
      out.println("-----------------------------------------------------------");
      out.println("               Boarding QueueC (Round 1)                   ");
      out.println("-----------------------------------------------------------");
      out.println();
      out.println("REMARK: There can be multiple 1s, 2s, etc, since each queue\n"
                  + "\thas at least one member called 1, 2, etc.");
      out.println();

      for (int i = 1; i <= numPeopleInitiallyInC +
                           numDequeueFromARound1 + numDequeueFromBRound1; ++i) {
         millisecondsCRound1 = getRandomNumberMilliseconds();
         out.println(i + ".)  Person " + q.poll() + " Dequeing: "
                      + millisecondsCRound1 + " (milliseconds).");
         sumQueueCsMillisecoundsRound1 += millisecondsCRound1;
      }
      out.println();
      out.println("Checker-C's Total Time (milliseconds) for Round1 Dequeue: "
                  + sumQueueCsMillisecoundsRound1);

      queueCRound1Secs =
               (int) Math.round((double) sumQueueCsMillisecoundsRound1 / 1000);
      out.println("Checker-C's Total Time (seconds) for Round 1 Dequeue: "
                  + queueCRound1Secs);
      queueCRound1Mins =
               (int) Math.round((double) queueCRound1Secs / 60);
      out.println("Checker-C's Total Time (minutes) for Round 1 Dequeue: "
                  + queueCRound1Mins);
      out.println();
      out.println("QueueC is Now Empty with Size: " + q.size());
      out.println("Time to Board More Passengers . . . ");
      out.println();
   }

   public static void secondDequeueA(PriorityQueue<Integer> q,
                                             int numDequeueFromARound2) {
      AirlineQueue aq = new AirlineQueue();
      int round2TimeTotalA = 0;
      int checkersTime = 0;

      out.println();

      for (int i = 1; i <= numDequeueFromARound2; ++i) {
         String queueNum = Integer.toString(q.peek());
         checkersTime = aq.getRandomNumberMilliseconds();
         out.println("Dequeing A" + queueNum + ", Checker-A's Time "
                     + "(milliseconds) = " + checkersTime);
         round2TimeTotalA += checkersTime;
         q.remove();
      }
      out.println();
      out.println("Checker-A's Total Time (milliseconds) for Round 2 Dequeue: "
                  + round2TimeTotalA);

      int ATotalRound2Secs = (int) Math.round((double) round2TimeTotalA
                                                                        / 1000);
      out.println("Checker-A's Total Time (seconds) for Round 2 Dequeue: "
                  + ATotalRound2Secs);
      int ATotalRound2Mins = (int) Math.round((double) ATotalRound2Secs
                                                                        / 60);
      out.println("Checker-A's Total Time (minutes) for Round 2 Dequeue: "
                              + ATotalRound2Mins);
      out.println();
   }

   public static void secondDequeueB(PriorityQueue<Integer> q,
                                                       int numDequeueFromBRound2) {

      AirlineQueue aq = new AirlineQueue();
      int secondTimeTotalB = 0;
      int checkersTime = 0;

      out.println();

      for (int i = 1; i <= numDequeueFromBRound2; ++i) {
         String queueNum = Integer.toString(q.peek());
         checkersTime = aq.getRandomNumberMilliseconds();
         out.println("Dequeing B" + queueNum + ", Checker-B's Time "
                     + "(milliseconds) = " + checkersTime);
         secondTimeTotalB += checkersTime;
         q.remove();
      }
      out.println();
      out.println("Checker-B's Total Time (milliseconds) for Initial Dequeue: "
                  + secondTimeTotalB);
      int BTotalRound2Secs = (int) Math.round((double) secondTimeTotalB
                                                                        / 1000);
      out.println("Checker-B's Total Time (seconds) for Initial Dequeue: "
                  +  BTotalRound2Secs);
      int BTotalRound2Mins = (int) Math.round((double) BTotalRound2Secs
                                                                        / 60);
      out.println("Checker-B's Total Time (minutes) for Initial Dequeue: "
                  +  BTotalRound2Mins);
      out.println();
   }

   public static void printPostRound2DequeueSizeA(PriorityQueue<Integer> q) {
      out.println("QueueA Size After Round 2 Dequeue to QueueC: " + q.size());
   }

   public static void printPostRound2DequeueSizeB(PriorityQueue<Integer> q) {
      out.println("QueueB Size After Round2 Dequeue to QueueC: " + q.size());
   }

   public static void printPostRound2DequeueSizeC(PriorityQueue<Integer> q,
                        int numDequeueFromARound2, int numDequeueFromBRound2) {
      for (int i = 1; i <= numDequeueFromARound2; ++i) {
         q.add(i);
      }

      for (int i = 1; i <= numDequeueFromBRound2; ++i) {
         q.add(i);
      }
      out.println("QueueC Size After Initial Dequeue of Queues A and B to "
                + " QueueC: " + q.size());
   }

   public static char wantToQueueAnotherFlight() {
      out.println();
      out.println();

      out.print("Would you like to queue another flight (y/n)? ");
      Scanner keyboard = new Scanner(System.in);
      char response = keyboard.next().charAt(0);

      out.println();
      out.println();

      return response;
   }

   public static void pollingQueueCRound2(PriorityQueue<Integer> q,
                         int numDequeueFromARound2, int numDequeueFromBRound2) {

      int millisecondsCRound2 = 0;
      int sumQueueCsMillisecoundsRound2 = 0;
      int queueCRound2Secs = 0;
      int queueCRound2Mins = 0;

      out.println();
      out.println("-----------------------------------------------------------");
      out.println("               Boarding QueueC (Round 2)                   ");
      out.println("-----------------------------------------------------------");
      out.println();
      out.println("REMARK: There can be multiple 1s, 2s, etc, since each queue\n"
                  + "\thas at least one member called 1, 2, etc.");
      out.println();

      for (int i = 1; i <= numDequeueFromARound2 + numDequeueFromBRound2; ++i) {
         millisecondsCRound2 = getRandomNumberMilliseconds();
         out.println(i + ".)  Person " + q.poll() + " Dequeing: "
                      + millisecondsCRound2 + " (milliseconds).");
         sumQueueCsMillisecoundsRound2 += millisecondsCRound2;
      }
      out.println();
      out.println("Checker-C's Total Time (milliseconds) for Round2 Dequeue: "
                  + sumQueueCsMillisecoundsRound2);

      queueCRound2Secs =
               (int) Math.round((double) sumQueueCsMillisecoundsRound2 / 1000);
      out.println("Checker-C's Total Time (seconds) for Round 2 Dequeue: "
                  + queueCRound2Secs);
      queueCRound2Mins =
               (int) Math.round((double) queueCRound2Secs / 60);
      out.println("Checker-C's Total Time (minutes) for Round 2 Dequeue: "
                  + queueCRound2Mins);
      out.println();
      out.println("QueueC is Now Empty with Size: " + q.size());
      out.println("TIME TO TAKE OFF!!! HAVE A NICE FLIGHT!");
      out.println();
      out.println("Thank you for choosing Southwest Airlines where:\n\n"
               + "OUR MISSION is to provide the highest quality of customer\n"
               + "service delivered with a sense of warmth, friendliness,\n"
               + "individual pride, and company spirit.");
      out.println();
   }


   public static int getRandomNumberMilliseconds() {
      Random rand = new Random();
      int checkersTime = rand.nextInt(60000);
      return checkersTime;
   }

   public static void main(String [] args) {

      AirlineQueue time = new AirlineQueue();
      int NUM_PEOPLE = 50;

      char response;
      int checkersTime = 0;

      int numPeopleIntiallyInA = 0;
      int numPeopleInitiallyInB = 0;
      int numPeopleInitiallyInC = 0;

      PriorityQueue<Integer> queueA = new PriorityQueue<Integer>();
      PriorityQueue<Integer> queueB = new PriorityQueue<Integer>();
      PriorityQueue<Integer> queueC = new PriorityQueue<Integer>();

      Scanner keyboard = new Scanner(System.in);

      do {
         out.println();
         out.println();

         time.printWelcome();

         out.print("How many people are initially in QueueA? ");
         numPeopleIntiallyInA = keyboard.nextInt();

         out.print("How many people are initially in QueueB? ");
         numPeopleInitiallyInB = keyboard.nextInt();

         out.print("How many people are initially in QueueC? ");
         numPeopleInitiallyInC = keyboard.nextInt();

         PriorityQueue<Integer> QueueA = time.populateQueueA(queueA,
                                                         numPeopleIntiallyInA);
         PriorityQueue<Integer> QueueB = time.populateQueueA(queueB,
                                                         numPeopleInitiallyInB);
         PriorityQueue<Integer> QueueC = time.populateQueueA(queueC,
                                                         numPeopleInitiallyInC);
         out.println();

         time.printInitialSizeA(QueueA);
         time.printInitialSizeB(QueueB);
         time.printInitialSizeC(QueueC);

         time.printInitialDequeueOfQueuesAandB();

         int numPeopleWithoutInitialQueueC = NUM_PEOPLE - numPeopleInitiallyInC;

         out.print("How many people would you like to dequeue from QueueA "
                     + "(people <= " + numPeopleIntiallyInA + ")? ");
         int numDequeueFromARound1 = keyboard.nextInt();
         time.initialDequeueA(QueueA, numDequeueFromARound1);

         out.print("How many people would you like to dequeue from QueueB "
                     + "(people <= " + numPeopleInitiallyInB+ ")? ");

         int numDequeueFromBRound1 = keyboard.nextInt();
         time.initialDequeueB(QueueB, numDequeueFromBRound1);

         time.printPostDequeueStats();

         time.printPostInitialDequeueSizeA(QueueA);
         time.printPostInitialDequeueSizeB(QueueB);
         time.printPostInitialDequeueSizeC(QueueC, numDequeueFromARound1,
                                                         numDequeueFromBRound1);
         time.pollingQueueCRound1(QueueC, numPeopleInitiallyInC,
                                  numDequeueFromARound1, numDequeueFromBRound1);

         time.printRound2DequeueOfQueuesAandB();

         int round2DequeueAOptions =
                                   numPeopleIntiallyInA - numDequeueFromARound1;

         out.print("How many people would you like to dequeue from QueueA "
                + "(people <= " + round2DequeueAOptions + ")? ");
         int numDequeueFromARound2 = keyboard.nextInt();
         time.secondDequeueA(QueueA, numDequeueFromARound2);

         int round2DequeueBOptions =
                                  numPeopleInitiallyInB - numDequeueFromBRound1;

         out.print("How many people would you like to dequeue from QueueB "
                     + "(people <= " + round2DequeueBOptions + ")? ");
         int numDequeueFromBRound2 = keyboard.nextInt();
         time.secondDequeueB(QueueB, numDequeueFromBRound2);

         time.printPostRound2DequeueStats();

         time.printPostRound2DequeueSizeA(QueueA);
         time.printPostRound2DequeueSizeB(QueueB);
         time.printPostRound2DequeueSizeC(QueueC, numDequeueFromARound2,
                                                         numDequeueFromBRound2);

         time.pollingQueueCRound2(QueueC, numDequeueFromARound2,
                                                         numDequeueFromBRound2);

         response = time.wantToQueueAnotherFlight();

      } while (response == 'Y' || response == 'y');
   }
}
