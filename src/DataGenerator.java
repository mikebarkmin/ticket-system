import de.ddi.ticketsystem.*;

import java.util.Date;

import java.lang.reflect.Field;

public class DataGenerator {

public static Employee employee;

public static Customer customer;

public static long date;

public static void setValueToField(Object o, String name, Object content) {         Field field;         try { field = o.getClass().getDeclaredField(name); field.setAccessible(true); field.set(o, content);         } catch (Exception e) { System.out.print(e); } }

public static void fillTicketManager(TicketManager ticketManager) {

Employee employee0 = new Employee("Benjamin", "Landry", "benjamin.landry@our-company.com", "Logistic");

employee = employee0;

Employee employee1 = new Employee("Leanna", "Glenn", "leanna.glenn@our-company.com", "Marketing");

Employee employee2 = new Employee("Davian", "Krueger", "davian.krueger@our-company.com", "Marketing");

Employee employee3 = new Employee("Isla", "Combs", "isla.combs@our-company.com", "Warrehousing");

Employee employee4 = new Employee("Annika", "Gross", "annika.gross@our-company.com", "Technical Support");

Employee employee5 = new Employee("Deon", "Blankenship", "deon.blankenship@our-company.com", "Logistic");

Employee employee6 = new Employee("Naima", "Herring", "naima.herring@our-company.com", "Technical Support");

Employee employee7 = new Employee("Lara", "Baird", "lara.baird@our-company.com", "Technical Support");

Employee employee8 = new Employee("Gina", "Nguyen", "gina.nguyen@our-company.com", "IT");

Employee employee9 = new Employee("Kadyn", "Pierce", "kadyn.pierce@our-company.com", "Logistic");

Employee employee10 = new Employee("Patience", "Cole", "patience.cole@our-company.com", "Management");

Employee employee11 = new Employee("Johnathan", "Hardin", "johnathan.hardin@our-company.com", "Technical Support");

Employee employee12 = new Employee("Ethan", "Donaldson", "ethan.donaldson@our-company.com", "Marketing");

Employee employee13 = new Employee("Diana", "Stanton", "diana.stanton@our-company.com", "Technical Support");

Employee employee14 = new Employee("Dylan", "Harmon", "dylan.harmon@our-company.com", "Marketing");

Employee employee15 = new Employee("Ian", "Kelley", "ian.kelley@our-company.com", "Logistic");

Employee employee16 = new Employee("Leia", "Day", "leia.day@our-company.com", "Technical Support");

Employee employee17 = new Employee("Fabian", "Dixon", "fabian.dixon@our-company.com", "Logistic");

Employee employee18 = new Employee("Marley", "Barker", "marley.barker@our-company.com", "Logistic");

Employee employee19 = new Employee("Paige", "Singh", "paige.singh@our-company.com", "Logistic");

Employee employee20 = new Employee("Jaime", "Becker", "jaime.becker@our-company.com", "Logistic");

Employee employee21 = new Employee("Ernesto", "Mendez", "ernesto.mendez@our-company.com", "Warrehousing");

Employee employee22 = new Employee("Josiah", "Garcia", "josiah.garcia@our-company.com", "Management");

Employee employee23 = new Employee("Kaia", "Velazquez", "kaia.velazquez@our-company.com", "Warrehousing");

Employee employee24 = new Employee("Jeramiah", "Douglas", "jeramiah.douglas@our-company.com", "Technical Support");

Employee employee25 = new Employee("Jude", "Wallace", "jude.wallace@our-company.com", "Logistic");

Employee employee26 = new Employee("Jaylene", "Merritt", "jaylene.merritt@our-company.com", "Marketing");

Employee employee27 = new Employee("Cael", "Peck", "cael.peck@our-company.com", "Management");

Employee employee28 = new Employee("Uriel", "Smith", "uriel.smith@our-company.com", "Management");

Employee employee29 = new Employee("Anahi", "Webster", "anahi.webster@our-company.com", "Management");

Employee employee30 = new Employee("Connor", "Jenkins", "connor.jenkins@our-company.com", "Technical Support");

Employee employee31 = new Employee("Sergio", "Carroll", "sergio.carroll@our-company.com", "IT");

Employee employee32 = new Employee("Santino", "Carey", "santino.carey@our-company.com", "Technical Support");

Employee employee33 = new Employee("Nikolas", "Hancock", "nikolas.hancock@our-company.com", "Marketing");

Employee employee34 = new Employee("Alani", "Hunter", "alani.hunter@our-company.com", "Technical Support");

Employee employee35 = new Employee("Gerald", "Payne", "gerald.payne@our-company.com", "Logistic");

Employee employee36 = new Employee("Markus", "Torres", "markus.torres@our-company.com", "Logistic");

Employee employee37 = new Employee("Adonis", "Moss", "adonis.moss@our-company.com", "Warrehousing");

Employee employee38 = new Employee("Kendrick", "Arias", "kendrick.arias@our-company.com", "Warrehousing");

Employee employee39 = new Employee("Abdullah", "Gutierrez", "abdullah.gutierrez@our-company.com", "Technical Support");

Employee employee40 = new Employee("Marc", "Cox", "marc.cox@our-company.com", "Management");

Employee employee41 = new Employee("Raina", "Vance", "raina.vance@our-company.com", "Logistic");

Employee employee42 = new Employee("Deandre", "Mccarty", "deandre.mccarty@our-company.com", "IT");

Employee employee43 = new Employee("Semaj", "Gates", "semaj.gates@our-company.com", "IT");

Employee employee44 = new Employee("Alena", "Preston", "alena.preston@our-company.com", "Marketing");

Employee employee45 = new Employee("Juan", "Horton", "juan.horton@our-company.com", "Technical Support");

Employee employee46 = new Employee("Messiah", "Riddle", "messiah.riddle@our-company.com", "IT");

Employee employee47 = new Employee("Luis", "Wells", "luis.wells@our-company.com", "Warrehousing");

Employee employee48 = new Employee("Valentina", "Stone", "valentina.stone@our-company.com", "Technical Support");

Employee employee49 = new Employee("Amiyah", "Schwartz", "amiyah.schwartz@our-company.com", "Warrehousing");

Employee employee50 = new Employee("Ruth", "Villa", "ruth.villa@our-company.com", "Marketing");

Employee employee51 = new Employee("Nina", "Lynn", "nina.lynn@our-company.com", "Logistic");

Employee employee52 = new Employee("Leah", "Massey", "leah.massey@our-company.com", "Technical Support");

Employee employee53 = new Employee("Lillian", "Hubbard", "lillian.hubbard@our-company.com", "Logistic");

Employee employee54 = new Employee("Elisabeth", "Willis", "elisabeth.willis@our-company.com", "Technical Support");

Employee employee55 = new Employee("Mackenzie", "Wong", "mackenzie.wong@our-company.com", "Logistic");

Employee employee56 = new Employee("Ella", "Stokes", "ella.stokes@our-company.com", "Warrehousing");

Employee employee57 = new Employee("Anaya", "Brown", "anaya.brown@our-company.com", "Warrehousing");

Employee employee58 = new Employee("Dax", "Riley", "dax.riley@our-company.com", "IT");

Employee employee59 = new Employee("Caitlin", "Kane", "caitlin.kane@our-company.com", "Warrehousing");

Employee employee60 = new Employee("Pierce", "Mcgrath", "pierce.mcgrath@our-company.com", "Logistic");

Employee employee61 = new Employee("Paityn", "Reilly", "paityn.reilly@our-company.com", "Management");

Employee employee62 = new Employee("Keely", "Baker", "keely.baker@our-company.com", "Warrehousing");

Employee employee63 = new Employee("Nathalia", "Barton", "nathalia.barton@our-company.com", "Logistic");

Employee employee64 = new Employee("Kameron", "Robbins", "kameron.robbins@our-company.com", "IT");

Employee employee65 = new Employee("Xzavier", "Dean", "xzavier.dean@our-company.com", "Technical Support");

Employee employee66 = new Employee("Ellen", "Galvan", "ellen.galvan@our-company.com", "Warrehousing");

Employee employee67 = new Employee("Paul", "Lindsey", "paul.lindsey@our-company.com", "Warrehousing");

Employee employee68 = new Employee("Kaleb", "Ramirez", "kaleb.ramirez@our-company.com", "IT");

Employee employee69 = new Employee("Karley", "Farley", "karley.farley@our-company.com", "Logistic");

Employee employee70 = new Employee("Natalya", "Fuller", "natalya.fuller@our-company.com", "Management");

Employee employee71 = new Employee("Javier", "Dougherty", "javier.dougherty@our-company.com", "Logistic");

Employee employee72 = new Employee("Danna", "Forbes", "danna.forbes@our-company.com", "Warrehousing");

Employee employee73 = new Employee("Clayton", "Wiggins", "clayton.wiggins@our-company.com", "Marketing");

Employee employee74 = new Employee("Jon", "Weaver", "jon.weaver@our-company.com", "Logistic");

Employee employee75 = new Employee("Jamison", "Valencia", "jamison.valencia@our-company.com", "IT");

Employee employee76 = new Employee("Anabella", "Hahn", "anabella.hahn@our-company.com", "Logistic");

Employee employee77 = new Employee("Micaela", "Morse", "micaela.morse@our-company.com", "Technical Support");

Employee employee78 = new Employee("Carter", "Holland", "carter.holland@our-company.com", "Warrehousing");

Employee employee79 = new Employee("Francesca", "Lopez", "francesca.lopez@our-company.com", "Management");

Employee employee80 = new Employee("Sage", "Rojas", "sage.rojas@our-company.com", "Technical Support");

Employee employee81 = new Employee("Ibrahim", "Pope", "ibrahim.pope@our-company.com", "Management");

Employee employee82 = new Employee("Aubrey", "Li", "aubrey.li@our-company.com", "IT");

Employee employee83 = new Employee("Rodolfo", "Cannon", "rodolfo.cannon@our-company.com", "Management");

Employee employee84 = new Employee("Jaxson", "Wheeler", "jaxson.wheeler@our-company.com", "Warrehousing");

Employee employee85 = new Employee("Diya", "Austin", "diya.austin@our-company.com", "Technical Support");

Employee employee86 = new Employee("Arnav", "Wolfe", "arnav.wolfe@our-company.com", "IT");

Employee employee87 = new Employee("Claudia", "Deleon", "claudia.deleon@our-company.com", "Warrehousing");

Employee employee88 = new Employee("Finnegan", "Kent", "finnegan.kent@our-company.com", "Marketing");

Employee employee89 = new Employee("Marquise", "Montgomery", "marquise.montgomery@our-company.com", "Management");

Employee employee90 = new Employee("Edward", "Mays", "edward.mays@our-company.com", "Management");

Employee employee91 = new Employee("King", "Harding", "king.harding@our-company.com", "Technical Support");

Employee employee92 = new Employee("Antwan", "Duran", "antwan.duran@our-company.com", "Marketing");

Employee employee93 = new Employee("Ryan", "Houston", "ryan.houston@our-company.com", "Management");

Employee employee94 = new Employee("Kyra", "Sexton", "kyra.sexton@our-company.com", "IT");

Employee employee95 = new Employee("Jayla", "Lawrence", "jayla.lawrence@our-company.com", "Technical Support");

Employee employee96 = new Employee("Jaslyn", "Sloan", "jaslyn.sloan@our-company.com", "IT");

Employee employee97 = new Employee("Jewel", "Leonard", "jewel.leonard@our-company.com", "Logistic");

Employee employee98 = new Employee("Saniyah", "Lozano", "saniyah.lozano@our-company.com", "Technical Support");

Employee employee99 = new Employee("Naomi", "Randolph", "naomi.randolph@our-company.com", "Technical Support");

Employee employee100 = new Employee("Miriam", "Clay", "miriam.clay@our-company.com", "Warrehousing");

Employee employee101 = new Employee("Lucy", "Bartlett", "lucy.bartlett@our-company.com", "IT");

Employee employee102 = new Employee("Grayson", "Tapia", "grayson.tapia@our-company.com", "IT");

Employee employee103 = new Employee("Kaleigh", "Campbell", "kaleigh.campbell@our-company.com", "Logistic");

Employee employee104 = new Employee("Gwendolyn", "Luna", "gwendolyn.luna@our-company.com", "Warrehousing");

Employee employee105 = new Employee("Giselle", "Bryan", "giselle.bryan@our-company.com", "Marketing");

Employee employee106 = new Employee("Antonio", "Barber", "antonio.barber@our-company.com", "IT");

Employee employee107 = new Employee("Nash", "Newman", "nash.newman@our-company.com", "Marketing");

Employee employee108 = new Employee("Cameron", "David", "cameron.david@our-company.com", "Management");

Employee employee109 = new Employee("Sarai", "Christensen", "sarai.christensen@our-company.com", "Marketing");

Employee employee110 = new Employee("Ellie", "Fletcher", "ellie.fletcher@our-company.com", "Technical Support");

Employee employee111 = new Employee("Savanna", "George", "savanna.george@our-company.com", "IT");

Employee employee112 = new Employee("Sydnee", "Sweeney", "sydnee.sweeney@our-company.com", "Technical Support");

Employee employee113 = new Employee("Jordon", "Mccormick", "jordon.mccormick@our-company.com", "Marketing");

Employee employee114 = new Employee("Tyrone", "Velasquez", "tyrone.velasquez@our-company.com", "Logistic");

Employee employee115 = new Employee("Cherish", "Cohen", "cherish.cohen@our-company.com", "Warrehousing");

Employee employee116 = new Employee("Nathanial", "Mills", "nathanial.mills@our-company.com", "Management");

Employee employee117 = new Employee("Kaylah", "Copeland", "kaylah.copeland@our-company.com", "Logistic");

Employee employee118 = new Employee("Rolando", "Rivas", "rolando.rivas@our-company.com", "Logistic");

Employee employee119 = new Employee("Yasmine", "Frey", "yasmine.frey@our-company.com", "Logistic");

Employee employee120 = new Employee("Aiyana", "Reyes", "aiyana.reyes@our-company.com", "Management");

Employee employee121 = new Employee("Justine", "Brady", "justine.brady@our-company.com", "IT");

Employee employee122 = new Employee("Colby", "Oliver", "colby.oliver@our-company.com", "Technical Support");

Employee employee123 = new Employee("Madalynn", "Sharp", "madalynn.sharp@our-company.com", "Logistic");

Employee employee124 = new Employee("Clay", "Wang", "clay.wang@our-company.com", "IT");

Employee employee125 = new Employee("Laci", "Gibson", "laci.gibson@our-company.com", "Marketing");

Employee employee126 = new Employee("Damion", "Moon", "damion.moon@our-company.com", "Logistic");

Employee employee127 = new Employee("Salvatore", "Olsen", "salvatore.olsen@our-company.com", "IT");

Employee employee128 = new Employee("Sloane", "Hobbs", "sloane.hobbs@our-company.com", "Management");

Employee employee129 = new Employee("Luz", "Wilkinson", "luz.wilkinson@our-company.com", "Warrehousing");

Employee employee130 = new Employee("Gabriella", "Carlson", "gabriella.carlson@our-company.com", "Technical Support");

Employee employee131 = new Employee("Jasmine", "Zhang", "jasmine.zhang@our-company.com", "Warrehousing");

Employee employee132 = new Employee("Mark", "Gallagher", "mark.gallagher@our-company.com", "Management");

Employee employee133 = new Employee("Aldo", "Mcknight", "aldo.mcknight@our-company.com", "IT");

Employee employee134 = new Employee("Joey", "Goodwin", "joey.goodwin@our-company.com", "Technical Support");

Employee employee135 = new Employee("Madden", "Waller", "madden.waller@our-company.com", "Warrehousing");

Employee employee136 = new Employee("Jack", "Pratt", "jack.pratt@our-company.com", "Management");

Employee employee137 = new Employee("Maia", "Holden", "maia.holden@our-company.com", "Marketing");

Employee employee138 = new Employee("Lea", "Walsh", "lea.walsh@our-company.com", "Management");

Employee employee139 = new Employee("Aydan", "Mcgee", "aydan.mcgee@our-company.com", "Technical Support");

Employee employee140 = new Employee("Leilani", "Carson", "leilani.carson@our-company.com", "Logistic");

Employee employee141 = new Employee("Leroy", "Crane", "leroy.crane@our-company.com", "IT");

Employee employee142 = new Employee("Grace", "Esparza", "grace.esparza@our-company.com", "Marketing");

Employee employee143 = new Employee("William", "Vincent", "william.vincent@our-company.com", "Warrehousing");

Employee employee144 = new Employee("Bethany", "Mathews", "bethany.mathews@our-company.com", "Technical Support");

Employee employee145 = new Employee("Pamela", "Ortega", "pamela.ortega@our-company.com", "Marketing");

Employee employee146 = new Employee("Lisa", "Montoya", "lisa.montoya@our-company.com", "Logistic");

Employee employee147 = new Employee("Janiya", "Branch", "janiya.branch@our-company.com", "Technical Support");

Employee employee148 = new Employee("Alvaro", "Norman", "alvaro.norman@our-company.com", "IT");

Employee employee149 = new Employee("Sara", "Gallegos", "sara.gallegos@our-company.com", "IT");

Employee employee150 = new Employee("Elisha", "Cordova", "elisha.cordova@our-company.com", "Warrehousing");

Employee employee151 = new Employee("Celia", "Friedman", "celia.friedman@our-company.com", "IT");

Employee employee152 = new Employee("Lydia", "Lewis", "lydia.lewis@our-company.com", "IT");

Employee employee153 = new Employee("Matias", "Mccoy", "matias.mccoy@our-company.com", "Marketing");

Employee employee154 = new Employee("Kaylyn", "Bright", "kaylyn.bright@our-company.com", "Warrehousing");

Employee employee155 = new Employee("Atticus", "Perez", "atticus.perez@our-company.com", "Marketing");

Employee employee156 = new Employee("Amya", "Chung", "amya.chung@our-company.com", "Logistic");

Employee employee157 = new Employee("Jaylen", "Beck", "jaylen.beck@our-company.com", "Logistic");

Employee employee158 = new Employee("Trevor", "Simon", "trevor.simon@our-company.com", "IT");

Employee employee159 = new Employee("Lexi", "Spencer", "lexi.spencer@our-company.com", "Warrehousing");

Employee employee160 = new Employee("Cloe", "James", "cloe.james@our-company.com", "Management");

Employee employee161 = new Employee("Abbey", "Weber", "abbey.weber@our-company.com", "IT");

Employee employee162 = new Employee("Rigoberto", "Avery", "rigoberto.avery@our-company.com", "Warrehousing");

Employee employee163 = new Employee("Carly", "Farrell", "carly.farrell@our-company.com", "Management");

Employee employee164 = new Employee("Bailey", "Golden", "bailey.golden@our-company.com", "Management");

Employee employee165 = new Employee("Paris", "Buckley", "paris.buckley@our-company.com", "IT");

Employee employee166 = new Employee("Gaven", "Duffy", "gaven.duffy@our-company.com", "IT");

Employee employee167 = new Employee("Talia", "Ritter", "talia.ritter@our-company.com", "Marketing");

Employee employee168 = new Employee("Braedon", "Webb", "braedon.webb@our-company.com", "Logistic");

Employee employee169 = new Employee("Regan", "Doyle", "regan.doyle@our-company.com", "Technical Support");

Employee employee170 = new Employee("Gianni", "Horne", "gianni.horne@our-company.com", "Management");

Employee employee171 = new Employee("Kiley", "Weiss", "kiley.weiss@our-company.com", "IT");

Employee employee172 = new Employee("Broderick", "Glass", "broderick.glass@our-company.com", "IT");

Employee employee173 = new Employee("Gracie", "Rich", "gracie.rich@our-company.com", "Management");

Employee employee174 = new Employee("Rishi", "Kerr", "rishi.kerr@our-company.com", "Warrehousing");

Employee employee175 = new Employee("Margaret", "Marquez", "margaret.marquez@our-company.com", "Logistic");

Employee employee176 = new Employee("Zaria", "Giles", "zaria.giles@our-company.com", "IT");

Employee employee177 = new Employee("Jocelyn", "Brewer", "jocelyn.brewer@our-company.com", "Management");

Employee employee178 = new Employee("Riya", "Zimmerman", "riya.zimmerman@our-company.com", "Marketing");

Employee employee179 = new Employee("Tori", "Haynes", "tori.haynes@our-company.com", "Marketing");

Employee employee180 = new Employee("Fisher", "Richards", "fisher.richards@our-company.com", "Management");

Employee employee181 = new Employee("Erin", "Gilmore", "erin.gilmore@our-company.com", "IT");

Employee employee182 = new Employee("Marshall", "Martin", "marshall.martin@our-company.com", "Management");

Employee employee183 = new Employee("Mila", "Arnold", "mila.arnold@our-company.com", "Technical Support");

Employee employee184 = new Employee("Holden", "Holmes", "holden.holmes@our-company.com", "Logistic");

Employee employee185 = new Employee("Hayden", "Steele", "hayden.steele@our-company.com", "Warrehousing");

Employee employee186 = new Employee("Shirley", "Francis", "shirley.francis@our-company.com", "Management");

Employee employee187 = new Employee("London", "Mejia", "london.mejia@our-company.com", "Marketing");

Employee employee188 = new Employee("Ryan", "Henderson", "ryan.henderson@our-company.com", "Technical Support");

Employee employee189 = new Employee("Tomas", "Graham", "tomas.graham@our-company.com", "Management");

Employee employee190 = new Employee("Spencer", "Turner", "spencer.turner@our-company.com", "Warrehousing");

Employee employee191 = new Employee("Rylee", "Ferguson", "rylee.ferguson@our-company.com", "Management");

Employee employee192 = new Employee("Reuben", "Huber", "reuben.huber@our-company.com", "Warrehousing");

Employee employee193 = new Employee("Nia", "Christian", "nia.christian@our-company.com", "Technical Support");

Employee employee194 = new Employee("Eugene", "Morgan", "eugene.morgan@our-company.com", "Logistic");

Employee employee195 = new Employee("Shayna", "Wu", "shayna.wu@our-company.com", "IT");

Employee employee196 = new Employee("Ahmad", "Levine", "ahmad.levine@our-company.com", "Logistic");

Employee employee197 = new Employee("Aubree", "Hoffman", "aubree.hoffman@our-company.com", "Technical Support");

Employee employee198 = new Employee("Enzo", "Vasquez", "enzo.vasquez@our-company.com", "IT");

Employee employee199 = new Employee("Khalil", "Brennan", "khalil.brennan@our-company.com", "Technical Support");

Employee employee200 = new Employee("Fernanda", "Duncan", "fernanda.duncan@our-company.com", "IT");

Employee employee201 = new Employee("Alaina", "Cardenas", "alaina.cardenas@our-company.com", "Technical Support");

Employee employee202 = new Employee("Cierra", "Knapp", "cierra.knapp@our-company.com", "Management");

Employee employee203 = new Employee("Humberto", "Mcdaniel", "humberto.mcdaniel@our-company.com", "Marketing");

Employee employee204 = new Employee("Keith", "Fitzgerald", "keith.fitzgerald@our-company.com", "Technical Support");

Employee employee205 = new Employee("Mattie", "Mercado", "mattie.mercado@our-company.com", "IT");

Employee employee206 = new Employee("Augustus", "Jensen", "augustus.jensen@our-company.com", "Logistic");

Employee employee207 = new Employee("Jaylan", "Lara", "jaylan.lara@our-company.com", "Technical Support");

Employee employee208 = new Employee("Ava", "Horn", "ava.horn@our-company.com", "Logistic");

Employee employee209 = new Employee("Samson", "Mathis", "samson.mathis@our-company.com", "Technical Support");

Employee employee210 = new Employee("Kylee", "Johns", "kylee.johns@our-company.com", "Warrehousing");

Employee employee211 = new Employee("Karter", "Koch", "karter.koch@our-company.com", "Warrehousing");

Employee employee212 = new Employee("Reagan", "Joyce", "reagan.joyce@our-company.com", "Logistic");

Employee employee213 = new Employee("Gunnar", "Bell", "gunnar.bell@our-company.com", "Warrehousing");

Employee employee214 = new Employee("Micheal", "Crawford", "micheal.crawford@our-company.com", "Management");

Employee employee215 = new Employee("Haven", "Arellano", "haven.arellano@our-company.com", "Marketing");

Employee employee216 = new Employee("Kaelyn", "Wilcox", "kaelyn.wilcox@our-company.com", "Technical Support");

Employee employee217 = new Employee("Charity", "Pollard", "charity.pollard@our-company.com", "Marketing");

Employee employee218 = new Employee("Brynn", "Henson", "brynn.henson@our-company.com", "Management");

Employee employee219 = new Employee("Britney", "Mooney", "britney.mooney@our-company.com", "IT");

Employee employee220 = new Employee("Jorge", "Hammond", "jorge.hammond@our-company.com", "IT");

Employee employee221 = new Employee("Dalia", "Strickland", "dalia.strickland@our-company.com", "Technical Support");

Employee employee222 = new Employee("Troy", "Greene", "troy.greene@our-company.com", "Warrehousing");

Employee employee223 = new Employee("Alyssa", "Ellis", "alyssa.ellis@our-company.com", "Management");

Employee employee224 = new Employee("Meghan", "Bates", "meghan.bates@our-company.com", "Logistic");

Employee employee225 = new Employee("Ronin", "Carrillo", "ronin.carrillo@our-company.com", "Marketing");

Employee employee226 = new Employee("Mohammad", "Evans", "mohammad.evans@our-company.com", "Warrehousing");

Employee employee227 = new Employee("Ray", "Bruce", "ray.bruce@our-company.com", "Warrehousing");

Employee employee228 = new Employee("Ariel", "Jordan", "ariel.jordan@our-company.com", "IT");

Employee employee229 = new Employee("Beatrice", "Lucas", "beatrice.lucas@our-company.com", "IT");

Employee employee230 = new Employee("Tyson", "Macias", "tyson.macias@our-company.com", "Technical Support");

Employee employee231 = new Employee("Asia", "Burgess", "asia.burgess@our-company.com", "Management");

Employee employee232 = new Employee("Juliet", "Kennedy", "juliet.kennedy@our-company.com", "Management");

Employee employee233 = new Employee("Darrell", "Mercer", "darrell.mercer@our-company.com", "Marketing");

Employee employee234 = new Employee("Dayana", "Riggs", "dayana.riggs@our-company.com", "Technical Support");

Employee employee235 = new Employee("Chandler", "House", "chandler.house@our-company.com", "IT");

Employee employee236 = new Employee("Scarlet", "Lowery", "scarlet.lowery@our-company.com", "Warrehousing");

Employee employee237 = new Employee("Kailey", "Sutton", "kailey.sutton@our-company.com", "Technical Support");

Employee employee238 = new Employee("Stephany", "Harper", "stephany.harper@our-company.com", "Management");

Employee employee239 = new Employee("Addisyn", "Roy", "addisyn.roy@our-company.com", "Marketing");

Employee employee240 = new Employee("Amelia", "Clark", "amelia.clark@our-company.com", "Technical Support");

Employee employee241 = new Employee("Helena", "Pacheco", "helena.pacheco@our-company.com", "Warrehousing");

Employee employee242 = new Employee("Rachel", "Rodgers", "rachel.rodgers@our-company.com", "Management");

Employee employee243 = new Employee("Robert", "Bailey", "robert.bailey@our-company.com", "IT");

Employee employee244 = new Employee("Sofia", "Villarreal", "sofia.villarreal@our-company.com", "Marketing");

Employee employee245 = new Employee("Mariah", "Velez", "mariah.velez@our-company.com", "Logistic");

Employee employee246 = new Employee("Andrew", "Nunez", "andrew.nunez@our-company.com", "Logistic");

Employee employee247 = new Employee("Amare", "Larsen", "amare.larsen@our-company.com", "Warrehousing");

Employee employee248 = new Employee("Ximena", "Ochoa", "ximena.ochoa@our-company.com", "IT");

Employee employee249 = new Employee("Jordan", "Cherry", "jordan.cherry@our-company.com", "Logistic");

Customer customer250 = new Customer("Aron", "Roman", "aron.roman@plantsgetgreener.com", "PlantsGetGreener");

Customer customer251 = new Customer("Deacon", "Walter", "deacon.walter@plantsgetgreener.com", "PlantsGetGreener");

Customer customer252 = new Customer("Roger", "Hester", "roger.hester@carhouse.com", "CarHouse");

Customer customer253 = new Customer("Aria", "Silva", "aria.silva@shop42.com", "Shop42");

Customer customer254 = new Customer("Ashtyn", "Delacruz", "ashtyn.delacruz@carhouse.com", "CarHouse");

Customer customer255 = new Customer("Dwayne", "Bush", "dwayne.bush@carhouse.com", "CarHouse");

Customer customer256 = new Customer("Shea", "Bridges", "shea.bridges@carhouse.com", "CarHouse");

Customer customer257 = new Customer("Penelope", "Gordon", "penelope.gordon@sportastic.com", "Sportastic");

Customer customer258 = new Customer("Taniya", "Benjamin", "taniya.benjamin@plantsgetgreener.com", "PlantsGetGreener");

Customer customer259 = new Customer("Katelynn", "Mayer", "katelynn.mayer@sportastic.com", "Sportastic");

Customer customer260 = new Customer("Evelin", "Madden", "evelin.madden@plantsgetgreener.com", "PlantsGetGreener");

Customer customer261 = new Customer("Jasiah", "Pruitt", "jasiah.pruitt@carhouse.com", "CarHouse");

Customer customer262 = new Customer("Annie", "Hays", "annie.hays@plantsgetgreener.com", "PlantsGetGreener");

Customer customer263 = new Customer("Ulises", "Sawyer", "ulises.sawyer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer264 = new Customer("Raphael", "Rowland", "raphael.rowland@sportastic.com", "Sportastic");

Customer customer265 = new Customer("Dante", "Ward", "dante.ward@plantsgetgreener.com", "PlantsGetGreener");

Customer customer266 = new Customer("Michelle", "Parrish", "michelle.parrish@shop42.com", "Shop42");

Customer customer267 = new Customer("Lily", "Downs", "lily.downs@plantsgetgreener.com", "PlantsGetGreener");

Customer customer268 = new Customer("Dario", "Whitehead", "dario.whitehead@carhouse.com", "CarHouse");

Customer customer269 = new Customer("Deshawn", "Pineda", "deshawn.pineda@carhouse.com", "CarHouse");

Customer customer270 = new Customer("Linda", "Pena", "linda.pena@flyerbuzzer.com", "FlyerBuzzer");

Customer customer271 = new Customer("Kasen", "Walters", "kasen.walters@shop42.com", "Shop42");

Customer customer272 = new Customer("Axel", "Estrada", "axel.estrada@flyerbuzzer.com", "FlyerBuzzer");

Customer customer273 = new Customer("Brent", "Warren", "brent.warren@sportastic.com", "Sportastic");

Customer customer274 = new Customer("Belen", "Carpenter", "belen.carpenter@shop42.com", "Shop42");

Customer customer275 = new Customer("Noe", "Sandoval", "noe.sandoval@carhouse.com", "CarHouse");

Customer customer276 = new Customer("Lizeth", "Mendoza", "lizeth.mendoza@sportastic.com", "Sportastic");

Customer customer277 = new Customer("Julissa", "Stout", "julissa.stout@flyerbuzzer.com", "FlyerBuzzer");

Customer customer278 = new Customer("Camren", "Yates", "camren.yates@flyerbuzzer.com", "FlyerBuzzer");

Customer customer279 = new Customer("Gilbert", "Hayden", "gilbert.hayden@plantsgetgreener.com", "PlantsGetGreener");

Customer customer280 = new Customer("Shamar", "Stevenson", "shamar.stevenson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer281 = new Customer("Davion", "Atkins", "davion.atkins@shop42.com", "Shop42");

Customer customer282 = new Customer("Dahlia", "Harrell", "dahlia.harrell@sportastic.com", "Sportastic");

Customer customer283 = new Customer("Kylie", "Hensley", "kylie.hensley@carhouse.com", "CarHouse");

Customer customer284 = new Customer("Stephen", "Richmond", "stephen.richmond@plantsgetgreener.com", "PlantsGetGreener");

Customer customer285 = new Customer("Trenton", "Tanner", "trenton.tanner@sportastic.com", "Sportastic");

Customer customer286 = new Customer("Jairo", "Dominguez", "jairo.dominguez@sportastic.com", "Sportastic");

Customer customer287 = new Customer("Gaige", "Oneill", "gaige.oneill@sportastic.com", "Sportastic");

Customer customer288 = new Customer("Layne", "Dalton", "layne.dalton@plantsgetgreener.com", "PlantsGetGreener");

Customer customer289 = new Customer("Amari", "Williamson", "amari.williamson@shop42.com", "Shop42");

Customer customer290 = new Customer("Kendall", "Leon", "kendall.leon@plantsgetgreener.com", "PlantsGetGreener");

Customer customer291 = new Customer("Karissa", "Orozco", "karissa.orozco@sportastic.com", "Sportastic");

Customer customer292 = new Customer("Jovany", "Ballard", "jovany.ballard@flyerbuzzer.com", "FlyerBuzzer");

Customer customer293 = new Customer("Elisa", "Huffman", "elisa.huffman@carhouse.com", "CarHouse");

Customer customer294 = new Customer("Nick", "Mccarthy", "nick.mccarthy@shop42.com", "Shop42");

Customer customer295 = new Customer("Jayda", "Lucero", "jayda.lucero@shop42.com", "Shop42");

Customer customer296 = new Customer("Leandro", "Schultz", "leandro.schultz@sportastic.com", "Sportastic");

Customer customer297 = new Customer("Gemma", "Callahan", "gemma.callahan@sportastic.com", "Sportastic");

Customer customer298 = new Customer("Slade", "Sims", "slade.sims@plantsgetgreener.com", "PlantsGetGreener");

Customer customer299 = new Customer("Teresa", "Nolan", "teresa.nolan@sportastic.com", "Sportastic");

Customer customer300 = new Customer("Layla", "Johnston", "layla.johnston@shop42.com", "Shop42");

Customer customer301 = new Customer("Jaylyn", "Sellers", "jaylyn.sellers@sportastic.com", "Sportastic");

Customer customer302 = new Customer("Wilson", "Jones", "wilson.jones@plantsgetgreener.com", "PlantsGetGreener");

Customer customer303 = new Customer("Cara", "Cuevas", "cara.cuevas@plantsgetgreener.com", "PlantsGetGreener");

Customer customer304 = new Customer("Brett", "Winters", "brett.winters@flyerbuzzer.com", "FlyerBuzzer");

Customer customer305 = new Customer("Darryl", "Livingston", "darryl.livingston@flyerbuzzer.com", "FlyerBuzzer");

Customer customer306 = new Customer("Alicia", "Romero", "alicia.romero@plantsgetgreener.com", "PlantsGetGreener");

Customer customer307 = new Customer("Alessandro", "Kirby", "alessandro.kirby@sportastic.com", "Sportastic");

Customer customer308 = new Customer("Carson", "Hickman", "carson.hickman@plantsgetgreener.com", "PlantsGetGreener");

Customer customer309 = new Customer("Iyana", "Acosta", "iyana.acosta@flyerbuzzer.com", "FlyerBuzzer");

Customer customer310 = new Customer("Thomas", "Butler", "thomas.butler@flyerbuzzer.com", "FlyerBuzzer");

Customer customer311 = new Customer("Harper", "French", "harper.french@carhouse.com", "CarHouse");

Customer customer312 = new Customer("Keyla", "Maynard", "keyla.maynard@shop42.com", "Shop42");

Customer customer313 = new Customer("Easton", "Crosby", "easton.crosby@carhouse.com", "CarHouse");

Customer customer314 = new Customer("Madeleine", "Norton", "madeleine.norton@sportastic.com", "Sportastic");

Customer customer315 = new Customer("Trystan", "Larson", "trystan.larson@shop42.com", "Shop42");

Customer customer316 = new Customer("Jillian", "Palmer", "jillian.palmer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer317 = new Customer("Amanda", "Stanley", "amanda.stanley@plantsgetgreener.com", "PlantsGetGreener");

Customer customer318 = new Customer("Lincoln", "Baldwin", "lincoln.baldwin@sportastic.com", "Sportastic");

Customer customer319 = new Customer("Melissa", "Ellison", "melissa.ellison@shop42.com", "Shop42");

Customer customer320 = new Customer("Aimee", "Aguilar", "aimee.aguilar@carhouse.com", "CarHouse");

Customer customer321 = new Customer("Gilberto", "Adkins", "gilberto.adkins@carhouse.com", "CarHouse");

Customer customer322 = new Customer("Alexander", "Gay", "alexander.gay@carhouse.com", "CarHouse");

Customer customer323 = new Customer("Demetrius", "Martinez", "demetrius.martinez@flyerbuzzer.com", "FlyerBuzzer");

Customer customer324 = new Customer("Rogelio", "Ingram", "rogelio.ingram@flyerbuzzer.com", "FlyerBuzzer");

Customer customer325 = new Customer("Deangelo", "Galloway", "deangelo.galloway@sportastic.com", "Sportastic");

Customer customer326 = new Customer("Zander", "King", "zander.king@plantsgetgreener.com", "PlantsGetGreener");

Customer customer327 = new Customer("Ethen", "Barnes", "ethen.barnes@shop42.com", "Shop42");

Customer customer328 = new Customer("Donna", "Sanders", "donna.sanders@shop42.com", "Shop42");

Customer customer329 = new Customer("Valentin", "Zavala", "valentin.zavala@sportastic.com", "Sportastic");

Customer customer330 = new Customer("Liana", "Charles", "liana.charles@shop42.com", "Shop42");

Customer customer331 = new Customer("Moshe", "Bowen", "moshe.bowen@flyerbuzzer.com", "FlyerBuzzer");

Customer customer332 = new Customer("Ciara", "Nielsen", "ciara.nielsen@shop42.com", "Shop42");

Customer customer333 = new Customer("Kianna", "Foley", "kianna.foley@flyerbuzzer.com", "FlyerBuzzer");

Customer customer334 = new Customer("Helen", "Murphy", "helen.murphy@carhouse.com", "CarHouse");

Customer customer335 = new Customer("Willie", "Oneal", "willie.oneal@shop42.com", "Shop42");

Customer customer336 = new Customer("Christina", "Booker", "christina.booker@plantsgetgreener.com", "PlantsGetGreener");

Customer customer337 = new Customer("Micah", "Fritz", "micah.fritz@shop42.com", "Shop42");

Customer customer338 = new Customer("Giovani", "Russo", "giovani.russo@plantsgetgreener.com", "PlantsGetGreener");

Customer customer339 = new Customer("Emerson", "Coffey", "emerson.coffey@shop42.com", "Shop42");

Customer customer340 = new Customer("Shaun", "Espinoza", "shaun.espinoza@carhouse.com", "CarHouse");

Customer customer341 = new Customer("Colin", "Clements", "colin.clements@flyerbuzzer.com", "FlyerBuzzer");

Customer customer342 = new Customer("Rebekah", "Vargas", "rebekah.vargas@carhouse.com", "CarHouse");

Customer customer343 = new Customer("Ingrid", "Pace", "ingrid.pace@shop42.com", "Shop42");

Customer customer344 = new Customer("Carlie", "Blackburn", "carlie.blackburn@sportastic.com", "Sportastic");

Customer customer345 = new Customer("Stella", "Chandler", "stella.chandler@sportastic.com", "Sportastic");

Customer customer346 = new Customer("Cecelia", "Nixon", "cecelia.nixon@shop42.com", "Shop42");

Customer customer347 = new Customer("Rey", "Decker", "rey.decker@flyerbuzzer.com", "FlyerBuzzer");

Customer customer348 = new Customer("Emilia", "Trevino", "emilia.trevino@shop42.com", "Shop42");

Customer customer349 = new Customer("Paisley", "Moyer", "paisley.moyer@plantsgetgreener.com", "PlantsGetGreener");

Customer customer350 = new Customer("Joselyn", "Schneider", "joselyn.schneider@shop42.com", "Shop42");

Customer customer351 = new Customer("Anthony", "Barnett", "anthony.barnett@sportastic.com", "Sportastic");

Customer customer352 = new Customer("Aditya", "Huff", "aditya.huff@plantsgetgreener.com", "PlantsGetGreener");

Customer customer353 = new Customer("Jordyn", "Le", "jordyn.le@flyerbuzzer.com", "FlyerBuzzer");

Customer customer354 = new Customer("Aaron", "Hopkins", "aaron.hopkins@flyerbuzzer.com", "FlyerBuzzer");

Customer customer355 = new Customer("Catalina", "Knox", "catalina.knox@flyerbuzzer.com", "FlyerBuzzer");

Customer customer356 = new Customer("Jadyn", "Bernard", "jadyn.bernard@carhouse.com", "CarHouse");

Customer customer357 = new Customer("Kimora", "Pearson", "kimora.pearson@sportastic.com", "Sportastic");

Customer customer358 = new Customer("Nancy", "Hutchinson", "nancy.hutchinson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer359 = new Customer("Delilah", "Hale", "delilah.hale@sportastic.com", "Sportastic");

Customer customer360 = new Customer("Alisson", "Chaney", "alisson.chaney@flyerbuzzer.com", "FlyerBuzzer");

Customer customer361 = new Customer("Quinn", "Tyler", "quinn.tyler@shop42.com", "Shop42");

Customer customer362 = new Customer("Jeremy", "Grant", "jeremy.grant@plantsgetgreener.com", "PlantsGetGreener");

Customer customer363 = new Customer("Joy", "Rollins", "joy.rollins@shop42.com", "Shop42");

Customer customer364 = new Customer("Brogan", "Obrien", "brogan.obrien@plantsgetgreener.com", "PlantsGetGreener");

Customer customer365 = new Customer("Emmalee", "Rangel", "emmalee.rangel@flyerbuzzer.com", "FlyerBuzzer");

Customer customer366 = new Customer("Drake", "Santana", "drake.santana@shop42.com", "Shop42");

Customer customer367 = new Customer("Angelica", "Church", "angelica.church@sportastic.com", "Sportastic");

Customer customer368 = new Customer("Stephanie", "Mckay", "stephanie.mckay@carhouse.com", "CarHouse");

Customer customer369 = new Customer("Hailey", "Calhoun", "hailey.calhoun@shop42.com", "Shop42");

Customer customer370 = new Customer("Chris", "Boyd", "chris.boyd@plantsgetgreener.com", "PlantsGetGreener");

Customer customer371 = new Customer("America", "Fitzpatrick", "america.fitzpatrick@carhouse.com", "CarHouse");

Customer customer372 = new Customer("Madalyn", "Gonzalez", "madalyn.gonzalez@flyerbuzzer.com", "FlyerBuzzer");

Customer customer373 = new Customer("Sylvia", "Beltran", "sylvia.beltran@shop42.com", "Shop42");

Customer customer374 = new Customer("Jaden", "Pittman", "jaden.pittman@flyerbuzzer.com", "FlyerBuzzer");

Customer customer375 = new Customer("Arielle", "Andrade", "arielle.andrade@sportastic.com", "Sportastic");

Customer customer376 = new Customer("Kamila", "Beasley", "kamila.beasley@sportastic.com", "Sportastic");

Customer customer377 = new Customer("Lennon", "Fernandez", "lennon.fernandez@carhouse.com", "CarHouse");

Customer customer378 = new Customer("June", "Mullen", "june.mullen@flyerbuzzer.com", "FlyerBuzzer");

Customer customer379 = new Customer("Aileen", "Thornton", "aileen.thornton@carhouse.com", "CarHouse");

Customer customer380 = new Customer("Alonso", "Walls", "alonso.walls@shop42.com", "Shop42");

Customer customer381 = new Customer("Araceli", "Lester", "araceli.lester@sportastic.com", "Sportastic");

Customer customer382 = new Customer("Tristin", "Archer", "tristin.archer@shop42.com", "Shop42");

Customer customer383 = new Customer("Aedan", "Rose", "aedan.rose@shop42.com", "Shop42");

Customer customer384 = new Customer("Kamron", "Anderson", "kamron.anderson@sportastic.com", "Sportastic");

Customer customer385 = new Customer("Alia", "Howell", "alia.howell@sportastic.com", "Sportastic");

Customer customer386 = new Customer("Andy", "Stewart", "andy.stewart@flyerbuzzer.com", "FlyerBuzzer");

Customer customer387 = new Customer("Karma", "Shepard", "karma.shepard@shop42.com", "Shop42");

Customer customer388 = new Customer("Reed", "Mcdowell", "reed.mcdowell@shop42.com", "Shop42");

Customer customer389 = new Customer("Marvin", "Franco", "marvin.franco@shop42.com", "Shop42");

Customer customer390 = new Customer("Zoey", "Hansen", "zoey.hansen@flyerbuzzer.com", "FlyerBuzzer");

Customer customer391 = new Customer("Hugo", "Hicks", "hugo.hicks@carhouse.com", "CarHouse");

Customer customer392 = new Customer("Tiana", "Berger", "tiana.berger@flyerbuzzer.com", "FlyerBuzzer");

Customer customer393 = new Customer("Makenzie", "Cruz", "makenzie.cruz@flyerbuzzer.com", "FlyerBuzzer");

Customer customer394 = new Customer("Santos", "Guzman", "santos.guzman@flyerbuzzer.com", "FlyerBuzzer");

Customer customer395 = new Customer("Anabel", "Frazier", "anabel.frazier@sportastic.com", "Sportastic");

Customer customer396 = new Customer("Oswaldo", "Campos", "oswaldo.campos@plantsgetgreener.com", "PlantsGetGreener");

Customer customer397 = new Customer("Harley", "Woods", "harley.woods@flyerbuzzer.com", "FlyerBuzzer");

Customer customer398 = new Customer("Konner", "Greer", "konner.greer@sportastic.com", "Sportastic");

Customer customer399 = new Customer("Yair", "Flowers", "yair.flowers@flyerbuzzer.com", "FlyerBuzzer");

Customer customer400 = new Customer("Mira", "Washington", "mira.washington@plantsgetgreener.com", "PlantsGetGreener");

Customer customer401 = new Customer("Deegan", "Simpson", "deegan.simpson@sportastic.com", "Sportastic");

Customer customer402 = new Customer("Kamari", "Huang", "kamari.huang@shop42.com", "Shop42");

Customer customer403 = new Customer("Shawn", "Bird", "shawn.bird@flyerbuzzer.com", "FlyerBuzzer");

Customer customer404 = new Customer("Israel", "Meyers", "israel.meyers@carhouse.com", "CarHouse");

Customer customer405 = new Customer("Dexter", "Wise", "dexter.wise@plantsgetgreener.com", "PlantsGetGreener");

Customer customer406 = new Customer("Jaylynn", "Oconnor", "jaylynn.oconnor@shop42.com", "Shop42");

Customer customer407 = new Customer("Jaxon", "Yoder", "jaxon.yoder@carhouse.com", "CarHouse");

Customer customer408 = new Customer("Lexie", "Ramos", "lexie.ramos@plantsgetgreener.com", "PlantsGetGreener");

Customer customer409 = new Customer("Erick", "Williams", "erick.williams@sportastic.com", "Sportastic");

Customer customer410 = new Customer("Casey", "English", "casey.english@plantsgetgreener.com", "PlantsGetGreener");

Customer customer411 = new Customer("Skyla", "Powell", "skyla.powell@carhouse.com", "CarHouse");

Customer customer412 = new Customer("Gabrielle", "Dodson", "gabrielle.dodson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer413 = new Customer("Evie", "Liu", "evie.liu@sportastic.com", "Sportastic");

Customer customer414 = new Customer("Beau", "Chang", "beau.chang@flyerbuzzer.com", "FlyerBuzzer");

Customer customer415 = new Customer("Diego", "Barr", "diego.barr@sportastic.com", "Sportastic");

Customer customer416 = new Customer("Ashleigh", "Wagner", "ashleigh.wagner@shop42.com", "Shop42");

Customer customer417 = new Customer("Hannah", "Boone", "hannah.boone@shop42.com", "Shop42");

Customer customer418 = new Customer("Marianna", "Jacobson", "marianna.jacobson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer419 = new Customer("Giana", "Pugh", "giana.pugh@carhouse.com", "CarHouse");

Customer customer420 = new Customer("Emelia", "Welch", "emelia.welch@sportastic.com", "Sportastic");

Customer customer421 = new Customer("Bennett", "Powers", "bennett.powers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer422 = new Customer("Kierra", "Lee", "kierra.lee@flyerbuzzer.com", "FlyerBuzzer");

Customer customer423 = new Customer("Abbigail", "Delgado", "abbigail.delgado@flyerbuzzer.com", "FlyerBuzzer");

Customer customer424 = new Customer("Clark", "Cantrell", "clark.cantrell@sportastic.com", "Sportastic");

Customer customer425 = new Customer("Carolyn", "Rosario", "carolyn.rosario@flyerbuzzer.com", "FlyerBuzzer");

Customer customer426 = new Customer("Charles", "Garza", "charles.garza@carhouse.com", "CarHouse");

Customer customer427 = new Customer("Ricky", "Stuart", "ricky.stuart@carhouse.com", "CarHouse");

Customer customer428 = new Customer("Trey", "Mclean", "trey.mclean@flyerbuzzer.com", "FlyerBuzzer");

Customer customer429 = new Customer("Triston", "Cochran", "triston.cochran@carhouse.com", "CarHouse");

Customer customer430 = new Customer("Arabella", "Proctor", "arabella.proctor@shop42.com", "Shop42");

Customer customer431 = new Customer("Karson", "Melendez", "karson.melendez@sportastic.com", "Sportastic");

Customer customer432 = new Customer("Adelyn", "Rubio", "adelyn.rubio@plantsgetgreener.com", "PlantsGetGreener");

Customer customer433 = new Customer("Urijah", "Rogers", "urijah.rogers@sportastic.com", "Sportastic");

Customer customer434 = new Customer("Sean", "Manning", "sean.manning@flyerbuzzer.com", "FlyerBuzzer");

Customer customer435 = new Customer("Danny", "Sullivan", "danny.sullivan@flyerbuzzer.com", "FlyerBuzzer");

Customer customer436 = new Customer("Sullivan", "Owen", "sullivan.owen@plantsgetgreener.com", "PlantsGetGreener");

Customer customer437 = new Customer("Maximilian", "Monroe", "maximilian.monroe@carhouse.com", "CarHouse");

Customer customer438 = new Customer("Delaney", "Cooper", "delaney.cooper@flyerbuzzer.com", "FlyerBuzzer");

Customer customer439 = new Customer("Elena", "Boyer", "elena.boyer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer440 = new Customer("Maddox", "Davis", "maddox.davis@sportastic.com", "Sportastic");

Customer customer441 = new Customer("Bobby", "Reed", "bobby.reed@sportastic.com", "Sportastic");

Customer customer442 = new Customer("Matilda", "Kramer", "matilda.kramer@sportastic.com", "Sportastic");

Customer customer443 = new Customer("Landen", "Aguirre", "landen.aguirre@carhouse.com", "CarHouse");

Customer customer444 = new Customer("Sanai", "Elliott", "sanai.elliott@plantsgetgreener.com", "PlantsGetGreener");

Customer customer445 = new Customer("Braiden", "Bauer", "braiden.bauer@plantsgetgreener.com", "PlantsGetGreener");

Customer customer446 = new Customer("Vivian", "Sampson", "vivian.sampson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer447 = new Customer("Sienna", "Dunn", "sienna.dunn@carhouse.com", "CarHouse");

Customer customer448 = new Customer("Justus", "Kaiser", "justus.kaiser@shop42.com", "Shop42");

Customer customer449 = new Customer("Jovanni", "Mayo", "jovanni.mayo@flyerbuzzer.com", "FlyerBuzzer");

Customer customer450 = new Customer("Maggie", "Price", "maggie.price@shop42.com", "Shop42");

Customer customer451 = new Customer("Trevon", "Terry", "trevon.terry@carhouse.com", "CarHouse");

Customer customer452 = new Customer("Brennen", "Hurst", "brennen.hurst@plantsgetgreener.com", "PlantsGetGreener");

Customer customer453 = new Customer("Yoselin", "Chambers", "yoselin.chambers@shop42.com", "Shop42");

Customer customer454 = new Customer("Jayleen", "Brock", "jayleen.brock@carhouse.com", "CarHouse");

Customer customer455 = new Customer("Kyan", "Holloway", "kyan.holloway@plantsgetgreener.com", "PlantsGetGreener");

Customer customer456 = new Customer("Jakobe", "Salas", "jakobe.salas@flyerbuzzer.com", "FlyerBuzzer");

Customer customer457 = new Customer("Maurice", "Chase", "maurice.chase@plantsgetgreener.com", "PlantsGetGreener");

Customer customer458 = new Customer("Zain", "Patrick", "zain.patrick@carhouse.com", "CarHouse");

Customer customer459 = new Customer("Darren", "Santiago", "darren.santiago@plantsgetgreener.com", "PlantsGetGreener");

Customer customer460 = new Customer("Kai", "Carney", "kai.carney@flyerbuzzer.com", "FlyerBuzzer");

Customer customer461 = new Customer("Makhi", "Schmitt", "makhi.schmitt@shop42.com", "Shop42");

Customer customer462 = new Customer("Bria", "Ayala", "bria.ayala@carhouse.com", "CarHouse");

Customer customer463 = new Customer("Veronica", "Wolf", "veronica.wolf@shop42.com", "Shop42");

Customer customer464 = new Customer("Asher", "Camacho", "asher.camacho@shop42.com", "Shop42");

Customer customer465 = new Customer("Madeline", "Molina", "madeline.molina@carhouse.com", "CarHouse");

Customer customer466 = new Customer("Nyla", "Hull", "nyla.hull@carhouse.com", "CarHouse");

Customer customer467 = new Customer("Jonathon", "Escobar", "jonathon.escobar@carhouse.com", "CarHouse");

Customer customer468 = new Customer("Yahir", "Roach", "yahir.roach@plantsgetgreener.com", "PlantsGetGreener");

Customer customer469 = new Customer("Finn", "Ross", "finn.ross@shop42.com", "Shop42");

Customer customer470 = new Customer("Corey", "Marsh", "corey.marsh@carhouse.com", "CarHouse");

Customer customer471 = new Customer("Jadyn", "Fox", "jadyn.fox@sportastic.com", "Sportastic");

Customer customer472 = new Customer("Billy", "Benson", "billy.benson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer473 = new Customer("Mario", "Green", "mario.green@shop42.com", "Shop42");

Customer customer474 = new Customer("Skyler", "Potter", "skyler.potter@shop42.com", "Shop42");

Customer customer475 = new Customer("Todd", "Dudley", "todd.dudley@plantsgetgreener.com", "PlantsGetGreener");

Customer customer476 = new Customer("Adrianna", "Parker", "adrianna.parker@shop42.com", "Shop42");

Customer customer477 = new Customer("Brandon", "Acevedo", "brandon.acevedo@plantsgetgreener.com", "PlantsGetGreener");

Customer customer478 = new Customer("Killian", "Shea", "killian.shea@plantsgetgreener.com", "PlantsGetGreener");

Customer customer479 = new Customer("Katelyn", "Skinner", "katelyn.skinner@flyerbuzzer.com", "FlyerBuzzer");

Customer customer480 = new Customer("Leland", "Ayers", "leland.ayers@shop42.com", "Shop42");

Customer customer481 = new Customer("Jordin", "Garner", "jordin.garner@shop42.com", "Shop42");

Customer customer482 = new Customer("Rocco", "Franklin", "rocco.franklin@sportastic.com", "Sportastic");

Customer customer483 = new Customer("Jacey", "Haney", "jacey.haney@carhouse.com", "CarHouse");

Customer customer484 = new Customer("Zaire", "Keith", "zaire.keith@carhouse.com", "CarHouse");

Customer customer485 = new Customer("Annabella", "Hoover", "annabella.hoover@flyerbuzzer.com", "FlyerBuzzer");

Customer customer486 = new Customer("German", "Short", "german.short@plantsgetgreener.com", "PlantsGetGreener");

Customer customer487 = new Customer("Denise", "Odom", "denise.odom@sportastic.com", "Sportastic");

Customer customer488 = new Customer("Dayami", "Wall", "dayami.wall@shop42.com", "Shop42");

Customer customer489 = new Customer("Fletcher", "Ali", "fletcher.ali@carhouse.com", "CarHouse");

Customer customer490 = new Customer("Savion", "Zamora", "savion.zamora@flyerbuzzer.com", "FlyerBuzzer");

Customer customer491 = new Customer("Aspen", "Munoz", "aspen.munoz@plantsgetgreener.com", "PlantsGetGreener");

Customer customer492 = new Customer("Tristian", "Bowers", "tristian.bowers@flyerbuzzer.com", "FlyerBuzzer");

Customer customer493 = new Customer("Brian", "Sanchez", "brian.sanchez@flyerbuzzer.com", "FlyerBuzzer");

Customer customer494 = new Customer("Barrett", "Mack", "barrett.mack@carhouse.com", "CarHouse");

Customer customer495 = new Customer("Seamus", "Hogan", "seamus.hogan@flyerbuzzer.com", "FlyerBuzzer");

Customer customer496 = new Customer("Katie", "Jimenez", "katie.jimenez@carhouse.com", "CarHouse");

Customer customer497 = new Customer("Elijah", "Flores", "elijah.flores@plantsgetgreener.com", "PlantsGetGreener");

Customer customer498 = new Customer("Dashawn", "Mueller", "dashawn.mueller@flyerbuzzer.com", "FlyerBuzzer");

Customer customer499 = new Customer("Lorelei", "Shaw", "lorelei.shaw@plantsgetgreener.com", "PlantsGetGreener");

customer = customer499;

Ticket ticket0 = new MalfunctionTicket("Don't step on the broken glass.", Status.RECORDED, employee68, customer384, 10, "backup");

ticketManager.add(ticket0);

date = 1483477892000l;

DataGenerator.setValueToField(ticket0, "creationDate", new Date(date));

Ticket ticket1 = new MalfunctionTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.RECORDED, employee156, customer285, 2, "restore");

ticketManager.add(ticket1);

date = 1483606872000l;

DataGenerator.setValueToField(ticket1, "creationDate", new Date(date));

Ticket ticket2 = new RequestTicket("Sixty-Four comes asking for bread.", Status.CLOSED, employee49, customer377, 8, new Date(Long.parseLong("1483585407000")), "training");

ticketManager.add(ticket2);

date = 1483583033000l;

DataGenerator.setValueToField(ticket2, "creationDate", new Date(date));

Ticket ticket3 = new OrderTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.RECORDED, employee163, customer445, 1, "Green Plants", "Trippletone", "B6351, Wooler NE71, Vereinigtes Königreich", 78);

ticketManager.add(ticket3);

date = 1483580098000l;

DataGenerator.setValueToField(ticket3, "creationDate", new Date(date));

Ticket ticket4 = new RequestTicket("Everyone was busy, so I went to the movie alone.", Status.WAITING_FOR_FEEDBACK, employee14, customer397, 1, new Date(Long.parseLong("1483372516000")), "consulting");

ticketManager.add(ticket4);

date = 1483605901000l;

DataGenerator.setValueToField(ticket4, "creationDate", new Date(date));

Ticket ticket5 = new OrderTicket("The body may perhaps compensates for the loss of a true metaphysics.", Status.CLOSED, employee234, customer324, 6, "Rent", "Touchfresh", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 94);

ticketManager.add(ticket5);

date = 1483192580000l;

DataGenerator.setValueToField(ticket5, "creationDate", new Date(date));

Ticket ticket6 = new MalfunctionTicket("A song can make or ruin a person’s day if they let it get to them.", Status.RECORDED, employee55, customer379, 7, "backup");

ticketManager.add(ticket6);

date = 1483128131000l;

DataGenerator.setValueToField(ticket6, "creationDate", new Date(date));

Ticket ticket7 = new OrderTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.WAITING_FOR_FEEDBACK, employee9, customer496, 2, "Rent", "Sun-Tom", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 89);

ticketManager.add(ticket7);

date = 1483149151000l;

DataGenerator.setValueToField(ticket7, "creationDate", new Date(date));

Ticket ticket8 = new RequestTicket("The stranger officiates the meal.", Status.PROCESSED, employee210, customer417, 4, new Date(Long.parseLong("1483213846000")), "checkup");

ticketManager.add(ticket8);

date = 1483196763000l;

DataGenerator.setValueToField(ticket8, "creationDate", new Date(date));

Ticket ticket9 = new OrderTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.WAITING_FOR_FEEDBACK, employee105, customer314, 3, "Rent", "Stockwarm", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 34);

ticketManager.add(ticket9);

date = 1483343397000l;

DataGenerator.setValueToField(ticket9, "creationDate", new Date(date));

Ticket ticket10 = new OrderTicket("We need to rent a room for our party.", Status.CLOSED, employee155, customer278, 6, "Green Plants", "Home Ovetone", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 55);

ticketManager.add(ticket10);

date = 1483605149000l;

DataGenerator.setValueToField(ticket10, "creationDate", new Date(date));

Ticket ticket11 = new MalfunctionTicket("Should we start class now, or should we wait for everyone to get here?", Status.PROCESSED, employee235, customer368, 4, "setup");

ticketManager.add(ticket11);

date = 1483030847000l;

DataGenerator.setValueToField(ticket11, "creationDate", new Date(date));

Ticket ticket12 = new RequestTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.RECORDED, employee95, customer446, 9, new Date(Long.parseLong("1483452919000")), "help desk");

ticketManager.add(ticket12);

date = 1483369079000l;

DataGenerator.setValueToField(ticket12, "creationDate", new Date(date));

Ticket ticket13 = new OrderTicket("Rock music approaches at high velocity.", Status.SOLVED, employee180, customer483, 4, "Plog", "Unolab", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 37);

ticketManager.add(ticket13);

date = 1483462820000l;

DataGenerator.setValueToField(ticket13, "creationDate", new Date(date));

Ticket ticket14 = new MalfunctionTicket("The book is in front of the table.", Status.CLOSED, employee121, customer361, 1, "remove");

ticketManager.add(ticket14);

date = 1483172296000l;

DataGenerator.setValueToField(ticket14, "creationDate", new Date(date));

Ticket ticket15 = new MalfunctionTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.CLOSED, employee5, customer401, 5, "repair");

ticketManager.add(ticket15);

date = 1483260042000l;

DataGenerator.setValueToField(ticket15, "creationDate", new Date(date));

Ticket ticket16 = new OrderTicket("Let me help you with your baggage.", Status.SOLVED, employee69, customer425, 10, "Rent", "Icetam", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 95);

ticketManager.add(ticket16);

date = 1483455931000l;

DataGenerator.setValueToField(ticket16, "creationDate", new Date(date));

Ticket ticket17 = new MalfunctionTicket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee150, customer493, 7, "restore");

ticketManager.add(ticket17);

date = 1483517740000l;

DataGenerator.setValueToField(ticket17, "creationDate", new Date(date));

Ticket ticket18 = new RequestTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.RECORDED, employee191, customer496, 3, new Date(Long.parseLong("1483342260000")), "training");

ticketManager.add(ticket18);

date = 1483464800000l;

DataGenerator.setValueToField(ticket18, "creationDate", new Date(date));

Ticket ticket19 = new MalfunctionTicket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.PROCESSED, employee86, customer453, 6, "setup");

ticketManager.add(ticket19);

date = 1483092467000l;

DataGenerator.setValueToField(ticket19, "creationDate", new Date(date));

Ticket ticket20 = new OrderTicket("Check back tomorrow. I will see if the book has arrived.", Status.CLOSED, employee43, customer413, 5, "Quil", "Unohold", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 94);

ticketManager.add(ticket20);

date = 1483222411000l;

DataGenerator.setValueToField(ticket20, "creationDate", new Date(date));

Ticket ticket21 = new MalfunctionTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.WAITING_FOR_FEEDBACK, employee182, customer418, 1, "backup");

ticketManager.add(ticket21);

date = 1483567680000l;

DataGenerator.setValueToField(ticket21, "creationDate", new Date(date));

Ticket ticket22 = new OrderTicket("Wow, does that work?", Status.WAITING_FOR_FEEDBACK, employee134, customer253, 2, "Blue Water", "Istrax", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 30);

ticketManager.add(ticket22);

date = 1483260527000l;

DataGenerator.setValueToField(ticket22, "creationDate", new Date(date));

Ticket ticket23 = new RequestTicket("I love eating toasted cheese and tuna sandwiches.", Status.RECORDED, employee204, customer308, 9, new Date(Long.parseLong("1483241507000")), "training");

ticketManager.add(ticket23);

date = 1483289680000l;

DataGenerator.setValueToField(ticket23, "creationDate", new Date(date));

Ticket ticket24 = new MalfunctionTicket("I am never at home on Sundays.", Status.PROCESSED, employee186, customer315, 0, "remove");

ticketManager.add(ticket24);

date = 1483468025000l;

DataGenerator.setValueToField(ticket24, "creationDate", new Date(date));

Ticket ticket25 = new OrderTicket("He said he was not there yesterday. however, many people saw him there.", Status.PROCESSED, employee228, customer483, 6, "Green Plants", "Quad Zozlax", "B6351, Wooler NE71, Vereinigtes Königreich", 71);

ticketManager.add(ticket25);

date = 1483245126000l;

DataGenerator.setValueToField(ticket25, "creationDate", new Date(date));

Ticket ticket26 = new RequestTicket("Mary plays the piano.", Status.SOLVED, employee52, customer401, 8, new Date(Long.parseLong("1483580266000")), "checkup");

ticketManager.add(ticket26);

date = 1483080689000l;

DataGenerator.setValueToField(ticket26, "creationDate", new Date(date));

Ticket ticket27 = new OrderTicket("He told us a very exciting adventure story.", Status.SOLVED, employee166, customer469, 3, "Quil", "Tampfan", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 75);

ticketManager.add(ticket27);

date = 1483241082000l;

DataGenerator.setValueToField(ticket27, "creationDate", new Date(date));

Ticket ticket28 = new RequestTicket("A song can make or ruin a person’s day if they let it get to them.", Status.RECORDED, employee63, customer376, 10, new Date(Long.parseLong("1483370483000")), "training");

ticketManager.add(ticket28);

date = 1483113959000l;

DataGenerator.setValueToField(ticket28, "creationDate", new Date(date));

Ticket ticket29 = new MalfunctionTicket("The quick brown fox jumps over the lazy dog.", Status.PROCESSED, employee28, customer327, 1, "backup");

ticketManager.add(ticket29);

date = 1483405951000l;

DataGenerator.setValueToField(ticket29, "creationDate", new Date(date));

Ticket ticket30 = new OrderTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee134, customer337, 6, "Micros", "Home Ovetone", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 45);

ticketManager.add(ticket30);

date = 1483156889000l;

DataGenerator.setValueToField(ticket30, "creationDate", new Date(date));

Ticket ticket31 = new RequestTicket("Hurry!", Status.WAITING_FOR_FEEDBACK, employee29, customer380, 6, new Date(Long.parseLong("1483508359000")), "training");

ticketManager.add(ticket31);

date = 1483203611000l;

DataGenerator.setValueToField(ticket31, "creationDate", new Date(date));

Ticket ticket32 = new MalfunctionTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.CLOSED, employee131, customer366, 3, "backup");

