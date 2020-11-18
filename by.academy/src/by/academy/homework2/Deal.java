package by.academy.homework2;

import java.util.Scanner;

public class Deal {
	
	public static void main(String[] args) {
		 
		// Èíèöèàëèçàöèÿ ïåðåìåííûõ
				int cardsPerPlayer = 5;
				int players =0 ;       
		 
				String[] suits = {
						"Ïèê", "Áóáåí", "×åðâ", "Òðåô"
				};
		 
				String[] rank = {
						"2", "3", "4", "5", "6", "7", "8", "9", "10",
						"Âàëåò", "Êîðîëåâà", "Êîðîëü", "Òóç"
				};
		 
		// Êîëè÷åñòâî êàðò
				int n = suits.length * rank.length; 
		 
		 
		// Ââîä ñ êîíñîëè 
				for(;;){
					Scanner sc = new Scanner(System.in);
					System.out.println("Ââåäèòå êîëè÷åñòâî èãðîêîâ: ");   
		 
					if(sc.hasNextInt()){
		 
						players = sc.nextInt();
						if(cardsPerPlayer * players <= n){
							break;
						} else { 
							if (players <= 0){
		 
								System.out.println("Èãðîêè îòñóòñòâóþò.");
								break;
		 
							} else if (players > n / 5){
								
								System.out.println("Çà ñòîëîì íåò ìåñòà òàêîìó êîëè÷åñòâó èãðîêîâ");
							
							} 
						}     	
		 
					} 
				}
		 
		 
		//Èíèöèàëèçàöèÿ êîëîäû
				String[] deck = new String[n];
				for (int i = 0; i < rank.length; i++) {
					for (int j = 0; j < suits.length; j++) {
						deck[suits.length*i + j] = rank[i] + " " + suits[j];
					}
				}
		 
		//Ïåðåòàñîâêà êîëîäû
				for (int i = 0; i < n; i++) {
					int r = i + (int) (Math.random() * (n-i)); // ñëó÷àéíàÿ êàðòà â êîëîäå
					String temp = deck[r];
					deck[r] = deck[i];
					deck[i] = temp;
				}
		 
		//Ïåðåòàñîâàííàÿ êîëîäà âûâîäèòñÿ íà ýêðàí
				for (int i = 0; i < players * cardsPerPlayer; i++) {
					System.out.println(deck[i]);
					if (i % cardsPerPlayer == cardsPerPlayer - 1)
						System.out.println();
				}
			}
		}

