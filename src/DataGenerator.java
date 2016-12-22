import de.ddi.ticketsystem.*;

import java.util.Date;

import java.lang.reflect.Field;

public class DataGenerator {

public static Employee employee;

public static Customer customer;

public static long date;

public static void setValueToField(Object o, String name, Object content) {         Field field;         try { field = o.getClass().getDeclaredField(name); field.setAccessible(true); field.set(o, content);         } catch (Exception e) { System.out.print(e); } }

public static void fillTicketManager(TicketManager ticketManager) {

Employee employee0 = new Employee("Benjamin", "Landry", "benjamin.landry@our-company.com", "Marketing");

employee = employee0;

Employee employee1 = new Employee("Leanna", "Glenn", "leanna.glenn@our-company.com", "Warrehousing");

Employee employee2 = new Employee("Davian", "Krueger", "davian.krueger@our-company.com", "Marketing");

Employee employee3 = new Employee("Isla", "Combs", "isla.combs@our-company.com", "Logistic");

Employee employee4 = new Employee("Annika", "Gross", "annika.gross@our-company.com", "Warrehousing");

Employee employee5 = new Employee("Deon", "Blankenship", "deon.blankenship@our-company.com", "Management");

Employee employee6 = new Employee("Naima", "Herring", "naima.herring@our-company.com", "Warrehousing");

Employee employee7 = new Employee("Lara", "Baird", "lara.baird@our-company.com", "Marketing");

Employee employee8 = new Employee("Gina", "Nguyen", "gina.nguyen@our-company.com", "Logistic");

Employee employee9 = new Employee("Kadyn", "Pierce", "kadyn.pierce@our-company.com", "IT");

Employee employee10 = new Employee("Patience", "Cole", "patience.cole@our-company.com", "Warrehousing");

Employee employee11 = new Employee("Johnathan", "Hardin", "johnathan.hardin@our-company.com", "Marketing");

Employee employee12 = new Employee("Ethan", "Donaldson", "ethan.donaldson@our-company.com", "IT");

Employee employee13 = new Employee("Diana", "Stanton", "diana.stanton@our-company.com", "Warrehousing");

Employee employee14 = new Employee("Dylan", "Harmon", "dylan.harmon@our-company.com", "Marketing");

Employee employee15 = new Employee("Ian", "Kelley", "ian.kelley@our-company.com", "Management");

Employee employee16 = new Employee("Leia", "Day", "leia.day@our-company.com", "Marketing");

Employee employee17 = new Employee("Fabian", "Dixon", "fabian.dixon@our-company.com", "Marketing");

Employee employee18 = new Employee("Marley", "Barker", "marley.barker@our-company.com", "IT");

Employee employee19 = new Employee("Paige", "Singh", "paige.singh@our-company.com", "Logistic");

Employee employee20 = new Employee("Jaime", "Becker", "jaime.becker@our-company.com", "Technical Support");

Employee employee21 = new Employee("Ernesto", "Mendez", "ernesto.mendez@our-company.com", "Logistic");

Employee employee22 = new Employee("Josiah", "Garcia", "josiah.garcia@our-company.com", "Management");

Employee employee23 = new Employee("Kaia", "Velazquez", "kaia.velazquez@our-company.com", "Logistic");

Employee employee24 = new Employee("Jeramiah", "Douglas", "jeramiah.douglas@our-company.com", "Technical Support");

Employee employee25 = new Employee("Jude", "Wallace", "jude.wallace@our-company.com", "IT");

Employee employee26 = new Employee("Jaylene", "Merritt", "jaylene.merritt@our-company.com", "IT");

Employee employee27 = new Employee("Cael", "Peck", "cael.peck@our-company.com", "Management");

Employee employee28 = new Employee("Uriel", "Smith", "uriel.smith@our-company.com", "Technical Support");

Employee employee29 = new Employee("Anahi", "Webster", "anahi.webster@our-company.com", "IT");

Employee employee30 = new Employee("Connor", "Jenkins", "connor.jenkins@our-company.com", "Management");

Employee employee31 = new Employee("Sergio", "Carroll", "sergio.carroll@our-company.com", "Marketing");

Employee employee32 = new Employee("Santino", "Carey", "santino.carey@our-company.com", "Technical Support");

Employee employee33 = new Employee("Nikolas", "Hancock", "nikolas.hancock@our-company.com", "Marketing");

Employee employee34 = new Employee("Alani", "Hunter", "alani.hunter@our-company.com", "Warrehousing");

Employee employee35 = new Employee("Gerald", "Payne", "gerald.payne@our-company.com", "IT");

Employee employee36 = new Employee("Markus", "Torres", "markus.torres@our-company.com", "IT");

Employee employee37 = new Employee("Adonis", "Moss", "adonis.moss@our-company.com", "Logistic");

Employee employee38 = new Employee("Kendrick", "Arias", "kendrick.arias@our-company.com", "Warrehousing");

Employee employee39 = new Employee("Abdullah", "Gutierrez", "abdullah.gutierrez@our-company.com", "IT");

Employee employee40 = new Employee("Marc", "Cox", "marc.cox@our-company.com", "Marketing");

Employee employee41 = new Employee("Raina", "Vance", "raina.vance@our-company.com", "Marketing");

Employee employee42 = new Employee("Deandre", "Mccarty", "deandre.mccarty@our-company.com", "Management");

Employee employee43 = new Employee("Semaj", "Gates", "semaj.gates@our-company.com", "IT");

Employee employee44 = new Employee("Alena", "Preston", "alena.preston@our-company.com", "Technical Support");

Employee employee45 = new Employee("Juan", "Horton", "juan.horton@our-company.com", "IT");

Employee employee46 = new Employee("Messiah", "Riddle", "messiah.riddle@our-company.com", "Marketing");

Employee employee47 = new Employee("Luis", "Wells", "luis.wells@our-company.com", "Technical Support");

Employee employee48 = new Employee("Valentina", "Stone", "valentina.stone@our-company.com", "Marketing");

Employee employee49 = new Employee("Amiyah", "Schwartz", "amiyah.schwartz@our-company.com", "Technical Support");

Employee employee50 = new Employee("Ruth", "Villa", "ruth.villa@our-company.com", "IT");

Employee employee51 = new Employee("Nina", "Lynn", "nina.lynn@our-company.com", "Management");

Employee employee52 = new Employee("Leah", "Massey", "leah.massey@our-company.com", "Logistic");

Employee employee53 = new Employee("Lillian", "Hubbard", "lillian.hubbard@our-company.com", "Warrehousing");

Employee employee54 = new Employee("Elisabeth", "Willis", "elisabeth.willis@our-company.com", "Marketing");

Employee employee55 = new Employee("Mackenzie", "Wong", "mackenzie.wong@our-company.com", "IT");

Employee employee56 = new Employee("Ella", "Stokes", "ella.stokes@our-company.com", "Technical Support");

Employee employee57 = new Employee("Anaya", "Brown", "anaya.brown@our-company.com", "Logistic");

Employee employee58 = new Employee("Dax", "Riley", "dax.riley@our-company.com", "Warrehousing");

Employee employee59 = new Employee("Caitlin", "Kane", "caitlin.kane@our-company.com", "Logistic");

Employee employee60 = new Employee("Pierce", "Mcgrath", "pierce.mcgrath@our-company.com", "Warrehousing");

Employee employee61 = new Employee("Paityn", "Reilly", "paityn.reilly@our-company.com", "Warrehousing");

Employee employee62 = new Employee("Keely", "Baker", "keely.baker@our-company.com", "Marketing");

Employee employee63 = new Employee("Nathalia", "Barton", "nathalia.barton@our-company.com", "Technical Support");

Employee employee64 = new Employee("Kameron", "Robbins", "kameron.robbins@our-company.com", "Management");

Employee employee65 = new Employee("Xzavier", "Dean", "xzavier.dean@our-company.com", "Technical Support");

Employee employee66 = new Employee("Ellen", "Galvan", "ellen.galvan@our-company.com", "Management");

Employee employee67 = new Employee("Paul", "Lindsey", "paul.lindsey@our-company.com", "Warrehousing");

Employee employee68 = new Employee("Kaleb", "Ramirez", "kaleb.ramirez@our-company.com", "Logistic");

Employee employee69 = new Employee("Karley", "Farley", "karley.farley@our-company.com", "Logistic");

Employee employee70 = new Employee("Natalya", "Fuller", "natalya.fuller@our-company.com", "Warrehousing");

Employee employee71 = new Employee("Javier", "Dougherty", "javier.dougherty@our-company.com", "IT");

Employee employee72 = new Employee("Danna", "Forbes", "danna.forbes@our-company.com", "Technical Support");

Employee employee73 = new Employee("Clayton", "Wiggins", "clayton.wiggins@our-company.com", "Marketing");

Employee employee74 = new Employee("Jon", "Weaver", "jon.weaver@our-company.com", "Logistic");

Employee employee75 = new Employee("Jamison", "Valencia", "jamison.valencia@our-company.com", "Warrehousing");

Employee employee76 = new Employee("Anabella", "Hahn", "anabella.hahn@our-company.com", "IT");

Employee employee77 = new Employee("Micaela", "Morse", "micaela.morse@our-company.com", "Warrehousing");

Employee employee78 = new Employee("Carter", "Holland", "carter.holland@our-company.com", "Management");

Employee employee79 = new Employee("Francesca", "Lopez", "francesca.lopez@our-company.com", "Technical Support");

Employee employee80 = new Employee("Sage", "Rojas", "sage.rojas@our-company.com", "Marketing");

Employee employee81 = new Employee("Ibrahim", "Pope", "ibrahim.pope@our-company.com", "Marketing");

Employee employee82 = new Employee("Aubrey", "Li", "aubrey.li@our-company.com", "IT");

Employee employee83 = new Employee("Rodolfo", "Cannon", "rodolfo.cannon@our-company.com", "Warrehousing");

Employee employee84 = new Employee("Jaxson", "Wheeler", "jaxson.wheeler@our-company.com", "Marketing");

Employee employee85 = new Employee("Diya", "Austin", "diya.austin@our-company.com", "Marketing");

Employee employee86 = new Employee("Arnav", "Wolfe", "arnav.wolfe@our-company.com", "Marketing");

Employee employee87 = new Employee("Claudia", "Deleon", "claudia.deleon@our-company.com", "IT");

Employee employee88 = new Employee("Finnegan", "Kent", "finnegan.kent@our-company.com", "Marketing");

Employee employee89 = new Employee("Marquise", "Montgomery", "marquise.montgomery@our-company.com", "Marketing");

Employee employee90 = new Employee("Edward", "Mays", "edward.mays@our-company.com", "IT");

Employee employee91 = new Employee("King", "Harding", "king.harding@our-company.com", "Warrehousing");

Employee employee92 = new Employee("Antwan", "Duran", "antwan.duran@our-company.com", "Warrehousing");

Employee employee93 = new Employee("Ryan", "Houston", "ryan.houston@our-company.com", "Marketing");

Employee employee94 = new Employee("Kyra", "Sexton", "kyra.sexton@our-company.com", "Management");

Employee employee95 = new Employee("Jayla", "Lawrence", "jayla.lawrence@our-company.com", "Marketing");

Employee employee96 = new Employee("Jaslyn", "Sloan", "jaslyn.sloan@our-company.com", "Marketing");

Employee employee97 = new Employee("Jewel", "Leonard", "jewel.leonard@our-company.com", "Logistic");

Employee employee98 = new Employee("Saniyah", "Lozano", "saniyah.lozano@our-company.com", "Management");

Employee employee99 = new Employee("Naomi", "Randolph", "naomi.randolph@our-company.com", "Warrehousing");

Employee employee100 = new Employee("Miriam", "Clay", "miriam.clay@our-company.com", "Logistic");

Employee employee101 = new Employee("Lucy", "Bartlett", "lucy.bartlett@our-company.com", "Logistic");

Employee employee102 = new Employee("Grayson", "Tapia", "grayson.tapia@our-company.com", "Logistic");

Employee employee103 = new Employee("Kaleigh", "Campbell", "kaleigh.campbell@our-company.com", "Warrehousing");

Employee employee104 = new Employee("Gwendolyn", "Luna", "gwendolyn.luna@our-company.com", "Marketing");

Employee employee105 = new Employee("Giselle", "Bryan", "giselle.bryan@our-company.com", "Logistic");

Employee employee106 = new Employee("Antonio", "Barber", "antonio.barber@our-company.com", "Technical Support");

Employee employee107 = new Employee("Nash", "Newman", "nash.newman@our-company.com", "Warrehousing");

Employee employee108 = new Employee("Cameron", "David", "cameron.david@our-company.com", "Warrehousing");

Employee employee109 = new Employee("Sarai", "Christensen", "sarai.christensen@our-company.com", "Technical Support");

Employee employee110 = new Employee("Ellie", "Fletcher", "ellie.fletcher@our-company.com", "Marketing");

Employee employee111 = new Employee("Savanna", "George", "savanna.george@our-company.com", "Warrehousing");

Employee employee112 = new Employee("Sydnee", "Sweeney", "sydnee.sweeney@our-company.com", "Technical Support");

Employee employee113 = new Employee("Jordon", "Mccormick", "jordon.mccormick@our-company.com", "IT");

Employee employee114 = new Employee("Tyrone", "Velasquez", "tyrone.velasquez@our-company.com", "Management");

Employee employee115 = new Employee("Cherish", "Cohen", "cherish.cohen@our-company.com", "IT");

Employee employee116 = new Employee("Nathanial", "Mills", "nathanial.mills@our-company.com", "Warrehousing");

Employee employee117 = new Employee("Kaylah", "Copeland", "kaylah.copeland@our-company.com", "IT");

Employee employee118 = new Employee("Rolando", "Rivas", "rolando.rivas@our-company.com", "Management");

Employee employee119 = new Employee("Yasmine", "Frey", "yasmine.frey@our-company.com", "Technical Support");

Employee employee120 = new Employee("Aiyana", "Reyes", "aiyana.reyes@our-company.com", "Warrehousing");

Employee employee121 = new Employee("Justine", "Brady", "justine.brady@our-company.com", "Marketing");

Employee employee122 = new Employee("Colby", "Oliver", "colby.oliver@our-company.com", "Technical Support");

Employee employee123 = new Employee("Madalynn", "Sharp", "madalynn.sharp@our-company.com", "Marketing");

Employee employee124 = new Employee("Clay", "Wang", "clay.wang@our-company.com", "IT");

Employee employee125 = new Employee("Laci", "Gibson", "laci.gibson@our-company.com", "Technical Support");

Employee employee126 = new Employee("Damion", "Moon", "damion.moon@our-company.com", "Warrehousing");

Employee employee127 = new Employee("Salvatore", "Olsen", "salvatore.olsen@our-company.com", "Warrehousing");

Employee employee128 = new Employee("Sloane", "Hobbs", "sloane.hobbs@our-company.com", "Technical Support");

Employee employee129 = new Employee("Luz", "Wilkinson", "luz.wilkinson@our-company.com", "Management");

Employee employee130 = new Employee("Gabriella", "Carlson", "gabriella.carlson@our-company.com", "IT");

Employee employee131 = new Employee("Jasmine", "Zhang", "jasmine.zhang@our-company.com", "Marketing");

Employee employee132 = new Employee("Mark", "Gallagher", "mark.gallagher@our-company.com", "Marketing");

Employee employee133 = new Employee("Aldo", "Mcknight", "aldo.mcknight@our-company.com", "Warrehousing");

Employee employee134 = new Employee("Joey", "Goodwin", "joey.goodwin@our-company.com", "Marketing");

Employee employee135 = new Employee("Madden", "Waller", "madden.waller@our-company.com", "Warrehousing");

Employee employee136 = new Employee("Jack", "Pratt", "jack.pratt@our-company.com", "Technical Support");

Employee employee137 = new Employee("Maia", "Holden", "maia.holden@our-company.com", "IT");

Employee employee138 = new Employee("Lea", "Walsh", "lea.walsh@our-company.com", "Technical Support");

Employee employee139 = new Employee("Aydan", "Mcgee", "aydan.mcgee@our-company.com", "IT");

Employee employee140 = new Employee("Leilani", "Carson", "leilani.carson@our-company.com", "Logistic");

Employee employee141 = new Employee("Leroy", "Crane", "leroy.crane@our-company.com", "Management");

Employee employee142 = new Employee("Grace", "Esparza", "grace.esparza@our-company.com", "Management");

Employee employee143 = new Employee("William", "Vincent", "william.vincent@our-company.com", "Marketing");

Employee employee144 = new Employee("Bethany", "Mathews", "bethany.mathews@our-company.com", "Management");

Employee employee145 = new Employee("Pamela", "Ortega", "pamela.ortega@our-company.com", "Management");

Employee employee146 = new Employee("Lisa", "Montoya", "lisa.montoya@our-company.com", "Warrehousing");

Employee employee147 = new Employee("Janiya", "Branch", "janiya.branch@our-company.com", "Management");

Employee employee148 = new Employee("Alvaro", "Norman", "alvaro.norman@our-company.com", "Logistic");

Employee employee149 = new Employee("Sara", "Gallegos", "sara.gallegos@our-company.com", "IT");

Employee employee150 = new Employee("Elisha", "Cordova", "elisha.cordova@our-company.com", "IT");

Employee employee151 = new Employee("Celia", "Friedman", "celia.friedman@our-company.com", "Warrehousing");

Employee employee152 = new Employee("Lydia", "Lewis", "lydia.lewis@our-company.com", "Warrehousing");

Employee employee153 = new Employee("Matias", "Mccoy", "matias.mccoy@our-company.com", "IT");

Employee employee154 = new Employee("Kaylyn", "Bright", "kaylyn.bright@our-company.com", "Warrehousing");

Employee employee155 = new Employee("Atticus", "Perez", "atticus.perez@our-company.com", "Management");

Employee employee156 = new Employee("Amya", "Chung", "amya.chung@our-company.com", "Marketing");

Employee employee157 = new Employee("Jaylen", "Beck", "jaylen.beck@our-company.com", "Management");

Employee employee158 = new Employee("Trevor", "Simon", "trevor.simon@our-company.com", "IT");

Employee employee159 = new Employee("Lexi", "Spencer", "lexi.spencer@our-company.com", "IT");

Employee employee160 = new Employee("Cloe", "James", "cloe.james@our-company.com", "Marketing");

Employee employee161 = new Employee("Abbey", "Weber", "abbey.weber@our-company.com", "Logistic");

Employee employee162 = new Employee("Rigoberto", "Avery", "rigoberto.avery@our-company.com", "Management");

Employee employee163 = new Employee("Carly", "Farrell", "carly.farrell@our-company.com", "Management");

Employee employee164 = new Employee("Bailey", "Golden", "bailey.golden@our-company.com", "Marketing");

Employee employee165 = new Employee("Paris", "Buckley", "paris.buckley@our-company.com", "IT");

Employee employee166 = new Employee("Gaven", "Duffy", "gaven.duffy@our-company.com", "Marketing");

Employee employee167 = new Employee("Talia", "Ritter", "talia.ritter@our-company.com", "Warrehousing");

Employee employee168 = new Employee("Braedon", "Webb", "braedon.webb@our-company.com", "Technical Support");

Employee employee169 = new Employee("Regan", "Doyle", "regan.doyle@our-company.com", "Management");

Employee employee170 = new Employee("Gianni", "Horne", "gianni.horne@our-company.com", "Logistic");

Employee employee171 = new Employee("Kiley", "Weiss", "kiley.weiss@our-company.com", "Marketing");

Employee employee172 = new Employee("Broderick", "Glass", "broderick.glass@our-company.com", "Management");

Employee employee173 = new Employee("Gracie", "Rich", "gracie.rich@our-company.com", "Logistic");

Employee employee174 = new Employee("Rishi", "Kerr", "rishi.kerr@our-company.com", "IT");

Employee employee175 = new Employee("Margaret", "Marquez", "margaret.marquez@our-company.com", "Technical Support");

Employee employee176 = new Employee("Zaria", "Giles", "zaria.giles@our-company.com", "Marketing");

Employee employee177 = new Employee("Jocelyn", "Brewer", "jocelyn.brewer@our-company.com", "Management");

Employee employee178 = new Employee("Riya", "Zimmerman", "riya.zimmerman@our-company.com", "Warrehousing");

Employee employee179 = new Employee("Tori", "Haynes", "tori.haynes@our-company.com", "IT");

Employee employee180 = new Employee("Fisher", "Richards", "fisher.richards@our-company.com", "Management");

Employee employee181 = new Employee("Erin", "Gilmore", "erin.gilmore@our-company.com", "Marketing");

Employee employee182 = new Employee("Marshall", "Martin", "marshall.martin@our-company.com", "Management");

Employee employee183 = new Employee("Mila", "Arnold", "mila.arnold@our-company.com", "Warrehousing");

Employee employee184 = new Employee("Holden", "Holmes", "holden.holmes@our-company.com", "Logistic");

Employee employee185 = new Employee("Hayden", "Steele", "hayden.steele@our-company.com", "IT");

Employee employee186 = new Employee("Shirley", "Francis", "shirley.francis@our-company.com", "Management");

Employee employee187 = new Employee("London", "Mejia", "london.mejia@our-company.com", "Management");

Employee employee188 = new Employee("Ryan", "Henderson", "ryan.henderson@our-company.com", "Management");

Employee employee189 = new Employee("Tomas", "Graham", "tomas.graham@our-company.com", "Management");

Employee employee190 = new Employee("Spencer", "Turner", "spencer.turner@our-company.com", "Logistic");

Employee employee191 = new Employee("Rylee", "Ferguson", "rylee.ferguson@our-company.com", "Warrehousing");

Employee employee192 = new Employee("Reuben", "Huber", "reuben.huber@our-company.com", "Warrehousing");

Employee employee193 = new Employee("Nia", "Christian", "nia.christian@our-company.com", "Technical Support");

Employee employee194 = new Employee("Eugene", "Morgan", "eugene.morgan@our-company.com", "IT");

Employee employee195 = new Employee("Shayna", "Wu", "shayna.wu@our-company.com", "Logistic");

Employee employee196 = new Employee("Ahmad", "Levine", "ahmad.levine@our-company.com", "Logistic");

Employee employee197 = new Employee("Aubree", "Hoffman", "aubree.hoffman@our-company.com", "Logistic");

Employee employee198 = new Employee("Enzo", "Vasquez", "enzo.vasquez@our-company.com", "IT");

Employee employee199 = new Employee("Khalil", "Brennan", "khalil.brennan@our-company.com", "IT");

Employee employee200 = new Employee("Fernanda", "Duncan", "fernanda.duncan@our-company.com", "Logistic");

Employee employee201 = new Employee("Alaina", "Cardenas", "alaina.cardenas@our-company.com", "Management");

Employee employee202 = new Employee("Cierra", "Knapp", "cierra.knapp@our-company.com", "Marketing");

Employee employee203 = new Employee("Humberto", "Mcdaniel", "humberto.mcdaniel@our-company.com", "Management");

Employee employee204 = new Employee("Keith", "Fitzgerald", "keith.fitzgerald@our-company.com", "Technical Support");

Employee employee205 = new Employee("Mattie", "Mercado", "mattie.mercado@our-company.com", "Marketing");

Employee employee206 = new Employee("Augustus", "Jensen", "augustus.jensen@our-company.com", "Marketing");

Employee employee207 = new Employee("Jaylan", "Lara", "jaylan.lara@our-company.com", "Marketing");

Employee employee208 = new Employee("Ava", "Horn", "ava.horn@our-company.com", "IT");

Employee employee209 = new Employee("Samson", "Mathis", "samson.mathis@our-company.com", "Warrehousing");

Employee employee210 = new Employee("Kylee", "Johns", "kylee.johns@our-company.com", "Logistic");

Employee employee211 = new Employee("Karter", "Koch", "karter.koch@our-company.com", "Logistic");

Employee employee212 = new Employee("Reagan", "Joyce", "reagan.joyce@our-company.com", "Logistic");

Employee employee213 = new Employee("Gunnar", "Bell", "gunnar.bell@our-company.com", "Technical Support");

Employee employee214 = new Employee("Micheal", "Crawford", "micheal.crawford@our-company.com", "IT");

Employee employee215 = new Employee("Haven", "Arellano", "haven.arellano@our-company.com", "Management");

Employee employee216 = new Employee("Kaelyn", "Wilcox", "kaelyn.wilcox@our-company.com", "Warrehousing");

Employee employee217 = new Employee("Charity", "Pollard", "charity.pollard@our-company.com", "Technical Support");

Employee employee218 = new Employee("Brynn", "Henson", "brynn.henson@our-company.com", "Marketing");

Employee employee219 = new Employee("Britney", "Mooney", "britney.mooney@our-company.com", "Logistic");

Employee employee220 = new Employee("Jorge", "Hammond", "jorge.hammond@our-company.com", "IT");

Employee employee221 = new Employee("Dalia", "Strickland", "dalia.strickland@our-company.com", "Warrehousing");

Employee employee222 = new Employee("Troy", "Greene", "troy.greene@our-company.com", "IT");

Employee employee223 = new Employee("Alyssa", "Ellis", "alyssa.ellis@our-company.com", "Management");

Employee employee224 = new Employee("Meghan", "Bates", "meghan.bates@our-company.com", "Marketing");

Employee employee225 = new Employee("Ronin", "Carrillo", "ronin.carrillo@our-company.com", "Warrehousing");

Employee employee226 = new Employee("Mohammad", "Evans", "mohammad.evans@our-company.com", "IT");

Employee employee227 = new Employee("Ray", "Bruce", "ray.bruce@our-company.com", "Logistic");

Employee employee228 = new Employee("Ariel", "Jordan", "ariel.jordan@our-company.com", "Technical Support");

Employee employee229 = new Employee("Beatrice", "Lucas", "beatrice.lucas@our-company.com", "Technical Support");

Employee employee230 = new Employee("Tyson", "Macias", "tyson.macias@our-company.com", "Marketing");

Employee employee231 = new Employee("Asia", "Burgess", "asia.burgess@our-company.com", "Warrehousing");

Employee employee232 = new Employee("Juliet", "Kennedy", "juliet.kennedy@our-company.com", "Technical Support");

Employee employee233 = new Employee("Darrell", "Mercer", "darrell.mercer@our-company.com", "Marketing");

Employee employee234 = new Employee("Dayana", "Riggs", "dayana.riggs@our-company.com", "IT");

Employee employee235 = new Employee("Chandler", "House", "chandler.house@our-company.com", "Warrehousing");

Employee employee236 = new Employee("Scarlet", "Lowery", "scarlet.lowery@our-company.com", "IT");

Employee employee237 = new Employee("Kailey", "Sutton", "kailey.sutton@our-company.com", "Management");

Employee employee238 = new Employee("Stephany", "Harper", "stephany.harper@our-company.com", "Marketing");

Employee employee239 = new Employee("Addisyn", "Roy", "addisyn.roy@our-company.com", "Marketing");

Employee employee240 = new Employee("Amelia", "Clark", "amelia.clark@our-company.com", "Technical Support");

Employee employee241 = new Employee("Helena", "Pacheco", "helena.pacheco@our-company.com", "IT");

Employee employee242 = new Employee("Rachel", "Rodgers", "rachel.rodgers@our-company.com", "Logistic");

Employee employee243 = new Employee("Robert", "Bailey", "robert.bailey@our-company.com", "Logistic");

Employee employee244 = new Employee("Sofia", "Villarreal", "sofia.villarreal@our-company.com", "Logistic");

Employee employee245 = new Employee("Mariah", "Velez", "mariah.velez@our-company.com", "Technical Support");

Employee employee246 = new Employee("Andrew", "Nunez", "andrew.nunez@our-company.com", "IT");

Employee employee247 = new Employee("Amare", "Larsen", "amare.larsen@our-company.com", "IT");

Employee employee248 = new Employee("Ximena", "Ochoa", "ximena.ochoa@our-company.com", "Management");

Employee employee249 = new Employee("Jordan", "Cherry", "jordan.cherry@our-company.com", "Warrehousing");

Customer customer250 = new Customer("Aron", "Roman", "aron.roman@flyerbuzzer.com", "FlyerBuzzer");

Customer customer251 = new Customer("Deacon", "Walter", "deacon.walter@sportastic.com", "Sportastic");

Customer customer252 = new Customer("Roger", "Hester", "roger.hester@carhouse.com", "CarHouse");

Customer customer253 = new Customer("Aria", "Silva", "aria.silva@carhouse.com", "CarHouse");

Customer customer254 = new Customer("Ashtyn", "Delacruz", "ashtyn.delacruz@flyerbuzzer.com", "FlyerBuzzer");

Customer customer255 = new Customer("Dwayne", "Bush", "dwayne.bush@flyerbuzzer.com", "FlyerBuzzer");

Customer customer256 = new Customer("Shea", "Bridges", "shea.bridges@flyerbuzzer.com", "FlyerBuzzer");

Customer customer257 = new Customer("Penelope", "Gordon", "penelope.gordon@plantsgetgreener.com", "PlantsGetGreener");

Customer customer258 = new Customer("Taniya", "Benjamin", "taniya.benjamin@carhouse.com", "CarHouse");

Customer customer259 = new Customer("Katelynn", "Mayer", "katelynn.mayer@shop42.com", "Shop42");

Customer customer260 = new Customer("Evelin", "Madden", "evelin.madden@plantsgetgreener.com", "PlantsGetGreener");

Customer customer261 = new Customer("Jasiah", "Pruitt", "jasiah.pruitt@carhouse.com", "CarHouse");

Customer customer262 = new Customer("Annie", "Hays", "annie.hays@plantsgetgreener.com", "PlantsGetGreener");

Customer customer263 = new Customer("Ulises", "Sawyer", "ulises.sawyer@plantsgetgreener.com", "PlantsGetGreener");

Customer customer264 = new Customer("Raphael", "Rowland", "raphael.rowland@carhouse.com", "CarHouse");

Customer customer265 = new Customer("Dante", "Ward", "dante.ward@shop42.com", "Shop42");

Customer customer266 = new Customer("Michelle", "Parrish", "michelle.parrish@sportastic.com", "Sportastic");

Customer customer267 = new Customer("Lily", "Downs", "lily.downs@flyerbuzzer.com", "FlyerBuzzer");

Customer customer268 = new Customer("Dario", "Whitehead", "dario.whitehead@plantsgetgreener.com", "PlantsGetGreener");

Customer customer269 = new Customer("Deshawn", "Pineda", "deshawn.pineda@flyerbuzzer.com", "FlyerBuzzer");

Customer customer270 = new Customer("Linda", "Pena", "linda.pena@sportastic.com", "Sportastic");

Customer customer271 = new Customer("Kasen", "Walters", "kasen.walters@plantsgetgreener.com", "PlantsGetGreener");

Customer customer272 = new Customer("Axel", "Estrada", "axel.estrada@shop42.com", "Shop42");

Customer customer273 = new Customer("Brent", "Warren", "brent.warren@plantsgetgreener.com", "PlantsGetGreener");

Customer customer274 = new Customer("Belen", "Carpenter", "belen.carpenter@plantsgetgreener.com", "PlantsGetGreener");

Customer customer275 = new Customer("Noe", "Sandoval", "noe.sandoval@sportastic.com", "Sportastic");

Customer customer276 = new Customer("Lizeth", "Mendoza", "lizeth.mendoza@shop42.com", "Shop42");

Customer customer277 = new Customer("Julissa", "Stout", "julissa.stout@plantsgetgreener.com", "PlantsGetGreener");

Customer customer278 = new Customer("Camren", "Yates", "camren.yates@shop42.com", "Shop42");

Customer customer279 = new Customer("Gilbert", "Hayden", "gilbert.hayden@shop42.com", "Shop42");

Customer customer280 = new Customer("Shamar", "Stevenson", "shamar.stevenson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer281 = new Customer("Davion", "Atkins", "davion.atkins@plantsgetgreener.com", "PlantsGetGreener");

Customer customer282 = new Customer("Dahlia", "Harrell", "dahlia.harrell@plantsgetgreener.com", "PlantsGetGreener");

Customer customer283 = new Customer("Kylie", "Hensley", "kylie.hensley@carhouse.com", "CarHouse");

Customer customer284 = new Customer("Stephen", "Richmond", "stephen.richmond@sportastic.com", "Sportastic");

Customer customer285 = new Customer("Trenton", "Tanner", "trenton.tanner@flyerbuzzer.com", "FlyerBuzzer");

Customer customer286 = new Customer("Jairo", "Dominguez", "jairo.dominguez@plantsgetgreener.com", "PlantsGetGreener");

Customer customer287 = new Customer("Gaige", "Oneill", "gaige.oneill@carhouse.com", "CarHouse");

Customer customer288 = new Customer("Layne", "Dalton", "layne.dalton@plantsgetgreener.com", "PlantsGetGreener");

Customer customer289 = new Customer("Amari", "Williamson", "amari.williamson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer290 = new Customer("Kendall", "Leon", "kendall.leon@carhouse.com", "CarHouse");

Customer customer291 = new Customer("Karissa", "Orozco", "karissa.orozco@flyerbuzzer.com", "FlyerBuzzer");

Customer customer292 = new Customer("Jovany", "Ballard", "jovany.ballard@sportastic.com", "Sportastic");

Customer customer293 = new Customer("Elisa", "Huffman", "elisa.huffman@carhouse.com", "CarHouse");

Customer customer294 = new Customer("Nick", "Mccarthy", "nick.mccarthy@plantsgetgreener.com", "PlantsGetGreener");

Customer customer295 = new Customer("Jayda", "Lucero", "jayda.lucero@shop42.com", "Shop42");

Customer customer296 = new Customer("Leandro", "Schultz", "leandro.schultz@shop42.com", "Shop42");

Customer customer297 = new Customer("Gemma", "Callahan", "gemma.callahan@shop42.com", "Shop42");

Customer customer298 = new Customer("Slade", "Sims", "slade.sims@shop42.com", "Shop42");

Customer customer299 = new Customer("Teresa", "Nolan", "teresa.nolan@shop42.com", "Shop42");

Customer customer300 = new Customer("Layla", "Johnston", "layla.johnston@plantsgetgreener.com", "PlantsGetGreener");

Customer customer301 = new Customer("Jaylyn", "Sellers", "jaylyn.sellers@shop42.com", "Shop42");

Customer customer302 = new Customer("Wilson", "Jones", "wilson.jones@shop42.com", "Shop42");

Customer customer303 = new Customer("Cara", "Cuevas", "cara.cuevas@flyerbuzzer.com", "FlyerBuzzer");

Customer customer304 = new Customer("Brett", "Winters", "brett.winters@sportastic.com", "Sportastic");

Customer customer305 = new Customer("Darryl", "Livingston", "darryl.livingston@sportastic.com", "Sportastic");

Customer customer306 = new Customer("Alicia", "Romero", "alicia.romero@carhouse.com", "CarHouse");

Customer customer307 = new Customer("Alessandro", "Kirby", "alessandro.kirby@sportastic.com", "Sportastic");

Customer customer308 = new Customer("Carson", "Hickman", "carson.hickman@sportastic.com", "Sportastic");

Customer customer309 = new Customer("Iyana", "Acosta", "iyana.acosta@carhouse.com", "CarHouse");

Customer customer310 = new Customer("Thomas", "Butler", "thomas.butler@shop42.com", "Shop42");

Customer customer311 = new Customer("Harper", "French", "harper.french@flyerbuzzer.com", "FlyerBuzzer");

Customer customer312 = new Customer("Keyla", "Maynard", "keyla.maynard@carhouse.com", "CarHouse");

Customer customer313 = new Customer("Easton", "Crosby", "easton.crosby@shop42.com", "Shop42");

Customer customer314 = new Customer("Madeleine", "Norton", "madeleine.norton@plantsgetgreener.com", "PlantsGetGreener");

Customer customer315 = new Customer("Trystan", "Larson", "trystan.larson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer316 = new Customer("Jillian", "Palmer", "jillian.palmer@carhouse.com", "CarHouse");

Customer customer317 = new Customer("Amanda", "Stanley", "amanda.stanley@flyerbuzzer.com", "FlyerBuzzer");

Customer customer318 = new Customer("Lincoln", "Baldwin", "lincoln.baldwin@sportastic.com", "Sportastic");

Customer customer319 = new Customer("Melissa", "Ellison", "melissa.ellison@sportastic.com", "Sportastic");

Customer customer320 = new Customer("Aimee", "Aguilar", "aimee.aguilar@carhouse.com", "CarHouse");

Customer customer321 = new Customer("Gilberto", "Adkins", "gilberto.adkins@flyerbuzzer.com", "FlyerBuzzer");

Customer customer322 = new Customer("Alexander", "Gay", "alexander.gay@flyerbuzzer.com", "FlyerBuzzer");

Customer customer323 = new Customer("Demetrius", "Martinez", "demetrius.martinez@sportastic.com", "Sportastic");

Customer customer324 = new Customer("Rogelio", "Ingram", "rogelio.ingram@sportastic.com", "Sportastic");

Customer customer325 = new Customer("Deangelo", "Galloway", "deangelo.galloway@sportastic.com", "Sportastic");

Customer customer326 = new Customer("Zander", "King", "zander.king@flyerbuzzer.com", "FlyerBuzzer");

Customer customer327 = new Customer("Ethen", "Barnes", "ethen.barnes@flyerbuzzer.com", "FlyerBuzzer");

Customer customer328 = new Customer("Donna", "Sanders", "donna.sanders@flyerbuzzer.com", "FlyerBuzzer");

Customer customer329 = new Customer("Valentin", "Zavala", "valentin.zavala@flyerbuzzer.com", "FlyerBuzzer");

Customer customer330 = new Customer("Liana", "Charles", "liana.charles@plantsgetgreener.com", "PlantsGetGreener");

Customer customer331 = new Customer("Moshe", "Bowen", "moshe.bowen@sportastic.com", "Sportastic");

Customer customer332 = new Customer("Ciara", "Nielsen", "ciara.nielsen@plantsgetgreener.com", "PlantsGetGreener");

Customer customer333 = new Customer("Kianna", "Foley", "kianna.foley@flyerbuzzer.com", "FlyerBuzzer");

Customer customer334 = new Customer("Helen", "Murphy", "helen.murphy@flyerbuzzer.com", "FlyerBuzzer");

Customer customer335 = new Customer("Willie", "Oneal", "willie.oneal@flyerbuzzer.com", "FlyerBuzzer");

Customer customer336 = new Customer("Christina", "Booker", "christina.booker@sportastic.com", "Sportastic");

Customer customer337 = new Customer("Micah", "Fritz", "micah.fritz@shop42.com", "Shop42");

Customer customer338 = new Customer("Giovani", "Russo", "giovani.russo@sportastic.com", "Sportastic");

Customer customer339 = new Customer("Emerson", "Coffey", "emerson.coffey@carhouse.com", "CarHouse");

Customer customer340 = new Customer("Shaun", "Espinoza", "shaun.espinoza@flyerbuzzer.com", "FlyerBuzzer");

Customer customer341 = new Customer("Colin", "Clements", "colin.clements@carhouse.com", "CarHouse");

Customer customer342 = new Customer("Rebekah", "Vargas", "rebekah.vargas@carhouse.com", "CarHouse");

Customer customer343 = new Customer("Ingrid", "Pace", "ingrid.pace@flyerbuzzer.com", "FlyerBuzzer");

Customer customer344 = new Customer("Carlie", "Blackburn", "carlie.blackburn@carhouse.com", "CarHouse");

Customer customer345 = new Customer("Stella", "Chandler", "stella.chandler@shop42.com", "Shop42");

Customer customer346 = new Customer("Cecelia", "Nixon", "cecelia.nixon@plantsgetgreener.com", "PlantsGetGreener");

Customer customer347 = new Customer("Rey", "Decker", "rey.decker@carhouse.com", "CarHouse");

Customer customer348 = new Customer("Emilia", "Trevino", "emilia.trevino@flyerbuzzer.com", "FlyerBuzzer");

Customer customer349 = new Customer("Paisley", "Moyer", "paisley.moyer@sportastic.com", "Sportastic");

Customer customer350 = new Customer("Joselyn", "Schneider", "joselyn.schneider@plantsgetgreener.com", "PlantsGetGreener");

Customer customer351 = new Customer("Anthony", "Barnett", "anthony.barnett@sportastic.com", "Sportastic");

Customer customer352 = new Customer("Aditya", "Huff", "aditya.huff@sportastic.com", "Sportastic");

Customer customer353 = new Customer("Jordyn", "Le", "jordyn.le@plantsgetgreener.com", "PlantsGetGreener");

Customer customer354 = new Customer("Aaron", "Hopkins", "aaron.hopkins@shop42.com", "Shop42");

Customer customer355 = new Customer("Catalina", "Knox", "catalina.knox@shop42.com", "Shop42");

Customer customer356 = new Customer("Jadyn", "Bernard", "jadyn.bernard@sportastic.com", "Sportastic");

Customer customer357 = new Customer("Kimora", "Pearson", "kimora.pearson@sportastic.com", "Sportastic");

Customer customer358 = new Customer("Nancy", "Hutchinson", "nancy.hutchinson@sportastic.com", "Sportastic");

Customer customer359 = new Customer("Delilah", "Hale", "delilah.hale@flyerbuzzer.com", "FlyerBuzzer");

Customer customer360 = new Customer("Alisson", "Chaney", "alisson.chaney@flyerbuzzer.com", "FlyerBuzzer");

Customer customer361 = new Customer("Quinn", "Tyler", "quinn.tyler@carhouse.com", "CarHouse");

Customer customer362 = new Customer("Jeremy", "Grant", "jeremy.grant@shop42.com", "Shop42");

Customer customer363 = new Customer("Joy", "Rollins", "joy.rollins@shop42.com", "Shop42");

Customer customer364 = new Customer("Brogan", "Obrien", "brogan.obrien@carhouse.com", "CarHouse");

Customer customer365 = new Customer("Emmalee", "Rangel", "emmalee.rangel@carhouse.com", "CarHouse");

Customer customer366 = new Customer("Drake", "Santana", "drake.santana@sportastic.com", "Sportastic");

Customer customer367 = new Customer("Angelica", "Church", "angelica.church@plantsgetgreener.com", "PlantsGetGreener");

Customer customer368 = new Customer("Stephanie", "Mckay", "stephanie.mckay@sportastic.com", "Sportastic");

Customer customer369 = new Customer("Hailey", "Calhoun", "hailey.calhoun@flyerbuzzer.com", "FlyerBuzzer");

Customer customer370 = new Customer("Chris", "Boyd", "chris.boyd@carhouse.com", "CarHouse");

Customer customer371 = new Customer("America", "Fitzpatrick", "america.fitzpatrick@plantsgetgreener.com", "PlantsGetGreener");

Customer customer372 = new Customer("Madalyn", "Gonzalez", "madalyn.gonzalez@flyerbuzzer.com", "FlyerBuzzer");

Customer customer373 = new Customer("Sylvia", "Beltran", "sylvia.beltran@plantsgetgreener.com", "PlantsGetGreener");

Customer customer374 = new Customer("Jaden", "Pittman", "jaden.pittman@flyerbuzzer.com", "FlyerBuzzer");

Customer customer375 = new Customer("Arielle", "Andrade", "arielle.andrade@sportastic.com", "Sportastic");

Customer customer376 = new Customer("Kamila", "Beasley", "kamila.beasley@shop42.com", "Shop42");

Customer customer377 = new Customer("Lennon", "Fernandez", "lennon.fernandez@flyerbuzzer.com", "FlyerBuzzer");

Customer customer378 = new Customer("June", "Mullen", "june.mullen@shop42.com", "Shop42");

Customer customer379 = new Customer("Aileen", "Thornton", "aileen.thornton@shop42.com", "Shop42");

Customer customer380 = new Customer("Alonso", "Walls", "alonso.walls@flyerbuzzer.com", "FlyerBuzzer");

Customer customer381 = new Customer("Araceli", "Lester", "araceli.lester@plantsgetgreener.com", "PlantsGetGreener");

Customer customer382 = new Customer("Tristin", "Archer", "tristin.archer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer383 = new Customer("Aedan", "Rose", "aedan.rose@flyerbuzzer.com", "FlyerBuzzer");

Customer customer384 = new Customer("Kamron", "Anderson", "kamron.anderson@shop42.com", "Shop42");

Customer customer385 = new Customer("Alia", "Howell", "alia.howell@sportastic.com", "Sportastic");

Customer customer386 = new Customer("Andy", "Stewart", "andy.stewart@shop42.com", "Shop42");

Customer customer387 = new Customer("Karma", "Shepard", "karma.shepard@sportastic.com", "Sportastic");

Customer customer388 = new Customer("Reed", "Mcdowell", "reed.mcdowell@sportastic.com", "Sportastic");

Customer customer389 = new Customer("Marvin", "Franco", "marvin.franco@carhouse.com", "CarHouse");

Customer customer390 = new Customer("Zoey", "Hansen", "zoey.hansen@plantsgetgreener.com", "PlantsGetGreener");

Customer customer391 = new Customer("Hugo", "Hicks", "hugo.hicks@shop42.com", "Shop42");

Customer customer392 = new Customer("Tiana", "Berger", "tiana.berger@carhouse.com", "CarHouse");

Customer customer393 = new Customer("Makenzie", "Cruz", "makenzie.cruz@plantsgetgreener.com", "PlantsGetGreener");

Customer customer394 = new Customer("Santos", "Guzman", "santos.guzman@plantsgetgreener.com", "PlantsGetGreener");

Customer customer395 = new Customer("Anabel", "Frazier", "anabel.frazier@flyerbuzzer.com", "FlyerBuzzer");

Customer customer396 = new Customer("Oswaldo", "Campos", "oswaldo.campos@sportastic.com", "Sportastic");

Customer customer397 = new Customer("Harley", "Woods", "harley.woods@sportastic.com", "Sportastic");

Customer customer398 = new Customer("Konner", "Greer", "konner.greer@sportastic.com", "Sportastic");

Customer customer399 = new Customer("Yair", "Flowers", "yair.flowers@sportastic.com", "Sportastic");

Customer customer400 = new Customer("Mira", "Washington", "mira.washington@carhouse.com", "CarHouse");

Customer customer401 = new Customer("Deegan", "Simpson", "deegan.simpson@sportastic.com", "Sportastic");

Customer customer402 = new Customer("Kamari", "Huang", "kamari.huang@carhouse.com", "CarHouse");

Customer customer403 = new Customer("Shawn", "Bird", "shawn.bird@flyerbuzzer.com", "FlyerBuzzer");

Customer customer404 = new Customer("Israel", "Meyers", "israel.meyers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer405 = new Customer("Dexter", "Wise", "dexter.wise@plantsgetgreener.com", "PlantsGetGreener");

Customer customer406 = new Customer("Jaylynn", "Oconnor", "jaylynn.oconnor@plantsgetgreener.com", "PlantsGetGreener");

Customer customer407 = new Customer("Jaxon", "Yoder", "jaxon.yoder@plantsgetgreener.com", "PlantsGetGreener");

Customer customer408 = new Customer("Lexie", "Ramos", "lexie.ramos@shop42.com", "Shop42");

Customer customer409 = new Customer("Erick", "Williams", "erick.williams@plantsgetgreener.com", "PlantsGetGreener");

Customer customer410 = new Customer("Casey", "English", "casey.english@flyerbuzzer.com", "FlyerBuzzer");

Customer customer411 = new Customer("Skyla", "Powell", "skyla.powell@plantsgetgreener.com", "PlantsGetGreener");

Customer customer412 = new Customer("Gabrielle", "Dodson", "gabrielle.dodson@carhouse.com", "CarHouse");

Customer customer413 = new Customer("Evie", "Liu", "evie.liu@plantsgetgreener.com", "PlantsGetGreener");

Customer customer414 = new Customer("Beau", "Chang", "beau.chang@carhouse.com", "CarHouse");

Customer customer415 = new Customer("Diego", "Barr", "diego.barr@sportastic.com", "Sportastic");

Customer customer416 = new Customer("Ashleigh", "Wagner", "ashleigh.wagner@flyerbuzzer.com", "FlyerBuzzer");

Customer customer417 = new Customer("Hannah", "Boone", "hannah.boone@plantsgetgreener.com", "PlantsGetGreener");

Customer customer418 = new Customer("Marianna", "Jacobson", "marianna.jacobson@sportastic.com", "Sportastic");

Customer customer419 = new Customer("Giana", "Pugh", "giana.pugh@carhouse.com", "CarHouse");

Customer customer420 = new Customer("Emelia", "Welch", "emelia.welch@shop42.com", "Shop42");

Customer customer421 = new Customer("Bennett", "Powers", "bennett.powers@sportastic.com", "Sportastic");

Customer customer422 = new Customer("Kierra", "Lee", "kierra.lee@plantsgetgreener.com", "PlantsGetGreener");

Customer customer423 = new Customer("Abbigail", "Delgado", "abbigail.delgado@flyerbuzzer.com", "FlyerBuzzer");

Customer customer424 = new Customer("Clark", "Cantrell", "clark.cantrell@shop42.com", "Shop42");

Customer customer425 = new Customer("Carolyn", "Rosario", "carolyn.rosario@carhouse.com", "CarHouse");

Customer customer426 = new Customer("Charles", "Garza", "charles.garza@flyerbuzzer.com", "FlyerBuzzer");

Customer customer427 = new Customer("Ricky", "Stuart", "ricky.stuart@shop42.com", "Shop42");

Customer customer428 = new Customer("Trey", "Mclean", "trey.mclean@shop42.com", "Shop42");

Customer customer429 = new Customer("Triston", "Cochran", "triston.cochran@shop42.com", "Shop42");

Customer customer430 = new Customer("Arabella", "Proctor", "arabella.proctor@flyerbuzzer.com", "FlyerBuzzer");

Customer customer431 = new Customer("Karson", "Melendez", "karson.melendez@carhouse.com", "CarHouse");

Customer customer432 = new Customer("Adelyn", "Rubio", "adelyn.rubio@carhouse.com", "CarHouse");

Customer customer433 = new Customer("Urijah", "Rogers", "urijah.rogers@sportastic.com", "Sportastic");

Customer customer434 = new Customer("Sean", "Manning", "sean.manning@plantsgetgreener.com", "PlantsGetGreener");

Customer customer435 = new Customer("Danny", "Sullivan", "danny.sullivan@plantsgetgreener.com", "PlantsGetGreener");

Customer customer436 = new Customer("Sullivan", "Owen", "sullivan.owen@plantsgetgreener.com", "PlantsGetGreener");

Customer customer437 = new Customer("Maximilian", "Monroe", "maximilian.monroe@shop42.com", "Shop42");

Customer customer438 = new Customer("Delaney", "Cooper", "delaney.cooper@sportastic.com", "Sportastic");

Customer customer439 = new Customer("Elena", "Boyer", "elena.boyer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer440 = new Customer("Maddox", "Davis", "maddox.davis@flyerbuzzer.com", "FlyerBuzzer");

Customer customer441 = new Customer("Bobby", "Reed", "bobby.reed@sportastic.com", "Sportastic");

Customer customer442 = new Customer("Matilda", "Kramer", "matilda.kramer@carhouse.com", "CarHouse");

Customer customer443 = new Customer("Landen", "Aguirre", "landen.aguirre@sportastic.com", "Sportastic");

Customer customer444 = new Customer("Sanai", "Elliott", "sanai.elliott@carhouse.com", "CarHouse");

Customer customer445 = new Customer("Braiden", "Bauer", "braiden.bauer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer446 = new Customer("Vivian", "Sampson", "vivian.sampson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer447 = new Customer("Sienna", "Dunn", "sienna.dunn@carhouse.com", "CarHouse");

Customer customer448 = new Customer("Justus", "Kaiser", "justus.kaiser@carhouse.com", "CarHouse");

Customer customer449 = new Customer("Jovanni", "Mayo", "jovanni.mayo@flyerbuzzer.com", "FlyerBuzzer");

Customer customer450 = new Customer("Maggie", "Price", "maggie.price@plantsgetgreener.com", "PlantsGetGreener");

Customer customer451 = new Customer("Trevon", "Terry", "trevon.terry@flyerbuzzer.com", "FlyerBuzzer");

Customer customer452 = new Customer("Brennen", "Hurst", "brennen.hurst@flyerbuzzer.com", "FlyerBuzzer");

Customer customer453 = new Customer("Yoselin", "Chambers", "yoselin.chambers@shop42.com", "Shop42");

Customer customer454 = new Customer("Jayleen", "Brock", "jayleen.brock@flyerbuzzer.com", "FlyerBuzzer");

Customer customer455 = new Customer("Kyan", "Holloway", "kyan.holloway@sportastic.com", "Sportastic");

Customer customer456 = new Customer("Jakobe", "Salas", "jakobe.salas@flyerbuzzer.com", "FlyerBuzzer");

Customer customer457 = new Customer("Maurice", "Chase", "maurice.chase@plantsgetgreener.com", "PlantsGetGreener");

Customer customer458 = new Customer("Zain", "Patrick", "zain.patrick@carhouse.com", "CarHouse");

Customer customer459 = new Customer("Darren", "Santiago", "darren.santiago@plantsgetgreener.com", "PlantsGetGreener");

Customer customer460 = new Customer("Kai", "Carney", "kai.carney@carhouse.com", "CarHouse");

Customer customer461 = new Customer("Makhi", "Schmitt", "makhi.schmitt@flyerbuzzer.com", "FlyerBuzzer");

Customer customer462 = new Customer("Bria", "Ayala", "bria.ayala@shop42.com", "Shop42");

Customer customer463 = new Customer("Veronica", "Wolf", "veronica.wolf@carhouse.com", "CarHouse");

Customer customer464 = new Customer("Asher", "Camacho", "asher.camacho@sportastic.com", "Sportastic");

Customer customer465 = new Customer("Madeline", "Molina", "madeline.molina@sportastic.com", "Sportastic");

Customer customer466 = new Customer("Nyla", "Hull", "nyla.hull@sportastic.com", "Sportastic");

Customer customer467 = new Customer("Jonathon", "Escobar", "jonathon.escobar@shop42.com", "Shop42");

Customer customer468 = new Customer("Yahir", "Roach", "yahir.roach@sportastic.com", "Sportastic");

Customer customer469 = new Customer("Finn", "Ross", "finn.ross@flyerbuzzer.com", "FlyerBuzzer");

Customer customer470 = new Customer("Corey", "Marsh", "corey.marsh@carhouse.com", "CarHouse");

Customer customer471 = new Customer("Jadyn", "Fox", "jadyn.fox@sportastic.com", "Sportastic");

Customer customer472 = new Customer("Billy", "Benson", "billy.benson@carhouse.com", "CarHouse");

Customer customer473 = new Customer("Mario", "Green", "mario.green@shop42.com", "Shop42");

Customer customer474 = new Customer("Skyler", "Potter", "skyler.potter@sportastic.com", "Sportastic");

Customer customer475 = new Customer("Todd", "Dudley", "todd.dudley@carhouse.com", "CarHouse");

Customer customer476 = new Customer("Adrianna", "Parker", "adrianna.parker@sportastic.com", "Sportastic");

Customer customer477 = new Customer("Brandon", "Acevedo", "brandon.acevedo@flyerbuzzer.com", "FlyerBuzzer");

Customer customer478 = new Customer("Killian", "Shea", "killian.shea@shop42.com", "Shop42");

Customer customer479 = new Customer("Katelyn", "Skinner", "katelyn.skinner@shop42.com", "Shop42");

Customer customer480 = new Customer("Leland", "Ayers", "leland.ayers@shop42.com", "Shop42");

Customer customer481 = new Customer("Jordin", "Garner", "jordin.garner@carhouse.com", "CarHouse");

Customer customer482 = new Customer("Rocco", "Franklin", "rocco.franklin@plantsgetgreener.com", "PlantsGetGreener");

Customer customer483 = new Customer("Jacey", "Haney", "jacey.haney@plantsgetgreener.com", "PlantsGetGreener");

Customer customer484 = new Customer("Zaire", "Keith", "zaire.keith@plantsgetgreener.com", "PlantsGetGreener");

Customer customer485 = new Customer("Annabella", "Hoover", "annabella.hoover@sportastic.com", "Sportastic");

Customer customer486 = new Customer("German", "Short", "german.short@shop42.com", "Shop42");

Customer customer487 = new Customer("Denise", "Odom", "denise.odom@flyerbuzzer.com", "FlyerBuzzer");

Customer customer488 = new Customer("Dayami", "Wall", "dayami.wall@shop42.com", "Shop42");

Customer customer489 = new Customer("Fletcher", "Ali", "fletcher.ali@shop42.com", "Shop42");

Customer customer490 = new Customer("Savion", "Zamora", "savion.zamora@sportastic.com", "Sportastic");

Customer customer491 = new Customer("Aspen", "Munoz", "aspen.munoz@sportastic.com", "Sportastic");

Customer customer492 = new Customer("Tristian", "Bowers", "tristian.bowers@carhouse.com", "CarHouse");

Customer customer493 = new Customer("Brian", "Sanchez", "brian.sanchez@shop42.com", "Shop42");

Customer customer494 = new Customer("Barrett", "Mack", "barrett.mack@flyerbuzzer.com", "FlyerBuzzer");

Customer customer495 = new Customer("Seamus", "Hogan", "seamus.hogan@sportastic.com", "Sportastic");

Customer customer496 = new Customer("Katie", "Jimenez", "katie.jimenez@carhouse.com", "CarHouse");

Customer customer497 = new Customer("Elijah", "Flores", "elijah.flores@carhouse.com", "CarHouse");

Customer customer498 = new Customer("Dashawn", "Mueller", "dashawn.mueller@plantsgetgreener.com", "PlantsGetGreener");

Customer customer499 = new Customer("Lorelei", "Shaw", "lorelei.shaw@sportastic.com", "Sportastic");

customer = customer499;

Ticket ticket0 = new Ticket("I want more detailed information.", Status.CLOSED, employee86, customer264,10);

date = 1483512116000l;

DataGenerator.setValueToField(ticket0, "creationDate", new Date(date));

ticketManager.add(ticket0);

Ticket ticket1 = new Ticket("I often see the time 11:11 or 12:34 on clocks.", Status.PROCESSED, employee232, customer453,6);

date = 1483036841000l;

DataGenerator.setValueToField(ticket1, "creationDate", new Date(date));

ticketManager.add(ticket1);

Ticket ticket2 = new Ticket("Sixty-Four comes asking for bread.", Status.PROCESSED, employee189, customer352,5);

date = 1483574619000l;

DataGenerator.setValueToField(ticket2, "creationDate", new Date(date));

ticketManager.add(ticket2);

Ticket ticket3 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee75, customer377,10);

date = 1483306969000l;

DataGenerator.setValueToField(ticket3, "creationDate", new Date(date));

ticketManager.add(ticket3);

Ticket ticket4 = new Ticket("I currently have 4 windows open up… and I don’t know why.", Status.SOLVED, employee240, customer396,6);

date = 1483102260000l;

DataGenerator.setValueToField(ticket4, "creationDate", new Date(date));

ticketManager.add(ticket4);

Ticket ticket5 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.WAITING_FOR_FEEDBACK, employee186, customer470,7);

date = 1483142505000l;

DataGenerator.setValueToField(ticket5, "creationDate", new Date(date));

ticketManager.add(ticket5);

Ticket ticket6 = new Ticket("Please wait outside of the house.", Status.RECORDED, employee82, customer370,0);

date = 1483473288000l;

DataGenerator.setValueToField(ticket6, "creationDate", new Date(date));

ticketManager.add(ticket6);

Ticket ticket7 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", Status.WAITING_FOR_FEEDBACK, employee74, customer472,10);

date = 1483375431000l;

DataGenerator.setValueToField(ticket7, "creationDate", new Date(date));

ticketManager.add(ticket7);

Ticket ticket8 = new Ticket("It was getting dark, and we weren’t there yet.", Status.PROCESSED, employee106, customer425,7);

date = 1483239362000l;

DataGenerator.setValueToField(ticket8, "creationDate", new Date(date));

ticketManager.add(ticket8);

Ticket ticket9 = new Ticket("I checked to make sure that he was still alive.", Status.SOLVED, employee207, customer293,2);

date = 1483140692000l;

DataGenerator.setValueToField(ticket9, "creationDate", new Date(date));

ticketManager.add(ticket9);

Ticket ticket10 = new Ticket("He ran out of money, so he had to stop playing poker.", Status.CLOSED, employee178, customer276,8);

date = 1483068557000l;

DataGenerator.setValueToField(ticket10, "creationDate", new Date(date));

ticketManager.add(ticket10);

Ticket ticket11 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.PROCESSED, employee244, customer291,9);

date = 1483116531000l;

DataGenerator.setValueToField(ticket11, "creationDate", new Date(date));

ticketManager.add(ticket11);

Ticket ticket12 = new Ticket("Hurry!", Status.RECORDED, employee146, customer255,4);

date = 1483531258000l;

DataGenerator.setValueToField(ticket12, "creationDate", new Date(date));

ticketManager.add(ticket12);

Ticket ticket13 = new Ticket("The river stole the gods.", Status.PROCESSED, employee39, customer271,10);

date = 1483403104000l;

DataGenerator.setValueToField(ticket13, "creationDate", new Date(date));

ticketManager.add(ticket13);

Ticket ticket14 = new Ticket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee33, customer384,4);

date = 1483614328000l;

DataGenerator.setValueToField(ticket14, "creationDate", new Date(date));

ticketManager.add(ticket14);

Ticket ticket15 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.SOLVED, employee5, customer426,4);

date = 1483060073000l;

DataGenerator.setValueToField(ticket15, "creationDate", new Date(date));

ticketManager.add(ticket15);

Ticket ticket16 = new Ticket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee221, customer429,6);

date = 1483299671000l;

DataGenerator.setValueToField(ticket16, "creationDate", new Date(date));

ticketManager.add(ticket16);

Ticket ticket17 = new Ticket("She advised him to come back at once.", Status.CLOSED, employee163, customer387,6);

date = 1483153118000l;

DataGenerator.setValueToField(ticket17, "creationDate", new Date(date));

ticketManager.add(ticket17);

Ticket ticket18 = new Ticket("The sky is clear. the stars are twinkling.", Status.RECORDED, employee87, customer340,0);

date = 1483019329000l;

DataGenerator.setValueToField(ticket18, "creationDate", new Date(date));

ticketManager.add(ticket18);

Ticket ticket19 = new Ticket("Cats are good pets, for they are clean and are not noisy.", Status.PROCESSED, employee243, customer250,2);

date = 1483366743000l;

DataGenerator.setValueToField(ticket19, "creationDate", new Date(date));

ticketManager.add(ticket19);

Ticket ticket20 = new Ticket("Rock music approaches at high velocity.", Status.RECORDED, employee216, customer290,10);

date = 1483615062000l;

DataGenerator.setValueToField(ticket20, "creationDate", new Date(date));

ticketManager.add(ticket20);

Ticket ticket21 = new Ticket("Is it free?", Status.WAITING_FOR_FEEDBACK, employee96, customer252,1);

date = 1483090158000l;

DataGenerator.setValueToField(ticket21, "creationDate", new Date(date));

ticketManager.add(ticket21);

Ticket ticket22 = new Ticket("I love eating toasted cheese and tuna sandwiches.", Status.RECORDED, employee221, customer368,10);

date = 1483178810000l;

DataGenerator.setValueToField(ticket22, "creationDate", new Date(date));

ticketManager.add(ticket22);

Ticket ticket23 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.SOLVED, employee248, customer297,1);

date = 1483597414000l;

DataGenerator.setValueToField(ticket23, "creationDate", new Date(date));

ticketManager.add(ticket23);

Ticket ticket24 = new Ticket("The lake is a long way from here.", Status.SOLVED, employee165, customer297,5);

date = 1483334444000l;

DataGenerator.setValueToField(ticket24, "creationDate", new Date(date));

ticketManager.add(ticket24);

Ticket ticket25 = new Ticket("The stranger officiates the meal.", Status.CLOSED, employee76, customer498,3);

date = 1483098710000l;

DataGenerator.setValueToField(ticket25, "creationDate", new Date(date));

ticketManager.add(ticket25);

Ticket ticket26 = new Ticket("We need to rent a room for our party.", Status.CLOSED, employee164, customer384,6);

date = 1483582433000l;

DataGenerator.setValueToField(ticket26, "creationDate", new Date(date));

ticketManager.add(ticket26);

Ticket ticket27 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.PROCESSED, employee205, customer489,3);

date = 1483160126000l;

DataGenerator.setValueToField(ticket27, "creationDate", new Date(date));

ticketManager.add(ticket27);

Ticket ticket28 = new Ticket("I think I will buy the red car, or I will lease the blue one.", Status.WAITING_FOR_FEEDBACK, employee150, customer359,7);

date = 1483224746000l;

DataGenerator.setValueToField(ticket28, "creationDate", new Date(date));

ticketManager.add(ticket28);

Ticket ticket29 = new Ticket("She advised him to come back at once.", Status.CLOSED, employee12, customer302,9);

date = 1483553150000l;

DataGenerator.setValueToField(ticket29, "creationDate", new Date(date));

ticketManager.add(ticket29);

Ticket ticket30 = new Ticket("She was too short to see over the fence.", Status.WAITING_FOR_FEEDBACK, employee18, customer480,10);

date = 1483352324000l;

DataGenerator.setValueToField(ticket30, "creationDate", new Date(date));

ticketManager.add(ticket30);

Ticket ticket31 = new Ticket("He said he was not there yesterday. however, many people saw him there.", Status.RECORDED, employee84, customer403,9);

date = 1483612732000l;

DataGenerator.setValueToField(ticket31, "creationDate", new Date(date));

ticketManager.add(ticket31);

Ticket ticket32 = new Ticket("She only paints with bold colors. she does not like pastels.", Status.PROCESSED, employee12, customer497,1);

date = 1483228354000l;

DataGenerator.setValueToField(ticket32, "creationDate", new Date(date));

ticketManager.add(ticket32);

Ticket ticket33 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.SOLVED, employee189, customer413,4);

