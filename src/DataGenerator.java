import de.ddi.ticketsystem.*;

import java.util.Date;

import java.lang.reflect.Field;

public class DataGenerator {

public static Employee employee;

public static Customer customer;

public static long date;

public static void setValueToField(Object o, String name, Object content) {         Field field;         try { field = o.getClass().getDeclaredField(name); field.setAccessible(true); field.set(o, content);         } catch (Exception e) { System.out.print(e); } }

public static void fillTicketManager(TicketManager ticketManager) {

Employee employee0 = new Employee("Benjamin", "Landry", "benjamin.landry@our-company.com", "IT");

employee = employee0;

Employee employee1 = new Employee("Leanna", "Glenn", "leanna.glenn@our-company.com", "Marketing");

Employee employee2 = new Employee("Davian", "Krueger", "davian.krueger@our-company.com", "Management");

Employee employee3 = new Employee("Isla", "Combs", "isla.combs@our-company.com", "Technical Support");

Employee employee4 = new Employee("Annika", "Gross", "annika.gross@our-company.com", "Management");

Employee employee5 = new Employee("Deon", "Blankenship", "deon.blankenship@our-company.com", "Logistic");

Employee employee6 = new Employee("Naima", "Herring", "naima.herring@our-company.com", "IT");

Employee employee7 = new Employee("Lara", "Baird", "lara.baird@our-company.com", "Logistic");

Employee employee8 = new Employee("Gina", "Nguyen", "gina.nguyen@our-company.com", "Technical Support");

Employee employee9 = new Employee("Kadyn", "Pierce", "kadyn.pierce@our-company.com", "Logistic");

Employee employee10 = new Employee("Patience", "Cole", "patience.cole@our-company.com", "Technical Support");

Employee employee11 = new Employee("Johnathan", "Hardin", "johnathan.hardin@our-company.com", "Warrehousing");

Employee employee12 = new Employee("Ethan", "Donaldson", "ethan.donaldson@our-company.com", "Technical Support");

Employee employee13 = new Employee("Diana", "Stanton", "diana.stanton@our-company.com", "Marketing");

Employee employee14 = new Employee("Dylan", "Harmon", "dylan.harmon@our-company.com", "IT");

Employee employee15 = new Employee("Ian", "Kelley", "ian.kelley@our-company.com", "IT");

Employee employee16 = new Employee("Leia", "Day", "leia.day@our-company.com", "IT");

Employee employee17 = new Employee("Fabian", "Dixon", "fabian.dixon@our-company.com", "Technical Support");

Employee employee18 = new Employee("Marley", "Barker", "marley.barker@our-company.com", "Warrehousing");

Employee employee19 = new Employee("Paige", "Singh", "paige.singh@our-company.com", "IT");

Employee employee20 = new Employee("Jaime", "Becker", "jaime.becker@our-company.com", "Logistic");

Employee employee21 = new Employee("Ernesto", "Mendez", "ernesto.mendez@our-company.com", "Management");

Employee employee22 = new Employee("Josiah", "Garcia", "josiah.garcia@our-company.com", "IT");

Employee employee23 = new Employee("Kaia", "Velazquez", "kaia.velazquez@our-company.com", "Technical Support");

Employee employee24 = new Employee("Jeramiah", "Douglas", "jeramiah.douglas@our-company.com", "Warrehousing");

Employee employee25 = new Employee("Jude", "Wallace", "jude.wallace@our-company.com", "Technical Support");

Employee employee26 = new Employee("Jaylene", "Merritt", "jaylene.merritt@our-company.com", "Technical Support");

Employee employee27 = new Employee("Cael", "Peck", "cael.peck@our-company.com", "Technical Support");

Employee employee28 = new Employee("Uriel", "Smith", "uriel.smith@our-company.com", "Logistic");

Employee employee29 = new Employee("Anahi", "Webster", "anahi.webster@our-company.com", "Technical Support");

Employee employee30 = new Employee("Connor", "Jenkins", "connor.jenkins@our-company.com", "Marketing");

Employee employee31 = new Employee("Sergio", "Carroll", "sergio.carroll@our-company.com", "Warrehousing");

Employee employee32 = new Employee("Santino", "Carey", "santino.carey@our-company.com", "Technical Support");

Employee employee33 = new Employee("Nikolas", "Hancock", "nikolas.hancock@our-company.com", "Marketing");

Employee employee34 = new Employee("Alani", "Hunter", "alani.hunter@our-company.com", "Warrehousing");

Employee employee35 = new Employee("Gerald", "Payne", "gerald.payne@our-company.com", "Warrehousing");

Employee employee36 = new Employee("Markus", "Torres", "markus.torres@our-company.com", "Logistic");

Employee employee37 = new Employee("Adonis", "Moss", "adonis.moss@our-company.com", "IT");

Employee employee38 = new Employee("Kendrick", "Arias", "kendrick.arias@our-company.com", "Warrehousing");

Employee employee39 = new Employee("Abdullah", "Gutierrez", "abdullah.gutierrez@our-company.com", "Marketing");

Employee employee40 = new Employee("Marc", "Cox", "marc.cox@our-company.com", "Warrehousing");

Employee employee41 = new Employee("Raina", "Vance", "raina.vance@our-company.com", "Marketing");

Employee employee42 = new Employee("Deandre", "Mccarty", "deandre.mccarty@our-company.com", "Technical Support");

Employee employee43 = new Employee("Semaj", "Gates", "semaj.gates@our-company.com", "Marketing");

Employee employee44 = new Employee("Alena", "Preston", "alena.preston@our-company.com", "Logistic");

Employee employee45 = new Employee("Juan", "Horton", "juan.horton@our-company.com", "IT");

Employee employee46 = new Employee("Messiah", "Riddle", "messiah.riddle@our-company.com", "Warrehousing");

Employee employee47 = new Employee("Luis", "Wells", "luis.wells@our-company.com", "Management");

Employee employee48 = new Employee("Valentina", "Stone", "valentina.stone@our-company.com", "Technical Support");

Employee employee49 = new Employee("Amiyah", "Schwartz", "amiyah.schwartz@our-company.com", "Marketing");

Employee employee50 = new Employee("Ruth", "Villa", "ruth.villa@our-company.com", "IT");

Employee employee51 = new Employee("Nina", "Lynn", "nina.lynn@our-company.com", "IT");

Employee employee52 = new Employee("Leah", "Massey", "leah.massey@our-company.com", "Technical Support");

Employee employee53 = new Employee("Lillian", "Hubbard", "lillian.hubbard@our-company.com", "Warrehousing");

Employee employee54 = new Employee("Elisabeth", "Willis", "elisabeth.willis@our-company.com", "IT");

Employee employee55 = new Employee("Mackenzie", "Wong", "mackenzie.wong@our-company.com", "Management");

Employee employee56 = new Employee("Ella", "Stokes", "ella.stokes@our-company.com", "Marketing");

Employee employee57 = new Employee("Anaya", "Brown", "anaya.brown@our-company.com", "Management");

Employee employee58 = new Employee("Dax", "Riley", "dax.riley@our-company.com", "IT");

Employee employee59 = new Employee("Caitlin", "Kane", "caitlin.kane@our-company.com", "IT");

Employee employee60 = new Employee("Pierce", "Mcgrath", "pierce.mcgrath@our-company.com", "Warrehousing");

Employee employee61 = new Employee("Paityn", "Reilly", "paityn.reilly@our-company.com", "Logistic");

Employee employee62 = new Employee("Keely", "Baker", "keely.baker@our-company.com", "Warrehousing");

Employee employee63 = new Employee("Nathalia", "Barton", "nathalia.barton@our-company.com", "Management");

Employee employee64 = new Employee("Kameron", "Robbins", "kameron.robbins@our-company.com", "Marketing");

Employee employee65 = new Employee("Xzavier", "Dean", "xzavier.dean@our-company.com", "Technical Support");

Employee employee66 = new Employee("Ellen", "Galvan", "ellen.galvan@our-company.com", "Marketing");

Employee employee67 = new Employee("Paul", "Lindsey", "paul.lindsey@our-company.com", "Logistic");

Employee employee68 = new Employee("Kaleb", "Ramirez", "kaleb.ramirez@our-company.com", "Management");

Employee employee69 = new Employee("Karley", "Farley", "karley.farley@our-company.com", "Logistic");

Employee employee70 = new Employee("Natalya", "Fuller", "natalya.fuller@our-company.com", "Warrehousing");

Employee employee71 = new Employee("Javier", "Dougherty", "javier.dougherty@our-company.com", "Logistic");

Employee employee72 = new Employee("Danna", "Forbes", "danna.forbes@our-company.com", "Warrehousing");

Employee employee73 = new Employee("Clayton", "Wiggins", "clayton.wiggins@our-company.com", "Technical Support");

Employee employee74 = new Employee("Jon", "Weaver", "jon.weaver@our-company.com", "Warrehousing");

Employee employee75 = new Employee("Jamison", "Valencia", "jamison.valencia@our-company.com", "IT");

Employee employee76 = new Employee("Anabella", "Hahn", "anabella.hahn@our-company.com", "Logistic");

Employee employee77 = new Employee("Micaela", "Morse", "micaela.morse@our-company.com", "Logistic");

Employee employee78 = new Employee("Carter", "Holland", "carter.holland@our-company.com", "Warrehousing");

Employee employee79 = new Employee("Francesca", "Lopez", "francesca.lopez@our-company.com", "Technical Support");

Employee employee80 = new Employee("Sage", "Rojas", "sage.rojas@our-company.com", "Management");

Employee employee81 = new Employee("Ibrahim", "Pope", "ibrahim.pope@our-company.com", "Management");

Employee employee82 = new Employee("Aubrey", "Li", "aubrey.li@our-company.com", "Warrehousing");

Employee employee83 = new Employee("Rodolfo", "Cannon", "rodolfo.cannon@our-company.com", "Marketing");

Employee employee84 = new Employee("Jaxson", "Wheeler", "jaxson.wheeler@our-company.com", "Technical Support");

Employee employee85 = new Employee("Diya", "Austin", "diya.austin@our-company.com", "IT");

Employee employee86 = new Employee("Arnav", "Wolfe", "arnav.wolfe@our-company.com", "Logistic");

Employee employee87 = new Employee("Claudia", "Deleon", "claudia.deleon@our-company.com", "Technical Support");

Employee employee88 = new Employee("Finnegan", "Kent", "finnegan.kent@our-company.com", "Management");

Employee employee89 = new Employee("Marquise", "Montgomery", "marquise.montgomery@our-company.com", "Marketing");

Employee employee90 = new Employee("Edward", "Mays", "edward.mays@our-company.com", "Technical Support");

Employee employee91 = new Employee("King", "Harding", "king.harding@our-company.com", "Management");

Employee employee92 = new Employee("Antwan", "Duran", "antwan.duran@our-company.com", "Technical Support");

Employee employee93 = new Employee("Ryan", "Houston", "ryan.houston@our-company.com", "Warrehousing");

Employee employee94 = new Employee("Kyra", "Sexton", "kyra.sexton@our-company.com", "IT");

Employee employee95 = new Employee("Jayla", "Lawrence", "jayla.lawrence@our-company.com", "Management");

Employee employee96 = new Employee("Jaslyn", "Sloan", "jaslyn.sloan@our-company.com", "IT");

Employee employee97 = new Employee("Jewel", "Leonard", "jewel.leonard@our-company.com", "Warrehousing");

Employee employee98 = new Employee("Saniyah", "Lozano", "saniyah.lozano@our-company.com", "Technical Support");

Employee employee99 = new Employee("Naomi", "Randolph", "naomi.randolph@our-company.com", "Logistic");

Employee employee100 = new Employee("Miriam", "Clay", "miriam.clay@our-company.com", "IT");

Employee employee101 = new Employee("Lucy", "Bartlett", "lucy.bartlett@our-company.com", "Management");

Employee employee102 = new Employee("Grayson", "Tapia", "grayson.tapia@our-company.com", "Management");

Employee employee103 = new Employee("Kaleigh", "Campbell", "kaleigh.campbell@our-company.com", "Management");

Employee employee104 = new Employee("Gwendolyn", "Luna", "gwendolyn.luna@our-company.com", "Marketing");

Employee employee105 = new Employee("Giselle", "Bryan", "giselle.bryan@our-company.com", "IT");

Employee employee106 = new Employee("Antonio", "Barber", "antonio.barber@our-company.com", "Logistic");

Employee employee107 = new Employee("Nash", "Newman", "nash.newman@our-company.com", "Logistic");

Employee employee108 = new Employee("Cameron", "David", "cameron.david@our-company.com", "Management");

Employee employee109 = new Employee("Sarai", "Christensen", "sarai.christensen@our-company.com", "Marketing");

Employee employee110 = new Employee("Ellie", "Fletcher", "ellie.fletcher@our-company.com", "Marketing");

Employee employee111 = new Employee("Savanna", "George", "savanna.george@our-company.com", "IT");

Employee employee112 = new Employee("Sydnee", "Sweeney", "sydnee.sweeney@our-company.com", "Technical Support");

Employee employee113 = new Employee("Jordon", "Mccormick", "jordon.mccormick@our-company.com", "Logistic");

Employee employee114 = new Employee("Tyrone", "Velasquez", "tyrone.velasquez@our-company.com", "Management");

Employee employee115 = new Employee("Cherish", "Cohen", "cherish.cohen@our-company.com", "Management");

Employee employee116 = new Employee("Nathanial", "Mills", "nathanial.mills@our-company.com", "Marketing");

Employee employee117 = new Employee("Kaylah", "Copeland", "kaylah.copeland@our-company.com", "Marketing");

Employee employee118 = new Employee("Rolando", "Rivas", "rolando.rivas@our-company.com", "Technical Support");

Employee employee119 = new Employee("Yasmine", "Frey", "yasmine.frey@our-company.com", "Technical Support");

Employee employee120 = new Employee("Aiyana", "Reyes", "aiyana.reyes@our-company.com", "Management");

Employee employee121 = new Employee("Justine", "Brady", "justine.brady@our-company.com", "Marketing");

Employee employee122 = new Employee("Colby", "Oliver", "colby.oliver@our-company.com", "Marketing");

Employee employee123 = new Employee("Madalynn", "Sharp", "madalynn.sharp@our-company.com", "Warrehousing");

Employee employee124 = new Employee("Clay", "Wang", "clay.wang@our-company.com", "Warrehousing");

Employee employee125 = new Employee("Laci", "Gibson", "laci.gibson@our-company.com", "Marketing");

Employee employee126 = new Employee("Damion", "Moon", "damion.moon@our-company.com", "Logistic");

Employee employee127 = new Employee("Salvatore", "Olsen", "salvatore.olsen@our-company.com", "IT");

Employee employee128 = new Employee("Sloane", "Hobbs", "sloane.hobbs@our-company.com", "IT");

Employee employee129 = new Employee("Luz", "Wilkinson", "luz.wilkinson@our-company.com", "Warrehousing");

Employee employee130 = new Employee("Gabriella", "Carlson", "gabriella.carlson@our-company.com", "Technical Support");

Employee employee131 = new Employee("Jasmine", "Zhang", "jasmine.zhang@our-company.com", "Technical Support");

Employee employee132 = new Employee("Mark", "Gallagher", "mark.gallagher@our-company.com", "Logistic");

Employee employee133 = new Employee("Aldo", "Mcknight", "aldo.mcknight@our-company.com", "Warrehousing");

Employee employee134 = new Employee("Joey", "Goodwin", "joey.goodwin@our-company.com", "Technical Support");

Employee employee135 = new Employee("Madden", "Waller", "madden.waller@our-company.com", "Logistic");

Employee employee136 = new Employee("Jack", "Pratt", "jack.pratt@our-company.com", "Technical Support");

Employee employee137 = new Employee("Maia", "Holden", "maia.holden@our-company.com", "Warrehousing");

Employee employee138 = new Employee("Lea", "Walsh", "lea.walsh@our-company.com", "IT");

Employee employee139 = new Employee("Aydan", "Mcgee", "aydan.mcgee@our-company.com", "Warrehousing");

Employee employee140 = new Employee("Leilani", "Carson", "leilani.carson@our-company.com", "Management");

Employee employee141 = new Employee("Leroy", "Crane", "leroy.crane@our-company.com", "Logistic");

Employee employee142 = new Employee("Grace", "Esparza", "grace.esparza@our-company.com", "Warrehousing");

Employee employee143 = new Employee("William", "Vincent", "william.vincent@our-company.com", "Warrehousing");

Employee employee144 = new Employee("Bethany", "Mathews", "bethany.mathews@our-company.com", "Warrehousing");

Employee employee145 = new Employee("Pamela", "Ortega", "pamela.ortega@our-company.com", "IT");

Employee employee146 = new Employee("Lisa", "Montoya", "lisa.montoya@our-company.com", "Marketing");

Employee employee147 = new Employee("Janiya", "Branch", "janiya.branch@our-company.com", "Marketing");

Employee employee148 = new Employee("Alvaro", "Norman", "alvaro.norman@our-company.com", "IT");

Employee employee149 = new Employee("Sara", "Gallegos", "sara.gallegos@our-company.com", "Technical Support");

Employee employee150 = new Employee("Elisha", "Cordova", "elisha.cordova@our-company.com", "Technical Support");

Employee employee151 = new Employee("Celia", "Friedman", "celia.friedman@our-company.com", "Warrehousing");

Employee employee152 = new Employee("Lydia", "Lewis", "lydia.lewis@our-company.com", "Technical Support");

Employee employee153 = new Employee("Matias", "Mccoy", "matias.mccoy@our-company.com", "IT");

Employee employee154 = new Employee("Kaylyn", "Bright", "kaylyn.bright@our-company.com", "IT");

Employee employee155 = new Employee("Atticus", "Perez", "atticus.perez@our-company.com", "Management");

Employee employee156 = new Employee("Amya", "Chung", "amya.chung@our-company.com", "Warrehousing");

Employee employee157 = new Employee("Jaylen", "Beck", "jaylen.beck@our-company.com", "Marketing");

Employee employee158 = new Employee("Trevor", "Simon", "trevor.simon@our-company.com", "IT");

Employee employee159 = new Employee("Lexi", "Spencer", "lexi.spencer@our-company.com", "Technical Support");

Employee employee160 = new Employee("Cloe", "James", "cloe.james@our-company.com", "Warrehousing");

Employee employee161 = new Employee("Abbey", "Weber", "abbey.weber@our-company.com", "Logistic");

Employee employee162 = new Employee("Rigoberto", "Avery", "rigoberto.avery@our-company.com", "IT");

Employee employee163 = new Employee("Carly", "Farrell", "carly.farrell@our-company.com", "Technical Support");

Employee employee164 = new Employee("Bailey", "Golden", "bailey.golden@our-company.com", "Management");

Employee employee165 = new Employee("Paris", "Buckley", "paris.buckley@our-company.com", "Warrehousing");

Employee employee166 = new Employee("Gaven", "Duffy", "gaven.duffy@our-company.com", "Logistic");

Employee employee167 = new Employee("Talia", "Ritter", "talia.ritter@our-company.com", "Logistic");

Employee employee168 = new Employee("Braedon", "Webb", "braedon.webb@our-company.com", "Logistic");

Employee employee169 = new Employee("Regan", "Doyle", "regan.doyle@our-company.com", "Marketing");

Employee employee170 = new Employee("Gianni", "Horne", "gianni.horne@our-company.com", "Logistic");

Employee employee171 = new Employee("Kiley", "Weiss", "kiley.weiss@our-company.com", "Management");

Employee employee172 = new Employee("Broderick", "Glass", "broderick.glass@our-company.com", "Warrehousing");

Employee employee173 = new Employee("Gracie", "Rich", "gracie.rich@our-company.com", "Technical Support");

Employee employee174 = new Employee("Rishi", "Kerr", "rishi.kerr@our-company.com", "Management");

Employee employee175 = new Employee("Margaret", "Marquez", "margaret.marquez@our-company.com", "IT");

Employee employee176 = new Employee("Zaria", "Giles", "zaria.giles@our-company.com", "Marketing");

Employee employee177 = new Employee("Jocelyn", "Brewer", "jocelyn.brewer@our-company.com", "Technical Support");

Employee employee178 = new Employee("Riya", "Zimmerman", "riya.zimmerman@our-company.com", "Technical Support");

Employee employee179 = new Employee("Tori", "Haynes", "tori.haynes@our-company.com", "Marketing");

Employee employee180 = new Employee("Fisher", "Richards", "fisher.richards@our-company.com", "Logistic");

Employee employee181 = new Employee("Erin", "Gilmore", "erin.gilmore@our-company.com", "Warrehousing");

Employee employee182 = new Employee("Marshall", "Martin", "marshall.martin@our-company.com", "Technical Support");

Employee employee183 = new Employee("Mila", "Arnold", "mila.arnold@our-company.com", "Logistic");

Employee employee184 = new Employee("Holden", "Holmes", "holden.holmes@our-company.com", "Logistic");

Employee employee185 = new Employee("Hayden", "Steele", "hayden.steele@our-company.com", "Logistic");

Employee employee186 = new Employee("Shirley", "Francis", "shirley.francis@our-company.com", "Technical Support");

Employee employee187 = new Employee("London", "Mejia", "london.mejia@our-company.com", "IT");

Employee employee188 = new Employee("Ryan", "Henderson", "ryan.henderson@our-company.com", "Warrehousing");

Employee employee189 = new Employee("Tomas", "Graham", "tomas.graham@our-company.com", "IT");

Employee employee190 = new Employee("Spencer", "Turner", "spencer.turner@our-company.com", "Logistic");

Employee employee191 = new Employee("Rylee", "Ferguson", "rylee.ferguson@our-company.com", "IT");

Employee employee192 = new Employee("Reuben", "Huber", "reuben.huber@our-company.com", "Marketing");

Employee employee193 = new Employee("Nia", "Christian", "nia.christian@our-company.com", "IT");

Employee employee194 = new Employee("Eugene", "Morgan", "eugene.morgan@our-company.com", "Management");

Employee employee195 = new Employee("Shayna", "Wu", "shayna.wu@our-company.com", "Warrehousing");

Employee employee196 = new Employee("Ahmad", "Levine", "ahmad.levine@our-company.com", "Logistic");

Employee employee197 = new Employee("Aubree", "Hoffman", "aubree.hoffman@our-company.com", "Logistic");

Employee employee198 = new Employee("Enzo", "Vasquez", "enzo.vasquez@our-company.com", "Marketing");

Employee employee199 = new Employee("Khalil", "Brennan", "khalil.brennan@our-company.com", "IT");

Employee employee200 = new Employee("Fernanda", "Duncan", "fernanda.duncan@our-company.com", "Marketing");

Employee employee201 = new Employee("Alaina", "Cardenas", "alaina.cardenas@our-company.com", "Warrehousing");

Employee employee202 = new Employee("Cierra", "Knapp", "cierra.knapp@our-company.com", "Management");

Employee employee203 = new Employee("Humberto", "Mcdaniel", "humberto.mcdaniel@our-company.com", "Warrehousing");

Employee employee204 = new Employee("Keith", "Fitzgerald", "keith.fitzgerald@our-company.com", "Warrehousing");

Employee employee205 = new Employee("Mattie", "Mercado", "mattie.mercado@our-company.com", "Logistic");

Employee employee206 = new Employee("Augustus", "Jensen", "augustus.jensen@our-company.com", "Technical Support");

Employee employee207 = new Employee("Jaylan", "Lara", "jaylan.lara@our-company.com", "Technical Support");

Employee employee208 = new Employee("Ava", "Horn", "ava.horn@our-company.com", "Management");

Employee employee209 = new Employee("Samson", "Mathis", "samson.mathis@our-company.com", "Marketing");

Employee employee210 = new Employee("Kylee", "Johns", "kylee.johns@our-company.com", "Management");

Employee employee211 = new Employee("Karter", "Koch", "karter.koch@our-company.com", "Management");

Employee employee212 = new Employee("Reagan", "Joyce", "reagan.joyce@our-company.com", "Marketing");

Employee employee213 = new Employee("Gunnar", "Bell", "gunnar.bell@our-company.com", "Marketing");

Employee employee214 = new Employee("Micheal", "Crawford", "micheal.crawford@our-company.com", "Logistic");

Employee employee215 = new Employee("Haven", "Arellano", "haven.arellano@our-company.com", "Logistic");

Employee employee216 = new Employee("Kaelyn", "Wilcox", "kaelyn.wilcox@our-company.com", "Warrehousing");

Employee employee217 = new Employee("Charity", "Pollard", "charity.pollard@our-company.com", "Warrehousing");

Employee employee218 = new Employee("Brynn", "Henson", "brynn.henson@our-company.com", "Warrehousing");

Employee employee219 = new Employee("Britney", "Mooney", "britney.mooney@our-company.com", "Management");

Employee employee220 = new Employee("Jorge", "Hammond", "jorge.hammond@our-company.com", "Warrehousing");

Employee employee221 = new Employee("Dalia", "Strickland", "dalia.strickland@our-company.com", "IT");

Employee employee222 = new Employee("Troy", "Greene", "troy.greene@our-company.com", "IT");

Employee employee223 = new Employee("Alyssa", "Ellis", "alyssa.ellis@our-company.com", "Technical Support");

Employee employee224 = new Employee("Meghan", "Bates", "meghan.bates@our-company.com", "Marketing");

Employee employee225 = new Employee("Ronin", "Carrillo", "ronin.carrillo@our-company.com", "Warrehousing");

Employee employee226 = new Employee("Mohammad", "Evans", "mohammad.evans@our-company.com", "Logistic");

Employee employee227 = new Employee("Ray", "Bruce", "ray.bruce@our-company.com", "Logistic");

Employee employee228 = new Employee("Ariel", "Jordan", "ariel.jordan@our-company.com", "Marketing");

Employee employee229 = new Employee("Beatrice", "Lucas", "beatrice.lucas@our-company.com", "Warrehousing");

Employee employee230 = new Employee("Tyson", "Macias", "tyson.macias@our-company.com", "Management");

Employee employee231 = new Employee("Asia", "Burgess", "asia.burgess@our-company.com", "Technical Support");

Employee employee232 = new Employee("Juliet", "Kennedy", "juliet.kennedy@our-company.com", "Warrehousing");

Employee employee233 = new Employee("Darrell", "Mercer", "darrell.mercer@our-company.com", "Marketing");

Employee employee234 = new Employee("Dayana", "Riggs", "dayana.riggs@our-company.com", "IT");

Employee employee235 = new Employee("Chandler", "House", "chandler.house@our-company.com", "Marketing");

Employee employee236 = new Employee("Scarlet", "Lowery", "scarlet.lowery@our-company.com", "IT");

Employee employee237 = new Employee("Kailey", "Sutton", "kailey.sutton@our-company.com", "Logistic");

Employee employee238 = new Employee("Stephany", "Harper", "stephany.harper@our-company.com", "Management");

Employee employee239 = new Employee("Addisyn", "Roy", "addisyn.roy@our-company.com", "Logistic");

Employee employee240 = new Employee("Amelia", "Clark", "amelia.clark@our-company.com", "Management");

Employee employee241 = new Employee("Helena", "Pacheco", "helena.pacheco@our-company.com", "Marketing");

Employee employee242 = new Employee("Rachel", "Rodgers", "rachel.rodgers@our-company.com", "Logistic");

Employee employee243 = new Employee("Robert", "Bailey", "robert.bailey@our-company.com", "Marketing");

Employee employee244 = new Employee("Sofia", "Villarreal", "sofia.villarreal@our-company.com", "Marketing");

Employee employee245 = new Employee("Mariah", "Velez", "mariah.velez@our-company.com", "IT");

Employee employee246 = new Employee("Andrew", "Nunez", "andrew.nunez@our-company.com", "Warrehousing");

Employee employee247 = new Employee("Amare", "Larsen", "amare.larsen@our-company.com", "Marketing");

Employee employee248 = new Employee("Ximena", "Ochoa", "ximena.ochoa@our-company.com", "Logistic");

Employee employee249 = new Employee("Jordan", "Cherry", "jordan.cherry@our-company.com", "IT");

Customer customer250 = new Customer("Aron", "Roman", "aron.roman@shop42.com", "Shop42");

Customer customer251 = new Customer("Deacon", "Walter", "deacon.walter@carhouse.com", "CarHouse");

Customer customer252 = new Customer("Roger", "Hester", "roger.hester@shop42.com", "Shop42");

Customer customer253 = new Customer("Aria", "Silva", "aria.silva@shop42.com", "Shop42");

Customer customer254 = new Customer("Ashtyn", "Delacruz", "ashtyn.delacruz@sportastic.com", "Sportastic");

Customer customer255 = new Customer("Dwayne", "Bush", "dwayne.bush@plantsgetgreener.com", "PlantsGetGreener");

Customer customer256 = new Customer("Shea", "Bridges", "shea.bridges@shop42.com", "Shop42");

Customer customer257 = new Customer("Penelope", "Gordon", "penelope.gordon@shop42.com", "Shop42");

Customer customer258 = new Customer("Taniya", "Benjamin", "taniya.benjamin@sportastic.com", "Sportastic");

Customer customer259 = new Customer("Katelynn", "Mayer", "katelynn.mayer@sportastic.com", "Sportastic");

Customer customer260 = new Customer("Evelin", "Madden", "evelin.madden@flyerbuzzer.com", "FlyerBuzzer");

Customer customer261 = new Customer("Jasiah", "Pruitt", "jasiah.pruitt@sportastic.com", "Sportastic");

Customer customer262 = new Customer("Annie", "Hays", "annie.hays@sportastic.com", "Sportastic");

Customer customer263 = new Customer("Ulises", "Sawyer", "ulises.sawyer@sportastic.com", "Sportastic");

Customer customer264 = new Customer("Raphael", "Rowland", "raphael.rowland@flyerbuzzer.com", "FlyerBuzzer");

Customer customer265 = new Customer("Dante", "Ward", "dante.ward@sportastic.com", "Sportastic");

Customer customer266 = new Customer("Michelle", "Parrish", "michelle.parrish@carhouse.com", "CarHouse");

Customer customer267 = new Customer("Lily", "Downs", "lily.downs@flyerbuzzer.com", "FlyerBuzzer");

Customer customer268 = new Customer("Dario", "Whitehead", "dario.whitehead@carhouse.com", "CarHouse");

Customer customer269 = new Customer("Deshawn", "Pineda", "deshawn.pineda@shop42.com", "Shop42");

Customer customer270 = new Customer("Linda", "Pena", "linda.pena@plantsgetgreener.com", "PlantsGetGreener");

Customer customer271 = new Customer("Kasen", "Walters", "kasen.walters@shop42.com", "Shop42");

Customer customer272 = new Customer("Axel", "Estrada", "axel.estrada@flyerbuzzer.com", "FlyerBuzzer");

Customer customer273 = new Customer("Brent", "Warren", "brent.warren@flyerbuzzer.com", "FlyerBuzzer");

Customer customer274 = new Customer("Belen", "Carpenter", "belen.carpenter@flyerbuzzer.com", "FlyerBuzzer");

Customer customer275 = new Customer("Noe", "Sandoval", "noe.sandoval@plantsgetgreener.com", "PlantsGetGreener");

Customer customer276 = new Customer("Lizeth", "Mendoza", "lizeth.mendoza@plantsgetgreener.com", "PlantsGetGreener");

Customer customer277 = new Customer("Julissa", "Stout", "julissa.stout@plantsgetgreener.com", "PlantsGetGreener");

Customer customer278 = new Customer("Camren", "Yates", "camren.yates@plantsgetgreener.com", "PlantsGetGreener");

Customer customer279 = new Customer("Gilbert", "Hayden", "gilbert.hayden@carhouse.com", "CarHouse");

Customer customer280 = new Customer("Shamar", "Stevenson", "shamar.stevenson@carhouse.com", "CarHouse");

Customer customer281 = new Customer("Davion", "Atkins", "davion.atkins@plantsgetgreener.com", "PlantsGetGreener");

Customer customer282 = new Customer("Dahlia", "Harrell", "dahlia.harrell@sportastic.com", "Sportastic");

Customer customer283 = new Customer("Kylie", "Hensley", "kylie.hensley@plantsgetgreener.com", "PlantsGetGreener");

Customer customer284 = new Customer("Stephen", "Richmond", "stephen.richmond@carhouse.com", "CarHouse");

Customer customer285 = new Customer("Trenton", "Tanner", "trenton.tanner@flyerbuzzer.com", "FlyerBuzzer");

Customer customer286 = new Customer("Jairo", "Dominguez", "jairo.dominguez@sportastic.com", "Sportastic");

Customer customer287 = new Customer("Gaige", "Oneill", "gaige.oneill@plantsgetgreener.com", "PlantsGetGreener");

Customer customer288 = new Customer("Layne", "Dalton", "layne.dalton@shop42.com", "Shop42");

Customer customer289 = new Customer("Amari", "Williamson", "amari.williamson@carhouse.com", "CarHouse");

Customer customer290 = new Customer("Kendall", "Leon", "kendall.leon@flyerbuzzer.com", "FlyerBuzzer");

Customer customer291 = new Customer("Karissa", "Orozco", "karissa.orozco@carhouse.com", "CarHouse");

Customer customer292 = new Customer("Jovany", "Ballard", "jovany.ballard@shop42.com", "Shop42");

Customer customer293 = new Customer("Elisa", "Huffman", "elisa.huffman@carhouse.com", "CarHouse");

Customer customer294 = new Customer("Nick", "Mccarthy", "nick.mccarthy@plantsgetgreener.com", "PlantsGetGreener");

Customer customer295 = new Customer("Jayda", "Lucero", "jayda.lucero@carhouse.com", "CarHouse");

Customer customer296 = new Customer("Leandro", "Schultz", "leandro.schultz@shop42.com", "Shop42");

Customer customer297 = new Customer("Gemma", "Callahan", "gemma.callahan@sportastic.com", "Sportastic");

Customer customer298 = new Customer("Slade", "Sims", "slade.sims@carhouse.com", "CarHouse");

Customer customer299 = new Customer("Teresa", "Nolan", "teresa.nolan@sportastic.com", "Sportastic");

Customer customer300 = new Customer("Layla", "Johnston", "layla.johnston@carhouse.com", "CarHouse");

Customer customer301 = new Customer("Jaylyn", "Sellers", "jaylyn.sellers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer302 = new Customer("Wilson", "Jones", "wilson.jones@shop42.com", "Shop42");

Customer customer303 = new Customer("Cara", "Cuevas", "cara.cuevas@plantsgetgreener.com", "PlantsGetGreener");

Customer customer304 = new Customer("Brett", "Winters", "brett.winters@carhouse.com", "CarHouse");

Customer customer305 = new Customer("Darryl", "Livingston", "darryl.livingston@carhouse.com", "CarHouse");

Customer customer306 = new Customer("Alicia", "Romero", "alicia.romero@sportastic.com", "Sportastic");

Customer customer307 = new Customer("Alessandro", "Kirby", "alessandro.kirby@sportastic.com", "Sportastic");

Customer customer308 = new Customer("Carson", "Hickman", "carson.hickman@sportastic.com", "Sportastic");

Customer customer309 = new Customer("Iyana", "Acosta", "iyana.acosta@plantsgetgreener.com", "PlantsGetGreener");

Customer customer310 = new Customer("Thomas", "Butler", "thomas.butler@plantsgetgreener.com", "PlantsGetGreener");

Customer customer311 = new Customer("Harper", "French", "harper.french@plantsgetgreener.com", "PlantsGetGreener");

Customer customer312 = new Customer("Keyla", "Maynard", "keyla.maynard@shop42.com", "Shop42");

Customer customer313 = new Customer("Easton", "Crosby", "easton.crosby@shop42.com", "Shop42");

Customer customer314 = new Customer("Madeleine", "Norton", "madeleine.norton@flyerbuzzer.com", "FlyerBuzzer");

Customer customer315 = new Customer("Trystan", "Larson", "trystan.larson@shop42.com", "Shop42");

Customer customer316 = new Customer("Jillian", "Palmer", "jillian.palmer@shop42.com", "Shop42");

Customer customer317 = new Customer("Amanda", "Stanley", "amanda.stanley@flyerbuzzer.com", "FlyerBuzzer");

Customer customer318 = new Customer("Lincoln", "Baldwin", "lincoln.baldwin@carhouse.com", "CarHouse");

Customer customer319 = new Customer("Melissa", "Ellison", "melissa.ellison@sportastic.com", "Sportastic");

Customer customer320 = new Customer("Aimee", "Aguilar", "aimee.aguilar@sportastic.com", "Sportastic");

Customer customer321 = new Customer("Gilberto", "Adkins", "gilberto.adkins@flyerbuzzer.com", "FlyerBuzzer");

Customer customer322 = new Customer("Alexander", "Gay", "alexander.gay@plantsgetgreener.com", "PlantsGetGreener");

Customer customer323 = new Customer("Demetrius", "Martinez", "demetrius.martinez@carhouse.com", "CarHouse");

Customer customer324 = new Customer("Rogelio", "Ingram", "rogelio.ingram@flyerbuzzer.com", "FlyerBuzzer");

Customer customer325 = new Customer("Deangelo", "Galloway", "deangelo.galloway@plantsgetgreener.com", "PlantsGetGreener");

Customer customer326 = new Customer("Zander", "King", "zander.king@carhouse.com", "CarHouse");

Customer customer327 = new Customer("Ethen", "Barnes", "ethen.barnes@carhouse.com", "CarHouse");

Customer customer328 = new Customer("Donna", "Sanders", "donna.sanders@plantsgetgreener.com", "PlantsGetGreener");

Customer customer329 = new Customer("Valentin", "Zavala", "valentin.zavala@carhouse.com", "CarHouse");

Customer customer330 = new Customer("Liana", "Charles", "liana.charles@carhouse.com", "CarHouse");

Customer customer331 = new Customer("Moshe", "Bowen", "moshe.bowen@carhouse.com", "CarHouse");

Customer customer332 = new Customer("Ciara", "Nielsen", "ciara.nielsen@flyerbuzzer.com", "FlyerBuzzer");

Customer customer333 = new Customer("Kianna", "Foley", "kianna.foley@plantsgetgreener.com", "PlantsGetGreener");

Customer customer334 = new Customer("Helen", "Murphy", "helen.murphy@sportastic.com", "Sportastic");

Customer customer335 = new Customer("Willie", "Oneal", "willie.oneal@shop42.com", "Shop42");

Customer customer336 = new Customer("Christina", "Booker", "christina.booker@carhouse.com", "CarHouse");

Customer customer337 = new Customer("Micah", "Fritz", "micah.fritz@flyerbuzzer.com", "FlyerBuzzer");

Customer customer338 = new Customer("Giovani", "Russo", "giovani.russo@carhouse.com", "CarHouse");

Customer customer339 = new Customer("Emerson", "Coffey", "emerson.coffey@shop42.com", "Shop42");

Customer customer340 = new Customer("Shaun", "Espinoza", "shaun.espinoza@plantsgetgreener.com", "PlantsGetGreener");

Customer customer341 = new Customer("Colin", "Clements", "colin.clements@shop42.com", "Shop42");

Customer customer342 = new Customer("Rebekah", "Vargas", "rebekah.vargas@carhouse.com", "CarHouse");

Customer customer343 = new Customer("Ingrid", "Pace", "ingrid.pace@plantsgetgreener.com", "PlantsGetGreener");

Customer customer344 = new Customer("Carlie", "Blackburn", "carlie.blackburn@sportastic.com", "Sportastic");

Customer customer345 = new Customer("Stella", "Chandler", "stella.chandler@flyerbuzzer.com", "FlyerBuzzer");

Customer customer346 = new Customer("Cecelia", "Nixon", "cecelia.nixon@shop42.com", "Shop42");

Customer customer347 = new Customer("Rey", "Decker", "rey.decker@sportastic.com", "Sportastic");

Customer customer348 = new Customer("Emilia", "Trevino", "emilia.trevino@shop42.com", "Shop42");

Customer customer349 = new Customer("Paisley", "Moyer", "paisley.moyer@sportastic.com", "Sportastic");

Customer customer350 = new Customer("Joselyn", "Schneider", "joselyn.schneider@shop42.com", "Shop42");

Customer customer351 = new Customer("Anthony", "Barnett", "anthony.barnett@plantsgetgreener.com", "PlantsGetGreener");

Customer customer352 = new Customer("Aditya", "Huff", "aditya.huff@flyerbuzzer.com", "FlyerBuzzer");

Customer customer353 = new Customer("Jordyn", "Le", "jordyn.le@flyerbuzzer.com", "FlyerBuzzer");

Customer customer354 = new Customer("Aaron", "Hopkins", "aaron.hopkins@plantsgetgreener.com", "PlantsGetGreener");

Customer customer355 = new Customer("Catalina", "Knox", "catalina.knox@carhouse.com", "CarHouse");

Customer customer356 = new Customer("Jadyn", "Bernard", "jadyn.bernard@flyerbuzzer.com", "FlyerBuzzer");

Customer customer357 = new Customer("Kimora", "Pearson", "kimora.pearson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer358 = new Customer("Nancy", "Hutchinson", "nancy.hutchinson@sportastic.com", "Sportastic");

Customer customer359 = new Customer("Delilah", "Hale", "delilah.hale@carhouse.com", "CarHouse");

Customer customer360 = new Customer("Alisson", "Chaney", "alisson.chaney@flyerbuzzer.com", "FlyerBuzzer");

Customer customer361 = new Customer("Quinn", "Tyler", "quinn.tyler@shop42.com", "Shop42");

Customer customer362 = new Customer("Jeremy", "Grant", "jeremy.grant@flyerbuzzer.com", "FlyerBuzzer");

Customer customer363 = new Customer("Joy", "Rollins", "joy.rollins@sportastic.com", "Sportastic");

Customer customer364 = new Customer("Brogan", "Obrien", "brogan.obrien@sportastic.com", "Sportastic");

Customer customer365 = new Customer("Emmalee", "Rangel", "emmalee.rangel@plantsgetgreener.com", "PlantsGetGreener");

Customer customer366 = new Customer("Drake", "Santana", "drake.santana@carhouse.com", "CarHouse");

Customer customer367 = new Customer("Angelica", "Church", "angelica.church@carhouse.com", "CarHouse");

Customer customer368 = new Customer("Stephanie", "Mckay", "stephanie.mckay@plantsgetgreener.com", "PlantsGetGreener");

Customer customer369 = new Customer("Hailey", "Calhoun", "hailey.calhoun@shop42.com", "Shop42");

Customer customer370 = new Customer("Chris", "Boyd", "chris.boyd@flyerbuzzer.com", "FlyerBuzzer");

Customer customer371 = new Customer("America", "Fitzpatrick", "america.fitzpatrick@plantsgetgreener.com", "PlantsGetGreener");

Customer customer372 = new Customer("Madalyn", "Gonzalez", "madalyn.gonzalez@carhouse.com", "CarHouse");

Customer customer373 = new Customer("Sylvia", "Beltran", "sylvia.beltran@flyerbuzzer.com", "FlyerBuzzer");

Customer customer374 = new Customer("Jaden", "Pittman", "jaden.pittman@sportastic.com", "Sportastic");

Customer customer375 = new Customer("Arielle", "Andrade", "arielle.andrade@flyerbuzzer.com", "FlyerBuzzer");

Customer customer376 = new Customer("Kamila", "Beasley", "kamila.beasley@plantsgetgreener.com", "PlantsGetGreener");

Customer customer377 = new Customer("Lennon", "Fernandez", "lennon.fernandez@flyerbuzzer.com", "FlyerBuzzer");

Customer customer378 = new Customer("June", "Mullen", "june.mullen@sportastic.com", "Sportastic");

Customer customer379 = new Customer("Aileen", "Thornton", "aileen.thornton@flyerbuzzer.com", "FlyerBuzzer");

Customer customer380 = new Customer("Alonso", "Walls", "alonso.walls@carhouse.com", "CarHouse");

Customer customer381 = new Customer("Araceli", "Lester", "araceli.lester@shop42.com", "Shop42");

Customer customer382 = new Customer("Tristin", "Archer", "tristin.archer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer383 = new Customer("Aedan", "Rose", "aedan.rose@sportastic.com", "Sportastic");

Customer customer384 = new Customer("Kamron", "Anderson", "kamron.anderson@plantsgetgreener.com", "PlantsGetGreener");

Customer customer385 = new Customer("Alia", "Howell", "alia.howell@shop42.com", "Shop42");

Customer customer386 = new Customer("Andy", "Stewart", "andy.stewart@shop42.com", "Shop42");

Customer customer387 = new Customer("Karma", "Shepard", "karma.shepard@sportastic.com", "Sportastic");

Customer customer388 = new Customer("Reed", "Mcdowell", "reed.mcdowell@shop42.com", "Shop42");

Customer customer389 = new Customer("Marvin", "Franco", "marvin.franco@carhouse.com", "CarHouse");

Customer customer390 = new Customer("Zoey", "Hansen", "zoey.hansen@flyerbuzzer.com", "FlyerBuzzer");

Customer customer391 = new Customer("Hugo", "Hicks", "hugo.hicks@shop42.com", "Shop42");

Customer customer392 = new Customer("Tiana", "Berger", "tiana.berger@flyerbuzzer.com", "FlyerBuzzer");

Customer customer393 = new Customer("Makenzie", "Cruz", "makenzie.cruz@shop42.com", "Shop42");

Customer customer394 = new Customer("Santos", "Guzman", "santos.guzman@sportastic.com", "Sportastic");

Customer customer395 = new Customer("Anabel", "Frazier", "anabel.frazier@carhouse.com", "CarHouse");

Customer customer396 = new Customer("Oswaldo", "Campos", "oswaldo.campos@shop42.com", "Shop42");

Customer customer397 = new Customer("Harley", "Woods", "harley.woods@carhouse.com", "CarHouse");

Customer customer398 = new Customer("Konner", "Greer", "konner.greer@flyerbuzzer.com", "FlyerBuzzer");

Customer customer399 = new Customer("Yair", "Flowers", "yair.flowers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer400 = new Customer("Mira", "Washington", "mira.washington@flyerbuzzer.com", "FlyerBuzzer");

Customer customer401 = new Customer("Deegan", "Simpson", "deegan.simpson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer402 = new Customer("Kamari", "Huang", "kamari.huang@carhouse.com", "CarHouse");

Customer customer403 = new Customer("Shawn", "Bird", "shawn.bird@flyerbuzzer.com", "FlyerBuzzer");

Customer customer404 = new Customer("Israel", "Meyers", "israel.meyers@flyerbuzzer.com", "FlyerBuzzer");

Customer customer405 = new Customer("Dexter", "Wise", "dexter.wise@carhouse.com", "CarHouse");

Customer customer406 = new Customer("Jaylynn", "Oconnor", "jaylynn.oconnor@carhouse.com", "CarHouse");

Customer customer407 = new Customer("Jaxon", "Yoder", "jaxon.yoder@plantsgetgreener.com", "PlantsGetGreener");

Customer customer408 = new Customer("Lexie", "Ramos", "lexie.ramos@plantsgetgreener.com", "PlantsGetGreener");

Customer customer409 = new Customer("Erick", "Williams", "erick.williams@sportastic.com", "Sportastic");

Customer customer410 = new Customer("Casey", "English", "casey.english@shop42.com", "Shop42");

Customer customer411 = new Customer("Skyla", "Powell", "skyla.powell@plantsgetgreener.com", "PlantsGetGreener");

Customer customer412 = new Customer("Gabrielle", "Dodson", "gabrielle.dodson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer413 = new Customer("Evie", "Liu", "evie.liu@plantsgetgreener.com", "PlantsGetGreener");

Customer customer414 = new Customer("Beau", "Chang", "beau.chang@carhouse.com", "CarHouse");

Customer customer415 = new Customer("Diego", "Barr", "diego.barr@flyerbuzzer.com", "FlyerBuzzer");

Customer customer416 = new Customer("Ashleigh", "Wagner", "ashleigh.wagner@sportastic.com", "Sportastic");

Customer customer417 = new Customer("Hannah", "Boone", "hannah.boone@sportastic.com", "Sportastic");

Customer customer418 = new Customer("Marianna", "Jacobson", "marianna.jacobson@flyerbuzzer.com", "FlyerBuzzer");

Customer customer419 = new Customer("Giana", "Pugh", "giana.pugh@sportastic.com", "Sportastic");

Customer customer420 = new Customer("Emelia", "Welch", "emelia.welch@carhouse.com", "CarHouse");

Customer customer421 = new Customer("Bennett", "Powers", "bennett.powers@carhouse.com", "CarHouse");

Customer customer422 = new Customer("Kierra", "Lee", "kierra.lee@plantsgetgreener.com", "PlantsGetGreener");

Customer customer423 = new Customer("Abbigail", "Delgado", "abbigail.delgado@flyerbuzzer.com", "FlyerBuzzer");

Customer customer424 = new Customer("Clark", "Cantrell", "clark.cantrell@flyerbuzzer.com", "FlyerBuzzer");

Customer customer425 = new Customer("Carolyn", "Rosario", "carolyn.rosario@plantsgetgreener.com", "PlantsGetGreener");

Customer customer426 = new Customer("Charles", "Garza", "charles.garza@flyerbuzzer.com", "FlyerBuzzer");

Customer customer427 = new Customer("Ricky", "Stuart", "ricky.stuart@plantsgetgreener.com", "PlantsGetGreener");

Customer customer428 = new Customer("Trey", "Mclean", "trey.mclean@carhouse.com", "CarHouse");

Customer customer429 = new Customer("Triston", "Cochran", "triston.cochran@shop42.com", "Shop42");

Customer customer430 = new Customer("Arabella", "Proctor", "arabella.proctor@shop42.com", "Shop42");

Customer customer431 = new Customer("Karson", "Melendez", "karson.melendez@flyerbuzzer.com", "FlyerBuzzer");

Customer customer432 = new Customer("Adelyn", "Rubio", "adelyn.rubio@plantsgetgreener.com", "PlantsGetGreener");

Customer customer433 = new Customer("Urijah", "Rogers", "urijah.rogers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer434 = new Customer("Sean", "Manning", "sean.manning@flyerbuzzer.com", "FlyerBuzzer");

Customer customer435 = new Customer("Danny", "Sullivan", "danny.sullivan@sportastic.com", "Sportastic");

Customer customer436 = new Customer("Sullivan", "Owen", "sullivan.owen@plantsgetgreener.com", "PlantsGetGreener");

Customer customer437 = new Customer("Maximilian", "Monroe", "maximilian.monroe@carhouse.com", "CarHouse");

Customer customer438 = new Customer("Delaney", "Cooper", "delaney.cooper@plantsgetgreener.com", "PlantsGetGreener");

Customer customer439 = new Customer("Elena", "Boyer", "elena.boyer@carhouse.com", "CarHouse");

Customer customer440 = new Customer("Maddox", "Davis", "maddox.davis@carhouse.com", "CarHouse");

Customer customer441 = new Customer("Bobby", "Reed", "bobby.reed@shop42.com", "Shop42");

Customer customer442 = new Customer("Matilda", "Kramer", "matilda.kramer@plantsgetgreener.com", "PlantsGetGreener");

Customer customer443 = new Customer("Landen", "Aguirre", "landen.aguirre@carhouse.com", "CarHouse");

Customer customer444 = new Customer("Sanai", "Elliott", "sanai.elliott@flyerbuzzer.com", "FlyerBuzzer");

Customer customer445 = new Customer("Braiden", "Bauer", "braiden.bauer@carhouse.com", "CarHouse");

Customer customer446 = new Customer("Vivian", "Sampson", "vivian.sampson@sportastic.com", "Sportastic");

Customer customer447 = new Customer("Sienna", "Dunn", "sienna.dunn@flyerbuzzer.com", "FlyerBuzzer");

Customer customer448 = new Customer("Justus", "Kaiser", "justus.kaiser@plantsgetgreener.com", "PlantsGetGreener");

Customer customer449 = new Customer("Jovanni", "Mayo", "jovanni.mayo@flyerbuzzer.com", "FlyerBuzzer");

Customer customer450 = new Customer("Maggie", "Price", "maggie.price@flyerbuzzer.com", "FlyerBuzzer");

Customer customer451 = new Customer("Trevon", "Terry", "trevon.terry@flyerbuzzer.com", "FlyerBuzzer");

Customer customer452 = new Customer("Brennen", "Hurst", "brennen.hurst@carhouse.com", "CarHouse");

Customer customer453 = new Customer("Yoselin", "Chambers", "yoselin.chambers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer454 = new Customer("Jayleen", "Brock", "jayleen.brock@flyerbuzzer.com", "FlyerBuzzer");

Customer customer455 = new Customer("Kyan", "Holloway", "kyan.holloway@sportastic.com", "Sportastic");

Customer customer456 = new Customer("Jakobe", "Salas", "jakobe.salas@flyerbuzzer.com", "FlyerBuzzer");

Customer customer457 = new Customer("Maurice", "Chase", "maurice.chase@plantsgetgreener.com", "PlantsGetGreener");

Customer customer458 = new Customer("Zain", "Patrick", "zain.patrick@flyerbuzzer.com", "FlyerBuzzer");

Customer customer459 = new Customer("Darren", "Santiago", "darren.santiago@carhouse.com", "CarHouse");

Customer customer460 = new Customer("Kai", "Carney", "kai.carney@plantsgetgreener.com", "PlantsGetGreener");

Customer customer461 = new Customer("Makhi", "Schmitt", "makhi.schmitt@plantsgetgreener.com", "PlantsGetGreener");

Customer customer462 = new Customer("Bria", "Ayala", "bria.ayala@flyerbuzzer.com", "FlyerBuzzer");

Customer customer463 = new Customer("Veronica", "Wolf", "veronica.wolf@plantsgetgreener.com", "PlantsGetGreener");

Customer customer464 = new Customer("Asher", "Camacho", "asher.camacho@plantsgetgreener.com", "PlantsGetGreener");

Customer customer465 = new Customer("Madeline", "Molina", "madeline.molina@plantsgetgreener.com", "PlantsGetGreener");

Customer customer466 = new Customer("Nyla", "Hull", "nyla.hull@flyerbuzzer.com", "FlyerBuzzer");

Customer customer467 = new Customer("Jonathon", "Escobar", "jonathon.escobar@carhouse.com", "CarHouse");

Customer customer468 = new Customer("Yahir", "Roach", "yahir.roach@sportastic.com", "Sportastic");

Customer customer469 = new Customer("Finn", "Ross", "finn.ross@flyerbuzzer.com", "FlyerBuzzer");

Customer customer470 = new Customer("Corey", "Marsh", "corey.marsh@plantsgetgreener.com", "PlantsGetGreener");

Customer customer471 = new Customer("Jadyn", "Fox", "jadyn.fox@plantsgetgreener.com", "PlantsGetGreener");

Customer customer472 = new Customer("Billy", "Benson", "billy.benson@carhouse.com", "CarHouse");

Customer customer473 = new Customer("Mario", "Green", "mario.green@plantsgetgreener.com", "PlantsGetGreener");

Customer customer474 = new Customer("Skyler", "Potter", "skyler.potter@shop42.com", "Shop42");

Customer customer475 = new Customer("Todd", "Dudley", "todd.dudley@flyerbuzzer.com", "FlyerBuzzer");

Customer customer476 = new Customer("Adrianna", "Parker", "adrianna.parker@carhouse.com", "CarHouse");

Customer customer477 = new Customer("Brandon", "Acevedo", "brandon.acevedo@shop42.com", "Shop42");

Customer customer478 = new Customer("Killian", "Shea", "killian.shea@shop42.com", "Shop42");

Customer customer479 = new Customer("Katelyn", "Skinner", "katelyn.skinner@flyerbuzzer.com", "FlyerBuzzer");

Customer customer480 = new Customer("Leland", "Ayers", "leland.ayers@plantsgetgreener.com", "PlantsGetGreener");

Customer customer481 = new Customer("Jordin", "Garner", "jordin.garner@flyerbuzzer.com", "FlyerBuzzer");

Customer customer482 = new Customer("Rocco", "Franklin", "rocco.franklin@sportastic.com", "Sportastic");

Customer customer483 = new Customer("Jacey", "Haney", "jacey.haney@flyerbuzzer.com", "FlyerBuzzer");

Customer customer484 = new Customer("Zaire", "Keith", "zaire.keith@plantsgetgreener.com", "PlantsGetGreener");

Customer customer485 = new Customer("Annabella", "Hoover", "annabella.hoover@flyerbuzzer.com", "FlyerBuzzer");

Customer customer486 = new Customer("German", "Short", "german.short@flyerbuzzer.com", "FlyerBuzzer");

Customer customer487 = new Customer("Denise", "Odom", "denise.odom@sportastic.com", "Sportastic");

Customer customer488 = new Customer("Dayami", "Wall", "dayami.wall@carhouse.com", "CarHouse");

Customer customer489 = new Customer("Fletcher", "Ali", "fletcher.ali@flyerbuzzer.com", "FlyerBuzzer");

Customer customer490 = new Customer("Savion", "Zamora", "savion.zamora@carhouse.com", "CarHouse");

Customer customer491 = new Customer("Aspen", "Munoz", "aspen.munoz@plantsgetgreener.com", "PlantsGetGreener");

Customer customer492 = new Customer("Tristian", "Bowers", "tristian.bowers@flyerbuzzer.com", "FlyerBuzzer");

Customer customer493 = new Customer("Brian", "Sanchez", "brian.sanchez@shop42.com", "Shop42");

Customer customer494 = new Customer("Barrett", "Mack", "barrett.mack@flyerbuzzer.com", "FlyerBuzzer");

Customer customer495 = new Customer("Seamus", "Hogan", "seamus.hogan@plantsgetgreener.com", "PlantsGetGreener");

Customer customer496 = new Customer("Katie", "Jimenez", "katie.jimenez@shop42.com", "Shop42");

Customer customer497 = new Customer("Elijah", "Flores", "elijah.flores@plantsgetgreener.com", "PlantsGetGreener");

Customer customer498 = new Customer("Dashawn", "Mueller", "dashawn.mueller@flyerbuzzer.com", "FlyerBuzzer");

Customer customer499 = new Customer("Lorelei", "Shaw", "lorelei.shaw@plantsgetgreener.com", "PlantsGetGreener");

customer = customer499;

Ticket ticket0 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", "PROCESSED", employee140, customer491,3);

date = 1483494545000l;

DataGenerator.setValueToField(ticket0, "creationDate", new Date(date));

ticketManager.add(ticket0);

Ticket ticket1 = new Ticket("Lets all be unique together until we realise we are all the same.", "SOLVED", employee99, customer322,6);

date = 1483352553000l;

DataGenerator.setValueToField(ticket1, "creationDate", new Date(date));

ticketManager.add(ticket1);

Ticket ticket2 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", "RECORDED", employee165, customer452,3);

date = 1483485282000l;

DataGenerator.setValueToField(ticket2, "creationDate", new Date(date));

ticketManager.add(ticket2);

Ticket ticket3 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "RECORDED", employee156, customer329,1);

date = 1483236433000l;

DataGenerator.setValueToField(ticket3, "creationDate", new Date(date));

ticketManager.add(ticket3);

Ticket ticket4 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", "RECORDED", employee173, customer298,9);

date = 1483400689000l;

DataGenerator.setValueToField(ticket4, "creationDate", new Date(date));

ticketManager.add(ticket4);

Ticket ticket5 = new Ticket("This is a Japanese doll.", "WAITING_FOR_FEEDBACK", employee122, customer356,8);

date = 1483090041000l;

DataGenerator.setValueToField(ticket5, "creationDate", new Date(date));

ticketManager.add(ticket5);

Ticket ticket6 = new Ticket("The shooter says goodbye to his love.", "WAITING_FOR_FEEDBACK", employee4, customer352,9);

date = 1483597212000l;

DataGenerator.setValueToField(ticket6, "creationDate", new Date(date));

ticketManager.add(ticket6);

Ticket ticket7 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", "RECORDED", employee112, customer468,4);

date = 1483477466000l;

DataGenerator.setValueToField(ticket7, "creationDate", new Date(date));

ticketManager.add(ticket7);

Ticket ticket8 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "CLOSED", employee229, customer319,1);

date = 1483496375000l;

DataGenerator.setValueToField(ticket8, "creationDate", new Date(date));

ticketManager.add(ticket8);

Ticket ticket9 = new Ticket("Let me help you with your baggage.", "SOLVED", employee160, customer493,10);

date = 1483359108000l;

DataGenerator.setValueToField(ticket9, "creationDate", new Date(date));

ticketManager.add(ticket9);

Ticket ticket10 = new Ticket("She always speaks to him in a loud voice.", "SOLVED", employee27, customer269,3);

date = 1483026548000l;

DataGenerator.setValueToField(ticket10, "creationDate", new Date(date));

ticketManager.add(ticket10);

Ticket ticket11 = new Ticket("She wrote him a long letter, but he didn't read it.", "CLOSED", employee223, customer327,2);

date = 1483270607000l;

DataGenerator.setValueToField(ticket11, "creationDate", new Date(date));

ticketManager.add(ticket11);

Ticket ticket12 = new Ticket("There was no ice cream in the freezer, nor did they have money to go to the store.", "SOLVED", employee157, customer281,2);

date = 1483258646000l;

DataGenerator.setValueToField(ticket12, "creationDate", new Date(date));

ticketManager.add(ticket12);

Ticket ticket13 = new Ticket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", "SOLVED", employee223, customer276,3);

date = 1483569995000l;

DataGenerator.setValueToField(ticket13, "creationDate", new Date(date));

ticketManager.add(ticket13);

Ticket ticket14 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", "WAITING_FOR_FEEDBACK", employee83, customer333,1);

date = 1483499250000l;

DataGenerator.setValueToField(ticket14, "creationDate", new Date(date));

ticketManager.add(ticket14);

Ticket ticket15 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", "WAITING_FOR_FEEDBACK", employee53, customer497,6);

date = 1483279270000l;

DataGenerator.setValueToField(ticket15, "creationDate", new Date(date));

ticketManager.add(ticket15);

Ticket ticket16 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", "CLOSED", employee20, customer497,9);

date = 1483403194000l;

DataGenerator.setValueToField(ticket16, "creationDate", new Date(date));

ticketManager.add(ticket16);

Ticket ticket17 = new Ticket("Rock music approaches at high velocity.", "SOLVED", employee243, customer297,10);

date = 1483123114000l;

DataGenerator.setValueToField(ticket17, "creationDate", new Date(date));

ticketManager.add(ticket17);

Ticket ticket18 = new Ticket("He said he was not there yesterday. however, many people saw him there.", "WAITING_FOR_FEEDBACK", employee153, customer253,5);

date = 1483290541000l;

DataGenerator.setValueToField(ticket18, "creationDate", new Date(date));

ticketManager.add(ticket18);

Ticket ticket19 = new Ticket("The river stole the gods.", "CLOSED", employee186, customer282,3);

date = 1483350763000l;

DataGenerator.setValueToField(ticket19, "creationDate", new Date(date));

ticketManager.add(ticket19);

Ticket ticket20 = new Ticket("I'd rather be a bird than a fish.", "SOLVED", employee236, customer430,1);

date = 1483454159000l;

DataGenerator.setValueToField(ticket20, "creationDate", new Date(date));

ticketManager.add(ticket20);

Ticket ticket21 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "WAITING_FOR_FEEDBACK", employee83, customer262,0);

date = 1483411488000l;

DataGenerator.setValueToField(ticket21, "creationDate", new Date(date));

ticketManager.add(ticket21);

Ticket ticket22 = new Ticket("Joe made the sugar cookies. Susan decorated them.", "CLOSED", employee16, customer462,1);

date = 1483456406000l;

DataGenerator.setValueToField(ticket22, "creationDate", new Date(date));

ticketManager.add(ticket22);

Ticket ticket23 = new Ticket("This is a Japanese doll.", "RECORDED", employee197, customer428,3);

date = 1483068916000l;

DataGenerator.setValueToField(ticket23, "creationDate", new Date(date));

ticketManager.add(ticket23);

Ticket ticket24 = new Ticket("I am never at home on Sundays.", "RECORDED", employee202, customer305,7);

date = 1483487854000l;

DataGenerator.setValueToField(ticket24, "creationDate", new Date(date));

ticketManager.add(ticket24);

Ticket ticket25 = new Ticket("The book is in front of the table.", "PROCESSED", employee5, customer286,5);

date = 1483106465000l;

DataGenerator.setValueToField(ticket25, "creationDate", new Date(date));

ticketManager.add(ticket25);

Ticket ticket26 = new Ticket("I checked to make sure that he was still alive.", "WAITING_FOR_FEEDBACK", employee33, customer471,6);

date = 1483416423000l;

DataGenerator.setValueToField(ticket26, "creationDate", new Date(date));

ticketManager.add(ticket26);

Ticket ticket27 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "PROCESSED", employee13, customer427,8);

date = 1483515140000l;

DataGenerator.setValueToField(ticket27, "creationDate", new Date(date));

ticketManager.add(ticket27);

Ticket ticket28 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", "CLOSED", employee103, customer389,9);

date = 1483302717000l;

DataGenerator.setValueToField(ticket28, "creationDate", new Date(date));

ticketManager.add(ticket28);

Ticket ticket29 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", "RECORDED", employee130, customer437,5);

date = 1483413158000l;

DataGenerator.setValueToField(ticket29, "creationDate", new Date(date));

ticketManager.add(ticket29);

Ticket ticket30 = new Ticket("Is it free?", "WAITING_FOR_FEEDBACK", employee120, customer332,4);

date = 1483325417000l;

DataGenerator.setValueToField(ticket30, "creationDate", new Date(date));

ticketManager.add(ticket30);

Ticket ticket31 = new Ticket("Is it free?", "RECORDED", employee167, customer408,9);

date = 1483465053000l;

DataGenerator.setValueToField(ticket31, "creationDate", new Date(date));

ticketManager.add(ticket31);

Ticket ticket32 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", "RECORDED", employee72, customer466,8);

date = 1483296694000l;

DataGenerator.setValueToField(ticket32, "creationDate", new Date(date));

ticketManager.add(ticket32);

Ticket ticket33 = new Ticket("He told us a very exciting adventure story.", "WAITING_FOR_FEEDBACK", employee29, customer356,2);

date = 1483526622000l;

DataGenerator.setValueToField(ticket33, "creationDate", new Date(date));

ticketManager.add(ticket33);

Ticket ticket34 = new Ticket("Is it free?", "CLOSED", employee212, customer275,9);

date = 1483244429000l;

DataGenerator.setValueToField(ticket34, "creationDate", new Date(date));

ticketManager.add(ticket34);

Ticket ticket35 = new Ticket("I am never at home on Sundays.", "PROCESSED", employee216, customer412,1);

date = 1483201266000l;

DataGenerator.setValueToField(ticket35, "creationDate", new Date(date));

ticketManager.add(ticket35);

Ticket ticket36 = new Ticket("Is it free?", "CLOSED", employee29, customer360,0);

date = 1483482568000l;

DataGenerator.setValueToField(ticket36, "creationDate", new Date(date));

ticketManager.add(ticket36);

Ticket ticket37 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", "WAITING_FOR_FEEDBACK", employee44, customer480,1);

date = 1483435128000l;

DataGenerator.setValueToField(ticket37, "creationDate", new Date(date));

ticketManager.add(ticket37);

Ticket ticket38 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", "SOLVED", employee150, customer493,1);

date = 1483356289000l;

DataGenerator.setValueToField(ticket38, "creationDate", new Date(date));

ticketManager.add(ticket38);

Ticket ticket39 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", "PROCESSED", employee105, customer273,3);

date = 1483032562000l;

DataGenerator.setValueToField(ticket39, "creationDate", new Date(date));

ticketManager.add(ticket39);

Ticket ticket40 = new Ticket("The stranger officiates the meal.", "CLOSED", employee176, customer443,2);

date = 1483389899000l;

DataGenerator.setValueToField(ticket40, "creationDate", new Date(date));

ticketManager.add(ticket40);

Ticket ticket41 = new Ticket("We need to rent a room for our party.", "PROCESSED", employee188, customer422,8);

date = 1483286180000l;

DataGenerator.setValueToField(ticket41, "creationDate", new Date(date));

ticketManager.add(ticket41);

Ticket ticket42 = new Ticket("He told us a very exciting adventure story.", "WAITING_FOR_FEEDBACK", employee98, customer289,4);

date = 1483144091000l;

DataGenerator.setValueToField(ticket42, "creationDate", new Date(date));

ticketManager.add(ticket42);

Ticket ticket43 = new Ticket("He ran out of money, so he had to stop playing poker.", "CLOSED", employee39, customer416,0);

date = 1483604239000l;

DataGenerator.setValueToField(ticket43, "creationDate", new Date(date));

ticketManager.add(ticket43);

Ticket ticket44 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", "WAITING_FOR_FEEDBACK", employee111, customer363,7);

date = 1483043197000l;

DataGenerator.setValueToField(ticket44, "creationDate", new Date(date));

ticketManager.add(ticket44);

Ticket ticket45 = new Ticket("The lake is a long way from here.", "CLOSED", employee97, customer284,1);

date = 1483321440000l;

DataGenerator.setValueToField(ticket45, "creationDate", new Date(date));

ticketManager.add(ticket45);

Ticket ticket46 = new Ticket("Check back tomorrow. I will see if the book has arrived.", "SOLVED", employee56, customer335,8);

date = 1483154540000l;

DataGenerator.setValueToField(ticket46, "creationDate", new Date(date));

ticketManager.add(ticket46);

Ticket ticket47 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", "CLOSED", employee167, customer327,8);

date = 1483079813000l;

DataGenerator.setValueToField(ticket47, "creationDate", new Date(date));

ticketManager.add(ticket47);

Ticket ticket48 = new Ticket("Lets all be unique together until we realise we are all the same.", "WAITING_FOR_FEEDBACK", employee142, customer392,3);

date = 1483024032000l;

DataGenerator.setValueToField(ticket48, "creationDate", new Date(date));

ticketManager.add(ticket48);

Ticket ticket49 = new Ticket("I am never at home on Sundays.", "WAITING_FOR_FEEDBACK", employee236, customer353,2);

date = 1483226383000l;

DataGenerator.setValueToField(ticket49, "creationDate", new Date(date));

ticketManager.add(ticket49);

Ticket ticket50 = new Ticket("Abstraction is often one floor above you.", "RECORDED", employee241, customer473,10);

date = 1483300232000l;

DataGenerator.setValueToField(ticket50, "creationDate", new Date(date));

ticketManager.add(ticket50);

Ticket ticket51 = new Ticket("Where do random thoughts come from?", "WAITING_FOR_FEEDBACK", employee202, customer334,7);

date = 1483274163000l;

DataGenerator.setValueToField(ticket51, "creationDate", new Date(date));

ticketManager.add(ticket51);

Ticket ticket52 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", "WAITING_FOR_FEEDBACK", employee188, customer342,3);

date = 1483148553000l;

DataGenerator.setValueToField(ticket52, "creationDate", new Date(date));

ticketManager.add(ticket52);

Ticket ticket53 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "WAITING_FOR_FEEDBACK", employee206, customer369,10);

date = 1483340260000l;

DataGenerator.setValueToField(ticket53, "creationDate", new Date(date));

ticketManager.add(ticket53);

Ticket ticket54 = new Ticket("If I don’t like something, I’ll stay away from it.", "WAITING_FOR_FEEDBACK", employee56, customer270,9);

date = 1483476237000l;

DataGenerator.setValueToField(ticket54, "creationDate", new Date(date));

ticketManager.add(ticket54);

Ticket ticket55 = new Ticket("The memory we used to share is no longer coherent.", "WAITING_FOR_FEEDBACK", employee48, customer436,6);

date = 1483113233000l;

DataGenerator.setValueToField(ticket55, "creationDate", new Date(date));

ticketManager.add(ticket55);

Ticket ticket56 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", "CLOSED", employee87, customer484,8);

date = 1483166660000l;

DataGenerator.setValueToField(ticket56, "creationDate", new Date(date));

ticketManager.add(ticket56);

Ticket ticket57 = new Ticket("Should we start class now, or should we wait for everyone to get here?", "CLOSED", employee140, customer387,4);

date = 1483291469000l;

DataGenerator.setValueToField(ticket57, "creationDate", new Date(date));

ticketManager.add(ticket57);

Ticket ticket58 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", "RECORDED", employee165, customer359,2);

date = 1483301627000l;

DataGenerator.setValueToField(ticket58, "creationDate", new Date(date));

ticketManager.add(ticket58);

Ticket ticket59 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "SOLVED", employee64, customer319,3);

date = 1483575500000l;

DataGenerator.setValueToField(ticket59, "creationDate", new Date(date));

ticketManager.add(ticket59);

Ticket ticket60 = new Ticket("Please wait outside of the house.", "WAITING_FOR_FEEDBACK", employee131, customer394,6);

date = 1483069691000l;

DataGenerator.setValueToField(ticket60, "creationDate", new Date(date));

ticketManager.add(ticket60);

Ticket ticket61 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", "WAITING_FOR_FEEDBACK", employee173, customer297,2);

date = 1483357886000l;

DataGenerator.setValueToField(ticket61, "creationDate", new Date(date));

ticketManager.add(ticket61);

Ticket ticket62 = new Ticket("The river stole the gods.", "RECORDED", employee193, customer472,2);

date = 1483117784000l;

DataGenerator.setValueToField(ticket62, "creationDate", new Date(date));

ticketManager.add(ticket62);

Ticket ticket63 = new Ticket("Lets all be unique together until we realise we are all the same.", "CLOSED", employee122, customer258,5);

date = 1483284667000l;

DataGenerator.setValueToField(ticket63, "creationDate", new Date(date));

ticketManager.add(ticket63);

Ticket ticket64 = new Ticket("She always speaks to him in a loud voice.", "SOLVED", employee9, customer332,9);

date = 1483157934000l;

DataGenerator.setValueToField(ticket64, "creationDate", new Date(date));

ticketManager.add(ticket64);

Ticket ticket65 = new Ticket("Mary plays the piano.", "RECORDED", employee0, customer422,3);

date = 1483578351000l;

DataGenerator.setValueToField(ticket65, "creationDate", new Date(date));

ticketManager.add(ticket65);

Ticket ticket66 = new Ticket("He ran out of money, so he had to stop playing poker.", "SOLVED", employee220, customer322,10);

date = 1483252510000l;

DataGenerator.setValueToField(ticket66, "creationDate", new Date(date));

ticketManager.add(ticket66);

Ticket ticket67 = new Ticket("Cats are good pets, for they are clean and are not noisy.", "RECORDED", employee141, customer452,3);

date = 1483581669000l;

DataGenerator.setValueToField(ticket67, "creationDate", new Date(date));

ticketManager.add(ticket67);

Ticket ticket68 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "WAITING_FOR_FEEDBACK", employee238, customer394,9);

date = 1483262252000l;

DataGenerator.setValueToField(ticket68, "creationDate", new Date(date));

ticketManager.add(ticket68);

Ticket ticket69 = new Ticket("The shooter says goodbye to his love.", "CLOSED", employee109, customer297,6);

date = 1483248646000l;

DataGenerator.setValueToField(ticket69, "creationDate", new Date(date));

ticketManager.add(ticket69);

Ticket ticket70 = new Ticket("We have never been to Asia, nor have we visited Africa.", "CLOSED", employee104, customer365,3);

date = 1483204339000l;

DataGenerator.setValueToField(ticket70, "creationDate", new Date(date));

ticketManager.add(ticket70);

Ticket ticket71 = new Ticket("They got there early, and they got really good seats.", "PROCESSED", employee220, customer356,2);

date = 1483375548000l;

DataGenerator.setValueToField(ticket71, "creationDate", new Date(date));

ticketManager.add(ticket71);

Ticket ticket72 = new Ticket("Christmas is coming.", "RECORDED", employee61, customer407,6);

date = 1483414422000l;

DataGenerator.setValueToField(ticket72, "creationDate", new Date(date));

ticketManager.add(ticket72);

Ticket ticket73 = new Ticket("We have never been to Asia, nor have we visited Africa.", "PROCESSED", employee227, customer315,9);

date = 1483366937000l;

DataGenerator.setValueToField(ticket73, "creationDate", new Date(date));

ticketManager.add(ticket73);

Ticket ticket74 = new Ticket("A glittering gem is not enough.", "RECORDED", employee236, customer252,5);

date = 1483399128000l;

DataGenerator.setValueToField(ticket74, "creationDate", new Date(date));

ticketManager.add(ticket74);

Ticket ticket75 = new Ticket("Everyone was busy, so I went to the movie alone.", "PROCESSED", employee1, customer260,3);

date = 1483537395000l;

DataGenerator.setValueToField(ticket75, "creationDate", new Date(date));

ticketManager.add(ticket75);

Ticket ticket76 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", "PROCESSED", employee58, customer305,3);

date = 1483421572000l;

DataGenerator.setValueToField(ticket76, "creationDate", new Date(date));

ticketManager.add(ticket76);

Ticket ticket77 = new Ticket("He ran out of money, so he had to stop playing poker.", "RECORDED", employee14, customer344,6);

date = 1483192850000l;

DataGenerator.setValueToField(ticket77, "creationDate", new Date(date));

ticketManager.add(ticket77);

Ticket ticket78 = new Ticket("He said he was not there yesterday. however, many people saw him there.", "WAITING_FOR_FEEDBACK", employee106, customer402,4);

date = 1483044965000l;

DataGenerator.setValueToField(ticket78, "creationDate", new Date(date));

ticketManager.add(ticket78);

Ticket ticket79 = new Ticket("She was too short to see over the fence.", "CLOSED", employee57, customer305,10);

date = 1483252275000l;

DataGenerator.setValueToField(ticket79, "creationDate", new Date(date));

ticketManager.add(ticket79);

Ticket ticket80 = new Ticket("The memory we used to share is no longer coherent.", "SOLVED", employee220, customer449,2);

date = 1483297403000l;

DataGenerator.setValueToField(ticket80, "creationDate", new Date(date));

ticketManager.add(ticket80);

Ticket ticket81 = new Ticket("The waves were crashing on the shore. it was a lovely sight.", "CLOSED", employee120, customer391,4);

date = 1483587804000l;

DataGenerator.setValueToField(ticket81, "creationDate", new Date(date));

ticketManager.add(ticket81);

Ticket ticket82 = new Ticket("If I don’t like something, I’ll stay away from it.", "SOLVED", employee5, customer439,9);

date = 1483588290000l;

DataGenerator.setValueToField(ticket82, "creationDate", new Date(date));

ticketManager.add(ticket82);

Ticket ticket83 = new Ticket("The stranger officiates the meal.", "WAITING_FOR_FEEDBACK", employee99, customer262,7);

date = 1483459973000l;

DataGenerator.setValueToField(ticket83, "creationDate", new Date(date));

ticketManager.add(ticket83);

Ticket ticket84 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", "RECORDED", employee80, customer493,9);

date = 1483035758000l;

DataGenerator.setValueToField(ticket84, "creationDate", new Date(date));

ticketManager.add(ticket84);

Ticket ticket85 = new Ticket("The mysterious diary records the voice.", "CLOSED", employee214, customer425,10);

date = 1483608902000l;

DataGenerator.setValueToField(ticket85, "creationDate", new Date(date));

ticketManager.add(ticket85);

Ticket ticket86 = new Ticket("She did her best to help him.", "WAITING_FOR_FEEDBACK", employee245, customer314,6);

date = 1483582764000l;

DataGenerator.setValueToField(ticket86, "creationDate", new Date(date));

ticketManager.add(ticket86);

Ticket ticket87 = new Ticket("How was the math test?", "WAITING_FOR_FEEDBACK", employee17, customer344,8);

date = 1483330217000l;

DataGenerator.setValueToField(ticket87, "creationDate", new Date(date));

ticketManager.add(ticket87);

Ticket ticket88 = new Ticket("The memory we used to share is no longer coherent.", "SOLVED", employee83, customer379,0);

date = 1483302943000l;

DataGenerator.setValueToField(ticket88, "creationDate", new Date(date));

ticketManager.add(ticket88);

Ticket ticket89 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "CLOSED", employee155, customer348,5);

date = 1483356758000l;

DataGenerator.setValueToField(ticket89, "creationDate", new Date(date));

ticketManager.add(ticket89);

Ticket ticket90 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", "WAITING_FOR_FEEDBACK", employee198, customer357,5);

date = 1483037994000l;

DataGenerator.setValueToField(ticket90, "creationDate", new Date(date));

ticketManager.add(ticket90);

Ticket ticket91 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", "CLOSED", employee60, customer460,9);

date = 1483601252000l;

DataGenerator.setValueToField(ticket91, "creationDate", new Date(date));

ticketManager.add(ticket91);

Ticket ticket92 = new Ticket("This is a Japanese doll.", "SOLVED", employee194, customer350,10);

date = 1483538657000l;

DataGenerator.setValueToField(ticket92, "creationDate", new Date(date));

ticketManager.add(ticket92);

Ticket ticket93 = new Ticket("Let me help you with your baggage.", "CLOSED", employee154, customer383,7);

date = 1483608020000l;

DataGenerator.setValueToField(ticket93, "creationDate", new Date(date));

ticketManager.add(ticket93);

Ticket ticket94 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", "CLOSED", employee171, customer398,6);

date = 1483494468000l;

DataGenerator.setValueToField(ticket94, "creationDate", new Date(date));

ticketManager.add(ticket94);

Ticket ticket95 = new Ticket("Joe made the sugar cookies. Susan decorated them.", "CLOSED", employee239, customer257,2);

date = 1483500113000l;

DataGenerator.setValueToField(ticket95, "creationDate", new Date(date));

ticketManager.add(ticket95);

Ticket ticket96 = new Ticket("If I don’t like something, I’ll stay away from it.", "WAITING_FOR_FEEDBACK", employee167, customer455,3);

date = 1483140689000l;

DataGenerator.setValueToField(ticket96, "creationDate", new Date(date));

ticketManager.add(ticket96);

Ticket ticket97 = new Ticket("They got there early, and they got really good seats.", "RECORDED", employee154, customer359,5);

date = 1483618811000l;

DataGenerator.setValueToField(ticket97, "creationDate", new Date(date));

ticketManager.add(ticket97);

Ticket ticket98 = new Ticket("Let me help you with your baggage.", "RECORDED", employee65, customer266,7);

date = 1483254869000l;

DataGenerator.setValueToField(ticket98, "creationDate", new Date(date));

ticketManager.add(ticket98);

Ticket ticket99 = new Ticket("Cats are good pets, for they are clean and are not noisy.", "PROCESSED", employee28, customer273,8);

date = 1483096055000l;

DataGenerator.setValueToField(ticket99, "creationDate", new Date(date));

ticketManager.add(ticket99);

Ticket ticket100 = new Ticket("I really want to go to work, but I am too sick to drive.", "RECORDED", employee199, customer407,0);

date = 1483496704000l;

DataGenerator.setValueToField(ticket100, "creationDate", new Date(date));

ticketManager.add(ticket100);

Ticket ticket101 = new Ticket("Please wait outside of the house.", "SOLVED", employee199, customer445,9);

date = 1483600613000l;

DataGenerator.setValueToField(ticket101, "creationDate", new Date(date));

ticketManager.add(ticket101);

Ticket ticket102 = new Ticket("She only paints with bold colors. she does not like pastels.", "RECORDED", employee233, customer457,0);

date = 1483619875000l;

DataGenerator.setValueToField(ticket102, "creationDate", new Date(date));

ticketManager.add(ticket102);

Ticket ticket103 = new Ticket("She was too short to see over the fence.", "PROCESSED", employee50, customer298,4);

date = 1483099637000l;

DataGenerator.setValueToField(ticket103, "creationDate", new Date(date));

ticketManager.add(ticket103);

Ticket ticket104 = new Ticket("Everyone was busy, so I went to the movie alone.", "PROCESSED", employee41, customer250,2);

date = 1483426507000l;

DataGenerator.setValueToField(ticket104, "creationDate", new Date(date));

ticketManager.add(ticket104);

Ticket ticket105 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", "PROCESSED", employee38, customer412,9);

date = 1483022981000l;

DataGenerator.setValueToField(ticket105, "creationDate", new Date(date));

ticketManager.add(ticket105);

Ticket ticket106 = new Ticket("She did her best to help him.", "CLOSED", employee67, customer277,3);

date = 1483027137000l;

DataGenerator.setValueToField(ticket106, "creationDate", new Date(date));

ticketManager.add(ticket106);

Ticket ticket107 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "CLOSED", employee243, customer475,2);

date = 1483544464000l;

DataGenerator.setValueToField(ticket107, "creationDate", new Date(date));

ticketManager.add(ticket107);

Ticket ticket108 = new Ticket("Lets all be unique together until we realise we are all the same.", "WAITING_FOR_FEEDBACK", employee95, customer327,10);

date = 1483549796000l;

DataGenerator.setValueToField(ticket108, "creationDate", new Date(date));

ticketManager.add(ticket108);

Ticket ticket109 = new Ticket("I often see the time 11:11 or 12:34 on clocks.", "SOLVED", employee30, customer414,9);

date = 1483346315000l;

DataGenerator.setValueToField(ticket109, "creationDate", new Date(date));

ticketManager.add(ticket109);

Ticket ticket110 = new Ticket("She only paints with bold colors. she does not like pastels.", "PROCESSED", employee195, customer449,8);

date = 1483230408000l;

DataGenerator.setValueToField(ticket110, "creationDate", new Date(date));

ticketManager.add(ticket110);

Ticket ticket111 = new Ticket("We need to rent a room for our party.", "CLOSED", employee54, customer338,9);

date = 1483058520000l;

DataGenerator.setValueToField(ticket111, "creationDate", new Date(date));

ticketManager.add(ticket111);

Ticket ticket112 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "SOLVED", employee89, customer376,10);