ticketManager.add(ticket32);

date = 1483179978000l;

DataGenerator.setValueToField(ticket32, "creationDate", new Date(date));

Ticket ticket33 = new MalfunctionTicket("Mary plays the piano.", Status.WAITING_FOR_FEEDBACK, employee44, customer288, 1, "repair");

ticketManager.add(ticket33);

date = 1483171277000l;

DataGenerator.setValueToField(ticket33, "creationDate", new Date(date));

Ticket ticket34 = new RequestTicket("Should we start class now, or should we wait for everyone to get here?", Status.WAITING_FOR_FEEDBACK, employee236, customer371, 8, new Date(Long.parseLong("1483480673000")), "consulting");

ticketManager.add(ticket34);

date = 1483201694000l;

DataGenerator.setValueToField(ticket34, "creationDate", new Date(date));

Ticket ticket35 = new RequestTicket("The sky is clear. the stars are twinkling.", Status.RECORDED, employee143, customer392, 5, new Date(Long.parseLong("1483263226000")), "consulting");

ticketManager.add(ticket35);

date = 1483537669000l;

DataGenerator.setValueToField(ticket35, "creationDate", new Date(date));

Ticket ticket36 = new OrderTicket("A glittering gem is not enough.", Status.RECORDED, employee162, customer263, 5, "Sunshine Ice", "Unohold", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 98);

