/*
 * 09/20/2019
 * Homework 02
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class AdventureTime {

	public static void main(String[] args) {
		System.out.println("The wind is howling and the rain is falling like pellets on your car, and no matter how " + '\n' 
				+ "fast your wipers are moving, it's just not enough. You can barely make out anything " + '\n'
				+ "except for the blurry lights of the cars headed opposite of you. Your friend in the passenger " + '\n'
				+ "seat suggests taking the upcoming exit as there is a small inn with a lot of vacancies left. You " + '\n'
				+ "feel like you stopped for gas not but 10 minutes ago. It's slowly nearing midnight, you've been " + '\n'
				+ "driving for over 5 hours now with your destination still over 3 hours away and drowsiness " + '\n'
				+ "beginning to set in, do you decide to stop at the inn? Y/N");
		Scanner keyboard = new Scanner(System.in);
		String firstDecision = keyboard.nextLine();
		
		if (firstDecision.equalsIgnoreCase("Y") || firstDecision.equalsIgnoreCase("Yes"))
		{
			System.out.println("Not wanting to take any chances, especially with the current weather situation, you decide to pull over " + '\n'
					+ "to stop for the night. The exit you pull off of is practically barren, nothing around until you finally find the " + '\n'
					+ "inn 4 miles later. You pull into the parking lot, and there seems to be no one else aorund, except for an old beat " + '\n'
					+ "up tan 1998 Toyota Corolla that looks like it hasn't been moved in years. Trying to avoid the rain as much as " + '\n'
					+ "possible, you and your friend quickly rush inside, with nothing in your hands but your phones and wallets. " + '\n'
					+ "Nothing illuminating your path other than the soft flickering light of the inn's sign. When you reach the front desk, " + '\n'
					+ "the kind old lady tells you there are only three rooms left, Room 105, Room 132, or Room 213. Which room do you choose? " + '\n'
					+ "(Please enter your decision as the integer value only.)");
			
			int secondDecision = keyboard.nextInt();
			keyboard.nextLine();
			
			if (secondDecision == 105)
			{
				System.out.println("You chose Room 105. Neither you or your friend expected to being staying over for the night, " + '\n'
						+ "so neither of you had prepared bags. Looking around the room, you notice two small twins beds, a nightstand " + '\n'
						+ "in between the two with a sole lamp on top of it, and a desk, all worn-down wooden pieces of furniture " + '\n'
						+ "that look like they haven't been moved in decades. There is a small bathroom attached to the room, but " + '\n'
						+ "it's not much bigger than a closet, in fact, you and your friend could barely fit in there at the same time. " + '\n'
						+ "With only a small standing shower, sink, and toilet somehow all cramped in there, you wondered how this " + '\n'
						+ "inn passed inspection, but its only for a night so you sigh and begin to get ready for bed. You and your " + '\n'
						+ "friend realize that not only is the room unbearingly cold but that you're short a blanket. After much " + '\n'
						+ "arguing on who will you go down to ask for an extra blanket, you and your friend settle on a game of " + '\n'
						+ "rock, paper, scissors to make the decision for you. What do you throw?");
				
				String thirdDecision = keyboard.nextLine();
				
				if (thirdDecision.equalsIgnoreCase("Rock"))
				{
					System.out.println("You threw rock and so did your friend. With an exhausted sigh, you both realized this " + '\n'
							+ "was probably the universe just telling you two not to worry about the blanket and " + '\n'
							+ "just get sleep already. You grabbed a couple towels from the bathroom and told your " + '\n'
							+ "friend you'd do your best to make do, especially since it wouldn't be that long anyways. " + '\n'
							+ "Crawling into bed and trying your hardest to lay the towels out in a blanket formation on top " + '\n'
							+ "of you, you let your head hit the pillow as you drift off. However, you're quickly awoken by a muffled scream " + '\n'
							+ "coming from the other side of the room, but it cuts off quickly. Scared of what you're about to see, " + '\n'
							+ "you reach a shaking hand out to the lamp to quickly flick the light on. You then find your face inches " + '\n'
							+ "away from that of a clown, and not even a scary one either, just the face paint of one" + '\n'
							+ "you would expect to see at an innocent child's birthday party. " + '\n'
							+ "'Boo.' You don't even have time to scream as it lunges at you. YOU DIED.");
				}
				
				else if (thirdDecision.equalsIgnoreCase("Paper"))
				{
					System.out.println("Throwing paper, you look down to see your friend threw rock and you them pump a " + '\n'
							+ "victorious fist in the air, laughing at your friend as you began to crawl into bed. You " + '\n'
							+ "hear them mutter something under their along the lines of why did they agree to this " + '\n'
							+ "as they leave the room, letting the door slam shut behind them. By that time though, " + '\n'
							+ "your eyes are already closed as you drift off to sleep. Not long after, you're quickly " + '\n'
							+ "stirred awake as you hear the door open and slam shut quickly, thinking it's just your " + '\n'
							+ "friend entering the room, you close your eyes to go back to sleep. You hear some " + '\n'
							+ "shuffling around in the room, until a hand suddenly pops out of nowhere a covers " + '\n'
							+ "your mouth a tight grip. Flailing, you reach the lamp next to you and flick it on. " + '\n'
							+ "You're greeted with the face of clown, not even a scary one, just the face paint of one " + '\n'
							+ "you would expect to see at a young child's birthday party. The last thing you hear " + '\n'
							+ "is the cackle of the clown as it brings a knife to your throat. YOU DIED.");		
				}
				
				else if (thirdDecision.equalsIgnoreCase("Scissors"))
				{
					System.out.println("Hoping for the best as you throw scissors, you look down to see your friend threw rock. " + '\n'
							+ "Looking back up you see a smirk crawl across their face as they begin to laugh at you. Letting out" + '\n'
							+ "a groan, you immediately turn around to head to the front desk to see what you can do about getting a" + '\n'
							+ "blanket. As you leave the room, you hear your friend mutter a soft goodnight as the door shuts. Between " + '\n'
							+ "waiting for the old lady to come back to the desk after ringing the bell what seemed like a thousand times and " + '\n'
							+ "the time it took for her to actually go find the blanket, it had been about ten minutes. As she's handing you " + '\n'
							+ "the blanket you hear a faint scream coming from the direction of your room. You look back at the lady behind the " + '\n'
							+ "desk, wide-eyed, but she just smiles back and says, 'Please, enjoy your stay.' Running back to your room as " + '\n'
							+ "quickly as possible, you fling the door open, only to be meet with an image you wish you'd never seen. Sprawled " + '\n'
							+ "out on the floor is the now bloddied and mutilated body of your friend, and as you slowly look up, you to start to " + '\n'
							+ "process the whole scene. Standing above your friend is a clown, and not one of the super scary ones either, but " + '\n'
							+ "one with the face paint you'd expect to see on a children's party entertainer. The clown turns its head to make eye" + '\n'
							+ "contact with you, slowly smiling as you're frozen in place. THE END.");
				}
				else
				{
					System.out.println("That is not a valid option. Your gameplay has been terminated.");
					System.exit(0);
				}
			}
			
			else if (secondDecision == 132)
			{
				System.out.println("You chose Room 132. Neither you or your friend expected to being staying over for the night, " + '\n'
						+ "so neither of you had prepared bags. Looking around the room, you notice two small twins beds, a nightstand " + '\n'
						+ "in between the two with a sole lamp on top of it, and a desk, all worn-down wooden pieces of furniture " + '\n'
						+ "that look like they haven't been moved in decades. There is a small bathroom attached to the room, but " + '\n'
						+ "its not much bigger than a closet, in fact, you and your friend could barely fit in there at the same time. " + '\n'
						+ "With only a small standing shower, sink, and toilet somehow all cramped in there, you wondered how this " + '\n'
						+ "inn passed inspection, but its only for a night so you sigh and begin to get ready for bed. You and your " + '\n'
						+ "friend realize that not only is the room unbearingly cold but that you're short a blanket. After much " + '\n'
						+ "arguing on who will you go down to ask for an extra blanket, you and your friend settle on a game of " + '\n'
						+ "rock, paper, scissors to make the decision for you. What do you throw?");
				
				String thirdDecision = keyboard.nextLine();
				
				if (thirdDecision.equalsIgnoreCase("Rock"))
				{
					System.out.println("You threw rock and so did your friend. With an exhausted sigh, you both realised this " + '\n'
							+ "was probably the universe just telling you two not to worry about the blanket and " + '\n'
							+ "just get sleep already. You grabbed a couple towels from the bathroom and told your " + '\n'
							+ "friend you'd try your best to make do, especially since it wouldn't be that long anyways. Next " + '\n'
							+ "thing you know, you're literally being shaken awake by your friend who has a panicked expression " + '\n'
							+ "on their face. You hear a faint rushing noise as you groggily sit up to face your friend. They begin " + '\n'
							+ "rambling but you can only pick up on some of the words, '...doors are locked...', " + '\n'
							+ "'windows...covered' and one that makes your blood run cold, 'Water.' And that's when you realize it, that " + '\n'
							+ "rushing sound you heard earlier wasn't in your head as you look down to realize the room is quickly " + '\n'
							+ "filling with water. And that's when it all crashes down on you, you're locked in a room that's close to " + '\n'
							+ "becoming an aquarium and you have no way out. Both you and your friend start screaming at the top of your lungs," + '\n'
							+ "but it's not no avail as the water quickly rises above your heads. YOU DIED.");
				}
				
				else if (thirdDecision.equalsIgnoreCase("Paper"))
				{
					System.out.println("Throwing paper, you look down to see your friend threw rock and you them pump a " + '\n'
							+ "victorious fist in the air, laughing at your friend as you began to crawl into bed. You " + '\n'
							+ "hear them mutter something under their along the lines of why did they agree to this " + '\n'
							+ "as they leave the room, letting the door slam shut behind them. By that time though, " + '\n'
							+ "your eyes are already closed as you drift off to sleep. You're awoken by an oddly " + '\n'
							+ "wet feeling that seems to be surrounding you. You quickly turn on the lamp to take a look around," + '\n'
							+ "and that when you realize just what that feeling was. The room you're in is quickly filling up with " + '\n'
							+ "water, so you do the only thing you can think of, you waddle over to the door to the best of your abilites," + '\n'
							+ "but it's locked. You begin to panick, but you still check the windows. However, they seemed to have " + '\n'
							+ "been covered by a material very reminiscent, of a sheet of metal. As a last resort you check the " + '\n'
							+ "door to the bathroom, but that's locked too. Your friend has yet to return and you have no idea what to " + '\n'
							+ "do except scream. And you keep screaming and screaming and screaming until the water in the room" + '\n'
							+ "fills your lungs. YOU DIED.");		
				}
				
				else if (thirdDecision.equalsIgnoreCase("Scissors"))
				{
					System.out.println("Hoping for the best as you throw scissors, you look down to see your friend threw rock. " + '\n'
							+ "Looking back up you see a smirk crawl across their face as they begin to laugh at you. Letting out" + '\n'
							+ "a groan, you immediately turn around to head to the front desk to see what you can do about getting a" + '\n'
							+ "blanket. As you leave the room, you hear your friend mutter a soft goodnight as the door shuts. Between " + '\n'
							+ "waiting for the old lady to come back to the desk after ringing the bell what seemed like a thousand times and " + '\n'
							+ "the time it took for her to actually go find the blanket, it had been about ten minutes. As she's handing you " + '\n'
							+ "the blanket you hear a faint scream coming from the direction of your room. You look back at the lady behind the " + '\n'
							+ "desk, wide-eyed, but she just smiles back and says, 'Please, enjoy your stay.' You quickly rush bak to the room " + '\n'
							+ "only to find the door locked and comlpetely sealed. You can hear your friend on the other side of the door, so you try " + '\n'
							+ "screaming to ask them if they're okay, but it's hard to hear their response. The only words you can make out are" + '\n'
							+ "'trapped', 'water', and chillilngly, 'don't wanna die'. You quickly rush back to the front desk to ask the lady to " + '\n'
							+ "open the door for you, but she's nowhere to be found, even by the bell this time. Instead you look at the desk, and " + '\n'
							+ "realize that there's a pile of towels sitting there with a note that reads, 'You may need these :).' THE END.");
				}
				else
				{
					System.out.println("That is not a valid option. Your gameplay has been terminated.");
					System.exit(0);
				}

			}
			
			else if (secondDecision == 213)
			{
				System.out.println("You chose Room 213. Neither you or your friend expected to being staying over for the night, " + '\n'
						+ "so neither of you had prepared bags. Looking around the room, you notice two small twins beds, a nightstand " + '\n'
						+ "in between the two with a sole lamp on top of it, and a desk, all worn-down wooden pieces of furniture " + '\n'
						+ "that look like they haven't been moved in decades. There is a small bathroom attached to the room, but " + '\n'
						+ "its not much bigger than a closet, in fact, you and your friend could barely fit in there at the same time. " + '\n'
						+ "With only a small standing shower, sink, and toilet somehow all cramped in there, you wondered how this " + '\n'
						+ "inn passed inspection, but its only for a night so you sigh and begin to get ready for bed. You and your " + '\n'
						+ "friend realize that not only is the room unbearingly cold but that you're short a blanket. After much " + '\n'
						+ "arguing on who will you go down to ask for an extra blanket, you and your friend settle on a game of" + '\n'
						+ "rock, paper, scissors to make the decision for you. What do you throw?");
				
				String thirdDecision = keyboard.nextLine();
				
				if (thirdDecision.equalsIgnoreCase("Rock"))
				{
					System.out.println("You threw rock and so did your friend. With an exhausted sigh, you both realised this " + '\n'
							+ "was probably the universe just telling you two not to worry about the blanket and " + '\n'
							+ "just get sleep already. You grabbed a couple towels from the bathroom and told your " + '\n'
							+ "friend you'd try your best to make do, especially since it wouldn't be that long anyways. You awake to " + '\n'
							+ "the sound of your phone's glaryingly-loud alarm. You hear your friend let out a tired groan as you both begin" + '\n'
							+ "to slowly wake up and tidy up the room. Wearing the same clothes as yesterday, you both head down to the lobby " + '\n'
							+ "to return your room keys. Getting in the car the car to head home, you get an eerie feeling that someone is watching" + '\n'
							+ "you, but you shake it off. As you sit in the driver's seat your friend joins you in the car, but they have a piece of " + '\n'
							+ "paper in their hands and a pale look on their face. The hand you the paper as they tell you that they found it under the " + '\n'
							+ "windshield wiper. Confused at their reaction you turn your attention to the paper to read what was sprawled across it. " + '\n'
							+ "'Hope you enjoyed your stay. Next time we'll make it forver.' THE END.");
				}
				
				else if (thirdDecision.equalsIgnoreCase("Paper"))
				{
					System.out.println("Throwing paper, you look down to see your friend threw rock and you them pump a " + '\n'
							+ "victorious fist in the air, laughing at your friend as you began to crawl into bed. You " + '\n'
							+ "hear them mutter something under their along the lines of why did they agree to this " + '\n'
							+ "as they leave the room, letting the door slam shut behind them. By that time though, " + '\n'
							+ "your eyes are already closed as you drift off to sleep. You awake to what sounds like rushed and harsh whispers," + '\n'
							+ "but they don't sound like your friend. You sit up to only have a bag tossed over your head as you " + '\n'
							+ "feel your arms being clasped behind your back. You try fighting back as hard as possible, but it's to no avail. " + '\n'
							+ "You then feel a hand cover your mouth, and the last thing you hear is your friend's scaream as everything fades away. " + '\n'
							+ "THE END.");		
				}
				
				else if (thirdDecision.equalsIgnoreCase("Scissors"))
				{
					System.out.println("Hoping for the best as you throw scissors, you look down to see your friend threw rock. " + '\n'
							+ "Looking back up you see a smirk crawl across their face as they begin to laugh at you. Letting out" + '\n'
							+ "a groan, you immediately turn around to head to the front desk to see what you can do about getting a" + '\n'
							+ "blanket. As you leave the room, you hear your friend mutter a soft goodnight as the door shuts. Between " + '\n'
							+ "waiting for the old lady to come back to the desk after ringing the bell what seemed like a thousand times and " + '\n'
							+ "the time it took for her to actually go find the blanket, it had been about ten minutes. As she's handing you " + '\n'
							+ "the blanket you hear a faint scream coming from the direction of your room. You look back at the lady behind the " + '\n'
							+ "desk, wide-eyed, but she just smiles back and says, 'Please, enjoy your stay.' You quickly rush back to the room" + '\n'
							+ "to find the door slightly cracked open. Entering fully into the room you see nothing but a mess, the lamp and bedding " + '\n'
							+ "has been thrown to the ground, but out of everything you see, there is one thing you don't: your friend. You don't even " + '\n'
							+ "have time to think about searching for them before a cloth is thrown over your mouth and everything fades to black. " + '\n'
							+ "THE END.");
				}
				else
				{
					System.out.println("That is not a valid option. Your gameplay has been terminated.");
					System.exit(0);
				}
					
			}
			
			else 
			{
				System.out.println("That is not a valid option. Your gameplay has been terminated.");
				System.exit(0);
			}
		}
		
		else if (firstDecision.equalsIgnoreCase("N") || firstDecision.equalsIgnoreCase("No"))
		{
			System.out.println("You tell your friend that you would rather just stay on the road, and power through " + '\n'
					+ "until you make back to school. Not even half an hour after you've made your " + '\n'
					+ "decision and your friend has fallen asleep next to you. Now with a silent car and nothing but " + '\n'
					+ "the monotonous patter of the rain against your windshield, you slowly find yourself nodding off. " + '\n'
					+ "You're able to catch yourself before you truly fall asleep, but it's getting harder and harder " + '\n'
					+ "to keep your eyes open. But by the fourth time, you're not able to stop yourself from quickly drifitng off. " + '\n'
					+ "It's not until you hear the blaring horns of the cars around you. You're shaken awake and look up only to " + '\n'
					+ "realize you must started to drift into the lane next to you as you were dozing off. You barely have " + '\n'
					+ "even a second to register what's going on before the right back corner of your car is clipped by a " + '\n'
					+ "pick-up truck you been riding alongside with, sending your own car in the air as you swerve trying " + '\n'
					+ "to regain control, but it doesn't work. The last thing you see is the time on your car's radio " + '\n'
					+ "system before your head hits the window and everything goes black. The time reads 12:53am. " + '\n'
					+ "However, your time of death isn't official until 1:34am.");
		}
		
		else
		{
			System.out.println("That is not a valid option. Your gameplay has been terminated.");
			System.exit(0);
		}
		
	}

}
