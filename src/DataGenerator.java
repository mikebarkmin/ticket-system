import de.ddi.ticketsystem.*;

import java.util.Date;

import java.lang.reflect.Field;

public class DataGenerator {

public static Employee employee;

public static Customer customer;

public static long date;

public static void setValueToField(Object o, String name, Object content) {         Field field;         try { field = o.getClass().getDeclaredField(name); field.setAccessible(true); field.set(o, content);         } catch (Exception e) {         try { field = o.getClass().getSuperclass().getDeclaredField(name);         field.setAccessible(true); field.set(o, content);         } catch (Exception b) { System.out.println(b); } } }

public static void fillTicketManager(TicketManager ticketManager) {

Employee employee0 = new Employee("Benjamin", "Landry", "benjamin.landry@our-company.com", "IT");

employee = employee0;

Employee employee1 = new Employee("Leanna", "Glenn", "leanna.glenn@our-company.com", "Management");

Employee employee2 = new Employee("Davian", "Krueger", "davian.krueger@our-company.com", "Warrehousing");

Employee employee3 = new Employee("Isla", "Combs", "isla.combs@our-company.com", "Management");

Employee employee4 = new Employee("Annika", "Gross", "annika.gross@our-company.com", "Technical Support");

Employee employee5 = new Employee("Deon", "Blankenship", "deon.blankenship@our-company.com", "Warrehousing");

Employee employee6 = new Employee("Naima", "Herring", "naima.herring@our-company.com", "Warrehousing");

Employee employee7 = new Employee("Lara", "Baird", "lara.baird@our-company.com", "Marketing");

Employee employee8 = new Employee("Gina", "Nguyen", "gina.nguyen@our-company.com", "Marketing");

Employee employee9 = new Employee("Kadyn", "Pierce", "kadyn.pierce@our-company.com", "Marketing");

Employee employee10 = new Employee("Patience", "Cole", "patience.cole@our-company.com", "Logistic");

Employee employee11 = new Employee("Johnathan", "Hardin", "johnathan.hardin@our-company.com", "IT");

Employee employee12 = new Employee("Ethan", "Donaldson", "ethan.donaldson@our-company.com", "Management");

Employee employee13 = new Employee("Diana", "Stanton", "diana.stanton@our-company.com", "Logistic");

Employee employee14 = new Employee("Dylan", "Harmon", "dylan.harmon@our-company.com", "Management");

Employee employee15 = new Employee("Ian", "Kelley", "ian.kelley@our-company.com", "IT");

Employee employee16 = new Employee("Leia", "Day", "leia.day@our-company.com", "Logistic");

Employee employee17 = new Employee("Fabian", "Dixon", "fabian.dixon@our-company.com", "Warrehousing");

Employee employee18 = new Employee("Marley", "Barker", "marley.barker@our-company.com", "Logistic");

Employee employee19 = new Employee("Paige", "Singh", "paige.singh@our-company.com", "Logistic");

Employee employee20 = new Employee("Jaime", "Becker", "jaime.becker@our-company.com", "Management");

Employee employee21 = new Employee("Ernesto", "Mendez", "ernesto.mendez@our-company.com", "Management");

Employee employee22 = new Employee("Josiah", "Garcia", "josiah.garcia@our-company.com", "IT");

Employee employee23 = new Employee("Kaia", "Velazquez", "kaia.velazquez@our-company.com", "Logistic");

Employee employee24 = new Employee("Jeramiah", "Douglas", "jeramiah.douglas@our-company.com", "Logistic");

Employee employee25 = new Employee("Jude", "Wallace", "jude.wallace@our-company.com", "Marketing");

Employee employee26 = new Employee("Jaylene", "Merritt", "jaylene.merritt@our-company.com", "IT");

Employee employee27 = new Employee("Cael", "Peck", "cael.peck@our-company.com", "Marketing");

Employee employee28 = new Employee("Uriel", "Smith", "uriel.smith@our-company.com", "Logistic");

Employee employee29 = new Employee("Anahi", "Webster", "anahi.webster@our-company.com", "Management");

Employee employee30 = new Employee("Connor", "Jenkins", "connor.jenkins@our-company.com", "Marketing");

Employee employee31 = new Employee("Sergio", "Carroll", "sergio.carroll@our-company.com", "IT");

Employee employee32 = new Employee("Santino", "Carey", "santino.carey@our-company.com", "IT");

Employee employee33 = new Employee("Nikolas", "Hancock", "nikolas.hancock@our-company.com", "Warrehousing");

Employee employee34 = new Employee("Alani", "Hunter", "alani.hunter@our-company.com", "Logistic");

Employee employee35 = new Employee("Gerald", "Payne", "gerald.payne@our-company.com", "Warrehousing");

Employee employee36 = new Employee("Markus", "Torres", "markus.torres@our-company.com", "IT");

Employee employee37 = new Employee("Adonis", "Moss", "adonis.moss@our-company.com", "Management");

Employee employee38 = new Employee("Kendrick", "Arias", "kendrick.arias@our-company.com", "Management");

Employee employee39 = new Employee("Abdullah", "Gutierrez", "abdullah.gutierrez@our-company.com", "Warrehousing");

Employee employee40 = new Employee("Marc", "Cox", "marc.cox@our-company.com", "Warrehousing");

Employee employee41 = new Employee("Raina", "Vance", "raina.vance@our-company.com", "Technical Support");

Employee employee42 = new Employee("Deandre", "Mccarty", "deandre.mccarty@our-company.com", "Management");

Employee employee43 = new Employee("Semaj", "Gates", "semaj.gates@our-company.com", "Technical Support");

Employee employee44 = new Employee("Alena", "Preston", "alena.preston@our-company.com", "Technical Support");

Employee employee45 = new Employee("Juan", "Horton", "juan.horton@our-company.com", "Management");

Employee employee46 = new Employee("Messiah", "Riddle", "messiah.riddle@our-company.com", "Warrehousing");

Employee employee47 = new Employee("Luis", "Wells", "luis.wells@our-company.com", "Technical Support");

Employee employee48 = new Employee("Valentina", "Stone", "valentina.stone@our-company.com", "Marketing");

Employee employee49 = new Employee("Amiyah", "Schwartz", "amiyah.schwartz@our-company.com", "IT");

Employee employee50 = new Employee("Ruth", "Villa", "ruth.villa@our-company.com", "Logistic");

Employee employee51 = new Employee("Nina", "Lynn", "nina.lynn@our-company.com", "IT");

Employee employee52 = new Employee("Leah", "Massey", "leah.massey@our-company.com", "IT");

Employee employee53 = new Employee("Lillian", "Hubbard", "lillian.hubbard@our-company.com", "Logistic");

Employee employee54 = new Employee("Elisabeth", "Willis", "elisabeth.willis@our-company.com", "Logistic");

Employee employee55 = new Employee("Mackenzie", "Wong", "mackenzie.wong@our-company.com", "Management");

Employee employee56 = new Employee("Ella", "Stokes", "ella.stokes@our-company.com", "Marketing");

Employee employee57 = new Employee("Anaya", "Brown", "anaya.brown@our-company.com", "Warrehousing");

Employee employee58 = new Employee("Dax", "Riley", "dax.riley@our-company.com", "IT");

Employee employee59 = new Employee("Caitlin", "Kane", "caitlin.kane@our-company.com", "Logistic");

Employee employee60 = new Employee("Pierce", "Mcgrath", "pierce.mcgrath@our-company.com", "IT");

Employee employee61 = new Employee("Paityn", "Reilly", "paityn.reilly@our-company.com", "Management");

Employee employee62 = new Employee("Keely", "Baker", "keely.baker@our-company.com", "Warrehousing");

Employee employee63 = new Employee("Nathalia", "Barton", "nathalia.barton@our-company.com", "Warrehousing");

Employee employee64 = new Employee("Kameron", "Robbins", "kameron.robbins@our-company.com", "Technical Support");

Employee employee65 = new Employee("Xzavier", "Dean", "xzavier.dean@our-company.com", "Management");

Employee employee66 = new Employee("Ellen", "Galvan", "ellen.galvan@our-company.com", "Warrehousing");

Employee employee67 = new Employee("Paul", "Lindsey", "paul.lindsey@our-company.com", "Marketing");

Employee employee68 = new Employee("Kaleb", "Ramirez", "kaleb.ramirez@our-company.com", "IT");

Employee employee69 = new Employee("Karley", "Farley", "karley.farley@our-company.com", "Marketing");

Employee employee70 = new Employee("Natalya", "Fuller", "natalya.fuller@our-company.com", "Warrehousing");

Employee employee71 = new Employee("Javier", "Dougherty", "javier.dougherty@our-company.com", "Logistic");

Employee employee72 = new Employee("Danna", "Forbes", "danna.forbes@our-company.com", "Warrehousing");

Employee employee73 = new Employee("Clayton", "Wiggins", "clayton.wiggins@our-company.com", "Warrehousing");

Employee employee74 = new Employee("Jon", "Weaver", "jon.weaver@our-company.com", "Technical Support");

Employee employee75 = new Employee("Jamison", "Valencia", "jamison.valencia@our-company.com", "Technical Support");

Employee employee76 = new Employee("Anabella", "Hahn", "anabella.hahn@our-company.com", "IT");

Employee employee77 = new Employee("Micaela", "Morse", "micaela.morse@our-company.com", "Technical Support");

Employee employee78 = new Employee("Carter", "Holland", "carter.holland@our-company.com", "Logistic");

Employee employee79 = new Employee("Francesca", "Lopez", "francesca.lopez@our-company.com", "IT");

Employee employee80 = new Employee("Sage", "Rojas", "sage.rojas@our-company.com", "Warrehousing");

Employee employee81 = new Employee("Ibrahim", "Pope", "ibrahim.pope@our-company.com", "IT");

Employee employee82 = new Employee("Aubrey", "Li", "aubrey.li@our-company.com", "Logistic");

Employee employee83 = new Employee("Rodolfo", "Cannon", "rodolfo.cannon@our-company.com", "Marketing");

Employee employee84 = new Employee("Jaxson", "Wheeler", "jaxson.wheeler@our-company.com", "Marketing");

Employee employee85 = new Employee("Diya", "Austin", "diya.austin@our-company.com", "Marketing");

Employee employee86 = new Employee("Arnav", "Wolfe", "arnav.wolfe@our-company.com", "Warrehousing");

Employee employee87 = new Employee("Claudia", "Deleon", "claudia.deleon@our-company.com", "IT");

Employee employee88 = new Employee("Finnegan", "Kent", "finnegan.kent@our-company.com", "IT");

Employee employee89 = new Employee("Marquise", "Montgomery", "marquise.montgomery@our-company.com", "Marketing");

Employee employee90 = new Employee("Edward", "Mays", "edward.mays@our-company.com", "IT");

Employee employee91 = new Employee("King", "Harding", "king.harding@our-company.com", "Technical Support");

Employee employee92 = new Employee("Antwan", "Duran", "antwan.duran@our-company.com", "Warrehousing");

Employee employee93 = new Employee("Ryan", "Houston", "ryan.houston@our-company.com", "Warrehousing");

Employee employee94 = new Employee("Kyra", "Sexton", "kyra.sexton@our-company.com", "Warrehousing");

Employee employee95 = new Employee("Jayla", "Lawrence", "jayla.lawrence@our-company.com", "Logistic");

Employee employee96 = new Employee("Jaslyn", "Sloan", "jaslyn.sloan@our-company.com", "Logistic");

Employee employee97 = new Employee("Jewel", "Leonard", "jewel.leonard@our-company.com", "Technical Support");

Employee employee98 = new Employee("Saniyah", "Lozano", "saniyah.lozano@our-company.com", "Marketing");

Employee employee99 = new Employee("Naomi", "Randolph", "naomi.randolph@our-company.com", "Warrehousing");

Employee employee100 = new Employee("Miriam", "Clay", "miriam.clay@our-company.com", "Logistic");

Employee employee101 = new Employee("Lucy", "Bartlett", "lucy.bartlett@our-company.com", "Marketing");

Employee employee102 = new Employee("Grayson", "Tapia", "grayson.tapia@our-company.com", "Technical Support");

Employee employee103 = new Employee("Kaleigh", "Campbell", "kaleigh.campbell@our-company.com", "Logistic");

Employee employee104 = new Employee("Gwendolyn", "Luna", "gwendolyn.luna@our-company.com", "Marketing");

Employee employee105 = new Employee("Giselle", "Bryan", "giselle.bryan@our-company.com", "Warrehousing");

Employee employee106 = new Employee("Antonio", "Barber", "antonio.barber@our-company.com", "IT");

Employee employee107 = new Employee("Nash", "Newman", "nash.newman@our-company.com", "Logistic");

Employee employee108 = new Employee("Cameron", "David", "cameron.david@our-company.com", "IT");

Employee employee109 = new Employee("Sarai", "Christensen", "sarai.christensen@our-company.com", "Logistic");

Employee employee110 = new Employee("Ellie", "Fletcher", "ellie.fletcher@our-company.com", "Management");

Employee employee111 = new Employee("Savanna", "George", "savanna.george@our-company.com", "Warrehousing");

Employee employee112 = new Employee("Sydnee", "Sweeney", "sydnee.sweeney@our-company.com", "Logistic");

Employee employee113 = new Employee("Jordon", "Mccormick", "jordon.mccormick@our-company.com", "Warrehousing");

Employee employee114 = new Employee("Tyrone", "Velasquez", "tyrone.velasquez@our-company.com", "Warrehousing");

Employee employee115 = new Employee("Cherish", "Cohen", "cherish.cohen@our-company.com", "Warrehousing");

Employee employee116 = new Employee("Nathanial", "Mills", "nathanial.mills@our-company.com", "Technical Support");

Employee employee117 = new Employee("Kaylah", "Copeland", "kaylah.copeland@our-company.com", "Management");

Employee employee118 = new Employee("Rolando", "Rivas", "rolando.rivas@our-company.com", "IT");

Employee employee119 = new Employee("Yasmine", "Frey", "yasmine.frey@our-company.com", "IT");

Employee employee120 = new Employee("Aiyana", "Reyes", "aiyana.reyes@our-company.com", "Marketing");

Employee employee121 = new Employee("Justine", "Brady", "justine.brady@our-company.com", "Logistic");

Employee employee122 = new Employee("Colby", "Oliver", "colby.oliver@our-company.com", "Management");

Employee employee123 = new Employee("Madalynn", "Sharp", "madalynn.sharp@our-company.com", "Warrehousing");

Employee employee124 = new Employee("Clay", "Wang", "clay.wang@our-company.com", "Marketing");

Employee employee125 = new Employee("Laci", "Gibson", "laci.gibson@our-company.com", "Technical Support");

Employee employee126 = new Employee("Damion", "Moon", "damion.moon@our-company.com", "IT");

Employee employee127 = new Employee("Salvatore", "Olsen", "salvatore.olsen@our-company.com", "Management");

Employee employee128 = new Employee("Sloane", "Hobbs", "sloane.hobbs@our-company.com", "Warrehousing");

Employee employee129 = new Employee("Luz", "Wilkinson", "luz.wilkinson@our-company.com", "Technical Support");

Employee employee130 = new Employee("Gabriella", "Carlson", "gabriella.carlson@our-company.com", "Marketing");

Employee employee131 = new Employee("Jasmine", "Zhang", "jasmine.zhang@our-company.com", "Logistic");

Employee employee132 = new Employee("Mark", "Gallagher", "mark.gallagher@our-company.com", "Management");

Employee employee133 = new Employee("Aldo", "Mcknight", "aldo.mcknight@our-company.com", "Management");

Employee employee134 = new Employee("Joey", "Goodwin", "joey.goodwin@our-company.com", "Technical Support");

Employee employee135 = new Employee("Madden", "Waller", "madden.waller@our-company.com", "IT");

Employee employee136 = new Employee("Jack", "Pratt", "jack.pratt@our-company.com", "IT");

Employee employee137 = new Employee("Maia", "Holden", "maia.holden@our-company.com", "Logistic");

Employee employee138 = new Employee("Lea", "Walsh", "lea.walsh@our-company.com", "IT");

Employee employee139 = new Employee("Aydan", "Mcgee", "aydan.mcgee@our-company.com", "Technical Support");

Employee employee140 = new Employee("Leilani", "Carson", "leilani.carson@our-company.com", "Warrehousing");

Employee employee141 = new Employee("Leroy", "Crane", "leroy.crane@our-company.com", "IT");

Employee employee142 = new Employee("Grace", "Esparza", "grace.esparza@our-company.com", "Logistic");

Employee employee143 = new Employee("William", "Vincent", "william.vincent@our-company.com", "IT");

Employee employee144 = new Employee("Bethany", "Mathews", "bethany.mathews@our-company.com", "Technical Support");

Employee employee145 = new Employee("Pamela", "Ortega", "pamela.ortega@our-company.com", "Logistic");

Employee employee146 = new Employee("Lisa", "Montoya", "lisa.montoya@our-company.com", "Warrehousing");

Employee employee147 = new Employee("Janiya", "Branch", "janiya.branch@our-company.com", "Warrehousing");

Employee employee148 = new Employee("Alvaro", "Norman", "alvaro.norman@our-company.com", "Logistic");

Employee employee149 = new Employee("Sara", "Gallegos", "sara.gallegos@our-company.com", "Warrehousing");

Employee employee150 = new Employee("Elisha", "Cordova", "elisha.cordova@our-company.com", "Marketing");

Employee employee151 = new Employee("Celia", "Friedman", "celia.friedman@our-company.com", "Management");

Employee employee152 = new Employee("Lydia", "Lewis", "lydia.lewis@our-company.com", "Technical Support");

Employee employee153 = new Employee("Matias", "Mccoy", "matias.mccoy@our-company.com", "Marketing");

Employee employee154 = new Employee("Kaylyn", "Bright", "kaylyn.bright@our-company.com", "Management");

Employee employee155 = new Employee("Atticus", "Perez", "atticus.perez@our-company.com", "Management");

Employee employee156 = new Employee("Amya", "Chung", "amya.chung@our-company.com", "Warrehousing");

Employee employee157 = new Employee("Jaylen", "Beck", "jaylen.beck@our-company.com", "IT");

Employee employee158 = new Employee("Trevor", "Simon", "trevor.simon@our-company.com", "Warrehousing");

Employee employee159 = new Employee("Lexi", "Spencer", "lexi.spencer@our-company.com", "Warrehousing");

Employee employee160 = new Employee("Cloe", "James", "cloe.james@our-company.com", "Warrehousing");

Employee employee161 = new Employee("Abbey", "Weber", "abbey.weber@our-company.com", "Logistic");

Employee employee162 = new Employee("Rigoberto", "Avery", "rigoberto.avery@our-company.com", "Management");

Employee employee163 = new Employee("Carly", "Farrell", "carly.farrell@our-company.com", "Marketing");

Employee employee164 = new Employee("Bailey", "Golden", "bailey.golden@our-company.com", "Management");

Employee employee165 = new Employee("Paris", "Buckley", "paris.buckley@our-company.com", "Marketing");

Employee employee166 = new Employee("Gaven", "Duffy", "gaven.duffy@our-company.com", "IT");

Employee employee167 = new Employee("Talia", "Ritter", "talia.ritter@our-company.com", "Logistic");

Employee employee168 = new Employee("Braedon", "Webb", "braedon.webb@our-company.com", "Warrehousing");

Employee employee169 = new Employee("Regan", "Doyle", "regan.doyle@our-company.com", "Management");

Employee employee170 = new Employee("Gianni", "Horne", "gianni.horne@our-company.com", "IT");

Employee employee171 = new Employee("Kiley", "Weiss", "kiley.weiss@our-company.com", "IT");

Employee employee172 = new Employee("Broderick", "Glass", "broderick.glass@our-company.com", "Management");

Employee employee173 = new Employee("Gracie", "Rich", "gracie.rich@our-company.com", "Technical Support");

Employee employee174 = new Employee("Rishi", "Kerr", "rishi.kerr@our-company.com", "Warrehousing");

Employee employee175 = new Employee("Margaret", "Marquez", "margaret.marquez@our-company.com", "IT");

Employee employee176 = new Employee("Zaria", "Giles", "zaria.giles@our-company.com", "Logistic");

Employee employee177 = new Employee("Jocelyn", "Brewer", "jocelyn.brewer@our-company.com", "IT");

Employee employee178 = new Employee("Riya", "Zimmerman", "riya.zimmerman@our-company.com", "IT");

Employee employee179 = new Employee("Tori", "Haynes", "tori.haynes@our-company.com", "Marketing");

Employee employee180 = new Employee("Fisher", "Richards", "fisher.richards@our-company.com", "Marketing");

Employee employee181 = new Employee("Erin", "Gilmore", "erin.gilmore@our-company.com", "Management");

Employee employee182 = new Employee("Marshall", "Martin", "marshall.martin@our-company.com", "Marketing");

Employee employee183 = new Employee("Mila", "Arnold", "mila.arnold@our-company.com", "Marketing");

Employee employee184 = new Employee("Holden", "Holmes", "holden.holmes@our-company.com", "Technical Support");

Employee employee185 = new Employee("Hayden", "Steele", "hayden.steele@our-company.com", "IT");

Employee employee186 = new Employee("Shirley", "Francis", "shirley.francis@our-company.com", "IT");

Employee employee187 = new Employee("London", "Mejia", "london.mejia@our-company.com", "Technical Support");

Employee employee188 = new Employee("Ryan", "Henderson", "ryan.henderson@our-company.com", "Warrehousing");

Employee employee189 = new Employee("Tomas", "Graham", "tomas.graham@our-company.com", "Technical Support");

Employee employee190 = new Employee("Spencer", "Turner", "spencer.turner@our-company.com", "Warrehousing");

Employee employee191 = new Employee("Rylee", "Ferguson", "rylee.ferguson@our-company.com", "Management");

Employee employee192 = new Employee("Reuben", "Huber", "reuben.huber@our-company.com", "Management");

Employee employee193 = new Employee("Nia", "Christian", "nia.christian@our-company.com", "Technical Support");

Employee employee194 = new Employee("Eugene", "Morgan", "eugene.morgan@our-company.com", "Management");

Employee employee195 = new Employee("Shayna", "Wu", "shayna.wu@our-company.com", "Logistic");

Employee employee196 = new Employee("Ahmad", "Levine", "ahmad.levine@our-company.com", "Warrehousing");

Employee employee197 = new Employee("Aubree", "Hoffman", "aubree.hoffman@our-company.com", "Warrehousing");

Employee employee198 = new Employee("Enzo", "Vasquez", "enzo.vasquez@our-company.com", "Technical Support");

Employee employee199 = new Employee("Khalil", "Brennan", "khalil.brennan@our-company.com", "Marketing");

Employee employee200 = new Employee("Fernanda", "Duncan", "fernanda.duncan@our-company.com", "Technical Support");

Employee employee201 = new Employee("Alaina", "Cardenas", "alaina.cardenas@our-company.com", "Marketing");

Employee employee202 = new Employee("Cierra", "Knapp", "cierra.knapp@our-company.com", "Marketing");

Employee employee203 = new Employee("Humberto", "Mcdaniel", "humberto.mcdaniel@our-company.com", "Marketing");

Employee employee204 = new Employee("Keith", "Fitzgerald", "keith.fitzgerald@our-company.com", "IT");

Employee employee205 = new Employee("Mattie", "Mercado", "mattie.mercado@our-company.com", "Warrehousing");

Employee employee206 = new Employee("Augustus", "Jensen", "augustus.jensen@our-company.com", "Technical Support");

Employee employee207 = new Employee("Jaylan", "Lara", "jaylan.lara@our-company.com", "Technical Support");

Employee employee208 = new Employee("Ava", "Horn", "ava.horn@our-company.com", "Warrehousing");

Employee employee209 = new Employee("Samson", "Mathis", "samson.mathis@our-company.com", "Warrehousing");

Employee employee210 = new Employee("Kylee", "Johns", "kylee.johns@our-company.com", "Technical Support");

Employee employee211 = new Employee("Karter", "Koch", "karter.koch@our-company.com", "Warrehousing");

Employee employee212 = new Employee("Reagan", "Joyce", "reagan.joyce@our-company.com", "Warrehousing");

Employee employee213 = new Employee("Gunnar", "Bell", "gunnar.bell@our-company.com", "Warrehousing");

Employee employee214 = new Employee("Micheal", "Crawford", "micheal.crawford@our-company.com", "Technical Support");

Employee employee215 = new Employee("Haven", "Arellano", "haven.arellano@our-company.com", "Technical Support");

Employee employee216 = new Employee("Kaelyn", "Wilcox", "kaelyn.wilcox@our-company.com", "Management");

Employee employee217 = new Employee("Charity", "Pollard", "charity.pollard@our-company.com", "Marketing");

Employee employee218 = new Employee("Brynn", "Henson", "brynn.henson@our-company.com", "IT");

Employee employee219 = new Employee("Britney", "Mooney", "britney.mooney@our-company.com", "IT");

Employee employee220 = new Employee("Jorge", "Hammond", "jorge.hammond@our-company.com", "Logistic");

Employee employee221 = new Employee("Dalia", "Strickland", "dalia.strickland@our-company.com", "IT");

Employee employee222 = new Employee("Troy", "Greene", "troy.greene@our-company.com", "Logistic");

Employee employee223 = new Employee("Alyssa", "Ellis", "alyssa.ellis@our-company.com", "Marketing");

Employee employee224 = new Employee("Meghan", "Bates", "meghan.bates@our-company.com", "IT");

Employee employee225 = new Employee("Ronin", "Carrillo", "ronin.carrillo@our-company.com", "Marketing");

Employee employee226 = new Employee("Mohammad", "Evans", "mohammad.evans@our-company.com", "Technical Support");

Employee employee227 = new Employee("Ray", "Bruce", "ray.bruce@our-company.com", "Technical Support");

Employee employee228 = new Employee("Ariel", "Jordan", "ariel.jordan@our-company.com", "Warrehousing");

Employee employee229 = new Employee("Beatrice", "Lucas", "beatrice.lucas@our-company.com", "Warrehousing");

Employee employee230 = new Employee("Tyson", "Macias", "tyson.macias@our-company.com", "Management");

Employee employee231 = new Employee("Asia", "Burgess", "asia.burgess@our-company.com", "IT");

Employee employee232 = new Employee("Juliet", "Kennedy", "juliet.kennedy@our-company.com", "Technical Support");

Employee employee233 = new Employee("Darrell", "Mercer", "darrell.mercer@our-company.com", "IT");

Employee employee234 = new Employee("Dayana", "Riggs", "dayana.riggs@our-company.com", "IT");

Employee employee235 = new Employee("Chandler", "House", "chandler.house@our-company.com", "Logistic");

Employee employee236 = new Employee("Scarlet", "Lowery", "scarlet.lowery@our-company.com", "IT");

Employee employee237 = new Employee("Kailey", "Sutton", "kailey.sutton@our-company.com", "Technical Support");

Employee employee238 = new Employee("Stephany", "Harper", "stephany.harper@our-company.com", "Marketing");

Employee employee239 = new Employee("Addisyn", "Roy", "addisyn.roy@our-company.com", "Management");

Employee employee240 = new Employee("Amelia", "Clark", "amelia.clark@our-company.com", "Warrehousing");

Employee employee241 = new Employee("Helena", "Pacheco", "helena.pacheco@our-company.com", "Management");

Employee employee242 = new Employee("Rachel", "Rodgers", "rachel.rodgers@our-company.com", "Management");

Employee employee243 = new Employee("Robert", "Bailey", "robert.bailey@our-company.com", "Technical Support");

Employee employee244 = new Employee("Sofia", "Villarreal", "sofia.villarreal@our-company.com", "Technical Support");

Employee employee245 = new Employee("Mariah", "Velez", "mariah.velez@our-company.com", "Logistic");

Employee employee246 = new Employee("Andrew", "Nunez", "andrew.nunez@our-company.com", "Logistic");

Employee employee247 = new Employee("Amare", "Larsen", "amare.larsen@our-company.com", "Technical Support");

Employee employee248 = new Employee("Ximena", "Ochoa", "ximena.ochoa@our-company.com", "Warrehousing");

Employee employee249 = new Employee("Jordan", "Cherry", "jordan.cherry@our-company.com", "Marketing");

Customer customer250 = new Customer("Aron", "Roman", "aron.roman@shop42.com", "Shop42");

Customer customer251 = new Customer("Deacon", "Walter", "deacon.walter@flyerbuzzer.com", "FlyerBuzzer");

Customer customer252 = new Customer("Roger", "Hester", "roger.hester@plantsgetgreener.com", "PlantsGetGreener");

Customer customer253 = new Customer("Aria", "Silva", "aria.silva@plantsgetgreener.com", "PlantsGetGreener");

Customer customer254 = new Customer("Ashtyn", "Delacruz", "ashtyn.delacruz@flyerbuzzer.com", "FlyerBuzzer");

Customer customer255 = new Customer("Dwayne", "Bush", "dwayne.bush@flyerbuzzer.com", "FlyerBuzzer");

Customer customer256 = new Customer("Shea", "Bridges", "shea.bridges@shop42.com", "Shop42");

Customer customer257 = new Customer("Penelope", "Gordon", "penelope.gordon@sportastic.com", "Sportastic");

Customer customer258 = new Customer("Taniya", "Benjamin", "taniya.benjamin@plantsgetgreener.com", "PlantsGetGreener");

Customer customer259 = new Customer("Katelynn", "Mayer", "katelynn.mayer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer260 = new Customer("Evelin", "Madden", "evelin.madden@plantsgetgreener.com", "PlantsGetGreener");

Customer customer261 = new Customer("Jasiah", "Pruitt", "jasiah.pruitt@carhouse.com", "CarHouse");

Customer customer262 = new Customer("Annie", "Hays", "annie.hays@plantsgetgreener.com", "PlantsGetGreener");

Customer customer263 = new Customer("Ulises", "Sawyer", "ulises.sawyer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer264 = new Customer("Raphael", "Rowland", "raphael.rowland@shop42.com", "Shop42");

Customer customer265 = new Customer("Dante", "Ward", "dante.ward@shop42.com", "Shop42");

Customer customer266 = new Customer("Michelle", "Parrish", "michelle.parrish@sportastic.com", "Sportastic");

Customer customer267 = new Customer("Lily", "Downs", "lily.downs@shop42.com", "Shop42");

Customer customer268 = new Customer("Dario", "Whitehead", "dario.whitehead@flyerbuzzer.com", "FlyerBuzzer");

Customer customer269 = new Customer("Deshawn", "Pineda", "deshawn.pineda@carhouse.com", "CarHouse");

Customer customer270 = new Customer("Linda", "Pena", "linda.pena@flyerbuzzer.com", "FlyerBuzzer");

Customer customer271 = new Customer("Kasen", "Walters", "kasen.walters@sportastic.com", "Sportastic");

Customer customer272 = new Customer("Axel", "Estrada", "axel.estrada@carhouse.com", "CarHouse");

Customer customer273 = new Customer("Brent", "Warren", "brent.warren@plantsgetgreener.com", "PlantsGetGreener");

Customer customer274 = new Customer("Belen", "Carpenter", "belen.carpenter@carhouse.com", "CarHouse");

Customer customer275 = new Customer("Noe", "Sandoval", "noe.sandoval@flyerbuzzer.com", "FlyerBuzzer");

Customer customer276 = new Customer("Lizeth", "Mendoza", "lizeth.mendoza@flyerbuzzer.com", "FlyerBuzzer");

Customer customer277 = new Customer("Julissa", "Stout", "julissa.stout@shop42.com", "Shop42");

Customer customer278 = new Customer("Camren", "Yates", "camren.yates@flyerbuzzer.com", "FlyerBuzzer");

Customer customer279 = new Customer("Gilbert", "Hayden", "gilbert.hayden@carhouse.com", "CarHouse");

Customer customer280 = new Customer("Shamar", "Stevenson", "shamar.stevenson@sportastic.com", "Sportastic");

Customer customer281 = new Customer("Davion", "Atkins", "davion.atkins@plantsgetgreener.com", "PlantsGetGreener");

Customer customer282 = new Customer("Dahlia", "Harrell", "dahlia.harrell@shop42.com", "Shop42");

Customer customer283 = new Customer("Kylie", "Hensley", "kylie.hensley@flyerbuzzer.com", "FlyerBuzzer");

Customer customer284 = new Customer("Stephen", "Richmond", "stephen.richmond@flyerbuzzer.com", "FlyerBuzzer");

Customer customer285 = new Customer("Trenton", "Tanner", "trenton.tanner@shop42.com", "Shop42");

Customer customer286 = new Customer("Jairo", "Dominguez", "jairo.dominguez@sportastic.com", "Sportastic");

Customer customer287 = new Customer("Gaige", "Oneill", "gaige.oneill@flyerbuzzer.com", "FlyerBuzzer");

Customer customer288 = new Customer("Layne", "Dalton", "layne.dalton@sportastic.com", "Sportastic");

Customer customer289 = new Customer("Amari", "Williamson", "amari.williamson@sportastic.com", "Sportastic");

Customer customer290 = new Customer("Kendall", "Leon", "kendall.leon@plantsgetgreener.com", "PlantsGetGreener");

Customer customer291 = new Customer("Karissa", "Orozco", "karissa.orozco@carhouse.com", "CarHouse");

Customer customer292 = new Customer("Jovany", "Ballard", "jovany.ballard@sportastic.com", "Sportastic");

Customer customer293 = new Customer("Elisa", "Huffman", "elisa.huffman@carhouse.com", "CarHouse");

Customer customer294 = new Customer("Nick", "Mccarthy", "nick.mccarthy@shop42.com", "Shop42");

Customer customer295 = new Customer("Jayda", "Lucero", "jayda.lucero@carhouse.com", "CarHouse");

Customer customer296 = new Customer("Leandro", "Schultz", "leandro.schultz@flyerbuzzer.com", "FlyerBuzzer");

Customer customer297 = new Customer("Gemma", "Callahan", "gemma.callahan@plantsgetgreener.com", "PlantsGetGreener");

Customer customer298 = new Customer("Slade", "Sims", "slade.sims@sportastic.com", "Sportastic");

Customer customer299 = new Customer("Teresa", "Nolan", "teresa.nolan@shop42.com", "Shop42");

Customer customer300 = new Customer("Layla", "Johnston", "layla.johnston@flyerbuzzer.com", "FlyerBuzzer");

Customer customer301 = new Customer("Jaylyn", "Sellers", "jaylyn.sellers@carhouse.com", "CarHouse");

Customer customer302 = new Customer("Wilson", "Jones", "wilson.jones@sportastic.com", "Sportastic");

Customer customer303 = new Customer("Cara", "Cuevas", "cara.cuevas@plantsgetgreener.com", "PlantsGetGreener");

Customer customer304 = new Customer("Brett", "Winters", "brett.winters@plantsgetgreener.com", "PlantsGetGreener");

Customer customer305 = new Customer("Darryl", "Livingston", "darryl.livingston@plantsgetgreener.com", "PlantsGetGreener");

Customer customer306 = new Customer("Alicia", "Romero", "alicia.romero@plantsgetgreener.com", "PlantsGetGreener");

Customer customer307 = new Customer("Alessandro", "Kirby", "alessandro.kirby@flyerbuzzer.com", "FlyerBuzzer");

Customer customer308 = new Customer("Carson", "Hickman", "carson.hickman@sportastic.com", "Sportastic");

Customer customer309 = new Customer("Iyana", "Acosta", "iyana.acosta@plantsgetgreener.com", "PlantsGetGreener");

Customer customer310 = new Customer("Thomas", "Butler", "thomas.butler@carhouse.com", "CarHouse");

Customer customer311 = new Customer("Harper", "French", "harper.french@shop42.com", "Shop42");

Customer customer312 = new Customer("Keyla", "Maynard", "keyla.maynard@plantsgetgreener.com", "PlantsGetGreener");

Customer customer313 = new Customer("Easton", "Crosby", "easton.crosby@carhouse.com", "CarHouse");

Customer customer314 = new Customer("Madeleine", "Norton", "madeleine.norton@sportastic.com", "Sportastic");

Customer customer315 = new Customer("Trystan", "Larson", "trystan.larson@carhouse.com", "CarHouse");

Customer customer316 = new Customer("Jillian", "Palmer", "jillian.palmer@shop42.com", "Shop42");

Customer customer317 = new Customer("Amanda", "Stanley", "amanda.stanley@carhouse.com", "CarHouse");

Customer customer318 = new Customer("Lincoln", "Baldwin", "lincoln.baldwin@sportastic.com", "Sportastic");

Customer customer319 = new Customer("Melissa", "Ellison", "melissa.ellison@carhouse.com", "CarHouse");

Customer customer320 = new Customer("Aimee", "Aguilar", "aimee.aguilar@carhouse.com", "CarHouse");

Customer customer321 = new Customer("Gilberto", "Adkins", "gilberto.adkins@shop42.com", "Shop42");

Customer customer322 = new Customer("Alexander", "Gay", "alexander.gay@sportastic.com", "Sportastic");

Customer customer323 = new Customer("Demetrius", "Martinez", "demetrius.martinez@sportastic.com", "Sportastic");

Customer customer324 = new Customer("Rogelio", "Ingram", "rogelio.ingram@sportastic.com", "Sportastic");

Customer customer325 = new Customer("Deangelo", "Galloway", "deangelo.galloway@shop42.com", "Shop42");

Customer customer326 = new Customer("Zander", "King", "zander.king@carhouse.com", "CarHouse");

Customer customer327 = new Customer("Ethen", "Barnes", "ethen.barnes@plantsgetgreener.com", "PlantsGetGreener");

Customer customer328 = new Customer("Donna", "Sanders", "donna.sanders@sportastic.com", "Sportastic");

Customer customer329 = new Customer("Valentin", "Zavala", "valentin.zavala@flyerbuzzer.com", "FlyerBuzzer");

Customer customer330 = new Customer("Liana", "Charles", "liana.charles@carhouse.com", "CarHouse");

Customer customer331 = new Customer("Moshe", "Bowen", "moshe.bowen@carhouse.com", "CarHouse");

Customer customer332 = new Customer("Ciara", "Nielsen", "ciara.nielsen@flyerbuzzer.com", "FlyerBuzzer");

Customer customer333 = new Customer("Kianna", "Foley", "kianna.foley@plantsgetgreener.com", "PlantsGetGreener");

Customer customer334 = new Customer("Helen", "Murphy", "helen.murphy@sportastic.com", "Sportastic");

Customer customer335 = new Customer("Willie", "Oneal", "willie.oneal@shop42.com", "Shop42");

Customer customer336 = new Customer("Christina", "Booker", "christina.booker@flyerbuzzer.com", "FlyerBuzzer");

Customer customer337 = new Customer("Micah", "Fritz", "micah.fritz@plantsgetgreener.com", "PlantsGetGreener");

Customer customer338 = new Customer("Giovani", "Russo", "giovani.russo@flyerbuzzer.com", "FlyerBuzzer");

Customer customer339 = new Customer("Emerson", "Coffey", "emerson.coffey@plantsgetgreener.com", "PlantsGetGreener");

Customer customer340 = new Customer("Shaun", "Espinoza", "shaun.espinoza@flyerbuzzer.com", "FlyerBuzzer");

Customer customer341 = new Customer("Colin", "Clements", "colin.clements@flyerbuzzer.com", "FlyerBuzzer");

Customer customer342 = new Customer("Rebekah", "Vargas", "rebekah.vargas@sportastic.com", "Sportastic");

Customer customer343 = new Customer("Ingrid", "Pace", "ingrid.pace@flyerbuzzer.com", "FlyerBuzzer");

Customer customer344 = new Customer("Carlie", "Blackburn", "carlie.blackburn@carhouse.com", "CarHouse");

Customer customer345 = new Customer("Stella", "Chandler", "stella.chandler@carhouse.com", "CarHouse");

Customer customer346 = new Customer("Cecelia", "Nixon", "cecelia.nixon@sportastic.com", "Sportastic");

Customer customer347 = new Customer("Rey", "Decker", "rey.decker@shop42.com", "Shop42");

Customer customer348 = new Customer("Emilia", "Trevino", "emilia.trevino@flyerbuzzer.com", "FlyerBuzzer");

Customer customer349 = new Customer("Paisley", "Moyer", "paisley.moyer@plantsgetgreener.com", "PlantsGetGreener");

Customer customer350 = new Customer("Joselyn", "Schneider", "joselyn.schneider@sportastic.com", "Sportastic");

Customer customer351 = new Customer("Anthony", "Barnett", "anthony.barnett@plantsgetgreener.com", "PlantsGetGreener");

Customer customer352 = new Customer("Aditya", "Huff", "aditya.huff@plantsgetgreener.com", "PlantsGetGreener");

Customer customer353 = new Customer("Jordyn", "Le", "jordyn.le@carhouse.com", "CarHouse");

Customer customer354 = new Customer("Aaron", "Hopkins", "aaron.hopkins@flyerbuzzer.com", "FlyerBuzzer");

Customer customer355 = new Customer("Catalina", "Knox", "catalina.knox@flyerbuzzer.com", "FlyerBuzzer");

Customer customer356 = new Customer("Jadyn", "Bernard", "jadyn.bernard@shop42.com", "Shop42");

Customer customer357 = new Customer("Kimora", "Pearson", "kimora.pearson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer358 = new Customer("Nancy", "Hutchinson", "nancy.hutchinson@shop42.com", "Shop42");

Customer customer359 = new Customer("Delilah", "Hale", "delilah.hale@plantsgetgreener.com", "PlantsGetGreener");

Customer customer360 = new Customer("Alisson", "Chaney", "alisson.chaney@shop42.com", "Shop42");

Customer customer361 = new Customer("Quinn", "Tyler", "quinn.tyler@carhouse.com", "CarHouse");

Customer customer362 = new Customer("Jeremy", "Grant", "jeremy.grant@flyerbuzzer.com", "FlyerBuzzer");

Customer customer363 = new Customer("Joy", "Rollins", "joy.rollins@sportastic.com", "Sportastic");

Customer customer364 = new Customer("Brogan", "Obrien", "brogan.obrien@sportastic.com", "Sportastic");

Customer customer365 = new Customer("Emmalee", "Rangel", "emmalee.rangel@plantsgetgreener.com", "PlantsGetGreener");

Customer customer366 = new Customer("Drake", "Santana", "drake.santana@carhouse.com", "CarHouse");

Customer customer367 = new Customer("Angelica", "Church", "angelica.church@flyerbuzzer.com", "FlyerBuzzer");

Customer customer368 = new Customer("Stephanie", "Mckay", "stephanie.mckay@sportastic.com", "Sportastic");

Customer customer369 = new Customer("Hailey", "Calhoun", "hailey.calhoun@sportastic.com", "Sportastic");

Customer customer370 = new Customer("Chris", "Boyd", "chris.boyd@flyerbuzzer.com", "FlyerBuzzer");

Customer customer371 = new Customer("America", "Fitzpatrick", "america.fitzpatrick@flyerbuzzer.com", "FlyerBuzzer");

Customer customer372 = new Customer("Madalyn", "Gonzalez", "madalyn.gonzalez@shop42.com", "Shop42");

Customer customer373 = new Customer("Sylvia", "Beltran", "sylvia.beltran@plantsgetgreener.com", "PlantsGetGreener");

Customer customer374 = new Customer("Jaden", "Pittman", "jaden.pittman@sportastic.com", "Sportastic");

Customer customer375 = new Customer("Arielle", "Andrade", "arielle.andrade@shop42.com", "Shop42");

Customer customer376 = new Customer("Kamila", "Beasley", "kamila.beasley@plantsgetgreener.com", "PlantsGetGreener");

Customer customer377 = new Customer("Lennon", "Fernandez", "lennon.fernandez@carhouse.com", "CarHouse");

Customer customer378 = new Customer("June", "Mullen", "june.mullen@carhouse.com", "CarHouse");

Customer customer379 = new Customer("Aileen", "Thornton", "aileen.thornton@plantsgetgreener.com", "PlantsGetGreener");

Customer customer380 = new Customer("Alonso", "Walls", "alonso.walls@flyerbuzzer.com", "FlyerBuzzer");

Customer customer381 = new Customer("Araceli", "Lester", "araceli.lester@carhouse.com", "CarHouse");

Customer customer382 = new Customer("Tristin", "Archer", "tristin.archer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer383 = new Customer("Aedan", "Rose", "aedan.rose@plantsgetgreener.com", "PlantsGetGreener");

Customer customer384 = new Customer("Kamron", "Anderson", "kamron.anderson@sportastic.com", "Sportastic");

Customer customer385 = new Customer("Alia", "Howell", "alia.howell@sportastic.com", "Sportastic");

Customer customer386 = new Customer("Andy", "Stewart", "andy.stewart@plantsgetgreener.com", "PlantsGetGreener");

Customer customer387 = new Customer("Karma", "Shepard", "karma.shepard@sportastic.com", "Sportastic");

Customer customer388 = new Customer("Reed", "Mcdowell", "reed.mcdowell@sportastic.com", "Sportastic");

Customer customer389 = new Customer("Marvin", "Franco", "marvin.franco@plantsgetgreener.com", "PlantsGetGreener");

Customer customer390 = new Customer("Zoey", "Hansen", "zoey.hansen@sportastic.com", "Sportastic");

Customer customer391 = new Customer("Hugo", "Hicks", "hugo.hicks@plantsgetgreener.com", "PlantsGetGreener");

Customer customer392 = new Customer("Tiana", "Berger", "tiana.berger@sportastic.com", "Sportastic");

Customer customer393 = new Customer("Makenzie", "Cruz", "makenzie.cruz@plantsgetgreener.com", "PlantsGetGreener");

Customer customer394 = new Customer("Santos", "Guzman", "santos.guzman@shop42.com", "Shop42");

Customer customer395 = new Customer("Anabel", "Frazier", "anabel.frazier@carhouse.com", "CarHouse");

Customer customer396 = new Customer("Oswaldo", "Campos", "oswaldo.campos@flyerbuzzer.com", "FlyerBuzzer");

Customer customer397 = new Customer("Harley", "Woods", "harley.woods@flyerbuzzer.com", "FlyerBuzzer");

Customer customer398 = new Customer("Konner", "Greer", "konner.greer@carhouse.com", "CarHouse");

Customer customer399 = new Customer("Yair", "Flowers", "yair.flowers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer400 = new Customer("Mira", "Washington", "mira.washington@flyerbuzzer.com", "FlyerBuzzer");

Customer customer401 = new Customer("Deegan", "Simpson", "deegan.simpson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer402 = new Customer("Kamari", "Huang", "kamari.huang@flyerbuzzer.com", "FlyerBuzzer");

Customer customer403 = new Customer("Shawn", "Bird", "shawn.bird@shop42.com", "Shop42");

Customer customer404 = new Customer("Israel", "Meyers", "israel.meyers@flyerbuzzer.com", "FlyerBuzzer");

Customer customer405 = new Customer("Dexter", "Wise", "dexter.wise@sportastic.com", "Sportastic");

Customer customer406 = new Customer("Jaylynn", "Oconnor", "jaylynn.oconnor@plantsgetgreener.com", "PlantsGetGreener");

Customer customer407 = new Customer("Jaxon", "Yoder", "jaxon.yoder@carhouse.com", "CarHouse");

Customer customer408 = new Customer("Lexie", "Ramos", "lexie.ramos@flyerbuzzer.com", "FlyerBuzzer");

Customer customer409 = new Customer("Erick", "Williams", "erick.williams@sportastic.com", "Sportastic");

Customer customer410 = new Customer("Casey", "English", "casey.english@flyerbuzzer.com", "FlyerBuzzer");

Customer customer411 = new Customer("Skyla", "Powell", "skyla.powell@carhouse.com", "CarHouse");

Customer customer412 = new Customer("Gabrielle", "Dodson", "gabrielle.dodson@shop42.com", "Shop42");

Customer customer413 = new Customer("Evie", "Liu", "evie.liu@carhouse.com", "CarHouse");

Customer customer414 = new Customer("Beau", "Chang", "beau.chang@plantsgetgreener.com", "PlantsGetGreener");

Customer customer415 = new Customer("Diego", "Barr", "diego.barr@plantsgetgreener.com", "PlantsGetGreener");

Customer customer416 = new Customer("Ashleigh", "Wagner", "ashleigh.wagner@shop42.com", "Shop42");

Customer customer417 = new Customer("Hannah", "Boone", "hannah.boone@sportastic.com", "Sportastic");

Customer customer418 = new Customer("Marianna", "Jacobson", "marianna.jacobson@sportastic.com", "Sportastic");

Customer customer419 = new Customer("Giana", "Pugh", "giana.pugh@flyerbuzzer.com", "FlyerBuzzer");

Customer customer420 = new Customer("Emelia", "Welch", "emelia.welch@flyerbuzzer.com", "FlyerBuzzer");

Customer customer421 = new Customer("Bennett", "Powers", "bennett.powers@carhouse.com", "CarHouse");

Customer customer422 = new Customer("Kierra", "Lee", "kierra.lee@shop42.com", "Shop42");

Customer customer423 = new Customer("Abbigail", "Delgado", "abbigail.delgado@sportastic.com", "Sportastic");

Customer customer424 = new Customer("Clark", "Cantrell", "clark.cantrell@carhouse.com", "CarHouse");

Customer customer425 = new Customer("Carolyn", "Rosario", "carolyn.rosario@plantsgetgreener.com", "PlantsGetGreener");

Customer customer426 = new Customer("Charles", "Garza", "charles.garza@shop42.com", "Shop42");

Customer customer427 = new Customer("Ricky", "Stuart", "ricky.stuart@shop42.com", "Shop42");

Customer customer428 = new Customer("Trey", "Mclean", "trey.mclean@carhouse.com", "CarHouse");

Customer customer429 = new Customer("Triston", "Cochran", "triston.cochran@flyerbuzzer.com", "FlyerBuzzer");

Customer customer430 = new Customer("Arabella", "Proctor", "arabella.proctor@carhouse.com", "CarHouse");

Customer customer431 = new Customer("Karson", "Melendez", "karson.melendez@carhouse.com", "CarHouse");

Customer customer432 = new Customer("Adelyn", "Rubio", "adelyn.rubio@sportastic.com", "Sportastic");

Customer customer433 = new Customer("Urijah", "Rogers", "urijah.rogers@sportastic.com", "Sportastic");

Customer customer434 = new Customer("Sean", "Manning", "sean.manning@flyerbuzzer.com", "FlyerBuzzer");

Customer customer435 = new Customer("Danny", "Sullivan", "danny.sullivan@sportastic.com", "Sportastic");

Customer customer436 = new Customer("Sullivan", "Owen", "sullivan.owen@plantsgetgreener.com", "PlantsGetGreener");

Customer customer437 = new Customer("Maximilian", "Monroe", "maximilian.monroe@sportastic.com", "Sportastic");

Customer customer438 = new Customer("Delaney", "Cooper", "delaney.cooper@plantsgetgreener.com", "PlantsGetGreener");

Customer customer439 = new Customer("Elena", "Boyer", "elena.boyer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer440 = new Customer("Maddox", "Davis", "maddox.davis@carhouse.com", "CarHouse");

Customer customer441 = new Customer("Bobby", "Reed", "bobby.reed@carhouse.com", "CarHouse");

Customer customer442 = new Customer("Matilda", "Kramer", "matilda.kramer@carhouse.com", "CarHouse");

Customer customer443 = new Customer("Landen", "Aguirre", "landen.aguirre@flyerbuzzer.com", "FlyerBuzzer");

Customer customer444 = new Customer("Sanai", "Elliott", "sanai.elliott@shop42.com", "Shop42");

Customer customer445 = new Customer("Braiden", "Bauer", "braiden.bauer@shop42.com", "Shop42");

Customer customer446 = new Customer("Vivian", "Sampson", "vivian.sampson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer447 = new Customer("Sienna", "Dunn", "sienna.dunn@shop42.com", "Shop42");

Customer customer448 = new Customer("Justus", "Kaiser", "justus.kaiser@carhouse.com", "CarHouse");

Customer customer449 = new Customer("Jovanni", "Mayo", "jovanni.mayo@flyerbuzzer.com", "FlyerBuzzer");

Customer customer450 = new Customer("Maggie", "Price", "maggie.price@plantsgetgreener.com", "PlantsGetGreener");

Customer customer451 = new Customer("Trevon", "Terry", "trevon.terry@flyerbuzzer.com", "FlyerBuzzer");

Customer customer452 = new Customer("Brennen", "Hurst", "brennen.hurst@plantsgetgreener.com", "PlantsGetGreener");

Customer customer453 = new Customer("Yoselin", "Chambers", "yoselin.chambers@flyerbuzzer.com", "FlyerBuzzer");

Customer customer454 = new Customer("Jayleen", "Brock", "jayleen.brock@carhouse.com", "CarHouse");

Customer customer455 = new Customer("Kyan", "Holloway", "kyan.holloway@plantsgetgreener.com", "PlantsGetGreener");

Customer customer456 = new Customer("Jakobe", "Salas", "jakobe.salas@carhouse.com", "CarHouse");

Customer customer457 = new Customer("Maurice", "Chase", "maurice.chase@carhouse.com", "CarHouse");

Customer customer458 = new Customer("Zain", "Patrick", "zain.patrick@shop42.com", "Shop42");

Customer customer459 = new Customer("Darren", "Santiago", "darren.santiago@carhouse.com", "CarHouse");

Customer customer460 = new Customer("Kai", "Carney", "kai.carney@plantsgetgreener.com", "PlantsGetGreener");

Customer customer461 = new Customer("Makhi", "Schmitt", "makhi.schmitt@plantsgetgreener.com", "PlantsGetGreener");

Customer customer462 = new Customer("Bria", "Ayala", "bria.ayala@carhouse.com", "CarHouse");

Customer customer463 = new Customer("Veronica", "Wolf", "veronica.wolf@sportastic.com", "Sportastic");

Customer customer464 = new Customer("Asher", "Camacho", "asher.camacho@plantsgetgreener.com", "PlantsGetGreener");

Customer customer465 = new Customer("Madeline", "Molina", "madeline.molina@flyerbuzzer.com", "FlyerBuzzer");

Customer customer466 = new Customer("Nyla", "Hull", "nyla.hull@sportastic.com", "Sportastic");

Customer customer467 = new Customer("Jonathon", "Escobar", "jonathon.escobar@shop42.com", "Shop42");

Customer customer468 = new Customer("Yahir", "Roach", "yahir.roach@flyerbuzzer.com", "FlyerBuzzer");

Customer customer469 = new Customer("Finn", "Ross", "finn.ross@flyerbuzzer.com", "FlyerBuzzer");

Customer customer470 = new Customer("Corey", "Marsh", "corey.marsh@plantsgetgreener.com", "PlantsGetGreener");

Customer customer471 = new Customer("Jadyn", "Fox", "jadyn.fox@carhouse.com", "CarHouse");

Customer customer472 = new Customer("Billy", "Benson", "billy.benson@carhouse.com", "CarHouse");

Customer customer473 = new Customer("Mario", "Green", "mario.green@plantsgetgreener.com", "PlantsGetGreener");

Customer customer474 = new Customer("Skyler", "Potter", "skyler.potter@plantsgetgreener.com", "PlantsGetGreener");

Customer customer475 = new Customer("Todd", "Dudley", "todd.dudley@shop42.com", "Shop42");

Customer customer476 = new Customer("Adrianna", "Parker", "adrianna.parker@shop42.com", "Shop42");

Customer customer477 = new Customer("Brandon", "Acevedo", "brandon.acevedo@sportastic.com", "Sportastic");

Customer customer478 = new Customer("Killian", "Shea", "killian.shea@shop42.com", "Shop42");

Customer customer479 = new Customer("Katelyn", "Skinner", "katelyn.skinner@carhouse.com", "CarHouse");

Customer customer480 = new Customer("Leland", "Ayers", "leland.ayers@flyerbuzzer.com", "FlyerBuzzer");

Customer customer481 = new Customer("Jordin", "Garner", "jordin.garner@flyerbuzzer.com", "FlyerBuzzer");

Customer customer482 = new Customer("Rocco", "Franklin", "rocco.franklin@plantsgetgreener.com", "PlantsGetGreener");

Customer customer483 = new Customer("Jacey", "Haney", "jacey.haney@shop42.com", "Shop42");

Customer customer484 = new Customer("Zaire", "Keith", "zaire.keith@shop42.com", "Shop42");

Customer customer485 = new Customer("Annabella", "Hoover", "annabella.hoover@shop42.com", "Shop42");

Customer customer486 = new Customer("German", "Short", "german.short@flyerbuzzer.com", "FlyerBuzzer");

Customer customer487 = new Customer("Denise", "Odom", "denise.odom@shop42.com", "Shop42");

Customer customer488 = new Customer("Dayami", "Wall", "dayami.wall@flyerbuzzer.com", "FlyerBuzzer");

Customer customer489 = new Customer("Fletcher", "Ali", "fletcher.ali@sportastic.com", "Sportastic");

Customer customer490 = new Customer("Savion", "Zamora", "savion.zamora@carhouse.com", "CarHouse");

Customer customer491 = new Customer("Aspen", "Munoz", "aspen.munoz@shop42.com", "Shop42");

Customer customer492 = new Customer("Tristian", "Bowers", "tristian.bowers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer493 = new Customer("Brian", "Sanchez", "brian.sanchez@plantsgetgreener.com", "PlantsGetGreener");

Customer customer494 = new Customer("Barrett", "Mack", "barrett.mack@shop42.com", "Shop42");

Customer customer495 = new Customer("Seamus", "Hogan", "seamus.hogan@carhouse.com", "CarHouse");

Customer customer496 = new Customer("Katie", "Jimenez", "katie.jimenez@carhouse.com", "CarHouse");

Customer customer497 = new Customer("Elijah", "Flores", "elijah.flores@plantsgetgreener.com", "PlantsGetGreener");

Customer customer498 = new Customer("Dashawn", "Mueller", "dashawn.mueller@plantsgetgreener.com", "PlantsGetGreener");

Customer customer499 = new Customer("Lorelei", "Shaw", "lorelei.shaw@flyerbuzzer.com", "FlyerBuzzer");

customer = customer499;

Ticket ticket0 = new MalfunctionTicket("I think I will buy the red car, or I will lease the blue one.", Status.RECORDED, employee155, customer388, 7, "repair");

ticketManager.add(ticket0);

date = 1489176548000l;

DataGenerator.setValueToField(ticket0, "creationDate", new Date(date));

Ticket ticket1 = new MalfunctionTicket("The shooter says goodbye to his love.", Status.PROCESSED, employee73, customer360, 2, "backup");

ticketManager.add(ticket1);

date = 1488915246000l;

DataGenerator.setValueToField(ticket1, "creationDate", new Date(date));

Ticket ticket2 = new OrderTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.SOLVED, employee46, customer443, 8, "Green Plants", "Stockwarm", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 30);

ticketManager.add(ticket2);

date = 1489320672000l;

DataGenerator.setValueToField(ticket2, "creationDate", new Date(date));

Ticket ticket3 = new OrderTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.SOLVED, employee218, customer474, 5, "Sunshine Ice", "Sao Dansing", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 86);

ticketManager.add(ticket3);

date = 1489025283000l;

DataGenerator.setValueToField(ticket3, "creationDate", new Date(date));

Ticket ticket4 = new OrderTicket("Joe made the sugar cookies. Susan decorated them.", Status.RECORDED, employee173, customer403, 6, "Sunshine Ice", "Sun-Tom", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 39);

ticketManager.add(ticket4);

date = 1489100761000l;

DataGenerator.setValueToField(ticket4, "creationDate", new Date(date));

Ticket ticket5 = new RequestTicket("I hear that Nancy is very pretty.", Status.CLOSED, employee138, customer364, 2, new Date(Long.parseLong("1488975517000")), "checkup");

ticketManager.add(ticket5);

date = 1489118082000l;

DataGenerator.setValueToField(ticket5, "creationDate", new Date(date));

Ticket ticket6 = new MalfunctionTicket("Rock music approaches at high velocity.", Status.SOLVED, employee142, customer331, 6, "restore");

ticketManager.add(ticket6);

date = 1489394290000l;

DataGenerator.setValueToField(ticket6, "creationDate", new Date(date));

Ticket ticket7 = new OrderTicket("I love eating toasted cheese and tuna sandwiches.", Status.PROCESSED, employee89, customer365, 8, "Fresher", "Techlatfix", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 100);

ticketManager.add(ticket7);

date = 1489268304000l;

DataGenerator.setValueToField(ticket7, "creationDate", new Date(date));

Ticket ticket8 = new MalfunctionTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.RECORDED, employee135, customer468, 4, "setup");

ticketManager.add(ticket8);

date = 1489174992000l;

DataGenerator.setValueToField(ticket8, "creationDate", new Date(date));

Ticket ticket9 = new RequestTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.SOLVED, employee103, customer341, 6, new Date(Long.parseLong("1489024296000")), "consulting");

ticketManager.add(ticket9);

date = 1489177329000l;

DataGenerator.setValueToField(ticket9, "creationDate", new Date(date));

Ticket ticket10 = new OrderTicket("A glittering gem is not enough.", Status.WAITING_FOR_FEEDBACK, employee240, customer361, 1, "Rent", "Unolab", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 50);

ticketManager.add(ticket10);

date = 1489061354000l;

DataGenerator.setValueToField(ticket10, "creationDate", new Date(date));

Ticket ticket11 = new MalfunctionTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.RECORDED, employee75, customer320, 3, "backup");

ticketManager.add(ticket11);

date = 1489137819000l;

DataGenerator.setValueToField(ticket11, "creationDate", new Date(date));

Ticket ticket12 = new MalfunctionTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.SOLVED, employee127, customer495, 9, "repair");

ticketManager.add(ticket12);

date = 1489402326000l;

DataGenerator.setValueToField(ticket12, "creationDate", new Date(date));

Ticket ticket13 = new OrderTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.SOLVED, employee43, customer367, 8, "Blue Water", "Icetam", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 74);

ticketManager.add(ticket13);

date = 1489231784000l;

DataGenerator.setValueToField(ticket13, "creationDate", new Date(date));

Ticket ticket14 = new MalfunctionTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.RECORDED, employee79, customer390, 2, "backup");

ticketManager.add(ticket14);

date = 1489161266000l;

DataGenerator.setValueToField(ticket14, "creationDate", new Date(date));

Ticket ticket15 = new OrderTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.CLOSED, employee132, customer378, 7, "Micros", "Touchfresh", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 48);

ticketManager.add(ticket15);

date = 1489454899000l;

DataGenerator.setValueToField(ticket15, "creationDate", new Date(date));

Ticket ticket16 = new OrderTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.WAITING_FOR_FEEDBACK, employee131, customer400, 2, "Red Pizza", "Vilasonit", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 49);

ticketManager.add(ticket16);

date = 1489099281000l;

DataGenerator.setValueToField(ticket16, "creationDate", new Date(date));

Ticket ticket17 = new RequestTicket("Please wait outside of the house.", Status.RECORDED, employee143, customer406, 9, new Date(Long.parseLong("1489422383000")), "checkup");

ticketManager.add(ticket17);

date = 1489424565000l;

DataGenerator.setValueToField(ticket17, "creationDate", new Date(date));

Ticket ticket18 = new RequestTicket("A glittering gem is not enough.", Status.PROCESSED, employee141, customer478, 9, new Date(Long.parseLong("1488891544000")), "consulting");

ticketManager.add(ticket18);

date = 1488891174000l;

DataGenerator.setValueToField(ticket18, "creationDate", new Date(date));

Ticket ticket19 = new RequestTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.PROCESSED, employee9, customer363, 9, new Date(Long.parseLong("1489388437000")), "help desk");