date = 1483243321000l;

DataGenerator.setValueToField(ticket33, "creationDate", new Date(date));

ticketManager.add(ticket33);

Ticket ticket34 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee146, customer475,2);

date = 1483084922000l;

DataGenerator.setValueToField(ticket34, "creationDate", new Date(date));

ticketManager.add(ticket34);

Ticket ticket35 = new Ticket("We have a lot of rain in June.", Status.CLOSED, employee79, customer260,2);

date = 1483472508000l;

DataGenerator.setValueToField(ticket35, "creationDate", new Date(date));

ticketManager.add(ticket35);

Ticket ticket36 = new Ticket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.CLOSED, employee147, customer375,2);

date = 1483217493000l;

DataGenerator.setValueToField(ticket36, "creationDate", new Date(date));

ticketManager.add(ticket36);

Ticket ticket37 = new Ticket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee123, customer331,7);

date = 1483130786000l;

DataGenerator.setValueToField(ticket37, "creationDate", new Date(date));

ticketManager.add(ticket37);

Ticket ticket38 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.RECORDED, employee137, customer288,2);

date = 1483190421000l;

DataGenerator.setValueToField(ticket38, "creationDate", new Date(date));

ticketManager.add(ticket38);

Ticket ticket39 = new Ticket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee75, customer256,8);