ticketManager.add(ticket36);

date = 1483532544000l;

DataGenerator.setValueToField(ticket36, "creationDate", new Date(date));

Ticket ticket37 = new RequestTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.RECORDED, employee84, customer252, 1, new Date(Long.parseLong("1483507630000")), "consulting");

ticketManager.add(ticket37);

date = 1483435185000l;

DataGenerator.setValueToField(ticket37, "creationDate", new Date(date));

Ticket ticket38 = new OrderTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.WAITING_FOR_FEEDBACK, employee60, customer457, 6, "Quil", "Quad Zozlax", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 63);

ticketManager.add(ticket38);

date = 1483049284000l;

DataGenerator.setValueToField(ticket38, "creationDate", new Date(date));

Ticket ticket39 = new OrderTicket("If I don’t like something, I’ll stay away from it.", Status.RECORDED, employee122, customer298, 8, "Telefunk", "Touchfresh", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 61);

ticketManager.add(ticket39);

date = 1483233436000l;

DataGenerator.setValueToField(ticket39, "creationDate", new Date(date));

Ticket ticket40 = new MalfunctionTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.WAITING_FOR_FEEDBACK, employee130, customer390, 9, "setup");

ticketManager.add(ticket40);

date = 1483471010000l;

DataGenerator.setValueToField(ticket40, "creationDate", new Date(date));

Ticket ticket41 = new MalfunctionTicket("A glittering gem is not enough.", Status.CLOSED, employee134, customer452, 9, "repair");

ticketManager.add(ticket41);

date = 1483354378000l;

DataGenerator.setValueToField(ticket41, "creationDate", new Date(date));

Ticket ticket42 = new MalfunctionTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.RECORDED, employee25, customer479, 3, "restore");

ticketManager.add(ticket42);

date = 1483456796000l;

DataGenerator.setValueToField(ticket42, "creationDate", new Date(date));

Ticket ticket43 = new OrderTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.SOLVED, employee184, customer483, 9, "Blue Water", "Tamtom", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 78);

ticketManager.add(ticket43);

date = 1483334324000l;

DataGenerator.setValueToField(ticket43, "creationDate", new Date(date));

Ticket ticket44 = new OrderTicket("She advised him to come back at once.", Status.RECORDED, employee59, customer464, 0, "Sunshine Ice", "Unohold", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 94);

ticketManager.add(ticket44);

date = 1483038447000l;

DataGenerator.setValueToField(ticket44, "creationDate", new Date(date));

Ticket ticket45 = new OrderTicket("We have a lot of rain in June.", Status.SOLVED, employee25, customer271, 3, "Fresher", "Sao Dansing", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 80);

ticketManager.add(ticket45);

date = 1483614344000l;

DataGenerator.setValueToField(ticket45, "creationDate", new Date(date));

Ticket ticket46 = new MalfunctionTicket("The quick brown fox jumps over the lazy dog.", Status.RECORDED, employee2, customer445, 2, "remove");

ticketManager.add(ticket46);

date = 1483346725000l;

DataGenerator.setValueToField(ticket46, "creationDate", new Date(date));

Ticket ticket47 = new OrderTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.WAITING_FOR_FEEDBACK, employee136, customer278, 4, "Fresher", "Sao Dansing", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 59);

ticketManager.add(ticket47);

date = 1483124609000l;

DataGenerator.setValueToField(ticket47, "creationDate", new Date(date));

Ticket ticket48 = new RequestTicket("The lake is a long way from here.", Status.RECORDED, employee55, customer478, 7, new Date(Long.parseLong("1483196113000")), "help desk");

ticketManager.add(ticket48);

date = 1483022105000l;

DataGenerator.setValueToField(ticket48, "creationDate", new Date(date));

Ticket ticket49 = new RequestTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.PROCESSED, employee54, customer467, 4, new Date(Long.parseLong("1483430592000")), "checkup");

ticketManager.add(ticket49);

date = 1483367383000l;

DataGenerator.setValueToField(ticket49, "creationDate", new Date(date));

Ticket ticket50 = new OrderTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.SOLVED, employee9, customer280, 9, "Red Pizza", "Sao Dansing", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 50);

ticketManager.add(ticket50);

date = 1483022155000l;

DataGenerator.setValueToField(ticket50, "creationDate", new Date(date));

Ticket ticket51 = new OrderTicket("I want more detailed information.", Status.WAITING_FOR_FEEDBACK, employee56, customer378, 2, "Telefunk", "Daltron", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 62);

ticketManager.add(ticket51);

date = 1483496482000l;

DataGenerator.setValueToField(ticket51, "creationDate", new Date(date));

Ticket ticket52 = new RequestTicket("Two seats were vacant.", Status.CLOSED, employee131, customer490, 9, new Date(Long.parseLong("1483305821000")), "help desk");

ticketManager.add(ticket52);

date = 1483285584000l;

DataGenerator.setValueToField(ticket52, "creationDate", new Date(date));

Ticket ticket53 = new OrderTicket("Is it free?", Status.RECORDED, employee126, customer487, 4, "Rent", "Stockwarm", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 57);

ticketManager.add(ticket53);

date = 1483169663000l;

DataGenerator.setValueToField(ticket53, "creationDate", new Date(date));

Ticket ticket54 = new RequestTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.SOLVED, employee62, customer295, 7, new Date(Long.parseLong("1483332928000")), "checkup");

ticketManager.add(ticket54);

date = 1483277169000l;

DataGenerator.setValueToField(ticket54, "creationDate", new Date(date));

Ticket ticket55 = new RequestTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.PROCESSED, employee239, customer380, 9, new Date(Long.parseLong("1483553663000")), "training");

ticketManager.add(ticket55);

date = 1483199301000l;

DataGenerator.setValueToField(ticket55, "creationDate", new Date(date));

Ticket ticket56 = new MalfunctionTicket("She folded her handkerchief neatly.", Status.RECORDED, employee148, customer419, 8, "setup");

ticketManager.add(ticket56);

date = 1483023618000l;

DataGenerator.setValueToField(ticket56, "creationDate", new Date(date));

Ticket ticket57 = new MalfunctionTicket("I'd rather be a bird than a fish.", Status.CLOSED, employee248, customer320, 2, "restore");

ticketManager.add(ticket57);

date = 1483251562000l;

DataGenerator.setValueToField(ticket57, "creationDate", new Date(date));

Ticket ticket58 = new OrderTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.SOLVED, employee48, customer283, 10, "Sunshine Ice", "Movejob", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 60);

ticketManager.add(ticket58);

date = 1483292520000l;

DataGenerator.setValueToField(ticket58, "creationDate", new Date(date));

Ticket ticket59 = new OrderTicket("Cats are good pets, for they are clean and are not noisy.", Status.CLOSED, employee19, customer340, 7, "Green Plants", "Don Dax", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 49);

ticketManager.add(ticket59);

date = 1483281947000l;

DataGenerator.setValueToField(ticket59, "creationDate", new Date(date));

Ticket ticket60 = new OrderTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.SOLVED, employee26, customer444, 5, "Quil", "Vilasonit", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 75);

ticketManager.add(ticket60);

date = 1483605762000l;

DataGenerator.setValueToField(ticket60, "creationDate", new Date(date));

Ticket ticket61 = new OrderTicket("He said he was not there yesterday. however, many people saw him there.", Status.WAITING_FOR_FEEDBACK, employee151, customer341, 3, "Fresher", "Tamtom", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 46);

ticketManager.add(ticket61);

date = 1483215815000l;

DataGenerator.setValueToField(ticket61, "creationDate", new Date(date));

Ticket ticket62 = new OrderTicket("I'd rather be a bird than a fish.", Status.CLOSED, employee92, customer402, 3, "Plog", "Sun-Tom", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 95);

ticketManager.add(ticket62);

date = 1483599673000l;

DataGenerator.setValueToField(ticket62, "creationDate", new Date(date));

Ticket ticket63 = new RequestTicket("Check back tomorrow. I will see if the book has arrived.", Status.WAITING_FOR_FEEDBACK, employee227, customer332, 3, new Date(Long.parseLong("1483463878000")), "help desk");

ticketManager.add(ticket63);

date = 1483486816000l;

DataGenerator.setValueToField(ticket63, "creationDate", new Date(date));

Ticket ticket64 = new OrderTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.WAITING_FOR_FEEDBACK, employee111, customer315, 2, "Quil", "Sao Dansing", "B6351, Wooler NE71, Vereinigtes Königreich", 45);

ticketManager.add(ticket64);

date = 1483258624000l;

DataGenerator.setValueToField(ticket64, "creationDate", new Date(date));

Ticket ticket65 = new OrderTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.RECORDED, employee238, customer311, 4, "Green Plants", "Gravequadtam", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 66);

