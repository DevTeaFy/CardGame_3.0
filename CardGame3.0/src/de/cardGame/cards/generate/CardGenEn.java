package de.cardGame.cards.generate;

import java.util.Random;

import de.cardGame.cards.Card;
import de.cardGame.gui.ProgressBarGUI;
import de.cardGame.main.CardGame;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class CardGenEn{
    public static void generateCards(boolean animation) {
		Card.German = false;
        String[] text = new String[74];
        String[] selectA = new String[74];
        String[] selectB = new String[74];
        String[] selectC = new String[74];
		String[] AudioFilePath = new String[74];
        int[] nextA = new int[74];
        int[] nextB = new int[74];
        int[] nextC = new int[74];
        boolean[] IsOver = new boolean[74];
        boolean[] isBlank = new boolean[74];
        boolean[] isSonder = new boolean[74];
        
        for(int i=0; i < 74; i++) {
            isSonder[i] = false;
            IsOver[i] = false;
            isBlank[i] = false;
        }
        
        //Card 0
        text[0] = "You were living in a small flat in your town, and you had a poorly paid and boring job. You went for a few job interviews, and you were successful in all of them. You had the choice between:";
        selectA[0] = "a) a sales position for a computer company. There was no retainer but it offered a 50% commission on anything you sold, plus a car.";
        selectB[0] = "b) a poorly paid but rewarding job helping people.";
        selectC[0] = "c) a job with average pay that required you to leave your town.";
        nextA[0] = 1;
        nextB[0] = 2;
        nextC[0] = 3;
		AudioFilePath[0] = "Audio/Card_0/En_en/";
        
        //Card 1
        text[1] = "You chose the sales position. In the first few months, you were very successful and sold a lot of computers, making three times the amount of money you used to. Then business was quiet. You decided to";
        selectA[1] = "a) invest the money you had saved in your own small company.";
        selectB[1] = "b) live off your savings until business is good again.";
        selectC[1] = "c) get a new job.";
        nextA[1] = 4;
        nextB[1] = 5;
        nextC[1] = 6;
		AudioFilePath[1] = "Audio/Card_1/En_en/";
        
        //Card 2
        text[2] = "You chose the job helping people. You really enjoyed it, and while it did not pay very well at first, you were quickly promoted and earned a lot of money. You decided that you wanted a place to live. You decided to buy";
        selectA[2] = "a) a modern flat that was very expensive.";
        selectB[2] = "b) an older style flat that was quite cheap.";
        selectC[2] = "c) a house that was reasonable and nice but a long way from where you work.";
        nextA[2] = 7;
        nextB[2] = 8;
        nextC[2] = 9;
		AudioFilePath[2] = "Audio/Card_2/En_en/";
        
        //Card 3
        text[3] = "You chose to leave town. When you arrived in the new city on the first day, somebody mugged you and stole all your belongings. You went to the police but they could not help you. You decided to";
        selectA[3] = "a) return home.";
        selectB[3] = "b) stay living where you were with your new job.";
        selectC[3] = "c) get a second job to get back all the things you lost when you were mugged.";
        nextA[3] = 10;
        nextB[3] = 11;
        nextC[3] = 12;
		AudioFilePath[3] = "Audio/Card_3/En_en/";
       
        //Card 4
        text[4] = "You invested your money in a small company - but the company went broke! You lost all your money and had to find another way to make some money. You got another job but it was really boring, and again not well paid. You decided to";
        selectA[4] = "a) move to another town and hope that you would find more work.";
        selectB[4] = "b) study to improve your chances.";
        selectC[4] = "c) borrow money and start another company.";
        nextA[4] = 13;
        nextB[4] = 14;
        nextC[4] = 15;
		AudioFilePath[4] = "Audio/Card_4/En_en/";

        //Card 5
        text[5] = "You decided to live off your savings until business improved again. Eventually it did, and once again you made a lot of money. Now you wanted to spend some of it so you";
        selectA[5] = "a) bought a boat.";
        selectB[5] = "b) bought a car.";
        selectC[5] = "c) bought some expensive jewellery.";
        nextA[5] = 16;
        nextB[5] = 17;
        nextC[5] = 18;
		AudioFilePath[5] = "Audio/Card_5/En_en/";

        //Card 6
        text[6] = "You decided to get a new job. It was a good idea - you really enjoyed the new work and made a lot of friends in your new work place. One day one of your new friends asked you to lend them a rather large sum of money. You decided to";
        selectA[6] = "a) refuse to lend them the money.";
        selectB[6] = "b) lend them the money.";
        selectC[6] = "c) promise to lend them the money but keep avoiding them.";
        nextA[6] = 19;
        nextB[6] = 20;
        nextC[6] = 21;
		AudioFilePath[6] = "Audio/Card_6/En_en/";

        //Card 7
        text[7] = "You chose a modern flat that was quite expensive. Unfortunately, you injured yourself and had to take some time off work, so you were unable to keep up the payments on your flat and you had to sell it. A really nice man/woman came to see the flat and you got along very well. The next day they rang and you arranged to meet somewhere. You decided to meet them at";
        selectA[7] = "a) a restaurant.";
        selectB[7] = "b) a café.";
        selectC[7] = "c) a cinema.";
        nextA[7] = 22;
        nextB[7] = 23;
        nextC[7] = 24;
		AudioFilePath[7] = "Audio/Card_7/En_en/";

        //Card 8
        text[8] = "You moved into the older flat and enjoyed living there. A man/woman in the same block started talking to you. You thought that they were nice and became interested in them. You started going out together and you were both happy. Then one day this man/woman told you that he/she had to leave town and would be away for about a year. You decided to";
        selectA[8] = "a) end the relationship.";
        selectB[8] = "b) wait for them for a year.";
        selectC[8] = "c) go away with them, leaving your job and not knowing if you could get another one.";
        nextA[8] = 25;
        nextB[8] = 26;
        nextC[8] = 27;
		AudioFilePath[8] = "Audio/Card_8/En_en/";

        //Card 9
        text[9] = "You chose the nice, reasonable but far-away place. You found that although you liked living there, it took nearly three hours a day to travel to and from work, and you were often late. Because of this, you lost your job. You decided to";
        selectA[9] = "a) look for another job around where you lived, even though there was very little work there.";
        selectB[9] = "b) sell your home even though you had just moved there.";
        selectC[9] = "c) rent your home to someone else and move closer to the city where you could more easily find work.";
        nextA[9] = 28;
        nextB[9] = 29;
        nextC[9] = 30;
		AudioFilePath[9] = "Audio/Card_9/En_en/";

        //Card 10
        text[10] = "You returned home, and this time, you were lucky - you found a new job, AND you fell in love with a wonderful person! You went to meet this person's family, as you wanted to marry them. However, the family did not like you at all. You decided to";
        selectA[10] = "a) get married anyway.";
        selectB[10] = "b) elope.";
        selectC[10] = "c) get married, but convince your partner that you should both move away from your town.";
        nextA[10] = 31;
        nextB[10] = 32;
        nextC[10] = 33;
		AudioFilePath[10] = "Audio/Card_10/En_en/";

        //Card 11
        text[11] = "You decided to stay in town and stay in your job. You did not know anyone so it was difficult, because you had no money and you needed to borrow some. You decided to";
        selectA[11] = "a) ask your new boss to lend you some money.";
        selectB[11] = "b) ask a colleague to lend you some money.";
        selectC[11] = "c) take a small amount of money from work but pay it back when you got paid.";
        nextA[11] = 34;
        nextB[11] = 35;
        nextC[11] = 36;
		AudioFilePath[11] = "Audio/Card_11/En_en/";
        
        //Card 12
        text[12] = "You decided to get a second job to make some more money. The second job was in a restaurant so at least you could eat there until you got paid. You made friends with another waiter. One night the waiter asked you to help him steal some money from the till. You decided to";
        selectA[12] = "a) refuse to help him but not say anything.";
        selectB[12] = "b) refuse to help him and tell the boss.";
        selectC[12] = "c) help him - you could do with the money, and then you could quit this job.";
        nextA[12] = 37;
        nextB[12] = 38;
        nextC[12] = 39;
		AudioFilePath[12] = "Audio/Card_12/En_en/";

        //Card 13
        text[13] = "You moved to a large town where you immediately found a job and a good place to live. In the first week at your new job, you met a really nice man/woman whom you really liked. However, you were not sure if they were interested in you. You decided to";
        selectA[13] = "a) ask them on a date.";
        selectB[13] = "b) wait until they asked you on a date.";
        selectC[13] = "c) do nothing - you have just moved to this town and you are too busy to have any romance in your life.";
        nextA[13] = 40;
        nextB[13] = 41;
        nextC[13] = 42;
		AudioFilePath[13] = "Audio/Card_13/En_en/";

        //Card 14
        text[14] = "You chose to study to improve your chances. You enrolled in night school. There you met someone very special and you fell in love with her/him. However, within two months, they broke up with you and started going out with someone else in the course! You were heartbroken and angry. You decided to";
        selectA[14] = "a) leave the course.";
        selectB[14] = "b) stay in the course and do nothing.";
        selectC[14] = "c) find a way to get revenge on your ex-boyfriend/girlfriend.";
        nextA[14] = 43;
        nextB[14] = 44;
        nextC[14] = 45;
		AudioFilePath[14] = "Audio/Card_14/En_en/";

        //Card 15
        text[15] = "You borrowed the money - but then a recession hit and your business failed! You were in a lot of trouble. You decided to";
        selectA[15] = "a) declare bankruptcy.";
        selectB[15] = "b) work two jobs and try to pay back the money somehow.";
        selectC[15] = "c) burn your house down and collect the insurance money to pay back your debt.";
        nextA[15] = 46;
        nextB[15] = 47;
        nextC[15] = 48;
		AudioFilePath[15] = "Audio/Card_15/En_en/";

        //Card 16
        text[16] = "You bought a boat. You were very excited about it, and took three friends out on this boat for a small party. However, a storm broke out and a freak wave knocked the boat over. Your friend was injured and too weak to go and get help. You decided to";
        selectA[16] = "a) swim for help alone.";
        selectB[16] = "b) swim for help and take your friend with you.";
        selectC[16] = "c) stay with your friend and wait for help.";
        nextA[16] = 49;
        nextB[16] = 50;
        nextC[16] = 51;
		AudioFilePath[16] = "Audio/Card_16/En_en/";

        //Card 17
        text[17] = "You decided to buy an expensive car. Unfortunately, a week after buying it, someone stole it and you did not have insurance on it. You were very annoyed and depressed, and started to try win your money back through gambling. You went to a casino and put your remaining savings (about $5000) on";
        selectA[17] = "a) red.";
        selectB[17] = "b) black.";
        selectC[17] = "c) number 7.";
        nextA[17] = 52;
        nextB[17] = 53;
        nextC[17] = 54;
		AudioFilePath[17] = "Audio/Card_17/En_en/";

        //Card 18
        text[18] = "You bought some fairly expensive jewellery. A few months later you went to have it valued for insurance reasons, and found out that the jewellery you had bought was collectable - worth at least five times more than what you had paid for it! You decided to";
        selectA[18] = "a) sell it.";
        selectB[18] = "b) keep it locked in a safe.";
        selectC[18] = "c) wear it or give it to someone to wear.";
        nextA[18] = 58;
        nextB[18] = 59;
        nextC[18] = 60;
		AudioFilePath[18] = "Audio/Card_18/En_en/";

        //Card 19
        text[19] = "You refused to lend them the money, which was a good thing because the next week they left town after stealing a lot of money from work! You stayed on and received a promotion in your job and did extremely well. However, a family member in your home town got very ill, so you returned to take care of them. When you went home, you decided to buy a flat.";
        nextA[19] = 7;
        isBlank[19] = true;
		AudioFilePath[19] = "Audio/Card_19/En_en/";

        //Card 20
        text[20] = "You decided to lend them the money. Sadly for you, they left town the next week and you never saw the money again. You were now without any savings. One day you got into a taxi and found a wallet with a large sum of money in it on the back seat. You decide to";
        selectA[20] = "a) return the wallet, including the money, to the owner.";
        selectB[20] = "b) keep the money but give the wallet to the cab driver.";
        selectC[20] = "c) keep the money and throw away the wallet.";
        nextA[20] = 61;
        nextB[20] = 62;
        nextC[20] = 63;
		AudioFilePath[20] = "Audio/Card_20/En_en/";

        //Card 21
        text[21] = "You promised to lend your colleague the money but kept avoiding them. Eventually, they stopped asking you for the money, but then they spread some terrible lies around the office about you. You were terribly unhappy at work. You decide to";
        selectA[21] = "a) try to get your colleague fired.";
        selectB[21] = "b) leave the job.";
        selectC[21] = "c) lend your colleague the money after all.";
        nextA[21] = 64;
        nextB[21] = 65;
        nextC[21] = 20;
		AudioFilePath[21] = "Audio/Card_21/En_en/";
        
        //Card 22
        text[22] = "You chose to meet your date at a restaurant. You had a lovely dinner together and you really enjoyed each other's company. However, at the end of dinner, when it was time to pay the bill, you realized, that you did not have enough money to pay for the meal, so you decide to";
        selectA[22] = "a) try to leave the restaurant without paying.";
        selectB[22] = "b) ask your partner to pay for the meal.";
        selectC[22] = "c) tell the restaurant the truth and offer to work to pay for the meal.";
        nextA[22] = 67;
        nextB[22] = 68;
        nextC[22] = 69;
		AudioFilePath[22] = "Audio/Card_22/En_en/";

        //Card 23
        text[23] = "You chose to meet your date in a café. You waited there for two hours but they never showed up. You felt really disappointed. The next day you sold your place to another person and used the money that you gained to invest in a small company.";
        nextA[23] = 4;
        isBlank[23] = true;
		AudioFilePath[23] = "Audio/Card_23/En_en/";
        
        //Card 24
        text[24] = "You chose to meet your date at a cinema. While you were watching the movie, the people in front of you would not stop talking and laughing. You had an argument with them, and the usherette in the cinema asked you all to leave the cinema. Your date left angrily and you were left alone in the street. You got into a taxi to go home when you discovered a wallet full of a large amount of money.";
        nextA[24] = 63;
        isBlank[24] = true;
		AudioFilePath[24] = "Audio/Card_24/En_en/";

        //Card 25
        text[25] = "You decided to end the relationship. However, after a few months, you missed your boyfriend/girlfriend so much that you rang them and asked them to reconsider. They told you that they had just met someone else. You were heartbroken, and decided to move to another city.";
        nextA[25] = 3;
        isBlank[25] = true;
		AudioFilePath[25] = "Audio/Card_25/En_en/";
        
        //Card 26
        text[26] = "You decided to wait for another year. You were lonely and missed your partner, but you felt that you had made the right decision. However, two months before your partner was due to return home, they wrote to you to tell you that they had met someone else and were going to be married. You were so disappointed that you decided to move to another city.";
        nextA[26] = 3;
        isBlank[26] = true;
		AudioFilePath[26] = "Audio/Card_26/En_en/";

        //Card 27
        text[27] = "You decided to go away with them, leaving your job and not knowing if you could get another one. You took a big gamble...and it paid off. You found a fantastic job, and you got the opportunity to travel with this job! Your boss wanted you to work in one of the offices in a foreign location. You chose to spend three months working in";
        selectA[27] = "a) a hot tropical island.";
        selectB[27] = "b) a big, exciting city.";
        selectC[27] = "c) some beautiful snow-covered mountains.";
        nextA[27] = 55;
        nextB[27] = 56;
        nextC[27] = 57;
		AudioFilePath[27] = "Audio/Card_27/En_en/";

        //Card 28
        text[28] = "You looked for another job around where you lived, even though there was very little work there. You could not find a job, and you ended up very broke. You were forced to return to your home town to start again.";
        nextA[28] = 0;
        isBlank[28] = true;
		AudioFilePath[28] = "Audio/Card_28/En_en/";
        
        //Card 29
        text[29] = "You decided to sell your home, even though you had just moved there. You made a big profit on the sale, and bought a small house back in your home town. You decided to start your own business.";
        nextA[29] = 4;
        isBlank[29] = true;
		AudioFilePath[29] = "Audio/Card_29/En_en/";

        //Card 30
        text[30] = "You decided to rent your home to someone else and move closer to the city where you could more easily find work. The value of houses increased in the area where your house was, and you managed to rent a very cheap flat to live in. You made a lot of money and bought some more property.";
        nextA[30] = 66;
        isBlank[30] = true;
		AudioFilePath[30] = "Audio/Card_30/En_en/";

        //Card 31
        text[31] = "You decided to get married anyway. However, after a short time your new partner’s family was making your life hell. To make matters worse, your partner decided that they wanted their family to move in with you both. The family moved in – and you moved out. Your marriage ended and you were very sad. You decided to move to a new town and start again.";
        nextA[31] = 13;
        isBlank[31] = true;
		AudioFilePath[31] = "Audio/Card_31/En_en/";
        
        //Card 32
        text[32] = "You chose to elope. What a great idea that was! You married and were very happy living in a town far away. You decided to borrow money to invest in a small business.";
        nextA[32] = 15;
	    isBlank[32] = true;
		AudioFilePath[32] = "Audio/Card_32/En_en/";
        
        //Card 33
        text[33] = "You decided to convince your partner to get married, but to move away from their home town. Your partner agreed. You decided to move to";
        selectA[33] = "a) a tropical climate near the ocean.";
        selectB[33] = "b) some beautiful snow-covered mountains.";
        selectC[33] = "";
        nextA[33] = 55;
        nextB[33] = 57;
        isSonder[33] = true;
		AudioFilePath[33] = "Audio/Card_33/En_en/";

        //Card 34
        text[34] = "You chose to ask your boss for some money. The boss was not very happy to do this, but grudgingly agreed if you promised to work overtime. You did, and the boss soon trusted you and promoted you in your job. However, you found that the promotion meant extra work and you were coming home exhausted every night. You decided to go back to your home town and invest the overtime money you had earned in a small business of your own.";
        nextA[34] = 4;
        isBlank[34] = true;
		AudioFilePath[34] = "Audio/Card_34/En_en/";
        
        //Card 35
        text[35] = "You chose to ask your colleague to give you some money, but they refused. Because you had to wait for a month to get paid, you did not know what to do, so you were forced to steal some food from a shop one night in order to survive. Unfortunately, you were caught and sent to prison for a few days. When you were released, you went back to your home town for a new start.";
        nextA[35] = 0;
        isBlank[35] = true;
		AudioFilePath[35] = "Audio/Card_35/En_en/";
        
        //Card 36
        text[36] = "You chose to take a small amount of money and managed to pay it back later. However, you became more and more dishonest because it was easy to steal from your company. Finally, you were caught stealing and got fired.";
        nextA[36] = 28;
        isBlank[36] = true;
		AudioFilePath[36] = "Audio/Card_36/En_en/";
        
        //Card 37
        text[37] = "You chose to refuse to help the waiter. That night, the boss noticed that some money was missing, and searched everyone's bags. The money was found in your bag and you lost your job. You knew that the other waiter planted the money in your bag, but no one believed you. You were forced to return to your home town.";
        nextA[37] = 0;
        isBlank[37] = true;
		AudioFilePath[37] = "Audio/Card_37/En_en/";
        
        //Card 38
        text[38] = "You chose to refuse to help and you told your boss. Your boss was very happy and your colleague was fired, but you were promoted! You made lots of money that year and decided to buy a new expensive car.";
        nextA[38] = 17;
        isBlank[38] = true;
		AudioFilePath[38] = "Audio/Card_38/En_en/";
		
        //Card 39
        text[39] = "You chose to help him and then quit the job. You kept the money, invested it and it grew over time.";
        nextA[39] = 66;
        isBlank[39] = true;
		AudioFilePath[39] = "Audio/Card_39/En_en/";
        
        //Card 40
        text[40] = "You chose to ask them on a date, but unfortunately, they were married. They thought this was a great joke and they told everyone in the office. After that, you felt quite uncomfortable in your new job and decided to borrow some money and invest in a company.";
        nextA[40] = 15;
        isBlank[40] = true;
		AudioFilePath[40] = "Audio/Card_40/En_en/";
        
        //Card 41
        text[41] = "You chose to wait until they asked you on a date. They did, and you accepted. Then later, after you had been going out with this person for a month you found out that they were married! You were heartbroken and angry, and you decided to return to your home town and start again.";
        nextA[41] = 0;
        isBlank[41] = true;
		AudioFilePath[41] = "Audio/Card_41/En_en/";

        //Card 42
        text[42] = "You chose to do nothing, which was good, because later you found out that they were married. In a few months, you met someone else. You both liked each other and this time you asked them to go on a date with you. As you invited them, you offered to pay, but when you finished dinner, you realised that you had forgotten your wallet. You were very embarrassed, but you decided to tell the restaurant that you had forgotten your money.";
        nextA[42] = 69;
        isBlank[42] = true;
		AudioFilePath[42] = "Audio/Card_42/En_en/";

        //Card 43
        text[43] = "You chose to leave the course. You felt very depressed and started gambling. You took all your savings to the casino, went to the blackjack table and put all your money on 'black'.";
        nextA[43] = 53;
        isBlank[43] = true;
		AudioFilePath[43] = "Audio/Card_43/En_en/";

        //Card 44
        text[44] = "You chose to stay in the course and do nothing. Three weeks later you met someone else! You asked them to go on a date with you and they said yes.";
        nextA[44] = 22;
        isBlank[44] = true;
		AudioFilePath[44] = "Audio/Card_44/En_en/";

        //Card 45
        text[45] = "You chose to find a way to get revenge on your ex-boyfriend/girlfriend. You decide to";
        selectA[45] = "a) damage their car by scraping the paint off the side of the door.";
        selectB[45] = "b) spread rumours about them.";
        selectC[45] = "c) change your mind at the last minute and not do anything.";
        nextA[45] = 70;
        nextB[45] = 71;
        nextC[45] = 73;
		AudioFilePath[45] = "Audio/Card_45/En_en/";
        
        //Card 46
        text[46] = "You chose to declare bankruptcy.";
        nextA[46] = 0;
        isBlank[46] = true;
		AudioFilePath[46] = "Audio/Card_46/En_en/";
        
        //Card 47
        text[47] = "You chose to work two jobs and pay the money back. You were successful, and soon you had a lot of money in the bank. In your second job, you met a person who you really liked, and you decided to ask them on a date. They agreed to come.";
        nextA[47] = 24;
        isBlank[47] = true;
		AudioFilePath[47] = "Audio/Card_47/En_en/";

        //Card 48
        text[48] = "You chose to burn your house down and collect the insurance money to pay back your debt. Unfortunately for you, you were caught.";
        nextA[48] = 70;
        isBlank[48] = true;
		AudioFilePath[48] = "Audio/Card_48/En_en/";

        //Card 49
        text[49] = "You chose to swim for help alone. You made it to land, and you sent back help for your friend. You got some insurance money for your boat and you decided to go on a holiday after that stressful situation.";
        nextA[49] = 57;
        isBlank[49] = true;
		AudioFilePath[49] = "Audio/Card_49/En_en/";

        //Card 50
        text[50] = "You chose to swim for help with your friend. You were very lucky, as a fishing boat saw you both in the water and pulled you out. You returned to land very grateful, but now you had lost most of your money as you had no insurance. You decided to try gambling to win the money back. You went to the casino and put all your money on 'red' in blackjack.";
        nextA[50] = 52;
        isBlank[50] = true;
		AudioFilePath[50] = "Audio/Card_50/En_en/";
		
        //Card 51
        text[51] = "You chose to wait for help. Unfortunalety no one came, and both you and your friend drowned.";
        IsOver[51] = true;
		AudioFilePath[51] = "Audio/Card_51/En_en/";

        //Card 52
        text[52] = "You chose red. You lost all your money! You were forced to return to your old job in your home town.";
        nextA[52] = 0;
        isBlank[52] = true;
		AudioFilePath[52] = "Audio/Card_52/En_en/";

        //Card 53
        text[53] = "You chose black - and doubled your money! You decided to gamble once again, and again doubled your money, and so on until you had a great deal of money. You then decided to buy a boat.";
        nextA[53] = 16;
        isBlank[53] = true;
		AudioFilePath[53] = "Audio/Card_53/En_en/";
        
        //Card 54
        text[54] = "You chose to put your money on number 7 and lost it all. However, you learned your lesson and never gambled again. You decided instead to get a job at the casino as a croupier. You went to work at a casino in the snow.";
        nextA[54] = 57;
        isBlank[54] = true;
		AudioFilePath[54] = "Audio/Card_54/En_en/";

        //Card 55
        text[55] = "You chose the tropical island. The first month was wonderful, but then you got bitten by a mosquito and got a serious illness. You had to go to hospital for six months, and you lost your job. You decided to return to your home town to rest for another year, as you were still very ill.";
        nextA[55] = 0;
        isBlank[55] = true;
		AudioFilePath[55] = "Audio/Card_55/En_en/";

        //Card 56
        text[56] = "You chose to go to an exciting big city. It was a great choice, as you really enjoyed the lifestyle and fun. One evening, you went out to a nightclub. You met a great person, fell in love and decided not to return home again.";
        nextA[56] = 73;
        isBlank[56] = true;
		AudioFilePath[56] = "Audio/Card_56/En_en/";

        //Card 57
        text[57] = "You went to the mountains. You had a wonderful time there, but one day you went skiing, fell over and broke your leg. You had not taken out insurance, so you lost all your money on medical fees! You were forced to return to your home town.";
        nextA[57] = 0;
        isBlank[57] = true;
		AudioFilePath[57] = "Audio/Card_57/En_en/";

        //Card 58
        text[58] = "You chose to sell it. You made a large profit and decided to go into business selling jewellery. You were extremely talented at it and did very well. You decided to invest in a boat.";
        nextA[58] = 16;
        isBlank[58] = true;
		AudioFilePath[58] = "Audio/Card_58/En_en/";

        //Card 59
        text[59] = "You chose to keep it locked in a safe. Sadly for you, thieves broke into your house and stole it not long after that. You were again without much money. You decided to go back to study to increase your chances.";
        nextA[59] = 14;
        IsOver[59] = false;
        isBlank[59] = true;
		AudioFilePath[59] = "Audio/Card_59/En_en/";
        
        //Card 60
        text[60] = "You chose to wear it or to give it to someone else to wear. Unfortunately, the jewellery you bought was stolen jewellery. You were charged with receiving stolen goods.";
        nextA[60] = 70;
        isBlank[60] = true;
		AudioFilePath[60] = "Audio/Card_60/En_en/";

        //Card 61
        text[61] = "You chose to return the wallet, including the money, to the owner. The owner, an old lady, gave you a small reward as the money in her wallet was her life savings. The reward was very small but it was all she could afford.";
        nextA[61] = 72;
        isBlank[61] = true;
		AudioFilePath[61] = "Audio/Card_61/En_en/";
        
        //Card 62
        text[62] = "You chose to keep the money but you gave the wallet back to the cab driver. Unfortunately, the cab driver saw you taking the money out of the wallet in his rear vision mirror.";
        nextA[62] = 70;
        isBlank[62] = true;
		AudioFilePath[62] = "Audio/Card_62/En_en/";

        //Card 63
        text[63] = "You chose to keep the money and throw away the wallet. You decided to put the money in a safe.";
        nextA[63] = 59;
        isBlank[63] = true;
		AudioFilePath[63] = "Audio/Card_63/En_en/";

        //Card 64
        text[64] = "You chose to get your colleague fired by telling your boss. Your boss rewarded you for your action by sending you on a holiday. You decided to go to";
        selectA[64] = "a) a tropical island.";
        selectB[64] = "b) a big exciting city.";
        selectC[64] = "c) some beautiful snow-covered mountains.";
        nextA[64] = 55;
        nextB[64] = 56;
        nextC[64] = 57;
		AudioFilePath[64] = "Audio/Card_64/En_en/";

        //Card 65
        text[65] = "You chose to leave the job. It really was the right choice, even though your next job did not pay as well. Your new job was much more interesting and the people you worked with were great.";
        nextA[65] = 72;
        isBlank[65] = true;
		AudioFilePath[65] = "Audio/Card_65/En_en/";

        //Card 66
        text[66] = "You continued to make more and more money. Soon, you became obsessed with becoming rich. You eventually achieved this goal. Sadly, you found that money did not buy you happiness, and although you had everything you needed, you lived a lonely life.";
        IsOver[66] = true;
		AudioFilePath[66] = "Audio/Card_66/En_en/";

        //Card 67
        text[67] = "You chose to try to leave the restaurant without paying. You told your partner to wait outside for you and you would only be a minute. However, the restaurant manager caught you as you were trying to leave the restaurant and called the police. You were arrested and had to spend a night in jail. The next day you sold your flat, packed your bags and returned home to your original job.";
        nextA[67] = 0;
        isBlank[67] = true;
		AudioFilePath[67] = "Audio/Card_67/En_en/";
	
        //Card 68
        text[68] = "You chose to ask your partner to pay for the meal. They did, but they were not happy about it.  They did not want to see you again. You felt depressed about this and all your other problems, so you returned home again to your original job.";
        nextA[68] = 0;
        isBlank[68] = true;
		AudioFilePath[68] = "Audio/Card_68/En_en/";

        //Card 69
        text[69] = "You chose to tell the restaurant that you had no money. You stayed behind and worked, and the owner of the restaurant was so impressed with you that you got a full-time job there. Eventually, you learned to be a chef and received many awards for it. You ended up marrying the owner of the restaurant and living happily ever after!";
        IsOver[69] = true;
		AudioFilePath[69] = "Audio/Card_69/En_en/";

        //Card 70
        text[70] = "You were sent to jail for a few months. When you came out you had lost everything, and you decided to return to your home town.";
        nextA[70] = 0;
        isBlank[70] = true;
		AudioFilePath[70] = "Audio/Card_70/En_en/";

        //Card 71
        text[71] = "You choose to spreed rumours about your ex-partner. Everyone believed them, and they were asked to leave the company eventually. You met someone new a few months later and invited them to a restaurant for a romantic dinner. You offered to pay.";
        nextA[71] = 22;
        isBlank[71] = true;
		AudioFilePath[71] = "Audio/Card_71/En_en/";

        //Card 72
        text[72] = "You felt good about your behaviour and felt that you were growing up becoming a mature, responsible person. Your life improved and you made a lot of friends. Eventually you fell in love with a wonderful person who you married and had a family with, and you lived happily ever after together!";
        IsOver[72] = true;
		AudioFilePath[72] = "Audio/Card_72/En_en/";

        //Card 73
        text[73] = "You stayed together with this new love of your life. Not long after, your new love inherited a fortune, and you spent the rest of your lives travelling around the world and having a lot of fun together!";
        IsOver[73] = true;
		AudioFilePath[73] = "Audio/Card_73/En_en/";
		if(animation) {
//		ProgressBarGUI ProgressBarGUI = new ProgressBarGUI(Words.get(WordTypes.LoadCardsTitel), 74);
//        CardGame.cards.clear();
//        
//        for(int i=0; i < 74; i++) {
//            if(isSonder[i] == true){
//            	CardGame.cards.add(new Card(text[i], selectA[i], selectB[i], nextA[i], nextB[i], true,AudioFilePath[i]));
//            } else if(IsOver[i] == false && isBlank[i] == false) {
//            	CardGame.cards.add(new Card(text[i], selectA[i], selectB[i], selectC[i], nextA[i], nextB[i], nextC[i],AudioFilePath[i]));
//            } else if(IsOver[i] == true) {
//            	CardGame.cards.add(new Card(text[i],AudioFilePath[i]));
//            } else if(isBlank[i] == true) {
//            	CardGame.cards.add(new Card(text[i], nextA[i],AudioFilePath[i]));
//            }
//			ProgressBarGUI.fill(i);
//			int random = new Random().nextInt(200);
//			ProgressBarGUI.Warten(random);
//		}
//		ProgressBarGUI.fill(74);
//		ProgressBarGUI.progressend(Words.get(WordTypes.LoadCardsEnd));
		}else {
			CardGame.cards.clear();
			for (int i = 0; i < 74; i++) {
				if (isSonder[i] == true) {
					CardGame.cards.add(new Card(text[i], selectA[i], selectB[i], nextA[i], nextB[i], true,AudioFilePath[i]));
				} else if (IsOver[i] == false && isBlank[i] == false) {
					CardGame.cards.add(new Card(text[i], selectA[i], selectB[i], selectC[i], nextA[i], nextB[i], nextC[i],AudioFilePath[i]));
				} else if (IsOver[i] == true) {
					CardGame.cards.add(new Card(text[i],AudioFilePath[i]));
				} else if (isBlank[i] == true) {
					CardGame.cards.add(new Card(text[i], nextA[i],AudioFilePath[i]));
				}
			}
		}
     }
}