date = 1483186819000l;

DataGenerator.setValueToField(ticket39, "creationDate", new Date(date));

ticketManager.add(ticket39);

Ticket ticket40 = new Ticket("Everyone was busy, so I went to the movie alone.", Status.WAITING_FOR_FEEDBACK, employee124, customer402,8);

date = 1483217156000l;

DataGenerator.setValueToField(ticket40, "creationDate", new Date(date));

ticketManager.add(ticket40);

Ticket ticket41 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.SOLVED, employee15, customer271,0);

date = 1483539573000l;

DataGenerator.setValueToField(ticket41, "creationDate", new Date(date));

ticketManager.add(ticket41);

Ticket ticket42 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.WAITING_FOR_FEEDBACK, employee82, customer322,6);

date = 1483309843000l;

DataGenerator.setValueToField(ticket42, "creationDate", new Date(date));

ticketManager.add(ticket42);

Ticket ticket43 = new Ticket("I think I will buy the red car, or I will lease the blue one.", Status.SOLVED, employee182, customer371,7);

date = 1483480806000l;

DataGenerator.setValueToField(ticket43, "creationDate", new Date(date));

ticketManager.add(ticket43);

Ticket ticket44 = new Ticket("The old apple revels in its authority.", Status.CLOSED, employee45, customer269,8);