ticketManager.add(ticket65);

date = 1483470635000l;

DataGenerator.setValueToField(ticket65, "creationDate", new Date(date));

Ticket ticket66 = new MalfunctionTicket("I want to buy a onesie… but know it won’t suit me.", Status.PROCESSED, employee45, customer368, 8, "backup");

ticketManager.add(ticket66);

date = 1483507068000l;

DataGenerator.setValueToField(ticket66, "creationDate", new Date(date));

Ticket ticket67 = new MalfunctionTicket("I want more detailed information.", Status.SOLVED, employee180, customer407, 5, "backup");

ticketManager.add(ticket67);

date = 1483531075000l;

DataGenerator.setValueToField(ticket67, "creationDate", new Date(date));

Ticket ticket68 = new MalfunctionTicket("We have never been to Asia, nor have we visited Africa.", Status.CLOSED, employee171, customer294, 3, "repair");

ticketManager.add(ticket68);

date = 1483439118000l;

DataGenerator.setValueToField(ticket68, "creationDate", new Date(date));

Ticket ticket69 = new MalfunctionTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.WAITING_FOR_FEEDBACK, employee211, customer409, 6, "repair");

ticketManager.add(ticket69);

date = 1483420962000l;

DataGenerator.setValueToField(ticket69, "creationDate", new Date(date));

Ticket ticket70 = new OrderTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee38, customer453, 9, "Red Pizza", "Haynimfax", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 38);

ticketManager.add(ticket70);

date = 1483314993000l;

DataGenerator.setValueToField(ticket70, "creationDate", new Date(date));

Ticket ticket71 = new RequestTicket("Hurry!", Status.CLOSED, employee8, customer318, 1, new Date(Long.parseLong("1483214187000")), "help desk");

ticketManager.add(ticket71);

date = 1483165397000l;

DataGenerator.setValueToField(ticket71, "creationDate", new Date(date));

Ticket ticket72 = new MalfunctionTicket("The body may perhaps compensates for the loss of a true metaphysics.", Status.WAITING_FOR_FEEDBACK, employee60, customer252, 5, "backup");

ticketManager.add(ticket72);

date = 1483494305000l;

DataGenerator.setValueToField(ticket72, "creationDate", new Date(date));

Ticket ticket73 = new RequestTicket("Two seats were vacant.", Status.RECORDED, employee46, customer498, 9, new Date(Long.parseLong("1483217824000")), "consulting");

ticketManager.add(ticket73);

date = 1483193751000l;

DataGenerator.setValueToField(ticket73, "creationDate", new Date(date));

Ticket ticket74 = new OrderTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.WAITING_FOR_FEEDBACK, employee44, customer465, 5, "Quil", "Quofan", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 70);

ticketManager.add(ticket74);

date = 1483592808000l;

DataGenerator.setValueToField(ticket74, "creationDate", new Date(date));

Ticket ticket75 = new OrderTicket("We need to rent a room for our party.", Status.CLOSED, employee96, customer475, 5, "Fresher", "Quad Zozlax", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 83);

ticketManager.add(ticket75);

date = 1483479760000l;

DataGenerator.setValueToField(ticket75, "creationDate", new Date(date));

Ticket ticket76 = new RequestTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.SOLVED, employee123, customer345, 10, new Date(Long.parseLong("1483415882000")), "help desk");

ticketManager.add(ticket76);

date = 1483031387000l;

DataGenerator.setValueToField(ticket76, "creationDate", new Date(date));

Ticket ticket77 = new MalfunctionTicket("They got there early, and they got really good seats.", Status.PROCESSED, employee155, customer364, 7, "restore");

ticketManager.add(ticket77);

date = 1483484774000l;

DataGenerator.setValueToField(ticket77, "creationDate", new Date(date));

Ticket ticket78 = new MalfunctionTicket("He said he was not there yesterday. however, many people saw him there.", Status.PROCESSED, employee63, customer486, 4, "restore");

ticketManager.add(ticket78);

date = 1483390609000l;

DataGenerator.setValueToField(ticket78, "creationDate", new Date(date));

Ticket ticket79 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.WAITING_FOR_FEEDBACK, employee114, customer401, 3, "Blue Water", "Zumron", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 52);

ticketManager.add(ticket79);

date = 1483418752000l;

DataGenerator.setValueToField(ticket79, "creationDate", new Date(date));

Ticket ticket80 = new MalfunctionTicket("I am never at home on Sundays.", Status.SOLVED, employee97, customer409, 0, "repair");

ticketManager.add(ticket80);

date = 1483287341000l;

DataGenerator.setValueToField(ticket80, "creationDate", new Date(date));

Ticket ticket81 = new RequestTicket("I want more detailed information.", Status.WAITING_FOR_FEEDBACK, employee55, customer356, 0, new Date(Long.parseLong("1483523096000")), "training");

ticketManager.add(ticket81);

date = 1483462094000l;

DataGenerator.setValueToField(ticket81, "creationDate", new Date(date));

Ticket ticket82 = new MalfunctionTicket("The sky is clear. the stars are twinkling.", Status.WAITING_FOR_FEEDBACK, employee82, customer325, 2, "remove");

ticketManager.add(ticket82);

date = 1483573277000l;

DataGenerator.setValueToField(ticket82, "creationDate", new Date(date));

Ticket ticket83 = new RequestTicket("The mysterious diary records the voice.", Status.RECORDED, employee169, customer390, 6, new Date(Long.parseLong("1483492980000")), "consulting");

ticketManager.add(ticket83);

date = 1483296239000l;

DataGenerator.setValueToField(ticket83, "creationDate", new Date(date));

Ticket ticket84 = new OrderTicket("A glittering gem is not enough.", Status.CLOSED, employee3, customer254, 1, "Blue Water", "Techlatfix", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 82);

ticketManager.add(ticket84);

date = 1483306212000l;

DataGenerator.setValueToField(ticket84, "creationDate", new Date(date));

Ticket ticket85 = new RequestTicket("The mysterious diary records the voice.", Status.SOLVED, employee227, customer438, 9, new Date(Long.parseLong("1483243803000")), "training");

ticketManager.add(ticket85);

date = 1483316029000l;

DataGenerator.setValueToField(ticket85, "creationDate", new Date(date));

Ticket ticket86 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.PROCESSED, employee117, customer355, 2, new Date(Long.parseLong("1483575496000")), "help desk");

ticketManager.add(ticket86);

date = 1483433770000l;

DataGenerator.setValueToField(ticket86, "creationDate", new Date(date));

Ticket ticket87 = new RequestTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee186, customer362, 9, new Date(Long.parseLong("1483179051000")), "help desk");

ticketManager.add(ticket87);

date = 1483342458000l;

DataGenerator.setValueToField(ticket87, "creationDate", new Date(date));

Ticket ticket88 = new OrderTicket("She always speaks to him in a loud voice.", Status.CLOSED, employee79, customer285, 3, "Telefunk", "Istrax", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 61);

ticketManager.add(ticket88);

date = 1483590623000l;

DataGenerator.setValueToField(ticket88, "creationDate", new Date(date));

Ticket ticket89 = new OrderTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.CLOSED, employee212, customer354, 5, "Quil", "Sao Dansing", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 87);

ticketManager.add(ticket89);

date = 1483379132000l;

DataGenerator.setValueToField(ticket89, "creationDate", new Date(date));

Ticket ticket90 = new MalfunctionTicket("I checked to make sure that he was still alive.", Status.RECORDED, employee122, customer273, 7, "setup");

ticketManager.add(ticket90);

date = 1483116332000l;

DataGenerator.setValueToField(ticket90, "creationDate", new Date(date));

Ticket ticket91 = new OrderTicket("I want to buy a onesie… but know it won’t suit me.", Status.PROCESSED, employee38, customer300, 9, "Red Pizza", "Movejob", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 73);

ticketManager.add(ticket91);

date = 1483296364000l;

DataGenerator.setValueToField(ticket91, "creationDate", new Date(date));

Ticket ticket92 = new RequestTicket("Everyone was busy, so I went to the movie alone.", Status.SOLVED, employee21, customer492, 3, new Date(Long.parseLong("1483343706000")), "checkup");

ticketManager.add(ticket92);

date = 1483547411000l;

DataGenerator.setValueToField(ticket92, "creationDate", new Date(date));

Ticket ticket93 = new OrderTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.CLOSED, employee219, customer433, 10, "Telefunk", "Tampfan", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 82);

ticketManager.add(ticket93);

date = 1483155815000l;

DataGenerator.setValueToField(ticket93, "creationDate", new Date(date));

Ticket ticket94 = new MalfunctionTicket("Sixty-Four comes asking for bread.", Status.PROCESSED, employee4, customer445, 2, "repair");

ticketManager.add(ticket94);

date = 1483276486000l;

DataGenerator.setValueToField(ticket94, "creationDate", new Date(date));

Ticket ticket95 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.CLOSED, employee238, customer274, 7, "Red Pizza", "Gravequadtam", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 30);

ticketManager.add(ticket95);

date = 1483330873000l;

DataGenerator.setValueToField(ticket95, "creationDate", new Date(date));

Ticket ticket96 = new OrderTicket("I really want to go to work, but I am too sick to drive.", Status.PROCESSED, employee60, customer289, 0, "Red Pizza", "Lot Dax", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 93);

ticketManager.add(ticket96);

date = 1483382304000l;

DataGenerator.setValueToField(ticket96, "creationDate", new Date(date));

Ticket ticket97 = new MalfunctionTicket("Sixty-Four comes asking for bread.", Status.SOLVED, employee28, customer296, 5, "setup");

ticketManager.add(ticket97);

date = 1483211979000l;

DataGenerator.setValueToField(ticket97, "creationDate", new Date(date));

Ticket ticket98 = new RequestTicket("The stranger officiates the meal.", Status.RECORDED, employee231, customer411, 6, new Date(Long.parseLong("1483311782000")), "training");

ticketManager.add(ticket98);

date = 1483598167000l;

DataGenerator.setValueToField(ticket98, "creationDate", new Date(date));

Ticket ticket99 = new OrderTicket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee138, customer381, 3, "Green Plants", "Sun-Tom", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 89);

ticketManager.add(ticket99);

date = 1483096630000l;

DataGenerator.setValueToField(ticket99, "creationDate", new Date(date));

Ticket ticket100 = new OrderTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee195, customer497, 4, "Rent", "Sun-Tom", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 52);

ticketManager.add(ticket100);

date = 1483529760000l;

DataGenerator.setValueToField(ticket100, "creationDate", new Date(date));

Ticket ticket101 = new RequestTicket("The memory we used to share is no longer coherent.", Status.PROCESSED, employee231, customer399, 3, new Date(Long.parseLong("1483107081000")), "help desk");

ticketManager.add(ticket101);

date = 1483236125000l;

DataGenerator.setValueToField(ticket101, "creationDate", new Date(date));

Ticket ticket102 = new OrderTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.RECORDED, employee165, customer418, 0, "Red Pizza", "Home Ovetone", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 47);

ticketManager.add(ticket102);

date = 1483509748000l;

DataGenerator.setValueToField(ticket102, "creationDate", new Date(date));

Ticket ticket103 = new RequestTicket("Rock music approaches at high velocity.", Status.RECORDED, employee212, customer465, 8, new Date(Long.parseLong("1483478189000")), "checkup");

ticketManager.add(ticket103);

date = 1483026177000l;

DataGenerator.setValueToField(ticket103, "creationDate", new Date(date));

Ticket ticket104 = new RequestTicket("I want to buy a onesie… but know it won’t suit me.", Status.SOLVED, employee234, customer339, 9, new Date(Long.parseLong("1483319163000")), "training");

ticketManager.add(ticket104);

date = 1483279279000l;

DataGenerator.setValueToField(ticket104, "creationDate", new Date(date));

Ticket ticket105 = new OrderTicket("Don't step on the broken glass.", Status.RECORDED, employee219, customer441, 8, "Fresher", "Techlatfix", "B6351, Wooler NE71, Vereinigtes Königreich", 74);

ticketManager.add(ticket105);

date = 1483427961000l;

DataGenerator.setValueToField(ticket105, "creationDate", new Date(date));

Ticket ticket106 = new MalfunctionTicket("She folded her handkerchief neatly.", Status.CLOSED, employee181, customer326, 7, "repair");

ticketManager.add(ticket106);

date = 1483329493000l;

DataGenerator.setValueToField(ticket106, "creationDate", new Date(date));

Ticket ticket107 = new MalfunctionTicket("Christmas is coming.", Status.PROCESSED, employee101, customer274, 8, "setup");

ticketManager.add(ticket107);

date = 1483386333000l;

DataGenerator.setValueToField(ticket107, "creationDate", new Date(date));

Ticket ticket108 = new RequestTicket("Wow, does that work?", Status.PROCESSED, employee22, customer387, 1, new Date(Long.parseLong("1483098696000")), "consulting");

ticketManager.add(ticket108);

date = 1483049662000l;

DataGenerator.setValueToField(ticket108, "creationDate", new Date(date));

Ticket ticket109 = new MalfunctionTicket("I love eating toasted cheese and tuna sandwiches.", Status.CLOSED, employee68, customer419, 4, "repair");

ticketManager.add(ticket109);

date = 1483033247000l;

DataGenerator.setValueToField(ticket109, "creationDate", new Date(date));

Ticket ticket110 = new RequestTicket("I'd rather be a bird than a fish.", Status.PROCESSED, employee64, customer327, 6, new Date(Long.parseLong("1483451452000")), "training");

ticketManager.add(ticket110);

date = 1483346589000l;

DataGenerator.setValueToField(ticket110, "creationDate", new Date(date));

Ticket ticket111 = new RequestTicket("If I don’t like something, I’ll stay away from it.", Status.RECORDED, employee197, customer285, 7, new Date(Long.parseLong("1483330548000")), "help desk");

ticketManager.add(ticket111);

date = 1483066639000l;

DataGenerator.setValueToField(ticket111, "creationDate", new Date(date));

Ticket ticket112 = new OrderTicket("I'd rather be a bird than a fish.", Status.WAITING_FOR_FEEDBACK, employee213, customer276, 10, "Sunshine Ice", "Unohold", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 81);

ticketManager.add(ticket112);

date = 1483524108000l;

DataGenerator.setValueToField(ticket112, "creationDate", new Date(date));

Ticket ticket113 = new MalfunctionTicket("They got there early, and they got really good seats.", Status.CLOSED, employee135, customer474, 10, "restore");

ticketManager.add(ticket113);

date = 1483444724000l;

DataGenerator.setValueToField(ticket113, "creationDate", new Date(date));

Ticket ticket114 = new OrderTicket("A song can make or ruin a person’s day if they let it get to them.", Status.PROCESSED, employee138, customer302, 8, "Telefunk", "Don Dax", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 38);

ticketManager.add(ticket114);

date = 1483383506000l;

DataGenerator.setValueToField(ticket114, "creationDate", new Date(date));

Ticket ticket115 = new OrderTicket("I currently have 4 windows open up… and I don’t know why.", Status.PROCESSED, employee125, customer407, 9, "Micros", "Vilasonit", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 82);

ticketManager.add(ticket115);

date = 1483183099000l;

DataGenerator.setValueToField(ticket115, "creationDate", new Date(date));

Ticket ticket116 = new OrderTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee168, customer390, 10, "Plog", "Tampfan", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 38);

ticketManager.add(ticket116);

date = 1483382646000l;

DataGenerator.setValueToField(ticket116, "creationDate", new Date(date));

Ticket ticket117 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.WAITING_FOR_FEEDBACK, employee177, customer307, 4, new Date(Long.parseLong("1483474431000")), "training");

ticketManager.add(ticket117);

date = 1483275794000l;

DataGenerator.setValueToField(ticket117, "creationDate", new Date(date));

Ticket ticket118 = new OrderTicket("The lake is a long way from here.", Status.PROCESSED, employee235, customer438, 5, "Fresher", "Don Dax", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 31);

ticketManager.add(ticket118);

date = 1483359615000l;

DataGenerator.setValueToField(ticket118, "creationDate", new Date(date));

Ticket ticket119 = new OrderTicket("She did not cheat on the test, for it was not the right thing to do.", Status.PROCESSED, employee198, customer262, 3, "Plog", "Techlatfix", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 68);

ticketManager.add(ticket119);

date = 1483407806000l;

DataGenerator.setValueToField(ticket119, "creationDate", new Date(date));

Ticket ticket120 = new MalfunctionTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.PROCESSED, employee156, customer272, 3, "backup");

ticketManager.add(ticket120);

date = 1483498388000l;

DataGenerator.setValueToField(ticket120, "creationDate", new Date(date));

Ticket ticket121 = new RequestTicket("I often see the time 11:11 or 12:34 on clocks.", Status.CLOSED, employee209, customer276, 2, new Date(Long.parseLong("1483025711000")), "checkup");

ticketManager.add(ticket121);

date = 1483313789000l;

DataGenerator.setValueToField(ticket121, "creationDate", new Date(date));

Ticket ticket122 = new OrderTicket("The river stole the gods.", Status.CLOSED, employee46, customer346, 8, "Micros", "Sun-Tom", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 51);

ticketManager.add(ticket122);

date = 1483431435000l;

DataGenerator.setValueToField(ticket122, "creationDate", new Date(date));

Ticket ticket123 = new RequestTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.CLOSED, employee128, customer435, 5, new Date(Long.parseLong("1483424614000")), "consulting");

ticketManager.add(ticket123);

date = 1483241350000l;

DataGenerator.setValueToField(ticket123, "creationDate", new Date(date));

Ticket ticket124 = new OrderTicket("We have never been to Asia, nor have we visited Africa.", Status.CLOSED, employee164, customer339, 2, "Fresher", "Tamtom", "B6351, Wooler NE71, Vereinigtes Königreich", 84);

ticketManager.add(ticket124);

date = 1483081432000l;

DataGenerator.setValueToField(ticket124, "creationDate", new Date(date));

Ticket ticket125 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.CLOSED, employee62, customer389, 3, new Date(Long.parseLong("1483350317000")), "help desk");

ticketManager.add(ticket125);

date = 1483478345000l;

DataGenerator.setValueToField(ticket125, "creationDate", new Date(date));

Ticket ticket126 = new OrderTicket("Mary plays the piano.", Status.PROCESSED, employee0, customer468, 3, "Micros", "Tamtom", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 32);

ticketManager.add(ticket126);

date = 1483496439000l;

DataGenerator.setValueToField(ticket126, "creationDate", new Date(date));

Ticket ticket127 = new RequestTicket("I think I will buy the red car, or I will lease the blue one.", Status.CLOSED, employee196, customer280, 5, new Date(Long.parseLong("1483529433000")), "checkup");

ticketManager.add(ticket127);

date = 1483127896000l;

DataGenerator.setValueToField(ticket127, "creationDate", new Date(date));

Ticket ticket128 = new RequestTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.SOLVED, employee241, customer256, 2, new Date(Long.parseLong("1483586497000")), "consulting");

ticketManager.add(ticket128);

date = 1483275445000l;

DataGenerator.setValueToField(ticket128, "creationDate", new Date(date));

Ticket ticket129 = new RequestTicket("A glittering gem is not enough.", Status.WAITING_FOR_FEEDBACK, employee15, customer364, 7, new Date(Long.parseLong("1483076887000")), "consulting");

ticketManager.add(ticket129);

date = 1483214627000l;

DataGenerator.setValueToField(ticket129, "creationDate", new Date(date));

Ticket ticket130 = new MalfunctionTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.SOLVED, employee162, customer327, 2, "restore");

ticketManager.add(ticket130);

date = 1483026479000l;

DataGenerator.setValueToField(ticket130, "creationDate", new Date(date));

Ticket ticket131 = new OrderTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.WAITING_FOR_FEEDBACK, employee183, customer360, 1, "Green Plants", "Icetam", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 80);

ticketManager.add(ticket131);

date = 1483523851000l;

DataGenerator.setValueToField(ticket131, "creationDate", new Date(date));

Ticket ticket132 = new RequestTicket("I often see the time 11:11 or 12:34 on clocks.", Status.WAITING_FOR_FEEDBACK, employee67, customer406, 4, new Date(Long.parseLong("1483518083000")), "consulting");

ticketManager.add(ticket132);

date = 1483281783000l;

DataGenerator.setValueToField(ticket132, "creationDate", new Date(date));

Ticket ticket133 = new RequestTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.SOLVED, employee112, customer475, 0, new Date(Long.parseLong("1483221521000")), "training");

ticketManager.add(ticket133);

date = 1483604854000l;

DataGenerator.setValueToField(ticket133, "creationDate", new Date(date));

Ticket ticket134 = new RequestTicket("The waves were crashing on the shore. it was a lovely sight.", Status.WAITING_FOR_FEEDBACK, employee112, customer318, 10, new Date(Long.parseLong("1483140048000")), "help desk");

ticketManager.add(ticket134);

date = 1483205720000l;

DataGenerator.setValueToField(ticket134, "creationDate", new Date(date));

Ticket ticket135 = new MalfunctionTicket("He told us a very exciting adventure story.", Status.WAITING_FOR_FEEDBACK, employee135, customer427, 3, "remove");

ticketManager.add(ticket135);

date = 1483488207000l;

DataGenerator.setValueToField(ticket135, "creationDate", new Date(date));

Ticket ticket136 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.WAITING_FOR_FEEDBACK, employee92, customer314, 7, "Green Plants", "Zumron", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 99);

ticketManager.add(ticket136);

date = 1483133867000l;

DataGenerator.setValueToField(ticket136, "creationDate", new Date(date));

Ticket ticket137 = new RequestTicket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.PROCESSED, employee168, customer346, 0, new Date(Long.parseLong("1483527949000")), "help desk");

ticketManager.add(ticket137);

date = 1483176081000l;

DataGenerator.setValueToField(ticket137, "creationDate", new Date(date));

Ticket ticket138 = new MalfunctionTicket("I hear that Nancy is very pretty.", Status.CLOSED, employee132, customer350, 4, "backup");

ticketManager.add(ticket138);

date = 1483213517000l;

DataGenerator.setValueToField(ticket138, "creationDate", new Date(date));

Ticket ticket139 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.CLOSED, employee99, customer444, 0, new Date(Long.parseLong("1483249086000")), "consulting");

ticketManager.add(ticket139);

date = 1483433764000l;

DataGenerator.setValueToField(ticket139, "creationDate", new Date(date));

Ticket ticket140 = new MalfunctionTicket("I think I will buy the red car, or I will lease the blue one.", Status.PROCESSED, employee168, customer311, 10, "remove");

ticketManager.add(ticket140);

date = 1483560276000l;

DataGenerator.setValueToField(ticket140, "creationDate", new Date(date));

Ticket ticket141 = new MalfunctionTicket("Yeah, I think it's a good environment for learning English.", Status.PROCESSED, employee127, customer261, 2, "setup");

ticketManager.add(ticket141);

date = 1483090364000l;

DataGenerator.setValueToField(ticket141, "creationDate", new Date(date));

Ticket ticket142 = new RequestTicket("Yeah, I think it's a good environment for learning English.", Status.SOLVED, employee177, customer490, 10, new Date(Long.parseLong("1483260742000")), "checkup");

ticketManager.add(ticket142);

date = 1483019765000l;

DataGenerator.setValueToField(ticket142, "creationDate", new Date(date));

Ticket ticket143 = new OrderTicket("I often see the time 11:11 or 12:34 on clocks.", Status.SOLVED, employee129, customer253, 9, "Quil", "Zamcanplus", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 53);

ticketManager.add(ticket143);

date = 1483080280000l;

DataGenerator.setValueToField(ticket143, "creationDate", new Date(date));

Ticket ticket144 = new OrderTicket("The old apple revels in its authority.", Status.CLOSED, employee170, customer448, 8, "Telefunk", "Movejob", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 47);

ticketManager.add(ticket144);

date = 1483128030000l;

DataGenerator.setValueToField(ticket144, "creationDate", new Date(date));

Ticket ticket145 = new OrderTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.CLOSED, employee93, customer476, 3, "Sunshine Ice", "Tampfan", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 58);

ticketManager.add(ticket145);

date = 1483478478000l;

DataGenerator.setValueToField(ticket145, "creationDate", new Date(date));

Ticket ticket146 = new MalfunctionTicket("The river stole the gods.", Status.PROCESSED, employee186, customer301, 2, "remove");

ticketManager.add(ticket146);

date = 1483534849000l;

DataGenerator.setValueToField(ticket146, "creationDate", new Date(date));

Ticket ticket147 = new RequestTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.SOLVED, employee82, customer437, 7, new Date(Long.parseLong("1483411495000")), "training");

ticketManager.add(ticket147);

date = 1483164550000l;

DataGenerator.setValueToField(ticket147, "creationDate", new Date(date));

Ticket ticket148 = new RequestTicket("Mary plays the piano.", Status.WAITING_FOR_FEEDBACK, employee133, customer337, 5, new Date(Long.parseLong("1483424638000")), "help desk");

ticketManager.add(ticket148);

date = 1483346525000l;

DataGenerator.setValueToField(ticket148, "creationDate", new Date(date));

Ticket ticket149 = new MalfunctionTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.RECORDED, employee173, customer273, 7, "remove");

ticketManager.add(ticket149);

date = 1483217349000l;

DataGenerator.setValueToField(ticket149, "creationDate", new Date(date));

Ticket ticket150 = new MalfunctionTicket("The waves were crashing on the shore. it was a lovely sight.", Status.CLOSED, employee241, customer326, 8, "setup");

ticketManager.add(ticket150);

date = 1483565706000l;

DataGenerator.setValueToField(ticket150, "creationDate", new Date(date));

Ticket ticket151 = new RequestTicket("Don't step on the broken glass.", Status.RECORDED, employee68, customer279, 0, new Date(Long.parseLong("1483225407000")), "consulting");

ticketManager.add(ticket151);

date = 1483376762000l;

