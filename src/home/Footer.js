import React from 'react';
import { FaEnvelope, FaInstagram, FaGooglePlay } from 'react-icons/fa';
import './Footer.css';
const Footer = () => {
  return (
    <footer>
      <p>Ceci est le pied de page avec un petit texte.</p>

      {/* Icônes sociales */}
      <div className="social-icons">
        <a href="mailto:example@example.com"><FaEnvelope /></a>
        <a href="https://www.instagram.com/"><FaInstagram /></a>
      </div>

      {/* Bouton Play Store */}
      <a href="#" className="playstore-button">
        <FaGooglePlay />
        Télécharger sur le Play Store
      </a>
    </footer>
  );
};

export default Footer;