date = 1483222911000l;

DataGenerator.setValueToField(ticket44, "creationDate", new Date(date));

ticketManager.add(ticket44);

Ticket ticket45 = new Ticket("Cats are good pets, for they are clean and are not noisy.", Status.CLOSED, employee125, customer336,7);

date = 1483072867000l;

DataGenerator.setValueToField(ticket45, "creationDate", new Date(date));

ticketManager.add(ticket45);

Ticket ticket46 = new Ticket("I want to buy a onesie… but know it won’t suit me.", Status.PROCESSED, employee157, customer365,4);

date = 1483081349000l;

DataGenerator.setValueToField(ticket46, "creationDate", new Date(date));

ticketManager.add(ticket46);

Ticket ticket47 = new Ticket("Wow, does that work?", Status.CLOSED, employee230, customer471,6);

date = 1483170550000l;

DataGenerator.setValueToField(ticket47, "creationDate", new Date(date));

ticketManager.add(ticket47);

Ticket ticket48 = new Ticket("They got there early, and they got really good seats.", Status.CLOSED, employee166, customer295,4);

date = 1483113056000l;

DataGenerator.setValueToField(ticket48, "creationDate", new Date(date));

ticketManager.add(ticket48);

Ticket ticket49 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.SOLVED, employee202, customer271,8);

date = 1483504912000l;

DataGenerator.setValueToField(ticket49, "creationDate", new Date(date));

ticketManager.add(ticket49);

Ticket ticket50 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.PROCESSED, employee5, customer299,5);

date = 1483518994000l;

DataGenerator.setValueToField(ticket50, "creationDate", new Date(date));

ticketManager.add(ticket50);

Ticket ticket51 = new Ticket("Abstraction is often one floor above you.", Status.CLOSED, employee21, customer379,1);

date = 1483484364000l;

DataGenerator.setValueToField(ticket51, "creationDate", new Date(date));

ticketManager.add(ticket51);

Ticket ticket52 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.CLOSED, employee141, customer425,2);

date = 1483227007000l;

DataGenerator.setValueToField(ticket52, "creationDate", new Date(date));

ticketManager.add(ticket52);

Ticket ticket53 = new Ticket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.WAITING_FOR_FEEDBACK, employee170, customer259,7);

date = 1483354142000l;

DataGenerator.setValueToField(ticket53, "creationDate", new Date(date));

ticketManager.add(ticket53);

Ticket ticket54 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", Status.PROCESSED, employee111, customer437,6);

date = 1483495674000l;

DataGenerator.setValueToField(ticket54, "creationDate", new Date(date));

ticketManager.add(ticket54);

Ticket ticket55 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.CLOSED, employee91, customer431,8);

date = 1483370917000l;

DataGenerator.setValueToField(ticket55, "creationDate", new Date(date));

ticketManager.add(ticket55);

Ticket ticket56 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.CLOSED, employee214, customer343,2);

date = 1483150650000l;

DataGenerator.setValueToField(ticket56, "creationDate", new Date(date));

ticketManager.add(ticket56);

Ticket ticket57 = new Ticket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.PROCESSED, employee97, customer448,1);

date = 1483180318000l;

DataGenerator.setValueToField(ticket57, "creationDate", new Date(date));

ticketManager.add(ticket57);

Ticket ticket58 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.CLOSED, employee117, customer314,7);

date = 1483343145000l;

DataGenerator.setValueToField(ticket58, "creationDate", new Date(date));

ticketManager.add(ticket58);

Ticket ticket59 = new Ticket("Abstraction is often one floor above you.", Status.CLOSED, employee197, customer262,2);

date = 1483345452000l;

DataGenerator.setValueToField(ticket59, "creationDate", new Date(date));

ticketManager.add(ticket59);

Ticket ticket60 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", Status.WAITING_FOR_FEEDBACK, employee74, customer332,1);

date = 1483303354000l;

DataGenerator.setValueToField(ticket60, "creationDate", new Date(date));

ticketManager.add(ticket60);

Ticket ticket61 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.CLOSED, employee80, customer412,1);

date = 1483587886000l;

DataGenerator.setValueToField(ticket61, "creationDate", new Date(date));

ticketManager.add(ticket61);

Ticket ticket62 = new Ticket("We have a lot of rain in June.", Status.PROCESSED, employee78, customer335,3);

date = 1483048356000l;

DataGenerator.setValueToField(ticket62, "creationDate", new Date(date));

ticketManager.add(ticket62);

Ticket ticket63 = new Ticket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.CLOSED, employee196, customer464,8);

date = 1483549834000l;

DataGenerator.setValueToField(ticket63, "creationDate", new Date(date));

ticketManager.add(ticket63);

Ticket ticket64 = new Ticket("He said he was not there yesterday. however, many people saw him there.", Status.CLOSED, employee219, customer258,0);

date = 1483480728000l;

DataGenerator.setValueToField(ticket64, "creationDate", new Date(date));

ticketManager.add(ticket64);

Ticket ticket65 = new Ticket("Everyone was busy, so I went to the movie alone.", Status.CLOSED, employee210, customer330,2);

date = 1483315519000l;

DataGenerator.setValueToField(ticket65, "creationDate", new Date(date));

ticketManager.add(ticket65);

Ticket ticket66 = new Ticket("I checked to make sure that he was still alive.", Status.SOLVED, employee77, customer261,10);

date = 1483375316000l;

DataGenerator.setValueToField(ticket66, "creationDate", new Date(date));

ticketManager.add(ticket66);

Ticket ticket67 = new Ticket("The book is in front of the table.", Status.WAITING_FOR_FEEDBACK, employee230, customer277,1);

date = 1483361238000l;

DataGenerator.setValueToField(ticket67, "creationDate", new Date(date));

ticketManager.add(ticket67);

Ticket ticket68 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.CLOSED, employee80, customer316,3);

date = 1483123546000l;

DataGenerator.setValueToField(ticket68, "creationDate", new Date(date));

ticketManager.add(ticket68);

Ticket ticket69 = new Ticket("Sixty-Four comes asking for bread.", Status.CLOSED, employee183, customer438,10);

date = 1483579973000l;

DataGenerator.setValueToField(ticket69, "creationDate", new Date(date));

ticketManager.add(ticket69);

Ticket ticket70 = new Ticket("Check back tomorrow. I will see if the book has arrived.", Status.WAITING_FOR_FEEDBACK, employee169, customer361,9);

date = 1483132527000l;

DataGenerator.setValueToField(ticket70, "creationDate", new Date(date));

ticketManager.add(ticket70);

Ticket ticket71 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.SOLVED, employee145, customer335,10);

date = 1483470944000l;

DataGenerator.setValueToField(ticket71, "creationDate", new Date(date));

ticketManager.add(ticket71);

Ticket ticket72 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.PROCESSED, employee136, customer329,3);

date = 1483019227000l;

DataGenerator.setValueToField(ticket72, "creationDate", new Date(date));

ticketManager.add(ticket72);

Ticket ticket73 = new Ticket("The quick brown fox jumps over the lazy dog.", Status.RECORDED, employee180, customer355,2);

date = 1483417186000l;

DataGenerator.setValueToField(ticket73, "creationDate", new Date(date));

ticketManager.add(ticket73);

Ticket ticket74 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", Status.CLOSED, employee1, customer323,8);

date = 1483564836000l;

DataGenerator.setValueToField(ticket74, "creationDate", new Date(date));

ticketManager.add(ticket74);

Ticket ticket75 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.CLOSED, employee33, customer307,2);

date = 1483493419000l;

DataGenerator.setValueToField(ticket75, "creationDate", new Date(date));

ticketManager.add(ticket75);

Ticket ticket76 = new Ticket("Is it free?", Status.PROCESSED, employee203, customer377,6);

date = 1483338231000l;

DataGenerator.setValueToField(ticket76, "creationDate", new Date(date));

ticketManager.add(ticket76);

Ticket ticket77 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.RECORDED, employee30, customer397,7);

date = 1483581710000l;

DataGenerator.setValueToField(ticket77, "creationDate", new Date(date));

ticketManager.add(ticket77);

Ticket ticket78 = new Ticket("Cats are good pets, for they are clean and are not noisy.", Status.WAITING_FOR_FEEDBACK, employee236, customer366,3);

date = 1483507363000l;

DataGenerator.setValueToField(ticket78, "creationDate", new Date(date));

ticketManager.add(ticket78);

Ticket ticket79 = new Ticket("I hear that Nancy is very pretty.", Status.SOLVED, employee202, customer498,4);

date = 1483023065000l;

DataGenerator.setValueToField(ticket79, "creationDate", new Date(date));

ticketManager.add(ticket79);

Ticket ticket80 = new Ticket("She folded her handkerchief neatly.", Status.RECORDED, employee36, customer397,6);

date = 1483090812000l;

DataGenerator.setValueToField(ticket80, "creationDate", new Date(date));

ticketManager.add(ticket80);

Ticket ticket81 = new Ticket("The sky is clear. the stars are twinkling.", Status.PROCESSED, employee58, customer326,5);

date = 1483578517000l;

DataGenerator.setValueToField(ticket81, "creationDate", new Date(date));

ticketManager.add(ticket81);

Ticket ticket82 = new Ticket("We need to rent a room for our party.", Status.SOLVED, employee125, customer366,5);

date = 1483027203000l;

DataGenerator.setValueToField(ticket82, "creationDate", new Date(date));

ticketManager.add(ticket82);

Ticket ticket83 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.SOLVED, employee212, customer308,0);

date = 1483532737000l;

DataGenerator.setValueToField(ticket83, "creationDate", new Date(date));

ticketManager.add(ticket83);

Ticket ticket84 = new Ticket("Don't step on the broken glass.", Status.RECORDED, employee222, customer329,5);

date = 1483082556000l;

DataGenerator.setValueToField(ticket84, "creationDate", new Date(date));

ticketManager.add(ticket84);

Ticket ticket85 = new Ticket("Tom got a small piece of pie.", Status.SOLVED, employee160, customer252,9);

date = 1483590719000l;

DataGenerator.setValueToField(ticket85, "creationDate", new Date(date));

ticketManager.add(ticket85);

Ticket ticket86 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.RECORDED, employee142, customer490,4);

date = 1483599022000l;

DataGenerator.setValueToField(ticket86, "creationDate", new Date(date));

ticketManager.add(ticket86);

Ticket ticket87 = new Ticket("The waves were crashing on the shore. it was a lovely sight.", Status.WAITING_FOR_FEEDBACK, employee29, customer369,1);

date = 1483404612000l;

DataGenerator.setValueToField(ticket87, "creationDate", new Date(date));

ticketManager.add(ticket87);

Ticket ticket88 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", Status.SOLVED, employee134, customer345,0);

date = 1483132874000l;

DataGenerator.setValueToField(ticket88, "creationDate", new Date(date));

ticketManager.add(ticket88);

Ticket ticket89 = new Ticket("She folded her handkerchief neatly.", Status.RECORDED, employee212, customer424,1);

date = 1483029899000l;

DataGenerator.setValueToField(ticket89, "creationDate", new Date(date));

ticketManager.add(ticket89);

Ticket ticket90 = new Ticket("Abstraction is often one floor above you.", Status.PROCESSED, employee224, customer493,6);

date = 1483537498000l;

DataGenerator.setValueToField(ticket90, "creationDate", new Date(date));

ticketManager.add(ticket90);

Ticket ticket91 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.SOLVED, employee20, customer463,10);

date = 1483540507000l;

DataGenerator.setValueToField(ticket91, "creationDate", new Date(date));

ticketManager.add(ticket91);

Ticket ticket92 = new Ticket("Tom got a small piece of pie.", Status.WAITING_FOR_FEEDBACK, employee13, customer319,5);

date = 1483107224000l;

DataGenerator.setValueToField(ticket92, "creationDate", new Date(date));

ticketManager.add(ticket92);

Ticket ticket93 = new Ticket("He said he was not there yesterday. however, many people saw him there.", Status.WAITING_FOR_FEEDBACK, employee24, customer420,5);

date = 1483095117000l;

DataGenerator.setValueToField(ticket93, "creationDate", new Date(date));

ticketManager.add(ticket93);

Ticket ticket94 = new Ticket("The shooter says goodbye to his love.", Status.SOLVED, employee225, customer326,6);

date = 1483163807000l;

DataGenerator.setValueToField(ticket94, "creationDate", new Date(date));

ticketManager.add(ticket94);

Ticket ticket95 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.WAITING_FOR_FEEDBACK, employee10, customer342,4);

date = 1483130716000l;

DataGenerator.setValueToField(ticket95, "creationDate", new Date(date));

ticketManager.add(ticket95);

Ticket ticket96 = new Ticket("We have never been to Asia, nor have we visited Africa.", Status.PROCESSED, employee199, customer474,2);

date = 1483181771000l;

DataGenerator.setValueToField(ticket96, "creationDate", new Date(date));

ticketManager.add(ticket96);

Ticket ticket97 = new Ticket("She was too short to see over the fence.", Status.SOLVED, employee155, customer262,6);

date = 1483023070000l;

DataGenerator.setValueToField(ticket97, "creationDate", new Date(date));

ticketManager.add(ticket97);

Ticket ticket98 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", Status.SOLVED, employee130, customer499,2);

date = 1483604345000l;

DataGenerator.setValueToField(ticket98, "creationDate", new Date(date));

ticketManager.add(ticket98);

Ticket ticket99 = new Ticket("Two seats were vacant.", Status.CLOSED, employee92, customer351,2);

date = 1483192198000l;

DataGenerator.setValueToField(ticket99, "creationDate", new Date(date));

ticketManager.add(ticket99);

Ticket ticket100 = new Ticket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee37, customer308,5);

date = 1483050736000l;

DataGenerator.setValueToField(ticket100, "creationDate", new Date(date));

ticketManager.add(ticket100);

Ticket ticket101 = new Ticket("I am never at home on Sundays.", Status.PROCESSED, employee14, customer356,9);

date = 1483570635000l;

DataGenerator.setValueToField(ticket101, "creationDate", new Date(date));

ticketManager.add(ticket101);

Ticket ticket102 = new Ticket("Wow, does that work?", Status.RECORDED, employee189, customer268,2);

date = 1483592692000l;

DataGenerator.setValueToField(ticket102, "creationDate", new Date(date));

ticketManager.add(ticket102);

Ticket ticket103 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.PROCESSED, employee120, customer275,1);

date = 1483234194000l;

DataGenerator.setValueToField(ticket103, "creationDate", new Date(date));

ticketManager.add(ticket103);

Ticket ticket104 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.RECORDED, employee164, customer486,8);

date = 1483375798000l;

DataGenerator.setValueToField(ticket104, "creationDate", new Date(date));

ticketManager.add(ticket104);

Ticket ticket105 = new Ticket("Everyone was busy, so I went to the movie alone.", Status.SOLVED, employee112, customer395,9);

date = 1483106624000l;

DataGenerator.setValueToField(ticket105, "creationDate", new Date(date));

ticketManager.add(ticket105);

Ticket ticket106 = new Ticket("Please wait outside of the house.", Status.CLOSED, employee163, customer399,7);

date = 1483391929000l;

DataGenerator.setValueToField(ticket106, "creationDate", new Date(date));

ticketManager.add(ticket106);

Ticket ticket107 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.PROCESSED, employee224, customer402,8);

date = 1483318933000l;

DataGenerator.setValueToField(ticket107, "creationDate", new Date(date));

ticketManager.add(ticket107);

Ticket ticket108 = new Ticket("Christmas is coming.", Status.WAITING_FOR_FEEDBACK, employee61, customer486,7);

date = 1483596667000l;

DataGenerator.setValueToField(ticket108, "creationDate", new Date(date));

ticketManager.add(ticket108);

Ticket ticket109 = new Ticket("The body may perhaps compensates for the loss of a true metaphysics.", Status.PROCESSED, employee156, customer292,0);

date = 1483238195000l;

DataGenerator.setValueToField(ticket109, "creationDate", new Date(date));

ticketManager.add(ticket109);

Ticket ticket110 = new Ticket("The body may perhaps compensates for the loss of a true metaphysics.", Status.CLOSED, employee22, customer254,3);

date = 1483192156000l;

DataGenerator.setValueToField(ticket110, "creationDate", new Date(date));

ticketManager.add(ticket110);

Ticket ticket111 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee32, customer292,2);

date = 1483151954000l;

DataGenerator.setValueToField(ticket111, "creationDate", new Date(date));

ticketManager.add(ticket111);

Ticket ticket112 = new Ticket("The lake is a long way from here.", Status.SOLVED, employee60, customer442,9);

date = 1483455335000l;

DataGenerator.setValueToField(ticket112, "creationDate", new Date(date));

ticketManager.add(ticket112);

Ticket ticket113 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.WAITING_FOR_FEEDBACK, employee36, customer288,7);

date = 1483518048000l;

DataGenerator.setValueToField(ticket113, "creationDate", new Date(date));

ticketManager.add(ticket113);

Ticket ticket114 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.PROCESSED, employee77, customer489,7);

date = 1483205500000l;

DataGenerator.setValueToField(ticket114, "creationDate", new Date(date));

ticketManager.add(ticket114);

Ticket ticket115 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", Status.SOLVED, employee240, customer480,9);

date = 1483217072000l;

DataGenerator.setValueToField(ticket115, "creationDate", new Date(date));

ticketManager.add(ticket115);

Ticket ticket116 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee188, customer266,4);

date = 1483243223000l;

DataGenerator.setValueToField(ticket116, "creationDate", new Date(date));

ticketManager.add(ticket116);

Ticket ticket117 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.PROCESSED, employee95, customer414,3);

date = 1483219384000l;

DataGenerator.setValueToField(ticket117, "creationDate", new Date(date));

ticketManager.add(ticket117);

Ticket ticket118 = new Ticket("He told us a very exciting adventure story.", Status.SOLVED, employee153, customer274,4);

date = 1483152499000l;

DataGenerator.setValueToField(ticket118, "creationDate", new Date(date));

ticketManager.add(ticket118);

Ticket ticket119 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.SOLVED, employee28, customer271,1);

date = 1483034017000l;

DataGenerator.setValueToField(ticket119, "creationDate", new Date(date));

ticketManager.add(ticket119);

Ticket ticket120 = new Ticket("Two seats were vacant.", Status.SOLVED, employee138, customer293,9);

date = 1483370693000l;

DataGenerator.setValueToField(ticket120, "creationDate", new Date(date));

ticketManager.add(ticket120);

Ticket ticket121 = new Ticket("Lets all be unique together until we realise we are all the same.", Status.PROCESSED, employee107, customer381,5);

date = 1483465713000l;

DataGenerator.setValueToField(ticket121, "creationDate", new Date(date));

ticketManager.add(ticket121);

Ticket ticket122 = new Ticket("Lets all be unique together until we realise we are all the same.", Status.SOLVED, employee38, customer494,3);

date = 1483101557000l;

DataGenerator.setValueToField(ticket122, "creationDate", new Date(date));

ticketManager.add(ticket122);

Ticket ticket123 = new Ticket("Let me help you with your baggage.", Status.PROCESSED, employee59, customer484,2);

date = 1483047464000l;

DataGenerator.setValueToField(ticket123, "creationDate", new Date(date));

ticketManager.add(ticket123);

Ticket ticket124 = new Ticket("Rock music approaches at high velocity.", Status.RECORDED, employee178, customer469,7);

date = 1483117095000l;

DataGenerator.setValueToField(ticket124, "creationDate", new Date(date));

ticketManager.add(ticket124);

Ticket ticket125 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee49, customer458,5);

date = 1483048797000l;

DataGenerator.setValueToField(ticket125, "creationDate", new Date(date));

ticketManager.add(ticket125);

Ticket ticket126 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.RECORDED, employee245, customer419,6);

date = 1483171602000l;

DataGenerator.setValueToField(ticket126, "creationDate", new Date(date));

ticketManager.add(ticket126);

Ticket ticket127 = new Ticket("It was getting dark, and we weren’t there yet.", Status.CLOSED, employee198, customer263,2);

date = 1483432659000l;

DataGenerator.setValueToField(ticket127, "creationDate", new Date(date));

ticketManager.add(ticket127);

Ticket ticket128 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.RECORDED, employee91, customer482,6);

date = 1483347946000l;

DataGenerator.setValueToField(ticket128, "creationDate", new Date(date));

ticketManager.add(ticket128);

Ticket ticket129 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.CLOSED, employee2, customer459,1);

date = 1483355220000l;

DataGenerator.setValueToField(ticket129, "creationDate", new Date(date));

ticketManager.add(ticket129);

Ticket ticket130 = new Ticket("We have never been to Asia, nor have we visited Africa.", Status.WAITING_FOR_FEEDBACK, employee149, customer391,6);

date = 1483314112000l;

DataGenerator.setValueToField(ticket130, "creationDate", new Date(date));

ticketManager.add(ticket130);

Ticket ticket131 = new Ticket("Mary plays the piano.", Status.CLOSED, employee146, customer275,0);

date = 1483606394000l;

DataGenerator.setValueToField(ticket131, "creationDate", new Date(date));