ticketManager.add(ticket19);

date = 1488986041000l;

DataGenerator.setValueToField(ticket19, "creationDate", new Date(date));

Ticket ticket20 = new RequestTicket("I often see the time 11:11 or 12:34 on clocks.", Status.CLOSED, employee37, customer287, 2, new Date(Long.parseLong("1489400398000")), "help desk");

ticketManager.add(ticket20);

date = 1488960347000l;

DataGenerator.setValueToField(ticket20, "creationDate", new Date(date));

Ticket ticket21 = new MalfunctionTicket("He told us a very exciting adventure story.", Status.RECORDED, employee124, customer327, 6, "repair");

ticketManager.add(ticket21);

date = 1489267582000l;

DataGenerator.setValueToField(ticket21, "creationDate", new Date(date));

Ticket ticket22 = new MalfunctionTicket("Please wait outside of the house.", Status.CLOSED, employee129, customer311, 7, "restore");

ticketManager.add(ticket22);

date = 1489409039000l;

DataGenerator.setValueToField(ticket22, "creationDate", new Date(date));

Ticket ticket23 = new OrderTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee63, customer489, 3, "Fresher", "Airfix", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 76);

ticketManager.add(ticket23);

date = 1488997896000l;

DataGenerator.setValueToField(ticket23, "creationDate", new Date(date));

