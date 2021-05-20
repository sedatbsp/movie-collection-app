-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: moviecollectiondb
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actor`
--

DROP TABLE IF EXISTS `actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `actor` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actor`
--

LOCK TABLES `actor` WRITE;
/*!40000 ALTER TABLE `actor` DISABLE KEYS */;
INSERT INTO `actor` VALUES (1,'Marlon Brando',NULL),(2,'Al Pacino',NULL),(3,'James Caan',NULL),(4,'Robert Duvall',NULL),(5,'Richard S. Castellano',NULL),(6,'Diane Keaton',NULL),(7,'Abe Vigoda',NULL),(8,'Sterling Hayden',NULL),(9,'Talia Shire',NULL),(10,'John Cazale',NULL),(11,'Christian Bale',NULL),(12,'Michael Caine',NULL),(13,'Heath Ledger',NULL),(14,'Gary Oldman',NULL),(15,'Eric Roberts',NULL),(16,'Aaron Eckhart',NULL),(17,'Morgan Freeman',NULL),(18,'Maggie Gyllenhaal',NULL),(19,'Ron Dean',NULL),(20,'Anthony Michael Hall',NULL),(21,'Keanu Reeves',NULL),(22,'Laurence Fishburne',NULL),(23,'Carrie-Anne Moss',NULL),(24,'Hugo Weaving',NULL),(25,'Joe Pantoliano',NULL),(26,'Joaquin Phoenix',NULL),(27,' Robert De Niro',NULL),(28,' Zazie Beetz',NULL),(29,' Brett Cullen',NULL),(30,'Michael J. Fox',NULL),(31,'Christopher Lloyd',NULL),(32,'Lea Thompson',NULL),(33,'Crispin Glover',NULL),(34,'Thomas F. Wilson',NULL);
/*!40000 ALTER TABLE `actor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(1000) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `language_option` varchar(255) DEFAULT NULL,
  `media` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `name_of_actors` varchar(255) DEFAULT NULL,
  `release_year` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'Mario Puzo\'nun yazdığı aynı adlı romandan uyarlanan, Francis Ford Coppola\'nın yönettiği, Marlon Brando ve Al Pacino\'nun başrollerini paylaştığı filmdir. Filmde ayrıca yardımcı rollerde James Caan, Robert Duvall, Diane Keaton, John Cazale vardır.[1] Filmin hikâyesi, II. Dünya Savaşı\'nın bittiği yıl olan 1945\'te başlar ve 10 yıllık bir dönemi kapsar.','Polisiye','İngilizce','https://www.filmarasidergisi.com/wp-content/uploads/2020/12/hero-image-the-godfather-gettyimages.jpg','The Godfather','Marlon Brando,Al Pacino,James Caan,Robert Duvall,Richard S. Castellano,Diane Keaton,Abe Vigoda,Sterling Hayden,Talia Shire,John Cazale',1972),(2,'Christopher Nolan\'ın yönettiği bir süper kahraman filmidir. DC Comics\'in kurgusal karakteri Batman\'den uyarlanan 2005 tarihli Batman Başlıyor (Batman Begins) filminin devamıdır. Kara Şövalye\'nin senaryosunu Christopher ve kardeşi Jonathan Nolan yazmıştır. Hikâyeyi ise David S. Goyer oluşturmuştur. Filmin olay örgüsü, Bruce Wayne/Batman (Christian Bale), bölge savcısı Harvey Dent (Aaron Eckhart), asistan Rachel Dawes (Maggie Gyllenhaal) ve Polis Komiseri James Gordon\'ın (Gary Oldman), onların suçla mücadelelerinin ve yeni tehdit Joker\'in (Heath Ledger) etrafında gelişir. Joker gerçek kimliği, filmin gizemi için saklı tutulur ve Harvey Dent\'in kahraman bir bölge savcısından çirkin bir katile dönüşümünün hikâyesi tamamıyla anlatılır. Yönetmen Nolan, Joker karakteri için ilhamı, onun 1940\'lar ilk kez göründüğü çizgi romanlardan ve Harvey Dent\'in geçmişinin tekrar anlatıldığı 1996 tarihli Batman: The Long Halloween adlı çizgi romandan esinlendi.','Aksiyon','İngilizce','https://wallpapercave.com/wp/wp383267.jpg','The Dark Knight','Christian Bale,Michael Caine,Heath Ledger,Gary Oldman,Eric Roberts,Aaron Eckhart,Morgan Freeman,Maggie Gyllenhaal,Ron Dean,Anthony Michael Hall',2008),(3,'Wachowski Kardeşlerin yazıp yönettiği bilimkurgu-aksiyon filmi. 1999 yılında gösterime girdi. Filmde Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss ve Hugo Weaving gibi yıldızlar yer almaktadır.\r\nSaygın bir yazılım şirketinde çalışan Thomas Anderson (Keanu Reeves), gecelerini \"Neo\" adı altında program kırarak ve Matrix\'i araştırarak geçirir. Esrarengiz şekilde Trinity ve Morpheus ile tanışan Neo, yaşadığı dünyanın aslında beyninde gerçekleşen bir simülasyondan ibaret olduğunu öğrenir ve kendini bu durumdan kurtarmak için Morpheus\'un önderliğindeki ekibe katılır. Neo gerçek dünyada ilk nefesini aldıktan sonra simülasyona tekrar girerek Matrix\'in ne olduğunu kavrayacak ve kurtarılma nedenini öğrenerek gelişen olaylar çerçevesinde yeni kimliğini tanımaya çalışacaktır.','Aksiyon','İngilizce','https://i.insider.com/5d0bf7369c51012b520ba944?width=1200&format=jpeg','The Matrix','Keanu Reeves,Laurence Fishburne,Carrie-Anne Moss,Hugo Weaving,Joe Pantoliano',1999),(4,'Joker, başarısız bir komedyen olan Arthur Fleck\'in hayatına odaklanıyor. Toplum tarafından dışlanan bir adam olan Arthur, hayatta yapayalnızdır. Sürekli bir bağ kurma arayışında olan Arthur, yaşamını taktığı iki maske ile geçirir. Gündüzleri, geçimini sağlamak için palyaço maskesini yüzüne takan Arthur, geceleri ise asla üzerinden silip atamayacağı bir maske takar. Babasız büyüyen Arthur’u en yakın arkadaşı olan annesi Happy adıyla çağırır. Bu lakap, Arthur’un içindeki acıyı gizlemesine yardımcı olur. Ancak maruz kaldığı zorbalıklar, onun gitgide toluma aykırı bir adam haline gelmesine neden olur. Yavaş yavaş psikolojik olarak tekinsiz sulara yelken açılan Arthur, bir süre sonra kendisini Gotham Şehri’nde suç ve kaosun içinde bulur. Arthur, zamanla kendi kimliğinden uzaklaşıp Joker karakterine bürünür.','Drama','İngilizce','https://kulturlen.com/wp-content/uploads/2019/11/joker-filmi.jpg','Joker','Joaquin Phoenix, Robert De Niro, Zazie Beetz, Brett Cullen ',2019),(5,'Robert Zemeckis\'in yönetmenlik, Bob Gale\'ın yardımcı senaristlik, Steven Spielberg\'in yürütücü yapımcılık yaptığı, 1985 yapımı bilimkurgu, macera ve komedi türündeki filmdir. Başrollerinde Michael J. Fox\'un Marty McFly, Christopher Lloyd\'un Emmett Brown olarak yer aldığı filmde, Crispin Glover, Lea Thompson ve Thomas F. Wilson da yan rollerdedir. Geleceğe Dönüş\'te, bir delikanlının kazara 1985 yılından 1955 yılına gitmesi konu edilir. Lisede okuyan anne ve babası ile tanışan genç, yanlışlıkla annesinin romantik ilgisini çeker. Anne ve babasının aşık olmasını engellediği için hatasını telafi edip, 1985 yılına geri dönmek zorundadır.','Bilim Kurgu','İngilizce','https://www.sosyalelestiri.com/wp-content/uploads/2021/02/3508.jpg','Back to the Future','Michael J. Fox,Christopher Lloyd,Lea Thompson,Crispin Glover,Thomas F. Wilson',1985);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_actors`
--

DROP TABLE IF EXISTS `movie_actors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_actors` (
  `movie_id` bigint NOT NULL,
  `actors_id` bigint NOT NULL,
  UNIQUE KEY `UK_lsnj4a0uk67id8b598dyrshi9` (`actors_id`),
  KEY `FKbsto8yef4btokhveihmkg8876` (`movie_id`),
  CONSTRAINT `FKbsto8yef4btokhveihmkg8876` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `FKoxmxj61v0a9qs12vboo8rxpno` FOREIGN KEY (`actors_id`) REFERENCES `actor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_actors`
--

LOCK TABLES `movie_actors` WRITE;
/*!40000 ALTER TABLE `movie_actors` DISABLE KEYS */;
INSERT INTO `movie_actors` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(2,11),(2,12),(2,13),(2,14),(2,15),(2,16),(2,17),(2,18),(2,19),(2,20),(3,21),(3,22),(3,23),(3,24),(3,25),(4,26),(4,27),(4,28),(4,29),(5,30),(5,31),(5,32),(5,33),(5,34);
/*!40000 ALTER TABLE `movie_actors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ADMIN'),(2,'ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin@gmail.com','Admin','Admin','$2a$10$ERQaezBBZrQ0oXFCLFMIbekoNB64PtSwkuIcR6rWG2INIReQ1JTjq'),(2,'user@gmail.com','User','User','$2a$10$J7Iug2/AkD49REIPdG2e7u99t5nJzQ2kvtUkuDKhcQHb559MVSLli');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_roles` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`),
  CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (1,1),(2,2);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-20 13:30:32
