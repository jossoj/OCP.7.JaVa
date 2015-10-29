package com.chema.linkedlist;

import java.util.Queue;

class Person {
		private String name;
		public Person (String name) {
			this.name = name;			
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() 
		{
			return name;
		}
		
	}
	
	class LinkedList {
		public void helpPeople(Queue people, Queue helped){
			do {
				Person p = (Person) people.poll();
				System.out.println("Helped : " + p + " ");
				helped.offer(p.getName());
			} while (!people.isEmpty());
		}
		//
		public static void main (String[] args) {
			Queue<Person> q = (Queue<Person>) new LinkedList();
			q.offer(new Person("Juan"));
			q.offer(new Person("Pepe"));
			Queue<Person> helpedQ = (Queue<Person>) new LinkedList();
			LinkedList h = new LinkedList();
			h.helpPeople(q, helpedQ);
		}
		
	}
	
	
	
	