Ticket ticket24 = new MalfunctionTicket("She folded her handkerchief neatly.", Status.PROCESSED, employee87, customer477, 0, "setup");

ticketManager.add(ticket24);

date = 1489471998000l;

DataGenerator.setValueToField(ticket24, "creationDate", new Date(date));

Ticket ticket25 = new OrderTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.RECORDED, employee2, customer350, 7, "Rent", "Vilasonit", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 47);

ticketManager.add(ticket25);

date = 1489034498000l;

DataGenerator.setValueToField(ticket25, "creationDate", new Date(date));

Ticket ticket26 = new MalfunctionTicket("The sky is clear. the stars are twinkling.", Status.PROCESSED, employee12, customer380, 0, "restore");

ticketManager.add(ticket26);

date = 1489027281000l;

DataGenerator.setValueToField(ticket26, "creationDate", new Date(date));

Ticket ticket27 = new MalfunctionTicket("Mary plays the piano.", Status.SOLVED, employee101, customer329, 6, "setup");

ticketManager.add(ticket27);

date = 1489129193000l;

DataGenerator.setValueToField(ticket27, "creationDate", new Date(date));

Ticket ticket28 = new OrderTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.RECORDED, employee45, customer396, 1, "Quil", "Daltron", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 66);

ticketManager.add(ticket28);

date = 1489235799000l;

DataGenerator.setValueToField(ticket28, "creationDate", new Date(date));

Ticket ticket29 = new MalfunctionTicket("The lake is a long way from here.", Status.SOLVED, employee2, customer489, 1, "repair");

ticketManager.add(ticket29);

date = 1489418735000l;

DataGenerator.setValueToField(ticket29, "creationDate", new Date(date));

Ticket ticket30 = new OrderTicket("If I don’t like something, I’ll stay away from it.", Status.SOLVED, employee27, customer320, 3, "Blue Water", "Stockwarm", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 93);

ticketManager.add(ticket30);

date = 1488919267000l;

DataGenerator.setValueToField(ticket30, "creationDate", new Date(date));

Ticket ticket31 = new OrderTicket("This is a Japanese doll.", Status.PROCESSED, employee81, customer496, 1, "Red Pizza", "Trippletone", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 74);

ticketManager.add(ticket31);

date = 1489275440000l;

DataGenerator.setValueToField(ticket31, "creationDate", new Date(date));

Ticket ticket32 = new OrderTicket("Should we start class now, or should we wait for everyone to get here?", Status.WAITING_FOR_FEEDBACK, employee222, customer376, 3, "Telefunk", "Zamcanplus", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 87);

ticketManager.add(ticket32);

date = 1489205832000l;

DataGenerator.setValueToField(ticket32, "creationDate", new Date(date));

Ticket ticket33 = new MalfunctionTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.SOLVED, employee116, customer329, 0, "setup");

ticketManager.add(ticket33);

date = 1489192980000l;

DataGenerator.setValueToField(ticket33, "creationDate", new Date(date));

Ticket ticket34 = new RequestTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.PROCESSED, employee56, customer479, 5, new Date(Long.parseLong("1488914705000")), "checkup");

ticketManager.add(ticket34);

date = 1489267293000l;

DataGenerator.setValueToField(ticket34, "creationDate", new Date(date));

Ticket ticket35 = new MalfunctionTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.PROCESSED, employee85, customer443, 1, "backup");

ticketManager.add(ticket35);

date = 1488931292000l;

DataGenerator.setValueToField(ticket35, "creationDate", new Date(date));

Ticket ticket36 = new OrderTicket("The sky is clear. the stars are twinkling.", Status.CLOSED, employee131, customer275, 8, "Telefunk", "Unolab", "B6351, Wooler NE71, Vereinigtes Königreich", 82);

ticketManager.add(ticket36);

date = 1489172070000l;

DataGenerator.setValueToField(ticket36, "creationDate", new Date(date));

Ticket ticket37 = new RequestTicket("He told us a very exciting adventure story.", Status.RECORDED, employee108, customer447, 2, new Date(Long.parseLong("1489335659000")), "checkup");

ticketManager.add(ticket37);

date = 1489202622000l;

DataGenerator.setValueToField(ticket37, "creationDate", new Date(date));

Ticket ticket38 = new OrderTicket("She did not cheat on the test, for it was not the right thing to do.", Status.PROCESSED, employee201, customer356, 3, "Rent", "Sao Dansing", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 82);

ticketManager.add(ticket38);

date = 1489458363000l;

DataGenerator.setValueToField(ticket38, "creationDate", new Date(date));

Ticket ticket39 = new RequestTicket("He told us a very exciting adventure story.", Status.RECORDED, employee42, customer323, 5, new Date(Long.parseLong("1489443012000")), "checkup");

ticketManager.add(ticket39);

date = 1489430817000l;

DataGenerator.setValueToField(ticket39, "creationDate", new Date(date));

Ticket ticket40 = new MalfunctionTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.PROCESSED, employee165, customer352, 3, "setup");

ticketManager.add(ticket40);

date = 1489039116000l;

DataGenerator.setValueToField(ticket40, "creationDate", new Date(date));

Ticket ticket41 = new RequestTicket("He told us a very exciting adventure story.", Status.SOLVED, employee134, customer385, 10, new Date(Long.parseLong("1489463238000")), "help desk");

ticketManager.add(ticket41);

date = 1489479516000l;

DataGenerator.setValueToField(ticket41, "creationDate", new Date(date));

Ticket ticket42 = new RequestTicket("She only paints with bold colors. she does not like pastels.", Status.WAITING_FOR_FEEDBACK, employee136, customer395, 0, new Date(Long.parseLong("1488952607000")), "help desk");

ticketManager.add(ticket42);

date = 1489455575000l;

DataGenerator.setValueToField(ticket42, "creationDate", new Date(date));

Ticket ticket43 = new MalfunctionTicket("He ran out of money, so he had to stop playing poker.", Status.CLOSED, employee232, customer368, 10, "repair");

ticketManager.add(ticket43);

date = 1489416596000l;

DataGenerator.setValueToField(ticket43, "creationDate", new Date(date));

Ticket ticket44 = new RequestTicket("He ran out of money, so he had to stop playing poker.", Status.SOLVED, employee129, customer395, 10, new Date(Long.parseLong("1489365723000")), "consulting");

ticketManager.add(ticket44);

date = 1489377593000l;

DataGenerator.setValueToField(ticket44, "creationDate", new Date(date));

Ticket ticket45 = new RequestTicket("Abstraction is often one floor above you.", Status.PROCESSED, employee25, customer494, 0, new Date(Long.parseLong("1489037011000")), "help desk");

ticketManager.add(ticket45);

date = 1489109602000l;

DataGenerator.setValueToField(ticket45, "creationDate", new Date(date));

Ticket ticket46 = new OrderTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.RECORDED, employee208, customer401, 8, "Telefunk", "Sao Dansing", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 77);

ticketManager.add(ticket46);

date = 1488992680000l;

DataGenerator.setValueToField(ticket46, "creationDate", new Date(date));

Ticket ticket47 = new OrderTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.RECORDED, employee82, customer475, 3, "Red Pizza", "Vilasonit", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 74);

ticketManager.add(ticket47);

date = 1489189343000l;

DataGenerator.setValueToField(ticket47, "creationDate", new Date(date));

Ticket ticket48 = new MalfunctionTicket("If I don’t like something, I’ll stay away from it.", Status.RECORDED, employee221, customer409, 1, "remove");

ticketManager.add(ticket48);

date = 1489180867000l;

DataGenerator.setValueToField(ticket48, "creationDate", new Date(date));

Ticket ticket49 = new MalfunctionTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.CLOSED, employee9, customer499, 2, "restore");

ticketManager.add(ticket49);

date = 1489039057000l;

DataGenerator.setValueToField(ticket49, "creationDate", new Date(date));

Ticket ticket50 = new OrderTicket("How was the math test?", Status.WAITING_FOR_FEEDBACK, employee198, customer439, 7, "Micros", "Stockwarm", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 79);

ticketManager.add(ticket50);

date = 1488926494000l;

DataGenerator.setValueToField(ticket50, "creationDate", new Date(date));

Ticket ticket51 = new RequestTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.CLOSED, employee5, customer365, 1, new Date(Long.parseLong("1489093827000")), "training");

ticketManager.add(ticket51);

date = 1489065105000l;

DataGenerator.setValueToField(ticket51, "creationDate", new Date(date));

Ticket ticket52 = new RequestTicket("She did not cheat on the test, for it was not the right thing to do.", Status.RECORDED, employee187, customer269, 1, new Date(Long.parseLong("1489322634000")), "consulting");

ticketManager.add(ticket52);

date = 1489293920000l;

DataGenerator.setValueToField(ticket52, "creationDate", new Date(date));

Ticket ticket53 = new MalfunctionTicket("The memory we used to share is no longer coherent.", Status.PROCESSED, employee16, customer304, 1, "setup");

ticketManager.add(ticket53);

date = 1488940222000l;

DataGenerator.setValueToField(ticket53, "creationDate", new Date(date));

Ticket ticket54 = new MalfunctionTicket("She was too short to see over the fence.", Status.WAITING_FOR_FEEDBACK, employee61, customer379, 1, "setup");

ticketManager.add(ticket54);

date = 1489246832000l;

DataGenerator.setValueToField(ticket54, "creationDate", new Date(date));

Ticket ticket55 = new RequestTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.CLOSED, employee66, customer323, 7, new Date(Long.parseLong("1489274439000")), "training");

ticketManager.add(ticket55);

date = 1489439324000l;

DataGenerator.setValueToField(ticket55, "creationDate", new Date(date));

Ticket ticket56 = new OrderTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.SOLVED, employee126, customer349, 3, "Rent", "Techlatfix", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 58);

ticketManager.add(ticket56);

date = 1489408460000l;

DataGenerator.setValueToField(ticket56, "creationDate", new Date(date));

Ticket ticket57 = new OrderTicket("Let me help you with your baggage.", Status.RECORDED, employee165, customer271, 4, "Telefunk", "Airfix", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 63);

ticketManager.add(ticket57);

date = 1489209366000l;

DataGenerator.setValueToField(ticket57, "creationDate", new Date(date));

Ticket ticket58 = new OrderTicket("Rock music approaches at high velocity.", Status.PROCESSED, employee62, customer394, 7, "Blue Water", "Icetam", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 94);

ticketManager.add(ticket58);

date = 1488921876000l;

DataGenerator.setValueToField(ticket58, "creationDate", new Date(date));

Ticket ticket59 = new OrderTicket("We need to rent a room for our party.", Status.WAITING_FOR_FEEDBACK, employee118, customer399, 2, "Red Pizza", "Vilasonit", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 77);

ticketManager.add(ticket59);

date = 1489136799000l;

DataGenerator.setValueToField(ticket59, "creationDate", new Date(date));

Ticket ticket60 = new MalfunctionTicket("Christmas is coming.", Status.CLOSED, employee26, customer281, 0, "setup");

ticketManager.add(ticket60);

date = 1489409612000l;

DataGenerator.setValueToField(ticket60, "creationDate", new Date(date));

Ticket ticket61 = new OrderTicket("Don't step on the broken glass.", Status.PROCESSED, employee40, customer378, 0, "Green Plants", "Tonlab", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 37);

ticketManager.add(ticket61);

date = 1489003694000l;

DataGenerator.setValueToField(ticket61, "creationDate", new Date(date));

Ticket ticket62 = new MalfunctionTicket("Hurry!", Status.PROCESSED, employee75, customer262, 0, "setup");

ticketManager.add(ticket62);

date = 1489360011000l;

DataGenerator.setValueToField(ticket62, "creationDate", new Date(date));

Ticket ticket63 = new RequestTicket("The waves were crashing on the shore. it was a lovely sight.", Status.SOLVED, employee80, customer288, 10, new Date(Long.parseLong("1489354356000")), "training");

ticketManager.add(ticket63);

date = 1488991681000l;

DataGenerator.setValueToField(ticket63, "creationDate", new Date(date));

Ticket ticket64 = new OrderTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.CLOSED, employee41, customer436, 7, "Fresher", "Unohold", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 86);

ticketManager.add(ticket64);

date = 1489467590000l;

DataGenerator.setValueToField(ticket64, "creationDate", new Date(date));

Ticket ticket65 = new MalfunctionTicket("We have never been to Asia, nor have we visited Africa.", Status.WAITING_FOR_FEEDBACK, employee190, customer329, 8, "restore");

ticketManager.add(ticket65);

date = 1488957962000l;

DataGenerator.setValueToField(ticket65, "creationDate", new Date(date));

Ticket ticket66 = new OrderTicket("Don't step on the broken glass.", Status.RECORDED, employee114, customer344, 5, "Red Pizza", "Zamcanplus", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 37);

ticketManager.add(ticket66);

date = 1489275810000l;

DataGenerator.setValueToField(ticket66, "creationDate", new Date(date));

