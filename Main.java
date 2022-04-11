import java.util.concurrent.TimeUnit; //so i can use delay
import java.util.*; //so the code will work maybe
public class Main
{
	//This is my bookmark if you somehow find me working on this while it is WIP
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//PATH LAYOUT
	
	//island -> cave -> man -> deeper tunnels -> waterfall/underground lair
	//island -> dreamworld -> simulation -> password!! -> real world
	
	
	//Delay function
	
	public static void delay(int num)
	{
		try{Thread.sleep(num);}catch(InterruptedException ex){ex.printStackTrace();}
	}
	
	//Shortened newLine and delay function (2s)
	
	public static void lineDelay()
	{
		System.out.println();
		delay(3000);
	}
	
	//Shortened print function
	
	public static void say(String text)
	{
		System.out.print(text);
	}
	
	//Shortened print line function
	
	public static void sayln(String text)
	{
		System.out.println(text);
	}
	
	//Shortened new line function
	
	public static void newLine()
	{
		System.out.println();
	}
	
	//Shortened ellipsis function
	
	public static void ellipsis()
	{
		System.out.print(".");                                                  delay(500);
		System.out.print(".");                                                  delay(500);
		System.out.print(".");
	}
	
	//Shortened clear screen function
	
	public static void clearScreen() 
	{  
		System.out.print("\033[H\033[2J"); //special command to wipe screen
		System.out.flush();  
	}  
	//STORYLINE
	public static void INTRO()
	{
		sayln("Welcome to Island Escape, a text based interactive story.");
		sayln("========================================================"); 
		newLine();
		delay(1000);
		sayln("This is a game.");
		lineDelay();
		sayln("An interactive story game inspired by 'A Heist with Markiplier'...");
		lineDelay();
		sayln("And so it begins...");
		lineDelay();
		// NAME CLEARANCE
		say("This is the story of");                                            delay(500);
		ellipsis();                                                             delay(3000);
		sayln("who are you?");                                                  delay(1000);
		say("You are? \n-");
	}
    
	public static void BEACH()
	{
		//Beach
		lineDelay();
		sayln("-You awake, tasting sand in your mouth and catch the smell of the ocean.");
		lineDelay();
		sayln("-Somewhat off in the distance, something large sinks into the ocean. ");
		lineDelay();
		sayln("-The sun's rays blaze your bare skin. ");
		lineDelay();
		sayln("-You have more questions than answers right now.");
		lineDelay();
	}
    
	public static void ATTACKED()
	{
		sayln("-You decide it was best to wait for someone to find you.");
		lineDelay();
		sayln("-You think that surely somebody would be looking for you.");
		lineDelay();
		sayln("-Day slowly turns to night and you begin to feel the effects of dehydration.");
		lineDelay();
		say("-You slowly nod off");
		ellipsis();
		lineDelay();
		newLine();
		sayln("-You wake up feeling worse than before. ");
		lineDelay();
		sayln("-You feel so fatigued and dizzy that you were unaware of the footsteps coming from behind you.");
		lineDelay();
		sayln("-You are suddenly approached by a hairy and dirty looking man with a makeshift machete in his hand!");
		lineDelay();
	}
    
	public static void FRUIT()
	{
		sayln("-You pick yourself off the ground and decide to explore your surroundings.");
		lineDelay();
		sayln("-You made your way around the coastline only to find yourself back to where you started.");
		lineDelay();
		sayln("-It seems like you are on an island, but you are also not sure if you are really alone.");
		lineDelay();
		sayln("-You decide to continue exploring deeper into the hearth of the island.");
		lineDelay();
		sayln("-You found some fruits that look similar to mangos.");
		lineDelay();
		sayln("-You know you are not an expert and these fruits could be poisonous.");
		lineDelay();
		sayln("-But you have been wandering around all day and need water.");
		lineDelay();
	}
    
	public static void FRIEND()
	{
		sayln("-You thought it would be best to talk it out with the man.");
		lineDelay();
		sayln("-After all, you couldn't take him on without a weapon.");
		lineDelay();
		sayln("-You open your hands and show him that you don't pose as a threat.");
		lineDelay();
		sayln("-He seems to understand and gives you some berries that he has in a basket.");
		lineDelay();
		sayln("-He begins to point in a direction and starts gesturing frantically (He seems very eager to bring you to his home).");
		lineDelay();
		sayln("-As the man brings you closer to a cave, you smell something tasty cooking inside.");
		lineDelay();
		sayln("-Once inside, he hands you a giant meat on a stick. ");
		lineDelay();
		sayln("-The meat was unlike any you've had before.");
		lineDelay();
		sayln("-'Well, meat is meat', you think to yourself.");
		lineDelay();
		say("-So you and your new friend eat a nice dinner and you settle in for the night");
		ellipsis();
		newLine();
		lineDelay();
		sayln("-You awake to see that your friend was preparing something at his little workbench.");
		lineDelay();
		sayln("-He seems to be... making something?");
		lineDelay();
	}
    
	public static void MACHETE() // 😪 no violence
	{
		sayln("-You put up your fists to fight the man with a machete for some reason.");
		lineDelay();
		sayln("-The man takes you action as a form of hostility and grips his machete tightly.");
		lineDelay();
		// sayln("-He swings at you with precision and slices a sizeable gash in your arm as you block the attack.");
		// lineDelay();
		// sayln("-You start to regret your decision immediately as your wounds keep piling up.");
		// lineDelay();
		// sayln("-You weakly throw a punch in his direction but all you got in return was a sharp pain in your stomach.");
		// lineDelay();
		// sayln("-The man kicks you away like a ragdoll.");
		// lineDelay();
		// sayln("-Your vision is blurring and blood is pouring from your torso. ");
		sayln("-He swings at you and your health points are depleting quickly.");
		lineDelay();
		sayln("-You start to regret your decision.");
		lineDelay();
		sayln("-Your vision is blurring as your health points reaches 0.");
		lineDelay();
		say("-The world seems to be fading");
		ellipsis();
		newLine();
		lineDelay();
	}
    
	public static void MACHETEend()
	{
		sayln("ENDING 1: Unfair");                                     
		lineDelay();
		sayln("You lost the duel.");
		lineDelay();
		sayln("You brought fists to a knife fight.");
		lineDelay();
		sayln("Things could have gone better for you.");                             
		lineDelay();
		sayln("Is this really the end?");
		lineDelay();
		sayln("Word of advice? Don't fight a man with a machete.");                             
		lineDelay();
		say("Also,");                                               delay(3000);
		sayln(" Don't Trust Him.");
		lineDelay();                                                delay(2000);
	}
    