date = 1483373540000l;

DataGenerator.setValueToField(ticket112, "creationDate", new Date(date));

ticketManager.add(ticket112);

Ticket ticket113 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", "CLOSED", employee187, customer373,5);

date = 1483179288000l;

DataGenerator.setValueToField(ticket113, "creationDate", new Date(date));

ticketManager.add(ticket113);

Ticket ticket114 = new Ticket("Yeah, I think it's a good environment for learning English.", "WAITING_FOR_FEEDBACK", employee187, customer304,7);

date = 1483212900000l;

DataGenerator.setValueToField(ticket114, "creationDate", new Date(date));

ticketManager.add(ticket114);

Ticket ticket115 = new Ticket("A glittering gem is not enough.", "CLOSED", employee19, customer304,10);

date = 1483105361000l;

DataGenerator.setValueToField(ticket115, "creationDate", new Date(date));

ticketManager.add(ticket115);

Ticket ticket116 = new Ticket("The old apple revels in its authority.", "RECORDED", employee185, customer494,10);

date = 1483307642000l;

DataGenerator.setValueToField(ticket116, "creationDate", new Date(date));

ticketManager.add(ticket116);

Ticket ticket117 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", "RECORDED", employee112, customer422,2);

date = 1483059891000l;

DataGenerator.setValueToField(ticket117, "creationDate", new Date(date));