Ticket ticket67 = new RequestTicket("This is a Japanese doll.", Status.WAITING_FOR_FEEDBACK, employee124, customer317, 1, new Date(Long.parseLong("1489260651000")), "training");

ticketManager.add(ticket67);

date = 1489069106000l;

DataGenerator.setValueToField(ticket67, "creationDate", new Date(date));

Ticket ticket68 = new MalfunctionTicket("We have a lot of rain in June.", Status.PROCESSED, employee11, customer313, 6, "restore");

ticketManager.add(ticket68);

date = 1489460169000l;

DataGenerator.setValueToField(ticket68, "creationDate", new Date(date));

Ticket ticket69 = new RequestTicket("He ran out of money, so he had to stop playing poker.", Status.SOLVED, employee165, customer410, 6, new Date(Long.parseLong("1489377227000")), "help desk");

ticketManager.add(ticket69);

date = 1489042812000l;

DataGenerator.setValueToField(ticket69, "creationDate", new Date(date));

Ticket ticket70 = new MalfunctionTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.WAITING_FOR_FEEDBACK, employee230, customer342, 0, "repair");

ticketManager.add(ticket70);

date = 1489021523000l;

DataGenerator.setValueToField(ticket70, "creationDate", new Date(date));

Ticket ticket71 = new MalfunctionTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.PROCESSED, employee202, customer352, 4, "remove");

ticketManager.add(ticket71);

date = 1489215185000l;

DataGenerator.setValueToField(ticket71, "creationDate", new Date(date));

Ticket ticket72 = new OrderTicket("Yeah, I think it's a good environment for learning English.", Status.SOLVED, employee128, customer383, 9, "Blue Water", "Sao Dansing", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 61);

ticketManager.add(ticket72);

date = 1489395729000l;

DataGenerator.setValueToField(ticket72, "creationDate", new Date(date));

Ticket ticket73 = new RequestTicket("The sky is clear. the stars are twinkling.", Status.CLOSED, employee200, customer438, 2, new Date(Long.parseLong("1489453506000")), "consulting");

ticketManager.add(ticket73);

date = 1489467987000l;

DataGenerator.setValueToField(ticket73, "creationDate", new Date(date));

Ticket ticket74 = new MalfunctionTicket("Two seats were vacant.", Status.RECORDED, employee91, customer433, 9, "restore");

ticketManager.add(ticket74);

date = 1489425577000l;

DataGenerator.setValueToField(ticket74, "creationDate", new Date(date));

Ticket ticket75 = new RequestTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.SOLVED, employee14, customer407, 0, new Date(Long.parseLong("1489206955000")), "checkup");

ticketManager.add(ticket75);

date = 1489148898000l;

DataGenerator.setValueToField(ticket75, "creationDate", new Date(date));

Ticket ticket76 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.RECORDED, employee216, customer481, 8, new Date(Long.parseLong("1489123126000")), "training");

ticketManager.add(ticket76);

date = 1489315765000l;

DataGenerator.setValueToField(ticket76, "creationDate", new Date(date));

Ticket ticket77 = new MalfunctionTicket("Where do random thoughts come from?", Status.CLOSED, employee159, customer464, 1, "repair");

ticketManager.add(ticket77);

date = 1489323641000l;

DataGenerator.setValueToField(ticket77, "creationDate", new Date(date));

Ticket ticket78 = new MalfunctionTicket("Rock music approaches at high velocity.", Status.RECORDED, employee102, customer443, 2, "setup");

ticketManager.add(ticket78);

date = 1489483235000l;

DataGenerator.setValueToField(ticket78, "creationDate", new Date(date));

Ticket ticket79 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.RECORDED, employee32, customer278, 5, "Fresher", "Lot Dax", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 47);

ticketManager.add(ticket79);

date = 1489205211000l;

DataGenerator.setValueToField(ticket79, "creationDate", new Date(date));

Ticket ticket80 = new OrderTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.WAITING_FOR_FEEDBACK, employee175, customer479, 5, "Fresher", "Lot Dax", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 86);

ticketManager.add(ticket80);

date = 1489371864000l;

DataGenerator.setValueToField(ticket80, "creationDate", new Date(date));

Ticket ticket81 = new OrderTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.PROCESSED, employee143, customer360, 1, "Micros", "Greenstring", "B6351, Wooler NE71, Vereinigtes Königreich", 58);

ticketManager.add(ticket81);

date = 1489320922000l;

DataGenerator.setValueToField(ticket81, "creationDate", new Date(date));

Ticket ticket82 = new MalfunctionTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.RECORDED, employee144, customer424, 8, "repair");

ticketManager.add(ticket82);

date = 1489102080000l;

DataGenerator.setValueToField(ticket82, "creationDate", new Date(date));

Ticket ticket83 = new OrderTicket("I'd rather be a bird than a fish.", Status.WAITING_FOR_FEEDBACK, employee190, customer403, 3, "Micros", "Greenstring", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 38);

ticketManager.add(ticket83);

date = 1489362309000l;

DataGenerator.setValueToField(ticket83, "creationDate", new Date(date));

Ticket ticket84 = new MalfunctionTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.SOLVED, employee24, customer472, 5, "backup");

ticketManager.add(ticket84);

date = 1489187782000l;

DataGenerator.setValueToField(ticket84, "creationDate", new Date(date));

Ticket ticket85 = new RequestTicket("The shooter says goodbye to his love.", Status.SOLVED, employee132, customer460, 8, new Date(Long.parseLong("1489332147000")), "consulting");

ticketManager.add(ticket85);

date = 1488995556000l;

DataGenerator.setValueToField(ticket85, "creationDate", new Date(date));

Ticket ticket86 = new MalfunctionTicket("She did her best to help him.", Status.WAITING_FOR_FEEDBACK, employee141, customer253, 9, "restore");

ticketManager.add(ticket86);

date = 1489139707000l;

DataGenerator.setValueToField(ticket86, "creationDate", new Date(date));

Ticket ticket87 = new MalfunctionTicket("I really want to go to work, but I am too sick to drive.", Status.CLOSED, employee29, customer295, 3, "setup");

ticketManager.add(ticket87);

date = 1489409184000l;

DataGenerator.setValueToField(ticket87, "creationDate", new Date(date));

Ticket ticket88 = new RequestTicket("Let me help you with your baggage.", Status.RECORDED, employee234, customer314, 5, new Date(Long.parseLong("1489456199000")), "training");

ticketManager.add(ticket88);

date = 1489446365000l;

DataGenerator.setValueToField(ticket88, "creationDate", new Date(date));

Ticket ticket89 = new MalfunctionTicket("We need to rent a room for our party.", Status.SOLVED, employee247, customer471, 0, "restore");

ticketManager.add(ticket89);

date = 1489241316000l;

DataGenerator.setValueToField(ticket89, "creationDate", new Date(date));

Ticket ticket90 = new OrderTicket("Mary plays the piano.", Status.SOLVED, employee214, customer429, 6, "Red Pizza", "Quad Zozlax", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 89);

ticketManager.add(ticket90);

date = 1489304175000l;

DataGenerator.setValueToField(ticket90, "creationDate", new Date(date));

Ticket ticket91 = new RequestTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.RECORDED, employee105, customer348, 7, new Date(Long.parseLong("1489080303000")), "consulting");

ticketManager.add(ticket91);

date = 1489469062000l;

DataGenerator.setValueToField(ticket91, "creationDate", new Date(date));

Ticket ticket92 = new MalfunctionTicket("The old apple revels in its authority.", Status.WAITING_FOR_FEEDBACK, employee148, customer321, 0, "remove");

ticketManager.add(ticket92);

date = 1489057363000l;

DataGenerator.setValueToField(ticket92, "creationDate", new Date(date));

Ticket ticket93 = new RequestTicket("Abstraction is often one floor above you.", Status.SOLVED, employee5, customer286, 4, new Date(Long.parseLong("1489355146000")), "help desk");

ticketManager.add(ticket93);

date = 1489097254000l;

DataGenerator.setValueToField(ticket93, "creationDate", new Date(date));

Ticket ticket94 = new RequestTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.SOLVED, employee85, customer299, 10, new Date(Long.parseLong("1488982109000")), "consulting");

ticketManager.add(ticket94);

date = 1489280567000l;

DataGenerator.setValueToField(ticket94, "creationDate", new Date(date));

Ticket ticket95 = new OrderTicket("We have a lot of rain in June.", Status.WAITING_FOR_FEEDBACK, employee64, customer430, 1, "Quil", "Zumron", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 64);

ticketManager.add(ticket95);

date = 1488944890000l;

DataGenerator.setValueToField(ticket95, "creationDate", new Date(date));

Ticket ticket96 = new MalfunctionTicket("The mysterious diary records the voice.", Status.WAITING_FOR_FEEDBACK, employee236, customer435, 3, "repair");

ticketManager.add(ticket96);

date = 1489069571000l;

DataGenerator.setValueToField(ticket96, "creationDate", new Date(date));

Ticket ticket97 = new RequestTicket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee208, customer435, 8, new Date(Long.parseLong("1489388676000")), "help desk");

ticketManager.add(ticket97);

date = 1489124572000l;

DataGenerator.setValueToField(ticket97, "creationDate", new Date(date));

Ticket ticket98 = new MalfunctionTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.PROCESSED, employee210, customer323, 10, "restore");

ticketManager.add(ticket98);

date = 1489080895000l;

DataGenerator.setValueToField(ticket98, "creationDate", new Date(date));

Ticket ticket99 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.PROCESSED, employee40, customer400, 4, new Date(Long.parseLong("1488895916000")), "training");

ticketManager.add(ticket99);

date = 1489392312000l;

DataGenerator.setValueToField(ticket99, "creationDate", new Date(date));

Ticket ticket100 = new MalfunctionTicket("Everyone was busy, so I went to the movie alone.", Status.SOLVED, employee210, customer477, 7, "setup");

ticketManager.add(ticket100);

date = 1489123240000l;

DataGenerator.setValueToField(ticket100, "creationDate", new Date(date));

Ticket ticket101 = new OrderTicket("I love eating toasted cheese and tuna sandwiches.", Status.WAITING_FOR_FEEDBACK, employee204, customer405, 2, "Telefunk", "Lot Dax", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 86);

ticketManager.add(ticket101);

date = 1489434340000l;

DataGenerator.setValueToField(ticket101, "creationDate", new Date(date));

Ticket ticket102 = new OrderTicket("The sky is clear. the stars are twinkling.", Status.PROCESSED, employee236, customer264, 5, "Fresher", "Movejob", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 37);

ticketManager.add(ticket102);

date = 1489207031000l;

DataGenerator.setValueToField(ticket102, "creationDate", new Date(date));

Ticket ticket103 = new OrderTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.CLOSED, employee166, customer491, 3, "Plog", "Daltron", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 59);

ticketManager.add(ticket103);

date = 1489103739000l;

DataGenerator.setValueToField(ticket103, "creationDate", new Date(date));

Ticket ticket104 = new MalfunctionTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.CLOSED, employee80, customer337, 4, "remove");

ticketManager.add(ticket104);

date = 1489113537000l;

DataGenerator.setValueToField(ticket104, "creationDate", new Date(date));

Ticket ticket105 = new OrderTicket("I love eating toasted cheese and tuna sandwiches.", Status.CLOSED, employee223, customer322, 3, "Micros", "Icetam", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 82);

ticketManager.add(ticket105);

date = 1489070617000l;

DataGenerator.setValueToField(ticket105, "creationDate", new Date(date));

Ticket ticket106 = new OrderTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.PROCESSED, employee150, customer329, 1, "Fresher", "Techlatfix", "B6351, Wooler NE71, Vereinigtes Königreich", 75);

ticketManager.add(ticket106);

date = 1489158137000l;

DataGenerator.setValueToField(ticket106, "creationDate", new Date(date));

Ticket ticket107 = new MalfunctionTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.PROCESSED, employee40, customer366, 6, "repair");

ticketManager.add(ticket107);

date = 1489182279000l;

DataGenerator.setValueToField(ticket107, "creationDate", new Date(date));

Ticket ticket108 = new RequestTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.SOLVED, employee118, customer387, 8, new Date(Long.parseLong("1489398970000")), "help desk");

ticketManager.add(ticket108);

date = 1489424600000l;

DataGenerator.setValueToField(ticket108, "creationDate", new Date(date));

Ticket ticket109 = new RequestTicket("The old apple revels in its authority.", Status.CLOSED, employee34, customer366, 8, new Date(Long.parseLong("1488978648000")), "consulting");

ticketManager.add(ticket109);

date = 1489336647000l;

DataGenerator.setValueToField(ticket109, "creationDate", new Date(date));

Ticket ticket110 = new MalfunctionTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.WAITING_FOR_FEEDBACK, employee30, customer430, 2, "setup");

ticketManager.add(ticket110);

date = 1489341020000l;

DataGenerator.setValueToField(ticket110, "creationDate", new Date(date));

Ticket ticket111 = new OrderTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.WAITING_FOR_FEEDBACK, employee51, customer393, 2, "Rent", "Greenstring", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 93);

ticketManager.add(ticket111);

date = 1489472266000l;

DataGenerator.setValueToField(ticket111, "creationDate", new Date(date));

Ticket ticket112 = new OrderTicket("I hear that Nancy is very pretty.", Status.RECORDED, employee212, customer316, 0, "Fresher", "Tonlab", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 72);

ticketManager.add(ticket112);

date = 1489369379000l;

DataGenerator.setValueToField(ticket112, "creationDate", new Date(date));

Ticket ticket113 = new RequestTicket("I want more detailed information.", Status.PROCESSED, employee5, customer435, 8, new Date(Long.parseLong("1489091624000")), "help desk");

ticketManager.add(ticket113);

date = 1489116100000l;

DataGenerator.setValueToField(ticket113, "creationDate", new Date(date));

Ticket ticket114 = new OrderTicket("A glittering gem is not enough.", Status.PROCESSED, employee24, customer290, 9, "Telefunk", "Techlatfix", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 32);

ticketManager.add(ticket114);

date = 1489354701000l;

DataGenerator.setValueToField(ticket114, "creationDate", new Date(date));

Ticket ticket115 = new RequestTicket("How was the math test?", Status.RECORDED, employee121, customer396, 5, new Date(Long.parseLong("1489250066000")), "checkup");

ticketManager.add(ticket115);

date = 1489266741000l;

DataGenerator.setValueToField(ticket115, "creationDate", new Date(date));

Ticket ticket116 = new MalfunctionTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.CLOSED, employee187, customer383, 8, "repair");

ticketManager.add(ticket116);

date = 1489247191000l;

DataGenerator.setValueToField(ticket116, "creationDate", new Date(date));

Ticket ticket117 = new RequestTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.RECORDED, employee93, customer422, 7, new Date(Long.parseLong("1489286538000")), "consulting");

ticketManager.add(ticket117);

date = 1488923373000l;

DataGenerator.setValueToField(ticket117, "creationDate", new Date(date));

Ticket ticket118 = new RequestTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.RECORDED, employee236, customer497, 4, new Date(Long.parseLong("1489138757000")), "training");

ticketManager.add(ticket118);

date = 1489167001000l;

DataGenerator.setValueToField(ticket118, "creationDate", new Date(date));

Ticket ticket119 = new MalfunctionTicket("I think I will buy the red car, or I will lease the blue one.", Status.WAITING_FOR_FEEDBACK, employee224, customer407, 7, "backup");

ticketManager.add(ticket119);

date = 1488950621000l;

DataGenerator.setValueToField(ticket119, "creationDate", new Date(date));

Ticket ticket120 = new MalfunctionTicket("We have never been to Asia, nor have we visited Africa.", Status.SOLVED, employee137, customer392, 10, "repair");

ticketManager.add(ticket120);

date = 1489167311000l;

DataGenerator.setValueToField(ticket120, "creationDate", new Date(date));

Ticket ticket121 = new RequestTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee3, customer413, 6, new Date(Long.parseLong("1488902219000")), "checkup");

ticketManager.add(ticket121);

date = 1489322627000l;

DataGenerator.setValueToField(ticket121, "creationDate", new Date(date));

Ticket ticket122 = new RequestTicket("Is it free?", Status.SOLVED, employee160, customer276, 5, new Date(Long.parseLong("1489195334000")), "consulting");

ticketManager.add(ticket122);

date = 1489066101000l;

DataGenerator.setValueToField(ticket122, "creationDate", new Date(date));

Ticket ticket123 = new MalfunctionTicket("Is it free?", Status.CLOSED, employee113, customer298, 9, "restore");

ticketManager.add(ticket123);

date = 1489173999000l;

DataGenerator.setValueToField(ticket123, "creationDate", new Date(date));

Ticket ticket124 = new MalfunctionTicket("The stranger officiates the meal.", Status.CLOSED, employee74, customer253, 2, "backup");

ticketManager.add(ticket124);

date = 1488972504000l;

DataGenerator.setValueToField(ticket124, "creationDate", new Date(date));

Ticket ticket125 = new MalfunctionTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.WAITING_FOR_FEEDBACK, employee221, customer352, 9, "setup");

ticketManager.add(ticket125);

date = 1489152111000l;

DataGenerator.setValueToField(ticket125, "creationDate", new Date(date));

Ticket ticket126 = new RequestTicket("She only paints with bold colors. she does not like pastels.", Status.CLOSED, employee232, customer353, 1, new Date(Long.parseLong("1489172805000")), "consulting");

ticketManager.add(ticket126);

date = 1489208218000l;

DataGenerator.setValueToField(ticket126, "creationDate", new Date(date));

Ticket ticket127 = new RequestTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.SOLVED, employee62, customer308, 6, new Date(Long.parseLong("1488987447000")), "training");

ticketManager.add(ticket127);

date = 1488946194000l;

DataGenerator.setValueToField(ticket127, "creationDate", new Date(date));

Ticket ticket128 = new RequestTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.WAITING_FOR_FEEDBACK, employee93, customer270, 6, new Date(Long.parseLong("1489433049000")), "consulting");

ticketManager.add(ticket128);

date = 1489129008000l;

DataGenerator.setValueToField(ticket128, "creationDate", new Date(date));

Ticket ticket129 = new MalfunctionTicket("Sixty-Four comes asking for bread.", Status.SOLVED, employee178, customer409, 2, "remove");

ticketManager.add(ticket129);

date = 1489173223000l;

DataGenerator.setValueToField(ticket129, "creationDate", new Date(date));

Ticket ticket130 = new RequestTicket("I hear that Nancy is very pretty.", Status.WAITING_FOR_FEEDBACK, employee12, customer376, 8, new Date(Long.parseLong("1488945318000")), "checkup");

ticketManager.add(ticket130);

date = 1489050029000l;

DataGenerator.setValueToField(ticket130, "creationDate", new Date(date));

Ticket ticket131 = new OrderTicket("The lake is a long way from here.", Status.WAITING_FOR_FEEDBACK, employee143, customer469, 0, "Telefunk", "Home Ovetone", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 33);

ticketManager.add(ticket131);

date = 1488928573000l;

DataGenerator.setValueToField(ticket131, "creationDate", new Date(date));

Ticket ticket132 = new RequestTicket("Don't step on the broken glass.", Status.CLOSED, employee165, customer431, 6, new Date(Long.parseLong("1489119900000")), "help desk");

ticketManager.add(ticket132);

date = 1488920850000l;

DataGenerator.setValueToField(ticket132, "creationDate", new Date(date));

Ticket ticket133 = new OrderTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.PROCESSED, employee119, customer373, 3, "Micros", "Quofan", "B6351, Wooler NE71, Vereinigtes Königreich", 79);

ticketManager.add(ticket133);

date = 1489214339000l;

DataGenerator.setValueToField(ticket133, "creationDate", new Date(date));

Ticket ticket134 = new OrderTicket("She advised him to come back at once.", Status.RECORDED, employee180, customer446, 9, "Quil", "Greenstring", "B6351, Wooler NE71, Vereinigtes Königreich", 100);

ticketManager.add(ticket134);

date = 1489174047000l;

DataGenerator.setValueToField(ticket134, "creationDate", new Date(date));

Ticket ticket135 = new OrderTicket("A glittering gem is not enough.", Status.PROCESSED, employee75, customer477, 4, "Micros", "Lot Dax", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 92);

ticketManager.add(ticket135);

date = 1489450823000l;

DataGenerator.setValueToField(ticket135, "creationDate", new Date(date));

Ticket ticket136 = new OrderTicket("I currently have 4 windows open up… and I don’t know why.", Status.PROCESSED, employee176, customer429, 3, "Sunshine Ice", "Sun-Tom", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 55);

ticketManager.add(ticket136);

date = 1489130482000l;

DataGenerator.setValueToField(ticket136, "creationDate", new Date(date));

Ticket ticket137 = new OrderTicket("Abstraction is often one floor above you.", Status.RECORDED, employee121, customer284, 2, "Rent", "Zumron", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 94);

ticketManager.add(ticket137);

date = 1489386925000l;

DataGenerator.setValueToField(ticket137, "creationDate", new Date(date));

Ticket ticket138 = new OrderTicket("Two seats were vacant.", Status.SOLVED, employee114, customer426, 7, "Plog", "Haynimfax", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 42);

ticketManager.add(ticket138);

date = 1488980823000l;

DataGenerator.setValueToField(ticket138, "creationDate", new Date(date));

Ticket ticket139 = new OrderTicket("Is it free?", Status.SOLVED, employee36, customer462, 5, "Quil", "Airfix", "B6351, Wooler NE71, Vereinigtes Königreich", 62);

ticketManager.add(ticket139);

date = 1489001324000l;

DataGenerator.setValueToField(ticket139, "creationDate", new Date(date));

Ticket ticket140 = new OrderTicket("I hear that Nancy is very pretty.", Status.PROCESSED, employee44, customer309, 5, "Red Pizza", "Icetam", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 41);

ticketManager.add(ticket140);

date = 1489407224000l;

DataGenerator.setValueToField(ticket140, "creationDate", new Date(date));

Ticket ticket141 = new OrderTicket("I love eating toasted cheese and tuna sandwiches.", Status.CLOSED, employee76, customer367, 9, "Rent", "Tampfan", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 85);

ticketManager.add(ticket141);

date = 1489194012000l;

DataGenerator.setValueToField(ticket141, "creationDate", new Date(date));

Ticket ticket142 = new RequestTicket("She only paints with bold colors. she does not like pastels.", Status.PROCESSED, employee148, customer302, 6, new Date(Long.parseLong("1489137724000")), "consulting");

ticketManager.add(ticket142);

date = 1489341221000l;

DataGenerator.setValueToField(ticket142, "creationDate", new Date(date));

Ticket ticket143 = new RequestTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee38, customer456, 6, new Date(Long.parseLong("1489282401000")), "consulting");

ticketManager.add(ticket143);

date = 1489112018000l;

DataGenerator.setValueToField(ticket143, "creationDate", new Date(date));

Ticket ticket144 = new OrderTicket("Is it free?", Status.PROCESSED, employee45, customer483, 10, "Plog", "Trippletone", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 62);

ticketManager.add(ticket144);

date = 1489235317000l;

DataGenerator.setValueToField(ticket144, "creationDate", new Date(date));

Ticket ticket145 = new RequestTicket("She was too short to see over the fence.", Status.CLOSED, employee47, customer308, 3, new Date(Long.parseLong("1489068428000")), "help desk");

ticketManager.add(ticket145);

date = 1489074279000l;

DataGenerator.setValueToField(ticket145, "creationDate", new Date(date));

Ticket ticket146 = new RequestTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.PROCESSED, employee198, customer444, 3, new Date(Long.parseLong("1488994669000")), "help desk");

ticketManager.add(ticket146);

date = 1489348804000l;

DataGenerator.setValueToField(ticket146, "creationDate", new Date(date));

Ticket ticket147 = new OrderTicket("A glittering gem is not enough.", Status.PROCESSED, employee231, customer286, 0, "Red Pizza", "Icetam", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 59);

ticketManager.add(ticket147);

date = 1489428060000l;

DataGenerator.setValueToField(ticket147, "creationDate", new Date(date));

Ticket ticket148 = new RequestTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.PROCESSED, employee171, customer472, 10, new Date(Long.parseLong("1489339272000")), "help desk");

ticketManager.add(ticket148);

date = 1489476033000l;

DataGenerator.setValueToField(ticket148, "creationDate", new Date(date));

Ticket ticket149 = new OrderTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.RECORDED, employee30, customer465, 6, "Telefunk", "Unohold", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 50);

ticketManager.add(ticket149);

date = 1489066254000l;

DataGenerator.setValueToField(ticket149, "creationDate", new Date(date));

Ticket ticket150 = new OrderTicket("The memory we used to share is no longer coherent.", Status.WAITING_FOR_FEEDBACK, employee114, customer391, 4, "Green Plants", "Zamcanplus", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 30);

ticketManager.add(ticket150);

date = 1488999840000l;

DataGenerator.setValueToField(ticket150, "creationDate", new Date(date));

Ticket ticket151 = new MalfunctionTicket("The body may perhaps compensates for the loss of a true metaphysics.", Status.PROCESSED, employee65, customer378, 5, "repair");

ticketManager.add(ticket151);

date = 1489017128000l;

DataGenerator.setValueToField(ticket151, "creationDate", new Date(date));

Ticket ticket152 = new OrderTicket("This is a Japanese doll.", Status.CLOSED, employee9, customer379, 9, "Quil", "Tampfan", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 86);

ticketManager.add(ticket152);

date = 1489319695000l;

DataGenerator.setValueToField(ticket152, "creationDate", new Date(date));

Ticket ticket153 = new OrderTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.SOLVED, employee197, customer306, 0, "Telefunk", "Sun-Tom", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 62);

ticketManager.add(ticket153);

date = 1489479464000l;

DataGenerator.setValueToField(ticket153, "creationDate", new Date(date));

Ticket ticket154 = new MalfunctionTicket("How was the math test?", Status.WAITING_FOR_FEEDBACK, employee117, customer257, 0, "setup");

ticketManager.add(ticket154);

date = 1489329554000l;

DataGenerator.setValueToField(ticket154, "creationDate", new Date(date));

Ticket ticket155 = new MalfunctionTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee116, customer281, 8, "restore");