DataGenerator.setValueToField(ticket151, "creationDate", new Date(date));

Ticket ticket152 = new MalfunctionTicket("The shooter says goodbye to his love.", Status.RECORDED, employee105, customer442, 5, "remove");

ticketManager.add(ticket152);

date = 1483275109000l;

DataGenerator.setValueToField(ticket152, "creationDate", new Date(date));

Ticket ticket153 = new OrderTicket("Mary plays the piano.", Status.WAITING_FOR_FEEDBACK, employee203, customer481, 6, "Telefunk", "Icetam", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 71);

ticketManager.add(ticket153);

date = 1483123008000l;

DataGenerator.setValueToField(ticket153, "creationDate", new Date(date));

Ticket ticket154 = new RequestTicket("The memory we used to share is no longer coherent.", Status.SOLVED, employee218, customer432, 2, new Date(Long.parseLong("1483405314000")), "consulting");

ticketManager.add(ticket154);

date = 1483151757000l;

DataGenerator.setValueToField(ticket154, "creationDate", new Date(date));

Ticket ticket155 = new MalfunctionTicket("I want to buy a onesie… but know it won’t suit me.", Status.SOLVED, employee184, customer414, 9, "setup");

ticketManager.add(ticket155);

date = 1483196323000l;

DataGenerator.setValueToField(ticket155, "creationDate", new Date(date));

Ticket ticket156 = new OrderTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.RECORDED, employee211, customer341, 10, "Green Plants", "Stockwarm", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 57);

ticketManager.add(ticket156);

date = 1483048132000l;

DataGenerator.setValueToField(ticket156, "creationDate", new Date(date));

Ticket ticket157 = new RequestTicket("She did her best to help him.", Status.WAITING_FOR_FEEDBACK, employee201, customer263, 2, new Date(Long.parseLong("1483362796000")), "training");

ticketManager.add(ticket157);

date = 1483538001000l;

DataGenerator.setValueToField(ticket157, "creationDate", new Date(date));

Ticket ticket158 = new RequestTicket("Two seats were vacant.", Status.PROCESSED, employee205, customer407, 10, new Date(Long.parseLong("1483444828000")), "consulting");

ticketManager.add(ticket158);

date = 1483614007000l;

DataGenerator.setValueToField(ticket158, "creationDate", new Date(date));

Ticket ticket159 = new MalfunctionTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee173, customer269, 0, "setup");

ticketManager.add(ticket159);

date = 1483307197000l;

DataGenerator.setValueToField(ticket159, "creationDate", new Date(date));

Ticket ticket160 = new RequestTicket("Is it free?", Status.PROCESSED, employee64, customer341, 3, new Date(Long.parseLong("1483200043000")), "consulting");

ticketManager.add(ticket160);

date = 1483353253000l;

DataGenerator.setValueToField(ticket160, "creationDate", new Date(date));

Ticket ticket161 = new OrderTicket("I often see the time 11:11 or 12:34 on clocks.", Status.PROCESSED, employee27, customer252, 1, "Plog", "Don Dax", "B6351, Wooler NE71, Vereinigtes Königreich", 31);

ticketManager.add(ticket161);

date = 1483088974000l;

DataGenerator.setValueToField(ticket161, "creationDate", new Date(date));

Ticket ticket162 = new MalfunctionTicket("I think I will buy the red car, or I will lease the blue one.", Status.RECORDED, employee97, customer419, 5, "remove");

ticketManager.add(ticket162);

date = 1483151699000l;

DataGenerator.setValueToField(ticket162, "creationDate", new Date(date));

Ticket ticket163 = new OrderTicket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.RECORDED, employee59, customer278, 6, "Rent", "Istrax", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 40);

ticketManager.add(ticket163);

date = 1483321315000l;

DataGenerator.setValueToField(ticket163, "creationDate", new Date(date));

Ticket ticket164 = new RequestTicket("Everyone was busy, so I went to the movie alone.", Status.CLOSED, employee93, customer374, 4, new Date(Long.parseLong("1483104183000")), "help desk");

ticketManager.add(ticket164);

date = 1483430351000l;

DataGenerator.setValueToField(ticket164, "creationDate", new Date(date));

Ticket ticket165 = new MalfunctionTicket("Should we start class now, or should we wait for everyone to get here?", Status.RECORDED, employee233, customer336, 9, "restore");

ticketManager.add(ticket165);

date = 1483364056000l;

DataGenerator.setValueToField(ticket165, "creationDate", new Date(date));

Ticket ticket166 = new RequestTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee88, customer317, 6, new Date(Long.parseLong("1483508227000")), "checkup");

ticketManager.add(ticket166);

date = 1483459635000l;

DataGenerator.setValueToField(ticket166, "creationDate", new Date(date));

Ticket ticket167 = new MalfunctionTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.SOLVED, employee178, customer407, 8, "backup");

ticketManager.add(ticket167);

date = 1483024875000l;

DataGenerator.setValueToField(ticket167, "creationDate", new Date(date));

Ticket ticket168 = new OrderTicket("If I don’t like something, I’ll stay away from it.", Status.SOLVED, employee38, customer283, 5, "Micros", "Lot Dax", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 99);

ticketManager.add(ticket168);

date = 1483620261000l;

DataGenerator.setValueToField(ticket168, "creationDate", new Date(date));

Ticket ticket169 = new OrderTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.WAITING_FOR_FEEDBACK, employee53, customer378, 1, "Plog", "Touchfresh", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 71);

ticketManager.add(ticket169);

date = 1483122631000l;

DataGenerator.setValueToField(ticket169, "creationDate", new Date(date));

Ticket ticket170 = new OrderTicket("I am never at home on Sundays.", Status.PROCESSED, employee0, customer284, 2, "Plog", "Touchfresh", "B6351, Wooler NE71, Vereinigtes Königreich", 35);

ticketManager.add(ticket170);

date = 1483502930000l;

DataGenerator.setValueToField(ticket170, "creationDate", new Date(date));

Ticket ticket171 = new RequestTicket("Everyone was busy, so I went to the movie alone.", Status.SOLVED, employee82, customer342, 3, new Date(Long.parseLong("1483330669000")), "consulting");

ticketManager.add(ticket171);

date = 1483071824000l;

DataGenerator.setValueToField(ticket171, "creationDate", new Date(date));

Ticket ticket172 = new RequestTicket("The book is in front of the table.", Status.RECORDED, employee205, customer446, 4, new Date(Long.parseLong("1483219937000")), "checkup");

ticketManager.add(ticket172);

date = 1483063669000l;

DataGenerator.setValueToField(ticket172, "creationDate", new Date(date));

Ticket ticket173 = new RequestTicket("Mary plays the piano.", Status.CLOSED, employee30, customer325, 7, new Date(Long.parseLong("1483153999000")), "help desk");

ticketManager.add(ticket173);

date = 1483249497000l;

DataGenerator.setValueToField(ticket173, "creationDate", new Date(date));

Ticket ticket174 = new OrderTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.CLOSED, employee243, customer435, 9, "Micros", "Greenstring", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 93);

ticketManager.add(ticket174);

date = 1483577139000l;

DataGenerator.setValueToField(ticket174, "creationDate", new Date(date));

Ticket ticket175 = new MalfunctionTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.PROCESSED, employee101, customer324, 9, "backup");

ticketManager.add(ticket175);

date = 1483036099000l;

DataGenerator.setValueToField(ticket175, "creationDate", new Date(date));

Ticket ticket176 = new OrderTicket("I often see the time 11:11 or 12:34 on clocks.", Status.CLOSED, employee178, customer288, 9, "Rent", "Istrax", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 45);

ticketManager.add(ticket176);

date = 1483573720000l;

DataGenerator.setValueToField(ticket176, "creationDate", new Date(date));

Ticket ticket177 = new MalfunctionTicket("I want more detailed information.", Status.RECORDED, employee37, customer466, 3, "setup");

ticketManager.add(ticket177);

date = 1483384661000l;

DataGenerator.setValueToField(ticket177, "creationDate", new Date(date));

Ticket ticket178 = new MalfunctionTicket("Two seats were vacant.", Status.CLOSED, employee179, customer326, 6, "backup");

ticketManager.add(ticket178);

date = 1483447505000l;

DataGenerator.setValueToField(ticket178, "creationDate", new Date(date));

Ticket ticket179 = new OrderTicket("A glittering gem is not enough.", Status.PROCESSED, employee128, customer498, 8, "Red Pizza", "Unohold", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 55);

ticketManager.add(ticket179);

date = 1483048235000l;

DataGenerator.setValueToField(ticket179, "creationDate", new Date(date));

Ticket ticket180 = new RequestTicket("He ran out of money, so he had to stop playing poker.", Status.CLOSED, employee57, customer322, 5, new Date(Long.parseLong("1483567953000")), "consulting");

ticketManager.add(ticket180);

date = 1483198025000l;

DataGenerator.setValueToField(ticket180, "creationDate", new Date(date));

Ticket ticket181 = new OrderTicket("I think I will buy the red car, or I will lease the blue one.", Status.SOLVED, employee19, customer433, 0, "Sunshine Ice", "Tamtom", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 70);

ticketManager.add(ticket181);

date = 1483404619000l;

DataGenerator.setValueToField(ticket181, "creationDate", new Date(date));

Ticket ticket182 = new RequestTicket("The body may perhaps compensates for the loss of a true metaphysics.", Status.CLOSED, employee171, customer326, 3, new Date(Long.parseLong("1483165940000")), "help desk");

ticketManager.add(ticket182);

date = 1483249971000l;

DataGenerator.setValueToField(ticket182, "creationDate", new Date(date));

Ticket ticket183 = new MalfunctionTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.CLOSED, employee191, customer481, 8, "setup");

ticketManager.add(ticket183);

date = 1483277052000l;

DataGenerator.setValueToField(ticket183, "creationDate", new Date(date));

Ticket ticket184 = new MalfunctionTicket("The stranger officiates the meal.", Status.PROCESSED, employee77, customer288, 0, "remove");

ticketManager.add(ticket184);

date = 1483104895000l;

DataGenerator.setValueToField(ticket184, "creationDate", new Date(date));

Ticket ticket185 = new RequestTicket("I currently have 4 windows open up… and I don’t know why.", Status.PROCESSED, employee105, customer253, 5, new Date(Long.parseLong("1483377917000")), "checkup");

ticketManager.add(ticket185);

date = 1483099165000l;

DataGenerator.setValueToField(ticket185, "creationDate", new Date(date));

Ticket ticket186 = new MalfunctionTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.CLOSED, employee66, customer482, 10, "setup");

ticketManager.add(ticket186);

date = 1483019910000l;

DataGenerator.setValueToField(ticket186, "creationDate", new Date(date));

Ticket ticket187 = new MalfunctionTicket("They got there early, and they got really good seats.", Status.RECORDED, employee52, customer274, 8, "setup");

ticketManager.add(ticket187);

date = 1483411450000l;

DataGenerator.setValueToField(ticket187, "creationDate", new Date(date));

Ticket ticket188 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.WAITING_FOR_FEEDBACK, employee45, customer349, 4, new Date(Long.parseLong("1483567110000")), "checkup");

ticketManager.add(ticket188);

date = 1483131555000l;

DataGenerator.setValueToField(ticket188, "creationDate", new Date(date));

Ticket ticket189 = new RequestTicket("Sixty-Four comes asking for bread.", Status.PROCESSED, employee62, customer399, 0, new Date(Long.parseLong("1483616326000")), "consulting");

ticketManager.add(ticket189);

date = 1483512120000l;

DataGenerator.setValueToField(ticket189, "creationDate", new Date(date));

Ticket ticket190 = new OrderTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.CLOSED, employee189, customer463, 1, "Green Plants", "Icetam", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 59);

ticketManager.add(ticket190);

date = 1483494276000l;

DataGenerator.setValueToField(ticket190, "creationDate", new Date(date));

Ticket ticket191 = new OrderTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.RECORDED, employee79, customer282, 6, "Green Plants", "Trippletone", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 97);

ticketManager.add(ticket191);

date = 1483449396000l;

DataGenerator.setValueToField(ticket191, "creationDate", new Date(date));

Ticket ticket192 = new MalfunctionTicket("She advised him to come back at once.", Status.PROCESSED, employee209, customer334, 7, "remove");

ticketManager.add(ticket192);

date = 1483586059000l;

DataGenerator.setValueToField(ticket192, "creationDate", new Date(date));

Ticket ticket193 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.SOLVED, employee171, customer397, 1, new Date(Long.parseLong("1483594410000")), "consulting");

ticketManager.add(ticket193);

date = 1483332462000l;

DataGenerator.setValueToField(ticket193, "creationDate", new Date(date));

Ticket ticket194 = new MalfunctionTicket("The old apple revels in its authority.", Status.WAITING_FOR_FEEDBACK, employee14, customer483, 10, "remove");

ticketManager.add(ticket194);

date = 1483019255000l;

DataGenerator.setValueToField(ticket194, "creationDate", new Date(date));

Ticket ticket195 = new RequestTicket("Lets all be unique together until we realise we are all the same.", Status.SOLVED, employee185, customer331, 1, new Date(Long.parseLong("1483484694000")), "training");

ticketManager.add(ticket195);

date = 1483389076000l;

DataGenerator.setValueToField(ticket195, "creationDate", new Date(date));

Ticket ticket196 = new OrderTicket("I'd rather be a bird than a fish.", Status.RECORDED, employee210, customer462, 3, "Red Pizza", "Sun-Tom", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 73);

ticketManager.add(ticket196);

date = 1483107560000l;

DataGenerator.setValueToField(ticket196, "creationDate", new Date(date));

Ticket ticket197 = new OrderTicket("I often see the time 11:11 or 12:34 on clocks.", Status.CLOSED, employee14, customer407, 8, "Plog", "Gravequadtam", "B6351, Wooler NE71, Vereinigtes Königreich", 30);

ticketManager.add(ticket197);

date = 1483184239000l;

DataGenerator.setValueToField(ticket197, "creationDate", new Date(date));

Ticket ticket198 = new RequestTicket("I want more detailed information.", Status.RECORDED, employee17, customer414, 9, new Date(Long.parseLong("1483513436000")), "help desk");

ticketManager.add(ticket198);

date = 1483470848000l;

DataGenerator.setValueToField(ticket198, "creationDate", new Date(date));

Ticket ticket199 = new OrderTicket("Mary plays the piano.", Status.PROCESSED, employee152, customer331, 4, "Blue Water", "Stockwarm", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 31);

ticketManager.add(ticket199);

date = 1483094410000l;

DataGenerator.setValueToField(ticket199, "creationDate", new Date(date));

Ticket ticket200 = new OrderTicket("I want more detailed information.", Status.RECORDED, employee20, customer495, 6, "Micros", "Sao Dansing", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 36);

ticketManager.add(ticket200);

date = 1483596434000l;

DataGenerator.setValueToField(ticket200, "creationDate", new Date(date));

Ticket ticket201 = new RequestTicket("Joe made the sugar cookies. Susan decorated them.", Status.PROCESSED, employee86, customer382, 6, new Date(Long.parseLong("1483118820000")), "consulting");

ticketManager.add(ticket201);

date = 1483124555000l;

DataGenerator.setValueToField(ticket201, "creationDate", new Date(date));

Ticket ticket202 = new RequestTicket("They got there early, and they got really good seats.", Status.WAITING_FOR_FEEDBACK, employee64, customer409, 1, new Date(Long.parseLong("1483515083000")), "training");

ticketManager.add(ticket202);

date = 1483200460000l;

DataGenerator.setValueToField(ticket202, "creationDate", new Date(date));

Ticket ticket203 = new MalfunctionTicket("The sky is clear. the stars are twinkling.", Status.WAITING_FOR_FEEDBACK, employee216, customer386, 8, "setup");

ticketManager.add(ticket203);

date = 1483298817000l;

DataGenerator.setValueToField(ticket203, "creationDate", new Date(date));

Ticket ticket204 = new MalfunctionTicket("Two seats were vacant.", Status.RECORDED, employee156, customer396, 9, "restore");

ticketManager.add(ticket204);

date = 1483574298000l;

DataGenerator.setValueToField(ticket204, "creationDate", new Date(date));

Ticket ticket205 = new RequestTicket("Sixty-Four comes asking for bread.", Status.RECORDED, employee179, customer436, 6, new Date(Long.parseLong("1483612150000")), "consulting");

ticketManager.add(ticket205);

date = 1483359301000l;

DataGenerator.setValueToField(ticket205, "creationDate", new Date(date));

Ticket ticket206 = new OrderTicket("The waves were crashing on the shore. it was a lovely sight.", Status.SOLVED, employee0, customer386, 4, "Blue Water", "Zumron", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 57);

ticketManager.add(ticket206);

date = 1483217967000l;

DataGenerator.setValueToField(ticket206, "creationDate", new Date(date));

Ticket ticket207 = new MalfunctionTicket("The sky is clear. the stars are twinkling.", Status.RECORDED, employee83, customer297, 5, "remove");

ticketManager.add(ticket207);

date = 1483573376000l;

DataGenerator.setValueToField(ticket207, "creationDate", new Date(date));

Ticket ticket208 = new MalfunctionTicket("How was the math test?", Status.SOLVED, employee105, customer357, 4, "repair");

ticketManager.add(ticket208);

date = 1483083913000l;

DataGenerator.setValueToField(ticket208, "creationDate", new Date(date));

Ticket ticket209 = new MalfunctionTicket("Lets all be unique together until we realise we are all the same.", Status.SOLVED, employee172, customer485, 7, "setup");

ticketManager.add(ticket209);

date = 1483100445000l;

DataGenerator.setValueToField(ticket209, "creationDate", new Date(date));

Ticket ticket210 = new RequestTicket("Let me help you with your baggage.", Status.CLOSED, employee25, customer277, 0, new Date(Long.parseLong("1483319515000")), "help desk");

ticketManager.add(ticket210);

date = 1483299031000l;

DataGenerator.setValueToField(ticket210, "creationDate", new Date(date));

Ticket ticket211 = new OrderTicket("She did her best to help him.", Status.RECORDED, employee223, customer333, 10, "Rent", "Trippletone", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 43);

ticketManager.add(ticket211);

date = 1483113303000l;

DataGenerator.setValueToField(ticket211, "creationDate", new Date(date));

Ticket ticket212 = new RequestTicket("She always speaks to him in a loud voice.", Status.WAITING_FOR_FEEDBACK, employee113, customer291, 7, new Date(Long.parseLong("1483045274000")), "training");

ticketManager.add(ticket212);

date = 1483452391000l;

DataGenerator.setValueToField(ticket212, "creationDate", new Date(date));

Ticket ticket213 = new MalfunctionTicket("Sixty-Four comes asking for bread.", Status.CLOSED, employee228, customer471, 10, "repair");

ticketManager.add(ticket213);

date = 1483563564000l;

DataGenerator.setValueToField(ticket213, "creationDate", new Date(date));

Ticket ticket214 = new MalfunctionTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.RECORDED, employee20, customer297, 0, "backup");

ticketManager.add(ticket214);

date = 1483181908000l;

DataGenerator.setValueToField(ticket214, "creationDate", new Date(date));

Ticket ticket215 = new MalfunctionTicket("Everyone was busy, so I went to the movie alone.", Status.WAITING_FOR_FEEDBACK, employee149, customer491, 3, "backup");

ticketManager.add(ticket215);

date = 1483473915000l;

DataGenerator.setValueToField(ticket215, "creationDate", new Date(date));

Ticket ticket216 = new MalfunctionTicket("Don't step on the broken glass.", Status.CLOSED, employee74, customer444, 1, "backup");

ticketManager.add(ticket216);

date = 1483103867000l;

DataGenerator.setValueToField(ticket216, "creationDate", new Date(date));

Ticket ticket217 = new OrderTicket("Should we start class now, or should we wait for everyone to get here?", Status.SOLVED, employee157, customer443, 2, "Telefunk", "Icetam", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 95);

ticketManager.add(ticket217);

date = 1483521009000l;

DataGenerator.setValueToField(ticket217, "creationDate", new Date(date));

Ticket ticket218 = new MalfunctionTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.SOLVED, employee40, customer493, 7, "remove");

ticketManager.add(ticket218);

date = 1483158949000l;

DataGenerator.setValueToField(ticket218, "creationDate", new Date(date));

Ticket ticket219 = new MalfunctionTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.PROCESSED, employee31, customer450, 9, "remove");

ticketManager.add(ticket219);

date = 1483247041000l;

DataGenerator.setValueToField(ticket219, "creationDate", new Date(date));

Ticket ticket220 = new RequestTicket("I hear that Nancy is very pretty.", Status.SOLVED, employee62, customer354, 1, new Date(Long.parseLong("1483247349000")), "checkup");

ticketManager.add(ticket220);

date = 1483401820000l;

DataGenerator.setValueToField(ticket220, "creationDate", new Date(date));

Ticket ticket221 = new OrderTicket("She did her best to help him.", Status.SOLVED, employee163, customer398, 10, "Sunshine Ice", "Trippletone", "B6351, Wooler NE71, Vereinigtes Königreich", 56);

ticketManager.add(ticket221);

date = 1483503098000l;

DataGenerator.setValueToField(ticket221, "creationDate", new Date(date));

Ticket ticket222 = new RequestTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.PROCESSED, employee247, customer326, 4, new Date(Long.parseLong("1483574526000")), "consulting");

ticketManager.add(ticket222);

date = 1483267077000l;

DataGenerator.setValueToField(ticket222, "creationDate", new Date(date));

Ticket ticket223 = new RequestTicket("I am never at home on Sundays.", Status.RECORDED, employee65, customer259, 8, new Date(Long.parseLong("1483045096000")), "help desk");

ticketManager.add(ticket223);

date = 1483442743000l;

DataGenerator.setValueToField(ticket223, "creationDate", new Date(date));

Ticket ticket224 = new MalfunctionTicket("We have never been to Asia, nor have we visited Africa.", Status.SOLVED, employee217, customer411, 10, "restore");

ticketManager.add(ticket224);

date = 1483526423000l;

DataGenerator.setValueToField(ticket224, "creationDate", new Date(date));

Ticket ticket225 = new OrderTicket("I am never at home on Sundays.", Status.SOLVED, employee120, customer317, 1, "Fresher", "Lot Dax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 48);

ticketManager.add(ticket225);

date = 1483428807000l;

DataGenerator.setValueToField(ticket225, "creationDate", new Date(date));

Ticket ticket226 = new MalfunctionTicket("I want to buy a onesie… but know it won’t suit me.", Status.CLOSED, employee55, customer493, 4, "backup");

ticketManager.add(ticket226);

date = 1483233998000l;

DataGenerator.setValueToField(ticket226, "creationDate", new Date(date));

Ticket ticket227 = new OrderTicket("I want to buy a onesie… but know it won’t suit me.", Status.CLOSED, employee65, customer254, 4, "Sunshine Ice", "Movejob", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 54);

ticketManager.add(ticket227);

date = 1483561895000l;

DataGenerator.setValueToField(ticket227, "creationDate", new Date(date));

Ticket ticket228 = new MalfunctionTicket("I really want to go to work, but I am too sick to drive.", Status.RECORDED, employee37, customer459, 3, "setup");

ticketManager.add(ticket228);

date = 1483072359000l;

DataGenerator.setValueToField(ticket228, "creationDate", new Date(date));

Ticket ticket229 = new OrderTicket("The river stole the gods.", Status.WAITING_FOR_FEEDBACK, employee18, customer487, 2, "Blue Water", "Haynimfax", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 53);

ticketManager.add(ticket229);

date = 1483240818000l;

DataGenerator.setValueToField(ticket229, "creationDate", new Date(date));

Ticket ticket230 = new RequestTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.RECORDED, employee78, customer274, 8, new Date(Long.parseLong("1483364181000")), "training");

ticketManager.add(ticket230);

date = 1483163278000l;

DataGenerator.setValueToField(ticket230, "creationDate", new Date(date));

Ticket ticket231 = new MalfunctionTicket("The quick brown fox jumps over the lazy dog.", Status.WAITING_FOR_FEEDBACK, employee149, customer311, 9, "restore");

ticketManager.add(ticket231);

date = 1483059479000l;

DataGenerator.setValueToField(ticket231, "creationDate", new Date(date));

Ticket ticket232 = new OrderTicket("I checked to make sure that he was still alive.", Status.RECORDED, employee68, customer363, 6, "Red Pizza", "Unolab", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 48);

ticketManager.add(ticket232);

date = 1483524101000l;

DataGenerator.setValueToField(ticket232, "creationDate", new Date(date));

Ticket ticket233 = new OrderTicket("This is a Japanese doll.", Status.RECORDED, employee76, customer280, 6, "Rent", "Home Ovetone", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 33);

ticketManager.add(ticket233);

date = 1483569924000l;

DataGenerator.setValueToField(ticket233, "creationDate", new Date(date));

Ticket ticket234 = new MalfunctionTicket("She wrote him a long letter, but he didn't read it.", Status.WAITING_FOR_FEEDBACK, employee86, customer329, 4, "remove");

ticketManager.add(ticket234);

date = 1483256418000l;

DataGenerator.setValueToField(ticket234, "creationDate", new Date(date));

Ticket ticket235 = new MalfunctionTicket("She was too short to see over the fence.", Status.SOLVED, employee61, customer361, 3, "remove");

ticketManager.add(ticket235);

date = 1483266316000l;

DataGenerator.setValueToField(ticket235, "creationDate", new Date(date));

Ticket ticket236 = new RequestTicket("He ran out of money, so he had to stop playing poker.", Status.SOLVED, employee83, customer313, 2, new Date(Long.parseLong("1483018597000")), "consulting");

ticketManager.add(ticket236);

date = 1483062014000l;

DataGenerator.setValueToField(ticket236, "creationDate", new Date(date));

Ticket ticket237 = new MalfunctionTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.RECORDED, employee187, customer416, 6, "backup");