ticketManager.add(ticket117);

Ticket ticket118 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", "PROCESSED", employee57, customer349,9);

date = 1483344140000l;

DataGenerator.setValueToField(ticket118, "creationDate", new Date(date));

ticketManager.add(ticket118);

Ticket ticket119 = new Ticket("The stranger officiates the meal.", "WAITING_FOR_FEEDBACK", employee130, customer294,4);

date = 1483585396000l;

DataGenerator.setValueToField(ticket119, "creationDate", new Date(date));

ticketManager.add(ticket119);

Ticket ticket120 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "CLOSED", employee22, customer449,5);

date = 1483211800000l;

DataGenerator.setValueToField(ticket120, "creationDate", new Date(date));

ticketManager.add(ticket120);

Ticket ticket121 = new Ticket("She was too short to see over the fence.", "WAITING_FOR_FEEDBACK", employee80, customer454,7);

date = 1483614082000l;

DataGenerator.setValueToField(ticket121, "creationDate", new Date(date));

ticketManager.add(ticket121);

Ticket ticket122 = new Ticket("The stranger officiates the meal.", "WAITING_FOR_FEEDBACK", employee149, customer298,3);

date = 1483463685000l;

DataGenerator.setValueToField(ticket122, "creationDate", new Date(date));

ticketManager.add(ticket122);