ticketManager.add(ticket155);

date = 1489476948000l;

DataGenerator.setValueToField(ticket155, "creationDate", new Date(date));

Ticket ticket156 = new MalfunctionTicket("The book is in front of the table.", Status.PROCESSED, employee173, customer476, 6, "repair");

ticketManager.add(ticket156);

date = 1489296792000l;

DataGenerator.setValueToField(ticket156, "creationDate", new Date(date));

Ticket ticket157 = new OrderTicket("Abstraction is often one floor above you.", Status.SOLVED, employee210, customer437, 8, "Telefunk", "Touchfresh", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 65);

ticketManager.add(ticket157);

date = 1489411130000l;

DataGenerator.setValueToField(ticket157, "creationDate", new Date(date));

Ticket ticket158 = new OrderTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.CLOSED, employee165, customer420, 3, "Micros", "Haynimfax", "B6351, Wooler NE71, Vereinigtes Königreich", 97);

ticketManager.add(ticket158);

date = 1488954417000l;

DataGenerator.setValueToField(ticket158, "creationDate", new Date(date));

Ticket ticket159 = new RequestTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.SOLVED, employee114, customer284, 2, new Date(Long.parseLong("1489338628000")), "training");

ticketManager.add(ticket159);

date = 1489340441000l;

DataGenerator.setValueToField(ticket159, "creationDate", new Date(date));

Ticket ticket160 = new MalfunctionTicket("She only paints with bold colors. she does not like pastels.", Status.WAITING_FOR_FEEDBACK, employee101, customer313, 2, "backup");

ticketManager.add(ticket160);

date = 1489053482000l;

DataGenerator.setValueToField(ticket160, "creationDate", new Date(date));

Ticket ticket161 = new OrderTicket("She did not cheat on the test, for it was not the right thing to do.", Status.WAITING_FOR_FEEDBACK, employee227, customer487, 9, "Blue Water", "Don Dax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 53);

ticketManager.add(ticket161);

date = 1489029592000l;

DataGenerator.setValueToField(ticket161, "creationDate", new Date(date));

Ticket ticket162 = new RequestTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.PROCESSED, employee209, customer417, 9, new Date(Long.parseLong("1489362926000")), "consulting");

ticketManager.add(ticket162);

date = 1489318058000l;

DataGenerator.setValueToField(ticket162, "creationDate", new Date(date));

Ticket ticket163 = new OrderTicket("Please wait outside of the house.", Status.CLOSED, employee187, customer297, 6, "Blue Water", "Quofan", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 49);

ticketManager.add(ticket163);

date = 1489234331000l;

DataGenerator.setValueToField(ticket163, "creationDate", new Date(date));

Ticket ticket164 = new MalfunctionTicket("How was the math test?", Status.CLOSED, employee117, customer286, 9, "restore");

ticketManager.add(ticket164);

date = 1489458333000l;

DataGenerator.setValueToField(ticket164, "creationDate", new Date(date));

Ticket ticket165 = new MalfunctionTicket("She wrote him a long letter, but he didn't read it.", Status.RECORDED, employee200, customer288, 0, "remove");

ticketManager.add(ticket165);

date = 1489123774000l;

DataGenerator.setValueToField(ticket165, "creationDate", new Date(date));

Ticket ticket166 = new MalfunctionTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.PROCESSED, employee127, customer422, 6, "restore");

ticketManager.add(ticket166);

date = 1489438316000l;

DataGenerator.setValueToField(ticket166, "creationDate", new Date(date));

Ticket ticket167 = new MalfunctionTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.SOLVED, employee50, customer346, 3, "setup");

ticketManager.add(ticket167);

date = 1489007548000l;

DataGenerator.setValueToField(ticket167, "creationDate", new Date(date));

Ticket ticket168 = new OrderTicket("If I don’t like something, I’ll stay away from it.", Status.CLOSED, employee241, customer482, 2, "Blue Water", "Zumron", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 68);

ticketManager.add(ticket168);

date = 1489001993000l;

DataGenerator.setValueToField(ticket168, "creationDate", new Date(date));

Ticket ticket169 = new MalfunctionTicket("Wow, does that work?", Status.SOLVED, employee144, customer266, 6, "restore");

ticketManager.add(ticket169);

date = 1489479412000l;

DataGenerator.setValueToField(ticket169, "creationDate", new Date(date));

Ticket ticket170 = new MalfunctionTicket("Please wait outside of the house.", Status.RECORDED, employee95, customer419, 2, "remove");

ticketManager.add(ticket170);

date = 1489167848000l;

DataGenerator.setValueToField(ticket170, "creationDate", new Date(date));

Ticket ticket171 = new OrderTicket("He ran out of money, so he had to stop playing poker.", Status.SOLVED, employee63, customer395, 2, "Fresher", "Gravequadtam", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 40);

ticketManager.add(ticket171);

date = 1489070274000l;

DataGenerator.setValueToField(ticket171, "creationDate", new Date(date));

Ticket ticket172 = new MalfunctionTicket("She was too short to see over the fence.", Status.PROCESSED, employee178, customer364, 2, "setup");

ticketManager.add(ticket172);

date = 1488924769000l;

DataGenerator.setValueToField(ticket172, "creationDate", new Date(date));

Ticket ticket173 = new MalfunctionTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.RECORDED, employee42, customer377, 8, "repair");

ticketManager.add(ticket173);

date = 1488956909000l;

DataGenerator.setValueToField(ticket173, "creationDate", new Date(date));

Ticket ticket174 = new RequestTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.CLOSED, employee44, customer335, 0, new Date(Long.parseLong("1489198821000")), "training");

ticketManager.add(ticket174);

date = 1489077688000l;

DataGenerator.setValueToField(ticket174, "creationDate", new Date(date));

Ticket ticket175 = new OrderTicket("He said he was not there yesterday. however, many people saw him there.", Status.PROCESSED, employee37, customer329, 8, "Sunshine Ice", "Techlatfix", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 45);

ticketManager.add(ticket175);

date = 1489447782000l;

DataGenerator.setValueToField(ticket175, "creationDate", new Date(date));

Ticket ticket176 = new MalfunctionTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.PROCESSED, employee223, customer357, 3, "backup");

ticketManager.add(ticket176);

date = 1489277378000l;

DataGenerator.setValueToField(ticket176, "creationDate", new Date(date));

Ticket ticket177 = new MalfunctionTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee232, customer424, 3, "restore");

ticketManager.add(ticket177);

date = 1489357977000l;

DataGenerator.setValueToField(ticket177, "creationDate", new Date(date));

Ticket ticket178 = new RequestTicket("I currently have 4 windows open up… and I don’t know why.", Status.CLOSED, employee225, customer338, 2, new Date(Long.parseLong("1489418272000")), "help desk");

ticketManager.add(ticket178);

date = 1489225029000l;

DataGenerator.setValueToField(ticket178, "creationDate", new Date(date));

Ticket ticket179 = new OrderTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.CLOSED, employee19, customer343, 10, "Rent", "Stockwarm", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 94);

ticketManager.add(ticket179);

date = 1489105792000l;

DataGenerator.setValueToField(ticket179, "creationDate", new Date(date));

Ticket ticket180 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.CLOSED, employee226, customer314, 5, new Date(Long.parseLong("1489126305000")), "training");

ticketManager.add(ticket180);

date = 1489481189000l;

DataGenerator.setValueToField(ticket180, "creationDate", new Date(date));

Ticket ticket181 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.WAITING_FOR_FEEDBACK, employee113, customer472, 0, "Plog", "Don Dax", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 90);

ticketManager.add(ticket181);

date = 1489357186000l;

DataGenerator.setValueToField(ticket181, "creationDate", new Date(date));

Ticket ticket182 = new MalfunctionTicket("The river stole the gods.", Status.PROCESSED, employee244, customer417, 2, "repair");

ticketManager.add(ticket182);

date = 1489297829000l;

DataGenerator.setValueToField(ticket182, "creationDate", new Date(date));

Ticket ticket183 = new OrderTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.CLOSED, employee248, customer313, 5, "Green Plants", "Sao Dansing", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 62);

ticketManager.add(ticket183);

date = 1489160414000l;

DataGenerator.setValueToField(ticket183, "creationDate", new Date(date));

Ticket ticket184 = new RequestTicket("I hear that Nancy is very pretty.", Status.PROCESSED, employee7, customer330, 0, new Date(Long.parseLong("1489368721000")), "consulting");

ticketManager.add(ticket184);

date = 1488979104000l;

DataGenerator.setValueToField(ticket184, "creationDate", new Date(date));

Ticket ticket185 = new OrderTicket("She advised him to come back at once.", Status.RECORDED, employee32, customer440, 2, "Rent", "Tamtom", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 35);

ticketManager.add(ticket185);

date = 1489436567000l;

DataGenerator.setValueToField(ticket185, "creationDate", new Date(date));

Ticket ticket186 = new MalfunctionTicket("I often see the time 11:11 or 12:34 on clocks.", Status.WAITING_FOR_FEEDBACK, employee137, customer396, 3, "restore");

ticketManager.add(ticket186);

date = 1489051052000l;

DataGenerator.setValueToField(ticket186, "creationDate", new Date(date));

Ticket ticket187 = new MalfunctionTicket("Hurry!", Status.CLOSED, employee42, customer332, 10, "setup");

ticketManager.add(ticket187);

date = 1489192070000l;

DataGenerator.setValueToField(ticket187, "creationDate", new Date(date));

Ticket ticket188 = new OrderTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.PROCESSED, employee98, customer444, 8, "Plog", "Touchfresh", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 33);

ticketManager.add(ticket188);

date = 1489304538000l;

DataGenerator.setValueToField(ticket188, "creationDate", new Date(date));

Ticket ticket189 = new RequestTicket("Abstraction is often one floor above you.", Status.CLOSED, employee117, customer270, 6, new Date(Long.parseLong("1489074016000")), "consulting");

ticketManager.add(ticket189);

date = 1488886716000l;

DataGenerator.setValueToField(ticket189, "creationDate", new Date(date));

Ticket ticket190 = new RequestTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.PROCESSED, employee74, customer272, 6, new Date(Long.parseLong("1489214499000")), "help desk");

ticketManager.add(ticket190);

date = 1489046605000l;

DataGenerator.setValueToField(ticket190, "creationDate", new Date(date));

Ticket ticket191 = new RequestTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee0, customer398, 1, new Date(Long.parseLong("1489236863000")), "training");

ticketManager.add(ticket191);

date = 1489333650000l;

DataGenerator.setValueToField(ticket191, "creationDate", new Date(date));

Ticket ticket192 = new OrderTicket("I hear that Nancy is very pretty.", Status.RECORDED, employee201, customer443, 0, "Sunshine Ice", "Quad Zozlax", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 62);

ticketManager.add(ticket192);

date = 1489062674000l;

DataGenerator.setValueToField(ticket192, "creationDate", new Date(date));

Ticket ticket193 = new OrderTicket("The waves were crashing on the shore. it was a lovely sight.", Status.RECORDED, employee230, customer381, 2, "Sunshine Ice", "Lot Dax", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 63);

ticketManager.add(ticket193);

date = 1489136810000l;

DataGenerator.setValueToField(ticket193, "creationDate", new Date(date));

Ticket ticket194 = new OrderTicket("Tom got a small piece of pie.", Status.PROCESSED, employee173, customer301, 5, "Blue Water", "Unohold", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 80);

ticketManager.add(ticket194);

date = 1489148150000l;

DataGenerator.setValueToField(ticket194, "creationDate", new Date(date));

Ticket ticket195 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.WAITING_FOR_FEEDBACK, employee190, customer482, 7, "Plog", "Techlatfix", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 82);

ticketManager.add(ticket195);

date = 1489346678000l;

DataGenerator.setValueToField(ticket195, "creationDate", new Date(date));

Ticket ticket196 = new OrderTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.PROCESSED, employee179, customer477, 3, "Rent", "Zamcanplus", "B6351, Wooler NE71, Vereinigtes Königreich", 92);

ticketManager.add(ticket196);

date = 1488891145000l;

DataGenerator.setValueToField(ticket196, "creationDate", new Date(date));

Ticket ticket197 = new MalfunctionTicket("I checked to make sure that he was still alive.", Status.CLOSED, employee115, customer318, 10, "remove");

ticketManager.add(ticket197);

date = 1489360130000l;

DataGenerator.setValueToField(ticket197, "creationDate", new Date(date));

Ticket ticket198 = new RequestTicket("We have a lot of rain in June.", Status.SOLVED, employee62, customer344, 4, new Date(Long.parseLong("1489025706000")), "training");

ticketManager.add(ticket198);

date = 1489020203000l;

DataGenerator.setValueToField(ticket198, "creationDate", new Date(date));

Ticket ticket199 = new MalfunctionTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.SOLVED, employee159, customer461, 9, "backup");

ticketManager.add(ticket199);

date = 1489477207000l;

DataGenerator.setValueToField(ticket199, "creationDate", new Date(date));

Ticket ticket200 = new MalfunctionTicket("Don't step on the broken glass.", Status.PROCESSED, employee102, customer320, 4, "remove");

ticketManager.add(ticket200);

date = 1488903321000l;

DataGenerator.setValueToField(ticket200, "creationDate", new Date(date));

Ticket ticket201 = new RequestTicket("She always speaks to him in a loud voice.", Status.PROCESSED, employee209, customer330, 6, new Date(Long.parseLong("1489485345000")), "checkup");

ticketManager.add(ticket201);

date = 1489412261000l;

DataGenerator.setValueToField(ticket201, "creationDate", new Date(date));

Ticket ticket202 = new RequestTicket("She did not cheat on the test, for it was not the right thing to do.", Status.PROCESSED, employee233, customer389, 7, new Date(Long.parseLong("1488930020000")), "checkup");

ticketManager.add(ticket202);

date = 1488892431000l;

DataGenerator.setValueToField(ticket202, "creationDate", new Date(date));

Ticket ticket203 = new MalfunctionTicket("A song can make or ruin a person’s day if they let it get to them.", Status.WAITING_FOR_FEEDBACK, employee136, customer490, 7, "remove");

ticketManager.add(ticket203);

date = 1488998436000l;

DataGenerator.setValueToField(ticket203, "creationDate", new Date(date));

Ticket ticket204 = new MalfunctionTicket("I currently have 4 windows open up… and I don’t know why.", Status.WAITING_FOR_FEEDBACK, employee39, customer354, 1, "remove");

ticketManager.add(ticket204);

date = 1488943000000l;

DataGenerator.setValueToField(ticket204, "creationDate", new Date(date));

Ticket ticket205 = new MalfunctionTicket("Don't step on the broken glass.", Status.WAITING_FOR_FEEDBACK, employee99, customer291, 9, "restore");

ticketManager.add(ticket205);

date = 1489029397000l;

DataGenerator.setValueToField(ticket205, "creationDate", new Date(date));

Ticket ticket206 = new RequestTicket("She was too short to see over the fence.", Status.PROCESSED, employee221, customer284, 5, new Date(Long.parseLong("1489011729000")), "consulting");

ticketManager.add(ticket206);

date = 1489114297000l;

DataGenerator.setValueToField(ticket206, "creationDate", new Date(date));

Ticket ticket207 = new RequestTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.CLOSED, employee117, customer466, 4, new Date(Long.parseLong("1489350304000")), "training");

ticketManager.add(ticket207);

date = 1489154140000l;

DataGenerator.setValueToField(ticket207, "creationDate", new Date(date));

Ticket ticket208 = new MalfunctionTicket("Is it free?", Status.PROCESSED, employee90, customer487, 7, "restore");

ticketManager.add(ticket208);

date = 1488979974000l;

DataGenerator.setValueToField(ticket208, "creationDate", new Date(date));

Ticket ticket209 = new OrderTicket("It was getting dark, and we weren’t there yet.", Status.PROCESSED, employee75, customer332, 1, "Plog", "Quad Zozlax", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 66);

ticketManager.add(ticket209);

date = 1489119630000l;

DataGenerator.setValueToField(ticket209, "creationDate", new Date(date));

Ticket ticket210 = new MalfunctionTicket("The stranger officiates the meal.", Status.RECORDED, employee19, customer379, 3, "backup");

ticketManager.add(ticket210);

date = 1489394479000l;

DataGenerator.setValueToField(ticket210, "creationDate", new Date(date));

Ticket ticket211 = new OrderTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.CLOSED, employee64, customer433, 5, "Rent", "Movejob", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 88);

ticketManager.add(ticket211);

date = 1489367118000l;

DataGenerator.setValueToField(ticket211, "creationDate", new Date(date));

Ticket ticket212 = new MalfunctionTicket("Let me help you with your baggage.", Status.PROCESSED, employee127, customer388, 3, "setup");

ticketManager.add(ticket212);

date = 1489385281000l;

DataGenerator.setValueToField(ticket212, "creationDate", new Date(date));

Ticket ticket213 = new OrderTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.PROCESSED, employee16, customer263, 3, "Blue Water", "Don Dax", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 56);

ticketManager.add(ticket213);

date = 1489028885000l;

DataGenerator.setValueToField(ticket213, "creationDate", new Date(date));

Ticket ticket214 = new MalfunctionTicket("Abstraction is often one floor above you.", Status.SOLVED, employee99, customer429, 1, "repair");

ticketManager.add(ticket214);

date = 1488954648000l;

DataGenerator.setValueToField(ticket214, "creationDate", new Date(date));

Ticket ticket215 = new OrderTicket("I want more detailed information.", Status.SOLVED, employee70, customer417, 8, "Green Plants", "Tampfan", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 40);

ticketManager.add(ticket215);

date = 1489242365000l;

DataGenerator.setValueToField(ticket215, "creationDate", new Date(date));

Ticket ticket216 = new RequestTicket("The mysterious diary records the voice.", Status.RECORDED, employee22, customer313, 0, new Date(Long.parseLong("1489267989000")), "help desk");

ticketManager.add(ticket216);

date = 1489227166000l;

DataGenerator.setValueToField(ticket216, "creationDate", new Date(date));

Ticket ticket217 = new RequestTicket("Rock music approaches at high velocity.", Status.PROCESSED, employee211, customer265, 0, new Date(Long.parseLong("1488904247000")), "checkup");

ticketManager.add(ticket217);

date = 1489459593000l;

DataGenerator.setValueToField(ticket217, "creationDate", new Date(date));

Ticket ticket218 = new OrderTicket("I want to buy a onesie… but know it won’t suit me.", Status.CLOSED, employee139, customer253, 9, "Rent", "Zamcanplus", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 32);

ticketManager.add(ticket218);

date = 1489420132000l;

DataGenerator.setValueToField(ticket218, "creationDate", new Date(date));

Ticket ticket219 = new MalfunctionTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.WAITING_FOR_FEEDBACK, employee49, customer447, 1, "backup");

ticketManager.add(ticket219);

date = 1489219195000l;

DataGenerator.setValueToField(ticket219, "creationDate", new Date(date));

Ticket ticket220 = new OrderTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.WAITING_FOR_FEEDBACK, employee207, customer481, 8, "Green Plants", "Sao Dansing", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 71);

ticketManager.add(ticket220);

date = 1488988182000l;

DataGenerator.setValueToField(ticket220, "creationDate", new Date(date));

Ticket ticket221 = new OrderTicket("She was too short to see over the fence.", Status.RECORDED, employee156, customer285, 7, "Sunshine Ice", "Zumron", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 34);

ticketManager.add(ticket221);

date = 1488997148000l;

DataGenerator.setValueToField(ticket221, "creationDate", new Date(date));

Ticket ticket222 = new RequestTicket("Please wait outside of the house.", Status.SOLVED, employee239, customer394, 2, new Date(Long.parseLong("1489003005000")), "consulting");

ticketManager.add(ticket222);

date = 1489478410000l;

DataGenerator.setValueToField(ticket222, "creationDate", new Date(date));

Ticket ticket223 = new OrderTicket("Should we start class now, or should we wait for everyone to get here?", Status.SOLVED, employee60, customer332, 2, "Quil", "Zumron", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 30);

ticketManager.add(ticket223);

date = 1488969584000l;

DataGenerator.setValueToField(ticket223, "creationDate", new Date(date));

Ticket ticket224 = new RequestTicket("He told us a very exciting adventure story.", Status.SOLVED, employee152, customer404, 5, new Date(Long.parseLong("1489191553000")), "checkup");

ticketManager.add(ticket224);

date = 1489119110000l;

DataGenerator.setValueToField(ticket224, "creationDate", new Date(date));

Ticket ticket225 = new MalfunctionTicket("I want more detailed information.", Status.SOLVED, employee75, customer267, 8, "backup");

ticketManager.add(ticket225);

date = 1489367923000l;

DataGenerator.setValueToField(ticket225, "creationDate", new Date(date));

Ticket ticket226 = new RequestTicket("I currently have 4 windows open up… and I don’t know why.", Status.CLOSED, employee117, customer457, 1, new Date(Long.parseLong("1489224612000")), "checkup");

ticketManager.add(ticket226);

date = 1489232455000l;

DataGenerator.setValueToField(ticket226, "creationDate", new Date(date));

Ticket ticket227 = new RequestTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.CLOSED, employee224, customer351, 6, new Date(Long.parseLong("1489212467000")), "checkup");

ticketManager.add(ticket227);

date = 1489287691000l;

DataGenerator.setValueToField(ticket227, "creationDate", new Date(date));

Ticket ticket228 = new OrderTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.RECORDED, employee106, customer443, 6, "Fresher", "Haynimfax", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 55);

ticketManager.add(ticket228);

date = 1488978516000l;

DataGenerator.setValueToField(ticket228, "creationDate", new Date(date));

Ticket ticket229 = new OrderTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.SOLVED, employee195, customer381, 1, "Fresher", "Don Dax", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 79);

ticketManager.add(ticket229);

date = 1489461215000l;

DataGenerator.setValueToField(ticket229, "creationDate", new Date(date));

Ticket ticket230 = new MalfunctionTicket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee222, customer484, 9, "restore");

ticketManager.add(ticket230);

date = 1489222740000l;

DataGenerator.setValueToField(ticket230, "creationDate", new Date(date));

Ticket ticket231 = new RequestTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.PROCESSED, employee219, customer309, 4, new Date(Long.parseLong("1489411070000")), "training");

ticketManager.add(ticket231);

date = 1489053091000l;

DataGenerator.setValueToField(ticket231, "creationDate", new Date(date));

Ticket ticket232 = new MalfunctionTicket("Writing a list of random sentences is harder than I initially thought it would be.", Status.SOLVED, employee99, customer443, 9, "repair");

ticketManager.add(ticket232);

date = 1489193778000l;

DataGenerator.setValueToField(ticket232, "creationDate", new Date(date));

Ticket ticket233 = new RequestTicket("How was the math test?", Status.RECORDED, employee30, customer373, 7, new Date(Long.parseLong("1488972919000")), "consulting");

ticketManager.add(ticket233);

date = 1489281237000l;

DataGenerator.setValueToField(ticket233, "creationDate", new Date(date));

Ticket ticket234 = new RequestTicket("Should we start class now, or should we wait for everyone to get here?", Status.WAITING_FOR_FEEDBACK, employee138, customer395, 10, new Date(Long.parseLong("1489263238000")), "checkup");

ticketManager.add(ticket234);

date = 1488925144000l;

DataGenerator.setValueToField(ticket234, "creationDate", new Date(date));

Ticket ticket235 = new MalfunctionTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.RECORDED, employee174, customer494, 7, "setup");

ticketManager.add(ticket235);

date = 1489430197000l;

DataGenerator.setValueToField(ticket235, "creationDate", new Date(date));

Ticket ticket236 = new MalfunctionTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.SOLVED, employee221, customer258, 9, "restore");

ticketManager.add(ticket236);

date = 1489387679000l;

DataGenerator.setValueToField(ticket236, "creationDate", new Date(date));

Ticket ticket237 = new RequestTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.RECORDED, employee48, customer263, 1, new Date(Long.parseLong("1489312064000")), "training");

ticketManager.add(ticket237);

date = 1489429269000l;

DataGenerator.setValueToField(ticket237, "creationDate", new Date(date));

Ticket ticket238 = new MalfunctionTicket("The quick brown fox jumps over the lazy dog.", Status.WAITING_FOR_FEEDBACK, employee122, customer372, 6, "remove");

ticketManager.add(ticket238);

date = 1489138441000l;

DataGenerator.setValueToField(ticket238, "creationDate", new Date(date));

Ticket ticket239 = new RequestTicket("I checked to make sure that he was still alive.", Status.CLOSED, employee208, customer250, 5, new Date(Long.parseLong("1489192780000")), "training");

ticketManager.add(ticket239);

date = 1489214186000l;

DataGenerator.setValueToField(ticket239, "creationDate", new Date(date));

Ticket ticket240 = new MalfunctionTicket("She folded her handkerchief neatly.", Status.PROCESSED, employee84, customer403, 5, "remove");

ticketManager.add(ticket240);

date = 1489195965000l;

DataGenerator.setValueToField(ticket240, "creationDate", new Date(date));

Ticket ticket241 = new OrderTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.CLOSED, employee136, customer378, 10, "Blue Water", "Istrax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 39);

ticketManager.add(ticket241);

date = 1488895640000l;

DataGenerator.setValueToField(ticket241, "creationDate", new Date(date));

Ticket ticket242 = new OrderTicket("We have a lot of rain in June.", Status.RECORDED, employee32, customer275, 5, "Micros", "Sao Dansing", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 96);

ticketManager.add(ticket242);

date = 1489409353000l;

DataGenerator.setValueToField(ticket242, "creationDate", new Date(date));

Ticket ticket243 = new MalfunctionTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.WAITING_FOR_FEEDBACK, employee146, customer266, 2, "restore");

ticketManager.add(ticket243);

date = 1488947155000l;

DataGenerator.setValueToField(ticket243, "creationDate", new Date(date));

Ticket ticket244 = new MalfunctionTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.SOLVED, employee84, customer444, 6, "backup");

ticketManager.add(ticket244);

date = 1489366483000l;

DataGenerator.setValueToField(ticket244, "creationDate", new Date(date));

