import React from 'react';
import './NavBar.css';

const NavBar = () => {
  return (
    <nav className="navbar">
      {/* Logo */}
      <img src="chemin-vers-votre-logo.png" alt="Logo" className="logo" />

      {/* Liens de navigation */}
      <ul className="nav-links">
        <li><a href="">Accueil</a></li>
        <li><a href="/about">À propos</a></li>
        <li><a href="/contact">Contact</a></li>
        <li><a href="/favorites">Voitures favorites</a></li>
      </ul>

      <div className="search-bar">
        <label>Recherche</label>
        <select>
          <option>logo1</option>
          <option>logo2</option>
          <option>logo3</option>
        </select>
        <select>
          <option>logo1</option>
          <option>logo2</option>
          <option>logo3</option>
        </select>
        <button className="button">Rechercher</button>
      </div>

      <button>Se connecter</button>
    </nav>
  );
};

export default NavBar;