ticketManager.add(ticket237);

date = 1483199846000l;

DataGenerator.setValueToField(ticket237, "creationDate", new Date(date));

Ticket ticket238 = new MalfunctionTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.WAITING_FOR_FEEDBACK, employee131, customer323, 4, "remove");

ticketManager.add(ticket238);

date = 1483518169000l;

DataGenerator.setValueToField(ticket238, "creationDate", new Date(date));

Ticket ticket239 = new RequestTicket("She did her best to help him.", Status.SOLVED, employee127, customer375, 10, new Date(Long.parseLong("1483163351000")), "help desk");

ticketManager.add(ticket239);

date = 1483357310000l;

DataGenerator.setValueToField(ticket239, "creationDate", new Date(date));

Ticket ticket240 = new OrderTicket("Everyone was busy, so I went to the movie alone.", Status.WAITING_FOR_FEEDBACK, employee138, customer419, 3, "Red Pizza", "Tonlab", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 34);

ticketManager.add(ticket240);

date = 1483081412000l;

DataGenerator.setValueToField(ticket240, "creationDate", new Date(date));

Ticket ticket241 = new MalfunctionTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.SOLVED, employee145, customer397, 2, "restore");

ticketManager.add(ticket241);

date = 1483147638000l;

DataGenerator.setValueToField(ticket241, "creationDate", new Date(date));

Ticket ticket242 = new MalfunctionTicket("If I don’t like something, I’ll stay away from it.", Status.CLOSED, employee87, customer285, 8, "backup");

ticketManager.add(ticket242);

date = 1483621114000l;

DataGenerator.setValueToField(ticket242, "creationDate", new Date(date));

Ticket ticket243 = new OrderTicket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.SOLVED, employee235, customer438, 7, "Red Pizza", "Airfix", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 80);

ticketManager.add(ticket243);

date = 1483107203000l;

DataGenerator.setValueToField(ticket243, "creationDate", new Date(date));

Ticket ticket244 = new OrderTicket("Abstraction is often one floor above you.", Status.WAITING_FOR_FEEDBACK, employee164, customer266, 10, "Rent", "Zumron", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 50);

ticketManager.add(ticket244);

date = 1483157307000l;

DataGenerator.setValueToField(ticket244, "creationDate", new Date(date));

Ticket ticket245 = new MalfunctionTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.CLOSED, employee20, customer254, 0, "remove");

ticketManager.add(ticket245);

date = 1483379813000l;

DataGenerator.setValueToField(ticket245, "creationDate", new Date(date));

Ticket ticket246 = new MalfunctionTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.PROCESSED, employee1, customer286, 6, "remove");

ticketManager.add(ticket246);

date = 1483230941000l;

DataGenerator.setValueToField(ticket246, "creationDate", new Date(date));

Ticket ticket247 = new MalfunctionTicket("The shooter says goodbye to his love.", Status.PROCESSED, employee41, customer361, 9, "remove");

ticketManager.add(ticket247);

date = 1483152716000l;

DataGenerator.setValueToField(ticket247, "creationDate", new Date(date));

Ticket ticket248 = new RequestTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee48, customer423, 2, new Date(Long.parseLong("1483490997000")), "checkup");

ticketManager.add(ticket248);

date = 1483198464000l;

DataGenerator.setValueToField(ticket248, "creationDate", new Date(date));

Ticket ticket249 = new RequestTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.CLOSED, employee167, customer472, 7, new Date(Long.parseLong("1483134288000")), "training");

ticketManager.add(ticket249);

date = 1483576477000l;

DataGenerator.setValueToField(ticket249, "creationDate", new Date(date));

Ticket ticket250 = new OrderTicket("Mary plays the piano.", Status.PROCESSED, employee13, customer339, 3, "Fresher", "Icetam", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 71);

ticketManager.add(ticket250);

date = 1483029760000l;

DataGenerator.setValueToField(ticket250, "creationDate", new Date(date));

Ticket ticket251 = new RequestTicket("We need to rent a room for our party.", Status.CLOSED, employee196, customer253, 8, new Date(Long.parseLong("1483465046000")), "help desk");

ticketManager.add(ticket251);

date = 1483524944000l;

DataGenerator.setValueToField(ticket251, "creationDate", new Date(date));

Ticket ticket252 = new OrderTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.WAITING_FOR_FEEDBACK, employee156, customer403, 0, "Green Plants", "Unolab", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 83);

ticketManager.add(ticket252);

date = 1483303905000l;

DataGenerator.setValueToField(ticket252, "creationDate", new Date(date));

Ticket ticket253 = new OrderTicket("The mysterious diary records the voice.", Status.PROCESSED, employee45, customer376, 1, "Micros", "Icetam", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 32);

ticketManager.add(ticket253);

date = 1483159937000l;

DataGenerator.setValueToField(ticket253, "creationDate", new Date(date));

Ticket ticket254 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.CLOSED, employee151, customer405, 2, "Green Plants", "Haynimfax", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 92);

ticketManager.add(ticket254);

date = 1483066810000l;

DataGenerator.setValueToField(ticket254, "creationDate", new Date(date));

Ticket ticket255 = new MalfunctionTicket("The lake is a long way from here.", Status.SOLVED, employee225, customer301, 1, "remove");

ticketManager.add(ticket255);

date = 1483167579000l;

DataGenerator.setValueToField(ticket255, "creationDate", new Date(date));

Ticket ticket256 = new OrderTicket("The river stole the gods.", Status.RECORDED, employee176, customer331, 0, "Green Plants", "Istrax", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 98);

ticketManager.add(ticket256);

date = 1483115443000l;

DataGenerator.setValueToField(ticket256, "creationDate", new Date(date));

Ticket ticket257 = new RequestTicket("I checked to make sure that he was still alive.", Status.CLOSED, employee86, customer315, 10, new Date(Long.parseLong("1483060666000")), "training");

ticketManager.add(ticket257);

date = 1483171831000l;

DataGenerator.setValueToField(ticket257, "creationDate", new Date(date));

Ticket ticket258 = new RequestTicket("She wrote him a long letter, but he didn't read it.", Status.WAITING_FOR_FEEDBACK, employee18, customer433, 1, new Date(Long.parseLong("1483223743000")), "help desk");

ticketManager.add(ticket258);

date = 1483555192000l;

DataGenerator.setValueToField(ticket258, "creationDate", new Date(date));

Ticket ticket259 = new OrderTicket("Wow, does that work?", Status.RECORDED, employee99, customer344, 10, "Micros", "Quofan", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 35);

ticketManager.add(ticket259);

date = 1483043310000l;

DataGenerator.setValueToField(ticket259, "creationDate", new Date(date));

Ticket ticket260 = new RequestTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.CLOSED, employee74, customer495, 9, new Date(Long.parseLong("1483090015000")), "help desk");

ticketManager.add(ticket260);

date = 1483294215000l;

DataGenerator.setValueToField(ticket260, "creationDate", new Date(date));

Ticket ticket261 = new RequestTicket("She always speaks to him in a loud voice.", Status.CLOSED, employee106, customer258, 10, new Date(Long.parseLong("1483049464000")), "consulting");

ticketManager.add(ticket261);

date = 1483247367000l;

DataGenerator.setValueToField(ticket261, "creationDate", new Date(date));

Ticket ticket262 = new MalfunctionTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.WAITING_FOR_FEEDBACK, employee36, customer314, 5, "repair");

ticketManager.add(ticket262);

date = 1483236439000l;

DataGenerator.setValueToField(ticket262, "creationDate", new Date(date));

Ticket ticket263 = new RequestTicket("He told us a very exciting adventure story.", Status.CLOSED, employee113, customer377, 7, new Date(Long.parseLong("1483358422000")), "training");

ticketManager.add(ticket263);

date = 1483427731000l;

DataGenerator.setValueToField(ticket263, "creationDate", new Date(date));

Ticket ticket264 = new OrderTicket("Tom got a small piece of pie.", Status.RECORDED, employee184, customer348, 2, "Blue Water", "Zumron", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 39);

ticketManager.add(ticket264);

date = 1483442999000l;

DataGenerator.setValueToField(ticket264, "creationDate", new Date(date));

Ticket ticket265 = new OrderTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.CLOSED, employee119, customer296, 3, "Telefunk", "Tamtom", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 92);

ticketManager.add(ticket265);

date = 1483198950000l;

DataGenerator.setValueToField(ticket265, "creationDate", new Date(date));

Ticket ticket266 = new RequestTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.RECORDED, employee58, customer371, 9, new Date(Long.parseLong("1483590443000")), "training");

ticketManager.add(ticket266);

date = 1483616011000l;

DataGenerator.setValueToField(ticket266, "creationDate", new Date(date));

Ticket ticket267 = new OrderTicket("Everyone was busy, so I went to the movie alone.", Status.PROCESSED, employee149, customer286, 0, "Rent", "Trippletone", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 62);

ticketManager.add(ticket267);

date = 1483594851000l;

DataGenerator.setValueToField(ticket267, "creationDate", new Date(date));

Ticket ticket268 = new RequestTicket("She did her best to help him.", Status.CLOSED, employee93, customer490, 10, new Date(Long.parseLong("1483523437000")), "help desk");

ticketManager.add(ticket268);

date = 1483602061000l;

DataGenerator.setValueToField(ticket268, "creationDate", new Date(date));

Ticket ticket269 = new MalfunctionTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.WAITING_FOR_FEEDBACK, employee72, customer303, 5, "setup");

ticketManager.add(ticket269);

date = 1483061169000l;

DataGenerator.setValueToField(ticket269, "creationDate", new Date(date));

Ticket ticket270 = new RequestTicket("Should we start class now, or should we wait for everyone to get here?", Status.SOLVED, employee1, customer451, 0, new Date(Long.parseLong("1483210531000")), "training");

ticketManager.add(ticket270);

date = 1483040215000l;

DataGenerator.setValueToField(ticket270, "creationDate", new Date(date));

Ticket ticket271 = new RequestTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.CLOSED, employee50, customer499, 5, new Date(Long.parseLong("1483241331000")), "help desk");

ticketManager.add(ticket271);

date = 1483387768000l;

DataGenerator.setValueToField(ticket271, "creationDate", new Date(date));

Ticket ticket272 = new MalfunctionTicket("She only paints with bold colors. she does not like pastels.", Status.SOLVED, employee86, customer291, 6, "repair");

ticketManager.add(ticket272);

date = 1483330393000l;

DataGenerator.setValueToField(ticket272, "creationDate", new Date(date));

Ticket ticket273 = new OrderTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.SOLVED, employee99, customer309, 10, "Red Pizza", "Tonlab", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 81);

ticketManager.add(ticket273);

date = 1483494196000l;

DataGenerator.setValueToField(ticket273, "creationDate", new Date(date));

Ticket ticket274 = new RequestTicket("Check back tomorrow. I will see if the book has arrived.", Status.RECORDED, employee212, customer295, 1, new Date(Long.parseLong("1483027350000")), "help desk");

ticketManager.add(ticket274);

date = 1483599340000l;

DataGenerator.setValueToField(ticket274, "creationDate", new Date(date));

Ticket ticket275 = new RequestTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.SOLVED, employee173, customer457, 4, new Date(Long.parseLong("1483429980000")), "training");

ticketManager.add(ticket275);

date = 1483322795000l;

DataGenerator.setValueToField(ticket275, "creationDate", new Date(date));

Ticket ticket276 = new RequestTicket("Yeah, I think it's a good environment for learning English.", Status.SOLVED, employee152, customer486, 4, new Date(Long.parseLong("1483340910000")), "help desk");

ticketManager.add(ticket276);

date = 1483350993000l;

DataGenerator.setValueToField(ticket276, "creationDate", new Date(date));

Ticket ticket277 = new OrderTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.PROCESSED, employee104, customer401, 4, "Plog", "Sun-Tom", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 33);

ticketManager.add(ticket277);

date = 1483359895000l;

DataGenerator.setValueToField(ticket277, "creationDate", new Date(date));

Ticket ticket278 = new MalfunctionTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.CLOSED, employee17, customer374, 3, "repair");

ticketManager.add(ticket278);

date = 1483363429000l;

DataGenerator.setValueToField(ticket278, "creationDate", new Date(date));

Ticket ticket279 = new OrderTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.CLOSED, employee34, customer264, 5, "Rent", "Zamcanplus", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 75);

ticketManager.add(ticket279);

date = 1483570218000l;

DataGenerator.setValueToField(ticket279, "creationDate", new Date(date));

Ticket ticket280 = new OrderTicket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee213, customer470, 0, "Blue Water", "Istrax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 37);

ticketManager.add(ticket280);

date = 1483552603000l;

DataGenerator.setValueToField(ticket280, "creationDate", new Date(date));

Ticket ticket281 = new MalfunctionTicket("Let me help you with your baggage.", Status.PROCESSED, employee81, customer288, 10, "backup");

ticketManager.add(ticket281);

date = 1483242817000l;

DataGenerator.setValueToField(ticket281, "creationDate", new Date(date));

Ticket ticket282 = new RequestTicket("The book is in front of the table.", Status.CLOSED, employee148, customer309, 0, new Date(Long.parseLong("1483131242000")), "checkup");

ticketManager.add(ticket282);

date = 1483249906000l;

DataGenerator.setValueToField(ticket282, "creationDate", new Date(date));

Ticket ticket283 = new RequestTicket("The sky is clear. the stars are twinkling.", Status.PROCESSED, employee156, customer331, 4, new Date(Long.parseLong("1483265466000")), "training");

ticketManager.add(ticket283);

date = 1483533780000l;

DataGenerator.setValueToField(ticket283, "creationDate", new Date(date));

Ticket ticket284 = new MalfunctionTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.SOLVED, employee9, customer261, 8, "restore");

ticketManager.add(ticket284);

date = 1483365678000l;

DataGenerator.setValueToField(ticket284, "creationDate", new Date(date));

Ticket ticket285 = new OrderTicket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee200, customer320, 1, "Red Pizza", "Greenstring", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 45);

ticketManager.add(ticket285);

date = 1483330864000l;

DataGenerator.setValueToField(ticket285, "creationDate", new Date(date));

Ticket ticket286 = new OrderTicket("Abstraction is often one floor above you.", Status.RECORDED, employee234, customer446, 3, "Red Pizza", "Tonlab", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 85);

ticketManager.add(ticket286);

date = 1483053960000l;

DataGenerator.setValueToField(ticket286, "creationDate", new Date(date));

Ticket ticket287 = new RequestTicket("She was too short to see over the fence.", Status.SOLVED, employee35, customer382, 4, new Date(Long.parseLong("1483060701000")), "checkup");

ticketManager.add(ticket287);

date = 1483028843000l;

DataGenerator.setValueToField(ticket287, "creationDate", new Date(date));

Ticket ticket288 = new RequestTicket("It was getting dark, and we weren’t there yet.", Status.SOLVED, employee15, customer357, 4, new Date(Long.parseLong("1483097296000")), "consulting");

ticketManager.add(ticket288);

date = 1483105364000l;

DataGenerator.setValueToField(ticket288, "creationDate", new Date(date));

Ticket ticket289 = new MalfunctionTicket("I really want to go to work, but I am too sick to drive.", Status.CLOSED, employee175, customer399, 8, "setup");

ticketManager.add(ticket289);

date = 1483317680000l;

DataGenerator.setValueToField(ticket289, "creationDate", new Date(date));

Ticket ticket290 = new MalfunctionTicket("I really want to go to work, but I am too sick to drive.", Status.WAITING_FOR_FEEDBACK, employee47, customer293, 8, "setup");

ticketManager.add(ticket290);

date = 1483075650000l;

DataGenerator.setValueToField(ticket290, "creationDate", new Date(date));

Ticket ticket291 = new MalfunctionTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee85, customer280, 7, "repair");

ticketManager.add(ticket291);

date = 1483334618000l;

DataGenerator.setValueToField(ticket291, "creationDate", new Date(date));

Ticket ticket292 = new RequestTicket("She always speaks to him in a loud voice.", Status.PROCESSED, employee153, customer478, 10, new Date(Long.parseLong("1483276442000")), "training");

ticketManager.add(ticket292);

date = 1483558108000l;

DataGenerator.setValueToField(ticket292, "creationDate", new Date(date));

Ticket ticket293 = new OrderTicket("I am counting my calories, yet I really want dessert.", Status.PROCESSED, employee102, customer254, 6, "Green Plants", "Unohold", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 89);

ticketManager.add(ticket293);

date = 1483380106000l;

DataGenerator.setValueToField(ticket293, "creationDate", new Date(date));

Ticket ticket294 = new MalfunctionTicket("The sky is clear. the stars are twinkling.", Status.WAITING_FOR_FEEDBACK, employee138, customer343, 8, "restore");

ticketManager.add(ticket294);

date = 1483420438000l;

DataGenerator.setValueToField(ticket294, "creationDate", new Date(date));

Ticket ticket295 = new MalfunctionTicket("Sixty-Four comes asking for bread.", Status.CLOSED, employee228, customer436, 0, "repair");

ticketManager.add(ticket295);

date = 1483255459000l;

DataGenerator.setValueToField(ticket295, "creationDate", new Date(date));

Ticket ticket296 = new MalfunctionTicket("The lake is a long way from here.", Status.PROCESSED, employee162, customer335, 5, "restore");

ticketManager.add(ticket296);

date = 1483365241000l;

DataGenerator.setValueToField(ticket296, "creationDate", new Date(date));

Ticket ticket297 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee14, customer335, 1, "Blue Water", "Quad Zozlax", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 98);

ticketManager.add(ticket297);

date = 1483174780000l;

DataGenerator.setValueToField(ticket297, "creationDate", new Date(date));

Ticket ticket298 = new MalfunctionTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.RECORDED, employee61, customer254, 10, "setup");

ticketManager.add(ticket298);

date = 1483209586000l;

DataGenerator.setValueToField(ticket298, "creationDate", new Date(date));

Ticket ticket299 = new MalfunctionTicket("We have a lot of rain in June.", Status.WAITING_FOR_FEEDBACK, employee201, customer282, 3, "remove");

ticketManager.add(ticket299);

date = 1483104854000l;

DataGenerator.setValueToField(ticket299, "creationDate", new Date(date));

Ticket ticket300 = new MalfunctionTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.PROCESSED, employee137, customer295, 0, "restore");

ticketManager.add(ticket300);

date = 1483110433000l;

DataGenerator.setValueToField(ticket300, "creationDate", new Date(date));

Ticket ticket301 = new MalfunctionTicket("If I don’t like something, I’ll stay away from it.", Status.PROCESSED, employee216, customer263, 4, "backup");

ticketManager.add(ticket301);

date = 1483529455000l;

DataGenerator.setValueToField(ticket301, "creationDate", new Date(date));

Ticket ticket302 = new OrderTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.RECORDED, employee157, customer461, 3, "Fresher", "Movejob", "B6351, Wooler NE71, Vereinigtes Königreich", 81);

ticketManager.add(ticket302);

date = 1483542317000l;

DataGenerator.setValueToField(ticket302, "creationDate", new Date(date));

Ticket ticket303 = new RequestTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.RECORDED, employee136, customer255, 6, new Date(Long.parseLong("1483610480000")), "help desk");

ticketManager.add(ticket303);

date = 1483545063000l;

DataGenerator.setValueToField(ticket303, "creationDate", new Date(date));

Ticket ticket304 = new RequestTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.CLOSED, employee19, customer412, 2, new Date(Long.parseLong("1483055980000")), "checkup");

ticketManager.add(ticket304);

date = 1483457525000l;

DataGenerator.setValueToField(ticket304, "creationDate", new Date(date));

Ticket ticket305 = new OrderTicket("A song can make or ruin a person’s day if they let it get to them.", Status.RECORDED, employee100, customer498, 3, "Fresher", "Haynimfax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 83);

ticketManager.add(ticket305);

date = 1483551373000l;

DataGenerator.setValueToField(ticket305, "creationDate", new Date(date));

Ticket ticket306 = new RequestTicket("I really want to go to work, but I am too sick to drive.", Status.SOLVED, employee144, customer318, 4, new Date(Long.parseLong("1483132933000")), "consulting");

ticketManager.add(ticket306);

date = 1483021268000l;

DataGenerator.setValueToField(ticket306, "creationDate", new Date(date));

Ticket ticket307 = new MalfunctionTicket("Tom got a small piece of pie.", Status.SOLVED, employee122, customer474, 4, "backup");

ticketManager.add(ticket307);

date = 1483510133000l;

DataGenerator.setValueToField(ticket307, "creationDate", new Date(date));

Ticket ticket308 = new RequestTicket("We have a lot of rain in June.", Status.WAITING_FOR_FEEDBACK, employee239, customer371, 4, new Date(Long.parseLong("1483348310000")), "help desk");

ticketManager.add(ticket308);

date = 1483144592000l;

DataGenerator.setValueToField(ticket308, "creationDate", new Date(date));

Ticket ticket309 = new RequestTicket("She advised him to come back at once.", Status.SOLVED, employee240, customer487, 1, new Date(Long.parseLong("1483433658000")), "training");

ticketManager.add(ticket309);

date = 1483077651000l;

DataGenerator.setValueToField(ticket309, "creationDate", new Date(date));

Ticket ticket310 = new MalfunctionTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.SOLVED, employee37, customer320, 9, "repair");

ticketManager.add(ticket310);

date = 1483463873000l;

DataGenerator.setValueToField(ticket310, "creationDate", new Date(date));

Ticket ticket311 = new OrderTicket("She wrote him a long letter, but he didn't read it.", Status.CLOSED, employee30, customer384, 10, "Plog", "Movejob", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 44);

ticketManager.add(ticket311);

date = 1483607403000l;

DataGenerator.setValueToField(ticket311, "creationDate", new Date(date));

Ticket ticket312 = new OrderTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.SOLVED, employee60, customer347, 2, "Rent", "Gravequadtam", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 50);

ticketManager.add(ticket312);

date = 1483307133000l;

DataGenerator.setValueToField(ticket312, "creationDate", new Date(date));

Ticket ticket313 = new OrderTicket("I think I will buy the red car, or I will lease the blue one.", Status.WAITING_FOR_FEEDBACK, employee163, customer399, 6, "Micros", "Unohold", "B6351, Wooler NE71, Vereinigtes Königreich", 90);

ticketManager.add(ticket313);

date = 1483045981000l;

DataGenerator.setValueToField(ticket313, "creationDate", new Date(date));

Ticket ticket314 = new RequestTicket("Cats are good pets, for they are clean and are not noisy.", Status.CLOSED, employee130, customer486, 3, new Date(Long.parseLong("1483430532000")), "help desk");

ticketManager.add(ticket314);

date = 1483458767000l;

DataGenerator.setValueToField(ticket314, "creationDate", new Date(date));

Ticket ticket315 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.WAITING_FOR_FEEDBACK, employee77, customer305, 2, new Date(Long.parseLong("1483167669000")), "checkup");

ticketManager.add(ticket315);

date = 1483214626000l;

DataGenerator.setValueToField(ticket315, "creationDate", new Date(date));

Ticket ticket316 = new OrderTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee121, customer279, 2, "Telefunk", "Haynimfax", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 60);

ticketManager.add(ticket316);

date = 1483376054000l;

DataGenerator.setValueToField(ticket316, "creationDate", new Date(date));

Ticket ticket317 = new RequestTicket("The stranger officiates the meal.", Status.CLOSED, employee205, customer454, 1, new Date(Long.parseLong("1483458906000")), "checkup");

ticketManager.add(ticket317);

date = 1483039051000l;

DataGenerator.setValueToField(ticket317, "creationDate", new Date(date));

Ticket ticket318 = new OrderTicket("The waves were crashing on the shore. it was a lovely sight.", Status.PROCESSED, employee235, customer466, 6, "Micros", "Sao Dansing", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 58);

ticketManager.add(ticket318);

date = 1483059677000l;

DataGenerator.setValueToField(ticket318, "creationDate", new Date(date));

Ticket ticket319 = new MalfunctionTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.CLOSED, employee191, customer424, 10, "repair");

ticketManager.add(ticket319);

date = 1483122383000l;

DataGenerator.setValueToField(ticket319, "creationDate", new Date(date));

Ticket ticket320 = new OrderTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.WAITING_FOR_FEEDBACK, employee240, customer464, 5, "Telefunk", "Movejob", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 39);

ticketManager.add(ticket320);

date = 1483096647000l;

DataGenerator.setValueToField(ticket320, "creationDate", new Date(date));

Ticket ticket321 = new RequestTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.SOLVED, employee146, customer472, 10, new Date(Long.parseLong("1483050090000")), "checkup");

ticketManager.add(ticket321);

date = 1483168627000l;

DataGenerator.setValueToField(ticket321, "creationDate", new Date(date));

Ticket ticket322 = new MalfunctionTicket("The mysterious diary records the voice.", Status.CLOSED, employee130, customer486, 0, "restore");

ticketManager.add(ticket322);

date = 1483196950000l;

DataGenerator.setValueToField(ticket322, "creationDate", new Date(date));

Ticket ticket323 = new OrderTicket("The stranger officiates the meal.", Status.SOLVED, employee67, customer336, 2, "Red Pizza", "Home Ovetone", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 95);

ticketManager.add(ticket323);

date = 1483433589000l;

DataGenerator.setValueToField(ticket323, "creationDate", new Date(date));

Ticket ticket324 = new OrderTicket("I hear that Nancy is very pretty.", Status.RECORDED, employee40, customer413, 5, "Green Plants", "Zumron", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 52);

ticketManager.add(ticket324);

date = 1483466082000l;

DataGenerator.setValueToField(ticket324, "creationDate", new Date(date));

Ticket ticket325 = new RequestTicket("She wrote him a long letter, but he didn't read it.", Status.RECORDED, employee77, customer270, 6, new Date(Long.parseLong("1483279727000")), "help desk");

ticketManager.add(ticket325);

date = 1483021419000l;