ticketManager.add(ticket131);

Ticket ticket132 = new Ticket("He ran out of money, so he had to stop playing poker.", Status.CLOSED, employee129, customer402,3);

date = 1483303254000l;

DataGenerator.setValueToField(ticket132, "creationDate", new Date(date));

ticketManager.add(ticket132);

Ticket ticket133 = new Ticket("He told us a very exciting adventure story.", Status.SOLVED, employee188, customer433,1);

date = 1483406844000l;

DataGenerator.setValueToField(ticket133, "creationDate", new Date(date));

ticketManager.add(ticket133);

Ticket ticket134 = new Ticket("The mysterious diary records the voice.", Status.PROCESSED, employee55, customer279,8);

date = 1483482499000l;

DataGenerator.setValueToField(ticket134, "creationDate", new Date(date));

ticketManager.add(ticket134);

Ticket ticket135 = new Ticket("Is it free?", Status.SOLVED, employee18, customer466,1);

date = 1483252258000l;

DataGenerator.setValueToField(ticket135, "creationDate", new Date(date));

ticketManager.add(ticket135);

Ticket ticket136 = new Ticket("The lake is a long way from here.", Status.RECORDED, employee9, customer345,7);

date = 1483388528000l;

DataGenerator.setValueToField(ticket136, "creationDate", new Date(date));

ticketManager.add(ticket136);

Ticket ticket137 = new Ticket("Is it free?", Status.CLOSED, employee90, customer282,5);

date = 1483135314000l;

DataGenerator.setValueToField(ticket137, "creationDate", new Date(date));

ticketManager.add(ticket137);

Ticket ticket138 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.SOLVED, employee83, customer251,9);

date = 1483362467000l;

DataGenerator.setValueToField(ticket138, "creationDate", new Date(date));

ticketManager.add(ticket138);

Ticket ticket139 = new Ticket("We need to rent a room for our party.", Status.WAITING_FOR_FEEDBACK, employee152, customer455,1);

date = 1483233243000l;

DataGenerator.setValueToField(ticket139, "creationDate", new Date(date));

ticketManager.add(ticket139);

Ticket ticket140 = new Ticket("The lake is a long way from here.", Status.PROCESSED, employee128, customer318,7);

date = 1483116225000l;

DataGenerator.setValueToField(ticket140, "creationDate", new Date(date));

ticketManager.add(ticket140);

Ticket ticket141 = new Ticket("Lets all be unique together until we realise we are all the same.", Status.CLOSED, employee170, customer420,0);

date = 1483293874000l;

DataGenerator.setValueToField(ticket141, "creationDate", new Date(date));

ticketManager.add(ticket141);

Ticket ticket142 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", Status.CLOSED, employee243, customer478,2);

date = 1483322237000l;

DataGenerator.setValueToField(ticket142, "creationDate", new Date(date));

ticketManager.add(ticket142);

Ticket ticket143 = new Ticket("I currently have 4 windows open up… and I don’t know why.", Status.SOLVED, employee34, customer334,4);

date = 1483038404000l;

DataGenerator.setValueToField(ticket143, "creationDate", new Date(date));

ticketManager.add(ticket143);

Ticket ticket144 = new Ticket("She advised him to come back at once.", Status.PROCESSED, employee62, customer280,6);

date = 1483459636000l;

DataGenerator.setValueToField(ticket144, "creationDate", new Date(date));

ticketManager.add(ticket144);

Ticket ticket145 = new Ticket("The book is in front of the table.", Status.CLOSED, employee75, customer475,0);

date = 1483086793000l;

DataGenerator.setValueToField(ticket145, "creationDate", new Date(date));

ticketManager.add(ticket145);

Ticket ticket146 = new Ticket("Tom got a small piece of pie.", Status.CLOSED, employee191, customer465,6);

date = 1483030809000l;

DataGenerator.setValueToField(ticket146, "creationDate", new Date(date));

ticketManager.add(ticket146);

Ticket ticket147 = new Ticket("The river stole the gods.", Status.WAITING_FOR_FEEDBACK, employee175, customer310,5);

date = 1483319270000l;

DataGenerator.setValueToField(ticket147, "creationDate", new Date(date));

ticketManager.add(ticket147);

Ticket ticket148 = new Ticket("Abstraction is often one floor above you.", Status.CLOSED, employee52, customer286,6);

date = 1483099253000l;

DataGenerator.setValueToField(ticket148, "creationDate", new Date(date));

ticketManager.add(ticket148);

Ticket ticket149 = new Ticket("Mary plays the piano.", Status.CLOSED, employee28, customer458,0);

date = 1483581842000l;

DataGenerator.setValueToField(ticket149, "creationDate", new Date(date));

ticketManager.add(ticket149);

Ticket ticket150 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee77, customer260,5);

date = 1483478390000l;

DataGenerator.setValueToField(ticket150, "creationDate", new Date(date));

ticketManager.add(ticket150);

Ticket ticket151 = new Ticket("The lake is a long way from here.", Status.RECORDED, employee12, customer297,1);

date = 1483287872000l;

DataGenerator.setValueToField(ticket151, "creationDate", new Date(date));

ticketManager.add(ticket151);

Ticket ticket152 = new Ticket("Cats are good pets, for they are clean and are not noisy.", Status.SOLVED, employee182, customer443,6);

date = 1483198687000l;

DataGenerator.setValueToField(ticket152, "creationDate", new Date(date));

ticketManager.add(ticket152);

Ticket ticket153 = new Ticket("The body may perhaps compensates for the loss of a true metaphysics.", Status.RECORDED, employee75, customer309,3);

date = 1483605776000l;

DataGenerator.setValueToField(ticket153, "creationDate", new Date(date));

ticketManager.add(ticket153);

Ticket ticket154 = new Ticket("Christmas is coming.", Status.WAITING_FOR_FEEDBACK, employee84, customer406,8);

date = 1483600694000l;

DataGenerator.setValueToField(ticket154, "creationDate", new Date(date));

ticketManager.add(ticket154);

Ticket ticket155 = new Ticket("Tom got a small piece of pie.", Status.PROCESSED, employee135, customer262,1);

date = 1483263942000l;

DataGenerator.setValueToField(ticket155, "creationDate", new Date(date));

ticketManager.add(ticket155);

Ticket ticket156 = new Ticket("Sixty-Four comes asking for bread.", Status.WAITING_FOR_FEEDBACK, employee225, customer344,6);

date = 1483570741000l;

DataGenerator.setValueToField(ticket156, "creationDate", new Date(date));

ticketManager.add(ticket156);

Ticket ticket157 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.SOLVED, employee203, customer389,10);

date = 1483122578000l;

DataGenerator.setValueToField(ticket157, "creationDate", new Date(date));

ticketManager.add(ticket157);

Ticket ticket158 = new Ticket("She folded her handkerchief neatly.", Status.RECORDED, employee71, customer364,4);

date = 1483059452000l;

DataGenerator.setValueToField(ticket158, "creationDate", new Date(date));

ticketManager.add(ticket158);

Ticket ticket159 = new Ticket("The stranger officiates the meal.", Status.CLOSED, employee213, customer402,7);

date = 1483563863000l;

DataGenerator.setValueToField(ticket159, "creationDate", new Date(date));

ticketManager.add(ticket159);

Ticket ticket160 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.PROCESSED, employee144, customer467,3);

date = 1483435066000l;

DataGenerator.setValueToField(ticket160, "creationDate", new Date(date));

ticketManager.add(ticket160);

Ticket ticket161 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", Status.RECORDED, employee144, customer480,6);

date = 1483384494000l;

DataGenerator.setValueToField(ticket161, "creationDate", new Date(date));

ticketManager.add(ticket161);

Ticket ticket162 = new Ticket("He told us a very exciting adventure story.", Status.SOLVED, employee195, customer446,1);

date = 1483108904000l;

DataGenerator.setValueToField(ticket162, "creationDate", new Date(date));

ticketManager.add(ticket162);

Ticket ticket163 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.CLOSED, employee245, customer386,0);

date = 1483496165000l;

DataGenerator.setValueToField(ticket163, "creationDate", new Date(date));

ticketManager.add(ticket163);

Ticket ticket164 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee99, customer445,7);

date = 1483487766000l;

DataGenerator.setValueToField(ticket164, "creationDate", new Date(date));

ticketManager.add(ticket164);

Ticket ticket165 = new Ticket("Abstraction is often one floor above you.", Status.PROCESSED, employee236, customer408,7);

date = 1483437606000l;

DataGenerator.setValueToField(ticket165, "creationDate", new Date(date));

ticketManager.add(ticket165);

Ticket ticket166 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.PROCESSED, employee61, customer426,10);

date = 1483359658000l;

DataGenerator.setValueToField(ticket166, "creationDate", new Date(date));

ticketManager.add(ticket166);

Ticket ticket167 = new Ticket("She folded her handkerchief neatly.", Status.RECORDED, employee147, customer471,2);

date = 1483506775000l;

DataGenerator.setValueToField(ticket167, "creationDate", new Date(date));

ticketManager.add(ticket167);

Ticket ticket168 = new Ticket("This is a Japanese doll.", Status.WAITING_FOR_FEEDBACK, employee6, customer422,5);

date = 1483295988000l;

DataGenerator.setValueToField(ticket168, "creationDate", new Date(date));

ticketManager.add(ticket168);

Ticket ticket169 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.CLOSED, employee90, customer284,0);

date = 1483175269000l;

DataGenerator.setValueToField(ticket169, "creationDate", new Date(date));

ticketManager.add(ticket169);

Ticket ticket170 = new Ticket("Mary plays the piano.", Status.SOLVED, employee210, customer492,1);

date = 1483356515000l;

DataGenerator.setValueToField(ticket170, "creationDate", new Date(date));

ticketManager.add(ticket170);

Ticket ticket171 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee88, customer491,6);

date = 1483257242000l;

DataGenerator.setValueToField(ticket171, "creationDate", new Date(date));

ticketManager.add(ticket171);

Ticket ticket172 = new Ticket("The memory we used to share is no longer coherent.", Status.WAITING_FOR_FEEDBACK, employee43, customer359,6);

date = 1483334540000l;

DataGenerator.setValueToField(ticket172, "creationDate", new Date(date));

ticketManager.add(ticket172);

Ticket ticket173 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.WAITING_FOR_FEEDBACK, employee77, customer442,8);

date = 1483342931000l;

DataGenerator.setValueToField(ticket173, "creationDate", new Date(date));

ticketManager.add(ticket173);

Ticket ticket174 = new Ticket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.PROCESSED, employee56, customer309,4);

date = 1483210315000l;

DataGenerator.setValueToField(ticket174, "creationDate", new Date(date));

ticketManager.add(ticket174);

Ticket ticket175 = new Ticket("We need to rent a room for our party.", Status.CLOSED, employee128, customer368,5);

date = 1483028415000l;

DataGenerator.setValueToField(ticket175, "creationDate", new Date(date));

ticketManager.add(ticket175);

Ticket ticket176 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", Status.PROCESSED, employee248, customer388,4);

date = 1483215088000l;

DataGenerator.setValueToField(ticket176, "creationDate", new Date(date));

ticketManager.add(ticket176);

Ticket ticket177 = new Ticket("Two seats were vacant.", Status.CLOSED, employee155, customer289,3);

date = 1483493930000l;

DataGenerator.setValueToField(ticket177, "creationDate", new Date(date));

ticketManager.add(ticket177);

Ticket ticket178 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.PROCESSED, employee247, customer399,9);

date = 1483524508000l;

DataGenerator.setValueToField(ticket178, "creationDate", new Date(date));

ticketManager.add(ticket178);

Ticket ticket179 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.WAITING_FOR_FEEDBACK, employee128, customer288,8);

date = 1483029068000l;

DataGenerator.setValueToField(ticket179, "creationDate", new Date(date));

ticketManager.add(ticket179);

Ticket ticket180 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", Status.WAITING_FOR_FEEDBACK, employee13, customer285,10);

date = 1483296509000l;

DataGenerator.setValueToField(ticket180, "creationDate", new Date(date));

ticketManager.add(ticket180);

Ticket ticket181 = new Ticket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.WAITING_FOR_FEEDBACK, employee200, customer331,9);

date = 1483459872000l;

DataGenerator.setValueToField(ticket181, "creationDate", new Date(date));

ticketManager.add(ticket181);

Ticket ticket182 = new Ticket("I am never at home on Sundays.", Status.CLOSED, employee11, customer258,0);

date = 1483445048000l;

DataGenerator.setValueToField(ticket182, "creationDate", new Date(date));

ticketManager.add(ticket182);

Ticket ticket183 = new Ticket("We have never been to Asia, nor have we visited Africa.", Status.PROCESSED, employee185, customer464,5);

date = 1483450279000l;

DataGenerator.setValueToField(ticket183, "creationDate", new Date(date));

ticketManager.add(ticket183);

Ticket ticket184 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.CLOSED, employee245, customer284,3);

date = 1483078379000l;

DataGenerator.setValueToField(ticket184, "creationDate", new Date(date));

ticketManager.add(ticket184);

Ticket ticket185 = new Ticket("I am counting my calories, yet I really want dessert.", Status.RECORDED, employee186, customer426,7);

date = 1483197692000l;

DataGenerator.setValueToField(ticket185, "creationDate", new Date(date));

ticketManager.add(ticket185);

Ticket ticket186 = new Ticket("I often see the time 11:11 or 12:34 on clocks.", Status.SOLVED, employee205, customer318,9);

date = 1483301096000l;

DataGenerator.setValueToField(ticket186, "creationDate", new Date(date));

ticketManager.add(ticket186);

Ticket ticket187 = new Ticket("The old apple revels in its authority.", Status.PROCESSED, employee230, customer468,9);

date = 1483110543000l;

DataGenerator.setValueToField(ticket187, "creationDate", new Date(date));

ticketManager.add(ticket187);

Ticket ticket188 = new Ticket("The memory we used to share is no longer coherent.", Status.CLOSED, employee91, customer460,2);

date = 1483139599000l;

DataGenerator.setValueToField(ticket188, "creationDate", new Date(date));

ticketManager.add(ticket188);

Ticket ticket189 = new Ticket("She folded her handkerchief neatly.", Status.CLOSED, employee121, customer475,1);

date = 1483179022000l;

DataGenerator.setValueToField(ticket189, "creationDate", new Date(date));

ticketManager.add(ticket189);

Ticket ticket190 = new Ticket("Don't step on the broken glass.", Status.PROCESSED, employee157, customer294,6);

date = 1483594562000l;

DataGenerator.setValueToField(ticket190, "creationDate", new Date(date));

ticketManager.add(ticket190);

Ticket ticket191 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.WAITING_FOR_FEEDBACK, employee14, customer484,9);

date = 1483060425000l;

DataGenerator.setValueToField(ticket191, "creationDate", new Date(date));

ticketManager.add(ticket191);

Ticket ticket192 = new Ticket("I love eating toasted cheese and tuna sandwiches.", Status.RECORDED, employee152, customer460,4);

date = 1483527026000l;

DataGenerator.setValueToField(ticket192, "creationDate", new Date(date));

ticketManager.add(ticket192);

Ticket ticket193 = new Ticket("The river stole the gods.", Status.WAITING_FOR_FEEDBACK, employee10, customer477,1);

date = 1483397281000l;

DataGenerator.setValueToField(ticket193, "creationDate", new Date(date));

ticketManager.add(ticket193);

Ticket ticket194 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.PROCESSED, employee157, customer365,8);

date = 1483233323000l;

DataGenerator.setValueToField(ticket194, "creationDate", new Date(date));

ticketManager.add(ticket194);

Ticket ticket195 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.CLOSED, employee192, customer445,6);

date = 1483405707000l;

DataGenerator.setValueToField(ticket195, "creationDate", new Date(date));

ticketManager.add(ticket195);

Ticket ticket196 = new Ticket("Please wait outside of the house.", Status.SOLVED, employee242, customer411,6);

date = 1483494743000l;

DataGenerator.setValueToField(ticket196, "creationDate", new Date(date));

ticketManager.add(ticket196);

Ticket ticket197 = new Ticket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee210, customer412,9);

date = 1483125776000l;

DataGenerator.setValueToField(ticket197, "creationDate", new Date(date));

ticketManager.add(ticket197);

Ticket ticket198 = new Ticket("Is it free?", Status.CLOSED, employee77, customer376,3);

date = 1483220165000l;

DataGenerator.setValueToField(ticket198, "creationDate", new Date(date));

ticketManager.add(ticket198);

Ticket ticket199 = new Ticket("Should we start class now, or should we wait for everyone to get here?", Status.CLOSED, employee76, customer268,8);

date = 1483473043000l;

DataGenerator.setValueToField(ticket199, "creationDate", new Date(date));

ticketManager.add(ticket199);

Ticket ticket200 = new Ticket("I am counting my calories, yet I really want dessert.", Status.WAITING_FOR_FEEDBACK, employee220, customer411,4);

date = 1483412257000l;

DataGenerator.setValueToField(ticket200, "creationDate", new Date(date));

ticketManager.add(ticket200);

Ticket ticket201 = new Ticket("Hurry!", Status.SOLVED, employee122, customer307,7);

date = 1483513341000l;

DataGenerator.setValueToField(ticket201, "creationDate", new Date(date));

ticketManager.add(ticket201);

Ticket ticket202 = new Ticket("I checked to make sure that he was still alive.", Status.RECORDED, employee165, customer439,6);

date = 1483412879000l;

DataGenerator.setValueToField(ticket202, "creationDate", new Date(date));

ticketManager.add(ticket202);

Ticket ticket203 = new Ticket("The mysterious diary records the voice.", Status.CLOSED, employee157, customer425,4);

date = 1483084551000l;

DataGenerator.setValueToField(ticket203, "creationDate", new Date(date));

ticketManager.add(ticket203);

Ticket ticket204 = new Ticket("The quick brown fox jumps over the lazy dog.", Status.WAITING_FOR_FEEDBACK, employee88, customer289,7);

date = 1483565819000l;

DataGenerator.setValueToField(ticket204, "creationDate", new Date(date));

ticketManager.add(ticket204);

Ticket ticket205 = new Ticket("She always speaks to him in a loud voice.", Status.PROCESSED, employee35, customer429,1);

date = 1483401890000l;

DataGenerator.setValueToField(ticket205, "creationDate", new Date(date));

ticketManager.add(ticket205);

Ticket ticket206 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.CLOSED, employee198, customer382,6);

date = 1483089305000l;

DataGenerator.setValueToField(ticket206, "creationDate", new Date(date));

ticketManager.add(ticket206);

Ticket ticket207 = new Ticket("The quick brown fox jumps over the lazy dog.", Status.RECORDED, employee20, customer470,3);

date = 1483111302000l;

DataGenerator.setValueToField(ticket207, "creationDate", new Date(date));

ticketManager.add(ticket207);

Ticket ticket208 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.PROCESSED, employee24, customer424,1);

date = 1483279756000l;

DataGenerator.setValueToField(ticket208, "creationDate", new Date(date));

ticketManager.add(ticket208);

Ticket ticket209 = new Ticket("The shooter says goodbye to his love.", Status.PROCESSED, employee102, customer462,8);

date = 1483360913000l;

DataGenerator.setValueToField(ticket209, "creationDate", new Date(date));

ticketManager.add(ticket209);

Ticket ticket210 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.CLOSED, employee207, customer323,3);

date = 1483240389000l;

DataGenerator.setValueToField(ticket210, "creationDate", new Date(date));

ticketManager.add(ticket210);

Ticket ticket211 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.WAITING_FOR_FEEDBACK, employee22, customer389,10);

date = 1483483155000l;

DataGenerator.setValueToField(ticket211, "creationDate", new Date(date));

ticketManager.add(ticket211);

Ticket ticket212 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.CLOSED, employee173, customer324,5);

date = 1483040194000l;

DataGenerator.setValueToField(ticket212, "creationDate", new Date(date));

ticketManager.add(ticket212);

Ticket ticket213 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.WAITING_FOR_FEEDBACK, employee234, customer308,7);

date = 1483363183000l;

DataGenerator.setValueToField(ticket213, "creationDate", new Date(date));

ticketManager.add(ticket213);

Ticket ticket214 = new Ticket("Check back tomorrow. I will see if the book has arrived.", Status.RECORDED, employee26, customer280,10);

date = 1483416432000l;

DataGenerator.setValueToField(ticket214, "creationDate", new Date(date));

ticketManager.add(ticket214);

Ticket ticket215 = new Ticket("Everyone was busy, so I went to the movie alone.", Status.RECORDED, employee246, customer392,10);

date = 1483314939000l;

DataGenerator.setValueToField(ticket215, "creationDate", new Date(date));

ticketManager.add(ticket215);

Ticket ticket216 = new Ticket("Two seats were vacant.", Status.PROCESSED, employee143, customer459,4);

date = 1483386170000l;

DataGenerator.setValueToField(ticket216, "creationDate", new Date(date));

ticketManager.add(ticket216);

Ticket ticket217 = new Ticket("I want to buy a onesie… but know it won’t suit me.", Status.RECORDED, employee29, customer259,5);

date = 1483311271000l;

DataGenerator.setValueToField(ticket217, "creationDate", new Date(date));

ticketManager.add(ticket217);

Ticket ticket218 = new Ticket("The quick brown fox jumps over the lazy dog.", Status.PROCESSED, employee21, customer269,9);

date = 1483020657000l;

DataGenerator.setValueToField(ticket218, "creationDate", new Date(date));

ticketManager.add(ticket218);

Ticket ticket219 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.WAITING_FOR_FEEDBACK, employee56, customer314,6);

date = 1483169751000l;

DataGenerator.setValueToField(ticket219, "creationDate", new Date(date));

ticketManager.add(ticket219);

Ticket ticket220 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee74, customer374,5);

date = 1483152218000l;

DataGenerator.setValueToField(ticket220, "creationDate", new Date(date));

ticketManager.add(ticket220);

Ticket ticket221 = new Ticket("We have a lot of rain in June.", Status.CLOSED, employee205, customer442,7);

date = 1483490036000l;

DataGenerator.setValueToField(ticket221, "creationDate", new Date(date));

ticketManager.add(ticket221);

Ticket ticket222 = new Ticket("It was getting dark, and we weren’t there yet.", Status.RECORDED, employee10, customer441,6);

date = 1483166184000l;

DataGenerator.setValueToField(ticket222, "creationDate", new Date(date));

ticketManager.add(ticket222);