Ticket ticket245 = new OrderTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.PROCESSED, employee12, customer451, 1, "Fresher", "Don Dax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 37);

ticketManager.add(ticket245);

date = 1489360558000l;

DataGenerator.setValueToField(ticket245, "creationDate", new Date(date));

Ticket ticket246 = new MalfunctionTicket("She folded her handkerchief neatly.", Status.RECORDED, employee40, customer486, 7, "remove");

ticketManager.add(ticket246);

date = 1488896576000l;

DataGenerator.setValueToField(ticket246, "creationDate", new Date(date));

Ticket ticket247 = new OrderTicket("I checked to make sure that he was still alive.", Status.SOLVED, employee184, customer320, 9, "Blue Water", "Don Dax", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 78);

ticketManager.add(ticket247);

date = 1489330390000l;

DataGenerator.setValueToField(ticket247, "creationDate", new Date(date));

Ticket ticket248 = new OrderTicket("The old apple revels in its authority.", Status.WAITING_FOR_FEEDBACK, employee226, customer296, 9, "Plog", "Home Ovetone", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 90);

ticketManager.add(ticket248);

date = 1489068996000l;

DataGenerator.setValueToField(ticket248, "creationDate", new Date(date));

Ticket ticket249 = new MalfunctionTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.RECORDED, employee50, customer260, 1, "remove");

ticketManager.add(ticket249);

date = 1488972949000l;

DataGenerator.setValueToField(ticket249, "creationDate", new Date(date));

Ticket ticket250 = new OrderTicket("He ran out of money, so he had to stop playing poker.", Status.PROCESSED, employee100, customer342, 1, "Sunshine Ice", "Zamcanplus", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 76);

ticketManager.add(ticket250);

date = 1489202326000l;

DataGenerator.setValueToField(ticket250, "creationDate", new Date(date));

Ticket ticket251 = new MalfunctionTicket("Where do random thoughts come from?", Status.WAITING_FOR_FEEDBACK, employee62, customer395, 0, "backup");

ticketManager.add(ticket251);

date = 1489056903000l;

DataGenerator.setValueToField(ticket251, "creationDate", new Date(date));

Ticket ticket252 = new MalfunctionTicket("Two seats were vacant.", Status.WAITING_FOR_FEEDBACK, employee200, customer446, 10, "remove");

ticketManager.add(ticket252);

date = 1489461717000l;

DataGenerator.setValueToField(ticket252, "creationDate", new Date(date));

Ticket ticket253 = new OrderTicket("She always speaks to him in a loud voice.", Status.RECORDED, employee0, customer366, 3, "Rent", "Lot Dax", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 36);

ticketManager.add(ticket253);

date = 1489007937000l;

DataGenerator.setValueToField(ticket253, "creationDate", new Date(date));

Ticket ticket254 = new RequestTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.WAITING_FOR_FEEDBACK, employee82, customer469, 6, new Date(Long.parseLong("1489241718000")), "training");

ticketManager.add(ticket254);

date = 1489248157000l;

DataGenerator.setValueToField(ticket254, "creationDate", new Date(date));

Ticket ticket255 = new MalfunctionTicket("I love eating toasted cheese and tuna sandwiches.", Status.SOLVED, employee92, customer451, 9, "setup");

ticketManager.add(ticket255);

date = 1489210736000l;

DataGenerator.setValueToField(ticket255, "creationDate", new Date(date));

Ticket ticket256 = new OrderTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.PROCESSED, employee198, customer495, 6, "Rent", "Movejob", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 32);

ticketManager.add(ticket256);

date = 1489384146000l;

DataGenerator.setValueToField(ticket256, "creationDate", new Date(date));

Ticket ticket257 = new RequestTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.WAITING_FOR_FEEDBACK, employee46, customer469, 9, new Date(Long.parseLong("1488933250000")), "training");

ticketManager.add(ticket257);

date = 1489329993000l;

DataGenerator.setValueToField(ticket257, "creationDate", new Date(date));

Ticket ticket258 = new MalfunctionTicket("The river stole the gods.", Status.RECORDED, employee244, customer395, 10, "remove");

ticketManager.add(ticket258);

date = 1488977474000l;

DataGenerator.setValueToField(ticket258, "creationDate", new Date(date));

Ticket ticket259 = new MalfunctionTicket("A glittering gem is not enough.", Status.PROCESSED, employee30, customer283, 2, "repair");

ticketManager.add(ticket259);

date = 1489485457000l;

DataGenerator.setValueToField(ticket259, "creationDate", new Date(date));

Ticket ticket260 = new OrderTicket("I hear that Nancy is very pretty.", Status.CLOSED, employee76, customer371, 5, "Rent", "Stockwarm", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 63);

ticketManager.add(ticket260);

date = 1488900644000l;

DataGenerator.setValueToField(ticket260, "creationDate", new Date(date));

Ticket ticket261 = new MalfunctionTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.CLOSED, employee157, customer408, 0, "remove");

ticketManager.add(ticket261);

date = 1488935305000l;

DataGenerator.setValueToField(ticket261, "creationDate", new Date(date));

Ticket ticket262 = new OrderTicket("We need to rent a room for our party.", Status.WAITING_FOR_FEEDBACK, employee185, customer457, 7, "Telefunk", "Stockwarm", "B6351, Wooler NE71, Vereinigtes Königreich", 37);

ticketManager.add(ticket262);

date = 1489396058000l;

DataGenerator.setValueToField(ticket262, "creationDate", new Date(date));

Ticket ticket263 = new MalfunctionTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.PROCESSED, employee97, customer347, 9, "remove");

ticketManager.add(ticket263);

date = 1488902090000l;

DataGenerator.setValueToField(ticket263, "creationDate", new Date(date));

Ticket ticket264 = new OrderTicket("The quick brown fox jumps over the lazy dog.", Status.SOLVED, employee166, customer275, 6, "Green Plants", "Stockwarm", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 90);

ticketManager.add(ticket264);

date = 1489361565000l;

DataGenerator.setValueToField(ticket264, "creationDate", new Date(date));

Ticket ticket265 = new MalfunctionTicket("I hear that Nancy is very pretty.", Status.CLOSED, employee93, customer479, 8, "remove");

ticketManager.add(ticket265);

date = 1489000685000l;

DataGenerator.setValueToField(ticket265, "creationDate", new Date(date));

Ticket ticket266 = new MalfunctionTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.RECORDED, employee43, customer422, 0, "repair");

ticketManager.add(ticket266);

date = 1488909507000l;

DataGenerator.setValueToField(ticket266, "creationDate", new Date(date));

Ticket ticket267 = new MalfunctionTicket("She always speaks to him in a loud voice.", Status.RECORDED, employee3, customer374, 3, "remove");

ticketManager.add(ticket267);

date = 1489112300000l;

DataGenerator.setValueToField(ticket267, "creationDate", new Date(date));

Ticket ticket268 = new RequestTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee62, customer295, 0, new Date(Long.parseLong("1489081473000")), "checkup");

ticketManager.add(ticket268);

date = 1488915244000l;

DataGenerator.setValueToField(ticket268, "creationDate", new Date(date));

Ticket ticket269 = new MalfunctionTicket("It was getting dark, and we weren’t there yet.", Status.SOLVED, employee206, customer298, 7, "repair");

ticketManager.add(ticket269);

date = 1489058435000l;

DataGenerator.setValueToField(ticket269, "creationDate", new Date(date));

Ticket ticket270 = new MalfunctionTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee118, customer339, 2, "setup");

ticketManager.add(ticket270);

date = 1488910450000l;

DataGenerator.setValueToField(ticket270, "creationDate", new Date(date));

Ticket ticket271 = new MalfunctionTicket("She always speaks to him in a loud voice.", Status.WAITING_FOR_FEEDBACK, employee232, customer410, 0, "backup");

ticketManager.add(ticket271);

date = 1489059027000l;

DataGenerator.setValueToField(ticket271, "creationDate", new Date(date));

Ticket ticket272 = new MalfunctionTicket("I want more detailed information.", Status.WAITING_FOR_FEEDBACK, employee189, customer357, 4, "repair");

ticketManager.add(ticket272);

date = 1489319310000l;

DataGenerator.setValueToField(ticket272, "creationDate", new Date(date));

Ticket ticket273 = new RequestTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.WAITING_FOR_FEEDBACK, employee105, customer318, 6, new Date(Long.parseLong("1489017500000")), "training");

ticketManager.add(ticket273);

date = 1489133931000l;

DataGenerator.setValueToField(ticket273, "creationDate", new Date(date));

Ticket ticket274 = new OrderTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.SOLVED, employee172, customer407, 2, "Fresher", "Tonlab", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 97);

ticketManager.add(ticket274);

date = 1488932584000l;

DataGenerator.setValueToField(ticket274, "creationDate", new Date(date));

Ticket ticket275 = new RequestTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.PROCESSED, employee136, customer253, 3, new Date(Long.parseLong("1489021490000")), "help desk");

ticketManager.add(ticket275);

date = 1489302751000l;

DataGenerator.setValueToField(ticket275, "creationDate", new Date(date));

Ticket ticket276 = new RequestTicket("I love eating toasted cheese and tuna sandwiches.", Status.WAITING_FOR_FEEDBACK, employee2, customer264, 4, new Date(Long.parseLong("1489007508000")), "consulting");

ticketManager.add(ticket276);

date = 1489329560000l;

DataGenerator.setValueToField(ticket276, "creationDate", new Date(date));

Ticket ticket277 = new RequestTicket("Should we start class now, or should we wait for everyone to get here?", Status.WAITING_FOR_FEEDBACK, employee52, customer315, 3, new Date(Long.parseLong("1489083063000")), "checkup");

ticketManager.add(ticket277);

date = 1488950085000l;

DataGenerator.setValueToField(ticket277, "creationDate", new Date(date));

Ticket ticket278 = new MalfunctionTicket("He told us a very exciting adventure story.", Status.SOLVED, employee53, customer336, 1, "setup");

ticketManager.add(ticket278);

date = 1489096314000l;

DataGenerator.setValueToField(ticket278, "creationDate", new Date(date));

Ticket ticket279 = new MalfunctionTicket("If I don’t like something, I’ll stay away from it.", Status.SOLVED, employee65, customer413, 5, "repair");

ticketManager.add(ticket279);

date = 1488923480000l;

DataGenerator.setValueToField(ticket279, "creationDate", new Date(date));

Ticket ticket280 = new MalfunctionTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.SOLVED, employee15, customer401, 0, "backup");

ticketManager.add(ticket280);

date = 1489350449000l;

DataGenerator.setValueToField(ticket280, "creationDate", new Date(date));

Ticket ticket281 = new RequestTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.PROCESSED, employee126, customer486, 8, new Date(Long.parseLong("1489002527000")), "checkup");

ticketManager.add(ticket281);

date = 1489435886000l;

DataGenerator.setValueToField(ticket281, "creationDate", new Date(date));

Ticket ticket282 = new MalfunctionTicket("Christmas is coming.", Status.WAITING_FOR_FEEDBACK, employee74, customer360, 10, "setup");

ticketManager.add(ticket282);

date = 1488952738000l;

DataGenerator.setValueToField(ticket282, "creationDate", new Date(date));

Ticket ticket283 = new OrderTicket("Joe made the sugar cookies. Susan decorated them.", Status.CLOSED, employee167, customer406, 8, "Blue Water", "Haynimfax", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 64);

ticketManager.add(ticket283);

date = 1489025796000l;

DataGenerator.setValueToField(ticket283, "creationDate", new Date(date));

Ticket ticket284 = new MalfunctionTicket("The waves were crashing on the shore. it was a lovely sight.", Status.PROCESSED, employee237, customer278, 6, "repair");

ticketManager.add(ticket284);

date = 1489253398000l;

DataGenerator.setValueToField(ticket284, "creationDate", new Date(date));

Ticket ticket285 = new MalfunctionTicket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", Status.SOLVED, employee111, customer327, 5, "restore");

ticketManager.add(ticket285);

date = 1489395420000l;

DataGenerator.setValueToField(ticket285, "creationDate", new Date(date));

Ticket ticket286 = new OrderTicket("The body may perhaps compensates for the loss of a true metaphysics.", Status.CLOSED, employee141, customer411, 4, "Quil", "Haynimfax", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 97);

ticketManager.add(ticket286);

date = 1489068096000l;

DataGenerator.setValueToField(ticket286, "creationDate", new Date(date));

Ticket ticket287 = new MalfunctionTicket("Abstraction is often one floor above you.", Status.WAITING_FOR_FEEDBACK, employee101, customer454, 8, "repair");

ticketManager.add(ticket287);

date = 1489147759000l;

DataGenerator.setValueToField(ticket287, "creationDate", new Date(date));

Ticket ticket288 = new MalfunctionTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.PROCESSED, employee19, customer287, 2, "remove");

ticketManager.add(ticket288);

date = 1489372454000l;

DataGenerator.setValueToField(ticket288, "creationDate", new Date(date));

Ticket ticket289 = new OrderTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.CLOSED, employee170, customer461, 6, "Quil", "Unohold", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 54);

ticketManager.add(ticket289);

date = 1489214003000l;

DataGenerator.setValueToField(ticket289, "creationDate", new Date(date));

Ticket ticket290 = new MalfunctionTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.CLOSED, employee71, customer380, 1, "setup");

ticketManager.add(ticket290);

date = 1489262254000l;

DataGenerator.setValueToField(ticket290, "creationDate", new Date(date));

Ticket ticket291 = new RequestTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee234, customer417, 7, new Date(Long.parseLong("1489083892000")), "training");

ticketManager.add(ticket291);

date = 1489400689000l;

DataGenerator.setValueToField(ticket291, "creationDate", new Date(date));

Ticket ticket292 = new MalfunctionTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.RECORDED, employee168, customer267, 7, "remove");

ticketManager.add(ticket292);

date = 1489474529000l;

DataGenerator.setValueToField(ticket292, "creationDate", new Date(date));

Ticket ticket293 = new MalfunctionTicket("She folded her handkerchief neatly.", Status.SOLVED, employee122, customer438, 8, "backup");

ticketManager.add(ticket293);

date = 1488901247000l;

DataGenerator.setValueToField(ticket293, "creationDate", new Date(date));

Ticket ticket294 = new MalfunctionTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.SOLVED, employee141, customer433, 9, "repair");

ticketManager.add(ticket294);

date = 1489341181000l;

DataGenerator.setValueToField(ticket294, "creationDate", new Date(date));

Ticket ticket295 = new RequestTicket("A glittering gem is not enough.", Status.CLOSED, employee55, customer261, 9, new Date(Long.parseLong("1488884273000")), "training");

ticketManager.add(ticket295);

date = 1489485410000l;

DataGenerator.setValueToField(ticket295, "creationDate", new Date(date));

Ticket ticket296 = new MalfunctionTicket("I checked to make sure that he was still alive.", Status.WAITING_FOR_FEEDBACK, employee74, customer496, 9, "backup");

ticketManager.add(ticket296);

date = 1489445675000l;

DataGenerator.setValueToField(ticket296, "creationDate", new Date(date));

Ticket ticket297 = new OrderTicket("A glittering gem is not enough.", Status.RECORDED, employee198, customer480, 1, "Plog", "Unohold", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 70);

ticketManager.add(ticket297);

date = 1489021354000l;

DataGenerator.setValueToField(ticket297, "creationDate", new Date(date));

Ticket ticket298 = new OrderTicket("I love eating toasted cheese and tuna sandwiches.", Status.SOLVED, employee134, customer297, 7, "Quil", "Sao Dansing", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 32);

ticketManager.add(ticket298);

date = 1489433967000l;

DataGenerator.setValueToField(ticket298, "creationDate", new Date(date));

Ticket ticket299 = new OrderTicket("I am never at home on Sundays.", Status.SOLVED, employee113, customer384, 10, "Green Plants", "Tampfan", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 64);

ticketManager.add(ticket299);

date = 1489045544000l;

DataGenerator.setValueToField(ticket299, "creationDate", new Date(date));

Ticket ticket300 = new MalfunctionTicket("This is a Japanese doll.", Status.RECORDED, employee51, customer271, 2, "remove");

ticketManager.add(ticket300);

date = 1489225773000l;

DataGenerator.setValueToField(ticket300, "creationDate", new Date(date));

Ticket ticket301 = new OrderTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.SOLVED, employee81, customer499, 3, "Fresher", "Techlatfix", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 79);

ticketManager.add(ticket301);

date = 1489361119000l;

DataGenerator.setValueToField(ticket301, "creationDate", new Date(date));

Ticket ticket302 = new OrderTicket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", Status.PROCESSED, employee20, customer305, 5, "Blue Water", "Quofan", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 33);

ticketManager.add(ticket302);

date = 1489379318000l;

DataGenerator.setValueToField(ticket302, "creationDate", new Date(date));

Ticket ticket303 = new OrderTicket("She did not cheat on the test, for it was not the right thing to do.", Status.RECORDED, employee199, customer439, 4, "Fresher", "Touchfresh", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 64);

ticketManager.add(ticket303);

date = 1489126463000l;

DataGenerator.setValueToField(ticket303, "creationDate", new Date(date));

Ticket ticket304 = new MalfunctionTicket("Please wait outside of the house.", Status.PROCESSED, employee221, customer408, 10, "remove");

ticketManager.add(ticket304);

date = 1489030469000l;

DataGenerator.setValueToField(ticket304, "creationDate", new Date(date));

Ticket ticket305 = new OrderTicket("I will never be this young again. Ever. Oh damn… I just got older.", Status.RECORDED, employee69, customer362, 4, "Sunshine Ice", "Haynimfax", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 56);

ticketManager.add(ticket305);

date = 1488933911000l;

DataGenerator.setValueToField(ticket305, "creationDate", new Date(date));

Ticket ticket306 = new MalfunctionTicket("She wrote him a long letter, but he didn't read it.", Status.CLOSED, employee97, customer253, 7, "remove");

ticketManager.add(ticket306);

date = 1489149297000l;

DataGenerator.setValueToField(ticket306, "creationDate", new Date(date));

Ticket ticket307 = new OrderTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.RECORDED, employee223, customer417, 1, "Fresher", "Vilasonit", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 34);

ticketManager.add(ticket307);

date = 1489063662000l;

DataGenerator.setValueToField(ticket307, "creationDate", new Date(date));

Ticket ticket308 = new RequestTicket("The book is in front of the table.", Status.RECORDED, employee150, customer263, 2, new Date(Long.parseLong("1489184575000")), "consulting");

ticketManager.add(ticket308);

date = 1489365822000l;

DataGenerator.setValueToField(ticket308, "creationDate", new Date(date));

Ticket ticket309 = new MalfunctionTicket("The memory we used to share is no longer coherent.", Status.RECORDED, employee41, customer362, 5, "remove");

ticketManager.add(ticket309);

date = 1489177476000l;

DataGenerator.setValueToField(ticket309, "creationDate", new Date(date));

Ticket ticket310 = new OrderTicket("Where do random thoughts come from?", Status.PROCESSED, employee199, customer465, 1, "Telefunk", "Daltron", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 37);

ticketManager.add(ticket310);

date = 1489135016000l;

DataGenerator.setValueToField(ticket310, "creationDate", new Date(date));

Ticket ticket311 = new RequestTicket("She only paints with bold colors. she does not like pastels.", Status.WAITING_FOR_FEEDBACK, employee145, customer413, 8, new Date(Long.parseLong("1489134460000")), "help desk");

ticketManager.add(ticket311);

date = 1489348992000l;

DataGenerator.setValueToField(ticket311, "creationDate", new Date(date));

Ticket ticket312 = new OrderTicket("If I don’t like something, I’ll stay away from it.", Status.WAITING_FOR_FEEDBACK, employee193, customer387, 3, "Micros", "Airfix", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 78);

ticketManager.add(ticket312);

date = 1489022060000l;

DataGenerator.setValueToField(ticket312, "creationDate", new Date(date));

Ticket ticket313 = new MalfunctionTicket("Joe made the sugar cookies. Susan decorated them.", Status.RECORDED, employee138, customer306, 8, "setup");

ticketManager.add(ticket313);

date = 1489085100000l;

DataGenerator.setValueToField(ticket313, "creationDate", new Date(date));

Ticket ticket314 = new MalfunctionTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.SOLVED, employee52, customer264, 7, "repair");

ticketManager.add(ticket314);

date = 1488908375000l;

DataGenerator.setValueToField(ticket314, "creationDate", new Date(date));

Ticket ticket315 = new RequestTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.WAITING_FOR_FEEDBACK, employee86, customer255, 8, new Date(Long.parseLong("1489348273000")), "training");

ticketManager.add(ticket315);

date = 1489415851000l;

DataGenerator.setValueToField(ticket315, "creationDate", new Date(date));

Ticket ticket316 = new RequestTicket("She only paints with bold colors. she does not like pastels.", Status.CLOSED, employee150, customer493, 5, new Date(Long.parseLong("1488986360000")), "training");

ticketManager.add(ticket316);

date = 1489326286000l;

DataGenerator.setValueToField(ticket316, "creationDate", new Date(date));

Ticket ticket317 = new RequestTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.PROCESSED, employee46, customer257, 7, new Date(Long.parseLong("1488979848000")), "consulting");

ticketManager.add(ticket317);

date = 1489243829000l;

DataGenerator.setValueToField(ticket317, "creationDate", new Date(date));

Ticket ticket318 = new OrderTicket("Sixty-Four comes asking for bread.", Status.CLOSED, employee2, customer383, 6, "Green Plants", "Don Dax", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 35);

ticketManager.add(ticket318);

date = 1489275026000l;

DataGenerator.setValueToField(ticket318, "creationDate", new Date(date));

Ticket ticket319 = new MalfunctionTicket("Rock music approaches at high velocity.", Status.PROCESSED, employee211, customer471, 7, "setup");

ticketManager.add(ticket319);

date = 1489307539000l;

DataGenerator.setValueToField(ticket319, "creationDate", new Date(date));

Ticket ticket320 = new OrderTicket("We have never been to Asia, nor have we visited Africa.", Status.CLOSED, employee109, customer301, 0, "Micros", "Techlatfix", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 57);

ticketManager.add(ticket320);

date = 1488952700000l;

DataGenerator.setValueToField(ticket320, "creationDate", new Date(date));

Ticket ticket321 = new MalfunctionTicket("A glittering gem is not enough.", Status.PROCESSED, employee213, customer474, 8, "repair");

ticketManager.add(ticket321);

date = 1489161756000l;

DataGenerator.setValueToField(ticket321, "creationDate", new Date(date));

Ticket ticket322 = new RequestTicket("I checked to make sure that he was still alive.", Status.CLOSED, employee106, customer267, 4, new Date(Long.parseLong("1488902508000")), "help desk");

ticketManager.add(ticket322);

date = 1488926123000l;

DataGenerator.setValueToField(ticket322, "creationDate", new Date(date));

Ticket ticket323 = new MalfunctionTicket("Where do random thoughts come from?", Status.PROCESSED, employee60, customer342, 3, "repair");

ticketManager.add(ticket323);

date = 1489223660000l;

DataGenerator.setValueToField(ticket323, "creationDate", new Date(date));

Ticket ticket324 = new OrderTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.PROCESSED, employee150, customer445, 7, "Quil", "Sao Dansing", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 63);

ticketManager.add(ticket324);

date = 1489326011000l;

DataGenerator.setValueToField(ticket324, "creationDate", new Date(date));

Ticket ticket325 = new RequestTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.CLOSED, employee89, customer358, 7, new Date(Long.parseLong("1489404100000")), "consulting");

ticketManager.add(ticket325);

date = 1489471825000l;

DataGenerator.setValueToField(ticket325, "creationDate", new Date(date));

Ticket ticket326 = new MalfunctionTicket("The river stole the gods.", Status.CLOSED, employee89, customer304, 0, "setup");

ticketManager.add(ticket326);

date = 1489350430000l;

DataGenerator.setValueToField(ticket326, "creationDate", new Date(date));

Ticket ticket327 = new OrderTicket("Lets all be unique together until we realise we are all the same.", Status.PROCESSED, employee118, customer499, 0, "Micros", "Home Ovetone", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 72);

ticketManager.add(ticket327);

date = 1489199769000l;

DataGenerator.setValueToField(ticket327, "creationDate", new Date(date));

Ticket ticket328 = new RequestTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.WAITING_FOR_FEEDBACK, employee139, customer295, 1, new Date(Long.parseLong("1489264119000")), "consulting");

ticketManager.add(ticket328);

date = 1489412155000l;

DataGenerator.setValueToField(ticket328, "creationDate", new Date(date));

Ticket ticket329 = new MalfunctionTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.SOLVED, employee228, customer319, 8, "remove");

ticketManager.add(ticket329);

date = 1489001300000l;

DataGenerator.setValueToField(ticket329, "creationDate", new Date(date));

Ticket ticket330 = new RequestTicket("The old apple revels in its authority.", Status.SOLVED, employee135, customer392, 10, new Date(Long.parseLong("1488953406000")), "checkup");

ticketManager.add(ticket330);

date = 1489347398000l;

DataGenerator.setValueToField(ticket330, "creationDate", new Date(date));

Ticket ticket331 = new RequestTicket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", Status.CLOSED, employee224, customer369, 9, new Date(Long.parseLong("1488976344000")), "training");

ticketManager.add(ticket331);

date = 1489405640000l;

DataGenerator.setValueToField(ticket331, "creationDate", new Date(date));

Ticket ticket332 = new RequestTicket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee51, customer408, 10, new Date(Long.parseLong("1489420087000")), "consulting");

ticketManager.add(ticket332);

date = 1489114546000l;

DataGenerator.setValueToField(ticket332, "creationDate", new Date(date));

Ticket ticket333 = new MalfunctionTicket("Cats are good pets, for they are clean and are not noisy.", Status.CLOSED, employee106, customer320, 10, "backup");

ticketManager.add(ticket333);

date = 1488994355000l;

DataGenerator.setValueToField(ticket333, "creationDate", new Date(date));