Ticket ticket123 = new Ticket("Joe made the sugar cookies. Susan decorated them.", "PROCESSED", employee27, customer400,9);

date = 1483021855000l;

DataGenerator.setValueToField(ticket123, "creationDate", new Date(date));

ticketManager.add(ticket123);

Ticket ticket124 = new Ticket("Joe made the sugar cookies. Susan decorated them.", "PROCESSED", employee75, customer341,1);

date = 1483423083000l;

DataGenerator.setValueToField(ticket124, "creationDate", new Date(date));

ticketManager.add(ticket124);

Ticket ticket125 = new Ticket("Cats are good pets, for they are clean and are not noisy.", "RECORDED", employee172, customer251,0);

date = 1483438159000l;

DataGenerator.setValueToField(ticket125, "creationDate", new Date(date));

ticketManager.add(ticket125);

Ticket ticket126 = new Ticket("The old apple revels in its authority.", "WAITING_FOR_FEEDBACK", employee151, customer279,8);

date = 1483177248000l;

DataGenerator.setValueToField(ticket126, "creationDate", new Date(date));

ticketManager.add(ticket126);

Ticket ticket127 = new Ticket("I really want to go to work, but I am too sick to drive.", "WAITING_FOR_FEEDBACK", employee7, customer421,0);

date = 1483397806000l;

DataGenerator.setValueToField(ticket127, "creationDate", new Date(date));

ticketManager.add(ticket127);

Ticket ticket128 = new Ticket("Sixty-Four comes asking for bread.", "RECORDED", employee5, customer263,6);

date = 1483436206000l;

DataGenerator.setValueToField(ticket128, "creationDate", new Date(date));

ticketManager.add(ticket128);

Ticket ticket129 = new Ticket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", "SOLVED", employee128, customer253,5);

date = 1483031561000l;

DataGenerator.setValueToField(ticket129, "creationDate", new Date(date));

ticketManager.add(ticket129);

Ticket ticket130 = new Ticket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", "RECORDED", employee16, customer324,8);

date = 1483442170000l;

DataGenerator.setValueToField(ticket130, "creationDate", new Date(date));

ticketManager.add(ticket130);

Ticket ticket131 = new Ticket("She only paints with bold colors. she does not like pastels.", "SOLVED", employee27, customer357,10);

date = 1483447328000l;

DataGenerator.setValueToField(ticket131, "creationDate", new Date(date));

ticketManager.add(ticket131);

Ticket ticket132 = new Ticket("She advised him to come back at once.", "RECORDED", employee154, customer338,2);

date = 1483423874000l;

DataGenerator.setValueToField(ticket132, "creationDate", new Date(date));

