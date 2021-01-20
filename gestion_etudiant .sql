-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le : jeu. 07 jan. 2021 à 20:32
-- Version du serveur :  8.0.22-0ubuntu0.20.04.3
-- Version de PHP : 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_etudiant`
--

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `id` int NOT NULL,
  `carte` varchar(20) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `classe` varchar(20) NOT NULL,
  `filiere` varchar(20) NOT NULL
) ENGINE=InnoDB ;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `carte`, `nom`, `prenom`, `classe`, `filiere`) VALUES
(1, '20150757N', 'KA', 'ALIOU', 'L1', 'MPCI'),
(2, '20160757P', 'DIALLO', 'AWA', 'L2', 'MPI'),
(3, '1478564H', 'AIDARA', 'CHEIKH', 'L3', 'PCSM');

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `id` int NOT NULL,
  `nom` varchar(20) NOT NULL
) ENGINE=InnoDB ;

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`id`, `nom`) VALUES
(1, 'PCSM');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `filiere`
--
ALTER TABLE `filiere`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