Ticket ticket334 = new OrderTicket("Rock music approaches at high velocity.", Status.SOLVED, employee97, customer423, 0, "Telefunk", "Zumron", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 87);

ticketManager.add(ticket334);

date = 1489186283000l;

DataGenerator.setValueToField(ticket334, "creationDate", new Date(date));

Ticket ticket335 = new MalfunctionTicket("Sixty-Four comes asking for bread.", Status.CLOSED, employee166, customer349, 8, "setup");

ticketManager.add(ticket335);

date = 1488883611000l;

DataGenerator.setValueToField(ticket335, "creationDate", new Date(date));

Ticket ticket336 = new MalfunctionTicket("It was getting dark, and we weren’t there yet.", Status.PROCESSED, employee33, customer408, 5, "backup");

ticketManager.add(ticket336);

date = 1489113558000l;

DataGenerator.setValueToField(ticket336, "creationDate", new Date(date));

Ticket ticket337 = new RequestTicket("Everyone was busy, so I went to the movie alone.", Status.WAITING_FOR_FEEDBACK, employee244, customer457, 7, new Date(Long.parseLong("1489325233000")), "consulting");

ticketManager.add(ticket337);

date = 1488967015000l;

DataGenerator.setValueToField(ticket337, "creationDate", new Date(date));

Ticket ticket338 = new OrderTicket("She folded her handkerchief neatly.", Status.RECORDED, employee88, customer317, 10, "Plog", "Sun-Tom", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 48);

ticketManager.add(ticket338);

date = 1489376692000l;

DataGenerator.setValueToField(ticket338, "creationDate", new Date(date));

Ticket ticket339 = new MalfunctionTicket("The stranger officiates the meal.", Status.CLOSED, employee9, customer402, 7, "setup");

ticketManager.add(ticket339);

date = 1488939189000l;

DataGenerator.setValueToField(ticket339, "creationDate", new Date(date));

Ticket ticket340 = new RequestTicket("I think I will buy the red car, or I will lease the blue one.", Status.RECORDED, employee78, customer370, 5, new Date(Long.parseLong("1488989754000")), "help desk");

ticketManager.add(ticket340);

date = 1489022636000l;

DataGenerator.setValueToField(ticket340, "creationDate", new Date(date));

Ticket ticket341 = new RequestTicket("The waves were crashing on the shore. it was a lovely sight.", Status.SOLVED, employee8, customer364, 8, new Date(Long.parseLong("1489038393000")), "checkup");

ticketManager.add(ticket341);

date = 1489129648000l;

DataGenerator.setValueToField(ticket341, "creationDate", new Date(date));

Ticket ticket342 = new RequestTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.SOLVED, employee169, customer299, 7, new Date(Long.parseLong("1488961931000")), "checkup");

ticketManager.add(ticket342);

date = 1488933891000l;

DataGenerator.setValueToField(ticket342, "creationDate", new Date(date));

Ticket ticket343 = new OrderTicket("I would have gotten the promotion, but my attendance wasn’t good enough.", Status.PROCESSED, employee158, customer463, 2, "Sunshine Ice", "Zamcanplus", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 55);

ticketManager.add(ticket343);

date = 1489331082000l;

DataGenerator.setValueToField(ticket343, "creationDate", new Date(date));

Ticket ticket344 = new RequestTicket("A song can make or ruin a person’s day if they let it get to them.", Status.SOLVED, employee129, customer383, 8, new Date(Long.parseLong("1489180511000")), "training");

ticketManager.add(ticket344);

date = 1489141877000l;

DataGenerator.setValueToField(ticket344, "creationDate", new Date(date));

Ticket ticket345 = new MalfunctionTicket("Cats are good pets, for they are clean and are not noisy.", Status.RECORDED, employee126, customer408, 2, "setup");

ticketManager.add(ticket345);

date = 1489261768000l;

DataGenerator.setValueToField(ticket345, "creationDate", new Date(date));

Ticket ticket346 = new OrderTicket("The sky is clear. the stars are twinkling.", Status.WAITING_FOR_FEEDBACK, employee242, customer369, 6, "Telefunk", "Zamcanplus", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 43);

ticketManager.add(ticket346);

date = 1489275185000l;

DataGenerator.setValueToField(ticket346, "creationDate", new Date(date));

Ticket ticket347 = new RequestTicket("He told us a very exciting adventure story.", Status.SOLVED, employee53, customer347, 10, new Date(Long.parseLong("1489361667000")), "help desk");

ticketManager.add(ticket347);

date = 1489047793000l;

DataGenerator.setValueToField(ticket347, "creationDate", new Date(date));

Ticket ticket348 = new OrderTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.RECORDED, employee2, customer343, 2, "Rent", "Techlatfix", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 98);

ticketManager.add(ticket348);

date = 1489445309000l;

DataGenerator.setValueToField(ticket348, "creationDate", new Date(date));

Ticket ticket349 = new MalfunctionTicket("If Purple People Eaters are real… where do they find purple people to eat?", Status.PROCESSED, employee189, customer316, 3, "repair");

ticketManager.add(ticket349);

date = 1489032844000l;

DataGenerator.setValueToField(ticket349, "creationDate", new Date(date));

Ticket ticket350 = new RequestTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.RECORDED, employee180, customer270, 8, new Date(Long.parseLong("1489251825000")), "training");

ticketManager.add(ticket350);

date = 1489196706000l;

DataGenerator.setValueToField(ticket350, "creationDate", new Date(date));

Ticket ticket351 = new MalfunctionTicket("Should we start class now, or should we wait for everyone to get here?", Status.PROCESSED, employee60, customer257, 7, "remove");

ticketManager.add(ticket351);

date = 1489484571000l;

DataGenerator.setValueToField(ticket351, "creationDate", new Date(date));

Ticket ticket352 = new RequestTicket("The memory we used to share is no longer coherent.", Status.CLOSED, employee181, customer399, 2, new Date(Long.parseLong("1489343591000")), "checkup");

ticketManager.add(ticket352);

date = 1489251801000l;

DataGenerator.setValueToField(ticket352, "creationDate", new Date(date));

Ticket ticket353 = new MalfunctionTicket("I am never at home on Sundays.", Status.RECORDED, employee142, customer327, 6, "setup");

ticketManager.add(ticket353);

date = 1489331068000l;

DataGenerator.setValueToField(ticket353, "creationDate", new Date(date));

Ticket ticket354 = new OrderTicket("She did her best to help him.", Status.RECORDED, employee100, customer485, 9, "Sunshine Ice", "Tonlab", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 72);

ticketManager.add(ticket354);

date = 1489238223000l;

DataGenerator.setValueToField(ticket354, "creationDate", new Date(date));

Ticket ticket355 = new MalfunctionTicket("She always speaks to him in a loud voice.", Status.WAITING_FOR_FEEDBACK, employee102, customer268, 3, "remove");

ticketManager.add(ticket355);

date = 1489068876000l;

DataGenerator.setValueToField(ticket355, "creationDate", new Date(date));

Ticket ticket356 = new MalfunctionTicket("We need to rent a room for our party.", Status.CLOSED, employee248, customer294, 4, "backup");

ticketManager.add(ticket356);

date = 1489348312000l;

DataGenerator.setValueToField(ticket356, "creationDate", new Date(date));

Ticket ticket357 = new MalfunctionTicket("Should we start class now, or should we wait for everyone to get here?", Status.PROCESSED, employee135, customer288, 3, "setup");

ticketManager.add(ticket357);

date = 1489016297000l;

DataGenerator.setValueToField(ticket357, "creationDate", new Date(date));

Ticket ticket358 = new OrderTicket("Don't step on the broken glass.", Status.CLOSED, employee149, customer471, 6, "Green Plants", "Unohold", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 53);

ticketManager.add(ticket358);

date = 1489018602000l;

DataGenerator.setValueToField(ticket358, "creationDate", new Date(date));

Ticket ticket359 = new RequestTicket("Rock music approaches at high velocity.", Status.PROCESSED, employee153, customer336, 8, new Date(Long.parseLong("1489154355000")), "help desk");

ticketManager.add(ticket359);

date = 1488980734000l;

DataGenerator.setValueToField(ticket359, "creationDate", new Date(date));

Ticket ticket360 = new MalfunctionTicket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", Status.CLOSED, employee51, customer313, 4, "restore");

ticketManager.add(ticket360);

date = 1489303085000l;

DataGenerator.setValueToField(ticket360, "creationDate", new Date(date));

Ticket ticket361 = new RequestTicket("Sixty-Four comes asking for bread.", Status.RECORDED, employee137, customer295, 7, new Date(Long.parseLong("1489390936000")), "help desk");

ticketManager.add(ticket361);

date = 1489205014000l;

DataGenerator.setValueToField(ticket361, "creationDate", new Date(date));

Ticket ticket362 = new MalfunctionTicket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", Status.WAITING_FOR_FEEDBACK, employee112, customer349, 1, "setup");

ticketManager.add(ticket362);

date = 1489397632000l;

DataGenerator.setValueToField(ticket362, "creationDate", new Date(date));

Ticket ticket363 = new MalfunctionTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.SOLVED, employee159, customer442, 2, "restore");

ticketManager.add(ticket363);

date = 1489266794000l;

DataGenerator.setValueToField(ticket363, "creationDate", new Date(date));

Ticket ticket364 = new RequestTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee36, customer325, 10, new Date(Long.parseLong("1489224136000")), "help desk");

ticketManager.add(ticket364);

date = 1489181765000l;

DataGenerator.setValueToField(ticket364, "creationDate", new Date(date));

Ticket ticket365 = new RequestTicket("Two seats were vacant.", Status.PROCESSED, employee45, customer394, 7, new Date(Long.parseLong("1489231998000")), "consulting");

ticketManager.add(ticket365);

date = 1489248367000l;

DataGenerator.setValueToField(ticket365, "creationDate", new Date(date));

Ticket ticket366 = new OrderTicket("A glittering gem is not enough.", Status.PROCESSED, employee57, customer250, 1, "Red Pizza", "Quad Zozlax", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 87);

ticketManager.add(ticket366);

date = 1489290925000l;

DataGenerator.setValueToField(ticket366, "creationDate", new Date(date));

Ticket ticket367 = new OrderTicket("The old apple revels in its authority.", Status.RECORDED, employee159, customer458, 4, "Micros", "Zumron", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 40);

ticketManager.add(ticket367);

date = 1489358965000l;

DataGenerator.setValueToField(ticket367, "creationDate", new Date(date));

Ticket ticket368 = new OrderTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.PROCESSED, employee101, customer441, 7, "Blue Water", "Trippletone", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 58);

ticketManager.add(ticket368);

date = 1488923589000l;

DataGenerator.setValueToField(ticket368, "creationDate", new Date(date));

Ticket ticket369 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.PROCESSED, employee4, customer300, 4, "Plog", "Quofan", "23 Putnoe Ln, Bedford MK41 9AD, Vereinigtes Königreich", 31);

ticketManager.add(ticket369);

date = 1488912312000l;

DataGenerator.setValueToField(ticket369, "creationDate", new Date(date));

Ticket ticket370 = new MalfunctionTicket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", Status.PROCESSED, employee46, customer478, 1, "restore");

ticketManager.add(ticket370);

date = 1489352355000l;

DataGenerator.setValueToField(ticket370, "creationDate", new Date(date));

Ticket ticket371 = new MalfunctionTicket("Where do random thoughts come from?", Status.CLOSED, employee233, customer450, 1, "repair");

ticketManager.add(ticket371);

date = 1488919084000l;

DataGenerator.setValueToField(ticket371, "creationDate", new Date(date));

Ticket ticket372 = new MalfunctionTicket("The waves were crashing on the shore. it was a lovely sight.", Status.CLOSED, employee245, customer423, 5, "backup");

ticketManager.add(ticket372);

date = 1489442835000l;

DataGenerator.setValueToField(ticket372, "creationDate", new Date(date));

Ticket ticket373 = new MalfunctionTicket("Wow, does that work?", Status.SOLVED, employee208, customer440, 6, "restore");

ticketManager.add(ticket373);

date = 1488938402000l;

DataGenerator.setValueToField(ticket373, "creationDate", new Date(date));

Ticket ticket374 = new OrderTicket("I'd rather be a bird than a fish.", Status.SOLVED, employee159, customer495, 2, "Red Pizza", "Haynimfax", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 62);

ticketManager.add(ticket374);

date = 1489041001000l;

DataGenerator.setValueToField(ticket374, "creationDate", new Date(date));

Ticket ticket375 = new OrderTicket("A glittering gem is not enough.", Status.WAITING_FOR_FEEDBACK, employee16, customer447, 6, "Rent", "Movejob", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 36);

ticketManager.add(ticket375);

date = 1489157890000l;

DataGenerator.setValueToField(ticket375, "creationDate", new Date(date));

Ticket ticket376 = new RequestTicket("Yeah, I think it's a good environment for learning English.", Status.CLOSED, employee21, customer388, 3, new Date(Long.parseLong("1489032324000")), "consulting");

ticketManager.add(ticket376);

date = 1489060039000l;

DataGenerator.setValueToField(ticket376, "creationDate", new Date(date));

Ticket ticket377 = new OrderTicket("A glittering gem is not enough.", Status.WAITING_FOR_FEEDBACK, employee148, customer468, 4, "Fresher", "Istrax", "20 School Ln, Bradford BD6 1QX, Vereinigtes Königreich", 57);

ticketManager.add(ticket377);

date = 1489243690000l;

DataGenerator.setValueToField(ticket377, "creationDate", new Date(date));

Ticket ticket378 = new MalfunctionTicket("This is a Japanese doll.", Status.RECORDED, employee131, customer415, 0, "restore");

ticketManager.add(ticket378);

date = 1489324727000l;

DataGenerator.setValueToField(ticket378, "creationDate", new Date(date));

Ticket ticket379 = new RequestTicket("She always speaks to him in a loud voice.", Status.SOLVED, employee81, customer256, 1, new Date(Long.parseLong("1489472896000")), "checkup");

ticketManager.add(ticket379);

date = 1488930136000l;

DataGenerator.setValueToField(ticket379, "creationDate", new Date(date));

Ticket ticket380 = new RequestTicket("He told us a very exciting adventure story.", Status.CLOSED, employee54, customer315, 9, new Date(Long.parseLong("1489313960000")), "training");

ticketManager.add(ticket380);

date = 1488978183000l;

DataGenerator.setValueToField(ticket380, "creationDate", new Date(date));

Ticket ticket381 = new MalfunctionTicket("He said he was not there yesterday. however, many people saw him there.", Status.RECORDED, employee185, customer415, 9, "repair");

ticketManager.add(ticket381);

date = 1489470556000l;

DataGenerator.setValueToField(ticket381, "creationDate", new Date(date));

Ticket ticket382 = new RequestTicket("Two seats were vacant.", Status.CLOSED, employee79, customer485, 0, new Date(Long.parseLong("1489113590000")), "checkup");

ticketManager.add(ticket382);

date = 1489417657000l;

DataGenerator.setValueToField(ticket382, "creationDate", new Date(date));

Ticket ticket383 = new RequestTicket("He said he was not there yesterday. however, many people saw him there.", Status.SOLVED, employee202, customer351, 9, new Date(Long.parseLong("1489051364000")), "training");

ticketManager.add(ticket383);

date = 1488913992000l;

DataGenerator.setValueToField(ticket383, "creationDate", new Date(date));

Ticket ticket384 = new MalfunctionTicket("He ran out of money, so he had to stop playing poker.", Status.CLOSED, employee90, customer376, 6, "remove");

ticketManager.add(ticket384);

date = 1488988740000l;

DataGenerator.setValueToField(ticket384, "creationDate", new Date(date));

Ticket ticket385 = new OrderTicket("Christmas is coming.", Status.SOLVED, employee179, customer448, 1, "Plog", "Quad Zozlax", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 60);

ticketManager.add(ticket385);

date = 1489265671000l;

DataGenerator.setValueToField(ticket385, "creationDate", new Date(date));

Ticket ticket386 = new MalfunctionTicket("Lets all be unique together until we realise we are all the same.", Status.WAITING_FOR_FEEDBACK, employee142, customer279, 0, "remove");

ticketManager.add(ticket386);

date = 1489225616000l;

DataGenerator.setValueToField(ticket386, "creationDate", new Date(date));

Ticket ticket387 = new MalfunctionTicket("She always speaks to him in a loud voice.", Status.CLOSED, employee242, customer316, 8, "remove");

ticketManager.add(ticket387);

date = 1488953324000l;

DataGenerator.setValueToField(ticket387, "creationDate", new Date(date));

Ticket ticket388 = new MalfunctionTicket("Check back tomorrow. I will see if the book has arrived.", Status.RECORDED, employee213, customer276, 1, "backup");

ticketManager.add(ticket388);

date = 1489222339000l;

DataGenerator.setValueToField(ticket388, "creationDate", new Date(date));

Ticket ticket389 = new MalfunctionTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.RECORDED, employee218, customer358, 0, "backup");

ticketManager.add(ticket389);

date = 1489097491000l;

DataGenerator.setValueToField(ticket389, "creationDate", new Date(date));

Ticket ticket390 = new MalfunctionTicket("She only paints with bold colors. she does not like pastels.", Status.SOLVED, employee237, customer447, 0, "backup");

ticketManager.add(ticket390);

date = 1489178467000l;

DataGenerator.setValueToField(ticket390, "creationDate", new Date(date));

Ticket ticket391 = new MalfunctionTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.SOLVED, employee191, customer324, 10, "repair");

ticketManager.add(ticket391);

date = 1489246458000l;

DataGenerator.setValueToField(ticket391, "creationDate", new Date(date));

Ticket ticket392 = new OrderTicket("The river stole the gods.", Status.CLOSED, employee225, customer316, 4, "Plog", "Touchfresh", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 56);

ticketManager.add(ticket392);

date = 1489180436000l;

DataGenerator.setValueToField(ticket392, "creationDate", new Date(date));

Ticket ticket393 = new MalfunctionTicket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", Status.PROCESSED, employee212, customer262, 1, "repair");

ticketManager.add(ticket393);

date = 1488947041000l;

DataGenerator.setValueToField(ticket393, "creationDate", new Date(date));

Ticket ticket394 = new RequestTicket("She did her best to help him.", Status.CLOSED, employee200, customer488, 0, new Date(Long.parseLong("1489426897000")), "training");

ticketManager.add(ticket394);

date = 1488964717000l;

DataGenerator.setValueToField(ticket394, "creationDate", new Date(date));

Ticket ticket395 = new OrderTicket("The shooter says goodbye to his love.", Status.RECORDED, employee51, customer253, 2, "Blue Water", "Gravequadtam", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 95);

ticketManager.add(ticket395);

date = 1489107517000l;

DataGenerator.setValueToField(ticket395, "creationDate", new Date(date));

Ticket ticket396 = new MalfunctionTicket("The waves were crashing on the shore. it was a lovely sight.", Status.CLOSED, employee195, customer281, 2, "restore");

ticketManager.add(ticket396);

date = 1489181623000l;

DataGenerator.setValueToField(ticket396, "creationDate", new Date(date));

Ticket ticket397 = new MalfunctionTicket("She did not cheat on the test, for it was not the right thing to do.", Status.CLOSED, employee156, customer353, 6, "repair");

ticketManager.add(ticket397);

date = 1488932672000l;

DataGenerator.setValueToField(ticket397, "creationDate", new Date(date));

Ticket ticket398 = new OrderTicket("I am happy to take your donation. any amount will be greatly appreciated.", Status.CLOSED, employee143, customer389, 9, "Sunshine Ice", "Trippletone", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 82);

ticketManager.add(ticket398);

date = 1489182167000l;

DataGenerator.setValueToField(ticket398, "creationDate", new Date(date));

Ticket ticket399 = new OrderTicket("Rock music approaches at high velocity.", Status.WAITING_FOR_FEEDBACK, employee237, customer360, 0, "Micros", "Trippletone", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 78);

ticketManager.add(ticket399);

date = 1489122721000l;

DataGenerator.setValueToField(ticket399, "creationDate", new Date(date));

Ticket ticket400 = new RequestTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.PROCESSED, employee149, customer444, 4, new Date(Long.parseLong("1489097863000")), "checkup");

ticketManager.add(ticket400);

date = 1488986568000l;

DataGenerator.setValueToField(ticket400, "creationDate", new Date(date));

Ticket ticket401 = new MalfunctionTicket("The river stole the gods.", Status.PROCESSED, employee123, customer453, 4, "restore");

ticketManager.add(ticket401);

date = 1489268012000l;

DataGenerator.setValueToField(ticket401, "creationDate", new Date(date));

Ticket ticket402 = new RequestTicket("They got there early, and they got really good seats.", Status.PROCESSED, employee167, customer254, 6, new Date(Long.parseLong("1489145268000")), "checkup");

ticketManager.add(ticket402);

date = 1489348374000l;

DataGenerator.setValueToField(ticket402, "creationDate", new Date(date));

Ticket ticket403 = new RequestTicket("Where do random thoughts come from?", Status.RECORDED, employee226, customer434, 3, new Date(Long.parseLong("1489055229000")), "help desk");

ticketManager.add(ticket403);

date = 1489280845000l;

DataGenerator.setValueToField(ticket403, "creationDate", new Date(date));

Ticket ticket404 = new RequestTicket("She always speaks to him in a loud voice.", Status.PROCESSED, employee132, customer315, 1, new Date(Long.parseLong("1489414762000")), "training");

ticketManager.add(ticket404);

date = 1489233739000l;

DataGenerator.setValueToField(ticket404, "creationDate", new Date(date));

Ticket ticket405 = new RequestTicket("It was getting dark, and we weren’t there yet.", Status.SOLVED, employee190, customer481, 3, new Date(Long.parseLong("1489007390000")), "checkup");

ticketManager.add(ticket405);

date = 1489339348000l;

DataGenerator.setValueToField(ticket405, "creationDate", new Date(date));

Ticket ticket406 = new MalfunctionTicket("She only paints with bold colors. she does not like pastels.", Status.RECORDED, employee30, customer336, 10, "setup");

ticketManager.add(ticket406);

date = 1488909216000l;

DataGenerator.setValueToField(ticket406, "creationDate", new Date(date));

Ticket ticket407 = new RequestTicket("The quick brown fox jumps over the lazy dog.", Status.PROCESSED, employee148, customer358, 10, new Date(Long.parseLong("1489045441000")), "training");

ticketManager.add(ticket407);

date = 1489179797000l;

DataGenerator.setValueToField(ticket407, "creationDate", new Date(date));

Ticket ticket408 = new RequestTicket("A glittering gem is not enough.", Status.CLOSED, employee160, customer326, 10, new Date(Long.parseLong("1489194744000")), "help desk");

ticketManager.add(ticket408);

date = 1489216711000l;

DataGenerator.setValueToField(ticket408, "creationDate", new Date(date));

Ticket ticket409 = new MalfunctionTicket("She wrote him a long letter, but he didn't read it.", Status.CLOSED, employee134, customer372, 0, "restore");

ticketManager.add(ticket409);

date = 1489286193000l;

DataGenerator.setValueToField(ticket409, "creationDate", new Date(date));

Ticket ticket410 = new OrderTicket("This is a Japanese doll.", Status.PROCESSED, employee30, customer493, 2, "Micros", "Unohold", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 49);

ticketManager.add(ticket410);

date = 1489041802000l;

DataGenerator.setValueToField(ticket410, "creationDate", new Date(date));

Ticket ticket411 = new RequestTicket("Abstraction is often one floor above you.", Status.PROCESSED, employee30, customer373, 3, new Date(Long.parseLong("1489129030000")), "consulting");

ticketManager.add(ticket411);

date = 1489154678000l;

DataGenerator.setValueToField(ticket411, "creationDate", new Date(date));

Ticket ticket412 = new RequestTicket("She folded her handkerchief neatly.", Status.PROCESSED, employee93, customer356, 5, new Date(Long.parseLong("1489058692000")), "training");

ticketManager.add(ticket412);

date = 1489410066000l;

DataGenerator.setValueToField(ticket412, "creationDate", new Date(date));

Ticket ticket413 = new RequestTicket("They got there early, and they got really good seats.", Status.CLOSED, employee93, customer332, 8, new Date(Long.parseLong("1488929149000")), "checkup");

ticketManager.add(ticket413);

date = 1489090366000l;

DataGenerator.setValueToField(ticket413, "creationDate", new Date(date));

Ticket ticket414 = new RequestTicket("Christmas is coming.", Status.CLOSED, employee36, customer320, 6, new Date(Long.parseLong("1488976906000")), "checkup");

ticketManager.add(ticket414);

date = 1489211836000l;

DataGenerator.setValueToField(ticket414, "creationDate", new Date(date));

Ticket ticket415 = new OrderTicket("I often see the time 11:11 or 12:34 on clocks.", Status.PROCESSED, employee100, customer484, 1, "Telefunk", "Stockwarm", "1 Duisdale Beag, Isleornsay, Isle of Skye IV43 8QU, Deutschland ", 70);

ticketManager.add(ticket415);

date = 1489057449000l;

DataGenerator.setValueToField(ticket415, "creationDate", new Date(date));

Ticket ticket416 = new RequestTicket("Joe made the sugar cookies. Susan decorated them.", Status.RECORDED, employee92, customer407, 3, new Date(Long.parseLong("1489413112000")), "help desk");

ticketManager.add(ticket416);

date = 1489221987000l;

DataGenerator.setValueToField(ticket416, "creationDate", new Date(date));

Ticket ticket417 = new OrderTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.WAITING_FOR_FEEDBACK, employee156, customer432, 6, "Blue Water", "Don Dax", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 75);

ticketManager.add(ticket417);

date = 1489381280000l;

DataGenerator.setValueToField(ticket417, "creationDate", new Date(date));

Ticket ticket418 = new OrderTicket("There was no ice cream in the freezer, nor did they have money to go to the store.", Status.RECORDED, employee77, customer291, 0, "Rent", "Airfix", "1 Tolbury Ln, Bruton BA10, Vereinigtes Königreich", 60);

ticketManager.add(ticket418);

date = 1489268541000l;

DataGenerator.setValueToField(ticket418, "creationDate", new Date(date));