ticketManager.add(ticket132);

Ticket ticket133 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "SOLVED", employee183, customer317,3);

date = 1483428344000l;

DataGenerator.setValueToField(ticket133, "creationDate", new Date(date));

ticketManager.add(ticket133);

Ticket ticket134 = new Ticket("Where do random thoughts come from?", "CLOSED", employee137, customer425,0);

date = 1483090880000l;

DataGenerator.setValueToField(ticket134, "creationDate", new Date(date));

ticketManager.add(ticket134);

Ticket ticket135 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", "PROCESSED", employee81, customer310,6);

date = 1483609407000l;

DataGenerator.setValueToField(ticket135, "creationDate", new Date(date));

ticketManager.add(ticket135);

Ticket ticket136 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", "PROCESSED", employee77, customer286,10);

date = 1483255644000l;

DataGenerator.setValueToField(ticket136, "creationDate", new Date(date));

ticketManager.add(ticket136);

Ticket ticket137 = new Ticket("Don't step on the broken glass.", "SOLVED", employee202, customer305,7);

date = 1483223883000l;

DataGenerator.setValueToField(ticket137, "creationDate", new Date(date));

ticketManager.add(ticket137);

Ticket ticket138 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "CLOSED", employee186, customer451,0);

date = 1483125000000l;

DataGenerator.setValueToField(ticket138, "creationDate", new Date(date));

ticketManager.add(ticket138);

Ticket ticket139 = new Ticket("The body may perhaps compensates for the loss of a true metaphysics.", "WAITING_FOR_FEEDBACK", employee49, customer446,8);

date = 1483052509000l;

DataGenerator.setValueToField(ticket139, "creationDate", new Date(date));

ticketManager.add(ticket139);

Ticket ticket140 = new Ticket("I'd rather be a bird than a fish.", "CLOSED", employee187, customer392,9);

date = 1483129625000l;

DataGenerator.setValueToField(ticket140, "creationDate", new Date(date));

ticketManager.add(ticket140);

Ticket ticket141 = new Ticket("I often see the time 11:11 or 12:34 on clocks.", "CLOSED", employee136, customer465,6);

date = 1483125728000l;

DataGenerator.setValueToField(ticket141, "creationDate", new Date(date));

ticketManager.add(ticket141);

Ticket ticket142 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", "SOLVED", employee244, customer375,1);

date = 1483605518000l;

DataGenerator.setValueToField(ticket142, "creationDate", new Date(date));

ticketManager.add(ticket142);

Ticket ticket143 = new Ticket("There was no ice cream in the freezer, nor did they have money to go to the store.", "CLOSED", employee235, customer417,0);

date = 1483389856000l;

DataGenerator.setValueToField(ticket143, "creationDate", new Date(date));

ticketManager.add(ticket143);

Ticket ticket144 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "CLOSED", employee57, customer266,1);

date = 1483147709000l;

DataGenerator.setValueToField(ticket144, "creationDate", new Date(date));

ticketManager.add(ticket144);

Ticket ticket145 = new Ticket("Please wait outside of the house.", "SOLVED", employee43, customer396,9);

date = 1483540967000l;

DataGenerator.setValueToField(ticket145, "creationDate", new Date(date));

ticketManager.add(ticket145);

Ticket ticket146 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", "PROCESSED", employee145, customer471,4);

date = 1483411853000l;

DataGenerator.setValueToField(ticket146, "creationDate", new Date(date));

ticketManager.add(ticket146);

Ticket ticket147 = new Ticket("They got there early, and they got really good seats.", "PROCESSED", employee161, customer324,3);

date = 1483288873000l;

DataGenerator.setValueToField(ticket147, "creationDate", new Date(date));

ticketManager.add(ticket147);

Ticket ticket148 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "PROCESSED", employee239, customer439,10);

date = 1483414726000l;

DataGenerator.setValueToField(ticket148, "creationDate", new Date(date));

ticketManager.add(ticket148);

Ticket ticket149 = new Ticket("Where do random thoughts come from?", "RECORDED", employee92, customer316,10);

date = 1483273410000l;

DataGenerator.setValueToField(ticket149, "creationDate", new Date(date));

ticketManager.add(ticket149);

Ticket ticket150 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "RECORDED", employee158, customer475,2);

date = 1483300426000l;

DataGenerator.setValueToField(ticket150, "creationDate", new Date(date));

ticketManager.add(ticket150);

Ticket ticket151 = new Ticket("The shooter says goodbye to his love.", "RECORDED", employee1, customer402,2);

date = 1483510686000l;

DataGenerator.setValueToField(ticket151, "creationDate", new Date(date));

ticketManager.add(ticket151);

Ticket ticket152 = new Ticket("I want more detailed information.", "RECORDED", employee95, customer460,0);

date = 1483188875000l;

DataGenerator.setValueToField(ticket152, "creationDate", new Date(date));

ticketManager.add(ticket152);

Ticket ticket153 = new Ticket("She was too short to see over the fence.", "PROCESSED", employee150, customer456,1);

date = 1483408822000l;

DataGenerator.setValueToField(ticket153, "creationDate", new Date(date));

ticketManager.add(ticket153);

Ticket ticket154 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "SOLVED", employee164, customer374,6);

date = 1483178232000l;

DataGenerator.setValueToField(ticket154, "creationDate", new Date(date));

ticketManager.add(ticket154);

Ticket ticket155 = new Ticket("Lets all be unique together until we realise we are all the same.", "SOLVED", employee147, customer460,8);

date = 1483076627000l;

DataGenerator.setValueToField(ticket155, "creationDate", new Date(date));

ticketManager.add(ticket155);

Ticket ticket156 = new Ticket("Joe made the sugar cookies. Susan decorated them.", "SOLVED", employee232, customer413,0);

date = 1483107541000l;

DataGenerator.setValueToField(ticket156, "creationDate", new Date(date));

ticketManager.add(ticket156);

Ticket ticket157 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", "SOLVED", employee35, customer364,9);

date = 1483291569000l;

DataGenerator.setValueToField(ticket157, "creationDate", new Date(date));

ticketManager.add(ticket157);

Ticket ticket158 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", "WAITING_FOR_FEEDBACK", employee203, customer481,6);

date = 1483478284000l;

DataGenerator.setValueToField(ticket158, "creationDate", new Date(date));

ticketManager.add(ticket158);

Ticket ticket159 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "RECORDED", employee189, customer419,8);

date = 1483180437000l;

DataGenerator.setValueToField(ticket159, "creationDate", new Date(date));

ticketManager.add(ticket159);

Ticket ticket160 = new Ticket("It was getting dark, and we weren’t there yet.", "RECORDED", employee65, customer332,8);

date = 1483072287000l;

DataGenerator.setValueToField(ticket160, "creationDate", new Date(date));

ticketManager.add(ticket160);

Ticket ticket161 = new Ticket("Two seats were vacant.", "SOLVED", employee186, customer390,7);

date = 1483180154000l;

DataGenerator.setValueToField(ticket161, "creationDate", new Date(date));

ticketManager.add(ticket161);

Ticket ticket162 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", "CLOSED", employee113, customer339,1);

date = 1483063133000l;

DataGenerator.setValueToField(ticket162, "creationDate", new Date(date));

ticketManager.add(ticket162);

Ticket ticket163 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "PROCESSED", employee93, customer305,5);

date = 1483312348000l;

DataGenerator.setValueToField(ticket163, "creationDate", new Date(date));

ticketManager.add(ticket163);

Ticket ticket164 = new Ticket("How was the math test?", "RECORDED", employee202, customer464,10);

date = 1483493128000l;

DataGenerator.setValueToField(ticket164, "creationDate", new Date(date));

ticketManager.add(ticket164);

Ticket ticket165 = new Ticket("The book is in front of the table.", "CLOSED", employee37, customer392,0);

date = 1483157220000l;

DataGenerator.setValueToField(ticket165, "creationDate", new Date(date));

ticketManager.add(ticket165);

Ticket ticket166 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", "PROCESSED", employee66, customer373,0);

date = 1483449760000l;

DataGenerator.setValueToField(ticket166, "creationDate", new Date(date));

ticketManager.add(ticket166);

Ticket ticket167 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", "PROCESSED", employee187, customer466,7);

date = 1483340438000l;

DataGenerator.setValueToField(ticket167, "creationDate", new Date(date));

ticketManager.add(ticket167);

Ticket ticket168 = new Ticket("Should we start class now, or should we wait for everyone to get here?", "RECORDED", employee160, customer303,2);

date = 1483075204000l;

DataGenerator.setValueToField(ticket168, "creationDate", new Date(date));

ticketManager.add(ticket168);

Ticket ticket169 = new Ticket("The stranger officiates the meal.", "SOLVED", employee198, customer393,3);

date = 1483585068000l;

DataGenerator.setValueToField(ticket169, "creationDate", new Date(date));

ticketManager.add(ticket169);

Ticket ticket170 = new Ticket("She was too short to see over the fence.", "WAITING_FOR_FEEDBACK", employee45, customer341,5);

date = 1483565585000l;

DataGenerator.setValueToField(ticket170, "creationDate", new Date(date));

ticketManager.add(ticket170);

Ticket ticket171 = new Ticket("She was too short to see over the fence.", "SOLVED", employee129, customer327,4);

date = 1483097744000l;

DataGenerator.setValueToField(ticket171, "creationDate", new Date(date));

ticketManager.add(ticket171);

Ticket ticket172 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", "SOLVED", employee173, customer255,6);

date = 1483392093000l;

DataGenerator.setValueToField(ticket172, "creationDate", new Date(date));

ticketManager.add(ticket172);

Ticket ticket173 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "PROCESSED", employee94, customer403,8);

date = 1483543083000l;

DataGenerator.setValueToField(ticket173, "creationDate", new Date(date));

ticketManager.add(ticket173);

Ticket ticket174 = new Ticket("Where do random thoughts come from?", "RECORDED", employee21, customer266,4);

date = 1483511248000l;

DataGenerator.setValueToField(ticket174, "creationDate", new Date(date));

ticketManager.add(ticket174);

Ticket ticket175 = new Ticket("I am never at home on Sundays.", "CLOSED", employee139, customer387,10);

date = 1483537529000l;

DataGenerator.setValueToField(ticket175, "creationDate", new Date(date));

ticketManager.add(ticket175);

Ticket ticket176 = new Ticket("She advised him to come back at once.", "CLOSED", employee132, customer287,1);

date = 1483141630000l;

DataGenerator.setValueToField(ticket176, "creationDate", new Date(date));

ticketManager.add(ticket176);

Ticket ticket177 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "SOLVED", employee1, customer451,5);

date = 1483537522000l;

DataGenerator.setValueToField(ticket177, "creationDate", new Date(date));

ticketManager.add(ticket177);

Ticket ticket178 = new Ticket("We need to rent a room for our party.", "CLOSED", employee144, customer407,1);

date = 1483539197000l;

DataGenerator.setValueToField(ticket178, "creationDate", new Date(date));

ticketManager.add(ticket178);

Ticket ticket179 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", "CLOSED", employee58, customer429,8);

date = 1483470809000l;

DataGenerator.setValueToField(ticket179, "creationDate", new Date(date));

ticketManager.add(ticket179);

Ticket ticket180 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", "CLOSED", employee73, customer338,8);

date = 1483138086000l;

DataGenerator.setValueToField(ticket180, "creationDate", new Date(date));

ticketManager.add(ticket180);

Ticket ticket181 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", "RECORDED", employee224, customer490,0);

date = 1483189465000l;

DataGenerator.setValueToField(ticket181, "creationDate", new Date(date));

ticketManager.add(ticket181);

Ticket ticket182 = new Ticket("She only paints with bold colors. she does not like pastels.", "WAITING_FOR_FEEDBACK", employee0, customer377,9);

date = 1483401745000l;

DataGenerator.setValueToField(ticket182, "creationDate", new Date(date));

ticketManager.add(ticket182);

Ticket ticket183 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", "RECORDED", employee134, customer464,0);

date = 1483308418000l;

DataGenerator.setValueToField(ticket183, "creationDate", new Date(date));

ticketManager.add(ticket183);

Ticket ticket184 = new Ticket("It was getting dark, and we weren’t there yet.", "WAITING_FOR_FEEDBACK", employee244, customer432,2);

date = 1483049377000l;

DataGenerator.setValueToField(ticket184, "creationDate", new Date(date));

ticketManager.add(ticket184);

Ticket ticket185 = new Ticket("Check back tomorrow. I will see if the book has arrived.", "WAITING_FOR_FEEDBACK", employee68, customer424,2);

date = 1483300548000l;

DataGenerator.setValueToField(ticket185, "creationDate", new Date(date));

ticketManager.add(ticket185);

Ticket ticket186 = new Ticket("He told us a very exciting adventure story.", "PROCESSED", employee77, customer395,7);

date = 1483517607000l;

DataGenerator.setValueToField(ticket186, "creationDate", new Date(date));

ticketManager.add(ticket186);

Ticket ticket187 = new Ticket("Let me help you with your baggage.", "RECORDED", employee155, customer416,0);

date = 1483366551000l;

DataGenerator.setValueToField(ticket187, "creationDate", new Date(date));

ticketManager.add(ticket187);

Ticket ticket188 = new Ticket("Two seats were vacant.", "WAITING_FOR_FEEDBACK", employee192, customer294,8);

date = 1483264779000l;

DataGenerator.setValueToField(ticket188, "creationDate", new Date(date));

ticketManager.add(ticket188);

Ticket ticket189 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", "WAITING_FOR_FEEDBACK", employee133, customer312,6);

date = 1483387376000l;

DataGenerator.setValueToField(ticket189, "creationDate", new Date(date));

ticketManager.add(ticket189);

Ticket ticket190 = new Ticket("It was getting dark, and we weren’t there yet.", "RECORDED", employee144, customer383,9);

date = 1483518758000l;

DataGenerator.setValueToField(ticket190, "creationDate", new Date(date));

ticketManager.add(ticket190);

Ticket ticket191 = new Ticket("She only paints with bold colors. she does not like pastels.", "CLOSED", employee23, customer276,8);

date = 1483151460000l;

DataGenerator.setValueToField(ticket191, "creationDate", new Date(date));

ticketManager.add(ticket191);

Ticket ticket192 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", "CLOSED", employee208, customer286,7);

date = 1483395403000l;

DataGenerator.setValueToField(ticket192, "creationDate", new Date(date));

ticketManager.add(ticket192);

Ticket ticket193 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "WAITING_FOR_FEEDBACK", employee47, customer354,3);

date = 1483148904000l;

DataGenerator.setValueToField(ticket193, "creationDate", new Date(date));

ticketManager.add(ticket193);

Ticket ticket194 = new Ticket("Lets all be unique together until we realise we are all the same.", "SOLVED", employee22, customer329,9);

date = 1483202939000l;

DataGenerator.setValueToField(ticket194, "creationDate", new Date(date));

ticketManager.add(ticket194);

Ticket ticket195 = new Ticket("I love eating toasted cheese and tuna sandwiches.", "CLOSED", employee152, customer474,2);

date = 1483049342000l;

DataGenerator.setValueToField(ticket195, "creationDate", new Date(date));

ticketManager.add(ticket195);

Ticket ticket196 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", "WAITING_FOR_FEEDBACK", employee161, customer329,5);

date = 1483129711000l;

DataGenerator.setValueToField(ticket196, "creationDate", new Date(date));

ticketManager.add(ticket196);

Ticket ticket197 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "WAITING_FOR_FEEDBACK", employee4, customer329,10);

date = 1483242773000l;

DataGenerator.setValueToField(ticket197, "creationDate", new Date(date));

ticketManager.add(ticket197);

Ticket ticket198 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", "SOLVED", employee58, customer363,1);

date = 1483351079000l;

DataGenerator.setValueToField(ticket198, "creationDate", new Date(date));

ticketManager.add(ticket198);

Ticket ticket199 = new Ticket("Sixty-Four comes asking for bread.", "SOLVED", employee40, customer289,7);

date = 1483184296000l;

DataGenerator.setValueToField(ticket199, "creationDate", new Date(date));

ticketManager.add(ticket199);

Ticket ticket200 = new Ticket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", "CLOSED", employee65, customer259,5);

date = 1483339184000l;

DataGenerator.setValueToField(ticket200, "creationDate", new Date(date));

ticketManager.add(ticket200);

Ticket ticket201 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "SOLVED", employee51, customer344,7);

date = 1483464043000l;

DataGenerator.setValueToField(ticket201, "creationDate", new Date(date));

ticketManager.add(ticket201);

Ticket ticket202 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", "PROCESSED", employee104, customer353,7);

date = 1483194992000l;

DataGenerator.setValueToField(ticket202, "creationDate", new Date(date));

ticketManager.add(ticket202);

Ticket ticket203 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", "PROCESSED", employee157, customer453,3);

date = 1483429663000l;

DataGenerator.setValueToField(ticket203, "creationDate", new Date(date));

ticketManager.add(ticket203);

Ticket ticket204 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", "PROCESSED", employee132, customer338,3);

date = 1483183391000l;

DataGenerator.setValueToField(ticket204, "creationDate", new Date(date));

ticketManager.add(ticket204);

Ticket ticket205 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "WAITING_FOR_FEEDBACK", employee187, customer265,9);

date = 1483370746000l;

DataGenerator.setValueToField(ticket205, "creationDate", new Date(date));

ticketManager.add(ticket205);

Ticket ticket206 = new Ticket("Sixty-Four comes asking for bread.", "CLOSED", employee162, customer464,10);

date = 1483398344000l;

DataGenerator.setValueToField(ticket206, "creationDate", new Date(date));

ticketManager.add(ticket206);

Ticket ticket207 = new Ticket("Where do random thoughts come from?", "SOLVED", employee101, customer361,4);

date = 1483586846000l;

DataGenerator.setValueToField(ticket207, "creationDate", new Date(date));

ticketManager.add(ticket207);

Ticket ticket208 = new Ticket("How was the math test?", "WAITING_FOR_FEEDBACK", employee196, customer382,1);

date = 1483088352000l;

DataGenerator.setValueToField(ticket208, "creationDate", new Date(date));

ticketManager.add(ticket208);

Ticket ticket209 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", "PROCESSED", employee56, customer318,9);

date = 1483515345000l;

DataGenerator.setValueToField(ticket209, "creationDate", new Date(date));

ticketManager.add(ticket209);

Ticket ticket210 = new Ticket("He told us a very exciting adventure story.", "SOLVED", employee239, customer365,8);

date = 1483319588000l;

DataGenerator.setValueToField(ticket210, "creationDate", new Date(date));

ticketManager.add(ticket210);

Ticket ticket211 = new Ticket("If I don’t like something, I’ll stay away from it.", "CLOSED", employee228, customer365,3);

date = 1483118248000l;

DataGenerator.setValueToField(ticket211, "creationDate", new Date(date));

ticketManager.add(ticket211);

Ticket ticket212 = new Ticket("The quick brown fox jumps over the lazy dog.", "RECORDED", employee189, customer268,9);

date = 1483151916000l;

DataGenerator.setValueToField(ticket212, "creationDate", new Date(date));

ticketManager.add(ticket212);

Ticket ticket213 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "CLOSED", employee111, customer343,4);

date = 1483458294000l;

DataGenerator.setValueToField(ticket213, "creationDate", new Date(date));

ticketManager.add(ticket213);

Ticket ticket214 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", "RECORDED", employee101, customer391,8);

date = 1483320997000l;

DataGenerator.setValueToField(ticket214, "creationDate", new Date(date));

ticketManager.add(ticket214);

Ticket ticket215 = new Ticket("If I don’t like something, I’ll stay away from it.", "PROCESSED", employee7, customer362,0);

date = 1483055706000l;

DataGenerator.setValueToField(ticket215, "creationDate", new Date(date));

ticketManager.add(ticket215);

Ticket ticket216 = new Ticket("The shooter says goodbye to his love.", "CLOSED", employee10, customer340,0);

date = 1483173873000l;

DataGenerator.setValueToField(ticket216, "creationDate", new Date(date));

ticketManager.add(ticket216);

Ticket ticket217 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", "SOLVED", employee57, customer430,0);

date = 1483223017000l;

DataGenerator.setValueToField(ticket217, "creationDate", new Date(date));

ticketManager.add(ticket217);

Ticket ticket218 = new Ticket("Yeah, I think it's a good environment for learning English.", "PROCESSED", employee112, customer421,4);

date = 1483534147000l;

DataGenerator.setValueToField(ticket218, "creationDate", new Date(date));

ticketManager.add(ticket218);

Ticket ticket219 = new Ticket("Is it free?", "RECORDED", employee177, customer280,0);

date = 1483195825000l;

DataGenerator.setValueToField(ticket219, "creationDate", new Date(date));

ticketManager.add(ticket219);

Ticket ticket220 = new Ticket("If I don’t like something, I’ll stay away from it.", "PROCESSED", employee77, customer495,10);

date = 1483592083000l;

DataGenerator.setValueToField(ticket220, "creationDate", new Date(date));

ticketManager.add(ticket220);

Ticket ticket221 = new Ticket("We have a lot of rain in June.", "CLOSED", employee170, customer481,2);

date = 1483053628000l;

DataGenerator.setValueToField(ticket221, "creationDate", new Date(date));

ticketManager.add(ticket221);

Ticket ticket222 = new Ticket("Hurry!", "PROCESSED", employee97, customer396,4);

date = 1483492296000l;

DataGenerator.setValueToField(ticket222, "creationDate", new Date(date));

ticketManager.add(ticket222);

Ticket ticket223 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", "RECORDED", employee197, customer351,0);

date = 1483045899000l;

DataGenerator.setValueToField(ticket223, "creationDate", new Date(date));

ticketManager.add(ticket223);

Ticket ticket224 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", "WAITING_FOR_FEEDBACK", employee82, customer434,10);

date = 1483143050000l;

DataGenerator.setValueToField(ticket224, "creationDate", new Date(date));

ticketManager.add(ticket224);

Ticket ticket225 = new Ticket("I checked to make sure that he was still alive.", "PROCESSED", employee29, customer374,10);

date = 1483507160000l;

DataGenerator.setValueToField(ticket225, "creationDate", new Date(date));

ticketManager.add(ticket225);

Ticket ticket226 = new Ticket("He ran out of money, so he had to stop playing poker.", "SOLVED", employee170, customer268,8);

date = 1483146619000l;

DataGenerator.setValueToField(ticket226, "creationDate", new Date(date));

ticketManager.add(ticket226);

Ticket ticket227 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "PROCESSED", employee119, customer412,5);

date = 1483254694000l;

DataGenerator.setValueToField(ticket227, "creationDate", new Date(date));

ticketManager.add(ticket227);

Ticket ticket228 = new Ticket("I checked to make sure that he was still alive.", "RECORDED", employee243, customer288,8);

date = 1483097039000l;

DataGenerator.setValueToField(ticket228, "creationDate", new Date(date));