DataGenerator.setValueToField(ticket325, "creationDate", new Date(date));

Ticket ticket326 = new OrderTicket("I am counting my calories, yet I really want dessert.", Status.SOLVED, employee218, customer470, 2, "Sunshine Ice", "Tonlab", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 92);

ticketManager.add(ticket326);

date = 1483144871000l;

DataGenerator.setValueToField(ticket326, "creationDate", new Date(date));

Ticket ticket327 = new MalfunctionTicket("I hear that Nancy is very pretty.", Status.WAITING_FOR_FEEDBACK, employee58, customer490, 4, "restore");

ticketManager.add(ticket327);

date = 1483336243000l;

DataGenerator.setValueToField(ticket327, "creationDate", new Date(date));

Ticket ticket328 = new RequestTicket("Where do random thoughts come from?", Status.PROCESSED, employee193, customer263, 8, new Date(Long.parseLong("1483533272000")), "help desk");

ticketManager.add(ticket328);

date = 1483311029000l;

DataGenerator.setValueToField(ticket328, "creationDate", new Date(date));

Ticket ticket329 = new OrderTicket("She folded her handkerchief neatly.", Status.SOLVED, employee40, customer385, 8, "Telefunk", "Techlatfix", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 39);

ticketManager.add(ticket329);

date = 1483303127000l;

DataGenerator.setValueToField(ticket329, "creationDate", new Date(date));

Ticket ticket330 = new OrderTicket("They got there early, and they got really good seats.", Status.SOLVED, employee134, customer447, 1, "Sunshine Ice", "Unohold", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 92);

ticketManager.add(ticket330);

date = 1483435583000l;

DataGenerator.setValueToField(ticket330, "creationDate", new Date(date));

Ticket ticket331 = new OrderTicket("Should we start class now, or should we wait for everyone to get here?", Status.SOLVED, employee198, customer472, 7, "Red Pizza", "Techlatfix", "B6351, Wooler NE71, Vereinigtes Königreich", 74);

ticketManager.add(ticket331);

date = 1483561582000l;

DataGenerator.setValueToField(ticket331, "creationDate", new Date(date));

Ticket ticket332 = new OrderTicket("We need to rent a room for our party.", Status.PROCESSED, employee135, customer389, 2, "Fresher", "Vilasonit", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 83);

ticketManager.add(ticket332);

date = 1483310562000l;

DataGenerator.setValueToField(ticket332, "creationDate", new Date(date));

Ticket ticket333 = new OrderTicket("This is a Japanese doll.", Status.SOLVED, employee92, customer311, 10, "Blue Water", "Haynimfax", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 46);

ticketManager.add(ticket333);

date = 1483104524000l;

DataGenerator.setValueToField(ticket333, "creationDate", new Date(date));

Ticket ticket334 = new MalfunctionTicket("Wow, does that work?", Status.CLOSED, employee133, customer453, 3, "remove");

ticketManager.add(ticket334);

date = 1483223171000l;

DataGenerator.setValueToField(ticket334, "creationDate", new Date(date));

Ticket ticket335 = new MalfunctionTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.RECORDED, employee129, customer460, 2, "remove");

ticketManager.add(ticket335);

date = 1483267887000l;

DataGenerator.setValueToField(ticket335, "creationDate", new Date(date));

Ticket ticket336 = new RequestTicket("Please wait outside of the house.", Status.SOLVED, employee198, customer250, 7, new Date(Long.parseLong("1483017057000")), "training");

ticketManager.add(ticket336);

date = 1483511111000l;

DataGenerator.setValueToField(ticket336, "creationDate", new Date(date));

Ticket ticket337 = new OrderTicket("A song can make or ruin a person’s day if they let it get to them.", Status.SOLVED, employee158, customer285, 10, "Plog", "Trippletone", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 54);

ticketManager.add(ticket337);

date = 1483592758000l;

DataGenerator.setValueToField(ticket337, "creationDate", new Date(date));

Ticket ticket338 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.PROCESSED, employee201, customer273, 9, new Date(Long.parseLong("1483041377000")), "help desk");

ticketManager.add(ticket338);

date = 1483270988000l;

DataGenerator.setValueToField(ticket338, "creationDate", new Date(date));

Ticket ticket339 = new MalfunctionTicket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee153, customer417, 7, "setup");

ticketManager.add(ticket339);

date = 1483222458000l;

DataGenerator.setValueToField(ticket339, "creationDate", new Date(date));

Ticket ticket340 = new OrderTicket("The stranger officiates the meal.", Status.WAITING_FOR_FEEDBACK, employee189, customer490, 8, "Micros", "Sun-Tom", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 70);

ticketManager.add(ticket340);

date = 1483085466000l;

DataGenerator.setValueToField(ticket340, "creationDate", new Date(date));

Ticket ticket341 = new OrderTicket("They got there early, and they got really good seats.", Status.RECORDED, employee54, customer319, 10, "Red Pizza", "Quad Zozlax", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 61);

ticketManager.add(ticket341);

date = 1483050658000l;

DataGenerator.setValueToField(ticket341, "creationDate", new Date(date));

Ticket ticket342 = new RequestTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.PROCESSED, employee114, customer267, 2, new Date(Long.parseLong("1483530792000")), "training");

ticketManager.add(ticket342);

date = 1483422133000l;

DataGenerator.setValueToField(ticket342, "creationDate", new Date(date));

Ticket ticket343 = new MalfunctionTicket("He ran out of money, so he had to stop playing poker.", Status.RECORDED, employee226, customer358, 7, "repair");

ticketManager.add(ticket343);

date = 1483546784000l;

DataGenerator.setValueToField(ticket343, "creationDate", new Date(date));

Ticket ticket344 = new RequestTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.RECORDED, employee78, customer495, 4, new Date(Long.parseLong("1483248691000")), "checkup");

ticketManager.add(ticket344);

date = 1483453503000l;

DataGenerator.setValueToField(ticket344, "creationDate", new Date(date));

Ticket ticket345 = new OrderTicket("The memory we used to share is no longer coherent.", Status.CLOSED, employee77, customer355, 7, "Green Plants", "Icetam", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 40);

ticketManager.add(ticket345);

date = 1483411263000l;

DataGenerator.setValueToField(ticket345, "creationDate", new Date(date));

Ticket ticket346 = new RequestTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.WAITING_FOR_FEEDBACK, employee65, customer278, 2, new Date(Long.parseLong("1483499206000")), "help desk");

ticketManager.add(ticket346);

date = 1483134999000l;

DataGenerator.setValueToField(ticket346, "creationDate", new Date(date));

Ticket ticket347 = new MalfunctionTicket("Please wait outside of the house.", Status.RECORDED, employee117, customer422, 3, "remove");

ticketManager.add(ticket347);

date = 1483215771000l;

DataGenerator.setValueToField(ticket347, "creationDate", new Date(date));

Ticket ticket348 = new OrderTicket("She only paints with bold colors. she does not like pastels.", Status.PROCESSED, employee96, customer436, 6, "Telefunk", "Sao Dansing", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 55);

ticketManager.add(ticket348);

date = 1483602483000l;

DataGenerator.setValueToField(ticket348, "creationDate", new Date(date));

Ticket ticket349 = new MalfunctionTicket("Rock music approaches at high velocity.", Status.SOLVED, employee79, customer280, 5, "repair");

ticketManager.add(ticket349);

date = 1483022207000l;

DataGenerator.setValueToField(ticket349, "creationDate", new Date(date));

Ticket ticket350 = new MalfunctionTicket("She only paints with bold colors. she does not like pastels.", Status.WAITING_FOR_FEEDBACK, employee36, customer432, 4, "remove");

ticketManager.add(ticket350);

date = 1483604031000l;

DataGenerator.setValueToField(ticket350, "creationDate", new Date(date));

Ticket ticket351 = new RequestTicket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.SOLVED, employee13, customer473, 4, new Date(Long.parseLong("1483027887000")), "help desk");

ticketManager.add(ticket351);

date = 1483548386000l;

DataGenerator.setValueToField(ticket351, "creationDate", new Date(date));

Ticket ticket352 = new OrderTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.SOLVED, employee214, customer445, 1, "Telefunk", "Lot Dax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 36);

ticketManager.add(ticket352);

date = 1483543408000l;

DataGenerator.setValueToField(ticket352, "creationDate", new Date(date));

Ticket ticket353 = new MalfunctionTicket("A song can make or ruin a person’s day if they let it get to them.", Status.CLOSED, employee128, customer497, 7, "repair");

ticketManager.add(ticket353);

date = 1483209430000l;

DataGenerator.setValueToField(ticket353, "creationDate", new Date(date));

Ticket ticket354 = new MalfunctionTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.RECORDED, employee215, customer280, 5, "restore");

ticketManager.add(ticket354);

date = 1483537758000l;

DataGenerator.setValueToField(ticket354, "creationDate", new Date(date));

Ticket ticket355 = new OrderTicket("I am counting my calories, yet I really want dessert.", Status.PROCESSED, employee143, customer377, 8, "Quil", "Greenstring", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 54);

ticketManager.add(ticket355);

date = 1483233515000l;

DataGenerator.setValueToField(ticket355, "creationDate", new Date(date));

Ticket ticket356 = new RequestTicket("Rock music approaches at high velocity.", Status.RECORDED, employee226, customer360, 9, new Date(Long.parseLong("1483583184000")), "training");

ticketManager.add(ticket356);

date = 1483555490000l;

DataGenerator.setValueToField(ticket356, "creationDate", new Date(date));

Ticket ticket357 = new OrderTicket("Tom got a small piece of pie.", Status.WAITING_FOR_FEEDBACK, employee124, customer336, 0, "Blue Water", "Icetam", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 58);

ticketManager.add(ticket357);

date = 1483476976000l;

DataGenerator.setValueToField(ticket357, "creationDate", new Date(date));

Ticket ticket358 = new MalfunctionTicket("Don't step on the broken glass.", Status.RECORDED, employee167, customer392, 7, "setup");

ticketManager.add(ticket358);

date = 1483027187000l;

DataGenerator.setValueToField(ticket358, "creationDate", new Date(date));

Ticket ticket359 = new RequestTicket("The lake is a long way from here.", Status.PROCESSED, employee132, customer358, 10, new Date(Long.parseLong("1483287140000")), "consulting");

ticketManager.add(ticket359);

date = 1483497838000l;

DataGenerator.setValueToField(ticket359, "creationDate", new Date(date));

Ticket ticket360 = new MalfunctionTicket("I am counting my calories, yet I really want dessert.", Status.WAITING_FOR_FEEDBACK, employee115, customer416, 2, "repair");

ticketManager.add(ticket360);

date = 1483198021000l;

DataGenerator.setValueToField(ticket360, "creationDate", new Date(date));

Ticket ticket361 = new MalfunctionTicket("I'd rather be a bird than a fish.", Status.RECORDED, employee93, customer391, 10, "repair");

ticketManager.add(ticket361);

date = 1483047038000l;

DataGenerator.setValueToField(ticket361, "creationDate", new Date(date));

Ticket ticket362 = new OrderTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.RECORDED, employee40, customer273, 4, "Plog", "Zamcanplus", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 54);

ticketManager.add(ticket362);

date = 1483098215000l;

DataGenerator.setValueToField(ticket362, "creationDate", new Date(date));

Ticket ticket363 = new RequestTicket("The mysterious diary records the voice.", Status.CLOSED, employee194, customer467, 4, new Date(Long.parseLong("1483164567000")), "checkup");

ticketManager.add(ticket363);

date = 1483555207000l;

DataGenerator.setValueToField(ticket363, "creationDate", new Date(date));

Ticket ticket364 = new MalfunctionTicket("I love eating toasted cheese and tuna sandwiches.", Status.WAITING_FOR_FEEDBACK, employee161, customer450, 8, "repair");

ticketManager.add(ticket364);

date = 1483522800000l;

DataGenerator.setValueToField(ticket364, "creationDate", new Date(date));

Ticket ticket365 = new MalfunctionTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee152, customer451, 2, "restore");

ticketManager.add(ticket365);

date = 1483419395000l;

DataGenerator.setValueToField(ticket365, "creationDate", new Date(date));

Ticket ticket366 = new OrderTicket("It was getting dark, and we weren’t there yet.", Status.PROCESSED, employee241, customer422, 7, "Plog", "Home Ovetone", "B6351, Wooler NE71, Vereinigtes Königreich", 54);

ticketManager.add(ticket366);

date = 1483510300000l;

DataGenerator.setValueToField(ticket366, "creationDate", new Date(date));

Ticket ticket367 = new OrderTicket("Rock music approaches at high velocity.", Status.RECORDED, employee182, customer268, 9, "Sunshine Ice", "Haynimfax", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 82);

ticketManager.add(ticket367);

date = 1483097271000l;

DataGenerator.setValueToField(ticket367, "creationDate", new Date(date));

Ticket ticket368 = new MalfunctionTicket("The waves were crashing on the shore. it was a lovely sight.", Status.PROCESSED, employee82, customer251, 4, "backup");

ticketManager.add(ticket368);

date = 1483206074000l;

DataGenerator.setValueToField(ticket368, "creationDate", new Date(date));

Ticket ticket369 = new OrderTicket("It was getting dark, and we weren’t there yet.", Status.PROCESSED, employee34, customer361, 1, "Green Plants", "Quofan", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 96);

ticketManager.add(ticket369);

date = 1483173176000l;

DataGenerator.setValueToField(ticket369, "creationDate", new Date(date));

Ticket ticket370 = new RequestTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee120, customer421, 10, new Date(Long.parseLong("1483192348000")), "help desk");

ticketManager.add(ticket370);

date = 1483426895000l;

DataGenerator.setValueToField(ticket370, "creationDate", new Date(date));

Ticket ticket371 = new OrderTicket("She did not cheat on the test, for it was not the right thing to do.", Status.SOLVED, employee105, customer371, 2, "Sunshine Ice", "Tonlab", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 79);

ticketManager.add(ticket371);

date = 1483232846000l;

DataGenerator.setValueToField(ticket371, "creationDate", new Date(date));

Ticket ticket372 = new MalfunctionTicket("The waves were crashing on the shore. it was a lovely sight.", Status.WAITING_FOR_FEEDBACK, employee13, customer491, 3, "remove");

ticketManager.add(ticket372);

date = 1483061523000l;

DataGenerator.setValueToField(ticket372, "creationDate", new Date(date));

Ticket ticket373 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.RECORDED, employee153, customer479, 7, "Blue Water", "Stockwarm", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 76);

ticketManager.add(ticket373);

date = 1483619661000l;

DataGenerator.setValueToField(ticket373, "creationDate", new Date(date));

Ticket ticket374 = new RequestTicket("This is a Japanese doll.", Status.PROCESSED, employee102, customer462, 6, new Date(Long.parseLong("1483409859000")), "help desk");

ticketManager.add(ticket374);

date = 1483104453000l;

DataGenerator.setValueToField(ticket374, "creationDate", new Date(date));

Ticket ticket375 = new OrderTicket("Lets all be unique together until we realise we are all the same.", Status.CLOSED, employee246, customer417, 5, "Telefunk", "Trippletone", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 34);

ticketManager.add(ticket375);

date = 1483365334000l;

DataGenerator.setValueToField(ticket375, "creationDate", new Date(date));

Ticket ticket376 = new MalfunctionTicket("If I don’t like something, I’ll stay away from it.", Status.WAITING_FOR_FEEDBACK, employee79, customer441, 6, "repair");

ticketManager.add(ticket376);

date = 1483041788000l;

DataGenerator.setValueToField(ticket376, "creationDate", new Date(date));

Ticket ticket377 = new OrderTicket("She advised him to come back at once.", Status.RECORDED, employee237, customer264, 9, "Quil", "Home Ovetone", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 33);

ticketManager.add(ticket377);

date = 1483032684000l;

DataGenerator.setValueToField(ticket377, "creationDate", new Date(date));

Ticket ticket378 = new RequestTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.WAITING_FOR_FEEDBACK, employee204, customer297, 9, new Date(Long.parseLong("1483173376000")), "consulting");

ticketManager.add(ticket378);

date = 1483379697000l;

DataGenerator.setValueToField(ticket378, "creationDate", new Date(date));

Ticket ticket379 = new RequestTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.WAITING_FOR_FEEDBACK, employee185, customer387, 3, new Date(Long.parseLong("1483054388000")), "consulting");

ticketManager.add(ticket379);

date = 1483576003000l;

DataGenerator.setValueToField(ticket379, "creationDate", new Date(date));

Ticket ticket380 = new OrderTicket("I checked to make sure that he was still alive.", Status.RECORDED, employee22, customer378, 5, "Plog", "Movejob", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 42);

ticketManager.add(ticket380);

date = 1483438371000l;

DataGenerator.setValueToField(ticket380, "creationDate", new Date(date));

Ticket ticket381 = new MalfunctionTicket("Cats are good pets, for they are clean and are not noisy.", Status.CLOSED, employee104, customer452, 0, "restore");

ticketManager.add(ticket381);

date = 1483554808000l;

DataGenerator.setValueToField(ticket381, "creationDate", new Date(date));

Ticket ticket382 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.CLOSED, employee195, customer488, 1, "Fresher", "Techlatfix", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 100);

ticketManager.add(ticket382);

date = 1483569441000l;

DataGenerator.setValueToField(ticket382, "creationDate", new Date(date));

Ticket ticket383 = new RequestTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.WAITING_FOR_FEEDBACK, employee175, customer420, 4, new Date(Long.parseLong("1483195326000")), "consulting");

ticketManager.add(ticket383);

date = 1483029660000l;

DataGenerator.setValueToField(ticket383, "creationDate", new Date(date));

Ticket ticket384 = new RequestTicket("I am counting my calories, yet I really want dessert.", Status.SOLVED, employee105, customer449, 5, new Date(Long.parseLong("1483360865000")), "help desk");

ticketManager.add(ticket384);

date = 1483466285000l;

DataGenerator.setValueToField(ticket384, "creationDate", new Date(date));

Ticket ticket385 = new RequestTicket("I think I will buy the red car, or I will lease the blue one.", Status.WAITING_FOR_FEEDBACK, employee231, customer451, 9, new Date(Long.parseLong("1483579891000")), "checkup");

ticketManager.add(ticket385);

date = 1483371095000l;

DataGenerator.setValueToField(ticket385, "creationDate", new Date(date));

Ticket ticket386 = new MalfunctionTicket("I am never at home on Sundays.", Status.WAITING_FOR_FEEDBACK, employee144, customer393, 6, "restore");

ticketManager.add(ticket386);

date = 1483257961000l;

DataGenerator.setValueToField(ticket386, "creationDate", new Date(date));

Ticket ticket387 = new RequestTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.RECORDED, employee122, customer402, 6, new Date(Long.parseLong("1483514307000")), "help desk");

ticketManager.add(ticket387);

date = 1483332486000l;

DataGenerator.setValueToField(ticket387, "creationDate", new Date(date));

Ticket ticket388 = new OrderTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee208, customer420, 0, "Green Plants", "Zamcanplus", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 70);

ticketManager.add(ticket388);

date = 1483437672000l;

DataGenerator.setValueToField(ticket388, "creationDate", new Date(date));

Ticket ticket389 = new OrderTicket("I am never at home on Sundays.", Status.PROCESSED, employee34, customer408, 4, "Fresher", "Quofan", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 81);

ticketManager.add(ticket389);

date = 1483177132000l;

DataGenerator.setValueToField(ticket389, "creationDate", new Date(date));

Ticket ticket390 = new RequestTicket("She wrote him a long letter, but he didn't read it.", Status.CLOSED, employee64, customer255, 10, new Date(Long.parseLong("1483245327000")), "consulting");

ticketManager.add(ticket390);

date = 1483048984000l;

DataGenerator.setValueToField(ticket390, "creationDate", new Date(date));

Ticket ticket391 = new OrderTicket("The sky is clear. the stars are twinkling.", Status.WAITING_FOR_FEEDBACK, employee227, customer418, 7, "Rent", "Icetam", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 91);

ticketManager.add(ticket391);

date = 1483186728000l;

DataGenerator.setValueToField(ticket391, "creationDate", new Date(date));

Ticket ticket392 = new MalfunctionTicket("A song can make or ruin a person’s day if they let it get to them.", Status.WAITING_FOR_FEEDBACK, employee183, customer482, 8, "restore");

ticketManager.add(ticket392);

date = 1483024387000l;

DataGenerator.setValueToField(ticket392, "creationDate", new Date(date));

Ticket ticket393 = new MalfunctionTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee71, customer402, 9, "restore");

ticketManager.add(ticket393);

date = 1483556618000l;

DataGenerator.setValueToField(ticket393, "creationDate", new Date(date));

Ticket ticket394 = new MalfunctionTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.RECORDED, employee90, customer295, 4, "remove");

ticketManager.add(ticket394);

date = 1483198874000l;

DataGenerator.setValueToField(ticket394, "creationDate", new Date(date));

Ticket ticket395 = new RequestTicket("He told us a very exciting adventure story.", Status.RECORDED, employee233, customer274, 8, new Date(Long.parseLong("1483155183000")), "help desk");

ticketManager.add(ticket395);

date = 1483136036000l;

DataGenerator.setValueToField(ticket395, "creationDate", new Date(date));

Ticket ticket396 = new MalfunctionTicket("They got there early, and they got really good seats.", Status.CLOSED, employee38, customer477, 10, "restore");

ticketManager.add(ticket396);

date = 1483464753000l;

DataGenerator.setValueToField(ticket396, "creationDate", new Date(date));

Ticket ticket397 = new RequestTicket("The shooter says goodbye to his love.", Status.RECORDED, employee180, customer353, 4, new Date(Long.parseLong("1483372816000")), "help desk");

ticketManager.add(ticket397);

date = 1483146245000l;

DataGenerator.setValueToField(ticket397, "creationDate", new Date(date));

Ticket ticket398 = new MalfunctionTicket("I checked to make sure that he was still alive.", Status.CLOSED, employee113, customer348, 7, "remove");

ticketManager.add(ticket398);

date = 1483169822000l;

DataGenerator.setValueToField(ticket398, "creationDate", new Date(date));

Ticket ticket399 = new RequestTicket("Cats are good pets, for they are clean and are not noisy.", Status.SOLVED, employee45, customer299, 9, new Date(Long.parseLong("1483143301000")), "help desk");

ticketManager.add(ticket399);

date = 1483392919000l;

DataGenerator.setValueToField(ticket399, "creationDate", new Date(date));

Ticket ticket400 = new OrderTicket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee48, customer413, 1, "Sunshine Ice", "Greenstring", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 61);

ticketManager.add(ticket400);

date = 1483368832000l;

DataGenerator.setValueToField(ticket400, "creationDate", new Date(date));

Ticket ticket401 = new OrderTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.SOLVED, employee41, customer405, 2, "Sunshine Ice", "Daltron", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 88);

ticketManager.add(ticket401);

date = 1483546983000l;

DataGenerator.setValueToField(ticket401, "creationDate", new Date(date));

Ticket ticket402 = new OrderTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.SOLVED, employee209, customer358, 1, "Plog", "Unolab", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 37);

ticketManager.add(ticket402);

date = 1483293202000l;

DataGenerator.setValueToField(ticket402, "creationDate", new Date(date));

Ticket ticket403 = new OrderTicket("We have a lot of rain in June.", Status.SOLVED, employee145, customer491, 5, "Quil", "Gravequadtam", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 66);

ticketManager.add(ticket403);

date = 1483036403000l;

DataGenerator.setValueToField(ticket403, "creationDate", new Date(date));

Ticket ticket404 = new OrderTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.SOLVED, employee115, customer396, 5, "Rent", "Techlatfix", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 36);

ticketManager.add(ticket404);

date = 1483459919000l;

DataGenerator.setValueToField(ticket404, "creationDate", new Date(date));

Ticket ticket405 = new MalfunctionTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.PROCESSED, employee213, customer261, 9, "repair");

ticketManager.add(ticket405);

date = 1483055889000l;

DataGenerator.setValueToField(ticket405, "creationDate", new Date(date));

Ticket ticket406 = new RequestTicket("She folded her handkerchief neatly.", Status.WAITING_FOR_FEEDBACK, employee155, customer488, 6, new Date(Long.parseLong("1483614496000")), "training");

ticketManager.add(ticket406);

date = 1483029437000l;

DataGenerator.setValueToField(ticket406, "creationDate", new Date(date));

Ticket ticket407 = new RequestTicket("I really want to go to work, but I am too sick to drive.", Status.CLOSED, employee214, customer267, 9, new Date(Long.parseLong("1483022530000")), "training");

ticketManager.add(ticket407);

date = 1483303062000l;

DataGenerator.setValueToField(ticket407, "creationDate", new Date(date));

Ticket ticket408 = new RequestTicket("The memory we used to share is no longer coherent.", Status.CLOSED, employee241, customer329, 8, new Date(Long.parseLong("1483030663000")), "consulting");

ticketManager.add(ticket408);

date = 1483232812000l;

DataGenerator.setValueToField(ticket408, "creationDate", new Date(date));

Ticket ticket409 = new RequestTicket("If I don’t like something, I’ll stay away from it.", Status.PROCESSED, employee154, customer345, 5, new Date(Long.parseLong("1483306520000")), "training");

ticketManager.add(ticket409);

date = 1483043570000l;

DataGenerator.setValueToField(ticket409, "creationDate", new Date(date));

Ticket ticket410 = new RequestTicket("Two seats were vacant.", Status.PROCESSED, employee237, customer361, 5, new Date(Long.parseLong("1483478762000")), "help desk");

ticketManager.add(ticket410);

date = 1483103090000l;

DataGenerator.setValueToField(ticket410, "creationDate", new Date(date));

Ticket ticket411 = new OrderTicket("He said he was not there yesterday. however, many people saw him there.", Status.CLOSED, employee189, customer455, 2, "Fresher", "Sao Dansing", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 98);