	public static void CAVE()
	{
		sayln("-You decide to wing it and pick a fruit to start peeling.");
		lineDelay();
		sayln("-Without hesitation, you sink your teeth into the juicy and sweet taste of something familiar. ");
		lineDelay();
		sayln("-It seems like the fruit were actually mangos and you pick a few more to eat along the way.");
		lineDelay();
		sayln("-You are fully hydrated and ready to continue exploring the island. ");
		lineDelay();
		sayln("-After a while, you stumble upon a cave entrance but it is clear that someone has been living in it.");
		lineDelay();
		sayln("-You shout to see if anyone is home but you receive no answer.");
		lineDelay();
		sayln("-You are really tired and need some sleep.");
		lineDelay();
		say("-You make your way into the cave dwelling and pass out on the makeshift bed.");
		ellipsis();
		newLine();
		lineDelay();
		sayln("-Heavy footsteps startles you!");
		lineDelay();
	}

	public static void FAMILY()
	{
		sayln("-You decide it would be best to ignore the fruit and keep exploring.");
		lineDelay();
		sayln("-Day slowly turns to night and you begin to feel the effects of dehydration.");
		lineDelay();
		sayln("-You begin to doubt whether or not you made the right decision.");
		lineDelay();
		sayln("-You have been walking for so long. Why hadn't you eaten that fruit?");
		lineDelay();
		sayln("-You eventually trip and fall unwillingly.");
		lineDelay();
		say("-You fell unconscious");
		ellipsis();
		lineDelay();
		newLine();
		sayln("-You wake up groggily with a moderate headache.");
		lineDelay();
		sayln("-You find yourself lying on the bare ground.");
		lineDelay();
		sayln("-Nothing seems to be different but you sense something off.");
		lineDelay();
		sayln("-You don't feel hungry or tired anymore.");
		lineDelay();
		sayln("-You wander for a bit towards the shoreline to see a huge boat in the distance is strolling slowly towards the island. ");
		lineDelay();
		sayln("-You seem to notice that your friends and family have arrived on a boat to the island!");
		lineDelay();
		sayln("-How wonderful that they have come to rescue you from this dreadful island!");
		lineDelay();
		sayln("-Just as you greet them with hugs and kisses, the ship fades into thin air.");
		lineDelay();
		sayln("-You frantically gesture to them that the only form of escape has suddenly disappeared.");
		lineDelay();
		sayln("-They explain that they came to the island for vacation and adventure.");
		lineDelay();
		sayln("-'It'll be fun!', they say.");
		lineDelay();
		sayln("-'We're all here. What else do you need?', they say.");
		lineDelay();
		sayln("-Overwhelmed and left feeling helpless, the party spreads out and starts propping up their tents and sets up camp.");
		lineDelay();
		sayln("-Without any idea of what to think, you plop down on the sand to think.");
		lineDelay();
	}

	public static void TOGETHER()
	{
		sayln("-After a long time of pondering, you accept the idea that this island is your home now.");
		lineDelay();
		sayln("-After all, everyone is right where you want them to be.");
		lineDelay();
		sayln("-Together.");
		lineDelay();
	}

	public static void TOGETHERend()
	{
		sayln("ENDING 2: Together");
		lineDelay();
		sayln("After a couple rough days, you get used to the fact that you are in paradise.");
		lineDelay();
		sayln("Days blur into weeks that blur into months.");
		lineDelay();
		sayln("You quickly forget everything that happened when you first arrived on this island.");
		lineDelay();
		sayln("Now, you spend all your time with family and friends stress free.");
		lineDelay();
		sayln("Is this really where it ends?");
		lineDelay();
	}

	public static void BREAKINGOUT()
	{
		sayln("-You decide that you were not going to have any of this.");
		lineDelay();	
		sayln("-Something is off and you were determined to find out what is going on.");
		lineDelay();	
		sayln("-You start looking for clues to escape the island.");
		lineDelay();	
		sayln("-You notice the abundance of supplies each person had brought.");
		lineDelay();	
		sayln("-You start forming a plan to escape this island.");
		lineDelay();	
		sayln("-You wait until nightfall to start collecting supplies while everyone else seems to be sleeping.");
		lineDelay();	
		sayln("-You construct a floatation device that consists of many filled beach balls and tree branches to carry you farther off the island.");
		lineDelay();	
		sayln("-Not long after setting off in the direction the ship came, you are suddenly stopped by an invisible barrier.");
		lineDelay();	
		sayln("-Confused, you use one of the tree branches that was originally an oar to test the wall.");
		lineDelay();	
		say("-You can hear sound of");
		ellipsis();
		newLine();
		newLine();
		sayln("-A beeping sound?");
		lineDelay();	
		sayln("-You feel exceptionally puzzled as you continue swinging your weapon at the stubborn wall.");
		lineDelay();	
		sayln("-The more you swing, the more you notice that you have been hitting a panel that wasn't visible moments ago.");
		lineDelay();	
		sayln("-The panel seems to be losing...");
		lineDelay();	
		delay(5000);
		sayln("-Pixels?");
		lineDelay();
		sayln("-You keep at it until the entire panel has been consumed by the darkness.");
		lineDelay();	
		sayln("-Finally, the panel seems to have been disintegrated and the void has taken its place.");
		lineDelay();	
		sayln("-There doesn't seem to be any other choice other than jumping in...");
		lineDelay();	
	}

	public static void JUMPOUT()
	{
		delay(2000);
		clearScreen();
		sayln("-You reach forwards with your hand into the unknown to find nothing beyond the darkness.");
		newLine();       delay(2000);
		sayln("-You take a deep breath");
		newLine();       delay(2000);
		say("-and you make a leap of faith into the abyss");
		ellipsis();
		newLine();
		newLine(); 
		delay(5000);
		clearScreen();
		newLine();
		newLine();
		sayln("-You take a deep breath");
		newLine();
		say("-and you make a leap of faith into the abyss");
		delay(2000);
		clearScreen();
		newLine();
		newLine();
		newLine();
		newLine();
		say("-and you make a leap of faith into the abyss");
		delay(1000);
		clearScreen();
		delay(4000);
	}

	public static void BEGINFIGHT()
	{
		sayln(" **Because you both do not support violence, you both take out a dueling simulation decider.** ");
		lineDelay();
		sayln(" **All of this will be done in a simulation and will not really result in actual harm to each other.** ");
		lineDelay();
		sayln(" **The winner gets to stay in this reality while the loser will be sent to an alternate reality.**");
		lineDelay();
		sayln("-You look around frantically in search of a weapon of some sort to defend yourself.");
		lineDelay();
		sayln("-You open the nearest basket to you as the creature casts its shadow upon you.");
		lineDelay();
		say("-It looks like whatever you grabbed was a block of green spaghetti that looked like it was repeatedly soaked and redried until it became stone");
		ellipsis();
		lineDelay();
		newLine();
		sayln("-A huge hairy man that spans 5 feet in width looms over you and growls in anger.");
		lineDelay();
		sayln("He doesn't look too happy that you've entered its home and he looks to be armed with a machete as well!");
		lineDelay();
		sayln("Prepare to fight?");
		lineDelay();
	}