Ticket ticket223 = new Ticket("I hear that Nancy is very pretty.", Status.SOLVED, employee127, customer437,1);

date = 1483088492000l;

DataGenerator.setValueToField(ticket223, "creationDate", new Date(date));

ticketManager.add(ticket223);

Ticket ticket224 = new Ticket("I am counting my calories, yet I really want dessert.", Status.PROCESSED, employee150, customer489,1);

date = 1483214968000l;

DataGenerator.setValueToField(ticket224, "creationDate", new Date(date));

ticketManager.add(ticket224);

Ticket ticket225 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.CLOSED, employee13, customer475,7);

date = 1483549103000l;

DataGenerator.setValueToField(ticket225, "creationDate", new Date(date));

ticketManager.add(ticket225);

Ticket ticket226 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.SOLVED, employee131, customer495,3);

date = 1483243901000l;

DataGenerator.setValueToField(ticket226, "creationDate", new Date(date));

ticketManager.add(ticket226);

Ticket ticket227 = new Ticket("She did her best to help him.", Status.CLOSED, employee183, customer469,10);

date = 1483265286000l;

DataGenerator.setValueToField(ticket227, "creationDate", new Date(date));

ticketManager.add(ticket227);

Ticket ticket228 = new Ticket("Joe made the sugar cookies. Susan decorated them.", Status.WAITING_FOR_FEEDBACK, employee190, customer398,3);

date = 1483543588000l;

DataGenerator.setValueToField(ticket228, "creationDate", new Date(date));

ticketManager.add(ticket228);

Ticket ticket229 = new Ticket("I love eating toasted cheese and tuna sandwiches.", Status.RECORDED, employee214, customer291,0);

date = 1483344418000l;

DataGenerator.setValueToField(ticket229, "creationDate", new Date(date));

ticketManager.add(ticket229);

Ticket ticket230 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", Status.WAITING_FOR_FEEDBACK, employee38, customer308,8);

date = 1483543841000l;

DataGenerator.setValueToField(ticket230, "creationDate", new Date(date));

ticketManager.add(ticket230);

Ticket ticket231 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", Status.RECORDED, employee5, customer439,6);

date = 1483065769000l;

DataGenerator.setValueToField(ticket231, "creationDate", new Date(date));

ticketManager.add(ticket231);

Ticket ticket232 = new Ticket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee131, customer320,3);

date = 1483174694000l;

DataGenerator.setValueToField(ticket232, "creationDate", new Date(date));

ticketManager.add(ticket232);

Ticket ticket233 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.SOLVED, employee151, customer432,5);

date = 1483556648000l;

DataGenerator.setValueToField(ticket233, "creationDate", new Date(date));

ticketManager.add(ticket233);

Ticket ticket234 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.WAITING_FOR_FEEDBACK, employee7, customer436,9);

date = 1483479502000l;

DataGenerator.setValueToField(ticket234, "creationDate", new Date(date));

ticketManager.add(ticket234);

Ticket ticket235 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.WAITING_FOR_FEEDBACK, employee209, customer309,5);

date = 1483280045000l;

DataGenerator.setValueToField(ticket235, "creationDate", new Date(date));

ticketManager.add(ticket235);

Ticket ticket236 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.RECORDED, employee143, customer391,1);

date = 1483062890000l;

DataGenerator.setValueToField(ticket236, "creationDate", new Date(date));

ticketManager.add(ticket236);

Ticket ticket237 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.PROCESSED, employee198, customer486,1);

date = 1483338087000l;

DataGenerator.setValueToField(ticket237, "creationDate", new Date(date));

ticketManager.add(ticket237);

Ticket ticket238 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.SOLVED, employee191, customer496,3);

date = 1483464739000l;

DataGenerator.setValueToField(ticket238, "creationDate", new Date(date));

ticketManager.add(ticket238);

Ticket ticket239 = new Ticket("I love eating toasted cheese and tuna sandwiches.", Status.PROCESSED, employee21, customer279,1);

date = 1483499362000l;

DataGenerator.setValueToField(ticket239, "creationDate", new Date(date));

ticketManager.add(ticket239);

Ticket ticket240 = new Ticket("I think I will buy the red car, or I will lease the blue one.", Status.RECORDED, employee70, customer490,3);

date = 1483247713000l;

DataGenerator.setValueToField(ticket240, "creationDate", new Date(date));

ticketManager.add(ticket240);

Ticket ticket241 = new Ticket("The book is in front of the table.", Status.PROCESSED, employee183, customer387,1);

date = 1483480704000l;

DataGenerator.setValueToField(ticket241, "creationDate", new Date(date));

ticketManager.add(ticket241);

Ticket ticket242 = new Ticket("It was getting dark, and we weren’t there yet.", Status.CLOSED, employee10, customer303,1);

date = 1483279065000l;

DataGenerator.setValueToField(ticket242, "creationDate", new Date(date));

ticketManager.add(ticket242);

Ticket ticket243 = new Ticket("I am never at home on Sundays.", Status.RECORDED, employee63, customer413,4);

date = 1483359974000l;

DataGenerator.setValueToField(ticket243, "creationDate", new Date(date));

ticketManager.add(ticket243);

Ticket ticket244 = new Ticket("I checked to make sure that he was still alive.", Status.PROCESSED, employee103, customer466,10);

date = 1483248176000l;

DataGenerator.setValueToField(ticket244, "creationDate", new Date(date));

ticketManager.add(ticket244);

Ticket ticket245 = new Ticket("The sky is clear. the stars are twinkling.", Status.SOLVED, employee202, customer460,9);

date = 1483477817000l;

DataGenerator.setValueToField(ticket245, "creationDate", new Date(date));

ticketManager.add(ticket245);

Ticket ticket246 = new Ticket("A glittering gem is not enough.", Status.PROCESSED, employee12, customer487,2);

date = 1483215241000l;

DataGenerator.setValueToField(ticket246, "creationDate", new Date(date));

ticketManager.add(ticket246);

Ticket ticket247 = new Ticket("The shooter says goodbye to his love.", Status.PROCESSED, employee135, customer269,3);

date = 1483223164000l;

DataGenerator.setValueToField(ticket247, "creationDate", new Date(date));

ticketManager.add(ticket247);

Ticket ticket248 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", Status.RECORDED, employee51, customer281,3);

date = 1483256196000l;

DataGenerator.setValueToField(ticket248, "creationDate", new Date(date));

ticketManager.add(ticket248);

Ticket ticket249 = new Ticket("It was getting dark, and we weren’t there yet.", Status.CLOSED, employee104, customer302,1);

date = 1483268065000l;

DataGenerator.setValueToField(ticket249, "creationDate", new Date(date));

ticketManager.add(ticket249);

Ticket ticket250 = new Ticket("Let me help you with your baggage.", Status.RECORDED, employee76, customer354,9);

date = 1483258027000l;

DataGenerator.setValueToField(ticket250, "creationDate", new Date(date));

ticketManager.add(ticket250);

Ticket ticket251 = new Ticket("A glittering gem is not enough.", Status.SOLVED, employee1, customer319,3);

date = 1483299952000l;

DataGenerator.setValueToField(ticket251, "creationDate", new Date(date));

ticketManager.add(ticket251);

Ticket ticket252 = new Ticket("She always speaks to him in a loud voice.", Status.SOLVED, employee137, customer315,4);

date = 1483280832000l;

DataGenerator.setValueToField(ticket252, "creationDate", new Date(date));

ticketManager.add(ticket252);

Ticket ticket253 = new Ticket("Don't step on the broken glass.", Status.WAITING_FOR_FEEDBACK, employee152, customer432,7);

date = 1483083122000l;

DataGenerator.setValueToField(ticket253, "creationDate", new Date(date));

ticketManager.add(ticket253);

Ticket ticket254 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", Status.PROCESSED, employee62, customer439,4);

date = 1483466767000l;

DataGenerator.setValueToField(ticket254, "creationDate", new Date(date));

ticketManager.add(ticket254);

Ticket ticket255 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.WAITING_FOR_FEEDBACK, employee77, customer292,3);

date = 1483038127000l;

DataGenerator.setValueToField(ticket255, "creationDate", new Date(date));

ticketManager.add(ticket255);

Ticket ticket256 = new Ticket("I often see the time 11:11 or 12:34 on clocks.", Status.RECORDED, employee229, customer329,7);

date = 1483436670000l;

DataGenerator.setValueToField(ticket256, "creationDate", new Date(date));

ticketManager.add(ticket256);

Ticket ticket257 = new Ticket("Don't step on the broken glass.", Status.PROCESSED, employee48, customer415,10);

date = 1483146888000l;

DataGenerator.setValueToField(ticket257, "creationDate", new Date(date));

ticketManager.add(ticket257);

Ticket ticket258 = new Ticket("It was getting dark, and we weren’t there yet.", Status.PROCESSED, employee182, customer493,10);

date = 1483230347000l;

DataGenerator.setValueToField(ticket258, "creationDate", new Date(date));

ticketManager.add(ticket258);

Ticket ticket259 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee237, customer480,7);

date = 1483116527000l;

DataGenerator.setValueToField(ticket259, "creationDate", new Date(date));

ticketManager.add(ticket259);

Ticket ticket260 = new Ticket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee50, customer351,10);

date = 1483283698000l;

DataGenerator.setValueToField(ticket260, "creationDate", new Date(date));

ticketManager.add(ticket260);

Ticket ticket261 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.RECORDED, employee228, customer491,6);

date = 1483524218000l;

DataGenerator.setValueToField(ticket261, "creationDate", new Date(date));

ticketManager.add(ticket261);

Ticket ticket262 = new Ticket("Rock music approaches at high velocity.", Status.WAITING_FOR_FEEDBACK, employee28, customer323,0);

date = 1483383647000l;

DataGenerator.setValueToField(ticket262, "creationDate", new Date(date));

ticketManager.add(ticket262);

Ticket ticket263 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee192, customer387,8);

date = 1483595776000l;

DataGenerator.setValueToField(ticket263, "creationDate", new Date(date));

ticketManager.add(ticket263);

Ticket ticket264 = new Ticket("Everyone was busy, so I went to the movie alone.", Status.CLOSED, employee33, customer485,2);

date = 1483386690000l;

DataGenerator.setValueToField(ticket264, "creationDate", new Date(date));

ticketManager.add(ticket264);

Ticket ticket265 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.CLOSED, employee126, customer457,0);

date = 1483470917000l;

DataGenerator.setValueToField(ticket265, "creationDate", new Date(date));

ticketManager.add(ticket265);

Ticket ticket266 = new Ticket("Let me help you with your baggage.", Status.PROCESSED, employee125, customer404,1);

date = 1483363804000l;

DataGenerator.setValueToField(ticket266, "creationDate", new Date(date));

ticketManager.add(ticket266);

Ticket ticket267 = new Ticket("He told us a very exciting adventure story.", Status.CLOSED, employee38, customer262,0);

date = 1483471870000l;

DataGenerator.setValueToField(ticket267, "creationDate", new Date(date));

ticketManager.add(ticket267);

Ticket ticket268 = new Ticket("I'd rather be a bird than a fish.", Status.SOLVED, employee246, customer323,8);

date = 1483378638000l;

DataGenerator.setValueToField(ticket268, "creationDate", new Date(date));

ticketManager.add(ticket268);

Ticket ticket269 = new Ticket("I really want to go to work, but I am too sick to drive.", Status.PROCESSED, employee162, customer348,8);

date = 1483578967000l;

DataGenerator.setValueToField(ticket269, "creationDate", new Date(date));

ticketManager.add(ticket269);

Ticket ticket270 = new Ticket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee195, customer475,4);

date = 1483592363000l;

DataGenerator.setValueToField(ticket270, "creationDate", new Date(date));

ticketManager.add(ticket270);

Ticket ticket271 = new Ticket("She always speaks to him in a loud voice.", Status.WAITING_FOR_FEEDBACK, employee79, customer423,5);

date = 1483583273000l;

DataGenerator.setValueToField(ticket271, "creationDate", new Date(date));

ticketManager.add(ticket271);

Ticket ticket272 = new Ticket("Lets all be unique together until we realise we are all the same.", Status.WAITING_FOR_FEEDBACK, employee95, customer318,7);

date = 1483512472000l;

DataGenerator.setValueToField(ticket272, "creationDate", new Date(date));

ticketManager.add(ticket272);

Ticket ticket273 = new Ticket("Please wait outside of the house.", Status.PROCESSED, employee108, customer306,7);

date = 1483444347000l;

DataGenerator.setValueToField(ticket273, "creationDate", new Date(date));

ticketManager.add(ticket273);

Ticket ticket274 = new Ticket("She did her best to help him.", Status.CLOSED, employee51, customer374,6);

date = 1483023510000l;

DataGenerator.setValueToField(ticket274, "creationDate", new Date(date));

ticketManager.add(ticket274);

Ticket ticket275 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.WAITING_FOR_FEEDBACK, employee103, customer393,8);

date = 1483349141000l;

DataGenerator.setValueToField(ticket275, "creationDate", new Date(date));

ticketManager.add(ticket275);

Ticket ticket276 = new Ticket("She folded her handkerchief neatly.", Status.CLOSED, employee112, customer296,9);

date = 1483276695000l;

DataGenerator.setValueToField(ticket276, "creationDate", new Date(date));

ticketManager.add(ticket276);

Ticket ticket277 = new Ticket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee196, customer419,4);

date = 1483126675000l;

DataGenerator.setValueToField(ticket277, "creationDate", new Date(date));

ticketManager.add(ticket277);

Ticket ticket278 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.RECORDED, employee155, customer325,5);

date = 1483284431000l;

DataGenerator.setValueToField(ticket278, "creationDate", new Date(date));

ticketManager.add(ticket278);

Ticket ticket279 = new Ticket("She did her best to help him.", Status.SOLVED, employee100, customer424,0);

date = 1483331292000l;

DataGenerator.setValueToField(ticket279, "creationDate", new Date(date));

ticketManager.add(ticket279);

Ticket ticket280 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.CLOSED, employee86, customer364,9);

date = 1483247796000l;

DataGenerator.setValueToField(ticket280, "creationDate", new Date(date));

ticketManager.add(ticket280);

Ticket ticket281 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.SOLVED, employee115, customer260,0);

date = 1483585072000l;

DataGenerator.setValueToField(ticket281, "creationDate", new Date(date));

ticketManager.add(ticket281);

Ticket ticket282 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", Status.PROCESSED, employee226, customer455,10);

date = 1483053221000l;

DataGenerator.setValueToField(ticket282, "creationDate", new Date(date));

ticketManager.add(ticket282);

Ticket ticket283 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.CLOSED, employee75, customer468,9);

date = 1483017946000l;

DataGenerator.setValueToField(ticket283, "creationDate", new Date(date));

ticketManager.add(ticket283);

Ticket ticket284 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.SOLVED, employee106, customer366,4);

date = 1483129919000l;

DataGenerator.setValueToField(ticket284, "creationDate", new Date(date));

ticketManager.add(ticket284);

Ticket ticket285 = new Ticket("Lets all be unique together until we realise we are all the same.", Status.RECORDED, employee4, customer305,0);

date = 1483048899000l;

DataGenerator.setValueToField(ticket285, "creationDate", new Date(date));

ticketManager.add(ticket285);

Ticket ticket286 = new Ticket("This is a Japanese doll.", Status.RECORDED, employee223, customer340,8);

date = 1483432062000l;

DataGenerator.setValueToField(ticket286, "creationDate", new Date(date));

ticketManager.add(ticket286);

Ticket ticket287 = new Ticket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee21, customer441,8);

date = 1483227947000l;

DataGenerator.setValueToField(ticket287, "creationDate", new Date(date));

ticketManager.add(ticket287);

Ticket ticket288 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.RECORDED, employee199, customer487,3);

date = 1483064491000l;

DataGenerator.setValueToField(ticket288, "creationDate", new Date(date));

ticketManager.add(ticket288);

Ticket ticket289 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.PROCESSED, employee209, customer382,1);

date = 1483515492000l;

DataGenerator.setValueToField(ticket289, "creationDate", new Date(date));

ticketManager.add(ticket289);

Ticket ticket290 = new Ticket("I want more detailed information.", Status.RECORDED, employee194, customer492,6);

date = 1483351498000l;

DataGenerator.setValueToField(ticket290, "creationDate", new Date(date));

ticketManager.add(ticket290);

Ticket ticket291 = new Ticket("Check back tomorrow. I will see if the book has arrived.", Status.RECORDED, employee64, customer412,2);

date = 1483335184000l;

DataGenerator.setValueToField(ticket291, "creationDate", new Date(date));

ticketManager.add(ticket291);

Ticket ticket292 = new Ticket("The body may perhaps compensates for the loss of a true metaphysics.", Status.WAITING_FOR_FEEDBACK, employee43, customer397,3);

date = 1483413112000l;

DataGenerator.setValueToField(ticket292, "creationDate", new Date(date));

ticketManager.add(ticket292);

Ticket ticket293 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.CLOSED, employee206, customer409,1);

date = 1483438410000l;

DataGenerator.setValueToField(ticket293, "creationDate", new Date(date));

ticketManager.add(ticket293);

Ticket ticket294 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.CLOSED, employee129, customer310,10);

date = 1483016010000l;

DataGenerator.setValueToField(ticket294, "creationDate", new Date(date));

ticketManager.add(ticket294);

Ticket ticket295 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.PROCESSED, employee92, customer275,10);

date = 1483121231000l;

DataGenerator.setValueToField(ticket295, "creationDate", new Date(date));

ticketManager.add(ticket295);

Ticket ticket296 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.RECORDED, employee93, customer296,9);

date = 1483097381000l;

DataGenerator.setValueToField(ticket296, "creationDate", new Date(date));

ticketManager.add(ticket296);

Ticket ticket297 = new Ticket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee211, customer323,10);

date = 1483060782000l;

DataGenerator.setValueToField(ticket297, "creationDate", new Date(date));

ticketManager.add(ticket297);

Ticket ticket298 = new Ticket("This is a Japanese doll.", Status.PROCESSED, employee248, customer328,0);

date = 1483593890000l;

DataGenerator.setValueToField(ticket298, "creationDate", new Date(date));

ticketManager.add(ticket298);

Ticket ticket299 = new Ticket("I love eating toasted cheese and tuna sandwiches.", Status.WAITING_FOR_FEEDBACK, employee64, customer436,9);

date = 1483593280000l;

DataGenerator.setValueToField(ticket299, "creationDate", new Date(date));

ticketManager.add(ticket299);

Ticket ticket300 = new Ticket("I checked to make sure that he was still alive.", Status.PROCESSED, employee105, customer303,1);

date = 1483418535000l;

DataGenerator.setValueToField(ticket300, "creationDate", new Date(date));

ticketManager.add(ticket300);

Ticket ticket301 = new Ticket("Mary plays the piano.", Status.PROCESSED, employee181, customer358,4);

date = 1483131255000l;

DataGenerator.setValueToField(ticket301, "creationDate", new Date(date));

ticketManager.add(ticket301);

Ticket ticket302 = new Ticket("I currently have 4 windows open up… and I don’t know why.", Status.CLOSED, employee91, customer277,1);

date = 1483086583000l;

DataGenerator.setValueToField(ticket302, "creationDate", new Date(date));

ticketManager.add(ticket302);

Ticket ticket303 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.PROCESSED, employee231, customer262,8);

date = 1483124008000l;

DataGenerator.setValueToField(ticket303, "creationDate", new Date(date));

ticketManager.add(ticket303);

Ticket ticket304 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.CLOSED, employee147, customer321,1);

date = 1483100613000l;

DataGenerator.setValueToField(ticket304, "creationDate", new Date(date));

ticketManager.add(ticket304);

Ticket ticket305 = new Ticket("She wrote him a long letter, but he didn't read it.", Status.WAITING_FOR_FEEDBACK, employee224, customer291,9);

date = 1483274641000l;

DataGenerator.setValueToField(ticket305, "creationDate", new Date(date));

ticketManager.add(ticket305);

Ticket ticket306 = new Ticket("She was too short to see over the fence.", Status.SOLVED, employee212, customer318,6);

date = 1483190315000l;

DataGenerator.setValueToField(ticket306, "creationDate", new Date(date));

ticketManager.add(ticket306);

Ticket ticket307 = new Ticket("I currently have 4 windows open up… and I don’t know why.", Status.PROCESSED, employee248, customer407,2);

date = 1483456909000l;

DataGenerator.setValueToField(ticket307, "creationDate", new Date(date));

ticketManager.add(ticket307);

Ticket ticket308 = new Ticket("Sixty-Four comes asking for bread.", Status.WAITING_FOR_FEEDBACK, employee100, customer341,2);

date = 1483063747000l;

DataGenerator.setValueToField(ticket308, "creationDate", new Date(date));

ticketManager.add(ticket308);

Ticket ticket309 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.CLOSED, employee179, customer433,6);

date = 1483155152000l;

DataGenerator.setValueToField(ticket309, "creationDate", new Date(date));

ticketManager.add(ticket309);

Ticket ticket310 = new Ticket("I really want to go to work, but I am too sick to drive.", Status.SOLVED, employee244, customer497,4);

date = 1483398010000l;

DataGenerator.setValueToField(ticket310, "creationDate", new Date(date));

ticketManager.add(ticket310);

Ticket ticket311 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.PROCESSED, employee127, customer266,2);

date = 1483079904000l;

DataGenerator.setValueToField(ticket311, "creationDate", new Date(date));

ticketManager.add(ticket311);

Ticket ticket312 = new Ticket("She advised him to come back at once.", Status.SOLVED, employee45, customer447,0);

date = 1483178370000l;

DataGenerator.setValueToField(ticket312, "creationDate", new Date(date));

ticketManager.add(ticket312);

Ticket ticket313 = new Ticket("She folded her handkerchief neatly.", Status.RECORDED, employee128, customer263,3);

date = 1483398668000l;

DataGenerator.setValueToField(ticket313, "creationDate", new Date(date));

ticketManager.add(ticket313);

Ticket ticket314 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.RECORDED, employee47, customer257,10);

date = 1483428420000l;

DataGenerator.setValueToField(ticket314, "creationDate", new Date(date));

ticketManager.add(ticket314);

Ticket ticket315 = new Ticket("She advised him to come back at once.", Status.WAITING_FOR_FEEDBACK, employee115, customer373,0);

date = 1483406447000l;

DataGenerator.setValueToField(ticket315, "creationDate", new Date(date));

ticketManager.add(ticket315);

Ticket ticket316 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.RECORDED, employee91, customer411,5);

date = 1483232079000l;