ticketManager.add(ticket228);

Ticket ticket229 = new Ticket("The stranger officiates the meal.", "RECORDED", employee68, customer315,7);

date = 1483241260000l;

DataGenerator.setValueToField(ticket229, "creationDate", new Date(date));

ticketManager.add(ticket229);

Ticket ticket230 = new Ticket("I am never at home on Sundays.", "WAITING_FOR_FEEDBACK", employee125, customer448,5);

date = 1483539320000l;

DataGenerator.setValueToField(ticket230, "creationDate", new Date(date));

ticketManager.add(ticket230);

Ticket ticket231 = new Ticket("She advised him to come back at once.", "CLOSED", employee78, customer268,3);

date = 1483544229000l;

DataGenerator.setValueToField(ticket231, "creationDate", new Date(date));

ticketManager.add(ticket231);

Ticket ticket232 = new Ticket("Please wait outside of the house.", "RECORDED", employee91, customer402,1);

date = 1483050656000l;

DataGenerator.setValueToField(ticket232, "creationDate", new Date(date));

ticketManager.add(ticket232);

Ticket ticket233 = new Ticket("A glittering gem is not enough.", "CLOSED", employee191, customer443,0);

date = 1483337163000l;

DataGenerator.setValueToField(ticket233, "creationDate", new Date(date));

ticketManager.add(ticket233);

Ticket ticket234 = new Ticket("She was too short to see over the fence.", "PROCESSED", employee167, customer455,8);

date = 1483500133000l;

DataGenerator.setValueToField(ticket234, "creationDate", new Date(date));

ticketManager.add(ticket234);

Ticket ticket235 = new Ticket("Tom got a small piece of pie.", "SOLVED", employee189, customer425,9);

date = 1483302284000l;

DataGenerator.setValueToField(ticket235, "creationDate", new Date(date));

ticketManager.add(ticket235);

Ticket ticket236 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", "PROCESSED", employee49, customer284,1);

date = 1483352371000l;

DataGenerator.setValueToField(ticket236, "creationDate", new Date(date));

ticketManager.add(ticket236);

Ticket ticket237 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", "SOLVED", employee149, customer299,7);

date = 1483534894000l;

DataGenerator.setValueToField(ticket237, "creationDate", new Date(date));

ticketManager.add(ticket237);

Ticket ticket238 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "CLOSED", employee173, customer474,10);

date = 1483538222000l;

DataGenerator.setValueToField(ticket238, "creationDate", new Date(date));

ticketManager.add(ticket238);

Ticket ticket239 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "SOLVED", employee154, customer428,4);

date = 1483277717000l;

DataGenerator.setValueToField(ticket239, "creationDate", new Date(date));

ticketManager.add(ticket239);

Ticket ticket240 = new Ticket("This is a Japanese doll.", "CLOSED", employee184, customer361,9);

date = 1483341835000l;

DataGenerator.setValueToField(ticket240, "creationDate", new Date(date));

ticketManager.add(ticket240);

Ticket ticket241 = new Ticket("Mary plays the piano.", "PROCESSED", employee113, customer382,6);

date = 1483599037000l;

DataGenerator.setValueToField(ticket241, "creationDate", new Date(date));

ticketManager.add(ticket241);

Ticket ticket242 = new Ticket("Wow, does that work?", "PROCESSED", employee196, customer419,1);

date = 1483180418000l;

DataGenerator.setValueToField(ticket242, "creationDate", new Date(date));

ticketManager.add(ticket242);

Ticket ticket243 = new Ticket("I want more detailed information.", "CLOSED", employee205, customer445,2);

date = 1483285312000l;

DataGenerator.setValueToField(ticket243, "creationDate", new Date(date));

ticketManager.add(ticket243);

Ticket ticket244 = new Ticket("It was getting dark, and we weren’t there yet.", "WAITING_FOR_FEEDBACK", employee244, customer465,3);

date = 1483528961000l;

DataGenerator.setValueToField(ticket244, "creationDate", new Date(date));

ticketManager.add(ticket244);

Ticket ticket245 = new Ticket("Tom got a small piece of pie.", "WAITING_FOR_FEEDBACK", employee62, customer269,3);

date = 1483105057000l;

DataGenerator.setValueToField(ticket245, "creationDate", new Date(date));

ticketManager.add(ticket245);

Ticket ticket246 = new Ticket("They got there early, and they got really good seats.", "WAITING_FOR_FEEDBACK", employee211, customer434,9);

date = 1483591842000l;

DataGenerator.setValueToField(ticket246, "creationDate", new Date(date));

ticketManager.add(ticket246);

Ticket ticket247 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", "CLOSED", employee141, customer396,5);

date = 1483518065000l;

DataGenerator.setValueToField(ticket247, "creationDate", new Date(date));

ticketManager.add(ticket247);

Ticket ticket248 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", "WAITING_FOR_FEEDBACK", employee40, customer315,9);

date = 1483405936000l;

DataGenerator.setValueToField(ticket248, "creationDate", new Date(date));

ticketManager.add(ticket248);

Ticket ticket249 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", "WAITING_FOR_FEEDBACK", employee194, customer365,5);

date = 1483333430000l;

DataGenerator.setValueToField(ticket249, "creationDate", new Date(date));

ticketManager.add(ticket249);

Ticket ticket250 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", "CLOSED", employee183, customer296,3);

date = 1483376643000l;

DataGenerator.setValueToField(ticket250, "creationDate", new Date(date));

ticketManager.add(ticket250);

Ticket ticket251 = new Ticket("I am never at home on Sundays.", "WAITING_FOR_FEEDBACK", employee84, customer436,5);

date = 1483501135000l;

DataGenerator.setValueToField(ticket251, "creationDate", new Date(date));

ticketManager.add(ticket251);

Ticket ticket252 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", "WAITING_FOR_FEEDBACK", employee195, customer400,9);

date = 1483375729000l;

DataGenerator.setValueToField(ticket252, "creationDate", new Date(date));

ticketManager.add(ticket252);

Ticket ticket253 = new Ticket("Malls are great places to shop. I can find everything I need under one roof.", "RECORDED", employee208, customer452,3);

date = 1483228512000l;

DataGenerator.setValueToField(ticket253, "creationDate", new Date(date));

ticketManager.add(ticket253);

Ticket ticket254 = new Ticket("We need to rent a room for our party.", "SOLVED", employee64, customer344,10);

date = 1483232738000l;

DataGenerator.setValueToField(ticket254, "creationDate", new Date(date));

ticketManager.add(ticket254);

Ticket ticket255 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "WAITING_FOR_FEEDBACK", employee50, customer436,1);

date = 1483468186000l;

DataGenerator.setValueToField(ticket255, "creationDate", new Date(date));

ticketManager.add(ticket255);

Ticket ticket256 = new Ticket("Where do random thoughts come from?", "SOLVED", employee191, customer363,4);

date = 1483174355000l;

DataGenerator.setValueToField(ticket256, "creationDate", new Date(date));

ticketManager.add(ticket256);

Ticket ticket257 = new Ticket("The river stole the gods.", "PROCESSED", employee206, customer365,5);

date = 1483026343000l;

DataGenerator.setValueToField(ticket257, "creationDate", new Date(date));

ticketManager.add(ticket257);

Ticket ticket258 = new Ticket("I want more detailed information.", "WAITING_FOR_FEEDBACK", employee165, customer399,10);

date = 1483396157000l;

DataGenerator.setValueToField(ticket258, "creationDate", new Date(date));

ticketManager.add(ticket258);

Ticket ticket259 = new Ticket("She always speaks to him in a loud voice.", "SOLVED", employee235, customer395,6);

date = 1483342541000l;

DataGenerator.setValueToField(ticket259, "creationDate", new Date(date));

ticketManager.add(ticket259);

Ticket ticket260 = new Ticket("Should we start class now, or should we wait for everyone to get here?", "CLOSED", employee42, customer256,9);

date = 1483530431000l;

DataGenerator.setValueToField(ticket260, "creationDate", new Date(date));

ticketManager.add(ticket260);

Ticket ticket261 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "WAITING_FOR_FEEDBACK", employee231, customer468,6);

date = 1483518837000l;

DataGenerator.setValueToField(ticket261, "creationDate", new Date(date));

ticketManager.add(ticket261);

Ticket ticket262 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "WAITING_FOR_FEEDBACK", employee194, customer489,10);

date = 1483435249000l;

DataGenerator.setValueToField(ticket262, "creationDate", new Date(date));

ticketManager.add(ticket262);

Ticket ticket263 = new Ticket("I really want to go to work, but I am too sick to drive.", "SOLVED", employee35, customer383,3);

date = 1483096606000l;

DataGenerator.setValueToField(ticket263, "creationDate", new Date(date));

ticketManager.add(ticket263);

Ticket ticket264 = new Ticket("The book is in front of the table.", "SOLVED", employee214, customer281,4);

date = 1483354662000l;

DataGenerator.setValueToField(ticket264, "creationDate", new Date(date));

ticketManager.add(ticket264);

Ticket ticket265 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "CLOSED", employee182, customer412,7);

date = 1483304849000l;

DataGenerator.setValueToField(ticket265, "creationDate", new Date(date));

ticketManager.add(ticket265);

Ticket ticket266 = new Ticket("She wrote him a long letter, but he didn't read it.", "CLOSED", employee180, customer418,2);

date = 1483502991000l;

DataGenerator.setValueToField(ticket266, "creationDate", new Date(date));

ticketManager.add(ticket266);

Ticket ticket267 = new Ticket("The lake is a long way from here.", "SOLVED", employee144, customer348,1);

date = 1483395214000l;

DataGenerator.setValueToField(ticket267, "creationDate", new Date(date));

ticketManager.add(ticket267);

Ticket ticket268 = new Ticket("She folded her handkerchief neatly.", "SOLVED", employee17, customer279,8);

date = 1483515448000l;

DataGenerator.setValueToField(ticket268, "creationDate", new Date(date));

ticketManager.add(ticket268);

Ticket ticket269 = new Ticket("Joe made the sugar cookies. Susan decorated them.", "RECORDED", employee6, customer354,8);

date = 1483089453000l;

DataGenerator.setValueToField(ticket269, "creationDate", new Date(date));

ticketManager.add(ticket269);

Ticket ticket270 = new Ticket("We need to rent a room for our party.", "PROCESSED", employee203, customer282,7);

date = 1483361838000l;

DataGenerator.setValueToField(ticket270, "creationDate", new Date(date));

ticketManager.add(ticket270);

Ticket ticket271 = new Ticket("He ran out of money, so he had to stop playing poker.", "CLOSED", employee207, customer303,10);

date = 1483032991000l;

DataGenerator.setValueToField(ticket271, "creationDate", new Date(date));

ticketManager.add(ticket271);

Ticket ticket272 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", "CLOSED", employee151, customer306,1);

date = 1483204743000l;

DataGenerator.setValueToField(ticket272, "creationDate", new Date(date));

ticketManager.add(ticket272);

Ticket ticket273 = new Ticket("Where do random thoughts come from?", "RECORDED", employee238, customer314,0);

date = 1483171645000l;

DataGenerator.setValueToField(ticket273, "creationDate", new Date(date));

ticketManager.add(ticket273);

Ticket ticket274 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", "CLOSED", employee237, customer259,10);

date = 1483423548000l;

DataGenerator.setValueToField(ticket274, "creationDate", new Date(date));

ticketManager.add(ticket274);

Ticket ticket275 = new Ticket("If I don’t like something, I’ll stay away from it.", "CLOSED", employee174, customer397,5);

date = 1483083198000l;

DataGenerator.setValueToField(ticket275, "creationDate", new Date(date));

ticketManager.add(ticket275);

Ticket ticket276 = new Ticket("I want more detailed information.", "CLOSED", employee21, customer448,0);

date = 1483297246000l;

DataGenerator.setValueToField(ticket276, "creationDate", new Date(date));

ticketManager.add(ticket276);

Ticket ticket277 = new Ticket("This is a Japanese doll.", "PROCESSED", employee215, customer319,4);

date = 1483199780000l;

DataGenerator.setValueToField(ticket277, "creationDate", new Date(date));

ticketManager.add(ticket277);

Ticket ticket278 = new Ticket("There was no ice cream in the freezer, nor did they have money to go to the store.", "WAITING_FOR_FEEDBACK", employee31, customer261,0);

date = 1483492706000l;

DataGenerator.setValueToField(ticket278, "creationDate", new Date(date));

ticketManager.add(ticket278);

Ticket ticket279 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", "CLOSED", employee55, customer260,7);

date = 1483484074000l;

DataGenerator.setValueToField(ticket279, "creationDate", new Date(date));

ticketManager.add(ticket279);

Ticket ticket280 = new Ticket("When I was little I had a car door slammed shut on my hand. I still remember it quite vividly.", "SOLVED", employee205, customer266,5);

date = 1483567242000l;

DataGenerator.setValueToField(ticket280, "creationDate", new Date(date));

ticketManager.add(ticket280);

Ticket ticket281 = new Ticket("I'd rather be a bird than a fish.", "RECORDED", employee133, customer317,8);

date = 1483039963000l;

DataGenerator.setValueToField(ticket281, "creationDate", new Date(date));

ticketManager.add(ticket281);

Ticket ticket282 = new Ticket("It was getting dark, and we weren’t there yet.", "SOLVED", employee150, customer447,4);

date = 1483608916000l;

DataGenerator.setValueToField(ticket282, "creationDate", new Date(date));

ticketManager.add(ticket282);

Ticket ticket283 = new Ticket("Two seats were vacant.", "SOLVED", employee231, customer358,2);

date = 1483365597000l;

DataGenerator.setValueToField(ticket283, "creationDate", new Date(date));

ticketManager.add(ticket283);

Ticket ticket284 = new Ticket("They got there early, and they got really good seats.", "RECORDED", employee30, customer307,2);

date = 1483566709000l;

DataGenerator.setValueToField(ticket284, "creationDate", new Date(date));

ticketManager.add(ticket284);

Ticket ticket285 = new Ticket("Cats are good pets, for they are clean and are not noisy.", "RECORDED", employee203, customer290,6);

date = 1483019731000l;

DataGenerator.setValueToField(ticket285, "creationDate", new Date(date));

ticketManager.add(ticket285);

Ticket ticket286 = new Ticket("I want more detailed information.", "WAITING_FOR_FEEDBACK", employee24, customer476,8);

date = 1483066572000l;

DataGenerator.setValueToField(ticket286, "creationDate", new Date(date));

ticketManager.add(ticket286);

Ticket ticket287 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "SOLVED", employee29, customer467,1);

date = 1483091638000l;

DataGenerator.setValueToField(ticket287, "creationDate", new Date(date));

ticketManager.add(ticket287);

Ticket ticket288 = new Ticket("Yeah, I think it's a good environment for learning English.", "RECORDED", employee93, customer464,7);

date = 1483403331000l;

DataGenerator.setValueToField(ticket288, "creationDate", new Date(date));

ticketManager.add(ticket288);

Ticket ticket289 = new Ticket("A glittering gem is not enough.", "PROCESSED", employee172, customer408,6);

date = 1483024742000l;

DataGenerator.setValueToField(ticket289, "creationDate", new Date(date));

ticketManager.add(ticket289);

Ticket ticket290 = new Ticket("Check back tomorrow. I will see if the book has arrived.", "RECORDED", employee118, customer493,4);

date = 1483611028000l;

DataGenerator.setValueToField(ticket290, "creationDate", new Date(date));

ticketManager.add(ticket290);

Ticket ticket291 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", "CLOSED", employee65, customer474,10);

date = 1483220751000l;

DataGenerator.setValueToField(ticket291, "creationDate", new Date(date));

ticketManager.add(ticket291);

Ticket ticket292 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", "PROCESSED", employee128, customer440,0);

date = 1483596602000l;

DataGenerator.setValueToField(ticket292, "creationDate", new Date(date));

ticketManager.add(ticket292);

Ticket ticket293 = new Ticket("My Mum tries to be cool by saying that she likes all the same things that I do.", "CLOSED", employee230, customer389,1);

date = 1483091590000l;

DataGenerator.setValueToField(ticket293, "creationDate", new Date(date));

ticketManager.add(ticket293);

Ticket ticket294 = new Ticket("Christmas is coming.", "WAITING_FOR_FEEDBACK", employee200, customer477,10);

date = 1483366406000l;

DataGenerator.setValueToField(ticket294, "creationDate", new Date(date));

ticketManager.add(ticket294);

Ticket ticket295 = new Ticket("The shooter says goodbye to his love.", "WAITING_FOR_FEEDBACK", employee109, customer370,4);

date = 1483237521000l;

DataGenerator.setValueToField(ticket295, "creationDate", new Date(date));

ticketManager.add(ticket295);

Ticket ticket296 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "PROCESSED", employee84, customer335,0);

date = 1483565868000l;

DataGenerator.setValueToField(ticket296, "creationDate", new Date(date));

ticketManager.add(ticket296);

Ticket ticket297 = new Ticket("Wow, does that work?", "WAITING_FOR_FEEDBACK", employee116, customer313,6);

date = 1483501633000l;

DataGenerator.setValueToField(ticket297, "creationDate", new Date(date));

ticketManager.add(ticket297);

Ticket ticket298 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "PROCESSED", employee47, customer482,5);

date = 1483508345000l;

DataGenerator.setValueToField(ticket298, "creationDate", new Date(date));

ticketManager.add(ticket298);

Ticket ticket299 = new Ticket("I'd rather be a bird than a fish.", "RECORDED", employee130, customer431,4);

date = 1483554907000l;

DataGenerator.setValueToField(ticket299, "creationDate", new Date(date));

ticketManager.add(ticket299);

Ticket ticket300 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", "SOLVED", employee29, customer481,10);

date = 1483508756000l;

DataGenerator.setValueToField(ticket300, "creationDate", new Date(date));

ticketManager.add(ticket300);

Ticket ticket301 = new Ticket("Abstraction is often one floor above you.", "SOLVED", employee37, customer417,7);

date = 1483477757000l;

DataGenerator.setValueToField(ticket301, "creationDate", new Date(date));

ticketManager.add(ticket301);

Ticket ticket302 = new Ticket("How was the math test?", "WAITING_FOR_FEEDBACK", employee60, customer396,0);

date = 1483174149000l;

DataGenerator.setValueToField(ticket302, "creationDate", new Date(date));

ticketManager.add(ticket302);

Ticket ticket303 = new Ticket("She wrote him a long letter, but he didn't read it.", "SOLVED", employee194, customer486,6);

date = 1483269238000l;

DataGenerator.setValueToField(ticket303, "creationDate", new Date(date));

ticketManager.add(ticket303);

Ticket ticket304 = new Ticket("It was getting dark, and we weren’t there yet.", "PROCESSED", employee104, customer432,7);

date = 1483491835000l;

DataGenerator.setValueToField(ticket304, "creationDate", new Date(date));

ticketManager.add(ticket304);

Ticket ticket305 = new Ticket("The sky is clear. the stars are twinkling.", "WAITING_FOR_FEEDBACK", employee147, customer478,7);

date = 1483370422000l;

DataGenerator.setValueToField(ticket305, "creationDate", new Date(date));

ticketManager.add(ticket305);

Ticket ticket306 = new Ticket("The old apple revels in its authority.", "CLOSED", employee47, customer269,10);

date = 1483445874000l;

DataGenerator.setValueToField(ticket306, "creationDate", new Date(date));

ticketManager.add(ticket306);

Ticket ticket307 = new Ticket("Rock music approaches at high velocity.", "WAITING_FOR_FEEDBACK", employee45, customer450,8);

date = 1483144363000l;

DataGenerator.setValueToField(ticket307, "creationDate", new Date(date));

ticketManager.add(ticket307);

Ticket ticket308 = new Ticket("Everyone was busy, so I went to the movie alone.", "RECORDED", employee38, customer260,10);

date = 1483384706000l;

DataGenerator.setValueToField(ticket308, "creationDate", new Date(date));

ticketManager.add(ticket308);

Ticket ticket309 = new Ticket("Everyone was busy, so I went to the movie alone.", "SOLVED", employee112, customer416,5);

date = 1483018883000l;

DataGenerator.setValueToField(ticket309, "creationDate", new Date(date));

ticketManager.add(ticket309);

Ticket ticket310 = new Ticket("He told us a very exciting adventure story.", "RECORDED", employee247, customer493,0);

date = 1483501759000l;

DataGenerator.setValueToField(ticket310, "creationDate", new Date(date));

ticketManager.add(ticket310);

Ticket ticket311 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", "SOLVED", employee97, customer329,8);

date = 1483458499000l;

DataGenerator.setValueToField(ticket311, "creationDate", new Date(date));

ticketManager.add(ticket311);

Ticket ticket312 = new Ticket("Don't step on the broken glass.", "SOLVED", employee129, customer471,7);

date = 1483402920000l;

DataGenerator.setValueToField(ticket312, "creationDate", new Date(date));

ticketManager.add(ticket312);

Ticket ticket313 = new Ticket("I want more detailed information.", "RECORDED", employee230, customer346,6);

date = 1483464330000l;

DataGenerator.setValueToField(ticket313, "creationDate", new Date(date));

ticketManager.add(ticket313);

Ticket ticket314 = new Ticket("Lets all be unique together until we realise we are all the same.", "CLOSED", employee90, customer469,5);

date = 1483586991000l;

DataGenerator.setValueToField(ticket314, "creationDate", new Date(date));

ticketManager.add(ticket314);

Ticket ticket315 = new Ticket("She advised him to come back at once.", "CLOSED", employee56, customer374,1);

date = 1483435100000l;

DataGenerator.setValueToField(ticket315, "creationDate", new Date(date));

ticketManager.add(ticket315);

Ticket ticket316 = new Ticket("Lets all be unique together until we realise we are all the same.", "RECORDED", employee159, customer366,0);

date = 1483595528000l;

DataGenerator.setValueToField(ticket316, "creationDate", new Date(date));

ticketManager.add(ticket316);

Ticket ticket317 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "WAITING_FOR_FEEDBACK", employee82, customer318,8);

date = 1483465338000l;

DataGenerator.setValueToField(ticket317, "creationDate", new Date(date));

ticketManager.add(ticket317);

Ticket ticket318 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", "CLOSED", employee220, customer411,1);

date = 1483135379000l;

DataGenerator.setValueToField(ticket318, "creationDate", new Date(date));

ticketManager.add(ticket318);

Ticket ticket319 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", "SOLVED", employee222, customer452,9);

date = 1483041065000l;

DataGenerator.setValueToField(ticket319, "creationDate", new Date(date));

ticketManager.add(ticket319);

Ticket ticket320 = new Ticket("A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt.", "PROCESSED", employee30, customer478,8);

date = 1483274521000l;

DataGenerator.setValueToField(ticket320, "creationDate", new Date(date));

ticketManager.add(ticket320);

Ticket ticket321 = new Ticket("She advised him to come back at once.", "SOLVED", employee239, customer354,2);