Ticket ticket419 = new OrderTicket("We need to rent a room for our party.", Status.PROCESSED, employee139, customer407, 1, "Quil", "Trippletone", "33B Castle St, Lisburn BT27 4SP, Vereinigtes Königreich", 43);

ticketManager.add(ticket419);

date = 1488984431000l;

DataGenerator.setValueToField(ticket419, "creationDate", new Date(date));

Ticket ticket420 = new RequestTicket("Abstraction is often one floor above you.", Status.PROCESSED, employee102, customer280, 7, new Date(Long.parseLong("1488980307000")), "checkup");

ticketManager.add(ticket420);

date = 1488902872000l;

DataGenerator.setValueToField(ticket420, "creationDate", new Date(date));

Ticket ticket421 = new MalfunctionTicket("I want more detailed information.", Status.PROCESSED, employee243, customer403, 9, "restore");

ticketManager.add(ticket421);

date = 1488973456000l;

DataGenerator.setValueToField(ticket421, "creationDate", new Date(date));

Ticket ticket422 = new RequestTicket("The shooter says goodbye to his love.", Status.PROCESSED, employee95, customer295, 3, new Date(Long.parseLong("1489084464000")), "checkup");

ticketManager.add(ticket422);

date = 1489159254000l;

DataGenerator.setValueToField(ticket422, "creationDate", new Date(date));

Ticket ticket423 = new RequestTicket("I want to buy a onesie… but know it won’t suit me.", Status.PROCESSED, employee38, customer304, 6, new Date(Long.parseLong("1489407129000")), "help desk");

ticketManager.add(ticket423);

date = 1488895250000l;

DataGenerator.setValueToField(ticket423, "creationDate", new Date(date));

Ticket ticket424 = new MalfunctionTicket("I think I will buy the red car, or I will lease the blue one.", Status.CLOSED, employee133, customer374, 10, "repair");

ticketManager.add(ticket424);

date = 1488900996000l;

DataGenerator.setValueToField(ticket424, "creationDate", new Date(date));

Ticket ticket425 = new MalfunctionTicket("She only paints with bold colors. she does not like pastels.", Status.CLOSED, employee194, customer252, 5, "repair");

ticketManager.add(ticket425);

date = 1489014919000l;

DataGenerator.setValueToField(ticket425, "creationDate", new Date(date));

Ticket ticket426 = new RequestTicket("Hurry!", Status.SOLVED, employee219, customer312, 10, new Date(Long.parseLong("1489121860000")), "help desk");

ticketManager.add(ticket426);

date = 1489450433000l;

DataGenerator.setValueToField(ticket426, "creationDate", new Date(date));

Ticket ticket427 = new MalfunctionTicket("She borrowed the book from him many years ago and hasn't yet returned it.", Status.PROCESSED, employee219, customer405, 5, "remove");

ticketManager.add(ticket427);

date = 1489114808000l;

DataGenerator.setValueToField(ticket427, "creationDate", new Date(date));

Ticket ticket428 = new RequestTicket("The waves were crashing on the shore. it was a lovely sight.", Status.RECORDED, employee223, customer347, 6, new Date(Long.parseLong("1489387033000")), "consulting");

ticketManager.add(ticket428);

date = 1489333079000l;

DataGenerator.setValueToField(ticket428, "creationDate", new Date(date));

Ticket ticket429 = new MalfunctionTicket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", Status.SOLVED, employee96, customer399, 0, "repair");

ticketManager.add(ticket429);

date = 1488937007000l;

DataGenerator.setValueToField(ticket429, "creationDate", new Date(date));

Ticket ticket430 = new OrderTicket("Lets all be unique together until we realise we are all the same.", Status.PROCESSED, employee231, customer401, 5, "Quil", "Trippletone", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 67);

ticketManager.add(ticket430);

date = 1489199916000l;

DataGenerator.setValueToField(ticket430, "creationDate", new Date(date));

Ticket ticket431 = new MalfunctionTicket("The mysterious diary records the voice.", Status.RECORDED, employee104, customer472, 4, "remove");

ticketManager.add(ticket431);

date = 1489471457000l;

DataGenerator.setValueToField(ticket431, "creationDate", new Date(date));

Ticket ticket432 = new OrderTicket("It was getting dark, and we weren’t there yet.", Status.RECORDED, employee155, customer283, 7, "Rent", "Istrax", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 92);

ticketManager.add(ticket432);

date = 1489293191000l;

DataGenerator.setValueToField(ticket432, "creationDate", new Date(date));

Ticket ticket433 = new OrderTicket("She was too short to see over the fence.", Status.CLOSED, employee67, customer321, 1, "Rent", "Zamcanplus", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 45);

ticketManager.add(ticket433);

date = 1489258741000l;

DataGenerator.setValueToField(ticket433, "creationDate", new Date(date));

Ticket ticket434 = new OrderTicket("The old apple revels in its authority.", Status.RECORDED, employee166, customer285, 10, "Plog", "Don Dax", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 34);

ticketManager.add(ticket434);

date = 1489285484000l;

DataGenerator.setValueToField(ticket434, "creationDate", new Date(date));

Ticket ticket435 = new MalfunctionTicket("I am never at home on Sundays.", Status.PROCESSED, employee244, customer456, 3, "backup");

ticketManager.add(ticket435);

date = 1489270626000l;

DataGenerator.setValueToField(ticket435, "creationDate", new Date(date));

Ticket ticket436 = new MalfunctionTicket("Two seats were vacant.", Status.CLOSED, employee4, customer387, 1, "remove");

ticketManager.add(ticket436);

date = 1489428901000l;

DataGenerator.setValueToField(ticket436, "creationDate", new Date(date));

Ticket ticket437 = new MalfunctionTicket("We have a lot of rain in June.", Status.SOLVED, employee195, customer473, 5, "restore");

ticketManager.add(ticket437);

date = 1489296674000l;

DataGenerator.setValueToField(ticket437, "creationDate", new Date(date));

Ticket ticket438 = new MalfunctionTicket("She wrote him a long letter, but he didn't read it.", Status.SOLVED, employee235, customer467, 2, "repair");

ticketManager.add(ticket438);

date = 1489147633000l;

DataGenerator.setValueToField(ticket438, "creationDate", new Date(date));

Ticket ticket439 = new MalfunctionTicket("He ran out of money, so he had to stop playing poker.", Status.RECORDED, employee2, customer302, 7, "backup");

ticketManager.add(ticket439);

date = 1489473170000l;

DataGenerator.setValueToField(ticket439, "creationDate", new Date(date));

Ticket ticket440 = new MalfunctionTicket("She only paints with bold colors. she does not like pastels.", Status.CLOSED, employee186, customer451, 3, "repair");

ticketManager.add(ticket440);

date = 1489057896000l;

DataGenerator.setValueToField(ticket440, "creationDate", new Date(date));

Ticket ticket441 = new MalfunctionTicket("He didn’t want to go to the dentist, yet he went anyway.", Status.RECORDED, employee88, customer436, 7, "setup");

ticketManager.add(ticket441);

date = 1489113014000l;

DataGenerator.setValueToField(ticket441, "creationDate", new Date(date));

Ticket ticket442 = new OrderTicket("Cats are good pets, for they are clean and are not noisy.", Status.PROCESSED, employee129, customer367, 5, "Blue Water", "Zamcanplus", "9 Stowmarket Cl, Earley, Reading RG6 3UA, Vereinigtes Königreich", 47);

ticketManager.add(ticket442);

date = 1489248926000l;

DataGenerator.setValueToField(ticket442, "creationDate", new Date(date));

Ticket ticket443 = new RequestTicket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", Status.SOLVED, employee44, customer287, 3, new Date(Long.parseLong("1488984423000")), "training");

ticketManager.add(ticket443);

date = 1489391593000l;

DataGenerator.setValueToField(ticket443, "creationDate", new Date(date));

Ticket ticket444 = new MalfunctionTicket("He ran out of money, so he had to stop playing poker.", Status.CLOSED, employee59, customer420, 6, "remove");

ticketManager.add(ticket444);

date = 1489358333000l;

DataGenerator.setValueToField(ticket444, "creationDate", new Date(date));

Ticket ticket445 = new OrderTicket("Two seats were vacant.", Status.PROCESSED, employee166, customer415, 2, "Micros", "Unolab", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 97);

ticketManager.add(ticket445);

date = 1489133046000l;

DataGenerator.setValueToField(ticket445, "creationDate", new Date(date));

Ticket ticket446 = new MalfunctionTicket("I currently have 4 windows open up… and I don’t know why.", Status.WAITING_FOR_FEEDBACK, employee203, customer255, 0, "backup");

ticketManager.add(ticket446);

date = 1489159075000l;

DataGenerator.setValueToField(ticket446, "creationDate", new Date(date));

Ticket ticket447 = new MalfunctionTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.PROCESSED, employee171, customer453, 4, "remove");

ticketManager.add(ticket447);

date = 1488999319000l;

DataGenerator.setValueToField(ticket447, "creationDate", new Date(date));

Ticket ticket448 = new MalfunctionTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.PROCESSED, employee64, customer457, 6, "repair");

ticketManager.add(ticket448);

date = 1489304488000l;

DataGenerator.setValueToField(ticket448, "creationDate", new Date(date));

Ticket ticket449 = new OrderTicket("Let me help you with your baggage.", Status.PROCESSED, employee127, customer444, 2, "Green Plants", "Touchfresh", "19 Bawdale Rd, East Dulwich, London SE22 9DL, Vereinigtes Königreich", 58);

ticketManager.add(ticket449);

date = 1489236617000l;

DataGenerator.setValueToField(ticket449, "creationDate", new Date(date));

Ticket ticket450 = new MalfunctionTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.CLOSED, employee158, customer383, 4, "remove");

ticketManager.add(ticket450);

date = 1488950952000l;

DataGenerator.setValueToField(ticket450, "creationDate", new Date(date));

Ticket ticket451 = new RequestTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.SOLVED, employee0, customer334, 5, new Date(Long.parseLong("1489247348000")), "training");

ticketManager.add(ticket451);

date = 1489024256000l;

DataGenerator.setValueToField(ticket451, "creationDate", new Date(date));

Ticket ticket452 = new RequestTicket("We have a lot of rain in June.", Status.WAITING_FOR_FEEDBACK, employee108, customer267, 7, new Date(Long.parseLong("1489350482000")), "consulting");

ticketManager.add(ticket452);

date = 1489080883000l;

DataGenerator.setValueToField(ticket452, "creationDate", new Date(date));

Ticket ticket453 = new MalfunctionTicket("I was very proud of my nickname throughout high school but today- I couldn’t be any different to what my nickname was.", Status.WAITING_FOR_FEEDBACK, employee205, customer443, 8, "backup");

ticketManager.add(ticket453);

date = 1489262430000l;

DataGenerator.setValueToField(ticket453, "creationDate", new Date(date));

Ticket ticket454 = new RequestTicket("We have never been to Asia, nor have we visited Africa.", Status.RECORDED, employee47, customer353, 10, new Date(Long.parseLong("1488962665000")), "help desk");

ticketManager.add(ticket454);

date = 1489043704000l;

DataGenerator.setValueToField(ticket454, "creationDate", new Date(date));

Ticket ticket455 = new RequestTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.WAITING_FOR_FEEDBACK, employee0, customer252, 4, new Date(Long.parseLong("1489051351000")), "consulting");

ticketManager.add(ticket455);

date = 1489465612000l;

DataGenerator.setValueToField(ticket455, "creationDate", new Date(date));

Ticket ticket456 = new OrderTicket("Let me help you with your baggage.", Status.WAITING_FOR_FEEDBACK, employee186, customer254, 3, "Fresher", "Greenstring", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 80);

ticketManager.add(ticket456);

date = 1488929800000l;

DataGenerator.setValueToField(ticket456, "creationDate", new Date(date));

Ticket ticket457 = new MalfunctionTicket("I want more detailed information.", Status.SOLVED, employee47, customer327, 8, "repair");

ticketManager.add(ticket457);

date = 1489294449000l;

DataGenerator.setValueToField(ticket457, "creationDate", new Date(date));

Ticket ticket458 = new RequestTicket("Mary plays the piano.", Status.CLOSED, employee133, customer430, 4, new Date(Long.parseLong("1489464852000")), "consulting");

ticketManager.add(ticket458);

date = 1489108534000l;

DataGenerator.setValueToField(ticket458, "creationDate", new Date(date));

Ticket ticket459 = new MalfunctionTicket("Don't step on the broken glass.", Status.WAITING_FOR_FEEDBACK, employee81, customer485, 9, "backup");

ticketManager.add(ticket459);

date = 1489318277000l;

DataGenerator.setValueToField(ticket459, "creationDate", new Date(date));

Ticket ticket460 = new OrderTicket("Cats are good pets, for they are clean and are not noisy.", Status.WAITING_FOR_FEEDBACK, employee58, customer495, 10, "Red Pizza", "Icetam", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 71);

ticketManager.add(ticket460);

date = 1489316846000l;

DataGenerator.setValueToField(ticket460, "creationDate", new Date(date));

Ticket ticket461 = new OrderTicket("Yeah, I think it's a good environment for learning English.", Status.WAITING_FOR_FEEDBACK, employee93, customer411, 8, "Green Plants", "Quad Zozlax", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 66);

ticketManager.add(ticket461);

date = 1489272554000l;

DataGenerator.setValueToField(ticket461, "creationDate", new Date(date));

Ticket ticket462 = new RequestTicket("Lets all be unique together until we realise we are all the same.", Status.RECORDED, employee204, customer339, 10, new Date(Long.parseLong("1489435539000")), "training");

ticketManager.add(ticket462);

date = 1489258359000l;

DataGenerator.setValueToField(ticket462, "creationDate", new Date(date));

Ticket ticket463 = new RequestTicket("Tom got a small piece of pie.", Status.CLOSED, employee162, customer318, 7, new Date(Long.parseLong("1489101429000")), "checkup");

ticketManager.add(ticket463);

date = 1489185629000l;

DataGenerator.setValueToField(ticket463, "creationDate", new Date(date));

Ticket ticket464 = new MalfunctionTicket("Abstraction is often one floor above you.", Status.PROCESSED, employee14, customer481, 10, "setup");

ticketManager.add(ticket464);

date = 1489195667000l;

DataGenerator.setValueToField(ticket464, "creationDate", new Date(date));

Ticket ticket465 = new OrderTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee148, customer400, 0, "Quil", "Istrax", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 67);

ticketManager.add(ticket465);

date = 1489394178000l;

DataGenerator.setValueToField(ticket465, "creationDate", new Date(date));

Ticket ticket466 = new RequestTicket("She wrote him a long letter, but he didn't read it.", Status.WAITING_FOR_FEEDBACK, employee107, customer268, 2, new Date(Long.parseLong("1489312903000")), "consulting");

ticketManager.add(ticket466);

date = 1489362814000l;

DataGenerator.setValueToField(ticket466, "creationDate", new Date(date));

Ticket ticket467 = new MalfunctionTicket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", Status.WAITING_FOR_FEEDBACK, employee154, customer376, 5, "setup");

ticketManager.add(ticket467);

date = 1489191633000l;

DataGenerator.setValueToField(ticket467, "creationDate", new Date(date));

Ticket ticket468 = new OrderTicket("She advised him to come back at once.", Status.RECORDED, employee179, customer437, 7, "Sunshine Ice", "Unolab", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 87);

ticketManager.add(ticket468);

date = 1489205492000l;

DataGenerator.setValueToField(ticket468, "creationDate", new Date(date));

Ticket ticket469 = new RequestTicket("I am never at home on Sundays.", Status.RECORDED, employee34, customer378, 10, new Date(Long.parseLong("1489438631000")), "help desk");

ticketManager.add(ticket469);

date = 1489442684000l;

DataGenerator.setValueToField(ticket469, "creationDate", new Date(date));

Ticket ticket470 = new RequestTicket("We have a lot of rain in June.", Status.CLOSED, employee19, customer262, 9, new Date(Long.parseLong("1489457699000")), "checkup");

ticketManager.add(ticket470);

date = 1489018503000l;

DataGenerator.setValueToField(ticket470, "creationDate", new Date(date));

Ticket ticket471 = new MalfunctionTicket("The memory we used to share is no longer coherent.", Status.RECORDED, employee43, customer432, 9, "restore");

ticketManager.add(ticket471);

date = 1489165875000l;

DataGenerator.setValueToField(ticket471, "creationDate", new Date(date));

Ticket ticket472 = new MalfunctionTicket("She wrote him a long letter, but he didn't read it.", Status.CLOSED, employee89, customer258, 0, "repair");

ticketManager.add(ticket472);

date = 1489289063000l;

DataGenerator.setValueToField(ticket472, "creationDate", new Date(date));

Ticket ticket473 = new OrderTicket("How was the math test?", Status.SOLVED, employee85, customer319, 10, "Sunshine Ice", "Vilasonit", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 88);

ticketManager.add(ticket473);

date = 1489033034000l;

DataGenerator.setValueToField(ticket473, "creationDate", new Date(date));

Ticket ticket474 = new RequestTicket("It was getting dark, and we weren’t there yet.", Status.RECORDED, employee93, customer364, 10, new Date(Long.parseLong("1489305775000")), "checkup");

ticketManager.add(ticket474);

date = 1489172027000l;

DataGenerator.setValueToField(ticket474, "creationDate", new Date(date));

Ticket ticket475 = new MalfunctionTicket("She did not cheat on the test, for it was not the right thing to do.", Status.WAITING_FOR_FEEDBACK, employee55, customer389, 2, "backup");

ticketManager.add(ticket475);

date = 1488882935000l;

DataGenerator.setValueToField(ticket475, "creationDate", new Date(date));

Ticket ticket476 = new OrderTicket("She folded her handkerchief neatly.", Status.SOLVED, employee120, customer349, 8, "Red Pizza", "Tamtom", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 52);

ticketManager.add(ticket476);

date = 1489384698000l;

DataGenerator.setValueToField(ticket476, "creationDate", new Date(date));

Ticket ticket477 = new OrderTicket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", Status.SOLVED, employee74, customer369, 7, "Micros", "Trippletone", "27 Glouster Pl, Brighton BN1 1AA, Vereinigtes Königreich", 58);

ticketManager.add(ticket477);

date = 1489472545000l;

DataGenerator.setValueToField(ticket477, "creationDate", new Date(date));

Ticket ticket478 = new OrderTicket("How was the math test?", Status.WAITING_FOR_FEEDBACK, employee160, customer477, 2, "Sunshine Ice", "Trippletone", "2A Meadow St, Great Harwood, Blackburn BB6 7EF, Vereinigtes Königreich", 78);

ticketManager.add(ticket478);

date = 1489052814000l;

DataGenerator.setValueToField(ticket478, "creationDate", new Date(date));

Ticket ticket479 = new RequestTicket("This is the last random sentence I will be writing and I am going to stop mid-sent", Status.WAITING_FOR_FEEDBACK, employee198, customer383, 0, new Date(Long.parseLong("1488947991000")), "consulting");

ticketManager.add(ticket479);

date = 1489037140000l;

DataGenerator.setValueToField(ticket479, "creationDate", new Date(date));

Ticket ticket480 = new MalfunctionTicket("We need to rent a room for our party.", Status.WAITING_FOR_FEEDBACK, employee69, customer287, 4, "backup");

ticketManager.add(ticket480);

date = 1488886168000l;

DataGenerator.setValueToField(ticket480, "creationDate", new Date(date));

Ticket ticket481 = new RequestTicket("Check back tomorrow. I will see if the book has arrived.", Status.CLOSED, employee201, customer296, 1, new Date(Long.parseLong("1489453522000")), "checkup");

ticketManager.add(ticket481);

date = 1488990529000l;

DataGenerator.setValueToField(ticket481, "creationDate", new Date(date));

Ticket ticket482 = new OrderTicket("She only paints with bold colors. she does not like pastels.", Status.CLOSED, employee34, customer315, 6, "Quil", "Zamcanplus", "9 Cromarty View, Nairn IV12 4HX, Vereinigtes Königreich", 41);

ticketManager.add(ticket482);

date = 1489461862000l;

DataGenerator.setValueToField(ticket482, "creationDate", new Date(date));

Ticket ticket483 = new RequestTicket("The book is in front of the table.", Status.SOLVED, employee3, customer417, 5, new Date(Long.parseLong("1488989384000")), "consulting");

ticketManager.add(ticket483);

date = 1489271881000l;

DataGenerator.setValueToField(ticket483, "creationDate", new Date(date));

Ticket ticket484 = new OrderTicket("Tom got a small piece of pie.", Status.CLOSED, employee29, customer401, 6, "Sunshine Ice", "Home Ovetone", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 100);

ticketManager.add(ticket484);

date = 1489362017000l;

DataGenerator.setValueToField(ticket484, "creationDate", new Date(date));

Ticket ticket485 = new OrderTicket("A glittering gem is not enough.", Status.SOLVED, employee196, customer406, 9, "Micros", "Haynimfax", "10-12 A44, Woodstock OX20 1TR, Vereinigtes Königreich", 64);

ticketManager.add(ticket485);

date = 1489284520000l;

DataGenerator.setValueToField(ticket485, "creationDate", new Date(date));

Ticket ticket486 = new RequestTicket("My Mum tries to be cool by saying that she likes all the same things that I do.", Status.SOLVED, employee201, customer336, 8, new Date(Long.parseLong("1488960499000")), "help desk");

ticketManager.add(ticket486);

date = 1488934488000l;

DataGenerator.setValueToField(ticket486, "creationDate", new Date(date));

Ticket ticket487 = new MalfunctionTicket("We need to rent a room for our party.", Status.SOLVED, employee45, customer409, 6, "setup");

ticketManager.add(ticket487);

date = 1488986905000l;

DataGenerator.setValueToField(ticket487, "creationDate", new Date(date));

Ticket ticket488 = new OrderTicket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", Status.CLOSED, employee169, customer272, 5, "Green Plants", "Tonlab", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 100);

ticketManager.add(ticket488);

date = 1488910740000l;

DataGenerator.setValueToField(ticket488, "creationDate", new Date(date));

Ticket ticket489 = new RequestTicket("I really want to go to work, but I am too sick to drive.", Status.CLOSED, employee244, customer322, 10, new Date(Long.parseLong("1489311786000")), "consulting");

ticketManager.add(ticket489);

date = 1488978327000l;

DataGenerator.setValueToField(ticket489, "creationDate", new Date(date));

Ticket ticket490 = new OrderTicket("There were white out conditions in the town. subsequently, the roads were impassable.", Status.SOLVED, employee199, customer463, 7, "Red Pizza", "Greenstring", "22 Westbrook Gardens, Bracknell RG12, Vereinigtes Königreich", 63);

ticketManager.add(ticket490);

date = 1489363237000l;

DataGenerator.setValueToField(ticket490, "creationDate", new Date(date));

Ticket ticket491 = new RequestTicket("I currently have 4 windows open up… and I don’t know why.", Status.CLOSED, employee190, customer493, 0, new Date(Long.parseLong("1489069967000")), "training");

ticketManager.add(ticket491);

date = 1489131873000l;

DataGenerator.setValueToField(ticket491, "creationDate", new Date(date));

Ticket ticket492 = new RequestTicket("Rock music approaches at high velocity.", Status.RECORDED, employee39, customer482, 1, new Date(Long.parseLong("1489065134000")), "checkup");

ticketManager.add(ticket492);

date = 1489374636000l;

DataGenerator.setValueToField(ticket492, "creationDate", new Date(date));

Ticket ticket493 = new RequestTicket("Sixty-Four comes asking for bread.", Status.WAITING_FOR_FEEDBACK, employee85, customer431, 4, new Date(Long.parseLong("1489361989000")), "training");

ticketManager.add(ticket493);

date = 1489424490000l;

DataGenerator.setValueToField(ticket493, "creationDate", new Date(date));

Ticket ticket494 = new MalfunctionTicket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", Status.RECORDED, employee25, customer465, 1, "remove");

ticketManager.add(ticket494);

date = 1489088219000l;

DataGenerator.setValueToField(ticket494, "creationDate", new Date(date));

Ticket ticket495 = new OrderTicket("He ran out of money, so he had to stop playing poker.", Status.CLOSED, employee190, customer360, 1, "Green Plants", "Vilasonit", "27 Brookway, Birkenhead, Prenton CH43, Vereinigtes Königreich", 60);

ticketManager.add(ticket495);

date = 1488974419000l;

DataGenerator.setValueToField(ticket495, "creationDate", new Date(date));

Ticket ticket496 = new RequestTicket("Malls are great places to shop. I can find everything I need under one roof.", Status.WAITING_FOR_FEEDBACK, employee119, customer377, 4, new Date(Long.parseLong("1489137290000")), "consulting");

ticketManager.add(ticket496);

date = 1489408784000l;

DataGenerator.setValueToField(ticket496, "creationDate", new Date(date));

Ticket ticket497 = new RequestTicket("She only paints with bold colors. she does not like pastels.", Status.WAITING_FOR_FEEDBACK, employee177, customer460, 2, new Date(Long.parseLong("1489393602000")), "help desk");

ticketManager.add(ticket497);

date = 1489028909000l;

DataGenerator.setValueToField(ticket497, "creationDate", new Date(date));

Ticket ticket498 = new OrderTicket("We have a lot of rain in June.", Status.SOLVED, employee170, customer430, 9, "Plog", "Gravequadtam", "43 Raeburn Dr, Bradford BD6 2LN, Vereinigtes Königreich", 91);

ticketManager.add(ticket498);

date = 1489030171000l;

DataGenerator.setValueToField(ticket498, "creationDate", new Date(date));

Ticket ticket499 = new OrderTicket("If I don’t like something, I’ll stay away from it.", Status.WAITING_FOR_FEEDBACK, employee80, customer476, 7, "Rent", "Daltron", "14 Pedley Ln, Wisbech PE13 1SN, Vereinigtes Königreich", 34);

ticketManager.add(ticket499);

date = 1489376891000l;

DataGenerator.setValueToField(ticket499, "creationDate", new Date(date));

}
}