DataGenerator.setValueToField(ticket316, "creationDate", new Date(date));

ticketManager.add(ticket316);

Ticket ticket317 = new Ticket("Let me help you with your baggage.", Status.WAITING_FOR_FEEDBACK, employee109, customer313,4);

date = 1483554807000l;

DataGenerator.setValueToField(ticket317, "creationDate", new Date(date));

ticketManager.add(ticket317);

Ticket ticket318 = new Ticket("Let me help you with your baggage.", Status.RECORDED, employee104, customer352,6);

date = 1483116717000l;

DataGenerator.setValueToField(ticket318, "creationDate", new Date(date));

ticketManager.add(ticket318);

Ticket ticket319 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", Status.WAITING_FOR_FEEDBACK, employee113, customer425,2);

date = 1483284034000l;

DataGenerator.setValueToField(ticket319, "creationDate", new Date(date));

ticketManager.add(ticket319);

Ticket ticket320 = new Ticket("Is it free?", Status.RECORDED, employee91, customer384,9);

date = 1483098906000l;

DataGenerator.setValueToField(ticket320, "creationDate", new Date(date));

ticketManager.add(ticket320);

Ticket ticket321 = new Ticket("Two seats were vacant.", Status.PROCESSED, employee38, customer296,2);

date = 1483280912000l;

DataGenerator.setValueToField(ticket321, "creationDate", new Date(date));

ticketManager.add(ticket321);

Ticket ticket322 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee1, customer323,3);

date = 1483118971000l;

DataGenerator.setValueToField(ticket322, "creationDate", new Date(date));

ticketManager.add(ticket322);

Ticket ticket323 = new Ticket("The shooter says goodbye to his love.", Status.PROCESSED, employee7, customer427,9);

date = 1483300089000l;

DataGenerator.setValueToField(ticket323, "creationDate", new Date(date));

ticketManager.add(ticket323);

Ticket ticket324 = new Ticket("I want more detailed information.", Status.PROCESSED, employee205, customer495,4);

date = 1483217568000l;

DataGenerator.setValueToField(ticket324, "creationDate", new Date(date));

ticketManager.add(ticket324);

Ticket ticket325 = new Ticket("This is a Japanese doll.", Status.WAITING_FOR_FEEDBACK, employee35, customer456,6);

date = 1483166973000l;

DataGenerator.setValueToField(ticket325, "creationDate", new Date(date));

ticketManager.add(ticket325);

Ticket ticket326 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.SOLVED, employee87, customer385,4);

date = 1483142830000l;

DataGenerator.setValueToField(ticket326, "creationDate", new Date(date));

ticketManager.add(ticket326);

Ticket ticket327 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee130, customer374,1);

date = 1483154879000l;

DataGenerator.setValueToField(ticket327, "creationDate", new Date(date));

ticketManager.add(ticket327);

Ticket ticket328 = new Ticket("I really want to go to work, but I am too sick to drive.", Status.PROCESSED, employee223, customer301,4);

date = 1483131754000l;

DataGenerator.setValueToField(ticket328, "creationDate", new Date(date));

ticketManager.add(ticket328);

Ticket ticket329 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", Status.SOLVED, employee153, customer323,8);

date = 1483260174000l;

DataGenerator.setValueToField(ticket329, "creationDate", new Date(date));

ticketManager.add(ticket329);

Ticket ticket330 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.CLOSED, employee97, customer325,6);

date = 1483599440000l;

DataGenerator.setValueToField(ticket330, "creationDate", new Date(date));

ticketManager.add(ticket330);

Ticket ticket331 = new Ticket("The mysterious diary records the voice.", Status.WAITING_FOR_FEEDBACK, employee245, customer487,9);

date = 1483193075000l;

DataGenerator.setValueToField(ticket331, "creationDate", new Date(date));

ticketManager.add(ticket331);

Ticket ticket332 = new Ticket("I think I will buy the red car, or I will lease the blue one.", Status.CLOSED, employee164, customer461,6);

date = 1483205694000l;

DataGenerator.setValueToField(ticket332, "creationDate", new Date(date));

ticketManager.add(ticket332);

Ticket ticket333 = new Ticket("Joe made the sugar cookies. Susan decorated them.", Status.SOLVED, employee143, customer294,2);

date = 1483348936000l;

DataGenerator.setValueToField(ticket333, "creationDate", new Date(date));

ticketManager.add(ticket333);

Ticket ticket334 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee200, customer386,0);

date = 1483454100000l;

DataGenerator.setValueToField(ticket334, "creationDate", new Date(date));

ticketManager.add(ticket334);

Ticket ticket335 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.CLOSED, employee204, customer459,4);

date = 1483334328000l;

DataGenerator.setValueToField(ticket335, "creationDate", new Date(date));

ticketManager.add(ticket335);

Ticket ticket336 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.SOLVED, employee142, customer449,8);

date = 1483395756000l;

DataGenerator.setValueToField(ticket336, "creationDate", new Date(date));

ticketManager.add(ticket336);

Ticket ticket337 = new Ticket("The river stole the gods.", Status.PROCESSED, employee108, customer499,3);

date = 1483399026000l;

DataGenerator.setValueToField(ticket337, "creationDate", new Date(date));

ticketManager.add(ticket337);

Ticket ticket338 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.SOLVED, employee183, customer253,7);

date = 1483452327000l;

DataGenerator.setValueToField(ticket338, "creationDate", new Date(date));

ticketManager.add(ticket338);

Ticket ticket339 = new Ticket("She did her best to help him.", Status.SOLVED, employee53, customer416,8);

date = 1483467864000l;

DataGenerator.setValueToField(ticket339, "creationDate", new Date(date));

ticketManager.add(ticket339);

Ticket ticket340 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.WAITING_FOR_FEEDBACK, employee124, customer385,5);

date = 1483048316000l;

DataGenerator.setValueToField(ticket340, "creationDate", new Date(date));

ticketManager.add(ticket340);

Ticket ticket341 = new Ticket("The river stole the gods.", Status.WAITING_FOR_FEEDBACK, employee143, customer296,1);

date = 1483285533000l;

DataGenerator.setValueToField(ticket341, "creationDate", new Date(date));

ticketManager.add(ticket341);

Ticket ticket342 = new Ticket("She was too short to see over the fence.", Status.RECORDED, employee148, customer335,9);

date = 1483246228000l;

DataGenerator.setValueToField(ticket342, "creationDate", new Date(date));

ticketManager.add(ticket342);

Ticket ticket343 = new Ticket("The lake is a long way from here.", Status.SOLVED, employee80, customer253,1);

date = 1483328023000l;

DataGenerator.setValueToField(ticket343, "creationDate", new Date(date));

ticketManager.add(ticket343);

Ticket ticket344 = new Ticket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.PROCESSED, employee184, customer282,6);

date = 1483247234000l;

DataGenerator.setValueToField(ticket344, "creationDate", new Date(date));

ticketManager.add(ticket344);

Ticket ticket345 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", Status.WAITING_FOR_FEEDBACK, employee6, customer431,1);

date = 1483332313000l;

DataGenerator.setValueToField(ticket345, "creationDate", new Date(date));

ticketManager.add(ticket345);

Ticket ticket346 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", Status.WAITING_FOR_FEEDBACK, employee161, customer325,2);

date = 1483581713000l;

DataGenerator.setValueToField(ticket346, "creationDate", new Date(date));

ticketManager.add(ticket346);

Ticket ticket347 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.RECORDED, employee177, customer290,5);

date = 1483285120000l;

DataGenerator.setValueToField(ticket347, "creationDate", new Date(date));

ticketManager.add(ticket347);

Ticket ticket348 = new Ticket("The mysterious diary records the voice.", Status.SOLVED, employee29, customer307,6);

date = 1483539708000l;

DataGenerator.setValueToField(ticket348, "creationDate", new Date(date));

ticketManager.add(ticket348);

Ticket ticket349 = new Ticket("The quick brown fox jumps over the lazy dog.", Status.PROCESSED, employee228, customer445,1);

date = 1483549777000l;

DataGenerator.setValueToField(ticket349, "creationDate", new Date(date));

ticketManager.add(ticket349);

Ticket ticket350 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee32, customer496,3);

date = 1483022783000l;

DataGenerator.setValueToField(ticket350, "creationDate", new Date(date));

ticketManager.add(ticket350);

Ticket ticket351 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", Status.SOLVED, employee91, customer250,5);

date = 1483114781000l;

DataGenerator.setValueToField(ticket351, "creationDate", new Date(date));

ticketManager.add(ticket351);

Ticket ticket352 = new Ticket("Rock music approaches at high velocity.", Status.RECORDED, employee124, customer313,7);

date = 1483017722000l;

DataGenerator.setValueToField(ticket352, "creationDate", new Date(date));

ticketManager.add(ticket352);

Ticket ticket353 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee236, customer417,6);

date = 1483416136000l;

DataGenerator.setValueToField(ticket353, "creationDate", new Date(date));

ticketManager.add(ticket353);

Ticket ticket354 = new Ticket("Abstraction is often one floor above you.", Status.SOLVED, employee141, customer447,4);

date = 1483330997000l;

DataGenerator.setValueToField(ticket354, "creationDate", new Date(date));

ticketManager.add(ticket354);

Ticket ticket355 = new Ticket("Is it free?", Status.SOLVED, employee175, customer414,3);

date = 1483221977000l;

DataGenerator.setValueToField(ticket355, "creationDate", new Date(date));

ticketManager.add(ticket355);

Ticket ticket356 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.CLOSED, employee232, customer251,3);

date = 1483473328000l;

DataGenerator.setValueToField(ticket356, "creationDate", new Date(date));

ticketManager.add(ticket356);

Ticket ticket357 = new Ticket("I want more detailed information.", Status.CLOSED, employee205, customer393,0);

date = 1483545284000l;

DataGenerator.setValueToField(ticket357, "creationDate", new Date(date));

ticketManager.add(ticket357);

Ticket ticket358 = new Ticket("She advised him to come back at once.", Status.RECORDED, employee107, customer455,8);

date = 1483130021000l;

DataGenerator.setValueToField(ticket358, "creationDate", new Date(date));

ticketManager.add(ticket358);

Ticket ticket359 = new Ticket("Please wait outside of the house.", Status.PROCESSED, employee221, customer387,1);

date = 1483437893000l;

DataGenerator.setValueToField(ticket359, "creationDate", new Date(date));

ticketManager.add(ticket359);

Ticket ticket360 = new Ticket("I checked to make sure that he was still alive.", Status.PROCESSED, employee91, customer411,4);

date = 1483503763000l;

DataGenerator.setValueToField(ticket360, "creationDate", new Date(date));

ticketManager.add(ticket360);

Ticket ticket361 = new Ticket("We have never been to Asia, nor have we visited Africa.", Status.SOLVED, employee204, customer458,2);

date = 1483531869000l;

DataGenerator.setValueToField(ticket361, "creationDate", new Date(date));

ticketManager.add(ticket361);

Ticket ticket362 = new Ticket("Yeah, I think it's a good environment for learning English.", Status.CLOSED, employee66, customer292,2);

date = 1483455440000l;

DataGenerator.setValueToField(ticket362, "creationDate", new Date(date));

ticketManager.add(ticket362);

Ticket ticket363 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", Status.SOLVED, employee139, customer394,0);

date = 1483102641000l;

DataGenerator.setValueToField(ticket363, "creationDate", new Date(date));

ticketManager.add(ticket363);

Ticket ticket364 = new Ticket("Hurry!", Status.RECORDED, employee147, customer279,9);

date = 1483562709000l;

DataGenerator.setValueToField(ticket364, "creationDate", new Date(date));

ticketManager.add(ticket364);

Ticket ticket365 = new Ticket("Christmas is coming.", Status.PROCESSED, employee238, customer423,0);

date = 1483270414000l;

DataGenerator.setValueToField(ticket365, "creationDate", new Date(date));

ticketManager.add(ticket365);

Ticket ticket366 = new Ticket("Please wait outside of the house.", Status.SOLVED, employee88, customer381,2);

date = 1483510704000l;

DataGenerator.setValueToField(ticket366, "creationDate", new Date(date));

ticketManager.add(ticket366);

Ticket ticket367 = new Ticket("The quick brown fox jumps over the lazy dog.", Status.PROCESSED, employee5, customer252,5);

date = 1483391345000l;

DataGenerator.setValueToField(ticket367, "creationDate", new Date(date));

ticketManager.add(ticket367);

Ticket ticket368 = new Ticket("The memory we used to share is no longer coherent.", Status.RECORDED, employee68, customer278,10);

date = 1483073601000l;

DataGenerator.setValueToField(ticket368, "creationDate", new Date(date));

ticketManager.add(ticket368);

Ticket ticket369 = new Ticket("He told us a very exciting adventure story.", Status.WAITING_FOR_FEEDBACK, employee82, customer385,7);

date = 1483052104000l;

DataGenerator.setValueToField(ticket369, "creationDate", new Date(date));

ticketManager.add(ticket369);

Ticket ticket370 = new Ticket("I am never at home on Sundays.", Status.CLOSED, employee234, customer385,1);

date = 1483324467000l;

DataGenerator.setValueToField(ticket370, "creationDate", new Date(date));

ticketManager.add(ticket370);

Ticket ticket371 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", Status.CLOSED, employee247, customer298,6);

date = 1483408869000l;

DataGenerator.setValueToField(ticket371, "creationDate", new Date(date));

ticketManager.add(ticket371);

Ticket ticket372 = new Ticket("Abstraction is often one floor above you.", Status.PROCESSED, employee178, customer397,4);

date = 1483467390000l;

DataGenerator.setValueToField(ticket372, "creationDate", new Date(date));

ticketManager.add(ticket372);

Ticket ticket373 = new Ticket("Rock music approaches at high velocity.", Status.CLOSED, employee121, customer493,10);

date = 1483306516000l;

DataGenerator.setValueToField(ticket373, "creationDate", new Date(date));

ticketManager.add(ticket373);

Ticket ticket374 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.RECORDED, employee129, customer336,2);

date = 1483087704000l;

DataGenerator.setValueToField(ticket374, "creationDate", new Date(date));

ticketManager.add(ticket374);

Ticket ticket375 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee202, customer315,3);

date = 1483271280000l;

DataGenerator.setValueToField(ticket375, "creationDate", new Date(date));

ticketManager.add(ticket375);

Ticket ticket376 = new Ticket("I hear that Nancy is very pretty.", Status.WAITING_FOR_FEEDBACK, employee65, customer322,7);

date = 1483282619000l;

DataGenerator.setValueToField(ticket376, "creationDate", new Date(date));

ticketManager.add(ticket376);

Ticket ticket377 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.WAITING_FOR_FEEDBACK, employee133, customer294,5);

date = 1483352160000l;

DataGenerator.setValueToField(ticket377, "creationDate", new Date(date));

ticketManager.add(ticket377);

Ticket ticket378 = new Ticket("The old apple revels in its authority.", Status.WAITING_FOR_FEEDBACK, employee45, customer325,8);

date = 1483617683000l;

DataGenerator.setValueToField(ticket378, "creationDate", new Date(date));

ticketManager.add(ticket378);

Ticket ticket379 = new Ticket("Don't step on the broken glass.", Status.PROCESSED, employee144, customer367,0);

date = 1483307133000l;

DataGenerator.setValueToField(ticket379, "creationDate", new Date(date));

ticketManager.add(ticket379);

Ticket ticket380 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", Status.RECORDED, employee9, customer428,2);

date = 1483593241000l;

DataGenerator.setValueToField(ticket380, "creationDate", new Date(date));

ticketManager.add(ticket380);

Ticket ticket381 = new Ticket("The sky is clear. the stars are twinkling.", Status.CLOSED, employee68, customer491,7);

date = 1483460840000l;

DataGenerator.setValueToField(ticket381, "creationDate", new Date(date));

ticketManager.add(ticket381);

Ticket ticket382 = new Ticket("A glittering gem is not enough.", Status.RECORDED, employee34, customer311,7);

date = 1483446424000l;

DataGenerator.setValueToField(ticket382, "creationDate", new Date(date));

ticketManager.add(ticket382);

Ticket ticket383 = new Ticket("I often see the time 11:11 or 12:34 on clocks.", Status.CLOSED, employee119, customer317,1);

date = 1483117084000l;

DataGenerator.setValueToField(ticket383, "creationDate", new Date(date));

ticketManager.add(ticket383);

Ticket ticket384 = new Ticket("Where do random thoughts come from?", Status.PROCESSED, employee10, customer441,10);

date = 1483027606000l;

DataGenerator.setValueToField(ticket384, "creationDate", new Date(date));

ticketManager.add(ticket384);

Ticket ticket385 = new Ticket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.RECORDED, employee146, customer373,5);

date = 1483099137000l;

DataGenerator.setValueToField(ticket385, "creationDate", new Date(date));

ticketManager.add(ticket385);

Ticket ticket386 = new Ticket("Where do random thoughts come from?", Status.PROCESSED, employee232, customer494,4);

date = 1483355040000l;

DataGenerator.setValueToField(ticket386, "creationDate", new Date(date));

ticketManager.add(ticket386);

Ticket ticket387 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.SOLVED, employee223, customer429,9);

date = 1483106470000l;

DataGenerator.setValueToField(ticket387, "creationDate", new Date(date));

ticketManager.add(ticket387);

Ticket ticket388 = new Ticket("I really want to go to work, but I am too sick to drive.", Status.RECORDED, employee143, customer393,2);

date = 1483149943000l;

DataGenerator.setValueToField(ticket388, "creationDate", new Date(date));

ticketManager.add(ticket388);

Ticket ticket389 = new Ticket("Everyone was busy, so I went to the movie alone.", Status.SOLVED, employee193, customer452,8);

date = 1483289012000l;

DataGenerator.setValueToField(ticket389, "creationDate", new Date(date));

ticketManager.add(ticket389);

Ticket ticket390 = new Ticket("Check back tomorrow. I will see if the book has arrived.", Status.RECORDED, employee116, customer287,0);

date = 1483616570000l;

DataGenerator.setValueToField(ticket390, "creationDate", new Date(date));

ticketManager.add(ticket390);

Ticket ticket391 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.RECORDED, employee243, customer287,8);

date = 1483600461000l;

DataGenerator.setValueToField(ticket391, "creationDate", new Date(date));

ticketManager.add(ticket391);

Ticket ticket392 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", Status.SOLVED, employee80, customer269,2);

date = 1483328454000l;

DataGenerator.setValueToField(ticket392, "creationDate", new Date(date));

ticketManager.add(ticket392);

Ticket ticket393 = new Ticket("We need to rent a room for our party.", Status.RECORDED, employee180, customer354,5);

date = 1483066710000l;

DataGenerator.setValueToField(ticket393, "creationDate", new Date(date));

ticketManager.add(ticket393);

Ticket ticket394 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.WAITING_FOR_FEEDBACK, employee71, customer404,9);

date = 1483242216000l;

DataGenerator.setValueToField(ticket394, "creationDate", new Date(date));

ticketManager.add(ticket394);

Ticket ticket395 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.PROCESSED, employee87, customer323,4);

date = 1483101524000l;

DataGenerator.setValueToField(ticket395, "creationDate", new Date(date));

ticketManager.add(ticket395);

Ticket ticket396 = new Ticket("Check back tomorrow. I will see if the book has arrived.", Status.CLOSED, employee222, customer440,2);

date = 1483069975000l;

DataGenerator.setValueToField(ticket396, "creationDate", new Date(date));

ticketManager.add(ticket396);

Ticket ticket397 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.CLOSED, employee92, customer382,8);

date = 1483280886000l;

DataGenerator.setValueToField(ticket397, "creationDate", new Date(date));

ticketManager.add(ticket397);

Ticket ticket398 = new Ticket("They got there early, and they got really good seats.", Status.WAITING_FOR_FEEDBACK, employee123, customer286,6);

date = 1483503948000l;

DataGenerator.setValueToField(ticket398, "creationDate", new Date(date));

ticketManager.add(ticket398);

Ticket ticket399 = new Ticket("I hear that Nancy is very pretty.", Status.RECORDED, employee0, customer396,2);

date = 1483557439000l;

DataGenerator.setValueToField(ticket399, "creationDate", new Date(date));

ticketManager.add(ticket399);

Ticket ticket400 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.PROCESSED, employee47, customer447,5);

date = 1483162655000l;

DataGenerator.setValueToField(ticket400, "creationDate", new Date(date));

ticketManager.add(ticket400);

Ticket ticket401 = new Ticket("She folded her handkerchief neatly.", Status.WAITING_FOR_FEEDBACK, employee163, customer488,0);

date = 1483362294000l;

DataGenerator.setValueToField(ticket401, "creationDate", new Date(date));

ticketManager.add(ticket401);

Ticket ticket402 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.SOLVED, employee95, customer432,5);

date = 1483299694000l;

DataGenerator.setValueToField(ticket402, "creationDate", new Date(date));

ticketManager.add(ticket402);

Ticket ticket403 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.CLOSED, employee193, customer464,0);

date = 1483021143000l;

DataGenerator.setValueToField(ticket403, "creationDate", new Date(date));

ticketManager.add(ticket403);

Ticket ticket404 = new Ticket("Abstraction is often one floor above you.", Status.WAITING_FOR_FEEDBACK, employee49, customer445,6);

date = 1483228516000l;

DataGenerator.setValueToField(ticket404, "creationDate", new Date(date));

ticketManager.add(ticket404);

Ticket ticket405 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.PROCESSED, employee124, customer370,2);

date = 1483383553000l;

DataGenerator.setValueToField(ticket405, "creationDate", new Date(date));

ticketManager.add(ticket405);

Ticket ticket406 = new Ticket("He told us a very exciting adventure story.", Status.WAITING_FOR_FEEDBACK, employee134, customer253,0);

date = 1483331262000l;

DataGenerator.setValueToField(ticket406, "creationDate", new Date(date));

ticketManager.add(ticket406);

Ticket ticket407 = new Ticket("It was getting dark, and we weren’t there yet.", Status.WAITING_FOR_FEEDBACK, employee112, customer365,4);

date = 1483146482000l;

DataGenerator.setValueToField(ticket407, "creationDate", new Date(date));

ticketManager.add(ticket407);

Ticket ticket408 = new Ticket("The lake is a long way from here.", Status.WAITING_FOR_FEEDBACK, employee32, customer298,1);

date = 1483608977000l;

DataGenerator.setValueToField(ticket408, "creationDate", new Date(date));

ticketManager.add(ticket408);

