package com.bridleplates.fullstackreviewsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BreedPopulator implements CommandLineRunner {

	@Autowired
	DisciplineRepository disciplineRepo;
	@Autowired
	BreedRepository breedRepo;
	@Autowired
	TagRepository tagRepo;
	@Autowired
	CommentRepository commRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Comment[] horseComment = new Comment[] { commRepo.save(new Comment("broken down poor horse")), commRepo.save(new Comment("fast as lightning"))};

		Breed Thoroughbred = breedRepo.save(new Breed("Thoroughbred",
				"The typical Thoroughbred stands just over 16 hands, and can be gray, bay, dark bay, roan, chestnut, white, buckskin, black, perlino, palomino, cremello, or brown in color. "
						+ "Though primarily bred as a racehorse due to being fast, strong, and athletic. This breed features a long neck as well as a chiseled head with widely spaced eyes. These horses have deep shoulders, a short and evenly curved back, a strong and deep chest, "
						+ "well-defined and high withers, and strong hindquarters. The Thoroughbred has a bold and spirited personality, and as such, may be too difficult to handle for a beginner. "
						+ "An intermediate or advanced rider with confidence, knowledge, and experience will find this highly intelligent horse to be the perfect companion.",
				"thoroughbred-sit-tristam1.jpg", "thoroughbred-sit-tristam3.jpg", "thoroughbred-sit-tristam2.jpg"));
		Breed Warmblood = breedRepo.save(new Breed("Warmblood",
				"A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and "
						+ "registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold "
						+ "blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and "
						+ "Africa during the Middle Ages.",
				"quatty.jpg", "quatty2.jpg", "quatty3.jpg"));
		Breed QuarterHorse = breedRepo.save(new Breed("Quarter Horse",
				"The American Quarter Horse is one of the oldest recognized breeds of horses in the United States. The breed originated "
						+ "around the 1660s as a cross between native horses of Spanish origin used by the earliest colonists and English horses imported to Virginia from about 1610. By the late 17th "
						+ "century, these horses were being raced successfully over quarter-mile courses in Rhode Island and Virginia, and hence received the name Quarter Horses. Modern American Quarter "
						+ "Horses are short and stocky, with heavy muscular development; short, wide heads; and deep, broad chests. Their colors vary, but all are solid. The height of mature animals "
						+ "varies from 14.3 to 16 hands.",
				"qh1.jpg", "qh3.jpg", "qh2.jpg"));
		Breed Arabian = breedRepo.save(new Breed("Arabian",
				"The Arabian is the oldest purebred in the world and foundation horse for many modern light breeds including some we also have "
						+ "featured on our site, such as the Thoroughbred and Quarter Horse. Attributes include a dished face, large, expressive eyes set wide apart; arched neck with a clean throatlatch; "
						+ "short back (often, Arabians have one less vertebrae than other breeds); and high tail carriage. The average Arabian horse stands 15 hands at the withers and weighs 1,000 pounds. "
						+ "Arabian horses were bred to perform under harsh desert conditions and keep going beyond the point of exhaustion. This has given the breed incredible stamina and courage. "
						+ "The Arabian horse is also recognized as being intelligent and easy to train. ",
				"arab2.jpg", "arab1.jpg", "arab.jpg"));
		Breed Mini = breedRepo.save(new Breed("Miniature Horse",
				"Miniature Horses are no taller than 38 inches and come in many colors and patterns: pintos, appaloosas, buckskins, palominos as well\r\n"
						+ "as the more traditional colors: sorrel, white, blue, roan, black, gray and dapple. They are easily trained, have a gentle and affectionate nature, and can pull four times their own weight, "
						+ "which is usually 150-350lbs. These horses are descended from Shetland ponies and were selectively inbred for their size. This little horse is suitable to a variety of uses: as pets, "
						+ "show animals, and a form of therapy for disabled people and guides for the blind. Though tempting, Miniature Horses should never be ridden by anybody over 70lbs.",
				"bubbarip.jpg", "mini2.jpg", "mini3.jpg"));
		Breed BudweiserHorse = breedRepo.save(new Breed("Budweiser Clydesdale",
				"The Clydesdale better know as the Budweiser Horse is a breed of draft horse named for and derived from the farm horses of Clydesdale, a county in Scotland. Although "
						+ "originally one of the smaller breeds of draught horses, it is now a tall breed. Often bay in color, they show significant white markings due to the presence of sabino genetics. They are shown in driving and typically have 6 horses to a hitch ",
				"clydesdale1.jpg", "clydesdale3.jpg", "clydesdale2.jpg"));

		Discipline QhWestern = disciplineRepo.save(new Discipline("Quarter Horse Western",
				"The discipline of Western is as broad in spectrum as the vast plains of the Old West from which it originates. There are a multitude of classes from which to choose, from Western pleasure to trail to working cow horse; yet all classes share the same heritage in the working ranch horse of America’s past. Horses are shown in Western stock saddles, often trimmed in silver, and riders don familiar-looking Western attire (although it can be somewhat more reminiscent of the cowboys and cowgirls of TV fame than that of the working ranch hand’s simple and plain clothing). Still, the roots are there. The leather chaps originally designed to protect a cowboy’s legs while riding and working and also to keep his clothing from tangling with the tumbleweed, bramble and other brush encountered on the trail, are still worn in today’s show ring. And, of course, the iconic broad-brimmed cowboy hat remains relatively unchanged from its 1800s predecessor (Source: United States Equestrian Federation).",
				"QhWestern-1.jpg", "QhWestern-2.jpg", "QhWestern-3.jpg", horseComment));
		Discipline QhHunter = disciplineRepo.save(new Discipline("Quarter Horse Hunter",
				"The modern show ring hunter’s roots were established in Europe when gentry rode across the countryside hunting for game, often aided by dogs used to track the prey. The horses were necessary to carry their riders many miles over the varied terrain of the countryside in pursuit of their game, often negotiating the creeks, ditches, walls, and fences they encountered along the way. Although somewhat recreational from its beginning, the task of the working hunter became less rugged and more refined and competitive, thus the show ring hunter was born. Subjectively judged, the modern show ring hunter must still exhibit the traits desired of a good field hunter— calm disposition, good manners, smooth gaits, steady way of going, and pleasant and efficient jumping ability, but must do so with style, presence and superior technique. Conformation, athleticism, disposition, and jumping form all combine to define a winning show ring hunter. A wide range of sections and classes is offered for hunter riders in today’s show ring, both over fences and on the flat. Additionally, hunter classes exist for virtually every breed of horse or pony and for any level of rider. Recently, a new international-level class was created with the goal of bringing tradition and basic riding principles back to the sport of showing hunters. The International Hunter Derby tests a horse’s keenness, athleticism, and handiness as it negotiates obstacles typically encountered while galloping in the open field (Source: The United States Hunter Jumper Association).",
				"QhHunter-1.jpg", "QhHunter-2.jpg", "QhHunter-3.jpg", horseComment));
		Discipline QhShowJumping = disciplineRepo.save(new Discipline("Quarter Horse Show Jumper",
				"jumping enjoys its place, both nationally and internationally, as one of the most popular and perhaps most recognizable equestrian events, aside from Thoroughbred horse racing.\n"
						+ "At its highest competitive level, Jumping is recognized as one of the three Olympic equestrian disciplines alongside both Dressage and Eventing.  Essentially, what pole vaulting, high jump and hurdles are to track and field, Jumping is to equestrian sport.\n"
						+ "Spectator friendly and easy to understand, the object for the Jumper is to negotiate a series of obstacles, where emphasis is placed on height and width, and to do so without lowering the height or refusing to jump any of the obstacles. The time taken to complete the course is also a factor.\n"
						+ "The Jumping course tests a horse’s athleticism, agility and tractability while simultaneously testing a rider’s precision, accuracy and responsiveness.  Perhaps most importantly, Jumping tests the partnership between horse and rider.\n"
						+ "Competitive Jumping has enjoyed immense popularity worldwide since the early 1900s, and the discipline continues to grow.  In today’s show ring, horses and ponies of all sizes and breeds compete in Jumping classes representing varying levels of challenge. US Equestrian runs numerous Programs for Jumping riders at all levels.\n"
						+ "Likewise, classes exist for virtually every level of rider from the child novice to the seasoned international professional.\n"
						+ "(Source: The United States Hunter Jumper Association)",
				"QhShowJumping-1.jpg", "QhShowJumping-2.jpg", "QhShowJumping-3.jpg", horseComment));
		Discipline QhRaceHorse = disciplineRepo.save(new Discipline("Quarter Horse Racing",
				"“The Quarter Horse is faster out of the gate than the Thoroughbred. It’s most important to get a good break from the gate. Your horse has to be alert.\n"
						+ "A jockey in a Quarter Horse race only has to be ready for the explosive power out of the gate but keep the horse as straight as possible while hoping the rivals beside him do the same thing.\n"
						+ "Once a jockey breaks out of the gate in a Quarter Horse race, the name of the game is to ride hard and fast for anywhere from 110 to 440 yards, or about seven to 21 seconds. A rider will tell you it’s more about the hustle rather than style.\n"
						+ "(Source: Ontario Racing)",
				"QhRaceHorse-1.jpg", "QhRaceHorse.jpg", "QhRaceHorse-3.jpg", horseComment));

		Discipline TbWestern = disciplineRepo.save(new Discipline("Thoroughbred Western",
				"The discipline of Western is as broad in spectrum as the vast plains of the Old West from which it originates. There are a multitude of classes from which to choose, from Western pleasure to trail to working cow horse; yet all classes share the same heritage in the working ranch horse of America’s past.\n"
						+ "Horses are shown in Western stock saddles, often trimmed in silver, and riders don familiar-looking Western attire (although it can be somewhat more reminiscent of the cowboys and cowgirls of TV fame than that of the working ranch hand’s simple and plain clothing). Still, the roots are there.\n"
						+ "The leather chaps originally designed to protect a cowboy’s legs while riding and working and also to keep his clothing from tangling with the tumbleweed, bramble and other brush encountered on the trail, are still worn in today’s show ring. And, of course, the iconic broad-brimmed cowboy hat remains relatively unchanged from its 1800s predecessor.\n"
						+ "(Source: United States Equestrian Federation)",
				"TbWestern-1.jpg", "TbWestern-2.jpg", "TbWestern-3.jpg", horseComment));
		Discipline TbEventing = disciplineRepo.save(new Discipline("Thoroughbred Eventer",
				"Thoroughbreds aren’t as dominant in the sport as they were in the days of the classic three-day event format, where the cross-country test followed the steeplechase and roads-and-tracks phases.\n"
						+ "Their natural endurance and stamina made them ideally suited to that longer format although the challenges at the three- and four-star level today still require that type of endurance. Even though the speed and endurance phases have been eliminated in competition during this era,\n"
						+ "Thoroughbreds can hold their own with those warmbloods who became popular as the dressage and show-jumping phases gained more importance and the test on cross-country day was shortened.\n"
						+ "(Source: practicalhorsemanmag.org)",
				"TbEventing-1.jpg", "TbEventing-2.jpg", "TbEventing-3.jpg", horseComment));
		Discipline TbShowJumping = disciplineRepo.save(new Discipline("Thoroughbred Show Jumper",
				"Jumping enjoys its place, both nationally and internationally, as one of the most popular and perhaps most recognizable equestrian events, aside from Thoroughbred horse racing.\n"
						+ "At its highest competitive level, Jumping is recognized as one of the three Olympic equestrian disciplines alongside both Dressage and Eventing.  Essentially, what pole vaulting, high jump and hurdles are to track and field, Jumping is to equestrian sport.\n"
						+ "Spectator friendly and easy to understand, the object for the Jumper is to negotiate a series of obstacles, where emphasis is placed on height and width, and to do so without lowering the height or refusing to jump any of the obstacles. The time taken to complete the course is also a factor.\n"
						+ "The Jumping course tests a horse’s athleticism, agility and tractability while simultaneously testing a rider’s precision, accuracy and responsiveness.  Perhaps most importantly, Jumping tests the partnership between horse and rider.\n"
						+ "Competitive Jumping has enjoyed immense popularity worldwide since the early 1900s, and the discipline continues to grow.  In today’s show ring, horses and ponies of all sizes and breeds compete in Jumping classes representing varying levels of challenge. US Equestrian runs numerous Programs for Jumping riders at all levels.\n"
						+ "Likewise, classes exist for virtually every level of rider from the child novice to the seasoned international professional.\n"
						+ "(Source: The United States Hunter Jumper Association)",
				"JuJu.jpg", "TbShowJumping-2.jpg", "TbShowJumping-3.jpg", horseComment));
		Discipline TbDressage = disciplineRepo.save(new Discipline("Thoroughbred Dressage",
				"With warmblood breeding establishing an image of what a dressage horse's conformation and movement should look like, it is not impossible, but definitely more difficult, for traditional breeds like the Thoroughbred to be competitive in the sport.\n"
						+ "Warmbloods may dominate in today’s dressage world, but check the pedigrees of many successful modern sport horses and there tends to be a great deal of Thoroughbred blood running through their veins. over the years, some full-blood Thoroughbreds have excelled in the dressage arena, even after successful racing careers.\n"
						+ "Although Thoroughbreds fell out of favor for dressage for many years, some dressage riders are beginning to realize that the modern, refined warmblood is not necessarily so different from a nicely built Thoroughbred—and that Thoroughbreds often can be had for less money.\n"
						+ "All horses will perform a four-minute demonstration ride before a separate judge in a standard arena to include walk, trot, and canter in both directions. Riders should perform whatever movements best demonstrate the level and quality of their training within the United States Dressage Federation (USDA) Training Pyramid.\n"
						+ "Note that judges will penalize efforts to perform movements beyond a horse’s level of training and development. The top five scorers will perform a four-minute demonstration ride as described above to music during the Finale. If riders do not select music the announcer will do so.\n"
						+ "The demonstration ride will be judged with scores in the following six categories on a scale of 0 to 10: rhythm (10 points), relaxation (10 points), connection (10 points), impulsion (10 points), straightness (10 points), and level of development (10 points). The maximum achievable score will be 60.\n"
						+ "The finale will be scored by two judges in the same manner as the demonstration ride, with a maximum achievable score of 60. Final placings for the top five finishers will be the sum of their three scores. Placings below fifth will be determined by the sum of their two scores. Ties will be broken with the collective remarks score from the test and then by the score of the demonstration ride.\n"
						+ "(Source: retiredracehorseproject.org)",
				"TbDressage-1.jpg", "TbDressage-2.png", "TbDressage-3.jpg", horseComment));
		Discipline TbHunter = disciplineRepo.save(new Discipline("Thoroughbred Hunter ",
				"The modern show ring hunter’s roots were established in Europe when gentry rode across the countryside hunting for game, often aided by dogs used to track the prey.\n"
						+ "The horses were necessary to carry their riders many miles over the varied terrain of the countryside in pursuit of their game, often negotiating the creeks, ditches, walls, and fences they encountered along the way.\n"
						+ "Although somewhat recreational from its beginning, the task of the working hunter became less rugged and more refined and competitive, thus the show ring hunter was born.\n"
						+ "Subjectively judged, the modern show ring hunter must still exhibit the traits desired of a good field hunter— calm disposition, good manners, smooth gaits, steady way of going, and pleasant and efficient jumping ability—\n"
						+ "but must do so with style, presence and superior technique. Conformation, athleticism, disposition, and jumping form all combine to define a winning show ring hunter. A wide range of sections and classes is offered for hunter riders in today’s show ring, both over fences and on the flat.\n"
						+ "Additionally, hunter classes exist for virtually every breed of horse or pony and for any level of rider. Recently, a new international-level class was created with the goal of bringing tradition and basic riding principles back to the sport of showing hunters.\n"
						+ "The International Hunter Derby tests a horse’s keenness, athleticism, and handiness as it negotiates obstacles typically encountered while galloping in the open field.\n"
						+ "(Source: The United States Hunter Jumper Association)",
				"TbHunter-1.jpg", "TbHunter-2.jpg", "TbHunter-3.jpg", horseComment));
		Discipline TbRaceHorse = disciplineRepo.save(new Discipline("Thoroughbred RaceHorse",
				"In Thoroughbred racing, the races are long enough, for the most part, that you can recover from a bad start.\n"
						+ "A Thoroughbred race can range from five furlongs (five-eighths of a mile) to 1 ½ miles therefore, riders have to be judges of pace, masters of horse traffic and able to finesse their mount into having the most power left for the last part of the race.\n"
						+ "(Source: Ontario Racing)",
				"TbRaceHorse-1.jpg", "TbRaceHorse-2.jpg", "TbRaceHorse-3.jpg", horseComment));

		Discipline WarmbloodEventing = disciplineRepo.save(new Discipline("Warmblood Eventer",
				"Eventing could be termed an \"equestrian triathlon.\" It involves working with a horse both on the flat and over fences. The three phases are: dressage, endurance (or cross-country), and show jumping.\n"
						+ "Over the centuries it has developed from the test of the ideal military charger. Eventing has now evolved into an exciting sport attracting interest from all levels of sports enthusiasts, from weekend hobby riders to professional international stars.\n"
						+ "This event has its roots in a comprehensive cavalry test which required mastery of several types of riding. The competition may be run as a one-day event (ODE), where all three events are completed in one day (dressage, followed by cross country and then stadium) or a three-day event (3DE), which is more commonly now run over four days, with dressage on the first two days followed by cross country the next day and then show jumping in reverse order on the final day.\n"
						+ "Eventing was previously known as \"Combined Training\", and the name persists in many smaller organizations. The term \"Combined Training\" is sometimes confused with the term \"Combined Test\" which refers to a combination of just two of the phases, most commonly dressage and show jumping.\n"
						+ "(Source: United States Eventing Association)",
				"WarmbloodEventing-1.jpg", "WarmbloodEventing-2.jpg", "WarmbloodEventing-3.jpg", horseComment));
		Discipline WarmbloodDressage = disciplineRepo.save(new Discipline("Warmblood Dressage",
				"The warmblood establishes an image of what a dressage horse's conformation and movement should look like. Among the “Top 11,” there are seven European breed registries represented: Hanoverian (three horses), Dutch Warmblood (three horses), Oldenburg, Westphalian, Bavarian Warmblood, Russian-bred Trakehner and Danish Warmblood.\n"
						+ "All horses will perform a four-minute demonstration ride before a separate judge in a standard arena to include walk, trot, and canter in both directions. Riders should perform whatever movements best demonstrate the level and quality of their training within the United States Dressage Federation (USDA) Training Pyramid.\n"
						+ "Note that judges will penalize efforts to perform movements beyond a horse’s level of training and development. The top five scorers will perform a four-minute demonstration ride as described above to music during the Finale. If riders do not select music the announcer will do so.\n"
						+ "The demonstration ride will be judged with scores in the following six categories on a scale of 0 to 10: rhythm (10 points), relaxation (10 points), connection (10 points), impulsion (10 points), straightness (10 points), and level of development (10 points). The maximum achievable score will be 60.\n"
						+ "The finale will be scored by two judges in the same manner as the demonstration ride, with a maximum achievable score of 60. Final placings for the top five finishers will be the sum of their three scores. Placings below fifth will be determined by the sum of their two scores. Ties will be broken with the collective remarks score from the test and then by the score of the demonstration ride.\n"
						+ "(Source: retiredracehourseproject.org / dressagetoday.com)",
				"WarmbloodDressage-1.jpg", "WarmbloodDressage-2.jpg", "WarmbloodDressage-3.jpg", horseComment));
		Discipline WarmbloodShowJumping = disciplineRepo.save(new Discipline("Warmblood Show Jumper",
				"Jumping enjoys its place, both nationally and internationally, as one of the most popular and perhaps most recognizable equestrian events, aside from Thoroughbred horse racing.\n"
						+ "At its highest competitive level, Jumping is recognized as one of the three Olympic equestrian disciplines alongside both Dressage and Eventing.  Essentially, what pole vaulting, high jump and hurdles are to track and field, Jumping is to equestrian sport.\n"
						+ "Spectator friendly and easy to understand, the object for the Jumper is to negotiate a series of obstacles, where emphasis is placed on height and width, and to do so without lowering the height or refusing to jump any of the obstacles. The time taken to complete the course is also a factor.\n"
						+ "The Jumping course tests a horse’s athleticism, agility and tractability while simultaneously testing a rider’s precision, accuracy and responsiveness.  Perhaps most importantly, Jumping tests the partnership between horse and rider.\n"
						+ "Competitive Jumping has enjoyed immense popularity worldwide since the early 1900s, and the discipline continues to grow.  In today’s show ring, horses and ponies of all sizes and breeds compete in Jumping classes representing varying levels of challenge. US Equestrian runs numerous Programs for Jumping riders at all levels.\n"
						+ "Likewise, classes exist for virtually every level of rider from the child novice to the seasoned international professional.\n"
						+ "(Source: The United States Hunter Jumper Association)",
				"WarmbloodShowJumping-1.jpg", "WarmbloodShowJumping-2.jpg", "WarmbloodShowJumping-3.jpg", horseComment));
		Discipline WarmbloodHunter = disciplineRepo.save(new Discipline("Warmblood Hunter",
				"The modern show ring hunter’s roots were established in Europe when gentry rode across the countryside hunting for game, often aided by dogs used to track the prey.\n"
						+ "The horses were necessary to carry their riders many miles over the varied terrain of the countryside in pursuit of their game, often negotiating the creeks, ditches, walls, and fences they encountered along the way.\n"
						+ "Although somewhat recreational from its beginning, the task of the working hunter became less rugged and more refined and competitive, thus the show ring hunter was born.\n"
						+ "Subjectively judged, the modern show ring hunter must still exhibit the traits desired of a good field hunter— calm disposition, good manners, smooth gaits, steady way of going, and pleasant and efficient jumping ability—\n"
						+ "but must do so with style, presence and superior technique. Conformation, athleticism, disposition, and jumping form all combine to define a winning show ring hunter. A wide range of sections and classes is offered for hunter riders in today’s show ring, both over fences and on the flat.\n"
						+ "Additionally, hunter classes exist for virtually every breed of horse or pony and for any level of rider. Recently, a new international-level class was created with the goal of bringing tradition and basic riding principles back to the sport of showing hunters.\n"
						+ "The International Hunter Derby tests a horse’s keenness, athleticism, and handiness as it negotiates obstacles typically encountered while galloping in the open field.\n"
						+ "(Source: The United States Hunter Jumper Association)",
				"WarmbloodHunter-1.jpg", "WarmbloodHunter-2.jpg", "WarmbloodHunter-3.jpg", horseComment));

		Discipline ArabShowHack = disciplineRepo.save(new Discipline("Arabian Show Hack",
				"The good English Show Hack horse is neither a dressage horse (although extended and collected gaits are required) nor an English Pleasure rail horse. The English Show Hack\n"
						+ "horse is, however, the epitome of the well-trained rail horse. It has the ability to perform with uninterrupted cadence of all the required gaits in three forms: normal, collected, extended. When asked to extend, the horse's entire frame lengthens and not merely the\n"
						+ "stride. When asked to collect, the entire body becomes supple and round resulting in shorter, higher strides. The English Show Hack horse performs all of its tasks willingly with light contact.\n"
						+ "The ideal English Show Hack horse possesses the best qualities of many other types of show horses into one horse: vitality, presence, animation, supreme quality, excellent performance and impeccable manners.\n"
						+ "Every dimension of this individual is balanced. English Show Hack horse is a great athlete that performs softly at times and boldly other times, always with strength and finesse. This horse earns the respect of the horseman by\n"
						+ "leaving the impression it is fit, highly trained and capable of any task within reason. The English Show Hack Horse is a true joy to ride. English Show Hack is a class for the very well trained horse. Although extended and\n"
						+ "collected gaits are required, it is necessarily a class for just Dressage horses. Elevation and high knee action are not to be emphasized so an English Pleasure horse may not\n"
						+ "necessarily be the ideal horse for this class. It is a class for the very well trained brilliant performance horse. An English Show Hack horse must be able to perform all of the gaits with a noticeable\n"
						+ "transition between the normal, collected and extended gaits.\n"
						+ "The horse must be under complete control and easily ridden. Obedience to the rider is of prime importance.\n"
						+ "If the horse exhibits clear transitions in a balanced and level manner, appearing to be giving comfortable and pleasurable ride, he is performing correctly for this class.\n"
						+ "English Show Hack horses must be balanced and show vitality, animation, presence, clean fine limbs and supreme quality. Soundness is required.The English Show Hack horse must first be a very well trained horse performing all of the gaits and transitions correctly and obediently in a balanced, easy manner.\n"
						+ "The English Show Hack horse must remain light and responsive to the rider while performing with brilliance and with animation\n"
						+ "(Source: Arabian Horse Association Handbook)",
				"ArabShowHack-1.jpg", "ArabShowHack-2.jpg", "ArabShowHack-3.jpg", horseComment));
		Discipline ArabDriving = disciplineRepo.save(new Discipline("Arabian  Driving",
				"The Arabian  Division offers exhibitors four different driving horse options: Carriage Pleasure Driving, County Pleasure Driving, Formal Driving, and Pleasure Driving.\n"
						+ "Competitions may offer Combined Driving but these classes are judged by Combined Driving judges so will not be addressed in this document. \n"
						+ "(Source: Arabian Horse Association Handbook)",
				"ArabDriving-1.jpg", "ArabDriving-2.jpg", "ArabDriving-3.jpg", horseComment));

		Discipline MiniDriving = disciplineRepo.save(new Discipline("Mini Horse Driving",
				"For adults, a Miniature Horse doesn’t make a good riding prospect.\n"
						+ "While arenas are a great place to start and practice new skills, driving out in the world is fun and rewarding. You can drive on trails nearby or trailer your cart and mini to horse-friendly parks.\n"
						+ "(Source: Equisearch)",
				"MiniDriving-1.jpg", "MiniDriving-2.jpg", "MiniDriving-3.jpg", horseComment));
		Discipline DraftDriving = disciplineRepo.save(new Discipline("Draft Horse Driving",
				"A draft horse, draught horse or dray horse, less often called a carthorse, work horse or heavy horse, is a large horse bred to be a working animal doing hard tasks such as plowing and other farm labor.\n"
						+ "The most famous draft horses are undoubtedly the Budweiser Clydesdales. More than 300 years ago, this imposing breed was first developed for farm work in the region of Clydesdale, Scotland. They are most easily recognized for their substantial feather — the long hairs of the lower leg that cover the hooves.\n"
						+ "Despite a dressy appearance, they are capable of pulling a 1-ton load at 5 MPH. The Budweiser Clydesdales made their first-ever appearance on April 7, 1933. A gift from August A. Busch, Jr. and Adolphus Busch to their father in celebration of the repeal of Prohibition,\n"
						+ "the presentation of the original two six-horse hitches of champion Clydesdales moved father, sons and drivers to tears. The phrase “crying in your beer” was officially coined shortly thereafter.\n"
						+ "(Source Anheuser-Busch, Budweiser)",
				"DraftDriving-1.jpg", "DraftDriving-2.png", "DraftDriving-3.jpg", horseComment));

		Breed[] westernTackBreeds = new Breed[] { Thoroughbred, QuarterHorse };
		Breed[] huntingTackBreeds = new Breed[] { Thoroughbred, QuarterHorse, Warmblood, Arabian };
		Breed[] jumpingTackBreeds = new Breed[] { Thoroughbred, QuarterHorse, Warmblood };
		Breed[] dressageTackBreeds = new Breed[] { Thoroughbred, Warmblood, Arabian };
		Breed[] eventingTackBreeds = new Breed[] { Thoroughbred, Warmblood };
		Breed[] drivingTackBreeds = new Breed[] { Mini, BudweiserHorse };

		Tag huntingTack = tagRepo.save(new Tag("Hunt Seat Attire", "", "", "",
				"For the hunter ring, I am a traditionalist. This division "
						+ "originated from the hunt field. Classic attire is timeless. I don’t like to see flashy, blingy, or the latest fad mar the "
						+ "overall look of the horse and their performance. That means conservative colored hunt coats, beige breeches, beautifully "
						+ "polished boots, traditional spurs, dark gloves and helmets without obvious adornments are a must. Navy and hunter green "
						+ "(which are extremely popular at the moment) coats are always in vogue. For summer I don’t mind lighter shades of blues, "
						+ "greys, browns and greens. Black is always okay, though a bit more formal in my opinion. Hair neatly contained in hairnets "
						+ "tucked up under the helmets is important to the overall look of classic and traditional attire. I’m not crazy about the "
						+ "excessive bows on the pony kids, especially if they cover the numbers and detract from the performance.",
				huntingTackBreeds));
		Tag jumpingTack = tagRepo.save(new Tag("Jumping Attire", "", "", "",
				"In the jumper ring, I totally understand that the European "
						+ "influence has affected our sense of style dramatically over the past ten years. There is  every color and style of breeches"
						+ " imaginable to mankind and with a variety of bling. The riding shirts are as dramatic as the hunt coats, if a rider chooses"
						+ " to wear them. I realize fun and comfort are the key goals here, and as long as the requirements of the USEF rulebook are "
						+ "met regarding collared shirts, then all is good. I must say I will never get used to the flying ponytails, regardless of "
						+ "the famous European riders at the top of the sport that sport this style.",
				jumpingTackBreeds));
		Tag dressageTack = tagRepo.save(new Tag("Dressage Attire", "", "", "",
				"Correct show attire for the dressage ring consists of "
						+ "white or light colored riding pants, black boots, a white or light colored stock tie, light or dark colored gloves, "
						+ "along with an appropriate helmet. In cases of extreme temperatures, the stewards may waive the jackets. So in this case, "
						+ "you must wear a show shirt that consists of sleeves and a collar. From training level to 4th level, a dark colored short "
						+ "coat is required, whereas as you move to the FEI levels you get to wear the much sought after tail coat. It is also mandatory "
						+ "to wear spurs in the FEI levels. At all levels you may carry a whip that is no longer then 47.2 inches (except for championships,"
						+ " where no whip is allowed). The riders hair must also be tied up in a bun or braid. Currently International competition"
						+ " still allows the classical top hat instead of the helmet (which is mandatory in the lower levels) but many riders are now "
						+ "wearing helmets at the International level.",
				dressageTackBreeds));
		Tag eventingTack = tagRepo.save(new Tag("Eventing Attire", "", "", "",
				"For cross country at a three day event, you are required "
						+ "to wear the following: An SEI approved helmet. I recommend a skull cap as they are better for “rolling” and protecting "
						+ "the neck. A hard shell vest, such as Tipperary. I highly recommend also using an air vest (Point Two or Hit Air) over top "
						+ "of the hard shell vest. These are not required yet, but should be in my opinion. Tall boots, no half chaps! Field boot style"
						+ " is best, as it allows more flexibility in ankle for comfort in shorter stirrup lengths. Medical Arm Band. Provides emergency "
						+ "contacts as well as medical information such as allergies, blood type etc.Any color breeches/belt and shirt covering "
						+ "shoulders. We also wear “pinneys” that we put our numbers in. They are worn like vests as well. In addition to the rider "
						+ "wearing the number, the horse also has to wear one on the saddle pad or bridle. This is in-case we get “disconnected.”",
				eventingTackBreeds));
		Tag drivingTack = tagRepo.save(new Tag("Driving Attire", "", "", "",
				"You want to be pleasingly coordinated. You need to carry a whip "
						+ "and you need to wear an APRON and HAT and GLOVES the gloves can be any comfortable, slightly on the loose side, brown colored "
						+ "gloves - riding gloves are fine the hat should not have a big floppy brim. It should fit snuggly so it wont blow off in the "
						+ "ring or in on some thin ribbon ties or elastic to help there. Your hair should be tidy under the hat or bag it in a hairnet. "
						+ "Can still be long (if that applies) just not flyaway the apron can just be a piece of fabric wrapped around you from just "
						+ "above the waist to about the ankles. It should be wide enough to cover you bum. Again you can attach ribbons to tie it "
						+ "on or a piece of Velcro to close it in the back get fabric with some weight to drape. You don't want the apron to be "
						+ "blowing up while you are driving. For the rest of the outfit - if it is hot, a nice longsleeve blouse you can wear a vest "
						+ "if you have or can find one slacks are fine under the apron. You will want something around you neck to draw a bit of "
						+ "attention there. I used to have a nice collection of those long thin silk-like scarves. Make sure whatever you wear give you "
						+ "freedom to move your arms and shoulders without bunching up the fabric. For picking colors You want people to say -"
						+ " That looks really nice. You want to be noticed but in a good way. Don't go the way of funereal black - you will look "
						+ "like the Victorian funeral. Don't go SOOOOO blendy that you fade into the background. You can choose to go with the pony colors "
						+ "- like a haflinger going with light browns and golds or you can choose something that complements - like blue or green"
						+ "Pick seasonal colors - you don't want to look like you are going to a fall race party (greens and rusts) in the middle "
						+ "of the summer. But you really also don't want summer light colors in the fall",
				drivingTackBreeds));

		Tag westernTack = tagRepo.save(new Tag("Western Attire", "WestTack.jpg", "WestAttire.jpg", "WestShow.jpg",
				" Western boots are usually worn for all ages and classes in the "
						+ "western show ring. They usually come up to mid-calf in length and have a pointed toe. Western boots can be seen in many different "
						+ "colors and designs.There are two different types of Western show shirts, Simple and flashy! Men often wear the simple, button up "
						+ "blouses when showing and the women are often seen in the flashy show shirts. Western cowgirls are all about the glam look! "
						+ "The colorful, glittery show shirts can be seen for the western pleasure classes, as well as the speed events! These show "
						+ "shirts consist of brightly colored fabric, with rhinestones and sequins all throughout the shirt. jeans are most often the "
						+ "type of pants that are worn in the ring. Jeans are to be nice and clean and can often be paired with a pair of riding chaps "
						+ "for the western pleasure classes. a cowboy hat is a requirement for all advanced classes. "
						+ "Your hat has to be tight enough that it doesn’t come off your head and it is usually seen in the colors black, brown, or tan. "
						+ "In some instances if your hat comes off while in the show ring, points are deducted from your overall scoring.",
				westernTackBreeds));

	}

}