	public static void KNOCKEDOUT()
	{
		sayln("-You decide to dive for cover behind anything that could obscure the creature's vision.");
		lineDelay();
		sayln("-The grave problem that you discover is that there was nowhere to hide.");
		lineDelay();
		sayln("-You hadn't explored the cave dwelling long enough to notice that there was just a lot of food scraps strewn along leaves.");
		lineDelay();
		sayln("-The creature looks to be an enormous and intimidating giant with a machete in his hand.");
		lineDelay();
		sayln("-He screams in rage at his intruder and all you could return was a shriek for help.");
		lineDelay();
		say("-He strikes you in the head before you could scramble away");
		ellipsis();
		lineDelay();
		newLine();
		sayln("-You guess that running away from a problem was a bad idea");
		lineDelay();
	}

	public static void CAUGHTend()
	{
		sayln("ENDING 3: Caught");
		lineDelay();
		sayln("You regret your cowardice.");
		lineDelay();
		sayln("Not that it matters anymore but it still hurts to remember.");
		lineDelay();
		sayln("As the world blackens before you, you wish you could've done more.");
		lineDelay();
		sayln("Is this really where it ends?");
		lineDelay();
	}

	public static void DEFEATEDend()
	{
		sayln("ENDING 4: Defeated");
		lineDelay();
		sayln("You were defeated but you don't regret anything");
		lineDelay();
		sayln("It was a great duel, and you put your all into it.");
		lineDelay();
		sayln("But is that really all you've got?");
		lineDelay();
		sayln("Is this really where it ends?");
		lineDelay();
	}

	public static void TELEPORTER()
	{
		sayln(" **The big man turns into pixels and is moved to an alterante dimension.");
		lineDelay();
		sayln("-You will no longer have to worry about him anymore.");
		lineDelay();
		sayln("-You make sure to eat well and stay well rested.");
		lineDelay();
		sayln("-Food becomes more and more scarce so you return to your search for escape.");
		lineDelay();
		sayln("-You hadn't fully explored the cave so you venture deeper into the tunnels until you discover weird symbols carved into the walls.");
		lineDelay();
		sayln("-The tunnel ends and directly to your left is a stone chair that has circles of ancient markings around it.");
		lineDelay();
		sayln("-You can't understand but you feel as if you were drawn towards the chair and inclined to sit on it.");
		lineDelay();
		sayln("-Without a second thought, you plop directly onto the chair.");
		lineDelay();
		sayln("-You spin your head around to find yourself in the center of some sort of ritual...");
		lineDelay();
		sayln("-The symbols on the walls light up and begin to glow brighter every second.");
		lineDelay();
		sayln("-You feel something horrible is about to happen but can't seem to convince yourself to get up and leave");
		lineDelay();
		sayln("-All you can do is sit while the light begins to blind you.");
		lineDelay();
		sayln("-A sense of calm washes over you, preventing your screams and cries for help from escaping your body.");
		lineDelay();
		sayln("-Before long, white was the only thing you could see as you fall into a deep slumber.");
		lineDelay();
	}

	public static void ENTERMAGICWORLD()
	{
		sayln("-You awake on the forest floor...");
		lineDelay();
		sayln("-You suddenly feel as though you were paralyzed but floating at the same time.");
		lineDelay();
		sayln("-You notice two cloaks following behind you as you begin floating towards a direction.");
		lineDelay();
		sayln("-You become hopeful that you have finally returned to you old life as you get closer to the sound of people talking.");
		lineDelay();
		sayln("-To your surprise, the village you just entered consists of many other cloaked humanoid figures that seem to be holding wooden sticks in their hands.");
		lineDelay();
		sayln("-Surely this was just a dream right?");
		lineDelay();
		sayln("-You feel disappointed as your captors toss you into a prison cell that closed with the flick of their wrist.");
		lineDelay();
		sayln("-Looks like the chair you sat on had teleported you to a magical world.");
		lineDelay();
	}

	public static void MAGICtbc()
	{
		sayln("TO BE CONTINUED: A Magical World");
		lineDelay();
		sayln("Thank you for playing! Maybe Part 2 of Island Escape will continue the story...");
		lineDelay();
		sayln("Sorry for the cliff-hanger but there are other endings!");
		lineDelay();
		sayln("1. Roll Credits");
		sayln("2. Go back to beginning");
	}

	public static void SIMULATIONBREAK()
	{
		sayln("-You snap back into reality.");
		lineDelay();
		sayln("-You find yourself lying on a high tech chair that doesn't belong in the 21st century.");
		lineDelay();
		sayln("-You feel like something connected to the back of your head when you try to get up");
		lineDelay();
		sayln("-You rip the cord that was tethered to you as if your head was a power socket.");
		lineDelay();
		sayln("-Curious, you scan the room and see a monitor on.");
		lineDelay();
		sayln("-Thirsty for answers, you sit down on the chair in front of the screen.");
		lineDelay();
	}

	public static void REMEMBERWHOYOUARE()
	{
		delay(100);
		clearScreen();
		sayln("**@#^$*@&#%^@*#&%^**");
		delay(100);
		clearScreen();
		sayln("@^%^&((@%(@#^%(^&*@#");
		delay(100);
		clearScreen();
		sayln("R#@*&$*@*#&%@*#&%@##");
		delay(100);
		clearScreen();
		sayln("R^^$&!***%*@#**#*&*^");
		delay(100);
		clearScreen();
		sayln("RE*(&$#&*^(@^@%^@*#*");
		delay(100);
		clearScreen();
		sayln("RE&@#%&**@#&&(@#^$(^");
		delay(100);
		clearScreen();
		sayln("REM@&^&@#%&*@^&%^@#&");
		delay(100);
		clearScreen();
		sayln("REM&^%@&#%^&@&#%(@#%");
		delay(100);
		clearScreen();
		sayln("REME*^*!#^*%@*#&%*@#");
		delay(100);
		clearScreen();
		sayln("REME%*#^*#(@*#&($^(@");
		delay(100);
		clearScreen();
		sayln("REMEM(^@#*%^@*#&(#))");
		delay(100);
		clearScreen();
		sayln("REMEM*&(^@#^%^&@#&&%");
		delay(100);
		clearScreen();
		sayln("REMEMB*^%&*@#^%*@#*&");
		delay(100);
		clearScreen();
		sayln("REMEMB&^@%^&@*#&%^*@");
		delay(100);
		clearScreen();
		sayln("REMEMBE#@%^&*&*&#@^%");
		delay(100);
		clearScreen();
		sayln("REMEMBE#%^&*@*&#&%^*");
		delay(100);		clearScreen();
		sayln("REMEMBER*!%^*@#%**#%");
		delay(100);		clearScreen();
		sayln("REMEMBER#%@^@&$@^%@%");
		delay(100);		clearScreen();
		sayln("REMEMBER *%@^(!*^%#(");
		delay(100);		clearScreen();
		sayln("REMEMBER @#%^?#@>%@#");
		delay(100);		clearScreen();
		sayln("REMEMBER W&(^!%><!@%");
		delay(100);		clearScreen();
		sayln("REMEMBER W#%@?>@<^>@");
		delay(100);		clearScreen();
		sayln("REMEMBER WH@*(@(^@#?");
		delay(100);		clearScreen();
		sayln("REMEMBER WH#@^#$@#%^");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO|{}{@%@?");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO@*^@#(^#");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO #%^@#^@");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO {}|@#%@");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO Y|}@#*$");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO Y^#&*%&");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YO^^@#(");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YO@#%((");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU*&@$");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU*^$#");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU #%!");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU #%^");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU A#%");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU A&$");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU AR^");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU AR$");
		delay(100);		clearScreen();
		sayln("REMEMBER WHO YOU ARE");
		delay(5000);
	}