Ticket ticket409 = new Ticket("They got there early, and they got really good seats.", Status.CLOSED, employee68, customer419,4);

date = 1483520871000l;

DataGenerator.setValueToField(ticket409, "creationDate", new Date(date));

ticketManager.add(ticket409);

Ticket ticket410 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.SOLVED, employee73, customer318,8);

date = 1483231403000l;

DataGenerator.setValueToField(ticket410, "creationDate", new Date(date));

ticketManager.add(ticket410);

Ticket ticket411 = new Ticket("I am counting my calories, yet I really want dessert.", Status.SOLVED, employee104, customer421,0);

date = 1483304515000l;

DataGenerator.setValueToField(ticket411, "creationDate", new Date(date));

ticketManager.add(ticket411);

Ticket ticket412 = new Ticket("We have a lot of rain in June.", Status.WAITING_FOR_FEEDBACK, employee47, customer471,5);

date = 1483185704000l;

DataGenerator.setValueToField(ticket412, "creationDate", new Date(date));

ticketManager.add(ticket412);

Ticket ticket413 = new Ticket("Wow, does that work?", Status.RECORDED, employee155, customer307,6);

date = 1483193394000l;

DataGenerator.setValueToField(ticket413, "creationDate", new Date(date));

ticketManager.add(ticket413);

Ticket ticket414 = new Ticket("Tom got a small piece of pie.", Status.RECORDED, employee201, customer383,7);

date = 1483287123000l;

DataGenerator.setValueToField(ticket414, "creationDate", new Date(date));

ticketManager.add(ticket414);

Ticket ticket415 = new Ticket("Wow, does that work?", Status.SOLVED, employee112, customer390,7);

date = 1483600096000l;

DataGenerator.setValueToField(ticket415, "creationDate", new Date(date));

ticketManager.add(ticket415);

Ticket ticket416 = new Ticket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.SOLVED, employee169, customer268,7);

date = 1483432630000l;

DataGenerator.setValueToField(ticket416, "creationDate", new Date(date));

ticketManager.add(ticket416);

Ticket ticket417 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", Status.CLOSED, employee124, customer477,1);

date = 1483202964000l;

DataGenerator.setValueToField(ticket417, "creationDate", new Date(date));

ticketManager.add(ticket417);

Ticket ticket418 = new Ticket("She did her best to help him.", Status.SOLVED, employee86, customer332,5);

date = 1483600341000l;

DataGenerator.setValueToField(ticket418, "creationDate", new Date(date));

ticketManager.add(ticket418);

Ticket ticket419 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee191, customer301,1);

date = 1483438331000l;

DataGenerator.setValueToField(ticket419, "creationDate", new Date(date));

ticketManager.add(ticket419);

Ticket ticket420 = new Ticket("Where do random thoughts come from?", Status.CLOSED, employee98, customer451,7);

date = 1483017210000l;

DataGenerator.setValueToField(ticket420, "creationDate", new Date(date));

ticketManager.add(ticket420);

Ticket ticket421 = new Ticket("She only paints with bold colors. she does not like pastels.", Status.PROCESSED, employee246, customer430,10);

date = 1483119298000l;

DataGenerator.setValueToField(ticket421, "creationDate", new Date(date));

ticketManager.add(ticket421);

Ticket ticket422 = new Ticket("She wrote him a long letter, but he didn't read it.", Status.RECORDED, employee47, customer383,8);

date = 1483502161000l;

DataGenerator.setValueToField(ticket422, "creationDate", new Date(date));

ticketManager.add(ticket422);

Ticket ticket423 = new Ticket("Everyone was busy, so I went to the movie alone.", Status.PROCESSED, employee182, customer293,4);

date = 1483042035000l;

DataGenerator.setValueToField(ticket423, "creationDate", new Date(date));

ticketManager.add(ticket423);

Ticket ticket424 = new Ticket("The river stole the gods.", Status.SOLVED, employee186, customer374,5);

date = 1483566172000l;

DataGenerator.setValueToField(ticket424, "creationDate", new Date(date));

ticketManager.add(ticket424);

Ticket ticket425 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee175, customer486,2);

date = 1483156037000l;

DataGenerator.setValueToField(ticket425, "creationDate", new Date(date));

ticketManager.add(ticket425);

Ticket ticket426 = new Ticket("I am never at home on Sundays.", Status.CLOSED, employee232, customer402,8);

date = 1483313139000l;

DataGenerator.setValueToField(ticket426, "creationDate", new Date(date));

ticketManager.add(ticket426);

Ticket ticket427 = new Ticket("I hear that Nancy is very pretty.", Status.SOLVED, employee229, customer328,10);

date = 1483516300000l;

DataGenerator.setValueToField(ticket427, "creationDate", new Date(date));

ticketManager.add(ticket427);

Ticket ticket428 = new Ticket("The river stole the gods.", Status.PROCESSED, employee185, customer411,0);

date = 1483333605000l;

DataGenerator.setValueToField(ticket428, "creationDate", new Date(date));

ticketManager.add(ticket428);

Ticket ticket429 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", Status.RECORDED, employee17, customer401,1);

date = 1483559003000l;

DataGenerator.setValueToField(ticket429, "creationDate", new Date(date));

ticketManager.add(ticket429);

Ticket ticket430 = new Ticket("He said he was not there yesterday. however, many people saw him there.", Status.RECORDED, employee80, customer351,2);

date = 1483118014000l;

DataGenerator.setValueToField(ticket430, "creationDate", new Date(date));

ticketManager.add(ticket430);

Ticket ticket431 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.RECORDED, employee30, customer349,10);

date = 1483252782000l;

DataGenerator.setValueToField(ticket431, "creationDate", new Date(date));

ticketManager.add(ticket431);

Ticket ticket432 = new Ticket("Check back tomorrow. I will see if the book has arrived.", Status.CLOSED, employee173, customer425,3);

date = 1483585432000l;

DataGenerator.setValueToField(ticket432, "creationDate", new Date(date));

ticketManager.add(ticket432);

Ticket ticket433 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.WAITING_FOR_FEEDBACK, employee172, customer305,2);

date = 1483561875000l;

DataGenerator.setValueToField(ticket433, "creationDate", new Date(date));

ticketManager.add(ticket433);

Ticket ticket434 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", Status.SOLVED, employee76, customer451,4);

date = 1483439000000l;

DataGenerator.setValueToField(ticket434, "creationDate", new Date(date));

ticketManager.add(ticket434);

Ticket ticket435 = new Ticket("Don't step on the broken glass.", Status.SOLVED, employee211, customer422,2);

date = 1483570352000l;

DataGenerator.setValueToField(ticket435, "creationDate", new Date(date));

ticketManager.add(ticket435);

Ticket ticket436 = new Ticket("She always speaks to him in a loud voice.", Status.PROCESSED, employee47, customer374,6);

date = 1483193656000l;

DataGenerator.setValueToField(ticket436, "creationDate", new Date(date));

ticketManager.add(ticket436);

Ticket ticket437 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee154, customer383,5);

date = 1483181933000l;

DataGenerator.setValueToField(ticket437, "creationDate", new Date(date));

ticketManager.add(ticket437);

Ticket ticket438 = new Ticket("The stranger officiates the meal.", Status.CLOSED, employee140, customer366,6);

date = 1483586153000l;

DataGenerator.setValueToField(ticket438, "creationDate", new Date(date));

ticketManager.add(ticket438);

Ticket ticket439 = new Ticket("We need to rent a room for our party.", Status.PROCESSED, employee222, customer424,5);

date = 1483473632000l;

DataGenerator.setValueToField(ticket439, "creationDate", new Date(date));

ticketManager.add(ticket439);

Ticket ticket440 = new Ticket("She was too short to see over the fence.", Status.PROCESSED, employee44, customer341,3);

date = 1483189208000l;

DataGenerator.setValueToField(ticket440, "creationDate", new Date(date));

ticketManager.add(ticket440);

Ticket ticket441 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.WAITING_FOR_FEEDBACK, employee1, customer301,6);

date = 1483415917000l;

DataGenerator.setValueToField(ticket441, "creationDate", new Date(date));

ticketManager.add(ticket441);

Ticket ticket442 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", Status.WAITING_FOR_FEEDBACK, employee176, customer250,10);

date = 1483218949000l;

DataGenerator.setValueToField(ticket442, "creationDate", new Date(date));

ticketManager.add(ticket442);

Ticket ticket443 = new Ticket("Sixty-Four comes asking for bread.", Status.SOLVED, employee100, customer263,0);

date = 1483456744000l;

DataGenerator.setValueToField(ticket443, "creationDate", new Date(date));

ticketManager.add(ticket443);

Ticket ticket444 = new Ticket("She did her best to help him.", Status.RECORDED, employee184, customer375,0);

date = 1483486430000l;

DataGenerator.setValueToField(ticket444, "creationDate", new Date(date));

ticketManager.add(ticket444);

Ticket ticket445 = new Ticket("The waves were crashing on the shore. it was a lovely sight.", Status.WAITING_FOR_FEEDBACK, employee17, customer382,0);

date = 1483425005000l;

DataGenerator.setValueToField(ticket445, "creationDate", new Date(date));

ticketManager.add(ticket445);

Ticket ticket446 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", Status.RECORDED, employee101, customer280,4);

date = 1483078276000l;

DataGenerator.setValueToField(ticket446, "creationDate", new Date(date));

ticketManager.add(ticket446);

Ticket ticket447 = new Ticket("I think I will buy the red car, or I will lease the blue one.", Status.CLOSED, employee85, customer311,8);

date = 1483155651000l;

DataGenerator.setValueToField(ticket447, "creationDate", new Date(date));

ticketManager.add(ticket447);

Ticket ticket448 = new Ticket("She was too short to see over the fence.", Status.CLOSED, employee180, customer284,7);

date = 1483346339000l;

DataGenerator.setValueToField(ticket448, "creationDate", new Date(date));

ticketManager.add(ticket448);

Ticket ticket449 = new Ticket("If I don’t like something, I’ll stay away from it.", Status.CLOSED, employee86, customer255,10);

date = 1483123011000l;

DataGenerator.setValueToField(ticket449, "creationDate", new Date(date));

ticketManager.add(ticket449);

Ticket ticket450 = new Ticket("Check back tomorrow. I will see if the book has arrived.", Status.RECORDED, employee240, customer345,9);

date = 1483122622000l;

DataGenerator.setValueToField(ticket450, "creationDate", new Date(date));

ticketManager.add(ticket450);

Ticket ticket451 = new Ticket("He told us a very exciting adventure story.", Status.SOLVED, employee203, customer354,8);

date = 1483148240000l;

DataGenerator.setValueToField(ticket451, "creationDate", new Date(date));

ticketManager.add(ticket451);

Ticket ticket452 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.RECORDED, employee180, customer338,10);

date = 1483539473000l;

DataGenerator.setValueToField(ticket452, "creationDate", new Date(date));

ticketManager.add(ticket452);

Ticket ticket453 = new Ticket("I want to buy a onesie… but know it won’t suit me.", Status.PROCESSED, employee177, customer289,5);

date = 1483318477000l;

DataGenerator.setValueToField(ticket453, "creationDate", new Date(date));

ticketManager.add(ticket453);

Ticket ticket454 = new Ticket("She only paints with bold colors. she does not like pastels.", Status.SOLVED, employee146, customer414,7);

date = 1483602853000l;

DataGenerator.setValueToField(ticket454, "creationDate", new Date(date));

ticketManager.add(ticket454);

Ticket ticket455 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.WAITING_FOR_FEEDBACK, employee150, customer385,8);

date = 1483199468000l;

DataGenerator.setValueToField(ticket455, "creationDate", new Date(date));

ticketManager.add(ticket455);

Ticket ticket456 = new Ticket("I want more detailed information.", Status.SOLVED, employee196, customer486,4);

date = 1483203407000l;

DataGenerator.setValueToField(ticket456, "creationDate", new Date(date));

ticketManager.add(ticket456);

Ticket ticket457 = new Ticket("The sky is clear. the stars are twinkling.", Status.PROCESSED, employee16, customer361,9);

date = 1483416579000l;

DataGenerator.setValueToField(ticket457, "creationDate", new Date(date));

ticketManager.add(ticket457);

Ticket ticket458 = new Ticket("Joe made the sugar cookies. Susan decorated them.", Status.RECORDED, employee55, customer356,7);

date = 1483336673000l;

DataGenerator.setValueToField(ticket458, "creationDate", new Date(date));

ticketManager.add(ticket458);

Ticket ticket459 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.PROCESSED, employee34, customer307,1);

date = 1483499962000l;

DataGenerator.setValueToField(ticket459, "creationDate", new Date(date));

ticketManager.add(ticket459);

Ticket ticket460 = new Ticket("I currently have 4 windows open up… and I don’t know why.", Status.RECORDED, employee248, customer442,6);

date = 1483217228000l;

DataGenerator.setValueToField(ticket460, "creationDate", new Date(date));

ticketManager.add(ticket460);

Ticket ticket461 = new Ticket("Abstraction is often one floor above you.", Status.WAITING_FOR_FEEDBACK, employee145, customer367,7);

date = 1483297455000l;

DataGenerator.setValueToField(ticket461, "creationDate", new Date(date));

ticketManager.add(ticket461);

Ticket ticket462 = new Ticket("I often see the time 11:11 or 12:34 on clocks.", Status.WAITING_FOR_FEEDBACK, employee180, customer348,0);

date = 1483527111000l;

DataGenerator.setValueToField(ticket462, "creationDate", new Date(date));

ticketManager.add(ticket462);

Ticket ticket463 = new Ticket("I want more detailed information.", Status.SOLVED, employee240, customer496,2);

date = 1483244502000l;

DataGenerator.setValueToField(ticket463, "creationDate", new Date(date));

ticketManager.add(ticket463);

Ticket ticket464 = new Ticket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.WAITING_FOR_FEEDBACK, employee49, customer253,6);

date = 1483226404000l;

DataGenerator.setValueToField(ticket464, "creationDate", new Date(date));

ticketManager.add(ticket464);

Ticket ticket465 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee72, customer371,1);

date = 1483287378000l;

DataGenerator.setValueToField(ticket465, "creationDate", new Date(date));

ticketManager.add(ticket465);

Ticket ticket466 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", Status.WAITING_FOR_FEEDBACK, employee237, customer299,5);

date = 1483114227000l;

DataGenerator.setValueToField(ticket466, "creationDate", new Date(date));

ticketManager.add(ticket466);

Ticket ticket467 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", Status.PROCESSED, employee203, customer345,1);

date = 1483399648000l;

DataGenerator.setValueToField(ticket467, "creationDate", new Date(date));

ticketManager.add(ticket467);

Ticket ticket468 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee65, customer277,9);

date = 1483179510000l;

DataGenerator.setValueToField(ticket468, "creationDate", new Date(date));

ticketManager.add(ticket468);

Ticket ticket469 = new Ticket("Tom got a small piece of pie.", Status.RECORDED, employee217, customer316,3);

date = 1483127913000l;

DataGenerator.setValueToField(ticket469, "creationDate", new Date(date));

ticketManager.add(ticket469);

Ticket ticket470 = new Ticket("She did her best to help him.", Status.PROCESSED, employee223, customer398,7);

date = 1483092613000l;

DataGenerator.setValueToField(ticket470, "creationDate", new Date(date));

ticketManager.add(ticket470);

Ticket ticket471 = new Ticket("She advised him to come back at once.", Status.CLOSED, employee70, customer437,10);

date = 1483591441000l;

DataGenerator.setValueToField(ticket471, "creationDate", new Date(date));

ticketManager.add(ticket471);

Ticket ticket472 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", Status.CLOSED, employee99, customer392,10);

date = 1483455582000l;

DataGenerator.setValueToField(ticket472, "creationDate", new Date(date));

ticketManager.add(ticket472);

Ticket ticket473 = new Ticket("She did her best to help him.", Status.PROCESSED, employee18, customer261,3);

date = 1483042449000l;

DataGenerator.setValueToField(ticket473, "creationDate", new Date(date));

ticketManager.add(ticket473);

Ticket ticket474 = new Ticket("Hurry!", Status.RECORDED, employee37, customer352,7);

date = 1483466781000l;

DataGenerator.setValueToField(ticket474, "creationDate", new Date(date));

ticketManager.add(ticket474);

Ticket ticket475 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", Status.WAITING_FOR_FEEDBACK, employee60, customer357,8);

date = 1483491688000l;

DataGenerator.setValueToField(ticket475, "creationDate", new Date(date));

ticketManager.add(ticket475);

Ticket ticket476 = new Ticket("The shooter says goodbye to his love.", Status.SOLVED, employee46, customer326,5);

date = 1483509323000l;

DataGenerator.setValueToField(ticket476, "creationDate", new Date(date));

ticketManager.add(ticket476);

Ticket ticket477 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.WAITING_FOR_FEEDBACK, employee55, customer293,5);

date = 1483458060000l;

DataGenerator.setValueToField(ticket477, "creationDate", new Date(date));

ticketManager.add(ticket477);

Ticket ticket478 = new Ticket("The body may perhaps compensates for the loss of a true metaphysics.", Status.WAITING_FOR_FEEDBACK, employee200, customer361,3);

date = 1483522650000l;

DataGenerator.setValueToField(ticket478, "creationDate", new Date(date));

ticketManager.add(ticket478);

Ticket ticket479 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.RECORDED, employee104, customer350,7);

date = 1483072601000l;

DataGenerator.setValueToField(ticket479, "creationDate", new Date(date));

ticketManager.add(ticket479);

Ticket ticket480 = new Ticket("We have never been to Asia, nor have we visited Africa.", Status.PROCESSED, employee178, customer398,2);

date = 1483197587000l;

DataGenerator.setValueToField(ticket480, "creationDate", new Date(date));

ticketManager.add(ticket480);

Ticket ticket481 = new Ticket("I'd rather be a bird than a fish.", Status.PROCESSED, employee55, customer415,1);

date = 1483340420000l;

DataGenerator.setValueToField(ticket481, "creationDate", new Date(date));

ticketManager.add(ticket481);

Ticket ticket482 = new Ticket("It was getting dark, and we weren’t there yet.", Status.RECORDED, employee151, customer296,7);

date = 1483180401000l;

DataGenerator.setValueToField(ticket482, "creationDate", new Date(date));

ticketManager.add(ticket482);

Ticket ticket483 = new Ticket("Where do random thoughts come from?", Status.CLOSED, employee98, customer365,4);

date = 1483456631000l;

DataGenerator.setValueToField(ticket483, "creationDate", new Date(date));

ticketManager.add(ticket483);

Ticket ticket484 = new Ticket("She did her best to help him.", Status.PROCESSED, employee176, customer343,2);

date = 1483204387000l;

DataGenerator.setValueToField(ticket484, "creationDate", new Date(date));

ticketManager.add(ticket484);

Ticket ticket485 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", Status.SOLVED, employee96, customer301,9);

date = 1483405894000l;

DataGenerator.setValueToField(ticket485, "creationDate", new Date(date));

ticketManager.add(ticket485);

Ticket ticket486 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.PROCESSED, employee114, customer463,1);

date = 1483180388000l;

DataGenerator.setValueToField(ticket486, "creationDate", new Date(date));

ticketManager.add(ticket486);

Ticket ticket487 = new Ticket("She wrote him a long letter, but he didn't read it.", Status.PROCESSED, employee0, customer397,3);

date = 1483565560000l;

DataGenerator.setValueToField(ticket487, "creationDate", new Date(date));

ticketManager.add(ticket487);

Ticket ticket488 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.PROCESSED, employee5, customer272,7);

date = 1483543722000l;

DataGenerator.setValueToField(ticket488, "creationDate", new Date(date));

ticketManager.add(ticket488);

Ticket ticket489 = new Ticket("Cats are good pets, for they are clean and are not noisy.", Status.WAITING_FOR_FEEDBACK, employee120, customer251,4);

date = 1483184852000l;

DataGenerator.setValueToField(ticket489, "creationDate", new Date(date));

ticketManager.add(ticket489);

Ticket ticket490 = new Ticket("She did her best to help him.", Status.WAITING_FOR_FEEDBACK, employee111, customer416,0);

date = 1483322284000l;

DataGenerator.setValueToField(ticket490, "creationDate", new Date(date));

ticketManager.add(ticket490);

Ticket ticket491 = new Ticket("This is a Japanese doll.", Status.CLOSED, employee172, customer423,0);

date = 1483360789000l;

DataGenerator.setValueToField(ticket491, "creationDate", new Date(date));

ticketManager.add(ticket491);

Ticket ticket492 = new Ticket("It was getting dark, and we weren’t there yet.", Status.RECORDED, employee236, customer271,0);

date = 1483351617000l;

DataGenerator.setValueToField(ticket492, "creationDate", new Date(date));

ticketManager.add(ticket492);

Ticket ticket493 = new Ticket("She folded her handkerchief neatly.", Status.SOLVED, employee162, customer294,7);

date = 1483064096000l;

DataGenerator.setValueToField(ticket493, "creationDate", new Date(date));

ticketManager.add(ticket493);

Ticket ticket494 = new Ticket("I really want to go to work, but I am too sick to drive.", Status.SOLVED, employee20, customer473,0);

date = 1483210356000l;

DataGenerator.setValueToField(ticket494, "creationDate", new Date(date));

ticketManager.add(ticket494);

Ticket ticket495 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", Status.RECORDED, employee212, customer371,7);

date = 1483266702000l;

DataGenerator.setValueToField(ticket495, "creationDate", new Date(date));

ticketManager.add(ticket495);

Ticket ticket496 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.WAITING_FOR_FEEDBACK, employee67, customer350,5);

date = 1483308379000l;

DataGenerator.setValueToField(ticket496, "creationDate", new Date(date));

ticketManager.add(ticket496);

Ticket ticket497 = new Ticket("I am counting my calories, yet I really want dessert.", Status.RECORDED, employee164, customer416,0);

date = 1483492527000l;

DataGenerator.setValueToField(ticket497, "creationDate", new Date(date));

ticketManager.add(ticket497);

Ticket ticket498 = new Ticket("I want more detailed information.", Status.RECORDED, employee71, customer257,4);

date = 1483148322000l;

DataGenerator.setValueToField(ticket498, "creationDate", new Date(date));

ticketManager.add(ticket498);

Ticket ticket499 = new Ticket("Let me help you with your baggage.", Status.SOLVED, employee62, customer497,0);

date = 1483097419000l;

DataGenerator.setValueToField(ticket499, "creationDate", new Date(date));

ticketManager.add(ticket499);

}
}