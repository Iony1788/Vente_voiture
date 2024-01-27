import React from 'react';
import './Details.css'; // Assurez-vous de créer un fichier CSS séparé

const Details = () => {
  return (
    <div className="product-card">
      <div className="left-section">
        <img src="chemin/vers/votre/image.jpg" alt="Nom du produit" />
      </div>
      <div className="right-section">
        <h2>Nom du Produit</h2>
        <p>Description du produit</p>
        <p>Prix: $XX.XX</p>
        <button>Contactez-nous</button>
      </div>
    </div>
  );
};

export default Details;