	public static void SURPRISEGREETING()
	{
		delay(100);
		clearScreen();
		sayln("(&(!#@%*&(@#^)))@#");
		delay(100);
		clearScreen();
		sayln("$@^&#%@#%^@#^$@%@@");
		delay(100);
		clearScreen();
		sayln("Y#%@%@#^#%@%@^!#^#");
		delay(100);
		clearScreen();
		sayln("Y*&%^#&$&%%#&%**##");
		delay(100);
		clearScreen();
		sayln("YO$&@$&@$%^@$^&&**");
		delay(100);
		clearScreen();
		sayln("YO$^#&#$^@$&*(@&@$");
		delay(100);
		clearScreen();
		sayln("YOU^@^@#^}{@#&#@%%");
		delay(100);
		clearScreen();
		sayln("YOU^$#&@$*!#%$@^$@");
		delay(100);
		clearScreen();
		sayln("YOU $@&246!&@6$W&$");
		delay(100);
		clearScreen();
		sayln("YOU SD&$@G@$$^EGSG");
		delay(100);
		clearScreen();
		sayln("YOU AEE@^#$@G^S^$^");
		delay(100);
		clearScreen();
		sayln("YOU A$^^SYS^&E#$GS");
		delay(100);
		clearScreen();
		sayln("YOU AR#^E^@#FYTESA");
		delay(100);
		clearScreen();
		sayln("YOU ARE^AAFASY#%#^");
		delay(100);
		clearScreen();
		sayln("YOU AREA^#AGA#GAW%");
		delay(100);
		clearScreen();
		sayln("YOU ARE AAYEAB&AGE");
		delay(100);		clearScreen();
		sayln("YOU ARE AH$YADAAYA");
		delay(100);		clearScreen();
		sayln("YOU ARE IOIHINSKYS");
		delay(100);		clearScreen();
		sayln("YOU ARE INSFHJUSFH");
		delay(100);		clearScreen();
		sayln("YOU ARE INSHSUSBSF");
		delay(100);		clearScreen();
		sayln("YOU ARE IN SHSYS$B");
		delay(100);		clearScreen();
		sayln("YOU ARE IN AMONGUS");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MHADYAE");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MYAHAET");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MY IHSD");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MY AGAH");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MY BYDO");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MY BDOY");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MY BDYO");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MY BOYD");
		delay(100);		clearScreen();
		sayln("YOU ARE IN MY BODY");
		delay(5000);
	}

	public static void FUTUREtbc()
	{
		sayln("TO BE CONTINUED: The Future");
		lineDelay();
		sayln("Thank you for playing! Maybe Part 2 of Island Escape will continue the story...");
		lineDelay();
		sayln("Sorry for the cliff-hanger but there are other endings!");
		lineDelay();
		sayln("1. Roll Credits");
		sayln("2. Go back to beginning");
	}

	public static void TELEPORTTOEARTH()
	{
		sayln("-You decide that you and your friend are going to be alright.");
		lineDelay();
		sayln("-He probably just never had a friend before until you came along.");
		lineDelay();
		sayln("-You trust that he will help you in your escape.");
		lineDelay();
		sayln("-He finally turns towards with a grin that could be mistaken to be a banana in his mouth.");
		lineDelay();
		sayln("-He then presses a green crystal in your hand and puts a purple neclace around your neck.");
		lineDelay();
		sayln("-You accept the gifts but you still haven't found a way back yet.");
		lineDelay();
		sayln("-You try describing, pointing, and drawing your intention on finding your way home.");
		lineDelay();
		sayln("-The huge man merely leads you deeper into the caves to a stone chair.");
		lineDelay();
		sayln("-He seats you down and starts waving for some reason.");
		lineDelay();
		sayln("-You were too distracted before to notice the ancient markings around you.");
		lineDelay();
		sayln("-Your vision fades into white as you feel a burning sensation on your palm and chest.");
		lineDelay();
	}

	public static void CRYSTALS()
	{
		sayln("-You awake on Earth.");
		lineDelay();
		sayln("-You are so happy that you made it back!");
		lineDelay();
		sayln("-But something didn't feel right...");
		lineDelay();
		sayln("-You look down and gasp in horror!");
		lineDelay();
		sayln("-Green and purple crystals form across your body.");
		lineDelay();
		sayln("-You become immobile with the crystals overpowering you.");
		lineDelay();
		sayln("-And then the whole universe was shattered.");
		lineDelay();
	}

	public static void BETRAYEDend()
	{
		sayln("ENDING 1: Betrayed");
		lineDelay();
		sayln("He made you destroy your whole universe.");
		lineDelay();
		sayln("You shouldn't have trusted him.");
		lineDelay();
		sayln("But now, everyone is gone.");
		lineDelay();
		sayln("Is this really how it ends?");
	}

	public static void ESCAPETOPIPES()
	{
		sayln("-You believe that there is something wrong but can't quite put your finger on it.");
		lineDelay();
		sayln("-You make sure you take special precautions around him from now on.");
		lineDelay();
		sayln("-The man turns towards you, smiling so wide that sent shivers down your spine.");
		lineDelay();
		sayln("-He's blocking the entrance that you entered with.");
		lineDelay();
		sayln("-You decide the only other choice you have is to run to the tunnels.");
		lineDelay();
		sayln("-You make a break for the tunnels and run as fast as your legs could carry you.");
		lineDelay();
		sayln("-You weave through the narrow tunnels until you finally reach a rusted metal door.");
		lineDelay();
		sayln("-You rip open the door as fast as you could and seal the door with a conveniently placed button nearby labeled: 'Emergency Door Seal'.");
		lineDelay();
		sayln("-You take a deep breath as you hear the useless pounding from the door behind you.");
		lineDelay();
		sayln("-Then you realize you have trapped yourself in a room now.");
		lineDelay();
		sayln("-A locked door with seemingly no way of opening stands before you.");
		lineDelay();
		sayln("-Then you notice that there were a grid of pipes that look like a mess.");
		lineDelay();
		sayln("-You also notice that there were 5 crystals on the grid that led to the door.");
		lineDelay();
		sayln("-It looks like you have to connect all 5 crystals with the end pipes to be able to open the door.");
		lineDelay();
	}

	public static void DOOROPEN()
	{
		sayln("-The door mechanically creaks open after you've turned the last pipe.");
		lineDelay();
		sayln("-The pounding from the tunnels had stopped.");
		lineDelay();
		sayln("-Seems like he has given up chasing you.");
		lineDelay();
		sayln("-You may have escaped him but problems have only begun.");
		lineDelay();
		sayln("-As you walk out of the door, you find yourself surrounded by only robots.");
		lineDelay();
	}
	
	public static void CREDITS()
	{
		sayln("Thank you for playing my game!");
		sayln("I also have a few people I would like to thank for giving me ideas!");
		sayln("Thank you, Mr.Houston for jumpstarting this project for me to test my limits! ");
		sayln("Thank you, Sophia for giving me the 'Everybody gets wiped out in the end' ending! ");
		sayln("Thank you, Bob for giving me the idea of using Spaghetti as a shield! ");
		sayln("Thank you, https://fsymbols.com/text-art/ for supplying the free text art!");
		sayln("Thank you, Markiplier for inspiring the interative story game concept!");
		sayln("Some honorable mentions: This project originally was supposed to also have music and sfx but time was a huge limiting factor. Thus unable to become a reality.");
		sayln("This is my 2nd year of coding and I hope I will be getting better at it!");
		sayln("I hope you had a fun and wonderful experience! Stay Safe!");
	}
	
	public static void tryAgainOr()
	{
		sayln("=Try again or Return to Screen Title");
		newLine();
		sayln("1. Try again at last checkpoint");
		sayln("2. Return to the beginnning");
	}

    //main stuff
    
	public static void main(String[] args)
	{
		clearScreen(); //just incase there's stuff on screen that shouldn't be there
		/*
		Creating a list here so i remember what everything was
			
		newGame makes sure while loop runs until game over
		playerPos is the value that determines the speech that the player will see
		ending determines the ending that the player receives
		player choice is a user input that changes their position
		wanted to make music in the background but it's more complicated than it looks
				
		*/
		String playerName= "Default String";
		boolean newGame = true;
		int playerPos = -2;
		int ending = 0;
		Scanner scan = new Scanner(System.in); //Created a Scanner object
		// https://codehs.com/uploads/bf481c8d0f4bfe6d855ab6c338ca334d
		
		//STORY
		
		while (newGame)
		{
			if (playerPos==-2)
			{
				INTRO();
				playerName = scan.nextLine();                            delay(2000);
				clearScreen();
				sayln("Remember who You are");
				delay(5000);
				clearScreen();
				playerPos = -1;
			}
			else if (playerPos==-1) // Beach
			{
				BEACH();
				playerPos=0;
			}
			else if (playerPos==0) // choice1
			{
				sayln("~What do you want to do? ");
				newLine();                                                      delay(500);
				sayln("1. Wait for help.");
				sayln("2. Explore.");
				int playerChoice = scan.nextInt();                              delay(1000);
				clearScreen();
				
				if (playerChoice==1) // set to 100 (GETTING ATTACKED?????) ~
				{
					ATTACKED();
					playerPos=100;
				}
				else  // set to 1 (FRUIT OR POISON?) ~
				{
					FRUIT();
					playerPos = 1;
				}
			}
			else if (playerPos==100)
			{
				sayln("~What do you do?");
				newLine();                                                      delay(500);
				sayln("1. Talk it out.");
				sayln("2. Fight!");
				int playerChoice = scan.nextInt();                              delay(1000);
				clearScreen();
				
				if (playerChoice==1) // set to 101 (FOLLOW HIM TO HIS HOME) ~
				{
					FRIEND();
					playerPos=101;
				}
				else  // nope ~
				{
					sayln("-No.");
					lineDelay();
					sayln("-You are not winning this fight.");
					lineDelay();
					clearScreen();
					playerPos=100;
					// MACHETE();
					// newLine();
					// sayln("=Enter any number to continue");
					// int next = scan.nextInt();
					// clearScreen();                                              delay(2000);
					// MACHETEend();
					// tryAgainOr();
					// int retry = scan.nextInt();
					// if (retry==1)
					// {
					// 	clearScreen();
					// 	delay(2000);
					// 	ATTACKED();
					// 	playerPos=100;
					// } else { playerPos=-2; }
				}
			}
			else if (playerPos==1)
			{
				sayln("~Do you want to eat it? ");
				newLine();                                                      delay(500);
				sayln("1. It's poison!");
				sayln("2. Food is Food!");
				int playerChoice = scan.nextInt();                              delay(1000);
				clearScreen();
				
				if (playerChoice==1) // set to 200 (WANDER FORWARD AND GETS TIRED goes to dreamworld) ~
				{
					FAMILY();
					playerPos=200;
				}
				else  // set to 2 (WANDER FURTHER HEALTHY AND FINDS SECRET CAVE) ~
				{
					CAVE();
					playerPos = 2;
				}
			}
			else if (playerPos==200) //Dream land
			{
				sayln("~What do you think?");
				newLine();                                                      delay(500);
				sayln("1. They're real");
				sayln("2. They're not real");
				int playerChoice = scan.nextInt();                              delay(1000);
				clearScreen();

				if (playerChoice==1) // END live with it
				{
					TOGETHER();
					newLine();
					sayln("=Enter any number to continue");
					int next = scan.nextInt();
					clearScreen();                                              delay(2000);
					TOGETHERend();
					tryAgainOr();
					int retry = scan.nextInt();
					if (retry==1)
					{
						clearScreen();
						delay(2000);
						FAMILY();
						playerPos=200; 
					} else { playerPos=-2; }
				}
				else  // set to 201 (Break through the simulation) ~
				{
					BREAKINGOUT();
					delay(5000);
					sayln("=Enter any number to continue");
					int next = scan.nextInt();
					
				  JUMPOUT();
					playerPos = 201;
				}
			}
			else if (playerPos==2)  //magic land
			{
				sayln("~What are you going to do? ");
				newLine();                                                      delay(500);
				sayln("1.Prepare to fight with whatever you can find!");
				sayln("2.Hide?");
				int playerChoice = scan.nextInt();                              delay(1000);

				if (playerChoice==1) // Fight sim set to 3
				{
					BEGINFIGHT();
					sayln("=Enter any number to continue");
					int next = scan.nextInt();
					clearScreen();
					int points = 0;
					int attack = 0;
					int healthPoints = 10;
					int durability = 10;
					int fightNumber = 0;
					int randoNumber = 0;
					boolean hasSpaghet = true;
					boolean win = false;
					
					while (healthPoints > 0)
					{
						sayln("The fight begins!");
						newLine();delay(1000);
						if (hasSpaghet)
						{
							sayln("You hold your ancient spaghetti gingerly.");
							randoNumber++;
						} else {
							sayln("You are now empty-handed without your trusty spaghet at your side");
							randoNumber+=2;
						}
						newLine();delay(1000);
						if (durability == 10)
						{
							sayln("It looks sturdy enough to block an attack");
							randoNumber+=5;
						}
						else if (durability <= 6)
						{
							sayln("It seems to be holding up alright with only a few minor scratches.");
							randoNumber+=2;
						} 
						else if (durability <= 3)
						{
							sayln("It seems like it's seen better days before but still funtional as a shield");
							randoNumber+=8;
						} 
						else if (durability <= 1)
						{
							sayln("It looks to be quite beaten up.");
							sayln("As ancient as it is, it won't hold up much longer.");
							randoNumber+=4;
						} else { sayln("Looks like you've only got your bare fists to save youself");
							randoNumber+=1000;}
						newLine();delay(1000);
						if (healthPoints == 10)
						{
							sayln("You take a breath to calm yourself down.");
							randoNumber+=5;
						}
						else if (healthPoints <= 6)
						{
							// sayln("It hurts where it bleeds but it's not that bad.");
							sayln("You still got most of your health points.");
							randoNumber+=7;
						} 
						else if (healthPoints <= 3)
						{
							// sayln("You've lost alot of blood from that last attack and you know that you can't take much more of it");
							sayln("You've lost alot of your health points, you have to win fast.");
							randoNumber++;
						} 
						else if (healthPoints <= 1)
						{
							// sayln("You are covered in wounds and quickly bleeding out.");
							// sayln("You can't get hit by a single attack or you might pass out.");
							sayln("You are in great danger!");
							sayln("You only have a singular health point left!");
							randoNumber+=26;
						}
						fightNumber = randoNumber%3;
						newLine();delay(1000);
						if (fightNumber == 0) 
						{
							sayln("He steadies himself and grips the knife tightly.");
							sayln("You anticipate him to attempt a jab at you.");
							attack = 0;
						}
						else if (fightNumber == 1)
						{
							sayln("He seems to be weary and indecisive.");
							sayln("He seems to be more cautious of your movements.");
							attack = 1;
						} 
						else if (fightNumber == 2) 
						{
							sayln("He furrows his brows and bellows in rage.");
							sayln("You anticipate a heavy strike!");
							attack = 2;
						}
						newLine();delay(1000);
						sayln("What is your move?");
						sayln("1. Strike back!");
						sayln("2. Dodge!");
						sayln("3. Block!");
						int playerMove = scan.nextInt();
						if (playerMove == 1)
						{
							if (attack == 0)
							{
								sayln("You prepare to wack as hard as you could at his head.");
								newLine();delay(2000);
								sayln("As he charges at you with his machete, you notice that you are also unable to evade his attack.");
								newLine();delay(2000);
								sayln("You exchange attacks but he took more healthpoints out of you than you did to him!");
								newLine();delay(2000);
								healthPoints-=3;
								points+=2;
							}
							else if (attack == 1)
							{
								sayln("You prepare to wack as hard as you could at his head.");
								newLine();delay(2000);
								sayln("But he anticipates you to attack him and he dodges to the side before you could hit him.");
								newLine();delay(2000);
								sayln("He manages to slice your arm as you were trying to regain your footing.");
								newLine();delay(2000);
								healthPoints-=3;
							}
							else if (attack == 2)
							{
								sayln("You prepare to wack as hard as you could at his head.");
								newLine();delay(2000);
								sayln("But his immense speed and power overcomes your puny attack.");
								newLine();delay(2000);
								sayln("He cuts a gash that spans from your shoulder to your stomach.");
								newLine();delay(2000);
								healthPoints-=7;
							}
						} 
						else if (playerMove == 2)
						{
							if (attack == 0)
							{
								sayln("You prepare to dash to your right as soon as he attacks.");
								newLine();delay(2000);
								sayln("As he charges at you with his machete, you feel the wind as he passes you.");
								newLine();delay(2000);
								sayln("You kick him against the wall as he tries to regain his footing.");
								newLine();delay(2000);
								points++;
							}
							else if (attack == 1)
							{
								sayln("You prepare to dash to your right as soon as he attacks.");
								newLine();delay(2000);
								sayln("But he doesn't seem to launch an attack on you.");
								newLine();delay(2000);
								sayln("You catch him off guard by pouncing at him.");
								newLine();delay(2000);
								points+=3;
							}
							else if (attack == 2)
							{
								sayln("You prepare to dash to your right as soon as he attacks.");
								newLine();delay(2000);
								sayln("His immense speed and power launches right passed you and sails right into the wall behind you.");
								newLine();delay(2000);
								sayln("You wack him across the head and kick him until he regains his footing.");
								newLine();delay(2000);
								points+=7;
							}
						}
						else 
						{
							if (attack == 0)
							{
								sayln("You prepare to block the next attack he launches.");
								delay(2000);
								if (hasSpaghet)
								{
									sayln("As he charges at you with his machete, the metal connects with the spaghetti with a loud thunk.");
									newLine();delay(2000);
									sayln("You take the perfect opportunity to make a counter-attack and strike him in the face.");
									newLine();delay(2000);
									durability-=3;
									points+=3;
								} else {
									sayln("As he charges at you with his machete, the metal slices your arm.");
									newLine();delay(2000);
									sayln("You take the opportunity to make a counter-attack and strike him in the face.");
									newLine();delay(2000);
									healthPoints-=4;
									points+=2;
								}
								
							}
							else if (attack == 1)
							{
								sayln("You prepare to block the next attack he launches.");
								newLine();delay(2000);
								sayln("But he doesn't seem to launch an attack on you.");
								newLine();delay(2000);
								sayln("You both awkwardly stare at each other...");
								newLine();delay(2000);
							}
							else if (attack == 2)
							{
								sayln("You prepare to block the next attack he launches.");
								newLine();delay(2000);
								if (hasSpaghet)
								{
									sayln("His immense speed and power come crashing down onto your shield.");
									newLine();delay(2000);
									sayln("You are overwhelmed by the strength of the attack and a large chunk of your ancient spaghet flies off.");
									newLine();delay(2000);
									sayln("You both regain your footing.");
									durability-=5;
								} else {
									sayln("His immense speed and power come crashing down onto your arms.");
									newLine();delay(2000);
									sayln("You are overwhelmed by the strength of the attack and a suffer a severe injury.");
									newLine();delay(2000);
									sayln("You both regain your footing but you feel nauseous.");
									healthPoints-=5;
								}
								
							}
						}
						newLine();delay(1000);
						if (healthPoints <= 0)
						{
							sayln("It seems that you no longer have health points to continue the simulation.");
							newLine();delay(2000);
							sayln("Atleast you knew you tried your best, but sometimes our best is not enough.");
							break;
						}
						else if (points >= 20)
						{
							clearScreen();
							delay(3000);
							sayln("You won.");
							newLine();delay(1000);
							sayln("Above all odds, you won with an ancient stick of spaghetti.");
							newLine();delay(1000);
							sayln("Even you couldn't believe it.");
							win = true;
							break;
						}
						else if (durability <= 0)
						{
							sayln("You lost your faithful spaghet.");
							newLine();delay(1000);
							sayln("It crumbles in your fingers and you mourne the loss of your shield that protected you from danger.");
							newLine();delay(1000);
							sayln("You can no longer block attacks without taking damage.");
							hasSpaghet = false;
						}
						sayln("Enter anything to continue.");
						String next1 = scan.nextLine();
						randoNumber+=2;
						
						
						delay(2000);
						
						clearScreen();
					}
					if (win)
					{
						delay(3000);
						clearScreen();
						playerPos = 3;
					} else {
						sayln("=Enter any number to continue");
						String next2 = scan.nextLine();
						clearScreen();                                              delay(2000);
						DEFEATEDend();
						tryAgainOr();
						int retry = scan.nextInt();
						if (retry==1)
						{
							clearScreen();
							delay(2000);
							CAVE();
							playerPos=2; 
						} else { playerPos=-2; }
					}
					
				}
				else  // knocked out end
				{
					KNOCKEDOUT();
					sayln("=Enter any number to continue");
					int next = scan.nextInt();
					clearScreen();                                              delay(2000);
					CAUGHTend();
					tryAgainOr();
					int retry = scan.nextInt();
					if (retry==1)
					{
						clearScreen();
						delay(2000);
						CAVE();
						playerPos=2; 
					} else { playerPos=-2; }
				}
			}
			else if (playerPos==3) //wizard land pt2
			{
				TELEPORTER();
				sayln("=Enter any number to continue");
				int next = scan.nextInt();
				delay(1000);
				clearScreen();
				ENTERMAGICWORLD();
				sayln("=Enter any number to continue");
				String next2 = scan.nextLine();
				clearScreen();
				MAGICtbc();
				int pick = scan.nextInt();
				if (pick ==1)
				{
					clearScreen();
					delay(5000);
					CREDITS();
					newGame = false;
					break;
				} else {
					playerPos = -2;
					clearScreen();
				}
			}
			else if (playerPos==201)
			{
				SIMULATIONBREAK();
				sayln("=Enter any number to start");
				int next = scan.nextInt();
				clearScreen();
				
				String password1 = "02172754";
				String password1Hint = "My sister's birthdate, ignore the dashes, mmddyyyy";
				String password2 = "Houston";
				String password2Hint = "My best friend, 1st letter is capital";
				boolean passwordGuessor = true;
				boolean passwordGuesser1 = true;
				boolean passwordGuesser2 = true;
				boolean passwordGuesser3 = true;
				String password3 = playerName;
				String password3Hint = "You";
				int playerNameLength = playerName.length();
				int correctCount=0;
				while(passwordGuessor)
				{
					if (correctCount==0)
					{
						while(passwordGuesser1)
						{
							sayln("──▒▒▒▒▒▒───▄████▄");
							sayln("─▒─▄▒─▄▒──███▄█▀");
							sayln("─▒▒▒▒▒▒▒─▐████──█─█");
							sayln("─▒▒▒▒▒▒▒──█████▄");
							sayln("─▒─▒─▒─▒───▀████▀");
							newLine();
							sayln("Enter your password:");
							sayln("_ _ - _ _ - _ _ _ _");
							newLine();
							sayln("Forgot Password?");
							sayln(password1Hint);
							newLine();
							newLine();
							sayln("You look around the room...");
							newLine();
							sayln("Floating Note 1: Emma wants some nanoswarm earrings for her birthday but I also ");
							sayln("got to get Carole some flowers for Valentines Day. So much work all in one month...");
							newLine();
							sayln("Floating Note 2: 17 this, 17 that. Wonder why 17 means so much to Emma.");
							newLine();
							sayln("Floating Note 3: Being the older brother sucks!!! She acts like she can still be the same high school ");
							sayln("girl she used to be... Like grow up! We're only 4 years apart!");
							newLine();
							sayln("Floating Note 4: 2790 New year resolution- Get back into shape. Never too late to change.");
							sayln("I wonder if CyTech hire 40-year olds this year...");
							newLine();
							sayln("Date on desk: 4-21-2790");
							newLine();
							String playerGuess = scan.nextLine();
							if(playerGuess.equals(password1))
							{
								passwordGuesser1=false;
								correctCount++;
								newLine();
								delay(2000);
								sayln("Password Accepted");
								delay(3000);
								clearScreen();
								break;
							} else {
								sayln("Incorrect Password");
								delay(3000);
								clearScreen();
							}
							
						}
					}
					else if (correctCount==1)
					{
						while(passwordGuesser2)
						{
							sayln("──▒▒▒▒▒▒───▄████▄");
							sayln("─▒─▄▒─▄▒──███▄█▀");
							sayln("─▒▒▒▒▒▒▒─▐████──█─█");
							sayln("─▒▒▒▒▒▒▒──█████▄");
							sayln("─▒─▒─▒─▒───▀████▀");
							newLine();
							sayln("Enter your password:");
							sayln("_ _ _ _ _ _ _");
							newLine();
							sayln("Forgot Password?");
							sayln(password2Hint);
							newLine();
							newLine();
							sayln("Floating Digital Photograph consists of 4 boys that look like great friends.");
							newLine();
							sayln("First from the left: Me");
							newLine();
							sayln("Second: Houston");
							sayln("He's was there from the beginning.");
							newLine();
							sayln("Third: William");
							sayln("My go to tech guy.");
							newLine();
							sayln("Fourth: Gabriel");
							sayln("Makes everything fun.");
							newLine();
							String playerGuess = scan.nextLine();
							if(playerGuess.equals(password2))
							{
								passwordGuesser2=false;
								correctCount++;
								newLine();
								delay(2000);
								sayln("Password Accepted");
								delay(3000);
								clearScreen();
							} else {
								sayln("Incorrect Password");
								delay(3000);
								clearScreen();
							}
							
						}
					} 
					else
					{
						while(passwordGuesser3)
						{
							sayln("──▒▒▒▒▒▒───▄████▄");
							sayln("─▒─▄▒─▄▒──███▄█▀");
							sayln("─▒▒▒▒▒▒▒─▐████──█─█");
							sayln("─▒▒▒▒▒▒▒──█████▄");
							sayln("─▒─▒─▒─▒───▀████▀");
							newLine();
							sayln("Enter your password:");
							for (int i = 0; i < playerNameLength; i++)
								{
									say("_ ");
								}
							newLine();
							newLine();
							sayln("Forgot Password?");
							sayln(password3Hint);
							newLine();
							newLine();
							delay(2000);
							REMEMBERWHOYOUARE();
							clearScreen();
							sayln("──▒▒▒▒▒▒───▄████▄");
							sayln("─▒─▄▒─▄▒──███▄█▀");
							sayln("─▒▒▒▒▒▒▒─▐████──█─█");
							sayln("─▒▒▒▒▒▒▒──█████▄");
							sayln("─▒─▒─▒─▒───▀████▀");
							newLine();
							sayln("Enter your password:");
							for (int i = 0; i < playerNameLength; i++)
								{
									say("_ ");
								}
							newLine();
							newLine();
							sayln("Forgot Password?");
							sayln(password3Hint);
							newLine();
							newLine();
							String playerGuess = scan.nextLine();
							if(playerGuess.equals(password3))
							{
								passwordGuesser3=false;
								correctCount++;
								newLine();
								delay(2000);
								sayln("Password Accepted");
								delay(3000);
								clearScreen();
								break;
							} else {
								sayln("Incorrect Password");
								delay(3000);
								clearScreen();
							}
							
						}
					}
					if (correctCount==3)
					{
						delay(5000);
						clearScreen();
						delay(4000);
						sayln("Access Granted");
						break;
					}
				}
				
				clearScreen();
				sayln("-You've gotten access to the computer.");
				lineDelay();
				sayln("-A chill runs down your spine when you open the file explorer...");
				lineDelay();
				sayln("=Enter any number to open file explorer");
				int next2 = scan.nextInt();
				clearScreen();
				delay(2000);
				sayln(playerName + ".memory");
				delay(5000);
				SURPRISEGREETING();
				clearScreen();
				delay(1000);
				FUTUREtbc();
				int pick = scan.nextInt();
				if (pick ==1)
				{
					clearScreen();
					delay(5000);
					CREDITS();
					newGame = false;
					break;
				} else {
					playerPos = -2;
					clearScreen();
				}
			}
			else if (playerPos==101)
			{
				sayln("~What do you think?");
				newLine();                                                      delay(500);
				sayln("1. I trust him!");
				sayln("2. Nope, nope! Not at all!");
				int playerChoice = scan.nextInt();                              delay(1000);
				clearScreen();

				if (playerChoice==1) // destruction of human realm ~
				{
					TELEPORTTOEARTH();
					sayln("=Enter any number to continue");
					int next = scan.nextInt();
					delay(1000);
					clearScreen();
					CRYSTALS();
					sayln("=Enter any number to continue");
					int next1 = scan.nextInt();
					delay(1000);
					clearScreen();
					BETRAYEDend();
					tryAgainOr();
					int retry = scan.nextInt();
					if (retry==1)
					{
						clearScreen();
						delay(2000);
						CAVE();
						playerPos=2; 
					} else { playerPos=-2; }
				}
				else  // set to 102 to the tech and pipes ~
				{
					ESCAPETOPIPES();
					sayln("=Enter any number to continue");
					int next = scan.nextInt();
					clearScreen();
					boolean pipeGame = true;
					String urPipe = "╚ ";
					String drPipe = "╔ ";
					String luPipe = "╝ ";
					String ldPipe = "╗ ";
					String hPipe = "═ ";
					String vPipe = "║ ";
					String tPipe = "╦ ";
					String utPipe = "╩ ";
					String ltPipe = "╠ ";
					String rtPipe = "╣ ";
					
					//my symbols
					//╚ ╔ ╝ ╗ 
					//═ ║ 
					//╦ ╩ ╠ ╣ 
					//♥ ♣ ♦ ☻ ♠ 
			
					String[][] gridCurrentPipes = {
							{"╔ ","║ ","╣ ","═ ","╝ "},
							{"♥ ","╩ ","╦ ","♣ ","║ "},
							{"╝ ","╗ ","╗ ","║ ","╝ "},
							{"═ ","♦ ","╠ ","╩ ","♠ "},
							{"╚ ","╗ ","☻ ","╝ ","╔ "}
					};
					//main part of the thing
					
					while (pipeGame == true)
					{
						sayln("   1 2 3 4 5");
						sayln("   | ");
						for (int i = 0; i < gridCurrentPipes.length; i++) // prints row
						{ 
							int yAxis = i+1;
							System.out.print(i+1 + "  ");
							for (int j = 0; j < gridCurrentPipes[i].length; j++) // prints column
							{ 
								say(gridCurrentPipes[i][j]);
							}
							newLine();
						}
						sayln("           |");
						sayln("Pipes will turn 90° clockwise.");
						GridParam gridCheck = new GridParam(1,1, gridCurrentPipes);
						if (gridCheck.pipeCheck() == true)
						{
							pipeGame=false;
							break;
						}
						
						say("Type row number of pipe: ");
						int playerRow = scan.nextInt();
						newLine();
						say("Type column number of pipe: ");
						int playerColumn = scan.nextInt();
						newLine();
						
						GridParam playerResponse = new GridParam(playerRow, playerColumn, gridCurrentPipes);
						String pipe = playerResponse.gridPipe();
						if (pipe.equals(urPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = drPipe;
						} else if (pipe.equals(drPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = ldPipe;
						} else if (pipe.equals(ldPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = luPipe;
						} else if (pipe.equals(luPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = urPipe;
						} else if (pipe.equals(hPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = vPipe;
						} else if (pipe.equals(vPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = hPipe;
						} else if (pipe.equals(tPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = rtPipe;
						} else if (pipe.equals(rtPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = utPipe;
						} else if (pipe.equals(utPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = ltPipe;
						} else if (pipe.equals(ltPipe))
						{
							gridCurrentPipes[playerRow-1][playerColumn-1] = tPipe;
						} else {
							sayln("The crystals don't seem to budge...");
						}
						clearScreen();
					}
					clearScreen();
					delay(1000);
					DOOROPEN();
					sayln("=Enter any number to continue");
					int next1 = scan.nextInt();
					clearScreen();
					delay(2000);
					sayln("TO BE CONTINUED: The Robots");
					lineDelay();
					sayln("Thank you for playing! Maybe Part 2 of Island Escape will continue the story...");
					lineDelay();
					sayln("Sorry for the cliff-hanger but there are other endings!");
					lineDelay();
					sayln("1. Roll Credits");
					sayln("2. Go back to beginning");
					int pick = scan.nextInt();
					if (pick ==1)
					{
						clearScreen();
						delay(5000);
						CREDITS();
						newGame = false;
						break;
					} else {
						playerPos = -2;
						clearScreen();
					}
				}
			}
		}
		scan.close(); // prevents resource leak
	}
}