ticketManager.add(ticket411);

date = 1483230909000l;

DataGenerator.setValueToField(ticket411, "creationDate", new Date(date));

Ticket ticket412 = new MalfunctionTicket("I want more detailed information.", Status.RECORDED, employee184, customer304, 6, "repair");

ticketManager.add(ticket412);

date = 1483609035000l;

DataGenerator.setValueToField(ticket412, "creationDate", new Date(date));

Ticket ticket413 = new OrderTicket("Tom got a small piece of pie.", Status.SOLVED, employee23, customer263, 10, "Fresher", "Lot Dax", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 52);

ticketManager.add(ticket413);

date = 1483331673000l;

DataGenerator.setValueToField(ticket413, "creationDate", new Date(date));

Ticket ticket414 = new MalfunctionTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.CLOSED, employee97, customer484, 8, "restore");

ticketManager.add(ticket414);

date = 1483453267000l;

DataGenerator.setValueToField(ticket414, "creationDate", new Date(date));

Ticket ticket415 = new MalfunctionTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.SOLVED, employee150, customer276, 10, "remove");

ticketManager.add(ticket415);

date = 1483293365000l;

DataGenerator.setValueToField(ticket415, "creationDate", new Date(date));

Ticket ticket416 = new MalfunctionTicket("The stranger officiates the meal.", Status.SOLVED, employee138, customer387, 1, "remove");

ticketManager.add(ticket416);

date = 1483056049000l;

DataGenerator.setValueToField(ticket416, "creationDate", new Date(date));

Ticket ticket417 = new RequestTicket("The mysterious diary records the voice.", Status.RECORDED, employee40, customer480, 3, new Date(Long.parseLong("1483313119000")), "help desk");

ticketManager.add(ticket417);

date = 1483223373000l;

DataGenerator.setValueToField(ticket417, "creationDate", new Date(date));

Ticket ticket418 = new MalfunctionTicket("It was getting dark, and we weren’t there yet.", Status.CLOSED, employee140, customer441, 5, "backup");

ticketManager.add(ticket418);

date = 1483076904000l;

DataGenerator.setValueToField(ticket418, "creationDate", new Date(date));

Ticket ticket419 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.PROCESSED, employee130, customer316, 8, new Date(Long.parseLong("1483385144000")), "training");

ticketManager.add(ticket419);

date = 1483421350000l;

DataGenerator.setValueToField(ticket419, "creationDate", new Date(date));

Ticket ticket420 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee90, customer251, 0, "Quil", "Haynimfax", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 45);

ticketManager.add(ticket420);

date = 1483617489000l;

DataGenerator.setValueToField(ticket420, "creationDate", new Date(date));

Ticket ticket421 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.WAITING_FOR_FEEDBACK, employee76, customer376, 3, new Date(Long.parseLong("1483427873000")), "training");

ticketManager.add(ticket421);

date = 1483548070000l;

DataGenerator.setValueToField(ticket421, "creationDate", new Date(date));

Ticket ticket422 = new OrderTicket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee43, customer254, 9, "Green Plants", "Tampfan", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 69);

ticketManager.add(ticket422);

date = 1483371824000l;

DataGenerator.setValueToField(ticket422, "creationDate", new Date(date));

Ticket ticket423 = new RequestTicket("I am never at home on Sundays.", Status.SOLVED, employee159, customer318, 6, new Date(Long.parseLong("1483506484000")), "training");

ticketManager.add(ticket423);

date = 1483018497000l;

DataGenerator.setValueToField(ticket423, "creationDate", new Date(date));

Ticket ticket424 = new OrderTicket("It was getting dark, and we weren’t there yet.", Status.PROCESSED, employee31, customer397, 8, "Fresher", "Quad Zozlax", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 58);

ticketManager.add(ticket424);

date = 1483061429000l;

DataGenerator.setValueToField(ticket424, "creationDate", new Date(date));

Ticket ticket425 = new RequestTicket("The quick brown fox jumps over the lazy dog.", Status.RECORDED, employee48, customer286, 3, new Date(Long.parseLong("1483252596000")), "help desk");

ticketManager.add(ticket425);

date = 1483141965000l;

DataGenerator.setValueToField(ticket425, "creationDate", new Date(date));

Ticket ticket426 = new RequestTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.WAITING_FOR_FEEDBACK, employee188, customer300, 4, new Date(Long.parseLong("1483416299000")), "help desk");

ticketManager.add(ticket426);

date = 1483383430000l;

DataGenerator.setValueToField(ticket426, "creationDate", new Date(date));

Ticket ticket427 = new MalfunctionTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.RECORDED, employee193, customer356, 3, "backup");

ticketManager.add(ticket427);

date = 1483166203000l;

DataGenerator.setValueToField(ticket427, "creationDate", new Date(date));

Ticket ticket428 = new RequestTicket("Wow, does that work?", Status.RECORDED, employee80, customer275, 1, new Date(Long.parseLong("1483022661000")), "training");

ticketManager.add(ticket428);

date = 1483392582000l;

DataGenerator.setValueToField(ticket428, "creationDate", new Date(date));

Ticket ticket429 = new MalfunctionTicket("Rock music approaches at high velocity.", Status.WAITING_FOR_FEEDBACK, employee46, customer421, 6, "remove");

ticketManager.add(ticket429);

date = 1483044654000l;

DataGenerator.setValueToField(ticket429, "creationDate", new Date(date));

Ticket ticket430 = new MalfunctionTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.PROCESSED, employee1, customer461, 9, "restore");

ticketManager.add(ticket430);

date = 1483250273000l;

DataGenerator.setValueToField(ticket430, "creationDate", new Date(date));

Ticket ticket431 = new MalfunctionTicket("We need to rent a room for our party.", Status.CLOSED, employee146, customer339, 9, "repair");

ticketManager.add(ticket431);

date = 1483089148000l;

DataGenerator.setValueToField(ticket431, "creationDate", new Date(date));

Ticket ticket432 = new MalfunctionTicket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.PROCESSED, employee156, customer447, 6, "backup");

ticketManager.add(ticket432);

date = 1483131710000l;

DataGenerator.setValueToField(ticket432, "creationDate", new Date(date));

Ticket ticket433 = new RequestTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.WAITING_FOR_FEEDBACK, employee39, customer349, 4, new Date(Long.parseLong("1483336405000")), "consulting");

ticketManager.add(ticket433);

date = 1483500461000l;

DataGenerator.setValueToField(ticket433, "creationDate", new Date(date));

Ticket ticket434 = new OrderTicket("Where do random thoughts come from?", Status.SOLVED, employee38, customer462, 10, "Fresher", "Gravequadtam", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 76);

ticketManager.add(ticket434);

date = 1483383544000l;

DataGenerator.setValueToField(ticket434, "creationDate", new Date(date));

Ticket ticket435 = new RequestTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.SOLVED, employee177, customer265, 3, new Date(Long.parseLong("1483430780000")), "training");

ticketManager.add(ticket435);

date = 1483277780000l;

DataGenerator.setValueToField(ticket435, "creationDate", new Date(date));

Ticket ticket436 = new MalfunctionTicket("I checked to make sure that he was still alive.", Status.WAITING_FOR_FEEDBACK, employee134, customer364, 8, "remove");

ticketManager.add(ticket436);

date = 1483439199000l;

DataGenerator.setValueToField(ticket436, "creationDate", new Date(date));

Ticket ticket437 = new RequestTicket("She wrote him a long letter, but he didn't read it.", Status.CLOSED, employee237, customer408, 10, new Date(Long.parseLong("1483545222000")), "help desk");

ticketManager.add(ticket437);

date = 1483072535000l;

DataGenerator.setValueToField(ticket437, "creationDate", new Date(date));

Ticket ticket438 = new OrderTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.WAITING_FOR_FEEDBACK, employee102, customer464, 4, "Plog", "Movejob", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 42);

ticketManager.add(ticket438);

date = 1483092723000l;

DataGenerator.setValueToField(ticket438, "creationDate", new Date(date));

Ticket ticket439 = new OrderTicket("The shooter says goodbye to his love.", Status.PROCESSED, employee233, customer330, 5, "Blue Water", "Zamcanplus", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 32);

ticketManager.add(ticket439);

date = 1483309060000l;

DataGenerator.setValueToField(ticket439, "creationDate", new Date(date));

Ticket ticket440 = new MalfunctionTicket("It was getting dark, and we weren’t there yet.", Status.SOLVED, employee77, customer313, 2, "remove");

ticketManager.add(ticket440);

date = 1483273131000l;

DataGenerator.setValueToField(ticket440, "creationDate", new Date(date));

Ticket ticket441 = new MalfunctionTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.RECORDED, employee108, customer397, 4, "restore");

ticketManager.add(ticket441);

date = 1483100756000l;

DataGenerator.setValueToField(ticket441, "creationDate", new Date(date));

Ticket ticket442 = new MalfunctionTicket("Is it free?", Status.CLOSED, employee126, customer363, 2, "setup");

ticketManager.add(ticket442);

date = 1483302794000l;

DataGenerator.setValueToField(ticket442, "creationDate", new Date(date));

Ticket ticket443 = new OrderTicket("A glittering gem is not enough.", Status.RECORDED, employee26, customer273, 8, "Plog", "Tonlab", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 49);

ticketManager.add(ticket443);

date = 1483319995000l;

DataGenerator.setValueToField(ticket443, "creationDate", new Date(date));

Ticket ticket444 = new OrderTicket("She folded her handkerchief neatly.", Status.RECORDED, employee17, customer428, 6, "Sunshine Ice", "Icetam", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 67);

ticketManager.add(ticket444);

date = 1483566200000l;

DataGenerator.setValueToField(ticket444, "creationDate", new Date(date));

Ticket ticket445 = new RequestTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.CLOSED, employee245, customer278, 0, new Date(Long.parseLong("1483306807000")), "help desk");

ticketManager.add(ticket445);

date = 1483386796000l;

DataGenerator.setValueToField(ticket445, "creationDate", new Date(date));

Ticket ticket446 = new RequestTicket("She folded her handkerchief neatly.", Status.SOLVED, employee148, customer254, 5, new Date(Long.parseLong("1483333604000")), "consulting");

ticketManager.add(ticket446);

date = 1483300605000l;

DataGenerator.setValueToField(ticket446, "creationDate", new Date(date));

Ticket ticket447 = new OrderTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.WAITING_FOR_FEEDBACK, employee157, customer456, 2, "Micros", "Stockwarm", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 94);

ticketManager.add(ticket447);

date = 1483472531000l;

DataGenerator.setValueToField(ticket447, "creationDate", new Date(date));

Ticket ticket448 = new RequestTicket("I'd rather be a bird than a fish.", Status.RECORDED, employee112, customer350, 4, new Date(Long.parseLong("1483175625000")), "training");

ticketManager.add(ticket448);

date = 1483513012000l;

DataGenerator.setValueToField(ticket448, "creationDate", new Date(date));

Ticket ticket449 = new RequestTicket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee242, customer341, 8, new Date(Long.parseLong("1483495737000")), "help desk");

ticketManager.add(ticket449);

date = 1483506040000l;

DataGenerator.setValueToField(ticket449, "creationDate", new Date(date));

Ticket ticket450 = new MalfunctionTicket("She was too short to see over the fence.", Status.RECORDED, employee190, customer281, 7, "backup");

ticketManager.add(ticket450);

date = 1483051075000l;

DataGenerator.setValueToField(ticket450, "creationDate", new Date(date));

Ticket ticket451 = new MalfunctionTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.WAITING_FOR_FEEDBACK, employee82, customer333, 0, "restore");

ticketManager.add(ticket451);

date = 1483325409000l;

DataGenerator.setValueToField(ticket451, "creationDate", new Date(date));

Ticket ticket452 = new MalfunctionTicket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee135, customer299, 2, "remove");

ticketManager.add(ticket452);

date = 1483019481000l;

DataGenerator.setValueToField(ticket452, "creationDate", new Date(date));

Ticket ticket453 = new OrderTicket("The river stole the gods.", Status.WAITING_FOR_FEEDBACK, employee146, customer384, 5, "Green Plants", "Unohold", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 94);

ticketManager.add(ticket453);

date = 1483335968000l;

DataGenerator.setValueToField(ticket453, "creationDate", new Date(date));

Ticket ticket454 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.RECORDED, employee82, customer377, 0, "Blue Water", "Touchfresh", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 93);

ticketManager.add(ticket454);

date = 1483048761000l;

DataGenerator.setValueToField(ticket454, "creationDate", new Date(date));

Ticket ticket455 = new OrderTicket("Don't step on the broken glass.", Status.PROCESSED, employee224, customer382, 9, "Red Pizza", "Gravequadtam", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 82);

ticketManager.add(ticket455);

date = 1483537228000l;

DataGenerator.setValueToField(ticket455, "creationDate", new Date(date));

Ticket ticket456 = new MalfunctionTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.WAITING_FOR_FEEDBACK, employee103, customer397, 4, "restore");

ticketManager.add(ticket456);

date = 1483459002000l;

DataGenerator.setValueToField(ticket456, "creationDate", new Date(date));

Ticket ticket457 = new RequestTicket("She did her best to help him.", Status.PROCESSED, employee225, customer482, 9, new Date(Long.parseLong("1483101166000")), "training");

ticketManager.add(ticket457);

date = 1483278669000l;

DataGenerator.setValueToField(ticket457, "creationDate", new Date(date));

Ticket ticket458 = new OrderTicket("Please wait outside of the house.", Status.CLOSED, employee214, customer266, 2, "Micros", "Istrax", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 46);

ticketManager.add(ticket458);

date = 1483291989000l;

DataGenerator.setValueToField(ticket458, "creationDate", new Date(date));

Ticket ticket459 = new OrderTicket("Yeah, I think it's a good environment for learning English.", Status.SOLVED, employee185, customer464, 5, "Telefunk", "Airfix", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 97);

ticketManager.add(ticket459);

date = 1483082275000l;

DataGenerator.setValueToField(ticket459, "creationDate", new Date(date));

Ticket ticket460 = new MalfunctionTicket("Tom got a small piece of pie.", Status.CLOSED, employee149, customer330, 10, "repair");

ticketManager.add(ticket460);

date = 1483353331000l;

DataGenerator.setValueToField(ticket460, "creationDate", new Date(date));

Ticket ticket461 = new OrderTicket("A song can make or ruin a person’s day if they let it get to them.", Status.RECORDED, employee38, customer283, 9, "Plog", "Lot Dax", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 66);

ticketManager.add(ticket461);

date = 1483411982000l;

DataGenerator.setValueToField(ticket461, "creationDate", new Date(date));

Ticket ticket462 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.RECORDED, employee247, customer481, 10, "Fresher", "Tampfan", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 43);

ticketManager.add(ticket462);

date = 1483095317000l;

DataGenerator.setValueToField(ticket462, "creationDate", new Date(date));

Ticket ticket463 = new OrderTicket("A song can make or ruin a person’s day if they let it get to them.", Status.CLOSED, employee162, customer363, 10, "Red Pizza", "Airfix", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 85);

ticketManager.add(ticket463);

date = 1483102786000l;

DataGenerator.setValueToField(ticket463, "creationDate", new Date(date));

Ticket ticket464 = new RequestTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.PROCESSED, employee172, customer402, 6, new Date(Long.parseLong("1483286560000")), "help desk");

ticketManager.add(ticket464);

date = 1483435912000l;

DataGenerator.setValueToField(ticket464, "creationDate", new Date(date));

Ticket ticket465 = new MalfunctionTicket("Mary plays the piano.", Status.PROCESSED, employee171, customer274, 6, "remove");

ticketManager.add(ticket465);

date = 1483057563000l;

DataGenerator.setValueToField(ticket465, "creationDate", new Date(date));

Ticket ticket466 = new RequestTicket("Mary plays the piano.", Status.PROCESSED, employee238, customer285, 4, new Date(Long.parseLong("1483168662000")), "help desk");

ticketManager.add(ticket466);

date = 1483490222000l;

DataGenerator.setValueToField(ticket466, "creationDate", new Date(date));

Ticket ticket467 = new RequestTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee190, customer466, 0, new Date(Long.parseLong("1483052606000")), "help desk");

ticketManager.add(ticket467);

date = 1483367136000l;

DataGenerator.setValueToField(ticket467, "creationDate", new Date(date));

Ticket ticket468 = new OrderTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.RECORDED, employee233, customer333, 8, "Quil", "Gravequadtam", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 64);

ticketManager.add(ticket468);

date = 1483426624000l;

DataGenerator.setValueToField(ticket468, "creationDate", new Date(date));

Ticket ticket469 = new OrderTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee22, customer469, 0, "Blue Water", "Touchfresh", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 41);

ticketManager.add(ticket469);

date = 1483036895000l;

DataGenerator.setValueToField(ticket469, "creationDate", new Date(date));

Ticket ticket470 = new RequestTicket("Cats are good pets, for they are clean and are not noisy.", Status.WAITING_FOR_FEEDBACK, employee224, customer369, 4, new Date(Long.parseLong("1483496442000")), "consulting");

ticketManager.add(ticket470);

date = 1483382738000l;

DataGenerator.setValueToField(ticket470, "creationDate", new Date(date));

Ticket ticket471 = new OrderTicket("She folded her handkerchief neatly.", Status.PROCESSED, employee25, customer304, 7, "Fresher", "Vilasonit", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 66);

ticketManager.add(ticket471);

date = 1483204736000l;

DataGenerator.setValueToField(ticket471, "creationDate", new Date(date));

Ticket ticket472 = new RequestTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.RECORDED, employee0, customer316, 2, new Date(Long.parseLong("1483526999000")), "consulting");

ticketManager.add(ticket472);

date = 1483614716000l;

DataGenerator.setValueToField(ticket472, "creationDate", new Date(date));

Ticket ticket473 = new OrderTicket("I currently have 4 windows open up… and I don’t know why.", Status.WAITING_FOR_FEEDBACK, employee239, customer474, 10, "Blue Water", "Trippletone", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 96);

ticketManager.add(ticket473);

date = 1483034524000l;

DataGenerator.setValueToField(ticket473, "creationDate", new Date(date));

Ticket ticket474 = new OrderTicket("Christmas is coming.", Status.CLOSED, employee128, customer400, 9, "Plog", "Haynimfax", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 69);

ticketManager.add(ticket474);

date = 1483219819000l;

DataGenerator.setValueToField(ticket474, "creationDate", new Date(date));

Ticket ticket475 = new MalfunctionTicket("The old apple revels in its authority.", Status.RECORDED, employee166, customer410, 2, "repair");

ticketManager.add(ticket475);

date = 1483589695000l;

DataGenerator.setValueToField(ticket475, "creationDate", new Date(date));

Ticket ticket476 = new RequestTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.WAITING_FOR_FEEDBACK, employee159, customer367, 9, new Date(Long.parseLong("1483588876000")), "checkup");

ticketManager.add(ticket476);

date = 1483111617000l;

DataGenerator.setValueToField(ticket476, "creationDate", new Date(date));

Ticket ticket477 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.SOLVED, employee199, customer254, 1, new Date(Long.parseLong("1483360728000")), "training");

ticketManager.add(ticket477);

date = 1483603353000l;

DataGenerator.setValueToField(ticket477, "creationDate", new Date(date));

Ticket ticket478 = new MalfunctionTicket("The stranger officiates the meal.", Status.CLOSED, employee143, customer459, 2, "repair");

ticketManager.add(ticket478);

date = 1483519374000l;

DataGenerator.setValueToField(ticket478, "creationDate", new Date(date));

Ticket ticket479 = new RequestTicket("She only paints with bold colors. she does not like pastels.", Status.PROCESSED, employee121, customer445, 9, new Date(Long.parseLong("1483133283000")), "checkup");

ticketManager.add(ticket479);

date = 1483137304000l;

DataGenerator.setValueToField(ticket479, "creationDate", new Date(date));

Ticket ticket480 = new OrderTicket("I currently have 4 windows open up… and I don’t know why.", Status.SOLVED, employee125, customer430, 9, "Blue Water", "Trippletone", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 57);

ticketManager.add(ticket480);

date = 1483135839000l;

DataGenerator.setValueToField(ticket480, "creationDate", new Date(date));

Ticket ticket481 = new RequestTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.CLOSED, employee212, customer271, 3, new Date(Long.parseLong("1483126366000")), "training");

ticketManager.add(ticket481);

date = 1483391709000l;

DataGenerator.setValueToField(ticket481, "creationDate", new Date(date));

Ticket ticket482 = new OrderTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.SOLVED, employee245, customer271, 4, "Quil", "Airfix", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 79);

ticketManager.add(ticket482);

date = 1483348686000l;

DataGenerator.setValueToField(ticket482, "creationDate", new Date(date));

Ticket ticket483 = new MalfunctionTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.WAITING_FOR_FEEDBACK, employee201, customer359, 8, "setup");

ticketManager.add(ticket483);

date = 1483304949000l;

DataGenerator.setValueToField(ticket483, "creationDate", new Date(date));

Ticket ticket484 = new RequestTicket("Let me help you with your baggage.", Status.RECORDED, employee225, customer285, 3, new Date(Long.parseLong("1483556697000")), "help desk");

ticketManager.add(ticket484);

date = 1483386867000l;

DataGenerator.setValueToField(ticket484, "creationDate", new Date(date));

Ticket ticket485 = new MalfunctionTicket("She did not cheat on the test, for it was not the right thing to do.", Status.CLOSED, employee112, customer291, 4, "restore");

ticketManager.add(ticket485);

date = 1483602545000l;

DataGenerator.setValueToField(ticket485, "creationDate", new Date(date));

Ticket ticket486 = new OrderTicket("I love eating toasted cheese and tuna sandwiches.", Status.CLOSED, employee95, customer478, 9, "Green Plants", "Don Dax", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 70);

ticketManager.add(ticket486);

date = 1483472625000l;

DataGenerator.setValueToField(ticket486, "creationDate", new Date(date));

Ticket ticket487 = new RequestTicket("Cats are good pets, for they are clean and are not noisy.", Status.WAITING_FOR_FEEDBACK, employee180, customer357, 2, new Date(Long.parseLong("1483081128000")), "help desk");

ticketManager.add(ticket487);

date = 1483054790000l;

DataGenerator.setValueToField(ticket487, "creationDate", new Date(date));

Ticket ticket488 = new RequestTicket("The old apple revels in its authority.", Status.PROCESSED, employee112, customer319, 1, new Date(Long.parseLong("1483514817000")), "training");

ticketManager.add(ticket488);

date = 1483436553000l;

DataGenerator.setValueToField(ticket488, "creationDate", new Date(date));

Ticket ticket489 = new OrderTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.RECORDED, employee32, customer467, 4, "Plog", "Don Dax", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 55);

ticketManager.add(ticket489);

date = 1483248100000l;

DataGenerator.setValueToField(ticket489, "creationDate", new Date(date));

Ticket ticket490 = new RequestTicket("She folded her handkerchief neatly.", Status.PROCESSED, employee72, customer407, 7, new Date(Long.parseLong("1483279309000")), "help desk");

ticketManager.add(ticket490);

date = 1483548375000l;

DataGenerator.setValueToField(ticket490, "creationDate", new Date(date));

Ticket ticket491 = new RequestTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.CLOSED, employee84, customer299, 5, new Date(Long.parseLong("1483259563000")), "help desk");

ticketManager.add(ticket491);

date = 1483203611000l;

DataGenerator.setValueToField(ticket491, "creationDate", new Date(date));

Ticket ticket492 = new MalfunctionTicket("I currently have 4 windows open up… and I don’t know why.", Status.WAITING_FOR_FEEDBACK, employee73, customer363, 5, "remove");

ticketManager.add(ticket492);

date = 1483288600000l;

DataGenerator.setValueToField(ticket492, "creationDate", new Date(date));

Ticket ticket493 = new MalfunctionTicket("She advised him to come back at once.", Status.SOLVED, employee99, customer463, 5, "restore");

ticketManager.add(ticket493);

date = 1483447701000l;

DataGenerator.setValueToField(ticket493, "creationDate", new Date(date));

Ticket ticket494 = new OrderTicket("The body may perhaps compensates for the loss of a true metaphysics.", Status.SOLVED, employee145, customer420, 0, "Telefunk", "Touchfresh", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 31);

ticketManager.add(ticket494);

date = 1483256593000l;

DataGenerator.setValueToField(ticket494, "creationDate", new Date(date));

Ticket ticket495 = new OrderTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.PROCESSED, employee47, customer261, 10, "Rent", "Zumron", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 98);

ticketManager.add(ticket495);

date = 1483129288000l;

DataGenerator.setValueToField(ticket495, "creationDate", new Date(date));

Ticket ticket496 = new MalfunctionTicket("I am counting my calories, yet I really want dessert.", Status.WAITING_FOR_FEEDBACK, employee86, customer412, 9, "remove");

ticketManager.add(ticket496);

date = 1483050462000l;

DataGenerator.setValueToField(ticket496, "creationDate", new Date(date));

Ticket ticket497 = new RequestTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.PROCESSED, employee123, customer350, 4, new Date(Long.parseLong("1483413898000")), "training");

ticketManager.add(ticket497);

date = 1483442301000l;

DataGenerator.setValueToField(ticket497, "creationDate", new Date(date));

Ticket ticket498 = new RequestTicket("Where do random thoughts come from?", Status.SOLVED, employee185, customer484, 9, new Date(Long.parseLong("1483557681000")), "consulting");

ticketManager.add(ticket498);

date = 1483056125000l;

DataGenerator.setValueToField(ticket498, "creationDate", new Date(date));

Ticket ticket499 = new OrderTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.SOLVED, employee26, customer442, 0, "Red Pizza", "Vilasonit", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 40);

ticketManager.add(ticket499);

date = 1483232321000l;

DataGenerator.setValueToField(ticket499, "creationDate", new Date(date));

}
}