date = 1483586179000l;

DataGenerator.setValueToField(ticket321, "creationDate", new Date(date));

ticketManager.add(ticket321);

Ticket ticket322 = new Ticket("The river stole the gods.", "CLOSED", employee6, customer415,1);

date = 1483262427000l;

DataGenerator.setValueToField(ticket322, "creationDate", new Date(date));

ticketManager.add(ticket322);

Ticket ticket323 = new Ticket("He told us a very exciting adventure story.", "SOLVED", employee51, customer294,0);

date = 1483225468000l;

DataGenerator.setValueToField(ticket323, "creationDate", new Date(date));

ticketManager.add(ticket323);

Ticket ticket324 = new Ticket("She folded her handkerchief neatly.", "PROCESSED", employee242, customer394,7);

date = 1483353744000l;

DataGenerator.setValueToField(ticket324, "creationDate", new Date(date));

ticketManager.add(ticket324);

Ticket ticket325 = new Ticket("I love eating toasted cheese and tuna sandwiches.", "PROCESSED", employee76, customer491,5);

date = 1483078819000l;

DataGenerator.setValueToField(ticket325, "creationDate", new Date(date));

ticketManager.add(ticket325);

Ticket ticket326 = new Ticket("Is it free?", "CLOSED", employee78, customer417,8);

date = 1483182904000l;

DataGenerator.setValueToField(ticket326, "creationDate", new Date(date));

ticketManager.add(ticket326);

Ticket ticket327 = new Ticket("The mysterious diary records the voice.", "WAITING_FOR_FEEDBACK", employee67, customer482,2);

date = 1483246363000l;

DataGenerator.setValueToField(ticket327, "creationDate", new Date(date));

ticketManager.add(ticket327);

Ticket ticket328 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", "SOLVED", employee28, customer414,6);

date = 1483083254000l;

DataGenerator.setValueToField(ticket328, "creationDate", new Date(date));

ticketManager.add(ticket328);

Ticket ticket329 = new Ticket("The sky is clear. the stars are twinkling.", "WAITING_FOR_FEEDBACK", employee42, customer417,9);

date = 1483468928000l;

DataGenerator.setValueToField(ticket329, "creationDate", new Date(date));

ticketManager.add(ticket329);

Ticket ticket330 = new Ticket("Abstraction is often one floor above you.", "WAITING_FOR_FEEDBACK", employee248, customer342,5);

date = 1483263116000l;

DataGenerator.setValueToField(ticket330, "creationDate", new Date(date));

ticketManager.add(ticket330);

Ticket ticket331 = new Ticket("Wow, does that work?", "WAITING_FOR_FEEDBACK", employee132, customer398,9);

date = 1483301817000l;

DataGenerator.setValueToField(ticket331, "creationDate", new Date(date));

ticketManager.add(ticket331);

Ticket ticket332 = new Ticket("It was getting dark, and we weren’t there yet.", "PROCESSED", employee190, customer264,10);

date = 1483333904000l;

DataGenerator.setValueToField(ticket332, "creationDate", new Date(date));

ticketManager.add(ticket332);

Ticket ticket333 = new Ticket("She wrote him a long letter, but he didn't read it.", "RECORDED", employee194, customer423,5);

date = 1483481851000l;

DataGenerator.setValueToField(ticket333, "creationDate", new Date(date));

ticketManager.add(ticket333);

Ticket ticket334 = new Ticket("This is a Japanese doll.", "WAITING_FOR_FEEDBACK", employee10, customer264,7);

date = 1483479699000l;

DataGenerator.setValueToField(ticket334, "creationDate", new Date(date));

ticketManager.add(ticket334);

Ticket ticket335 = new Ticket("Two seats were vacant.", "PROCESSED", employee197, customer452,5);

date = 1483507086000l;

DataGenerator.setValueToField(ticket335, "creationDate", new Date(date));

ticketManager.add(ticket335);

Ticket ticket336 = new Ticket("Lets all be unique together until we realise we are all the same.", "PROCESSED", employee75, customer307,0);

date = 1483345649000l;

DataGenerator.setValueToField(ticket336, "creationDate", new Date(date));

ticketManager.add(ticket336);

Ticket ticket337 = new Ticket("Everyone was busy, so I went to the movie alone.", "RECORDED", employee225, customer441,9);

date = 1483238554000l;

DataGenerator.setValueToField(ticket337, "creationDate", new Date(date));

ticketManager.add(ticket337);

Ticket ticket338 = new Ticket("The memory we used to share is no longer coherent.", "PROCESSED", employee178, customer327,5);

date = 1483332105000l;

DataGenerator.setValueToField(ticket338, "creationDate", new Date(date));

ticketManager.add(ticket338);

Ticket ticket339 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", "RECORDED", employee121, customer355,0);

date = 1483310592000l;

DataGenerator.setValueToField(ticket339, "creationDate", new Date(date));

ticketManager.add(ticket339);

Ticket ticket340 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", "SOLVED", employee229, customer312,10);

date = 1483512058000l;

DataGenerator.setValueToField(ticket340, "creationDate", new Date(date));

ticketManager.add(ticket340);

Ticket ticket341 = new Ticket("A glittering gem is not enough.", "PROCESSED", employee170, customer407,2);

date = 1483121403000l;

DataGenerator.setValueToField(ticket341, "creationDate", new Date(date));

ticketManager.add(ticket341);

Ticket ticket342 = new Ticket("Hurry!", "PROCESSED", employee241, customer358,0);

date = 1483066432000l;

DataGenerator.setValueToField(ticket342, "creationDate", new Date(date));

ticketManager.add(ticket342);

Ticket ticket343 = new Ticket("She was too short to see over the fence.", "RECORDED", employee168, customer391,1);

date = 1483574789000l;

DataGenerator.setValueToField(ticket343, "creationDate", new Date(date));

ticketManager.add(ticket343);

Ticket ticket344 = new Ticket("This is a Japanese doll.", "CLOSED", employee130, customer458,0);

date = 1483320825000l;

DataGenerator.setValueToField(ticket344, "creationDate", new Date(date));

ticketManager.add(ticket344);

Ticket ticket345 = new Ticket("A glittering gem is not enough.", "CLOSED", employee64, customer355,0);

date = 1483290923000l;

DataGenerator.setValueToField(ticket345, "creationDate", new Date(date));

ticketManager.add(ticket345);

Ticket ticket346 = new Ticket("Lets all be unique together until we realise we are all the same.", "CLOSED", employee195, customer254,6);

date = 1483124495000l;

DataGenerator.setValueToField(ticket346, "creationDate", new Date(date));

ticketManager.add(ticket346);

Ticket ticket347 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "WAITING_FOR_FEEDBACK", employee47, customer484,7);

date = 1483533400000l;

DataGenerator.setValueToField(ticket347, "creationDate", new Date(date));

ticketManager.add(ticket347);

Ticket ticket348 = new Ticket("This is a Japanese doll.", "WAITING_FOR_FEEDBACK", employee75, customer272,9);

date = 1483162596000l;

DataGenerator.setValueToField(ticket348, "creationDate", new Date(date));

ticketManager.add(ticket348);

Ticket ticket349 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "CLOSED", employee143, customer303,6);

date = 1483229188000l;

DataGenerator.setValueToField(ticket349, "creationDate", new Date(date));

ticketManager.add(ticket349);

Ticket ticket350 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", "WAITING_FOR_FEEDBACK", employee96, customer457,8);

date = 1483450798000l;

DataGenerator.setValueToField(ticket350, "creationDate", new Date(date));

ticketManager.add(ticket350);

Ticket ticket351 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "PROCESSED", employee96, customer328,1);

date = 1483083319000l;

DataGenerator.setValueToField(ticket351, "creationDate", new Date(date));

ticketManager.add(ticket351);

Ticket ticket352 = new Ticket("How was the math test?", "RECORDED", employee97, customer381,1);

date = 1483160973000l;

DataGenerator.setValueToField(ticket352, "creationDate", new Date(date));

ticketManager.add(ticket352);

Ticket ticket353 = new Ticket("I hear that Nancy is very pretty.", "RECORDED", employee7, customer360,5);

date = 1483529903000l;

DataGenerator.setValueToField(ticket353, "creationDate", new Date(date));

ticketManager.add(ticket353);

Ticket ticket354 = new Ticket("He ran out of money, so he had to stop playing poker.", "RECORDED", employee90, customer307,5);

date = 1483175330000l;

DataGenerator.setValueToField(ticket354, "creationDate", new Date(date));

ticketManager.add(ticket354);

Ticket ticket355 = new Ticket("Hurry!", "CLOSED", employee125, customer376,9);

date = 1483099165000l;

DataGenerator.setValueToField(ticket355, "creationDate", new Date(date));

ticketManager.add(ticket355);

Ticket ticket356 = new Ticket("How was the math test?", "RECORDED", employee240, customer349,1);

date = 1483054900000l;

DataGenerator.setValueToField(ticket356, "creationDate", new Date(date));

ticketManager.add(ticket356);

Ticket ticket357 = new Ticket("Check back tomorrow. I will see if the book has arrived.", "CLOSED", employee198, customer298,10);

date = 1483555187000l;

DataGenerator.setValueToField(ticket357, "creationDate", new Date(date));

ticketManager.add(ticket357);

Ticket ticket358 = new Ticket("The waves were crashing on the shore. it was a lovely sight.", "RECORDED", employee97, customer297,5);

date = 1483117252000l;

DataGenerator.setValueToField(ticket358, "creationDate", new Date(date));

ticketManager.add(ticket358);

Ticket ticket359 = new Ticket("Mary plays the piano.", "WAITING_FOR_FEEDBACK", employee199, customer362,5);

date = 1483053403000l;

DataGenerator.setValueToField(ticket359, "creationDate", new Date(date));

ticketManager.add(ticket359);

Ticket ticket360 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "CLOSED", employee202, customer408,1);

date = 1483120455000l;

DataGenerator.setValueToField(ticket360, "creationDate", new Date(date));

ticketManager.add(ticket360);

Ticket ticket361 = new Ticket("I love eating toasted cheese and tuna sandwiches.", "WAITING_FOR_FEEDBACK", employee68, customer330,9);

date = 1483123761000l;

DataGenerator.setValueToField(ticket361, "creationDate", new Date(date));

ticketManager.add(ticket361);

Ticket ticket362 = new Ticket("How was the math test?", "WAITING_FOR_FEEDBACK", employee46, customer251,7);

date = 1483181383000l;

DataGenerator.setValueToField(ticket362, "creationDate", new Date(date));

ticketManager.add(ticket362);

Ticket ticket363 = new Ticket("Everyone was busy, so I went to the movie alone.", "CLOSED", employee145, customer282,5);

date = 1483263109000l;

DataGenerator.setValueToField(ticket363, "creationDate", new Date(date));

ticketManager.add(ticket363);

Ticket ticket364 = new Ticket("Is it free?", "RECORDED", employee114, customer284,8);

date = 1483539547000l;

DataGenerator.setValueToField(ticket364, "creationDate", new Date(date));

ticketManager.add(ticket364);

Ticket ticket365 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", "CLOSED", employee64, customer405,1);

date = 1483292724000l;

DataGenerator.setValueToField(ticket365, "creationDate", new Date(date));

ticketManager.add(ticket365);

Ticket ticket366 = new Ticket("The stranger officiates the meal.", "WAITING_FOR_FEEDBACK", employee150, customer373,4);

date = 1483226577000l;

DataGenerator.setValueToField(ticket366, "creationDate", new Date(date));

ticketManager.add(ticket366);

Ticket ticket367 = new Ticket("Is it free?", "RECORDED", employee218, customer482,0);

date = 1483366639000l;

DataGenerator.setValueToField(ticket367, "creationDate", new Date(date));

ticketManager.add(ticket367);

Ticket ticket368 = new Ticket("Hurry!", "CLOSED", employee208, customer476,3);

date = 1483134083000l;

DataGenerator.setValueToField(ticket368, "creationDate", new Date(date));

ticketManager.add(ticket368);

Ticket ticket369 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", "PROCESSED", employee39, customer250,4);

date = 1483116083000l;

DataGenerator.setValueToField(ticket369, "creationDate", new Date(date));

ticketManager.add(ticket369);

Ticket ticket370 = new Ticket("If I don’t like something, I’ll stay away from it.", "SOLVED", employee186, customer250,8);

date = 1483016121000l;

DataGenerator.setValueToField(ticket370, "creationDate", new Date(date));

ticketManager.add(ticket370);

Ticket ticket371 = new Ticket("Don't step on the broken glass.", "CLOSED", employee106, customer444,7);

date = 1483238720000l;

DataGenerator.setValueToField(ticket371, "creationDate", new Date(date));

ticketManager.add(ticket371);

Ticket ticket372 = new Ticket("A song can make or ruin a person’s day if they let it get to them.", "PROCESSED", employee241, customer448,9);

date = 1483292792000l;

DataGenerator.setValueToField(ticket372, "creationDate", new Date(date));

ticketManager.add(ticket372);

Ticket ticket373 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", "SOLVED", employee52, customer340,9);

date = 1483437282000l;

DataGenerator.setValueToField(ticket373, "creationDate", new Date(date));

ticketManager.add(ticket373);

Ticket ticket374 = new Ticket("Sometimes it is better to just walk away from things and go back to them later when you’re in a better frame of mind.", "RECORDED", employee224, customer347,1);

date = 1483286851000l;

DataGenerator.setValueToField(ticket374, "creationDate", new Date(date));

ticketManager.add(ticket374);

Ticket ticket375 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "CLOSED", employee206, customer273,9);

date = 1483087876000l;

DataGenerator.setValueToField(ticket375, "creationDate", new Date(date));

ticketManager.add(ticket375);

Ticket ticket376 = new Ticket("We have never been to Asia, nor have we visited Africa.", "RECORDED", employee199, customer438,4);

date = 1483143514000l;

DataGenerator.setValueToField(ticket376, "creationDate", new Date(date));

ticketManager.add(ticket376);

Ticket ticket377 = new Ticket("She folded her handkerchief neatly.", "SOLVED", employee81, customer388,3);

date = 1483156755000l;

DataGenerator.setValueToField(ticket377, "creationDate", new Date(date));

ticketManager.add(ticket377);

Ticket ticket378 = new Ticket("He ran out of money, so he had to stop playing poker.", "WAITING_FOR_FEEDBACK", employee178, customer287,6);

date = 1483174497000l;

DataGenerator.setValueToField(ticket378, "creationDate", new Date(date));

ticketManager.add(ticket378);

Ticket ticket379 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", "WAITING_FOR_FEEDBACK", employee111, customer320,6);

date = 1483531411000l;

DataGenerator.setValueToField(ticket379, "creationDate", new Date(date));

ticketManager.add(ticket379);

Ticket ticket380 = new Ticket("Please wait outside of the house.", "SOLVED", employee68, customer493,3);

date = 1483117814000l;

DataGenerator.setValueToField(ticket380, "creationDate", new Date(date));

ticketManager.add(ticket380);

Ticket ticket381 = new Ticket("The river stole the gods.", "RECORDED", employee132, customer359,6);

date = 1483235900000l;

DataGenerator.setValueToField(ticket381, "creationDate", new Date(date));

ticketManager.add(ticket381);

Ticket ticket382 = new Ticket("Everyone was busy, so I went to the movie alone.", "SOLVED", employee233, customer438,1);

date = 1483445649000l;

DataGenerator.setValueToField(ticket382, "creationDate", new Date(date));

ticketManager.add(ticket382);

Ticket ticket383 = new Ticket("He turned in the research paper on Friday. otherwise, he would have not passed the class.", "RECORDED", employee19, customer483,4);

date = 1483393748000l;

DataGenerator.setValueToField(ticket383, "creationDate", new Date(date));

ticketManager.add(ticket383);

Ticket ticket384 = new Ticket("Mary plays the piano.", "SOLVED", employee36, customer377,1);

date = 1483097932000l;

DataGenerator.setValueToField(ticket384, "creationDate", new Date(date));

ticketManager.add(ticket384);

Ticket ticket385 = new Ticket("Wow, does that work?", "CLOSED", employee59, customer452,4);

date = 1483416450000l;

DataGenerator.setValueToField(ticket385, "creationDate", new Date(date));

ticketManager.add(ticket385);

Ticket ticket386 = new Ticket("We have never been to Asia, nor have we visited Africa.", "RECORDED", employee45, customer448,8);

date = 1483518374000l;

DataGenerator.setValueToField(ticket386, "creationDate", new Date(date));

ticketManager.add(ticket386);

Ticket ticket387 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", "CLOSED", employee185, customer468,8);

date = 1483099075000l;

DataGenerator.setValueToField(ticket387, "creationDate", new Date(date));

ticketManager.add(ticket387);

Ticket ticket388 = new Ticket("We have a lot of rain in June.", "PROCESSED", employee100, customer459,4);

date = 1483376684000l;

DataGenerator.setValueToField(ticket388, "creationDate", new Date(date));

ticketManager.add(ticket388);

Ticket ticket389 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "CLOSED", employee81, customer455,6);

date = 1483598922000l;

DataGenerator.setValueToField(ticket389, "creationDate", new Date(date));

ticketManager.add(ticket389);

Ticket ticket390 = new Ticket("Let me help you with your baggage.", "CLOSED", employee70, customer259,4);

date = 1483050433000l;

DataGenerator.setValueToField(ticket390, "creationDate", new Date(date));

ticketManager.add(ticket390);

Ticket ticket391 = new Ticket("Christmas is coming.", "CLOSED", employee231, customer423,6);

date = 1483266979000l;

DataGenerator.setValueToField(ticket391, "creationDate", new Date(date));

ticketManager.add(ticket391);

Ticket ticket392 = new Ticket("The waves were crashing on the shore. it was a lovely sight.", "CLOSED", employee185, customer272,8);

date = 1483155317000l;

DataGenerator.setValueToField(ticket392, "creationDate", new Date(date));

ticketManager.add(ticket392);

Ticket ticket393 = new Ticket("I am counting my calories, yet I really want dessert.", "RECORDED", employee119, customer325,0);

date = 1483128806000l;

DataGenerator.setValueToField(ticket393, "creationDate", new Date(date));

ticketManager.add(ticket393);

Ticket ticket394 = new Ticket("Mary plays the piano.", "WAITING_FOR_FEEDBACK", employee117, customer479,9);

date = 1483355458000l;

DataGenerator.setValueToField(ticket394, "creationDate", new Date(date));

ticketManager.add(ticket394);

Ticket ticket395 = new Ticket("She always speaks to him in a loud voice.", "RECORDED", employee26, customer394,0);

date = 1483161594000l;

DataGenerator.setValueToField(ticket395, "creationDate", new Date(date));

ticketManager.add(ticket395);

Ticket ticket396 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "SOLVED", employee37, customer428,9);

date = 1483068124000l;

DataGenerator.setValueToField(ticket396, "creationDate", new Date(date));

ticketManager.add(ticket396);

Ticket ticket397 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "RECORDED", employee41, customer312,4);

date = 1483354286000l;

DataGenerator.setValueToField(ticket397, "creationDate", new Date(date));

ticketManager.add(ticket397);

Ticket ticket398 = new Ticket("Someone I know recently combined Maple Syrup & buttered Popcorn thinking it would taste like caramel popcorn. It didn’t and they don’t recommend anyone else do it either.", "RECORDED", employee221, customer447,3);

date = 1483373941000l;

DataGenerator.setValueToField(ticket398, "creationDate", new Date(date));

ticketManager.add(ticket398);

Ticket ticket399 = new Ticket("The waves were crashing on the shore. it was a lovely sight.", "RECORDED", employee103, customer334,2);

date = 1483441080000l;

DataGenerator.setValueToField(ticket399, "creationDate", new Date(date));

ticketManager.add(ticket399);

Ticket ticket400 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "WAITING_FOR_FEEDBACK", employee125, customer292,6);

date = 1483244753000l;

DataGenerator.setValueToField(ticket400, "creationDate", new Date(date));

ticketManager.add(ticket400);

Ticket ticket401 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "CLOSED", employee186, customer436,0);

date = 1483132685000l;

DataGenerator.setValueToField(ticket401, "creationDate", new Date(date));

ticketManager.add(ticket401);

Ticket ticket402 = new Ticket("Abstraction is often one floor above you.", "SOLVED", employee102, customer344,3);

date = 1483596870000l;

DataGenerator.setValueToField(ticket402, "creationDate", new Date(date));

ticketManager.add(ticket402);

Ticket ticket403 = new Ticket("Should we start class now, or should we wait for everyone to get here?", "PROCESSED", employee109, customer383,2);

date = 1483557124000l;

DataGenerator.setValueToField(ticket403, "creationDate", new Date(date));

ticketManager.add(ticket403);

Ticket ticket404 = new Ticket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", "WAITING_FOR_FEEDBACK", employee123, customer485,3);

date = 1483226319000l;

DataGenerator.setValueToField(ticket404, "creationDate", new Date(date));

ticketManager.add(ticket404);

Ticket ticket405 = new Ticket("The shooter says goodbye to his love.", "SOLVED", employee91, customer439,2);

date = 1483472686000l;

DataGenerator.setValueToField(ticket405, "creationDate", new Date(date));

ticketManager.add(ticket405);

Ticket ticket406 = new Ticket("We need to rent a room for our party.", "CLOSED", employee180, customer378,6);

date = 1483391140000l;

DataGenerator.setValueToField(ticket406, "creationDate", new Date(date));

ticketManager.add(ticket406);

Ticket ticket407 = new Ticket("Mary plays the piano.", "CLOSED", employee124, customer308,4);

date = 1483261457000l;

DataGenerator.setValueToField(ticket407, "creationDate", new Date(date));

ticketManager.add(ticket407);

Ticket ticket408 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "CLOSED", employee170, customer252,10);

date = 1483340861000l;

DataGenerator.setValueToField(ticket408, "creationDate", new Date(date));

ticketManager.add(ticket408);

Ticket ticket409 = new Ticket("This is a Japanese doll.", "SOLVED", employee83, customer407,5);

date = 1483060180000l;

DataGenerator.setValueToField(ticket409, "creationDate", new Date(date));

ticketManager.add(ticket409);

Ticket ticket410 = new Ticket("The stranger officiates the meal.", "RECORDED", employee32, customer319,5);

date = 1483254884000l;

DataGenerator.setValueToField(ticket410, "creationDate", new Date(date));

ticketManager.add(ticket410);

Ticket ticket411 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", "CLOSED", employee196, customer289,6);

date = 1483066199000l;

DataGenerator.setValueToField(ticket411, "creationDate", new Date(date));

ticketManager.add(ticket411);

Ticket ticket412 = new Ticket("The book is in front of the table.", "PROCESSED", employee154, customer315,0);

date = 1483258654000l;

DataGenerator.setValueToField(ticket412, "creationDate", new Date(date));

ticketManager.add(ticket412);

Ticket ticket413 = new Ticket("We have never been to Asia, nor have we visited Africa.", "SOLVED", employee82, customer295,2);

date = 1483109718000l;

DataGenerator.setValueToField(ticket413, "creationDate", new Date(date));

ticketManager.add(ticket413);

Ticket ticket414 = new Ticket("The sky is clear. the stars are twinkling.", "RECORDED", employee131, customer377,1);

date = 1483074174000l;

DataGenerator.setValueToField(ticket414, "creationDate", new Date(date));

ticketManager.add(ticket414);

Ticket ticket415 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", "PROCESSED", employee182, customer343,9);

date = 1483480816000l;

DataGenerator.setValueToField(ticket415, "creationDate", new Date(date));

ticketManager.add(ticket415);

Ticket ticket416 = new Ticket("We need to rent a room for our party.", "RECORDED", employee137, customer297,1);

date = 1483574118000l;

DataGenerator.setValueToField(ticket416, "creationDate", new Date(date));

ticketManager.add(ticket416);

Ticket ticket417 = new Ticket("I'd rather be a bird than a fish.", "CLOSED", employee24, customer479,9);

date = 1483318228000l;

DataGenerator.setValueToField(ticket417, "creationDate", new Date(date));

ticketManager.add(ticket417);

Ticket ticket418 = new Ticket("She always speaks to him in a loud voice.", "SOLVED", employee238, customer291,1);

date = 1483481155000l;

DataGenerator.setValueToField(ticket418, "creationDate", new Date(date));

ticketManager.add(ticket418);

Ticket ticket419 = new Ticket("The old apple revels in its authority.", "WAITING_FOR_FEEDBACK", employee242, customer307,1);

date = 1483185362000l;

DataGenerator.setValueToField(ticket419, "creationDate", new Date(date));

ticketManager.add(ticket419);

Ticket ticket420 = new Ticket("The stranger officiates the meal.", "CLOSED", employee90, customer355,2);

date = 1483100526000l;

DataGenerator.setValueToField(ticket420, "creationDate", new Date(date));

ticketManager.add(ticket420);

Ticket ticket421 = new Ticket("The river stole the gods.", "RECORDED", employee215, customer252,0);

date = 1483079816000l;

DataGenerator.setValueToField(ticket421, "creationDate", new Date(date));

ticketManager.add(ticket421);

Ticket ticket422 = new Ticket("The clock within this blog and the clock on my laptop are 1 hour different from each other.", "RECORDED", employee114, customer354,0);

date = 1483365877000l;

DataGenerator.setValueToField(ticket422, "creationDate", new Date(date));

ticketManager.add(ticket422);

Ticket ticket423 = new Ticket("The book is in front of the table.", "CLOSED", employee151, customer496,10);

date = 1483512120000l;

DataGenerator.setValueToField(ticket423, "creationDate", new Date(date));

ticketManager.add(ticket423);

Ticket ticket424 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "WAITING_FOR_FEEDBACK", employee20, customer432,4);

date = 1483550201000l;

DataGenerator.setValueToField(ticket424, "creationDate", new Date(date));

ticketManager.add(ticket424);

Ticket ticket425 = new Ticket("Mary plays the piano.", "RECORDED", employee170, customer256,0);

date = 1483590930000l;

DataGenerator.setValueToField(ticket425, "creationDate", new Date(date));

ticketManager.add(ticket425);

Ticket ticket426 = new Ticket("I hear that Nancy is very pretty.", "WAITING_FOR_FEEDBACK", employee154, customer278,6);

date = 1483099639000l;

DataGenerator.setValueToField(ticket426, "creationDate", new Date(date));

ticketManager.add(ticket426);

Ticket ticket427 = new Ticket("This is the last random sentence I will be writing and I am going to stop mid-sent", "WAITING_FOR_FEEDBACK", employee22, customer437,9);

date = 1483462922000l;

DataGenerator.setValueToField(ticket427, "creationDate", new Date(date));

ticketManager.add(ticket427);

Ticket ticket428 = new Ticket("Is it free?", "SOLVED", employee38, customer384,5);

date = 1483340016000l;

DataGenerator.setValueToField(ticket428, "creationDate", new Date(date));

ticketManager.add(ticket428);

Ticket ticket429 = new Ticket("Abstraction is often one floor above you.", "SOLVED", employee216, customer408,9);

date = 1483431529000l;

DataGenerator.setValueToField(ticket429, "creationDate", new Date(date));

ticketManager.add(ticket429);

Ticket ticket430 = new Ticket("He said he was not there yesterday. however, many people saw him there.", "SOLVED", employee49, customer480,5);

date = 1483068816000l;

DataGenerator.setValueToField(ticket430, "creationDate", new Date(date));

ticketManager.add(ticket430);

Ticket ticket431 = new Ticket("The book is in front of the table.", "CLOSED", employee136, customer274,0);

date = 1483284369000l;

DataGenerator.setValueToField(ticket431, "creationDate", new Date(date));

ticketManager.add(ticket431);

Ticket ticket432 = new Ticket("Sixty-Four comes asking for bread.", "RECORDED", employee40, customer493,2);

date = 1483124276000l;

DataGenerator.setValueToField(ticket432, "creationDate", new Date(date));

ticketManager.add(ticket432);

Ticket ticket433 = new Ticket("We have a lot of rain in June.", "PROCESSED", employee79, customer290,10);

date = 1483355142000l;

DataGenerator.setValueToField(ticket433, "creationDate", new Date(date));

ticketManager.add(ticket433);

Ticket ticket434 = new Ticket("Italy is my favorite country. in fact, I plan to spend two weeks there next year.", "WAITING_FOR_FEEDBACK", employee119, customer401,6);

date = 1483067926000l;

DataGenerator.setValueToField(ticket434, "creationDate", new Date(date));

ticketManager.add(ticket434);

Ticket ticket435 = new Ticket("The lake is a long way from here.", "WAITING_FOR_FEEDBACK", employee30, customer277,3);

date = 1483061227000l;

DataGenerator.setValueToField(ticket435, "creationDate", new Date(date));

ticketManager.add(ticket435);

Ticket ticket436 = new Ticket("What was the person thinking when they discovered cow’s milk was fine for human consumption… and why did they do it in the first place!?", "SOLVED", employee47, customer305,9);

date = 1483361322000l;

DataGenerator.setValueToField(ticket436, "creationDate", new Date(date));

ticketManager.add(ticket436);

Ticket ticket437 = new Ticket("I will never be this young again. Ever. Oh damn… I just got older.", "WAITING_FOR_FEEDBACK", employee125, customer312,2);

date = 1483068469000l;

DataGenerator.setValueToField(ticket437, "creationDate", new Date(date));

ticketManager.add(ticket437);

Ticket ticket438 = new Ticket("Abstraction is often one floor above you.", "SOLVED", employee146, customer389,10);

date = 1483106713000l;

DataGenerator.setValueToField(ticket438, "creationDate", new Date(date));

ticketManager.add(ticket438);

Ticket ticket439 = new Ticket("I love eating toasted cheese and tuna sandwiches.", "WAITING_FOR_FEEDBACK", employee22, customer252,5);

date = 1483157598000l;

DataGenerator.setValueToField(ticket439, "creationDate", new Date(date));

ticketManager.add(ticket439);

Ticket ticket440 = new Ticket("The shooter says goodbye to his love.", "WAITING_FOR_FEEDBACK", employee164, customer288,0);

date = 1483470424000l;

DataGenerator.setValueToField(ticket440, "creationDate", new Date(date));

ticketManager.add(ticket440);

Ticket ticket441 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", "PROCESSED", employee158, customer322,2);

date = 1483376230000l;

DataGenerator.setValueToField(ticket441, "creationDate", new Date(date));

ticketManager.add(ticket441);

Ticket ticket442 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", "SOLVED", employee214, customer326,4);

date = 1483209094000l;

DataGenerator.setValueToField(ticket442, "creationDate", new Date(date));

ticketManager.add(ticket442);

Ticket ticket443 = new Ticket("I am never at home on Sundays.", "CLOSED", employee139, customer347,1);

date = 1483485475000l;

DataGenerator.setValueToField(ticket443, "creationDate", new Date(date));

ticketManager.add(ticket443);

Ticket ticket444 = new Ticket("She works two jobs to make ends meet. at least, that was her reason for not having time to join us.", "PROCESSED", employee120, customer332,6);

date = 1483038136000l;

DataGenerator.setValueToField(ticket444, "creationDate", new Date(date));

ticketManager.add(ticket444);

Ticket ticket445 = new Ticket("Sixty-Four comes asking for bread.", "SOLVED", employee165, customer333,5);

date = 1483110886000l;

DataGenerator.setValueToField(ticket445, "creationDate", new Date(date));

ticketManager.add(ticket445);

Ticket ticket446 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "WAITING_FOR_FEEDBACK", employee72, customer416,5);

date = 1483609572000l;

DataGenerator.setValueToField(ticket446, "creationDate", new Date(date));

ticketManager.add(ticket446);

Ticket ticket447 = new Ticket("She folded her handkerchief neatly.", "PROCESSED", employee91, customer432,1);

date = 1483031648000l;

DataGenerator.setValueToField(ticket447, "creationDate", new Date(date));

ticketManager.add(ticket447);

Ticket ticket448 = new Ticket("Christmas is coming.", "RECORDED", employee137, customer369,8);

date = 1483519611000l;

DataGenerator.setValueToField(ticket448, "creationDate", new Date(date));

ticketManager.add(ticket448);

Ticket ticket449 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", "WAITING_FOR_FEEDBACK", employee34, customer448,9);

date = 1483262992000l;

DataGenerator.setValueToField(ticket449, "creationDate", new Date(date));

ticketManager.add(ticket449);

Ticket ticket450 = new Ticket("The quick brown fox jumps over the lazy dog.", "RECORDED", employee94, customer462,0);

date = 1483408479000l;

DataGenerator.setValueToField(ticket450, "creationDate", new Date(date));

ticketManager.add(ticket450);

Ticket ticket451 = new Ticket("I really want to go to work, but I am too sick to drive.", "WAITING_FOR_FEEDBACK", employee62, customer362,5);

date = 1483265730000l;

DataGenerator.setValueToField(ticket451, "creationDate", new Date(date));

ticketManager.add(ticket451);

Ticket ticket452 = new Ticket("If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds.", "WAITING_FOR_FEEDBACK", employee136, customer371,1);

date = 1483099848000l;

DataGenerator.setValueToField(ticket452, "creationDate", new Date(date));

ticketManager.add(ticket452);

Ticket ticket453 = new Ticket("Last Friday in three week’s time I saw a spotted striped blue worm shake hands with a legless lizard.", "PROCESSED", employee221, customer416,0);

date = 1483456741000l;

DataGenerator.setValueToField(ticket453, "creationDate", new Date(date));

ticketManager.add(ticket453);

Ticket ticket454 = new Ticket("This is a Japanese doll.", "PROCESSED", employee141, customer460,6);

date = 1483155662000l;

DataGenerator.setValueToField(ticket454, "creationDate", new Date(date));

ticketManager.add(ticket454);

Ticket ticket455 = new Ticket("The river stole the gods.", "PROCESSED", employee56, customer336,3);

date = 1483395479000l;

DataGenerator.setValueToField(ticket455, "creationDate", new Date(date));

ticketManager.add(ticket455);

Ticket ticket456 = new Ticket("The old apple revels in its authority.", "RECORDED", employee103, customer432,1);

date = 1483479277000l;

DataGenerator.setValueToField(ticket456, "creationDate", new Date(date));

ticketManager.add(ticket456);

Ticket ticket457 = new Ticket("There were white out conditions in the town. subsequently, the roads were impassable.", "PROCESSED", employee191, customer439,8);

date = 1483098224000l;

DataGenerator.setValueToField(ticket457, "creationDate", new Date(date));

ticketManager.add(ticket457);

Ticket ticket458 = new Ticket("Everyone was busy, so I went to the movie alone.", "CLOSED", employee226, customer310,3);

date = 1483462665000l;

DataGenerator.setValueToField(ticket458, "creationDate", new Date(date));

ticketManager.add(ticket458);

Ticket ticket459 = new Ticket("She borrowed the book from him many years ago and hasn't yet returned it.", "WAITING_FOR_FEEDBACK", employee102, customer430,0);

date = 1483412769000l;

DataGenerator.setValueToField(ticket459, "creationDate", new Date(date));

ticketManager.add(ticket459);

Ticket ticket460 = new Ticket("Hurry!", "SOLVED", employee166, customer279,1);

date = 1483588155000l;

DataGenerator.setValueToField(ticket460, "creationDate", new Date(date));

ticketManager.add(ticket460);

Ticket ticket461 = new Ticket("Sixty-Four comes asking for bread.", "PROCESSED", employee63, customer348,9);

date = 1483488598000l;

DataGenerator.setValueToField(ticket461, "creationDate", new Date(date));

ticketManager.add(ticket461);

Ticket ticket462 = new Ticket("They got there early, and they got really good seats.", "WAITING_FOR_FEEDBACK", employee195, customer298,6);

date = 1483376348000l;

DataGenerator.setValueToField(ticket462, "creationDate", new Date(date));

ticketManager.add(ticket462);

Ticket ticket463 = new Ticket("If Purple People Eaters are real… where do they find purple people to eat?", "PROCESSED", employee147, customer252,10);

date = 1483086893000l;

DataGenerator.setValueToField(ticket463, "creationDate", new Date(date));

ticketManager.add(ticket463);

Ticket ticket464 = new Ticket("Where do random thoughts come from?", "PROCESSED", employee144, customer334,7);

date = 1483074047000l;

DataGenerator.setValueToField(ticket464, "creationDate", new Date(date));

ticketManager.add(ticket464);

Ticket ticket465 = new Ticket("The quick brown fox jumps over the lazy dog.", "WAITING_FOR_FEEDBACK", employee53, customer275,4);

date = 1483386713000l;

DataGenerator.setValueToField(ticket465, "creationDate", new Date(date));

ticketManager.add(ticket465);

Ticket ticket466 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "WAITING_FOR_FEEDBACK", employee125, customer336,8);

date = 1483593433000l;

DataGenerator.setValueToField(ticket466, "creationDate", new Date(date));

ticketManager.add(ticket466);

Ticket ticket467 = new Ticket("Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all.", "CLOSED", employee239, customer307,0);

date = 1483371536000l;

DataGenerator.setValueToField(ticket467, "creationDate", new Date(date));

ticketManager.add(ticket467);

Ticket ticket468 = new Ticket("I want more detailed information.", "CLOSED", employee80, customer414,6);

date = 1483047992000l;

DataGenerator.setValueToField(ticket468, "creationDate", new Date(date));

ticketManager.add(ticket468);

Ticket ticket469 = new Ticket("I love eating toasted cheese and tuna sandwiches.", "WAITING_FOR_FEEDBACK", employee64, customer318,4);

date = 1483336948000l;

DataGenerator.setValueToField(ticket469, "creationDate", new Date(date));

ticketManager.add(ticket469);

Ticket ticket470 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "RECORDED", employee102, customer390,8);

date = 1483054568000l;

DataGenerator.setValueToField(ticket470, "creationDate", new Date(date));

ticketManager.add(ticket470);

Ticket ticket471 = new Ticket("She did not cheat on the test, for it was not the right thing to do.", "SOLVED", employee19, customer352,9);

date = 1483112044000l;

DataGenerator.setValueToField(ticket471, "creationDate", new Date(date));

ticketManager.add(ticket471);

Ticket ticket472 = new Ticket("We have never been to Asia, nor have we visited Africa.", "WAITING_FOR_FEEDBACK", employee129, customer475,1);

date = 1483275829000l;

DataGenerator.setValueToField(ticket472, "creationDate", new Date(date));

ticketManager.add(ticket472);

Ticket ticket473 = new Ticket("Writing a list of random sentences is harder than I initially thought it would be.", "PROCESSED", employee46, customer251,1);

date = 1483150331000l;

DataGenerator.setValueToField(ticket473, "creationDate", new Date(date));

ticketManager.add(ticket473);

Ticket ticket474 = new Ticket("Sixty-Four comes asking for bread.", "SOLVED", employee99, customer455,6);

date = 1483388080000l;

DataGenerator.setValueToField(ticket474, "creationDate", new Date(date));

ticketManager.add(ticket474);

Ticket ticket475 = new Ticket("If the Easter Bunny and the Tooth Fairy had babies would they take your teeth and leave chocolate for you?", "SOLVED", employee31, customer344,5);

date = 1483466788000l;

DataGenerator.setValueToField(ticket475, "creationDate", new Date(date));

ticketManager.add(ticket475);

Ticket ticket476 = new Ticket("How was the math test?", "CLOSED", employee172, customer319,2);

date = 1483163656000l;

DataGenerator.setValueToField(ticket476, "creationDate", new Date(date));

ticketManager.add(ticket476);

Ticket ticket477 = new Ticket("This is a Japanese doll.", "RECORDED", employee93, customer331,7);

date = 1483100175000l;

DataGenerator.setValueToField(ticket477, "creationDate", new Date(date));

ticketManager.add(ticket477);

Ticket ticket478 = new Ticket("I would have gotten the promotion, but my attendance wasn’t good enough.", "WAITING_FOR_FEEDBACK", employee135, customer250,1);

date = 1483155736000l;

DataGenerator.setValueToField(ticket478, "creationDate", new Date(date));

ticketManager.add(ticket478);

Ticket ticket479 = new Ticket("He ran out of money, so he had to stop playing poker.", "SOLVED", employee151, customer432,5);

date = 1483570227000l;

DataGenerator.setValueToField(ticket479, "creationDate", new Date(date));

ticketManager.add(ticket479);

Ticket ticket480 = new Ticket("Wednesday is hump day, but has anyone asked the camel if he’s happy about it?", "CLOSED", employee151, customer280,8);

date = 1483616748000l;

DataGenerator.setValueToField(ticket480, "creationDate", new Date(date));

ticketManager.add(ticket480);

Ticket ticket481 = new Ticket("He said he was not there yesterday. however, many people saw him there.", "PROCESSED", employee210, customer397,10);

date = 1483132104000l;

DataGenerator.setValueToField(ticket481, "creationDate", new Date(date));

ticketManager.add(ticket481);

Ticket ticket482 = new Ticket("The sky is clear. the stars are twinkling.", "CLOSED", employee77, customer461,9);

date = 1483306547000l;

DataGenerator.setValueToField(ticket482, "creationDate", new Date(date));

ticketManager.add(ticket482);

Ticket ticket483 = new Ticket("He didn’t want to go to the dentist, yet he went anyway.", "SOLVED", employee219, customer474,10);

date = 1483251643000l;

DataGenerator.setValueToField(ticket483, "creationDate", new Date(date));

ticketManager.add(ticket483);

Ticket ticket484 = new Ticket("How was the math test?", "CLOSED", employee186, customer354,3);

date = 1483286438000l;

DataGenerator.setValueToField(ticket484, "creationDate", new Date(date));

ticketManager.add(ticket484);

Ticket ticket485 = new Ticket("I checked to make sure that he was still alive.", "SOLVED", employee201, customer455,5);

date = 1483462513000l;

DataGenerator.setValueToField(ticket485, "creationDate", new Date(date));

ticketManager.add(ticket485);

Ticket ticket486 = new Ticket("I think I will buy the red car, or I will lease the blue one.", "CLOSED", employee229, customer307,5);

date = 1483402397000l;

DataGenerator.setValueToField(ticket486, "creationDate", new Date(date));

ticketManager.add(ticket486);

Ticket ticket487 = new Ticket("Sixty-Four comes asking for bread.", "RECORDED", employee12, customer406,10);

date = 1483088503000l;

DataGenerator.setValueToField(ticket487, "creationDate", new Date(date));

ticketManager.add(ticket487);

Ticket ticket488 = new Ticket("Is it free?", "PROCESSED", employee119, customer387,7);

date = 1483512657000l;

DataGenerator.setValueToField(ticket488, "creationDate", new Date(date));

ticketManager.add(ticket488);

Ticket ticket489 = new Ticket("Is it free?", "SOLVED", employee228, customer365,1);

date = 1483101182000l;

DataGenerator.setValueToField(ticket489, "creationDate", new Date(date));

ticketManager.add(ticket489);

Ticket ticket490 = new Ticket("I am never at home on Sundays.", "WAITING_FOR_FEEDBACK", employee167, customer375,2);

date = 1483597310000l;

DataGenerator.setValueToField(ticket490, "creationDate", new Date(date));

ticketManager.add(ticket490);

Ticket ticket491 = new Ticket("Should we start class now, or should we wait for everyone to get here?", "RECORDED", employee187, customer334,5);

date = 1483482069000l;

DataGenerator.setValueToField(ticket491, "creationDate", new Date(date));

ticketManager.add(ticket491);

Ticket ticket492 = new Ticket("I currently have 4 windows open up… and I don’t know why.", "RECORDED", employee196, customer357,8);

date = 1483369863000l;

DataGenerator.setValueToField(ticket492, "creationDate", new Date(date));

ticketManager.add(ticket492);

Ticket ticket493 = new Ticket("I checked to make sure that he was still alive.", "WAITING_FOR_FEEDBACK", employee166, customer290,0);

date = 1483321763000l;

DataGenerator.setValueToField(ticket493, "creationDate", new Date(date));

ticketManager.add(ticket493);

Ticket ticket494 = new Ticket("Everyone was busy, so I went to the movie alone.", "SOLVED", employee9, customer263,0);

date = 1483277763000l;

DataGenerator.setValueToField(ticket494, "creationDate", new Date(date));

ticketManager.add(ticket494);

Ticket ticket495 = new Ticket("Abstraction is often one floor above you.", "PROCESSED", employee27, customer304,2);

date = 1483514103000l;

DataGenerator.setValueToField(ticket495, "creationDate", new Date(date));

ticketManager.add(ticket495);

Ticket ticket496 = new Ticket("She did her best to help him.", "SOLVED", employee239, customer460,0);

date = 1483260567000l;

DataGenerator.setValueToField(ticket496, "creationDate", new Date(date));

ticketManager.add(ticket496);

Ticket ticket497 = new Ticket("She did her best to help him.", "WAITING_FOR_FEEDBACK", employee160, customer362,6);

date = 1483108277000l;

DataGenerator.setValueToField(ticket497, "creationDate", new Date(date));

ticketManager.add(ticket497);

Ticket ticket498 = new Ticket("I want to buy a onesie… but know it won’t suit me.", "RECORDED", employee14, customer258,10);

date = 1483537735000l;

DataGenerator.setValueToField(ticket498, "creationDate", new Date(date));

ticketManager.add(ticket498);

Ticket ticket499 = new Ticket("I am happy to take your donation. any amount will be greatly appreciated.", "CLOSED", employee129, customer256,8);

date = 1483138367000l;

DataGenerator.setValueToField(ticket499, "creationDate", new Date(date));

ticketManager.add(ticket499);

}
}